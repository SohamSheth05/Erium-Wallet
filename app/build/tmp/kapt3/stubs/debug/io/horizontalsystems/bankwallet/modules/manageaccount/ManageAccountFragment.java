package io.horizontalsystems.bankwallet.modules.manageaccount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u001a\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/manageaccount/ManageAccountFragment;", "Lio/horizontalsystems/bankwallet/core/BaseFragment;", "Lio/horizontalsystems/bankwallet/modules/manageaccount/dialogs/UnlinkConfirmationDialog$Listener;", "()V", "saveMenuItem", "Landroid/view/MenuItem;", "viewModel", "Lio/horizontalsystems/bankwallet/modules/manageaccount/ManageAccountViewModel;", "getViewModel", "()Lio/horizontalsystems/bankwallet/modules/manageaccount/ManageAccountViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onUnlinkConfirm", "onViewCreated", "view", "openBackupModule", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "app_debug"})
public final class ManageAccountFragment extends io.horizontalsystems.bankwallet.core.BaseFragment implements io.horizontalsystems.bankwallet.modules.manageaccount.dialogs.UnlinkConfirmationDialog.Listener {
    private final kotlin.Lazy viewModel$delegate = null;
    private android.view.MenuItem saveMenuItem;
    private java.util.HashMap _$_findViewCache;
    
    private final io.horizontalsystems.bankwallet.modules.manageaccount.ManageAccountViewModel getViewModel() {
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
    
    private final void openBackupModule(io.horizontalsystems.bankwallet.entities.Account account) {
    }
    
    @java.lang.Override()
    public void onUnlinkConfirm() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public ManageAccountFragment() {
        super();
    }
}