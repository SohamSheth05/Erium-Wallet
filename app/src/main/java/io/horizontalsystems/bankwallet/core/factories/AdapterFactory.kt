package io.horizontalsystems.bankwallet.core.factories

import android.content.Context
import io.horizontalsystems.bankwallet.core.IAdapter
import io.horizontalsystems.bankwallet.core.IEthereumRpcModeSettingsManager
import io.horizontalsystems.bankwallet.core.IInitialSyncModeSettingsManager
import io.horizontalsystems.bankwallet.core.adapters.*
import io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashAdapter
import io.horizontalsystems.bankwallet.core.managers.BinanceKitManager
import io.horizontalsystems.bankwallet.core.managers.BinanceSmartChainKitManager
import io.horizontalsystems.bankwallet.core.managers.EthereumKitManager
import io.horizontalsystems.bankwallet.core.managers.RestoreSettingsManager
import io.horizontalsystems.bankwallet.entities.Wallet
import io.horizontalsystems.coinkit2.models.CoinType
import io.horizontalsystems.core.BackgroundManager

class AdapterFactory(
        private val context: Context,
        private val testMode: Boolean,
        private val ethereumKitManager: EthereumKitManager,
        private val binanceSmartChainKitManager: BinanceSmartChainKitManager,
        private val binanceKitManager: BinanceKitManager,
        private val backgroundManager: BackgroundManager,
        private val restoreSettingsManager: RestoreSettingsManager) {

    var initialSyncModeSettingsManager: IInitialSyncModeSettingsManager? = null
    var ethereumRpcModeSettingsManager: IEthereumRpcModeSettingsManager? = null

    fun adapter(wallet: Wallet): IAdapter? {
        val syncMode = initialSyncModeSettingsManager?.setting(wallet.coin.type, wallet.account.origin)?.syncMode

        return when (val coinType = wallet.coin.type) {
            is CoinType.Zcash -> ZcashAdapter(context, wallet, restoreSettingsManager.settings(wallet.account, wallet.coin), testMode)
            is CoinType.Bitcoin -> BitcoinAdapter(wallet, syncMode, testMode, backgroundManager)
            is CoinType.Litecoin -> LitecoinAdapter(wallet, syncMode, testMode, backgroundManager)
            is CoinType.BitcoinCash -> BitcoinCashAdapter(wallet, syncMode, testMode, backgroundManager)
            is CoinType.Dash -> DashAdapter(wallet, syncMode, testMode, backgroundManager)
            is CoinType.Bep2 -> BinanceAdapter(binanceKitManager.binanceKit(wallet), coinType.symbol)
            is CoinType.Ethereum -> EvmAdapter(ethereumKitManager.evmKit(wallet.account))
            is CoinType.Dgc -> Eip20Adapter(context, binanceSmartChainKitManager.evmKit(wallet.account), wallet.coin.decimal, coinType.address1)
            is CoinType.Dsc -> Eip20Adapter(context, binanceSmartChainKitManager.evmKit(wallet.account), wallet.coin.decimal, coinType.address2)
            is CoinType.Dpc -> Eip20Adapter(context, binanceSmartChainKitManager.evmKit(wallet.account), wallet.coin.decimal, coinType.address3)
            is CoinType.Erc20 -> Eip20Adapter(context, ethereumKitManager.evmKit(wallet.account), wallet.coin.decimal, coinType.address)
            is CoinType.BinanceSmartChain -> EvmAdapter(binanceSmartChainKitManager.evmKit(wallet.account))
            is CoinType.Bep20 -> Eip20Adapter(context, binanceSmartChainKitManager.evmKit(wallet.account), wallet.coin.decimal, coinType.address)
            is CoinType.Unsupported -> null
        }
    }

    fun unlinkAdapter(wallet: Wallet) {
        when (wallet.coin.type) {
            CoinType.Ethereum, is CoinType.Erc20 -> {
                ethereumKitManager.unlink(wallet.account)
            }
            CoinType.BinanceSmartChain, is CoinType.Bep20 -> {
                binanceSmartChainKitManager.unlink(wallet.account)
            }
            is CoinType.Bep2 -> {
                binanceKitManager.unlink()
            }
        }
    }
}
