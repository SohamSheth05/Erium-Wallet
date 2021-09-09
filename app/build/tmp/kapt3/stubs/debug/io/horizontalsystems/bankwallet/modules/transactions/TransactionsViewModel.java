package io.horizontalsystems.bankwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0014J\b\u0010\u0014\u001a\u00020\u0016H\u0016J\u0018\u0010\u001e\u001a\u00020\u00162\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016J\b\u0010 \u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0016\u0010!\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\rH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IView;", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IRouter;", "()V", "delegate", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IViewDelegate;)V", "filterItems", "Landroidx/lifecycle/MutableLiveData;", "", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "getFilterItems", "()Landroidx/lifecycle/MutableLiveData;", "items", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionViewItem;", "getItems", "reloadTransactions", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getReloadTransactions", "()Lio/horizontalsystems/core/SingleLiveEvent;", "showSyncing", "", "getShowSyncing", "hideSyncing", "onCleared", "showFilters", "filters", "showNoTransactions", "showTransactions", "app_debug"})
public final class TransactionsViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IView, io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IRouter {
    public io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.entities.Wallet>> filterItems = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem>> items = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> reloadTransactions = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showSyncing = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.entities.Wallet>> getFilterItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem>> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getReloadTransactions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowSyncing() {
        return null;
    }
    
    @java.lang.Override()
    public void showFilters(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> filters) {
    }
    
    @java.lang.Override()
    public void showTransactions(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem> items) {
    }
    
    @java.lang.Override()
    public void reloadTransactions() {
    }
    
    @java.lang.Override()
    public void showNoTransactions() {
    }
    
    @java.lang.Override()
    public void showSyncing() {
    }
    
    @java.lang.Override()
    public void hideSyncing() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public TransactionsViewModel() {
        super();
    }
}