package io.horizontalsystems.bankwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001fB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\tH\u0016J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006 "}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionViewItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lio/horizontalsystems/bankwallet/modules/transactions/ViewHolderTransaction$ClickListener;", "listener", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsAdapter$Listener;", "(Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsAdapter$Listener;)V", "noTransactionsView", "", "transactionView", "viewModel", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsViewModel;", "getViewModel", "()Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsViewModel;", "setViewModel", "(Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsViewModel;)V", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "payloads", "", "", "onClick", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Listener", "app_debug"})
public final class TransactionsAdapter extends androidx.recyclerview.widget.ListAdapter<io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> implements io.horizontalsystems.bankwallet.modules.transactions.ViewHolderTransaction.ClickListener {
    private final int noTransactionsView = 0;
    private final int transactionView = 1;
    public io.horizontalsystems.bankwallet.modules.transactions.TransactionsViewModel viewModel;
    private io.horizontalsystems.bankwallet.modules.transactions.TransactionsAdapter.Listener listener;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.transactions.TransactionsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionsViewModel p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    @java.lang.Override()
    public void onClick(int position) {
    }
    
    public TransactionsAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionsAdapter.Listener listener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsAdapter$Listener;", "", "onItemClick", "", "item", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionViewItem;", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem item);
    }
}