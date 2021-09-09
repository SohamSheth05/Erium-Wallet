package io.horizontalsystems.bankwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010;\u001a\u00020\u0012H\u0016J\b\u0010\u0010\u001a\u00020\u0012H\u0016J\b\u0010<\u001a\u00020\u0012H\u0014J\u0010\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u0018H\u0016J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010?\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020\u001cH\u0016J\b\u0010A\u001a\u00020\u0012H\u0016J\u0010\u0010B\u001a\u00020\u00122\u0006\u0010C\u001a\u00020!H\u0016J\u0010\u0010D\u001a\u00020\u00122\u0006\u0010C\u001a\u00020!H\u0016J\u0010\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020(H\u0016J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010C\u001a\u00020!H\u0016J\u0010\u0010G\u001a\u00020\u00122\u0006\u0010H\u001a\u00020-H\u0016J\u0016\u0010G\u001a\u00020\u00122\f\u0010I\u001a\b\u0012\u0004\u0012\u00020100H\u0016J\u0012\u0010J\u001a\u00020\u00122\b\u0010K\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010L\u001a\u00020\u00122\u0006\u0010C\u001a\u00020!H\u0016J\b\u0010M\u001a\u00020\u0012H\u0016J \u0010N\u001a\u00020\u00122\u0006\u0010C\u001a\u00020!2\u0006\u0010@\u001a\u00020\u001c2\u0006\u0010O\u001a\u000207H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR#\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001b0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000fR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000fR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000fR\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u000fR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020!0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u000fR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0014R\u001d\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0014R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020!0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u000fR)\u00105\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u000207060\f\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u000fR\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0014\u00a8\u0006P"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IView;", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IRouter;", "()V", "delegate", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$IViewDelegate;)V", "didRefreshLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "Ljava/lang/Void;", "getDidRefreshLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "hideBalance", "Landroidx/lifecycle/MutableLiveData;", "", "getHideBalance", "()Landroidx/lifecycle/MutableLiveData;", "networkNotAvailable", "getNetworkNotAvailable", "openChartModule", "Lio/horizontalsystems/coinkit2/models/Coin;", "getOpenChartModule", "openEmail", "Lkotlin/Pair;", "", "getOpenEmail", "openManageCoinsLiveEvent", "getOpenManageCoinsLiveEvent", "openReceiveDialog", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "getOpenReceiveDialog", "openSendDialog", "getOpenSendDialog", "openSendEvmDialog", "getOpenSendEvmDialog", "openSortingTypeDialogLiveEvent", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceSortType;", "getOpenSortingTypeDialogLiveEvent", "openSwap", "getOpenSwap", "setHeaderViewItem", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceHeaderViewItem;", "getSetHeaderViewItem", "setViewItems", "", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceViewItem;", "getSetViewItems", "showBackupAlert", "getShowBackupAlert", "showSyncError", "Lkotlin/Triple;", "", "getShowSyncError", "titleLiveData", "getTitleLiveData", "didRefresh", "onCleared", "openChart", "coin", "emailAddress", "errorMessage", "openManageCoins", "openReceive", "wallet", "openSend", "openSortTypeDialog", "sortingType", "set", "headerViewItem", "viewItems", "setTitle", "v", "showBackupRequired", "showNetworkNotAvailable", "showSyncErrorDialog", "sourceChangeable", "app_debug"})
public final class BalanceViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IView, io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IRouter {
    public io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.entities.Wallet> openReceiveDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.entities.Wallet> openSendDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.entities.Wallet> openSendEvmDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.entities.Wallet> openSwap = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.Void> openManageCoinsLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.balance.BalanceSortType> openSortingTypeDialogLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.coinkit2.models.Coin> openChartModule = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Pair<java.lang.String, java.lang.String>> openEmail = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.balance.BalanceHeaderViewItem> setHeaderViewItem = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem>> setViewItems = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> titleLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.entities.Wallet> showBackupAlert = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.Void> didRefreshLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> hideBalance = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Triple<io.horizontalsystems.bankwallet.entities.Wallet, java.lang.String, java.lang.Boolean>> showSyncError = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.Void> networkNotAvailable = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceModule.IViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.entities.Wallet> getOpenReceiveDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.entities.Wallet> getOpenSendDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.entities.Wallet> getOpenSendEvmDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.entities.Wallet> getOpenSwap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.Void> getOpenManageCoinsLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.balance.BalanceSortType> getOpenSortingTypeDialogLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.coinkit2.models.Coin> getOpenChartModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Pair<java.lang.String, java.lang.String>> getOpenEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.balance.BalanceHeaderViewItem> getSetHeaderViewItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem>> getSetViewItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTitleLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.entities.Wallet> getShowBackupAlert() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.Void> getDidRefreshLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getHideBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Triple<io.horizontalsystems.bankwallet.entities.Wallet, java.lang.String, java.lang.Boolean>> getShowSyncError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.Void> getNetworkNotAvailable() {
        return null;
    }
    
    @java.lang.Override()
    public void openReceive(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
    }
    
    @java.lang.Override()
    public void openSend(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
    }
    
    @java.lang.Override()
    public void openSwap(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
    }
    
    @java.lang.Override()
    public void openManageCoins() {
    }
    
    @java.lang.Override()
    public void openSortTypeDialog(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceSortType sortingType) {
    }
    
    @java.lang.Override()
    public void openChart(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    @java.lang.Override()
    public void openEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String emailAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
    }
    
    @java.lang.Override()
    public void set(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceHeaderViewItem headerViewItem) {
    }
    
    @java.lang.Override()
    public void set(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem> viewItems) {
    }
    
    @java.lang.Override()
    public void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String v) {
    }
    
    @java.lang.Override()
    public void showBackupRequired(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
    }
    
    @java.lang.Override()
    public void didRefresh() {
    }
    
    @java.lang.Override()
    public void hideBalance() {
    }
    
    @java.lang.Override()
    public void showSyncErrorDialog(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage, boolean sourceChangeable) {
    }
    
    @java.lang.Override()
    public void showNetworkNotAvailable() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BalanceViewModel() {
        super();
    }
}