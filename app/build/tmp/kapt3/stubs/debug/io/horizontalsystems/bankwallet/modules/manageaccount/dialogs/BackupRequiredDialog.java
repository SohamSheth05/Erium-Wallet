package io.horizontalsystems.bankwallet.modules.manageaccount.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/manageaccount/dialogs/BackupRequiredDialog;", "Lio/horizontalsystems/bankwallet/ui/extensions/BaseBottomSheetDialogFragment;", "()V", "listener", "Lio/horizontalsystems/bankwallet/modules/manageaccount/dialogs/BackupRequiredDialog$Listener;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setListener", "Companion", "Listener", "app_debug"})
public final class BackupRequiredDialog extends io.horizontalsystems.bankwallet.ui.extensions.BaseBottomSheetDialogFragment {
    private io.horizontalsystems.bankwallet.modules.manageaccount.dialogs.BackupRequiredDialog.Listener listener;
    private static final java.lang.String ACCOUNT = "account";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.manageaccount.dialogs.BackupRequiredDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.manageaccount.dialogs.BackupRequiredDialog.Listener listener) {
    }
    
    public BackupRequiredDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/manageaccount/dialogs/BackupRequiredDialog$Listener;", "", "onClickBackup", "", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onClickBackup(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Account account);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/manageaccount/dialogs/BackupRequiredDialog$Companion;", "", "()V", "ACCOUNT", "", "show", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "app_debug"})
    public static final class Companion {
        
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Account account) {
        }
        
        private Companion() {
            super();
        }
    }
}