package io.horizontalsystems.bankwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020&H\u0016J\u0012\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\"\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00101\u001a\u00020&2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u00102\u001a\u00020&2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020604H\u0016J\u0018\u00107\u001a\u00020&2\u0006\u0010,\u001a\u00020-2\u0006\u00108\u001a\u000209H\u0016J\u0016\u0010:\u001a\u00020&2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020-0\u0016H\u0016J\b\u0010<\u001a\u00020&H\u0002J\b\u0010=\u001a\u00020&H\u0002J\u0016\u0010>\u001a\u00020&2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020-0\u0016H\u0002J\b\u0010?\u001a\u00020&H\u0016J\b\u0010@\u001a\u00020&H\u0016J\u0010\u0010A\u001a\u00020&2\u0006\u0010B\u001a\u00020\u0012H\u0016J\b\u0010C\u001a\u00020&H\u0016J\u0010\u0010D\u001a\u00020&2\u0006\u0010B\u001a\u00020\u0012H\u0016J\b\u0010E\u001a\u00020&H\u0016J\b\u0010F\u001a\u00020&H\u0016J\u0010\u0010G\u001a\u00020&2\u0006\u0010B\u001a\u00020\u0012H\u0016J\u0010\u0010H\u001a\u00020&2\u0006\u0010B\u001a\u00020\u0012H\u0016J\b\u0010I\u001a\u00020&H\u0016J\u0010\u0010J\u001a\u00020&2\u0006\u0010K\u001a\u00020LH\u0016J\b\u0010M\u001a\u00020&H\u0016J\b\u0010N\u001a\u00020&H\u0016J\u0010\u0010O\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010P\u001a\u00020&2\u0006\u0010B\u001a\u00020\u0012H\u0016J\u0010\u0010Q\u001a\u00020&2\u0006\u0010B\u001a\u00020\u0012H\u0016J\u0010\u0010R\u001a\u00020&2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010S\u001a\u00020\u00142\u0006\u0010T\u001a\u000205H\u0002J\b\u0010U\u001a\u00020&H\u0002J\b\u0010V\u001a\u00020&H\u0002J\b\u0010W\u001a\u00020&H\u0002J$\u0010X\u001a\u00020&2\u0006\u0010,\u001a\u00020-2\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020&0ZH\u0002J\u0012\u0010[\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\b\u0010\\\u001a\u00020&H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010$\u00a8\u0006]"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalancePresenter;", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IViewDelegate;", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IInteractorDelegate;", "interactor", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IInteractor;", "router", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IRouter;", "sorter", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IBalanceSorter;", "factory", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceViewItemFactory;", "(Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IInteractor;Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IRouter;Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IBalanceSorter;Lio/horizontalsystems/bankwallet/modules/balance/BalanceViewItemFactory;)V", "currency", "Lio/horizontalsystems/core/entities/Currency;", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "expandedViewItem", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceViewItem;", "hideBalance", "", "items", "", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$BalanceItem;", "sortType", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceSortType;", "view", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IView;", "getView", "()Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IView;", "setView", "(Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IView;)V", "viewItems", "", "viewItemsCopy", "getViewItemsCopy", "()Ljava/util/List;", "didPrepareAdapters", "", "didRefresh", "didUpdateActiveAccount", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "didUpdateBalance", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "balance", "Ljava/math/BigDecimal;", "balanceLocked", "didUpdateCurrency", "didUpdateLatestRate", "latestRate", "", "Lio/horizontalsystems/coinkit2/models/CoinType;", "Lio/horizontalsystems/xrateskit2/entities/LatestRate;", "didUpdateState", "state", "Lio/horizontalsystems/bankwallet/core/AdapterState;", "didUpdateWallets", "wallets", "handleAdaptersReady", "handleRates", "handleUpdate", "onAddCoinClick", "onBalanceClick", "onChart", "viewItem", "onClear", "onItem", "onLoad", "onPause", "onPay", "onReceive", "onRefresh", "onReportClick", "errorMessage", "", "onResume", "onSortClick", "onSortTypeChange", "onSwap", "onSyncErrorClick", "refreshByWallet", "sourceChangeable", "coinType", "syncBalanceHidden", "toggleBalanceVisibility", "updateHeaderViewItem", "updateItem", "updateBlock", "Lkotlin/Function1;", "updateTitle", "updateViewItems", "app_debug"})
public final class BalancePresenter implements io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IViewDelegate, io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IInteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IView view;
    private final java.util.concurrent.ExecutorService executor = null;
    private java.util.List<io.horizontalsystems.bankwallet.modules.balance.BalanceModule.BalanceItem> items;
    private java.util.List<io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem> viewItems;
    private io.horizontalsystems.core.entities.Currency currency;
    private io.horizontalsystems.bankwallet.modules.balance.BalanceSortType sortType;
    private boolean hideBalance;
    private io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem expandedViewItem;
    private final io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IInteractor interactor = null;
    private final io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IRouter router = null;
    private final io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IBalanceSorter sorter = null;
    private final io.horizontalsystems.bankwallet.modules.balance.BalanceViewItemFactory factory = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IView p0) {
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem> getViewItemsCopy() {
        return null;
    }
    
    @java.lang.Override()
    public void onLoad() {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem) {
    }
    
    @java.lang.Override()
    public void onPay(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem) {
    }
    
    @java.lang.Override()
    public void onSwap(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem) {
    }
    
    @java.lang.Override()
    public void onChart(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem) {
    }
    
    @java.lang.Override()
    public void onItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem) {
    }
    
    @java.lang.Override()
    public void onAddCoinClick() {
    }
    
    @java.lang.Override()
    public void onSortClick() {
    }
    
    @java.lang.Override()
    public void onBalanceClick() {
    }
    
    private final void syncBalanceHidden() {
    }
    
    private final void updateTitle(io.horizontalsystems.bankwallet.entities.Account account) {
    }
    
    @java.lang.Override()
    public void onSortTypeChange(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceSortType sortType) {
    }
    
    @java.lang.Override()
    public void onClear() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onSyncErrorClick(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem) {
    }
    
    @java.lang.Override()
    public void onReportClick(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    @java.lang.Override()
    public void refreshByWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
    }
    
    @java.lang.Override()
    public void didUpdateWallets(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
    }
    
    @java.lang.Override()
    public void didPrepareAdapters() {
    }
    
    @java.lang.Override()
    public void didUpdateBalance(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal balance, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal balanceLocked) {
    }
    
    @java.lang.Override()
    public void didUpdateState(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AdapterState state) {
    }
    
    @java.lang.Override()
    public void didUpdateCurrency(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency) {
    }
    
    @java.lang.Override()
    public void didUpdateLatestRate(@org.jetbrains.annotations.NotNull()
    java.util.Map<io.horizontalsystems.coinkit2.models.CoinType, io.horizontalsystems.xrateskit2.entities.LatestRate> latestRate) {
    }
    
    @java.lang.Override()
    public void didRefresh() {
    }
    
    @java.lang.Override()
    public void didUpdateActiveAccount(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.Account account) {
    }
    
    private final boolean sourceChangeable(io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return false;
    }
    
    private final void handleUpdate(java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
    }
    
    private final void handleAdaptersReady() {
    }
    
    private final void handleRates() {
    }
    
    private final void updateItem(io.horizontalsystems.bankwallet.entities.Wallet wallet, kotlin.jvm.functions.Function1<? super io.horizontalsystems.bankwallet.modules.balance.BalanceModule.BalanceItem, kotlin.Unit> updateBlock) {
    }
    
    private final void toggleBalanceVisibility() {
    }
    
    private final void updateViewItems() {
    }
    
    private final void updateHeaderViewItem() {
    }
    
    public BalancePresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IRouter router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IBalanceSorter sorter, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItemFactory factory) {
        super();
    }
}