package io.horizontalsystems.bankwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0017J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012J \u0010\u001a\u001a\u00020\u00172\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00120\u001cJ\u001c\u0010\u001f\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00122\u0006\u0010 \u001a\u00020\u001dJ\u0016\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012H\u0002J\u0006\u0010#\u001a\u00020\u000eJ\"\u0010$\u001a\u00020\u00172\u001a\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\'0&0\u0012J\u0016\u0010(\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\'J&\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J\u0014\u00103\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012J\u0018\u00104\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001d2\u0006\u00105\u001a\u00020\u001eH\u0002R\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionRecordDataSource;", "", "poolRepo", "Lio/horizontalsystems/bankwallet/modules/transactions/PoolRepo;", "itemsDataSource", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionItemDataSource;", "limit", "", "viewItemFactory", "Lio/horizontalsystems/bankwallet/core/factories/TransactionViewItemFactory;", "metadataDataSource", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionMetadataDataSource;", "(Lio/horizontalsystems/bankwallet/modules/transactions/PoolRepo;Lio/horizontalsystems/bankwallet/modules/transactions/TransactionItemDataSource;ILio/horizontalsystems/bankwallet/core/factories/TransactionViewItemFactory;Lio/horizontalsystems/bankwallet/modules/transactions/TransactionMetadataDataSource;)V", "allShown", "", "getAllShown", "()Z", "itemsCopy", "", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionViewItem;", "getItemsCopy", "()Ljava/util/List;", "clearRates", "", "getFetchDataList", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$FetchData;", "handleNextRecords", "records", "", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "handleUpdatedRecords", "wallet", "handleUpdatedWallets", "wallets", "increasePage", "onUpdateWalletsData", "allWalletsData", "Lkotlin/Pair;", "Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "setLastBlock", "lastBlockInfo", "setRate", "rateValue", "Ljava/math/BigDecimal;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "currency", "Lio/horizontalsystems/core/entities/Currency;", "timestamp", "", "setWallets", "transactionViewItem", "record", "app_debug"})
public final class TransactionRecordDataSource {
    private final io.horizontalsystems.bankwallet.modules.transactions.PoolRepo poolRepo = null;
    private final io.horizontalsystems.bankwallet.modules.transactions.TransactionItemDataSource itemsDataSource = null;
    private final int limit = 0;
    private final io.horizontalsystems.bankwallet.core.factories.TransactionViewItemFactory viewItemFactory = null;
    private final io.horizontalsystems.bankwallet.modules.transactions.TransactionMetadataDataSource metadataDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem> getItemsCopy() {
        return null;
    }
    
    public final boolean getAllShown() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.FetchData> getFetchDataList() {
        return null;
    }
    
    public final void handleNextRecords(@org.jetbrains.annotations.NotNull()
    java.util.Map<io.horizontalsystems.bankwallet.entities.Wallet, ? extends java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord>> records) {
    }
    
    public final boolean handleUpdatedRecords(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord> records, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
        return false;
    }
    
    public final boolean increasePage() {
        return false;
    }
    
    private final io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem transactionViewItem(io.horizontalsystems.bankwallet.entities.Wallet wallet, io.horizontalsystems.bankwallet.entities.TransactionRecord record) {
        return null;
    }
    
    public final void setWallets(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
    }
    
    private final void handleUpdatedWallets(java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
    }
    
    public final boolean setRate(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal rateValue, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency, long timestamp) {
        return false;
    }
    
    public final boolean setLastBlock(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.LastBlockInfo lastBlockInfo) {
        return false;
    }
    
    public final void onUpdateWalletsData(@org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<io.horizontalsystems.bankwallet.entities.Wallet, io.horizontalsystems.bankwallet.entities.LastBlockInfo>> allWalletsData) {
    }
    
    public final void clearRates() {
    }
    
    public TransactionRecordDataSource(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.PoolRepo poolRepo, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionItemDataSource itemsDataSource, int limit, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.factories.TransactionViewItemFactory viewItemFactory, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionMetadataDataSource metadataDataSource) {
        super();
    }
}