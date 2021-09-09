package io.horizontalsystems.bankwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceItemsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceViewItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listener", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceItemsAdapter$Listener;", "(Lio/horizontalsystems/bankwallet/modules/balance/BalanceItemsAdapter$Listener;)V", "onBindViewHolder", "", "p0", "p1", "", "holder", "position", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Listener", "app_debug"})
public final class BalanceItemsAdapter extends androidx.recyclerview.widget.ListAdapter<io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final io.horizontalsystems.bankwallet.modules.balance.BalanceItemsAdapter.Listener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder p0, int p1) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    public BalanceItemsAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceItemsAdapter.Listener listener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceItemsAdapter$Listener;", "", "onChartClicked", "", "viewItem", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceViewItem;", "onItemClicked", "onReceiveClicked", "onSendClicked", "onSwapClicked", "onSyncErrorClicked", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onSendClicked(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem);
        
        public abstract void onReceiveClicked(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem);
        
        public abstract void onSwapClicked(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem);
        
        public abstract void onChartClicked(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem);
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem);
        
        public abstract void onSyncErrorClicked(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem);
    }
}