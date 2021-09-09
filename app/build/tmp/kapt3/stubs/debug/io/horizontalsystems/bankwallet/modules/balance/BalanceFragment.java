package io.horizontalsystems.bankwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u000fH\u0016J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010#\u001a\u00020\u000fH\u0016J\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010%\u001a\u00020\u000fH\u0016J\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\'\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010(\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0018\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0002J\u0010\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020\u000fH\u0002J\u0010\u00103\u001a\u00020\u000f2\u0006\u00104\u001a\u00020-H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u00065"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceFragment;", "Lio/horizontalsystems/bankwallet/core/BaseFragment;", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceItemsAdapter$Listener;", "Lio/horizontalsystems/bankwallet/modules/receive/ReceiveFragment$Listener;", "Lio/horizontalsystems/bankwallet/modules/manageaccount/dialogs/BackupRequiredDialog$Listener;", "()V", "balanceItemsAdapter", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceItemsAdapter;", "viewModel", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceViewModel;", "getViewModel", "()Lio/horizontalsystems/bankwallet/modules/balance/BalanceViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "observeLiveData", "", "onAttachFragment", "childFragment", "Landroidx/fragment/app/Fragment;", "onChartClicked", "viewItem", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceViewItem;", "onClickBackup", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onItemClicked", "onPause", "onReceiveClicked", "onResume", "onSendClicked", "onSwapClicked", "onSyncErrorClicked", "onViewCreated", "view", "sendEmail", "email", "", "report", "setHeaderViewItem", "headerViewItem", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceHeaderViewItem;", "setSwipeBackground", "shareReceiveAddress", "address", "app_debug"})
public final class BalanceFragment extends io.horizontalsystems.bankwallet.core.BaseFragment implements io.horizontalsystems.bankwallet.modules.balance.BalanceItemsAdapter.Listener, io.horizontalsystems.bankwallet.modules.receive.ReceiveFragment.Listener, io.horizontalsystems.bankwallet.modules.manageaccount.dialogs.BackupRequiredDialog.Listener {
    private final kotlin.Lazy viewModel$delegate = null;
    private final io.horizontalsystems.bankwallet.modules.balance.BalanceItemsAdapter balanceItemsAdapter = null;
    private java.util.HashMap _$_findViewCache;
    
    private final io.horizontalsystems.bankwallet.modules.balance.BalanceViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void setSwipeBackground() {
    }
    
    @java.lang.Override()
    public void shareReceiveAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @java.lang.Override()
    public void onClickBackup(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account) {
    }
    
    @java.lang.Override()
    public void onSendClicked(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem) {
    }
    
    @java.lang.Override()
    public void onReceiveClicked(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem) {
    }
    
    @java.lang.Override()
    public void onSwapClicked(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem) {
    }
    
    @java.lang.Override()
    public void onItemClicked(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem) {
    }
    
    @java.lang.Override()
    public void onChartClicked(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem) {
    }
    
    @java.lang.Override()
    public void onSyncErrorClicked(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem) {
    }
    
    @java.lang.Override()
    public void onAttachFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment childFragment) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final void observeLiveData() {
    }
    
    private final void sendEmail(java.lang.String email, java.lang.String report) {
    }
    
    private final void setHeaderViewItem(io.horizontalsystems.bankwallet.modules.balance.BalanceHeaderViewItem headerViewItem) {
    }
    
    public BalanceFragment() {
        super();
    }
}