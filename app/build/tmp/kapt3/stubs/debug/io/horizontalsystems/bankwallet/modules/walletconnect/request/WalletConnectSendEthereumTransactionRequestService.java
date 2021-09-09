package io.horizontalsystems.bankwallet.modules.walletconnect.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/request/WalletConnectSendEthereumTransactionRequestService;", "", "request", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSendEthereumTransactionRequest;", "baseService", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService;", "(Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSendEthereumTransactionRequest;Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService;)V", "gasPrice", "", "getGasPrice", "()Ljava/lang/Long;", "Ljava/lang/Long;", "transaction", "Lio/horizontalsystems/bankwallet/modules/walletconnect/request/WalletConnectTransaction;", "transactionData", "Lio/horizontalsystems/ethereumkit/models/TransactionData;", "getTransactionData", "()Lio/horizontalsystems/ethereumkit/models/TransactionData;", "approve", "", "transactionHash", "", "reject", "app_debug"})
public final class WalletConnectSendEthereumTransactionRequestService {
    private final io.horizontalsystems.bankwallet.modules.walletconnect.request.WalletConnectTransaction transaction = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.ethereumkit.models.TransactionData transactionData = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long gasPrice = null;
    private final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectSendEthereumTransactionRequest request = null;
    private final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService baseService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.ethereumkit.models.TransactionData getTransactionData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getGasPrice() {
        return null;
    }
    
    public final void approve(@org.jetbrains.annotations.NotNull()
    byte[] transactionHash) {
    }
    
    public final void reject() {
    }
    
    public WalletConnectSendEthereumTransactionRequestService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectSendEthereumTransactionRequest request, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService baseService) {
        super();
    }
}