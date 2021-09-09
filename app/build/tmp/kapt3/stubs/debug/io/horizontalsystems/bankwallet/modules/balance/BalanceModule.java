package io.horizontalsystems.bankwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule;", "", "()V", "BalanceItem", "Factory", "IBalanceSorter", "IInteractor", "IInteractorDelegate", "IRouter", "IView", "IViewDelegate", "app_debug"})
public final class BalanceModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.balance.BalanceModule INSTANCE = null;
    
    private BalanceModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H&\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IView;", "", "didRefresh", "", "hideBalance", "set", "headerViewItem", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceHeaderViewItem;", "viewItems", "", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceViewItem;", "setTitle", "v", "", "showBackupRequired", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "showNetworkNotAvailable", "showSyncErrorDialog", "errorMessage", "sourceChangeable", "", "app_debug"})
    public static abstract interface IView {
        
        public abstract void setTitle(@org.jetbrains.annotations.Nullable()
        java.lang.String v);
        
        public abstract void set(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem> viewItems);
        
        public abstract void set(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.balance.BalanceHeaderViewItem headerViewItem);
        
        public abstract void showBackupRequired(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet);
        
        public abstract void didRefresh();
        
        public abstract void hideBalance();
        
        public abstract void showSyncErrorDialog(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage, boolean sourceChangeable);
        
        public abstract void showNetworkNotAvailable();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IViewDelegate;", "", "onAddCoinClick", "", "onBalanceClick", "onChart", "viewItem", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceViewItem;", "onClear", "onItem", "onLoad", "onPause", "onPay", "onReceive", "onRefresh", "onReportClick", "errorMessage", "", "onResume", "onSortClick", "onSortTypeChange", "sortType", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceSortType;", "onSwap", "onSyncErrorClick", "refreshByWallet", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "app_debug"})
    public static abstract interface IViewDelegate {
        
        public abstract void onLoad();
        
        public abstract void onRefresh();
        
        public abstract void onReceive(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem);
        
        public abstract void onPay(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem);
        
        public abstract void onSwap(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem);
        
        public abstract void onChart(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem);
        
        public abstract void onItem(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem);
        
        public abstract void onAddCoinClick();
        
        public abstract void onSortTypeChange(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.balance.BalanceSortType sortType);
        
        public abstract void onSortClick();
        
        public abstract void onClear();
        
        public abstract void onResume();
        
        public abstract void onPause();
        
        public abstract void onBalanceClick();
        
        public abstract void onSyncErrorClick(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem);
        
        public abstract void onReportClick(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage);
        
        public abstract void refreshByWallet(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u001cH&J\u0012\u0010\"\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u001cH&J\u001a\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0013H&J\b\u0010(\u001a\u00020)H&J\u001a\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0013H&J\b\u0010,\u001a\u00020)H&J\b\u0010-\u001a\u00020)H&J\u0010\u0010.\u001a\u00020)2\u0006\u0010\'\u001a\u00020\u0013H&J\u0010\u0010/\u001a\u00020)2\u0006\u0010!\u001a\u00020\u001cH&J\u0010\u00100\u001a\u00020)2\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0012\u00101\u001a\u0004\u0018\u0001022\u0006\u0010!\u001a\u00020\u001cH&J\u0016\u00103\u001a\u00020)2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH&J\b\u00104\u001a\u00020)H&J\u001e\u00105\u001a\u00020)2\f\u00106\u001a\b\u0012\u0004\u0012\u0002070\u001b2\u0006\u0010\'\u001a\u00020\u0013H&J\b\u00108\u001a\u00020)H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0012\u0010\u0012\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u00a8\u00069"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IInteractor;", "", "activeAccount", "Lio/horizontalsystems/bankwallet/entities/Account;", "getActiveAccount", "()Lio/horizontalsystems/bankwallet/entities/Account;", "balanceHidden", "", "getBalanceHidden", "()Z", "setBalanceHidden", "(Z)V", "baseCurrency", "Lio/horizontalsystems/core/entities/Currency;", "getBaseCurrency", "()Lio/horizontalsystems/core/entities/Currency;", "networkAvailable", "getNetworkAvailable", "reportEmail", "", "getReportEmail", "()Ljava/lang/String;", "sortType", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceSortType;", "getSortType", "()Lio/horizontalsystems/bankwallet/modules/balance/BalanceSortType;", "wallets", "", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "getWallets", "()Ljava/util/List;", "balance", "Ljava/math/BigDecimal;", "wallet", "balanceLocked", "chartInfo", "Lio/horizontalsystems/xrateskit2/entities/ChartInfo;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "currencyCode", "clear", "", "latestRate", "Lio/horizontalsystems/xrateskit2/entities/LatestRate;", "notifyPageActive", "notifyPageInactive", "refresh", "refreshByWallet", "saveSortType", "state", "Lio/horizontalsystems/bankwallet/core/AdapterState;", "subscribeToAdapters", "subscribeToBaseCurrency", "subscribeToMarketInfo", "coins", "Lio/horizontalsystems/coinkit2/models/Coin;", "subscribeToWallets", "app_debug"})
    public static abstract interface IInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getReportEmail();
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.horizontalsystems.bankwallet.entities.Account getActiveAccount();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> getWallets();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.core.entities.Currency getBaseCurrency();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.modules.balance.BalanceSortType getSortType();
        
        public abstract boolean getBalanceHidden();
        
        public abstract void setBalanceHidden(boolean p0);
        
        public abstract boolean getNetworkAvailable();
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.horizontalsystems.xrateskit2.entities.LatestRate latestRate(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode);
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.horizontalsystems.xrateskit2.entities.ChartInfo chartInfo(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode);
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.math.BigDecimal balance(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet);
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.math.BigDecimal balanceLocked(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet);
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.horizontalsystems.bankwallet.core.AdapterState state(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet);
        
        public abstract void subscribeToWallets();
        
        public abstract void subscribeToBaseCurrency();
        
        public abstract void subscribeToAdapters(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets);
        
        public abstract void subscribeToMarketInfo(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.coinkit2.models.Coin> coins, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode);
        
        public abstract void refresh(@org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode);
        
        public abstract void saveSortType(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.balance.BalanceSortType sortType);
        
        public abstract void clear();
        
        public abstract void notifyPageActive();
        
        public abstract void notifyPageInactive();
        
        public abstract void refreshByWallet(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\"\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u001c\u0010\u0011\u001a\u00020\u00032\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H&J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0016\u0010\u0019\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH&\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IInteractorDelegate;", "", "didPrepareAdapters", "", "didRefresh", "didUpdateActiveAccount", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "didUpdateBalance", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "balance", "Ljava/math/BigDecimal;", "balanceLocked", "didUpdateCurrency", "currency", "Lio/horizontalsystems/core/entities/Currency;", "didUpdateLatestRate", "latestRate", "", "Lio/horizontalsystems/coinkit2/models/CoinType;", "Lio/horizontalsystems/xrateskit2/entities/LatestRate;", "didUpdateState", "state", "Lio/horizontalsystems/bankwallet/core/AdapterState;", "didUpdateWallets", "wallets", "", "app_debug"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void didUpdateWallets(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets);
        
        public abstract void didPrepareAdapters();
        
        public abstract void didUpdateBalance(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
        java.math.BigDecimal balance, @org.jetbrains.annotations.Nullable()
        java.math.BigDecimal balanceLocked);
        
        public abstract void didUpdateState(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.AdapterState state);
        
        public abstract void didUpdateCurrency(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.core.entities.Currency currency);
        
        public abstract void didUpdateLatestRate(@org.jetbrains.annotations.NotNull()
        java.util.Map<io.horizontalsystems.coinkit2.models.CoinType, io.horizontalsystems.xrateskit2.entities.LatestRate> latestRate);
        
        public abstract void didRefresh();
        
        public abstract void didUpdateActiveAccount(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.entities.Account account);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IRouter;", "", "openChart", "", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "openEmail", "emailAddress", "", "errorMessage", "openManageCoins", "openReceive", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "openSend", "openSortTypeDialog", "sortingType", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceSortType;", "openSwap", "app_debug"})
    public static abstract interface IRouter {
        
        public abstract void openReceive(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet);
        
        public abstract void openSend(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet);
        
        public abstract void openSwap(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet);
        
        public abstract void openManageCoins();
        
        public abstract void openSortTypeDialog(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.balance.BalanceSortType sortingType);
        
        public abstract void openChart(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin);
        
        public abstract void openEmail(@org.jetbrains.annotations.NotNull()
        java.lang.String emailAddress, @org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IBalanceSorter;", "", "sort", "", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$BalanceItem;", "items", "sortType", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceSortType;", "app_debug"})
    public static abstract interface IBalanceSorter {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<io.horizontalsystems.bankwallet.modules.balance.BalanceModule.BalanceItem> sort(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.balance.BalanceModule.BalanceItem> items, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.balance.BalanceSortType sortType);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006)"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$BalanceItem;", "", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "(Lio/horizontalsystems/bankwallet/entities/Wallet;)V", "balance", "Ljava/math/BigDecimal;", "getBalance", "()Ljava/math/BigDecimal;", "setBalance", "(Ljava/math/BigDecimal;)V", "balanceLocked", "getBalanceLocked", "setBalanceLocked", "balanceTotal", "getBalanceTotal", "fiatValue", "getFiatValue", "latestRate", "Lio/horizontalsystems/xrateskit2/entities/LatestRate;", "getLatestRate", "()Lio/horizontalsystems/xrateskit2/entities/LatestRate;", "setLatestRate", "(Lio/horizontalsystems/xrateskit2/entities/LatestRate;)V", "state", "Lio/horizontalsystems/bankwallet/core/AdapterState;", "getState", "()Lio/horizontalsystems/bankwallet/core/AdapterState;", "setState", "(Lio/horizontalsystems/bankwallet/core/AdapterState;)V", "getWallet", "()Lio/horizontalsystems/bankwallet/entities/Wallet;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class BalanceItem {
        @org.jetbrains.annotations.Nullable()
        private java.math.BigDecimal balance;
        @org.jetbrains.annotations.Nullable()
        private java.math.BigDecimal balanceLocked;
        @org.jetbrains.annotations.Nullable()
        private io.horizontalsystems.bankwallet.core.AdapterState state;
        @org.jetbrains.annotations.Nullable()
        private io.horizontalsystems.xrateskit2.entities.LatestRate latestRate;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.entities.Wallet wallet = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.math.BigDecimal getBalance() {
            return null;
        }
        
        public final void setBalance(@org.jetbrains.annotations.Nullable()
        java.math.BigDecimal p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.math.BigDecimal getBalanceLocked() {
            return null;
        }
        
        public final void setBalanceLocked(@org.jetbrains.annotations.Nullable()
        java.math.BigDecimal p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.math.BigDecimal getBalanceTotal() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.core.AdapterState getState() {
            return null;
        }
        
        public final void setState(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.core.AdapterState p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.xrateskit2.entities.LatestRate getLatestRate() {
            return null;
        }
        
        public final void setLatestRate(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.xrateskit2.entities.LatestRate p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.math.BigDecimal getFiatValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.Wallet getWallet() {
            return null;
        }
        
        public BalanceItem(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.Wallet component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.balance.BalanceModule.BalanceItem copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory() {
            super();
        }
    }
}