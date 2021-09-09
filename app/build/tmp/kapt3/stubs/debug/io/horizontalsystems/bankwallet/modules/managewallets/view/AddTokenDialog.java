package io.horizontalsystems.bankwallet.modules.managewallets.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/managewallets/view/AddTokenDialog;", "Lio/horizontalsystems/bankwallet/ui/extensions/BaseBottomSheetDialogFragment;", "listener", "Lio/horizontalsystems/bankwallet/modules/managewallets/view/AddTokenDialog$Listener;", "(Lio/horizontalsystems/bankwallet/modules/managewallets/view/AddTokenDialog$Listener;)V", "bindActions", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "Listener", "app_debug"})
public final class AddTokenDialog extends io.horizontalsystems.bankwallet.ui.extensions.BaseBottomSheetDialogFragment {
    private final io.horizontalsystems.bankwallet.modules.managewallets.view.AddTokenDialog.Listener listener = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.managewallets.view.AddTokenDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bindActions() {
    }
    
    public AddTokenDialog(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.managewallets.view.AddTokenDialog.Listener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/managewallets/view/AddTokenDialog$Listener;", "", "onClickAddBep20Token", "", "onClickAddBep2Token", "onClickAddErc20Token", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onClickAddErc20Token();
        
        public abstract void onClickAddBep20Token();
        
        public abstract void onClickAddBep2Token();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/managewallets/view/AddTokenDialog$Companion;", "", "()V", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "listener", "Lio/horizontalsystems/bankwallet/modules/managewallets/view/AddTokenDialog$Listener;", "app_debug"})
    public static final class Companion {
        
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.managewallets.view.AddTokenDialog.Listener listener) {
        }
        
        private Companion() {
            super();
        }
    }
}