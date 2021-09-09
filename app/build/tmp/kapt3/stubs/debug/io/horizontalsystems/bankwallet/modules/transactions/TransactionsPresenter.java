package io.horizontalsystems.bankwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ(\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J*\u0010&\u001a\u00020\u001d2\u0018\u0010\'\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(2\u0006\u0010+\u001a\u00020\u0015H\u0016J\u001e\u0010,\u001a\u00020\u001d2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010-\u001a\u00020\fH\u0016J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\f0)H\u0002J\u001c\u00101\u001a\u00020\u001d2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0(H\u0016J\u0012\u00103\u001a\u00020\u001d2\b\b\u0002\u0010+\u001a\u00020\u0015H\u0002J\b\u00104\u001a\u00020\u001dH\u0016J\b\u00105\u001a\u00020\u001dH\u0016J\b\u00106\u001a\u00020\u001dH\u0016J\u0012\u00107\u001a\u00020\u001d2\b\u0010-\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\r2\u0006\u0010-\u001a\u00020\fH\u0016J\b\u0010:\u001a\u00020\u001dH\u0016J\u0018\u0010;\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\f2\u0006\u0010<\u001a\u00020=H\u0016J\u0016\u0010>\u001a\u00020\u001d2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\f0)H\u0016J$\u0010@\u001a\u00020\u001d2\u001a\u0010A\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010=0B0)H\u0016J\u0010\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u000fH\u0016J\b\u0010E\u001a\u00020\u001dH\u0002J\b\u0010F\u001a\u00020\u001dH\u0016J\u0010\u0010G\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020\u000fH\u0016R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006I"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsPresenter;", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IViewDelegate;", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IInteractorDelegate;", "interactor", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IInteractor;", "router", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IRouter;", "dataSource", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionRecordDataSource;", "(Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IInteractor;Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IRouter;Lio/horizontalsystems/bankwallet/modules/transactions/TransactionRecordDataSource;)V", "adapterStates", "", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "Lio/horizontalsystems/bankwallet/core/AdapterState;", "itemDetails", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionViewItem;", "getItemDetails", "()Lio/horizontalsystems/bankwallet/modules/transactions/TransactionViewItem;", "setItemDetails", "(Lio/horizontalsystems/bankwallet/modules/transactions/TransactionViewItem;)V", "loading", "", "view", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IView;", "getView", "()Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IView;", "setView", "(Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IView;)V", "didFetchRate", "", "rateValue", "Ljava/math/BigDecimal;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "currency", "Lio/horizontalsystems/core/entities/Currency;", "timestamp", "", "didFetchRecords", "records", "", "", "Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "initial", "didUpdateRecords", "wallet", "getOrderedList", "", "wallets", "initialAdapterStates", "states", "loadNext", "onBottomReached", "onClear", "onConnectionRestore", "onFilterSelect", "onUpdateAdapterState", "state", "onUpdateBaseCurrency", "onUpdateLastBlock", "lastBlockInfo", "Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "onUpdateSelectedWallets", "selectedWallets", "onUpdateWalletsData", "allWalletsData", "Lkotlin/Pair;", "showDetails", "item", "syncState", "viewDidLoad", "willShow", "transactionViewItem", "app_debug"})
public final class TransactionsPresenter implements io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IViewDelegate, io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IInteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IView view;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem itemDetails;
    private java.util.Map<io.horizontalsystems.bankwallet.entities.Wallet, io.horizontalsystems.bankwallet.core.AdapterState> adapterStates;
    private boolean loading = false;
    private final io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IInteractor interactor = null;
    private final io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IRouter router = null;
    private final io.horizontalsystems.bankwallet.modules.transactions.TransactionRecordDataSource dataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem getItemDetails() {
        return null;
    }
    
    public final void setItemDetails(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem p0) {
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void onFilterSelect(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
    }
    
    @java.lang.Override()
    public void onClear() {
    }
    
    @java.lang.Override()
    public void onBottomReached() {
    }
    
    @java.lang.Override()
    public void willShow(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem transactionViewItem) {
    }
    
    @java.lang.Override()
    public void showDetails(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem item) {
    }
    
    @java.lang.Override()
    public void onUpdateWalletsData(@org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<io.horizontalsystems.bankwallet.entities.Wallet, io.horizontalsystems.bankwallet.entities.LastBlockInfo>> allWalletsData) {
    }
    
    @java.lang.Override()
    public void onUpdateSelectedWallets(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> selectedWallets) {
    }
    
    @java.lang.Override()
    public void didFetchRecords(@org.jetbrains.annotations.NotNull()
    java.util.Map<io.horizontalsystems.bankwallet.entities.Wallet, ? extends java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord>> records, boolean initial) {
    }
    
    @java.lang.Override()
    public void onUpdateLastBlock(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.LastBlockInfo lastBlockInfo) {
    }
    
    @java.lang.Override()
    public void onUpdateBaseCurrency() {
    }
    
    @java.lang.Override()
    public void didFetchRate(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal rateValue, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency, long timestamp) {
    }
    
    @java.lang.Override()
    public void didUpdateRecords(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord> records, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
    }
    
    @java.lang.Override()
    public void onConnectionRestore() {
    }
    
    @java.lang.Override()
    public void initialAdapterStates(@org.jetbrains.annotations.NotNull()
    java.util.Map<io.horizontalsystems.bankwallet.entities.Wallet, ? extends io.horizontalsystems.bankwallet.core.AdapterState> states) {
    }
    
    @java.lang.Override()
    public void onUpdateAdapterState(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AdapterState state, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
    }
    
    private final void syncState() {
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> getOrderedList(java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
        return null;
    }
    
    private final void loadNext(boolean initial) {
    }
    
    public TransactionsPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IRouter router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionRecordDataSource dataSource) {
        super();
    }
}