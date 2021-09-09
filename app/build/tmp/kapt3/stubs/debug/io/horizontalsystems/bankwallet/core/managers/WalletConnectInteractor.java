package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0003123B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ!\u0010\u001f\u001a\u00020 \"\u0004\b\u0000\u0010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u0002H!\u00a2\u0006\u0002\u0010%J\u0016\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020 J\u0006\u0010+\u001a\u00020 J\u0006\u0010,\u001a\u00020 J\u0016\u0010-\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010.\u001a\u00020\u0003J\u000e\u0010/\u001a\u00020 2\u0006\u0010.\u001a\u00020\u0003J\u0010\u00100\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u00064"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor;", "", "uri", "", "(Ljava/lang/String;)V", "session", "Lcom/trustwallet/walletconnect/models/session/WCSession;", "peerId", "remotePeerId", "(Lcom/trustwallet/walletconnect/models/session/WCSession;Ljava/lang/String;Ljava/lang/String;)V", "client", "Lcom/trustwallet/walletconnect/WCClient;", "clientMeta", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "delegate", "Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor$Delegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor$Delegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor$Delegate;)V", "getPeerId", "()Ljava/lang/String;", "getSession", "()Lcom/trustwallet/walletconnect/models/session/WCSession;", "value", "Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor$State;", "state", "getState", "()Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor$State;", "setState", "(Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor$State;)V", "approveRequest", "", "T", "id", "", "result", "(JLjava/lang/Object;)V", "approveSession", "address", "chainId", "", "connect", "disconnect", "killSession", "rejectRequest", "message", "rejectSession", "rejectWithNotSupported", "Delegate", "SessionError", "State", "app_debug"})
public final class WalletConnectInteractor {
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.State state = io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.State.Disconnected;
    private final com.trustwallet.walletconnect.models.WCPeerMeta clientMeta = null;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.Delegate delegate;
    private final com.trustwallet.walletconnect.WCClient client = null;
    @org.jetbrains.annotations.NotNull()
    private final com.trustwallet.walletconnect.models.session.WCSession session = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String peerId = null;
    private final java.lang.String remotePeerId = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.State getState() {
        return null;
    }
    
    private final void setState(io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.State value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.Delegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.Delegate p0) {
    }
    
    public final void connect() {
    }
    
    public final void approveSession(@org.jetbrains.annotations.NotNull()
    java.lang.String address, int chainId) {
    }
    
    public final void rejectSession(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void killSession() {
    }
    
    public final void disconnect() {
    }
    
    public final <T extends java.lang.Object>void approveRequest(long id, T result) {
    }
    
    public final void rejectRequest(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final void rejectWithNotSupported(long id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.trustwallet.walletconnect.models.session.WCSession getSession() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPeerId() {
        return null;
    }
    
    public WalletConnectInteractor(@org.jetbrains.annotations.NotNull()
    com.trustwallet.walletconnect.models.session.WCSession session, @org.jetbrains.annotations.NotNull()
    java.lang.String peerId, @org.jetbrains.annotations.Nullable()
    java.lang.String remotePeerId) {
        super();
    }
    
    public WalletConnectInteractor(@org.jetbrains.annotations.NotNull()
    java.lang.String uri) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\'\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor$Delegate;", "", "didKillSession", "", "didRequestSendEthTransaction", "id", "", "transaction", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;", "didRequestSession", "remotePeerId", "", "remotePeerMeta", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "chainId", "", "(Ljava/lang/String;Lcom/trustwallet/walletconnect/models/WCPeerMeta;Ljava/lang/Integer;)V", "didUpdateState", "state", "Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor$State;", "app_debug"})
    public static abstract interface Delegate {
        
        public abstract void didUpdateState(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.State state);
        
        public abstract void didRequestSession(@org.jetbrains.annotations.NotNull()
        java.lang.String remotePeerId, @org.jetbrains.annotations.NotNull()
        com.trustwallet.walletconnect.models.WCPeerMeta remotePeerMeta, @org.jetbrains.annotations.Nullable()
        java.lang.Integer chainId);
        
        public abstract void didKillSession();
        
        public abstract void didRequestSendEthTransaction(long id, @org.jetbrains.annotations.NotNull()
        com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction transaction);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor$State;", "", "(Ljava/lang/String;I)V", "Connecting", "Connected", "Disconnected", "app_debug"})
    public static enum State {
        /*public static final*/ Connecting /* = new Connecting() */,
        /*public static final*/ Connected /* = new Connected() */,
        /*public static final*/ Disconnected /* = new Disconnected() */;
        
        State() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0001\u0005\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor$SessionError;", "Ljava/lang/Error;", "Lkotlin/Error;", "()V", "InvalidUri", "Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor$SessionError$InvalidUri;", "app_debug"})
    public static abstract class SessionError extends java.lang.Error {
        
        private SessionError() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor$SessionError$InvalidUri;", "Lio/horizontalsystems/bankwallet/core/managers/WalletConnectInteractor$SessionError;", "()V", "app_debug"})
        public static final class InvalidUri extends io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.SessionError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.core.managers.WalletConnectInteractor.SessionError.InvalidUri INSTANCE = null;
            
            private InvalidUri() {
                super();
            }
        }
    }
}