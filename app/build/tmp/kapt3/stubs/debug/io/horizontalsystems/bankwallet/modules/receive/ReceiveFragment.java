package io.horizontalsystems.bankwallet.modules.receive;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/receive/ReceiveFragment;", "Lio/horizontalsystems/bankwallet/ui/extensions/BaseBottomSheetDialogFragment;", "()V", "listener", "Lio/horizontalsystems/bankwallet/modules/receive/ReceiveFragment$Listener;", "observeRouter", "", "receiveRouter", "Lio/horizontalsystems/bankwallet/modules/receive/ReceiveRouter;", "observeView", "view", "Lio/horizontalsystems/bankwallet/modules/receive/ReceiveView;", "onViewCreated", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setListener", "Companion", "Listener", "app_debug"})
public final class ReceiveFragment extends io.horizontalsystems.bankwallet.ui.extensions.BaseBottomSheetDialogFragment {
    private io.horizontalsystems.bankwallet.modules.receive.ReceiveFragment.Listener listener;
    private static final java.lang.String WALLET_KEY = "wallet_key";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.receive.ReceiveFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.receive.ReceiveFragment.Listener listener) {
    }
    
    private final void observeRouter(io.horizontalsystems.bankwallet.modules.receive.ReceiveRouter receiveRouter) {
    }
    
    private final void observeView(io.horizontalsystems.bankwallet.modules.receive.ReceiveView view) {
    }
    
    public ReceiveFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/receive/ReceiveFragment$Listener;", "", "shareReceiveAddress", "", "address", "", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void shareReceiveAddress(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/receive/ReceiveFragment$Companion;", "", "()V", "WALLET_KEY", "", "newInstance", "Lio/horizontalsystems/bankwallet/modules/receive/ReceiveFragment;", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.receive.ReceiveFragment newInstance(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}