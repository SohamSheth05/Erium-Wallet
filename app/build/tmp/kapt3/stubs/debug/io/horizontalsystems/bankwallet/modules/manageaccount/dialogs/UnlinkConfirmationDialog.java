package io.horizontalsystems.bankwallet.modules.manageaccount.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/manageaccount/dialogs/UnlinkConfirmationDialog;", "Lio/horizontalsystems/bankwallet/ui/extensions/BaseBottomSheetDialogFragment;", "Lio/horizontalsystems/bankwallet/modules/manageaccount/dialogs/ConfirmationsAdapter$Listener;", "()V", "checkboxItems", "", "Lio/horizontalsystems/bankwallet/modules/manageaccount/dialogs/CheckBoxItem;", "listener", "Lio/horizontalsystems/bankwallet/modules/manageaccount/dialogs/UnlinkConfirmationDialog$Listener;", "checkConfirmations", "", "onItemCheckMarkClick", "position", "", "checked", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setListener", "Companion", "Listener", "app_debug"})
public final class UnlinkConfirmationDialog extends io.horizontalsystems.bankwallet.ui.extensions.BaseBottomSheetDialogFragment implements io.horizontalsystems.bankwallet.modules.manageaccount.dialogs.ConfirmationsAdapter.Listener {
    private io.horizontalsystems.bankwallet.modules.manageaccount.dialogs.UnlinkConfirmationDialog.Listener listener;
    private java.util.List<io.horizontalsystems.bankwallet.modules.manageaccount.dialogs.CheckBoxItem> checkboxItems;
    private static final java.lang.String ACCOUNT_NAME = "account_name";
    private static final java.lang.String CHECKBOX_ITEMS = "checkbox_items";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.manageaccount.dialogs.UnlinkConfirmationDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.manageaccount.dialogs.UnlinkConfirmationDialog.Listener listener) {
    }
    
    @java.lang.Override()
    public void onItemCheckMarkClick(int position, boolean checked) {
    }
    
    private final void checkConfirmations() {
    }
    
    public UnlinkConfirmationDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/manageaccount/dialogs/UnlinkConfirmationDialog$Listener;", "", "onUnlinkConfirm", "", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onUnlinkConfirm();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/manageaccount/dialogs/UnlinkConfirmationDialog$Companion;", "", "()V", "ACCOUNT_NAME", "", "CHECKBOX_ITEMS", "show", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "accountName", "checkboxItems", "", "app_debug"})
    public static final class Companion {
        
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
        java.lang.String accountName, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> checkboxItems) {
        }
        
        private Companion() {
            super();
        }
    }
}