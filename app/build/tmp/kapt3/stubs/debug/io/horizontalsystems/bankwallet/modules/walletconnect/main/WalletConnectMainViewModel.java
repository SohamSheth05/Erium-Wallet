package io.horizontalsystems.bankwallet.modules.walletconnect.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u000234B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010(\u001a\u00020\fJ\u0006\u0010)\u001a\u00020\fJ\u0006\u0010*\u001a\u00020\fJ\u0018\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0018\u00100\u001a\u00020\u00122\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0012\u00101\u001a\u0004\u0018\u00010&2\u0006\u0010.\u001a\u00020/H\u0002J\u0018\u00102\u001a\u00020\f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\tR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000eR\u0019\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\tR\u0019\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\t\u00a8\u00065"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/main/WalletConnectMainViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService;", "(Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService;)V", "cancelVisibleLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getCancelVisibleLiveData", "()Landroidx/lifecycle/MutableLiveData;", "closeLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getCloseLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "closeVisibleLiveData", "getCloseVisibleLiveData", "connectButtonLiveData", "Lio/horizontalsystems/bankwallet/modules/walletconnect/main/WalletConnectMainViewModel$ButtonState;", "getConnectButtonLiveData", "connectingLiveData", "getConnectingLiveData", "disconnectButtonLiveData", "getDisconnectButtonLiveData", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "hintLiveData", "", "getHintLiveData", "openRequestLiveEvent", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectRequest;", "getOpenRequestLiveEvent", "peerMetaLiveData", "Lio/horizontalsystems/bankwallet/modules/walletconnect/main/PeerMetaViewItem;", "getPeerMetaLiveData", "signedTransactionsVisibleLiveData", "getSignedTransactionsVisibleLiveData", "statusLiveData", "Lio/horizontalsystems/bankwallet/modules/walletconnect/main/WalletConnectMainViewModel$Status;", "getStatusLiveData", "cancel", "connect", "disconnect", "getConnectButtonState", "state", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State;", "connectionState", "Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor$State;", "getDisconnectButtonState", "getStatus", "sync", "ButtonState", "Status", "app_debug"})
public final class WalletConnectMainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> connectingLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.walletconnect.main.PeerMetaViewItem> peerMetaLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> cancelVisibleLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.walletconnect.main.WalletConnectMainViewModel.ButtonState> connectButtonLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.walletconnect.main.WalletConnectMainViewModel.ButtonState> disconnectButtonLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> closeVisibleLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> signedTransactionsVisibleLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> hintLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.walletconnect.main.WalletConnectMainViewModel.Status> statusLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> closeLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectRequest> openRequestLiveEvent = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getConnectingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.walletconnect.main.PeerMetaViewItem> getPeerMetaLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getCancelVisibleLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.walletconnect.main.WalletConnectMainViewModel.ButtonState> getConnectButtonLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.walletconnect.main.WalletConnectMainViewModel.ButtonState> getDisconnectButtonLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getCloseVisibleLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSignedTransactionsVisibleLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getHintLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.walletconnect.main.WalletConnectMainViewModel.Status> getStatusLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getCloseLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectRequest> getOpenRequestLiveEvent() {
        return null;
    }
    
    public final void cancel() {
    }
    
    public final void connect() {
    }
    
    public final void disconnect() {
    }
    
    private final void sync(io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.State state, io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.State connectionState) {
    }
    
    private final io.horizontalsystems.bankwallet.modules.walletconnect.main.WalletConnectMainViewModel.Status getStatus(io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.State connectionState) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.walletconnect.main.WalletConnectMainViewModel.ButtonState getConnectButtonState(io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.State state, io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.State connectionState) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.walletconnect.main.WalletConnectMainViewModel.ButtonState getDisconnectButtonState(io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.State state, io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.State connectionState) {
        return null;
    }
    
    public WalletConnectMainViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService service) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/main/WalletConnectMainViewModel$Status;", "", "(Ljava/lang/String;I)V", "OFFLINE", "ONLINE", "CONNECTING", "app_debug"})
    public static enum Status {
        /*public static final*/ OFFLINE /* = new OFFLINE() */,
        /*public static final*/ ONLINE /* = new ONLINE() */,
        /*public static final*/ CONNECTING /* = new CONNECTING() */;
        
        Status() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/main/WalletConnectMainViewModel$ButtonState;", "", "visible", "", "enabled", "(Ljava/lang/String;IZZ)V", "getEnabled", "()Z", "getVisible", "Enabled", "Disabled", "Hidden", "app_debug"})
    public static enum ButtonState {
        /*public static final*/ Enabled /* = new Enabled(false, false) */,
        /*public static final*/ Disabled /* = new Disabled(false, false) */,
        /*public static final*/ Hidden /* = new Hidden(false, false) */;
        private final boolean visible = false;
        private final boolean enabled = false;
        
        public final boolean getVisible() {
            return false;
        }
        
        public final boolean getEnabled() {
            return false;
        }
        
        ButtonState(boolean visible, boolean enabled) {
        }
    }
}