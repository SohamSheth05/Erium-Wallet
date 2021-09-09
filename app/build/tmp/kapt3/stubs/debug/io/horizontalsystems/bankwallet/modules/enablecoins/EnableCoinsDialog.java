package io.horizontalsystems.bankwallet.modules.enablecoins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsDialog;", "Lio/horizontalsystems/bankwallet/ui/extensions/BaseBottomSheetDialogFragment;", "listener", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsDialog$Listener;", "tokenType", "", "(Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsDialog$Listener;Ljava/lang/String;)V", "getIcon", "", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "Listener", "app_debug"})
public final class EnableCoinsDialog extends io.horizontalsystems.bankwallet.ui.extensions.BaseBottomSheetDialogFragment {
    private final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsDialog.Listener listener = null;
    private final java.lang.String tokenType = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final int getIcon(java.lang.String tokenType) {
        return 0;
    }
    
    public EnableCoinsDialog(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsDialog.Listener listener, @org.jetbrains.annotations.NotNull()
    java.lang.String tokenType) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsDialog$Listener;", "", "onClickEnable", "", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onClickEnable();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsDialog$Companion;", "", "()V", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "tokenType", "", "listener", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsDialog$Listener;", "app_debug"})
    public static final class Companion {
        
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
        java.lang.String tokenType, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsDialog.Listener listener) {
        }
        
        private Companion() {
            super();
        }
    }
}