package io.horizontalsystems.bankwallet.modules.walletconnect;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService;", "clearables", "", "Lio/horizontalsystems/bankwallet/core/Clearable;", "(Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService;Ljava/util/List;)V", "initialScreen", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectViewModel$InitialScreen;", "getInitialScreen", "()Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectViewModel$InitialScreen;", "getService", "()Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService;", "sharedSendEthereumTransactionRequest", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSendEthereumTransactionRequest;", "getSharedSendEthereumTransactionRequest", "()Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSendEthereumTransactionRequest;", "setSharedSendEthereumTransactionRequest", "(Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSendEthereumTransactionRequest;)V", "onCleared", "", "InitialScreen", "app_debug"})
public final class WalletConnectViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectSendEthereumTransactionRequest sharedSendEthereumTransactionRequest;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService service = null;
    private final java.util.List<io.horizontalsystems.bankwallet.core.Clearable> clearables = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectSendEthereumTransactionRequest getSharedSendEthereumTransactionRequest() {
        return null;
    }
    
    public final void setSharedSendEthereumTransactionRequest(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectSendEthereumTransactionRequest p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectViewModel.InitialScreen getInitialScreen() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService getService() {
        return null;
    }
    
    public WalletConnectViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService service, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.core.Clearable> clearables) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectViewModel$InitialScreen;", "", "(Ljava/lang/String;I)V", "ScanQrCode", "Main", "app_debug"})
    public static enum InitialScreen {
        /*public static final*/ ScanQrCode /* = new ScanQrCode() */,
        /*public static final*/ Main /* = new Main() */;
        
        InitialScreen() {
        }
    }
}