package io.horizontalsystems.bankwallet.modules.transactions.transactionInfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\f\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem;", "", "()V", "DoubleSpend", "Fee", "From", "Id", "LockInfo", "Memo", "Rate", "RawTransaction", "Recipient", "SentToSelf", "Status", "To", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Rate;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Fee;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$From;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Memo;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$To;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Recipient;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Id;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Status;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$DoubleSpend;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$SentToSelf;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$RawTransaction;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$LockInfo;", "app_debug"})
public abstract class TransactionDetailViewItem {
    
    private TransactionDetailViewItem() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Rate;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem;", "currencyValue", "Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "coinCode", "", "(Lio/horizontalsystems/bankwallet/entities/CurrencyValue;Ljava/lang/String;)V", "getCoinCode", "()Ljava/lang/String;", "getCurrencyValue", "()Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "app_debug"})
    public static final class Rate extends io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.entities.CurrencyValue currencyValue = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String coinCode = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.CurrencyValue getCurrencyValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCoinCode() {
            return null;
        }
        
        public Rate(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.CurrencyValue currencyValue, @org.jetbrains.annotations.NotNull()
        java.lang.String coinCode) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Fee;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem;", "coinValue", "Lio/horizontalsystems/bankwallet/entities/CoinValue;", "currencyValue", "Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "(Lio/horizontalsystems/bankwallet/entities/CoinValue;Lio/horizontalsystems/bankwallet/entities/CurrencyValue;)V", "getCoinValue", "()Lio/horizontalsystems/bankwallet/entities/CoinValue;", "getCurrencyValue", "()Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "app_debug"})
    public static final class Fee extends io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.entities.CoinValue coinValue = null;
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.bankwallet.entities.CurrencyValue currencyValue = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.CoinValue getCoinValue() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.entities.CurrencyValue getCurrencyValue() {
            return null;
        }
        
        public Fee(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.CoinValue coinValue, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.entities.CurrencyValue currencyValue) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$From;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem;", "from", "", "(Ljava/lang/String;)V", "getFrom", "()Ljava/lang/String;", "app_debug"})
    public static final class From extends io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String from = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFrom() {
            return null;
        }
        
        public From(@org.jetbrains.annotations.NotNull()
        java.lang.String from) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Memo;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem;", "memo", "", "(Ljava/lang/String;)V", "getMemo", "()Ljava/lang/String;", "app_debug"})
    public static final class Memo extends io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String memo = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMemo() {
            return null;
        }
        
        public Memo(@org.jetbrains.annotations.NotNull()
        java.lang.String memo) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$To;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem;", "to", "", "(Ljava/lang/String;)V", "getTo", "()Ljava/lang/String;", "app_debug"})
    public static final class To extends io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String to = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTo() {
            return null;
        }
        
        public To(@org.jetbrains.annotations.NotNull()
        java.lang.String to) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Recipient;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem;", "recipient", "", "(Ljava/lang/String;)V", "getRecipient", "()Ljava/lang/String;", "app_debug"})
    public static final class Recipient extends io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String recipient = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRecipient() {
            return null;
        }
        
        public Recipient(@org.jetbrains.annotations.NotNull()
        java.lang.String recipient) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Id;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem;", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "app_debug"})
    public static final class Id extends io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        public Id(@org.jetbrains.annotations.NotNull()
        java.lang.String id) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Status;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem;", "status", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionStatus;", "incoming", "", "(Lio/horizontalsystems/bankwallet/modules/transactions/TransactionStatus;Z)V", "getIncoming", "()Z", "getStatus", "()Lio/horizontalsystems/bankwallet/modules/transactions/TransactionStatus;", "app_debug"})
    public static final class Status extends io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.modules.transactions.TransactionStatus status = null;
        private final boolean incoming = false;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.transactions.TransactionStatus getStatus() {
            return null;
        }
        
        public final boolean getIncoming() {
            return false;
        }
        
        public Status(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.transactions.TransactionStatus status, boolean incoming) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$DoubleSpend;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem;", "()V", "app_debug"})
    public static final class DoubleSpend extends io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem {
        
        public DoubleSpend() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$SentToSelf;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem;", "()V", "app_debug"})
    public static final class SentToSelf extends io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem {
        
        public SentToSelf() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$RawTransaction;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem;", "()V", "app_debug"})
    public static final class RawTransaction extends io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem {
        
        public RawTransaction() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$LockInfo;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem;", "lockState", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionLockState;", "(Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionLockState;)V", "getLockState", "()Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionLockState;", "app_debug"})
    public static final class LockInfo extends io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionLockState lockState = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionLockState getLockState() {
            return null;
        }
        
        public LockInfo(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionLockState lockState) {
            super();
        }
    }
}