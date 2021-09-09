package io.horizontalsystems.bankwallet.core.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 A2\u00020\u0001:\u0001AB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020\n2\u0006\u0010\'\u001a\u00020(H\u0002J/\u0010)\u001a\b\u0012\u0004\u0012\u00020$0*2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014\u00a2\u0006\u0002\u0010/J\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u00020.2\u0006\u00103\u001a\u00020,H\u0016J&\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0*2\b\u00105\u001a\u0004\u0018\u00010\u001c2\u0006\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u00020\u000fH\u0016J6\u00109\u001a\b\u0012\u0004\u0012\u00020\u000f0*2\u0006\u00103\u001a\u00020,2\u0006\u00102\u001a\u00020.2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010:\u001a\u00020;H\u0014J\b\u0010<\u001a\u00020\u000fH\u0016J\b\u0010=\u001a\u00020\u000fH\u0016J\u0010\u0010>\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020@H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\bR\u0014\u0010\u0018\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\bR \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0011\u00a8\u0006B"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/EvmAdapter;", "Lio/horizontalsystems/bankwallet/core/adapters/BaseEvmAdapter;", "kit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "(Lio/horizontalsystems/ethereumkit/core/EthereumKit;)V", "balance", "Ljava/math/BigDecimal;", "getBalance", "()Ljava/math/BigDecimal;", "balanceState", "Lio/horizontalsystems/bankwallet/core/AdapterState;", "getBalanceState", "()Lio/horizontalsystems/bankwallet/core/AdapterState;", "balanceStateUpdatedFlowable", "Lio/reactivex/Flowable;", "", "getBalanceStateUpdatedFlowable", "()Lio/reactivex/Flowable;", "balanceUpdatedFlowable", "getBalanceUpdatedFlowable", "ethereumBalance", "getEthereumBalance", "minimumRequiredBalance", "getMinimumRequiredBalance", "minimumSendAmount", "getMinimumSendAmount", "transactionRecordsFlowable", "", "Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "getTransactionRecordsFlowable", "transactionsState", "getTransactionsState", "transactionsStateUpdatedFlowable", "getTransactionsStateUpdatedFlowable", "availableBalance", "gasPrice", "", "gasLimit", "convertToAdapterState", "syncState", "Lio/horizontalsystems/ethereumkit/core/EthereumKit$SyncState;", "estimateGasLimitInternal", "Lio/reactivex/Single;", "toAddress", "Lio/horizontalsystems/ethereumkit/models/Address;", "value", "Ljava/math/BigInteger;", "(Lio/horizontalsystems/ethereumkit/models/Address;Ljava/math/BigInteger;Ljava/lang/Long;)Lio/reactivex/Single;", "getTransactionData", "Lio/horizontalsystems/ethereumkit/models/TransactionData;", "amount", "address", "getTransactions", "from", "limit", "", "refresh", "sendInternal", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "start", "stop", "transactionRecord", "fullTransaction", "Lio/horizontalsystems/ethereumkit/models/FullTransaction;", "Companion", "app_debug"})
public final class EvmAdapter extends io.horizontalsystems.bankwallet.core.adapters.BaseEvmAdapter {
    public static final int decimal = 18;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.adapters.EvmAdapter.Companion Companion = null;
    
    @java.lang.Override()
    public void start() {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.core.AdapterState getBalanceState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getBalanceStateUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected io.reactivex.Single<kotlin.Unit> sendInternal(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.models.Address address, @org.jetbrains.annotations.NotNull()
    java.math.BigInteger amount, long gasPrice, long gasLimit, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AppLogger logger) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected io.reactivex.Single<java.lang.Long> estimateGasLimitInternal(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.ethereumkit.models.Address toAddress, @org.jetbrains.annotations.NotNull()
    java.math.BigInteger value, @org.jetbrains.annotations.Nullable()
    java.lang.Long gasPrice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getMinimumRequiredBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getMinimumSendAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getBalanceUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.core.AdapterState getTransactionsState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getTransactionsStateUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord>> getTransactions(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.TransactionRecord from, int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord>> getTransactionRecordsFlowable() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.core.AdapterState convertToAdapterState(io.horizontalsystems.ethereumkit.core.EthereumKit.SyncState syncState) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.entities.TransactionRecord transactionRecord(io.horizontalsystems.ethereumkit.models.FullTransaction fullTransaction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getEthereumBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal availableBalance(long gasPrice, long gasLimit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.ethereumkit.models.TransactionData getTransactionData(@org.jetbrains.annotations.NotNull()
    java.math.BigInteger amount, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.models.Address address) {
        return null;
    }
    
    public EvmAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.core.EthereumKit kit) {
        super(null, 0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/EvmAdapter$Companion;", "", "()V", "decimal", "", "clear", "", "walletId", "", "testMode", "", "app_debug"})
    public static final class Companion {
        
        public final void clear(@org.jetbrains.annotations.NotNull()
        java.lang.String walletId, boolean testMode) {
        }
        
        private Companion() {
            super();
        }
    }
}