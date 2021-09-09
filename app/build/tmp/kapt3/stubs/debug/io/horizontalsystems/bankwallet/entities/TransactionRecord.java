package io.horizontalsystems.bankwallet.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b3\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u00a5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u001aJ\u0011\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0000H\u0096\u0002J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0013H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\t\u0010=\u001a\u00020\u0017H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0017H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0006H\u00c6\u0003J\t\u0010B\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\t\u0010D\u001a\u00020\u0006H\u00c6\u0003J\t\u0010E\u001a\u00020\fH\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\t\u0010G\u001a\u00020\tH\u00c6\u0003J\u00c6\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0017H\u00c6\u0001\u00a2\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020\u00172\b\u00106\u001a\u0004\u0018\u00010KH\u0096\u0002J\b\u0010L\u001a\u00020\u0006H\u0016J\u0017\u0010M\u001a\u0004\u0018\u00010N2\b\u0010O\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010PJ\u0015\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010TJ\t\u0010U\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010#R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0011\u0010\u0019\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0011\u0010\u000e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010#\u00a8\u0006V"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "", "uid", "", "transactionHash", "transactionIndex", "", "interTransactionIndex", "blockHeight", "", "confirmationsThreshold", "amount", "Ljava/math/BigDecimal;", "fee", "timestamp", "from", "memo", "to", "type", "Lio/horizontalsystems/bankwallet/entities/TransactionType;", "lockInfo", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionLockInfo;", "failed", "", "conflictingTxHash", "showRawTransaction", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Long;ILjava/math/BigDecimal;Ljava/math/BigDecimal;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/horizontalsystems/bankwallet/entities/TransactionType;Lio/horizontalsystems/bankwallet/modules/transactions/TransactionLockInfo;ZLjava/lang/String;Z)V", "getAmount", "()Ljava/math/BigDecimal;", "getBlockHeight", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getConfirmationsThreshold", "()I", "getConflictingTxHash", "()Ljava/lang/String;", "getFailed", "()Z", "getFee", "getFrom", "getInterTransactionIndex", "getLockInfo", "()Lio/horizontalsystems/bankwallet/modules/transactions/TransactionLockInfo;", "getMemo", "getShowRawTransaction", "getTimestamp", "()J", "getTo", "getTransactionHash", "getTransactionIndex", "getType", "()Lio/horizontalsystems/bankwallet/entities/TransactionType;", "getUid", "compareTo", "other", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Long;ILjava/math/BigDecimal;Ljava/math/BigDecimal;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/horizontalsystems/bankwallet/entities/TransactionType;Lio/horizontalsystems/bankwallet/modules/transactions/TransactionLockInfo;ZLjava/lang/String;Z)Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "equals", "", "hashCode", "lockState", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionLockState;", "lastBlockTimestamp", "(Ljava/lang/Long;)Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionLockState;", "status", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionStatus;", "lastBlockHeight", "(Ljava/lang/Integer;)Lio/horizontalsystems/bankwallet/modules/transactions/TransactionStatus;", "toString", "app_debug"})
public final class TransactionRecord implements java.lang.Comparable<io.horizontalsystems.bankwallet.entities.TransactionRecord> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String uid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String transactionHash = null;
    private final int transactionIndex = 0;
    private final int interTransactionIndex = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long blockHeight = null;
    private final int confirmationsThreshold = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal amount = null;
    @org.jetbrains.annotations.Nullable()
    private final java.math.BigDecimal fee = null;
    private final long timestamp = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String from = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String memo = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String to = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.entities.TransactionType type = null;
    @org.jetbrains.annotations.Nullable()
    private final io.horizontalsystems.bankwallet.modules.transactions.TransactionLockInfo lockInfo = null;
    private final boolean failed = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String conflictingTxHash = null;
    private final boolean showRawTransaction = false;
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionRecord other) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.transactions.TransactionStatus status(@org.jetbrains.annotations.Nullable()
    java.lang.Integer lastBlockHeight) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionLockState lockState(@org.jetbrains.annotations.Nullable()
    java.lang.Long lastBlockTimestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransactionHash() {
        return null;
    }
    
    public final int getTransactionIndex() {
        return 0;
    }
    
    public final int getInterTransactionIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getBlockHeight() {
        return null;
    }
    
    public final int getConfirmationsThreshold() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal getFee() {
        return null;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFrom() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMemo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.TransactionType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.transactions.TransactionLockInfo getLockInfo() {
        return null;
    }
    
    public final boolean getFailed() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getConflictingTxHash() {
        return null;
    }
    
    public final boolean getShowRawTransaction() {
        return false;
    }
    
    public TransactionRecord(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash, int transactionIndex, int interTransactionIndex, @org.jetbrains.annotations.Nullable()
    java.lang.Long blockHeight, int confirmationsThreshold, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal fee, long timestamp, @org.jetbrains.annotations.Nullable()
    java.lang.String from, @org.jetbrains.annotations.Nullable()
    java.lang.String memo, @org.jetbrains.annotations.Nullable()
    java.lang.String to, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionType type, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionLockInfo lockInfo, boolean failed, @org.jetbrains.annotations.Nullable()
    java.lang.String conflictingTxHash, boolean showRawTransaction) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal component8() {
        return null;
    }
    
    public final long component9() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.TransactionType component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.transactions.TransactionLockInfo component14() {
        return null;
    }
    
    public final boolean component15() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    public final boolean component17() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.TransactionRecord copy(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash, int transactionIndex, int interTransactionIndex, @org.jetbrains.annotations.Nullable()
    java.lang.Long blockHeight, int confirmationsThreshold, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal fee, long timestamp, @org.jetbrains.annotations.Nullable()
    java.lang.String from, @org.jetbrains.annotations.Nullable()
    java.lang.String memo, @org.jetbrains.annotations.Nullable()
    java.lang.String to, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionType type, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionLockInfo lockInfo, boolean failed, @org.jetbrains.annotations.Nullable()
    java.lang.String conflictingTxHash, boolean showRawTransaction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}