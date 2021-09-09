package io.horizontalsystems.bankwallet.modules.rateapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/rateapp/RateAppDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "listener", "Lio/horizontalsystems/bankwallet/modules/rateapp/RateAppDialogFragment$Listener;", "(Lio/horizontalsystems/bankwallet/modules/rateapp/RateAppDialogFragment$Listener;)V", "onCreateDialog", "Landroid/app/Dialog;", "bundle", "Landroid/os/Bundle;", "onDismiss", "", "dialog", "Landroid/content/DialogInterface;", "Companion", "Listener", "app_debug"})
public final class RateAppDialogFragment extends androidx.fragment.app.DialogFragment {
    private io.horizontalsystems.bankwallet.modules.rateapp.RateAppDialogFragment.Listener listener;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.rateapp.RateAppDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
        return null;
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    public RateAppDialogFragment(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.rateapp.RateAppDialogFragment.Listener listener) {
        super();
    }
    
    public RateAppDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H\u0016\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/rateapp/RateAppDialogFragment$Listener;", "", "onClickCancel", "", "onClickRateApp", "onDismiss", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onClickRateApp();
        
        public abstract void onClickCancel();
        
        public abstract void onDismiss();
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            public static void onClickCancel(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.modules.rateapp.RateAppDialogFragment.Listener $this) {
            }
            
            public static void onDismiss(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.modules.rateapp.RateAppDialogFragment.Listener $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/rateapp/RateAppDialogFragment$Companion;", "", "()V", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "listener", "Lio/horizontalsystems/bankwallet/modules/rateapp/RateAppDialogFragment$Listener;", "app_debug"})
    public static final class Companion {
        
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.rateapp.RateAppDialogFragment.Listener listener) {
        }
        
        private Companion() {
            super();
        }
    }
}