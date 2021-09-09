package io.horizontalsystems.bankwallet.modules.walletconnect;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSendEthereumTransactionRequest;", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectRequest;", "id", "", "transaction", "Lcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;", "(JLcom/trustwallet/walletconnect/models/ethereum/WCEthereumTransaction;)V", "Lio/horizontalsystems/bankwallet/modules/walletconnect/request/WalletConnectTransaction;", "(JLio/horizontalsystems/bankwallet/modules/walletconnect/request/WalletConnectTransaction;)V", "getId", "()J", "getTransaction", "()Lio/horizontalsystems/bankwallet/modules/walletconnect/request/WalletConnectTransaction;", "convertResult", "", "result", "", "TransactionError", "app_debug"})
public final class WalletConnectSendEthereumTransactionRequest implements io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectRequest {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.walletconnect.request.WalletConnectTransaction transaction = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String convertResult(@org.jetbrains.annotations.NotNull()
    java.lang.Object result) {
        return null;
    }
    
    @java.lang.Override()
    public long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.walletconnect.request.WalletConnectTransaction getTransaction() {
        return null;
    }
    
    public WalletConnectSendEthereumTransactionRequest(long id, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.walletconnect.request.WalletConnectTransaction transaction) {
        super();
    }
    
    public WalletConnectSendEthereumTransactionRequest(long id, @org.jetbrains.annotations.NotNull()
    com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction transaction) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0001\u0005\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSendEthereumTransactionRequest$TransactionError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "NoRecipient", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSendEthereumTransactionRequest$TransactionError$NoRecipient;", "app_debug"})
    public static abstract class TransactionError extends java.lang.Exception {
        
        private TransactionError() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSendEthereumTransactionRequest$TransactionError$NoRecipient;", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSendEthereumTransactionRequest$TransactionError;", "()V", "app_debug"})
        public static final class NoRecipient extends io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectSendEthereumTransactionRequest.TransactionError {
            
            public NoRecipient() {
                super();
            }
        }
    }
}