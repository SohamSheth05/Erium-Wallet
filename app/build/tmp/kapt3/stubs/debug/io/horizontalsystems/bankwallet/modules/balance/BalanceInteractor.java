package io.horizontalsystems.bankwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u0012\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020<H\u0016J\u0012\u0010B\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020<H\u0016J\u001a\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u000203H\u0016J\b\u0010H\u001a\u00020IH\u0016J\u001a\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u000203H\u0016J\b\u0010L\u001a\u00020IH\u0016J\b\u0010M\u001a\u00020IH\u0016J\b\u0010N\u001a\u00020IH\u0002J\b\u0010O\u001a\u00020IH\u0002J\u0016\u0010P\u001a\u00020I2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0002J\u0010\u0010Q\u001a\u00020I2\u0006\u0010G\u001a\u000203H\u0016J\u0010\u0010R\u001a\u00020I2\u0006\u0010A\u001a\u00020<H\u0016J\u0010\u0010S\u001a\u00020I2\u0006\u00106\u001a\u000207H\u0016J\u0012\u0010T\u001a\u0004\u0018\u00010U2\u0006\u0010A\u001a\u00020<H\u0016J\u0016\u0010V\u001a\u00020I2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0016J\b\u0010W\u001a\u00020IH\u0016J\u001e\u0010X\u001a\u00020I2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0;2\u0006\u0010G\u001a\u000203H\u0016J\b\u0010[\u001a\u00020IH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00100\u001a\u00020\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b1\u0010!R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00102\u001a\u000203X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u0002078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b8\u00109R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b=\u0010>\u00a8\u0006\\"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceInteractor;", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IInteractor;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "adapterManager", "Lio/horizontalsystems/bankwallet/core/IAdapterManager;", "currencyManager", "Lio/horizontalsystems/core/ICurrencyManager;", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "rateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "rateAppManager", "Lio/horizontalsystems/bankwallet/core/IRateAppManager;", "connectivityManager", "Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager;", "appConfigProvider", "Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;", "feeCoinProvider", "Lio/horizontalsystems/bankwallet/core/providers/FeeCoinProvider;", "(Lio/horizontalsystems/bankwallet/core/IWalletManager;Lio/horizontalsystems/bankwallet/core/IAdapterManager;Lio/horizontalsystems/core/ICurrencyManager;Lio/horizontalsystems/bankwallet/core/ILocalStorage;Lio/horizontalsystems/bankwallet/core/IRateManager;Lio/horizontalsystems/bankwallet/core/IAccountManager;Lio/horizontalsystems/bankwallet/core/IRateAppManager;Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager;Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;Lio/horizontalsystems/bankwallet/core/providers/FeeCoinProvider;)V", "activeAccount", "Lio/horizontalsystems/bankwallet/entities/Account;", "getActiveAccount", "()Lio/horizontalsystems/bankwallet/entities/Account;", "adapterDisposables", "Lio/reactivex/disposables/CompositeDisposable;", "value", "", "balanceHidden", "getBalanceHidden", "()Z", "setBalanceHidden", "(Z)V", "baseCurrency", "Lio/horizontalsystems/core/entities/Currency;", "getBaseCurrency", "()Lio/horizontalsystems/core/entities/Currency;", "delegate", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IInteractorDelegate;)V", "disposables", "marketInfoDisposables", "networkAvailable", "getNetworkAvailable", "reportEmail", "", "getReportEmail", "()Ljava/lang/String;", "sortType", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceSortType;", "getSortType", "()Lio/horizontalsystems/bankwallet/modules/balance/BalanceSortType;", "wallets", "", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "getWallets", "()Ljava/util/List;", "balance", "Ljava/math/BigDecimal;", "wallet", "balanceLocked", "chartInfo", "Lio/horizontalsystems/xrateskit2/entities/ChartInfo;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "currencyCode", "clear", "", "latestRate", "Lio/horizontalsystems/xrateskit2/entities/LatestRate;", "notifyPageActive", "notifyPageInactive", "onAdaptersReady", "onUpdateCurrency", "onUpdateWallets", "refresh", "refreshByWallet", "saveSortType", "state", "Lio/horizontalsystems/bankwallet/core/AdapterState;", "subscribeToAdapters", "subscribeToBaseCurrency", "subscribeToMarketInfo", "coins", "Lio/horizontalsystems/coinkit2/models/Coin;", "subscribeToWallets", "app_debug"})
public final class BalanceInteractor implements io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IInteractorDelegate delegate;
    private io.reactivex.disposables.CompositeDisposable disposables;
    private io.reactivex.disposables.CompositeDisposable adapterDisposables;
    private io.reactivex.disposables.CompositeDisposable marketInfoDisposables;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String reportEmail = null;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager = null;
    private final io.horizontalsystems.core.ICurrencyManager currencyManager = null;
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorage = null;
    private final io.horizontalsystems.bankwallet.core.IRateManager rateManager = null;
    private final io.horizontalsystems.bankwallet.core.IAccountManager accountManager = null;
    private final io.horizontalsystems.bankwallet.core.IRateAppManager rateAppManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.ConnectivityManager connectivityManager = null;
    private final io.horizontalsystems.bankwallet.core.providers.FeeCoinProvider feeCoinProvider = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IInteractorDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getReportEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.Account getActiveAccount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> getWallets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.core.entities.Currency getBaseCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.balance.BalanceSortType getSortType() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getBalanceHidden() {
        return false;
    }
    
    @java.lang.Override()
    public void setBalanceHidden(boolean value) {
    }
    
    @java.lang.Override()
    public boolean getNetworkAvailable() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.xrateskit2.entities.LatestRate latestRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.xrateskit2.entities.ChartInfo chartInfo(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.math.BigDecimal balance(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.math.BigDecimal balanceLocked(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.core.AdapterState state(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
        return null;
    }
    
    @java.lang.Override()
    public void subscribeToWallets() {
    }
    
    @java.lang.Override()
    public void subscribeToBaseCurrency() {
    }
    
    @java.lang.Override()
    public void subscribeToAdapters(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
    }
    
    @java.lang.Override()
    public void subscribeToMarketInfo(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.coinkit2.models.Coin> coins, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
    }
    
    @java.lang.Override()
    public void refresh(@org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
    }
    
    @java.lang.Override()
    public void saveSortType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceSortType sortType) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    @java.lang.Override()
    public void notifyPageActive() {
    }
    
    @java.lang.Override()
    public void notifyPageInactive() {
    }
    
    @java.lang.Override()
    public void refreshByWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
    }
    
    private final void onUpdateCurrency() {
    }
    
    private final void onUpdateWallets(java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
    }
    
    private final void onAdaptersReady() {
    }
    
    public BalanceInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager rateManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateAppManager rateAppManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.ConnectivityManager connectivityManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.providers.FeeCoinProvider feeCoinProvider) {
        super();
    }
}