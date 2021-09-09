package io.horizontalsystems.bankwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0007\t\n\u000b\f\r\u000e\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule;", "", "()V", "initModule", "", "view", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsViewModel;", "router", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IRouter;", "Factory", "FetchData", "IInteractor", "IInteractorDelegate", "IRouter", "IView", "IViewDelegate", "app_debug"})
public final class TransactionsModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule INSTANCE = null;
    
    public final void initModule(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionsViewModel view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IRouter router) {
    }
    
    private TransactionsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$FetchData;", "", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "from", "Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "limit", "", "(Lio/horizontalsystems/bankwallet/entities/Wallet;Lio/horizontalsystems/bankwallet/entities/TransactionRecord;I)V", "getFrom", "()Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "getLimit", "()I", "getWallet", "()Lio/horizontalsystems/bankwallet/entities/Wallet;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
    public static final class FetchData {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.entities.Wallet wallet = null;
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.bankwallet.entities.TransactionRecord from = null;
        private final int limit = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.Wallet getWallet() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.entities.TransactionRecord getFrom() {
            return null;
        }
        
        public final int getLimit() {
            return 0;
        }
        
        public FetchData(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.entities.TransactionRecord from, int limit) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.Wallet component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.entities.TransactionRecord component2() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.FetchData copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.entities.TransactionRecord from, int limit) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007H&\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IView;", "", "hideSyncing", "", "reloadTransactions", "showFilters", "filters", "", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "showNoTransactions", "showSyncing", "showTransactions", "items", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionViewItem;", "app_debug"})
    public static abstract interface IView {
        
        public abstract void showSyncing();
        
        public abstract void hideSyncing();
        
        public abstract void showFilters(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> filters);
        
        public abstract void showTransactions(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem> items);
        
        public abstract void showNoTransactions();
        
        public abstract void reloadTransactions();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nH&\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IViewDelegate;", "", "onBottomReached", "", "onClear", "onFilterSelect", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "showDetails", "item", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionViewItem;", "viewDidLoad", "willShow", "transactionViewItem", "app_debug"})
    public static abstract interface IViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void onFilterSelect(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.entities.Wallet wallet);
        
        public abstract void onClear();
        
        public abstract void onBottomReached();
        
        public abstract void willShow(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem transactionViewItem);
        
        public abstract void showDetails(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem item);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u001e\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0016\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fH&\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IInteractor;", "", "clear", "", "fetchLastBlockHeights", "fetchRate", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "timestamp", "", "fetchRecords", "fetchDataList", "", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$FetchData;", "initial", "", "initialFetch", "setSelectedWallets", "selectedWallets", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "app_debug"})
    public static abstract interface IInteractor {
        
        public abstract void initialFetch();
        
        public abstract void clear();
        
        public abstract void fetchRecords(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.FetchData> fetchDataList, boolean initial);
        
        public abstract void setSelectedWallets(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> selectedWallets);
        
        public abstract void fetchLastBlockHeights();
        
        public abstract void fetchRate(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, long timestamp);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J*\u0010\f\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H&J\u001e\u0010\u0014\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u000fH&J\u001c\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00180\u000eH&J\b\u0010\u0019\u001a\u00020\u0003H&J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u000fH&J\b\u0010\u001c\u001a\u00020\u0003H&J\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0016\u0010 \u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0010H&J$\u0010\"\u001a\u00020\u00032\u001a\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001f0$0\u0010H&\u00a8\u0006%"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IInteractorDelegate;", "", "didFetchRate", "", "rateValue", "Ljava/math/BigDecimal;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "currency", "Lio/horizontalsystems/core/entities/Currency;", "timestamp", "", "didFetchRecords", "records", "", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "", "Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "initial", "", "didUpdateRecords", "wallet", "initialAdapterStates", "states", "Lio/horizontalsystems/bankwallet/core/AdapterState;", "onConnectionRestore", "onUpdateAdapterState", "state", "onUpdateBaseCurrency", "onUpdateLastBlock", "lastBlockInfo", "Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "onUpdateSelectedWallets", "selectedWallets", "onUpdateWalletsData", "allWalletsData", "Lkotlin/Pair;", "app_debug"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void onUpdateWalletsData(@org.jetbrains.annotations.NotNull()
        java.util.List<kotlin.Pair<io.horizontalsystems.bankwallet.entities.Wallet, io.horizontalsystems.bankwallet.entities.LastBlockInfo>> allWalletsData);
        
        public abstract void onUpdateSelectedWallets(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> selectedWallets);
        
        public abstract void didFetchRecords(@org.jetbrains.annotations.NotNull()
        java.util.Map<io.horizontalsystems.bankwallet.entities.Wallet, ? extends java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord>> records, boolean initial);
        
        public abstract void onUpdateLastBlock(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.LastBlockInfo lastBlockInfo);
        
        public abstract void onUpdateBaseCurrency();
        
        public abstract void didFetchRate(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal rateValue, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.core.entities.Currency currency, long timestamp);
        
        public abstract void didUpdateRecords(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord> records, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet);
        
        public abstract void onConnectionRestore();
        
        public abstract void initialAdapterStates(@org.jetbrains.annotations.NotNull()
        java.util.Map<io.horizontalsystems.bankwallet.entities.Wallet, ? extends io.horizontalsystems.bankwallet.core.AdapterState> states);
        
        public abstract void onUpdateAdapterState(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.AdapterState state, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IRouter;", "", "app_debug"})
    public static abstract interface IRouter {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory() {
            super();
        }
    }
}