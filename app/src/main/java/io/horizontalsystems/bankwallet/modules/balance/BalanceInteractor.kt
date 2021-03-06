package io.horizontalsystems.bankwallet.modules.balance

import io.horizontalsystems.bankwallet.core.*
import io.horizontalsystems.bankwallet.core.managers.ConnectivityManager
import io.horizontalsystems.bankwallet.core.providers.FeeCoinProvider
import io.horizontalsystems.bankwallet.entities.Account
import io.horizontalsystems.bankwallet.entities.Wallet
import io.horizontalsystems.coinkit2.models.Coin
import io.horizontalsystems.coinkit2.models.CoinType
import io.horizontalsystems.core.ICurrencyManager
import io.horizontalsystems.core.entities.Currency
import io.horizontalsystems.xrateskit2.entities.ChartInfo
import io.horizontalsystems.xrateskit2.entities.ChartType
import io.horizontalsystems.xrateskit2.entities.LatestRate
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import java.math.BigDecimal

class BalanceInteractor(
        private val walletManager: IWalletManager,
        private val adapterManager: IAdapterManager,
        private val currencyManager: ICurrencyManager,
        private val localStorage: ILocalStorage,
        private val rateManager: IRateManager,
        private val accountManager: IAccountManager,
        private val rateAppManager: IRateAppManager,
        private val connectivityManager: ConnectivityManager,
        appConfigProvider: IAppConfigProvider,
        private val feeCoinProvider: FeeCoinProvider)
    : BalanceModule.IInteractor {

    var delegate: BalanceModule.IInteractorDelegate? = null

    private var disposables = CompositeDisposable()
    private var adapterDisposables = CompositeDisposable()
    private var marketInfoDisposables = CompositeDisposable()
    override val reportEmail = appConfigProvider.reportEmail

    override val activeAccount: Account?
        get() = accountManager.activeAccount

    override val wallets: List<Wallet>
        get() = walletManager.activeWallets

    override val baseCurrency: Currency
        get() = currencyManager.baseCurrency

    override val sortType: BalanceSortType
        get() = localStorage.sortType

    override var balanceHidden: Boolean
        get() = localStorage.balanceHidden
        set(value) {
            localStorage.balanceHidden = value
        }

    override val networkAvailable: Boolean
        get() = connectivityManager.isConnected

    init {
        accountManager.activeAccountObservable
                .subscribeIO {
                    delegate?.didUpdateActiveAccount(it.orElseGet(null))
                }
                .let {
                    disposables.add(it)
                }

        accountManager.accountsFlowable
                .subscribeIO {
                    delegate?.didUpdateActiveAccount(accountManager.activeAccount)
                }
                .let {
                    disposables.add(it)
                }
    }

    override fun latestRate(coinType: CoinType, currencyCode: String): LatestRate? {
        return rateManager.latestRate(coinType, currencyCode)
    }

    override fun chartInfo(coinType: CoinType, currencyCode: String): ChartInfo? {
        return rateManager.chartInfo(coinType, currencyCode, ChartType.DAILY)
    }

    override fun balance(wallet: Wallet): BigDecimal? {
        return adapterManager.getBalanceAdapterForWallet(wallet)?.balance
    }

    override fun balanceLocked(wallet: Wallet): BigDecimal? {
        return adapterManager.getBalanceAdapterForWallet(wallet)?.balanceLocked
    }

    override fun state(wallet: Wallet): AdapterState? {
        return adapterManager.getBalanceAdapterForWallet(wallet)?.balanceState
    }

    override fun subscribeToWallets() {
        walletManager.activeWalletsUpdatedObservable
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe { wallets ->
                    onUpdateWallets(wallets)
                }.let {
                    disposables.add(it)
                }

        adapterManager.adaptersReadyObservable
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe {
                    onAdaptersReady()
                }.let {
                    disposables.add(it)
                }
    }

    override fun subscribeToBaseCurrency() {
        currencyManager.baseCurrencyUpdatedSignal
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe { onUpdateCurrency() }
                .let { disposables.add(it) }
    }

    override fun subscribeToAdapters(wallets: List<Wallet>) {
        adapterDisposables.clear()

        for (wallet in wallets) {
            val adapter = adapterManager.getBalanceAdapterForWallet(wallet) ?: continue

            adapter.balanceUpdatedFlowable
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.io())
                    .subscribe {
                        delegate?.didUpdateBalance(wallet, adapter.balance, adapter.balanceLocked)
                    }.let {
                        adapterDisposables.add(it)
                    }

            adapter.balanceStateUpdatedFlowable
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.io())
                    .subscribe {
                        delegate?.didUpdateState(wallet, adapter.balanceState)
                    }.let {
                        adapterDisposables.add(it)
                    }
        }
    }

    override fun subscribeToMarketInfo(coins: List<Coin>, currencyCode: String) {
        marketInfoDisposables.clear()

        val feeCoins = coins.mapNotNull {
            feeCoinProvider.feeCoinData(it)?.first
        }

        rateManager.latestRateObservable((coins + feeCoins).distinct().map { it.type }, currencyCode)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe {
                    delegate?.didUpdateLatestRate(it)
                }.let {
                    marketInfoDisposables.add(it)
                }
    }

    override fun refresh(currencyCode: String) {
        adapterManager.refresh()
        rateManager.refresh(currencyCode)

        delegate?.didRefresh()
    }

    override fun saveSortType(sortType: BalanceSortType) {
        localStorage.sortType = sortType
    }

    override fun clear() {
        disposables.clear()
        adapterDisposables.clear()
        marketInfoDisposables.clear()
    }

    override fun notifyPageActive() {
        rateAppManager.onBalancePageActive()
    }

    override fun notifyPageInactive() {
        rateAppManager.onBalancePageInactive()
    }

    override fun refreshByWallet(wallet: Wallet) {
        adapterManager.refreshByWallet(wallet)
    }

    private fun onUpdateCurrency() {
        delegate?.didUpdateCurrency(currencyManager.baseCurrency)
    }

    private fun onUpdateWallets(wallets: List<Wallet>) {
        delegate?.didUpdateWallets(wallets)
    }

    private fun onAdaptersReady() {
        delegate?.didPrepareAdapters()
    }

}
