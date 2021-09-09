package io.horizontalsystems.bankwallet.ui.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0002 !BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bankwallet/ui/extensions/ConfirmationDialog;", "Lio/horizontalsystems/bankwallet/ui/extensions/BaseBottomSheetDialogFragment;", "listener", "Lio/horizontalsystems/bankwallet/ui/extensions/ConfirmationDialog$Listener;", "title", "", "subtitle", "icon", "", "contentText", "actionButtonTitle", "cancelButtonTitle", "destructiveButtonTitle", "(Lio/horizontalsystems/bankwallet/ui/extensions/ConfirmationDialog$Listener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "btnAction", "Landroid/widget/Button;", "btnCancel", "btnDestructive", "contentTextView", "Landroid/widget/TextView;", "Ljava/lang/Integer;", "bindActions", "", "close", "onCancel", "dialog", "Landroid/content/DialogInterface;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "Listener", "app_debug"})
public final class ConfirmationDialog extends io.horizontalsystems.bankwallet.ui.extensions.BaseBottomSheetDialogFragment {
    private android.widget.TextView contentTextView;
    private android.widget.Button btnAction;
    private android.widget.Button btnDestructive;
    private android.widget.Button btnCancel;
    private final io.horizontalsystems.bankwallet.ui.extensions.ConfirmationDialog.Listener listener = null;
    private final java.lang.String title = null;
    private final java.lang.String subtitle = null;
    private final java.lang.Integer icon = null;
    private final java.lang.String contentText = null;
    private final java.lang.String actionButtonTitle = null;
    private final java.lang.String cancelButtonTitle = null;
    private final java.lang.String destructiveButtonTitle = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.ui.extensions.ConfirmationDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCancel(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bindActions() {
    }
    
    public ConfirmationDialog(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.extensions.ConfirmationDialog.Listener listener, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String subtitle, @org.jetbrains.annotations.Nullable()
    java.lang.Integer icon, @org.jetbrains.annotations.Nullable()
    java.lang.String contentText, @org.jetbrains.annotations.Nullable()
    java.lang.String actionButtonTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String cancelButtonTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String destructiveButtonTitle) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/extensions/ConfirmationDialog$Listener;", "", "onActionButtonClick", "", "onCancelButtonClick", "onDestructiveButtonClick", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onActionButtonClick();
        
        public abstract void onDestructiveButtonClick();
        
        public abstract void onCancelButtonClick();
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            public static void onActionButtonClick(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.ui.extensions.ConfirmationDialog.Listener $this) {
            }
            
            public static void onDestructiveButtonClick(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.ui.extensions.ConfirmationDialog.Listener $this) {
            }
            
            public static void onCancelButtonClick(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.ui.extensions.ConfirmationDialog.Listener $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002Je\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/extensions/ConfirmationDialog$Companion;", "", "()V", "show", "", "icon", "", "title", "", "subtitle", "contentText", "actionButtonTitle", "cancelButtonTitle", "activity", "Landroidx/fragment/app/FragmentActivity;", "listener", "Lio/horizontalsystems/bankwallet/ui/extensions/ConfirmationDialog$Listener;", "destructiveButtonTitle", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/FragmentActivity;Lio/horizontalsystems/bankwallet/ui/extensions/ConfirmationDialog$Listener;Ljava/lang/String;)V", "app_debug"})
    public static final class Companion {
        
        public final void show(@org.jetbrains.annotations.Nullable()
        java.lang.Integer icon, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String subtitle, @org.jetbrains.annotations.Nullable()
        java.lang.String contentText, @org.jetbrains.annotations.Nullable()
        java.lang.String actionButtonTitle, @org.jetbrains.annotations.Nullable()
        java.lang.String cancelButtonTitle, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.ui.extensions.ConfirmationDialog.Listener listener, @org.jetbrains.annotations.Nullable()
        java.lang.String destructiveButtonTitle) {
        }
        
        private Companion() {
            super();
        }
    }
}