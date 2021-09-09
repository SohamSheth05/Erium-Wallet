package io.horizontalsystems.bankwallet.modules.walletconnect;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0003XYZB\'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u000209J\b\u0010>\u001a\u000209H\u0016J\u000e\u0010?\u001a\u0002092\u0006\u0010@\u001a\u00020\u0004J\b\u0010A\u001a\u000209H\u0016J\u0018\u0010B\u001a\u0002092\u0006\u0010C\u001a\u00020!2\u0006\u0010D\u001a\u00020EH\u0016J\'\u0010F\u001a\u0002092\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016\u00a2\u0006\u0002\u0010IJ\u0010\u0010J\u001a\u0002092\u0006\u00100\u001a\u00020\rH\u0016J\u001e\u0010K\u001a\u0002092\u0006\u0010C\u001a\u00020!2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\"0MH\u0002J \u0010N\u001a\u0002092\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020$2\u0006\u0010G\u001a\u00020HH\u0002J\u0006\u0010Q\u001a\u000209J\b\u0010R\u001a\u000209H\u0002J\u000e\u0010S\u001a\u0002092\u0006\u0010:\u001a\u00020!J\u0006\u0010T\u001a\u000209J\u0010\u0010U\u001a\u0002092\u0006\u0010V\u001a\u00020WH\u0002R\u0011\u0010\f\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\r0\r0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010#\u001a\u0004\u0018\u00010$8F\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R\u000e\u0010\'\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0\u00118F\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u0013R\u001c\u0010+\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\"0\"0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020/@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020/0\u00118F\u00a2\u0006\u0006\u001a\u0004\b6\u0010\u0013R\u001c\u00107\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010/0/0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006["}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService;", "Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor$Delegate;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "remotePeerId", "", "manager", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectManager;", "sessionManager", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSessionManager;", "connectivityManager", "Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager;", "(Ljava/lang/String;Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectManager;Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSessionManager;Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager;)V", "connectionState", "Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor$State;", "getConnectionState", "()Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor$State;", "connectionStateObservable", "Lio/reactivex/Flowable;", "getConnectionStateObservable", "()Lio/reactivex/Flowable;", "connectionStateSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "evmKit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "getEvmKit", "()Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "interactor", "Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor;", "pendingRequests", "Ljava/util/LinkedHashMap;", "", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectRequest;", "remotePeerMeta", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "getRemotePeerMeta", "()Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "requestIsProcessing", "", "requestObservable", "getRequestObservable", "requestSubject", "sessionData", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$SessionData;", "value", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State;", "state", "getState", "()Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State;", "setState", "(Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State;)V", "stateObservable", "getStateObservable", "stateSubject", "approveRequest", "", "requestId", "result", "", "approveSession", "clear", "connect", "uri", "didKillSession", "didRequestSendEthTransaction", "id", "transaction", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;", "didRequestSession", "chainId", "", "(Ljava/lang/String;Lcom/trustwallet/walletconnect/models/WCPeerMeta;Ljava/lang/Integer;)V", "didUpdateState", "handleRequest", "requestResolver", "Lkotlin/Function0;", "initSession", "peerId", "peerMeta", "killSession", "processNextRequest", "rejectRequest", "rejectSession", "restoreSession", "session", "Lio/horizontalsystems/bankwallet/entities/WalletConnectSession;", "SessionData", "SessionError", "State", "app_debug"})
public final class WalletConnectService implements io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.Delegate, io.horizontalsystems.bankwallet.core.Clearable {
    private io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor interactor;
    private final java.util.LinkedHashMap<java.lang.Long, io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectRequest> pendingRequests = null;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private boolean requestIsProcessing = false;
    private io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.SessionData sessionData;
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.State> stateSubject = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.State state;
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.State> connectionStateSubject = null;
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectRequest> requestSubject = null;
    private final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectManager manager = null;
    private final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectSessionManager sessionManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.ConnectivityManager connectivityManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.trustwallet.walletconnect.models.WCPeerMeta getRemotePeerMeta() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.ethereumkit.core.EthereumKit getEvmKit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.State> getStateObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.State getState() {
        return null;
    }
    
