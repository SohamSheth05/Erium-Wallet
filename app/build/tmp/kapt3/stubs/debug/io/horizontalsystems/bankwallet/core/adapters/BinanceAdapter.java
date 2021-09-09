package io.horizontalsystems.bankwallet.core.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 N2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001NB\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0014\u00107\u001a\u000608j\u0002`92\u0006\u0010:\u001a\u00020;H\u0002J&\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000=2\b\u0010>\u001a\u0004\u0018\u0001012\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020\u001bH\u0016J0\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001b0=2\u0006\u0010C\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\t2\b\u0010E\u001a\u0004\u0018\u00010\t2\u0006\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u00020\u001bH\u0016J\b\u0010I\u001a\u00020\u001bH\u0016J\u0010\u0010J\u001a\u0002012\u0006\u0010K\u001a\u00020LH\u0002J\u0010\u0010M\u001a\u00020\u001b2\u0006\u0010D\u001a\u00020\tH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0010R\u0016\u0010%\u001a\u0004\u0018\u00010&8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u001dR\u0014\u0010+\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010\"R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u0018R \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u0010\u001dR\u0014\u00103\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b4\u0010\u0018R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b6\u0010\u001d\u00a8\u0006O"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/BinanceAdapter;", "Lio/horizontalsystems/bankwallet/core/IAdapter;", "Lio/horizontalsystems/bankwallet/core/ITransactionsAdapter;", "Lio/horizontalsystems/bankwallet/core/IBalanceAdapter;", "Lio/horizontalsystems/bankwallet/core/IReceiveAdapter;", "Lio/horizontalsystems/bankwallet/core/ISendBinanceAdapter;", "binanceKit", "Lio/horizontalsystems/binancechainkit/BinanceChainKit;", "symbol", "", "(Lio/horizontalsystems/binancechainkit/BinanceChainKit;Ljava/lang/String;)V", "asset", "Lio/horizontalsystems/binancechainkit/core/Asset;", "availableBalance", "Ljava/math/BigDecimal;", "getAvailableBalance", "()Ljava/math/BigDecimal;", "availableBinanceBalance", "getAvailableBinanceBalance", "balance", "getBalance", "balanceState", "Lio/horizontalsystems/bankwallet/core/AdapterState;", "getBalanceState", "()Lio/horizontalsystems/bankwallet/core/AdapterState;", "balanceStateUpdatedFlowable", "Lio/reactivex/Flowable;", "", "getBalanceStateUpdatedFlowable", "()Lio/reactivex/Flowable;", "balanceUpdatedFlowable", "getBalanceUpdatedFlowable", "debugInfo", "getDebugInfo", "()Ljava/lang/String;", "fee", "getFee", "lastBlockInfo", "Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "getLastBlockInfo", "()Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "lastBlockUpdatedFlowable", "getLastBlockUpdatedFlowable", "receiveAddress", "getReceiveAddress", "syncState", "getSyncState", "transactionRecordsFlowable", "", "Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "getTransactionRecordsFlowable", "transactionsState", "getTransactionsState", "transactionsStateUpdatedFlowable", "getTransactionsStateUpdatedFlowable", "getException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "", "getTransactions", "Lio/reactivex/Single;", "from", "limit", "", "refresh", "send", "amount", "address", "memo", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "start", "stop", "transactionRecord", "transaction", "Lio/horizontalsystems/binancechainkit/models/TransactionInfo;", "validate", "Companion", "app_debug"})
public final class BinanceAdapter implements io.horizontalsystems.bankwallet.core.IAdapter, io.horizontalsystems.bankwallet.core.ITransactionsAdapter, io.horizontalsystems.bankwallet.core.IBalanceAdapter, io.horizontalsystems.bankwallet.core.IReceiveAdapter, io.horizontalsystems.bankwallet.core.ISendBinanceAdapter {
    private final io.horizontalsystems.binancechainkit.core.Asset asset = null;
    private final io.horizontalsystems.binancechainkit.BinanceChainKit binanceKit = null;
    private final java.lang.String symbol = null;
    private static final int confirmationsThreshold = 1;
    private static final java.math.BigDecimal transferFee = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.adapters.BinanceAdapter.Companion Companion = null;
    
    private final io.horizontalsystems.bankwallet.core.AdapterState getSyncState() {
        return null;
    }
    
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
    public java.lang.String getDebugInfo() {
        return null;
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
    public java.math.BigDecimal getBalance() {
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
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.LastBlockInfo getLastBlockInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getLastBlockUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord>> getTransactionRecordsFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord>> getTransactions(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.TransactionRecord from, int limit) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.entities.TransactionRecord transactionRecord(io.horizontalsystems.binancechainkit.models.TransactionInfo transaction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getAvailableBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getAvailableBinanceBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getFee() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.String memo, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AppLogger logger) {
        return null;
    }
    
    private final java.lang.Exception getException(java.lang.Throwable error) {
        return null;
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getReceiveAddress() {
        return null;
    }
    
    public BinanceAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.binancechainkit.BinanceChainKit binanceKit, @org.jetbrains.annotations.NotNull()
    java.lang.String symbol) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getRawTransaction(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.math.BigDecimal getBalanceLocked() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/BinanceAdapter$Companion;", "", "()V", "confirmationsThreshold", "", "transferFee", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "getTransferFee", "()Ljava/math/BigDecimal;", "clear", "", "walletId", "", "testMode", "", "app_debug"})
    public static final class Companion {
        
        public final java.math.BigDecimal getTransferFee() {
            return null;
        }
        
        public final void clear(@org.jetbrains.annotations.NotNull()
        java.lang.String walletId, boolean testMode) {
        }
        
        private Companion() {
            super();
        }
    }
}