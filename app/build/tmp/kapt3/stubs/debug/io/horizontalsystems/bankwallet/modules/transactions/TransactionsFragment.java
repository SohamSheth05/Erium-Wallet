package io.horizontalsystems.bankwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\"\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006#"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsFragment;", "Landroidx/fragment/app/Fragment;", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsAdapter$Listener;", "Lio/horizontalsystems/bankwallet/modules/transactions/FilterAdapter$Listener;", "()V", "filterAdapter", "Lio/horizontalsystems/bankwallet/modules/transactions/FilterAdapter;", "transactionsAdapter", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsAdapter;", "viewModel", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsViewModel;", "getViewModel", "()Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onFilterItemClick", "item", "Lio/horizontalsystems/bankwallet/modules/transactions/FilterAdapter$FilterItem;", "itemPosition", "", "itemWidth", "onItemClick", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionViewItem;", "onViewCreated", "view", "app_debug"})
public final class TransactionsFragment extends androidx.fragment.app.Fragment implements io.horizontalsystems.bankwallet.modules.transactions.TransactionsAdapter.Listener, io.horizontalsystems.bankwallet.modules.transactions.FilterAdapter.Listener {
    private final kotlin.Lazy viewModel$delegate = null;
    private final io.horizontalsystems.bankwallet.modules.transactions.TransactionsAdapter transactionsAdapter = null;
    private final io.horizontalsystems.bankwallet.modules.transactions.FilterAdapter filterAdapter = null;
    private java.util.HashMap _$_findViewCache;
    
    private final io.horizontalsystems.bankwallet.modules.transactions.TransactionsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem item) {
    }
    
    @java.lang.Override()
    public void onFilterItemClick(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.transactions.FilterAdapter.FilterItem item, int itemPosition, int itemWidth) {
    }
    
    public TransactionsFragment() {
        super();
    }
}