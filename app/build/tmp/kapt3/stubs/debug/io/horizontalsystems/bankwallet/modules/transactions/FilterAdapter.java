package io.horizontalsystems.bankwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u001f B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016J\"\u0010\u001d\u001a\u00020\u00142\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/FilterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lio/horizontalsystems/bankwallet/modules/transactions/ViewHolderFilter$ClickListener;", "listener", "Lio/horizontalsystems/bankwallet/modules/transactions/FilterAdapter$Listener;", "(Lio/horizontalsystems/bankwallet/modules/transactions/FilterAdapter$Listener;)V", "filterChangeable", "", "getFilterChangeable", "()Z", "setFilterChangeable", "(Z)V", "filters", "", "Lio/horizontalsystems/bankwallet/modules/transactions/FilterAdapter$FilterItem;", "selectedFilterItem", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onClickItem", "width", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setFilters", "selectedFieldItem", "FilterItem", "Listener", "app_debug"})
public final class FilterAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> implements io.horizontalsystems.bankwallet.modules.transactions.ViewHolderFilter.ClickListener {
    private boolean filterChangeable = true;
    private io.horizontalsystems.bankwallet.modules.transactions.FilterAdapter.FilterItem selectedFilterItem;
    private java.util.List<? extends io.horizontalsystems.bankwallet.modules.transactions.FilterAdapter.FilterItem> filters;
    private io.horizontalsystems.bankwallet.modules.transactions.FilterAdapter.Listener listener;
    
    public final boolean getFilterChangeable() {
        return false;
    }
    
    public final void setFilterChangeable(boolean p0) {
    }
    
    public final void setFilters(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.modules.transactions.FilterAdapter.FilterItem> filters, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.transactions.FilterAdapter.FilterItem selectedFieldItem) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
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
    public void onClickItem(int position, int width) {
    }
    
    public FilterAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.FilterAdapter.Listener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/FilterAdapter$Listener;", "", "onFilterItemClick", "", "item", "Lio/horizontalsystems/bankwallet/modules/transactions/FilterAdapter$FilterItem;", "itemPosition", "", "itemWidth", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onFilterItemClick(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.transactions.FilterAdapter.FilterItem item, int itemPosition, int itemWidth);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/FilterAdapter$FilterItem;", "", "filterId", "", "(Ljava/lang/String;)V", "getFilterId", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "app_debug"})
    public static class FilterItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String filterId = null;
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFilterId() {
            return null;
        }
        
        public FilterItem(@org.jetbrains.annotations.NotNull()
        java.lang.String filterId) {
            super();
        }
    }
}