    private final void setState(io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.State value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.State> getConnectionStateObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.State getConnectionState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectRequest> getRequestObservable() {
        return null;
    }
    
    private final void restoreSession(io.horizontalsystems.bankwallet.entities.WalletConnectSession session) {
    }
    
    private final void initSession(java.lang.String peerId, com.trustwallet.walletconnect.models.WCPeerMeta peerMeta, int chainId) {
    }
    
    public final void connect(@org.jetbrains.annotations.NotNull()
    java.lang.String uri) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public final void approveSession() {
    }
    
    public final void rejectSession() {
    }
    
    public final void killSession() {
    }
    
    public final void approveRequest(long requestId, @org.jetbrains.annotations.NotNull()
    java.lang.Object result) {
    }
    
    public final void rejectRequest(long requestId) {
    }
    
    @java.lang.Override()
    public void didUpdateState(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.State state) {
    }
    
    @java.lang.Override()
    public void didKillSession() {
    }
    
    @java.lang.Override()
    public void didRequestSession(@org.jetbrains.annotations.NotNull()
    java.lang.String remotePeerId, @org.jetbrains.annotations.NotNull()
    com.trustwallet.walletconnect.models.WCPeerMeta remotePeerMeta, @org.jetbrains.annotations.Nullable()
    java.lang.Integer chainId) {
    }
    
    @java.lang.Override()
    public void didRequestSendEthTransaction(long id, @org.jetbrains.annotations.NotNull()
    com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction transaction) {
    }
    
    private final void handleRequest(long id, kotlin.jvm.functions.Function0<? extends io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectRequest> requestResolver) {
    }
    
    private final synchronized void processNextRequest() {
    }
    
    public WalletConnectService(@org.jetbrains.annotations.Nullable()
    java.lang.String remotePeerId, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectManager manager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectSessionManager sessionManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.ConnectivityManager connectivityManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State;", "", "()V", "Idle", "Invalid", "Killed", "Ready", "WaitingForApproveSession", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State$Idle;", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State$Invalid;", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State$WaitingForApproveSession;", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State$Ready;", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State$Killed;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State$Idle;", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State;", "()V", "app_debug"})
        public static final class Idle extends io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.State.Idle INSTANCE = null;
            
            private Idle() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State$Invalid;", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "app_debug"})
        public static final class Invalid extends io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.State {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable error = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getError() {
                return null;
            }
            
            public Invalid(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State$WaitingForApproveSession;", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State;", "()V", "app_debug"})
        public static final class WaitingForApproveSession extends io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.State.WaitingForApproveSession INSTANCE = null;
            
            private WaitingForApproveSession() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State$Ready;", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State;", "()V", "app_debug"})
        public static final class Ready extends io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.State.Ready INSTANCE = null;
            
            private Ready() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State$Killed;", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$State;", "()V", "app_debug"})
        public static final class Killed extends io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.State.Killed INSTANCE = null;
            
            private Killed() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$SessionData;", "", "peerId", "", "peerMeta", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "evmKit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "(Ljava/lang/String;Lcom/trustwallet/walletconnect/models/WCPeerMeta;Lio/horizontalsystems/bankwallet/entities/Account;Lio/horizontalsystems/ethereumkit/core/EthereumKit;)V", "getAccount", "()Lio/horizontalsystems/bankwallet/entities/Account;", "getEvmKit", "()Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "getPeerId", "()Ljava/lang/String;", "getPeerMeta", "()Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class SessionData {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String peerId = null;
        @org.jetbrains.annotations.NotNull()
        private final com.trustwallet.walletconnect.models.WCPeerMeta peerMeta = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.entities.Account account = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.ethereumkit.core.EthereumKit evmKit = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPeerId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.trustwallet.walletconnect.models.WCPeerMeta getPeerMeta() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.Account getAccount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.ethereumkit.core.EthereumKit getEvmKit() {
            return null;
        }
        
        public SessionData(@org.jetbrains.annotations.NotNull()
        java.lang.String peerId, @org.jetbrains.annotations.NotNull()
        com.trustwallet.walletconnect.models.WCPeerMeta peerMeta, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Account account, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.ethereumkit.core.EthereumKit evmKit) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.trustwallet.walletconnect.models.WCPeerMeta component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.Account component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.ethereumkit.core.EthereumKit component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.SessionData copy(@org.jetbrains.annotations.NotNull()
        java.lang.String peerId, @org.jetbrains.annotations.NotNull()
        com.trustwallet.walletconnect.models.WCPeerMeta peerMeta, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Account account, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.ethereumkit.core.EthereumKit evmKit) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$SessionError;", "", "()V", "NoSuitableAccount", "UnsupportedChainId", "app_debug"})
    public static class SessionError extends java.lang.Throwable {
        
        public SessionError() {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$SessionError$UnsupportedChainId;", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$SessionError;", "()V", "app_debug"})
        public static final class UnsupportedChainId extends io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.SessionError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.SessionError.UnsupportedChainId INSTANCE = null;
            
            private UnsupportedChainId() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$SessionError$NoSuitableAccount;", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService$SessionError;", "()V", "app_debug"})
        public static final class NoSuitableAccount extends io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.SessionError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService.SessionError.NoSuitableAccount INSTANCE = null;
            
            private NoSuitableAccount() {
                super();
            }
        }
    }
}