package io.horizontalsystems.bankwallet.core.adapters.zcash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010*\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020\tH\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010 \u001a\u00020!\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010&\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0014\u00a8\u0006-"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/zcash/ZcashTransaction;", "", "confirmedTransaction", "Lcash/z/ecc/android/sdk/db/entity/ConfirmedTransaction;", "(Lcash/z/ecc/android/sdk/db/entity/ConfirmedTransaction;)V", "pendingTransaction", "Lcash/z/ecc/android/sdk/db/entity/PendingTransaction;", "(Lcash/z/ecc/android/sdk/db/entity/PendingTransaction;)V", "expiryHeight", "", "getExpiryHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "failed", "", "getFailed", "()Z", "id", "", "getId", "()J", "memo", "", "getMemo", "()Ljava/lang/String;", "minedHeight", "getMinedHeight", "()I", "timestamp", "getTimestamp", "toAddress", "getToAddress", "transactionHash", "", "getTransactionHash", "()[B", "transactionIndex", "getTransactionIndex", "value", "getValue", "compareTo", "other", "equals", "", "hashCode", "app_debug"})
public final class ZcashTransaction implements java.lang.Comparable<io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashTransaction> {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final byte[] transactionHash = null;
    private final int transactionIndex = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String toAddress = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer expiryHeight = null;
    private final int minedHeight = 0;
    private final long timestamp = 0L;
    private final long value = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String memo = null;
    private final boolean failed = false;
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getTransactionHash() {
        return null;
    }
    
    public final int getTransactionIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getExpiryHeight() {
        return null;
    }
    
    public final int getMinedHeight() {
        return 0;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    public final long getValue() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMemo() {
        return null;
    }
    
    public final boolean getFailed() {
        return false;
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
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashTransaction other) {
        return 0;
    }
    
    public ZcashTransaction(@org.jetbrains.annotations.NotNull()
    cash.z.ecc.android.sdk.db.entity.ConfirmedTransaction confirmedTransaction) {
        super();
    }
    
    public ZcashTransaction(@org.jetbrains.annotations.NotNull()
    cash.z.ecc.android.sdk.db.entity.PendingTransaction pendingTransaction) {
        super();
    }
}