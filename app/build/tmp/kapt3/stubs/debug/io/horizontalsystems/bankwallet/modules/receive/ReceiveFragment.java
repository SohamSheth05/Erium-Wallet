package io.horizontalsystems.bankwallet.modules.receive;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\u001a\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006#"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/receive/ReceiveFragment;", "Lio/horizontalsystems/bankwallet/ui/extensions/BaseBottomSheetDialogFragment;", "()V", "listener", "Lio/horizontalsystems/bankwallet/modules/receive/ReceiveFragment$Listener;", "mDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getMDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "setMDisposable", "(Lio/reactivex/disposables/CompositeDisposable;)V", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "getWallet", "()Lio/horizontalsystems/bankwallet/entities/Wallet;", "setWallet", "(Lio/horizontalsystems/bankwallet/entities/Wallet;)V", "observeRouter", "", "receiveRouter", "Lio/horizontalsystems/bankwallet/modules/receive/ReceiveRouter;", "observeView", "view", "Lio/horizontalsystems/bankwallet/modules/receive/ReceiveView;", "onDestroy", "onViewCreated", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setListener", "updatePublicAddressIn", "publicAddress", "", "Companion", "Listener", "app_debug"})
public final class ReceiveFragment extends io.horizontalsystems.bankwallet.ui.extensions.BaseBottomSheetDialogFragment {
    private io.horizontalsystems.bankwallet.modules.receive.ReceiveFragment.Listener listener;
    public io.horizontalsystems.bankwallet.entities.Wallet wallet;
    @org.jetbrains.annotations.Nullable()
    private io.reactivex.disposables.CompositeDisposable mDisposable;
    private static final java.lang.String WALLET_KEY = "wallet_key";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.receive.ReceiveFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.Wallet getWallet() {
        return null;
    }
    
    public final void setWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet p0) {
    }
    
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
    
    @org.jetbrains.annotations.Nullable()
    protected final io.reactivex.disposables.CompositeDisposable getMDisposable() {
        return null;
    }
    
    protected final void setMDisposable(@org.jetbrains.annotations.Nullable()
    io.reactivex.disposables.CompositeDisposable p0) {
    }
    
    private final void updatePublicAddressIn(java.lang.String publicAddress) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
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