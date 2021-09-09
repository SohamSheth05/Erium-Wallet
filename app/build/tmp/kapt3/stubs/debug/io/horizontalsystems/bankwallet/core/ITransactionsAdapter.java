package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001b\u001a\u00020\u001cH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0012\u0010\u000f\u001a\u00020\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ITransactionsAdapter;", "", "lastBlockInfo", "Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "getLastBlockInfo", "()Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "lastBlockUpdatedFlowable", "Lio/reactivex/Flowable;", "", "getLastBlockUpdatedFlowable", "()Lio/reactivex/Flowable;", "transactionRecordsFlowable", "", "Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "getTransactionRecordsFlowable", "transactionsState", "Lio/horizontalsystems/bankwallet/core/AdapterState;", "getTransactionsState", "()Lio/horizontalsystems/bankwallet/core/AdapterState;", "transactionsStateUpdatedFlowable", "getTransactionsStateUpdatedFlowable", "getRawTransaction", "", "transactionHash", "getTransactions", "Lio/reactivex/Single;", "from", "limit", "", "app_debug"})
public abstract interface ITransactionsAdapter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bankwallet.core.AdapterState getTransactionsState();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<kotlin.Unit> getTransactionsStateUpdatedFlowable();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.entities.LastBlockInfo getLastBlockInfo();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<kotlin.Unit> getLastBlockUpdatedFlowable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord>> getTransactions(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.TransactionRecord from, int limit);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getRawTransaction(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord>> getTransactionRecordsFlowable();
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable()
        public static java.lang.String getRawTransaction(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.ITransactionsAdapter $this, @org.jetbrains.annotations.NotNull()
        java.lang.String transactionHash) {
            return null;
        }
    }
}