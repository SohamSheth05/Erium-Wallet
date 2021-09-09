package io.horizontalsystems.bankwallet.modules.transactions.transactionInfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0007\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule;", "", "()V", "init", "", "view", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoViewModel;", "router", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$Router;", "transactionRecord", "Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "ExplorerData", "Interactor", "InteractorDelegate", "Router", "TitleViewItem", "View", "ViewDelegate", "app_debug"})
public final class TransactionInfoModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoViewModel view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.Router router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionRecord transactionRecord, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
    }
    
    private TransactionInfoModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0003H&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$View;", "", "setExplorerButton", "", "explorerName", "", "enabled", "", "share", "value", "showCopied", "showDetails", "items", "", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem;", "showTitle", "titleViewItem", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$TitleViewItem;", "app_debug"})
    public static abstract interface View {
        
        public abstract void showCopied();
        
        public abstract void share(@org.jetbrains.annotations.NotNull()
        java.lang.String value);
        
        public abstract void showTitle(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.TitleViewItem titleViewItem);
        
        public abstract void showDetails(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem> items);
        
        public abstract void setExplorerButton(@org.jetbrains.annotations.NotNull()
        java.lang.String explorerName, boolean enabled);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$ViewDelegate;", "", "onClickDoubleSpendInfo", "", "onClickFrom", "onClickLockInfo", "onClickRecipientHash", "onClickStatusInfo", "onClickTo", "onClickTransactionId", "onRawTransaction", "onShare", "openExplorer", "viewDidLoad", "app_debug"})
    public static abstract interface ViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void onShare();
        
        public abstract void openExplorer();
        
        public abstract void onClickLockInfo();
        
        public abstract void onClickDoubleSpendInfo();
        
        public abstract void onClickRecipientHash();
        
        public abstract void onClickTo();
        
        public abstract void onClickFrom();
        
        public abstract void onClickTransactionId();
        
        public abstract void onRawTransaction();
        
        public abstract void onClickStatusInfo();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH&J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\rH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$Interactor;", "", "lastBlockInfo", "Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "getLastBlockInfo", "()Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "testMode", "", "getTestMode", "()Z", "copyToClipboard", "", "value", "", "feeCoin", "Lio/horizontalsystems/coinkit2/models/Coin;", "coin", "getRate", "Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "timestamp", "", "getRaw", "transactionHash", "app_debug"})
    public static abstract interface Interactor {
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.horizontalsystems.bankwallet.entities.LastBlockInfo getLastBlockInfo();
        
        public abstract boolean getTestMode();
        
        public abstract void copyToClipboard(@org.jetbrains.annotations.NotNull()
        java.lang.String value);
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.horizontalsystems.bankwallet.entities.CurrencyValue getRate(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.CoinType coinType, long timestamp);
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.horizontalsystems.coinkit2.models.Coin feeCoin(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin);
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.String getRaw(@org.jetbrains.annotations.NotNull()
        java.lang.String transactionHash);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$InteractorDelegate;", "", "app_debug"})
    public static abstract interface InteractorDelegate {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$Router;", "", "openDoubleSpendInfo", "", "transactionHash", "", "conflictingTxHash", "openLockInfo", "lockDate", "Ljava/util/Date;", "openStatusInfo", "openUrl", "url", "app_debug"})
    public static abstract interface Router {
        
        public abstract void openLockInfo(@org.jetbrains.annotations.NotNull()
        java.util.Date lockDate);
        
        public abstract void openDoubleSpendInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String transactionHash, @org.jetbrains.annotations.NotNull()
        java.lang.String conflictingTxHash);
        
        public abstract void openStatusInfo();
        
        public abstract void openUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String url);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u00c6\u0003JA\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$TitleViewItem;", "", "date", "Ljava/util/Date;", "primaryAmountInfo", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "secondaryAmountInfo", "type", "Lio/horizontalsystems/bankwallet/entities/TransactionType;", "lockState", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionLockState;", "(Ljava/util/Date;Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;Lio/horizontalsystems/bankwallet/entities/TransactionType;Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionLockState;)V", "getDate", "()Ljava/util/Date;", "getLockState", "()Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionLockState;", "getPrimaryAmountInfo", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "getSecondaryAmountInfo", "getType", "()Lio/horizontalsystems/bankwallet/entities/TransactionType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class TitleViewItem {
        @org.jetbrains.annotations.Nullable()
        private final java.util.Date date = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primaryAmountInfo = null;
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryAmountInfo = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.entities.TransactionType type = null;
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionLockState lockState = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date getDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getPrimaryAmountInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getSecondaryAmountInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.TransactionType getType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionLockState getLockState() {
            return null;
        }
        
        public TitleViewItem(@org.jetbrains.annotations.Nullable()
        java.util.Date date, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primaryAmountInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryAmountInfo, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.TransactionType type, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionLockState lockState) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.TransactionType component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionLockState component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.TitleViewItem copy(@org.jetbrains.annotations.Nullable()
        java.util.Date date, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primaryAmountInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryAmountInfo, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.TransactionType type, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionLockState lockState) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$ExplorerData;", "", "title", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class ExplorerData {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String url = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUrl() {
            return null;
        }
        
        public ExplorerData(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String url) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.ExplorerData copy(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String url) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}