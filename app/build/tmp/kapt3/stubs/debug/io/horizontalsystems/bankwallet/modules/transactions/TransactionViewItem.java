package io.horizontalsystems.bankwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u001f\u0010*\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,\u00a2\u0006\u0002\u0010.J\u0006\u0010/\u001a\u000200J\u0011\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0000H\u0096\u0002J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u00108\u001a\u00020\u000bH\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010:\u001a\u00020\u000fH\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\t\u0010<\u001a\u00020\u0013H\u00c6\u0003J\u000e\u0010=\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u0000Ji\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u00c6\u0001J\u0013\u0010?\u001a\u00020\u00132\b\u00103\u001a\u0004\u0018\u00010@H\u0096\u0002J\b\u0010A\u001a\u000202H\u0016J\u000e\u0010B\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u0000J\t\u0010C\u001a\u00020DH\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)\u00a8\u0006E"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionViewItem;", "", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "record", "Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "coinValue", "Lio/horizontalsystems/bankwallet/entities/CoinValue;", "currencyValue", "Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "type", "Lio/horizontalsystems/bankwallet/entities/TransactionType;", "date", "Ljava/util/Date;", "status", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionStatus;", "lockState", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionLockState;", "doubleSpend", "", "(Lio/horizontalsystems/bankwallet/entities/Wallet;Lio/horizontalsystems/bankwallet/entities/TransactionRecord;Lio/horizontalsystems/bankwallet/entities/CoinValue;Lio/horizontalsystems/bankwallet/entities/CurrencyValue;Lio/horizontalsystems/bankwallet/entities/TransactionType;Ljava/util/Date;Lio/horizontalsystems/bankwallet/modules/transactions/TransactionStatus;Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionLockState;Z)V", "getCoinValue", "()Lio/horizontalsystems/bankwallet/entities/CoinValue;", "getCurrencyValue", "()Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "setCurrencyValue", "(Lio/horizontalsystems/bankwallet/entities/CurrencyValue;)V", "getDate", "()Ljava/util/Date;", "getDoubleSpend", "()Z", "isPending", "getLockState", "()Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionLockState;", "getRecord", "()Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "getStatus", "()Lio/horizontalsystems/bankwallet/modules/transactions/TransactionStatus;", "getType", "()Lio/horizontalsystems/bankwallet/entities/TransactionType;", "getWallet", "()Lio/horizontalsystems/bankwallet/entities/Wallet;", "becomesUnlocked", "oldBlockTimestamp", "", "lastBlockTimestamp", "(Ljava/lang/Long;Ljava/lang/Long;)Z", "clearRates", "", "compareTo", "", "other", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "contentTheSame", "copy", "equals", "", "hashCode", "itemTheSame", "toString", "", "app_debug"})
public final class TransactionViewItem implements java.lang.Comparable<io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem> {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.entities.Wallet wallet = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.entities.TransactionRecord record = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.entities.CoinValue coinValue = null;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.entities.CurrencyValue currencyValue;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.entities.TransactionType type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date date = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.transactions.TransactionStatus status = null;
    @org.jetbrains.annotations.Nullable()
    private final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionLockState lockState = null;
    private final boolean doubleSpend = false;
    
    public final boolean isPending() {
        return false;
    }
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem other) {
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
    
    public final boolean itemTheSame(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem other) {
        return false;
    }
    
    public final boolean contentTheSame(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem other) {
        return false;
    }
    
    public final void clearRates() {
    }
    
    public final boolean becomesUnlocked(@org.jetbrains.annotations.Nullable()
    java.lang.Long oldBlockTimestamp, @org.jetbrains.annotations.Nullable()
    java.lang.Long lastBlockTimestamp) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.Wallet getWallet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.TransactionRecord getRecord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.CoinValue getCoinValue() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue getCurrencyValue() {
        return null;
    }
    
    public final void setCurrencyValue(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.CurrencyValue p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.TransactionType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.transactions.TransactionStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionLockState getLockState() {
        return null;
    }
    
    public final boolean getDoubleSpend() {
        return false;
    }
    
    public TransactionViewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionRecord record, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CoinValue coinValue, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.CurrencyValue currencyValue, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionType type, @org.jetbrains.annotations.Nullable()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionStatus status, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionLockState lockState, boolean doubleSpend) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.Wallet component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.TransactionRecord component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.CoinValue component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.TransactionType component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.transactions.TransactionStatus component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionLockState component8() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem copy(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionRecord record, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CoinValue coinValue, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.CurrencyValue currencyValue, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionType type, @org.jetbrains.annotations.Nullable()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionStatus status, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionLockState lockState, boolean doubleSpend) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}