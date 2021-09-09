package io.horizontalsystems.bankwallet.modules.market.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/search/CoinDataItemsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lio/horizontalsystems/bankwallet/modules/market/search/CoinDataViewItem;", "Lio/horizontalsystems/bankwallet/modules/market/search/CoinDataItemsAdapter$ViewHolder;", "onItemClick", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "app_debug"})
public final class CoinDataItemsAdapter extends androidx.recyclerview.widget.ListAdapter<io.horizontalsystems.bankwallet.modules.market.search.CoinDataViewItem, io.horizontalsystems.bankwallet.modules.market.search.CoinDataItemsAdapter.ViewHolder> {
    private final kotlin.jvm.functions.Function1<io.horizontalsystems.bankwallet.modules.market.search.CoinDataViewItem, kotlin.Unit> onItemClick = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<io.horizontalsystems.bankwallet.modules.market.search.CoinDataViewItem> diffCallback = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.market.search.CoinDataItemsAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.market.search.CoinDataItemsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.search.CoinDataItemsAdapter.ViewHolder holder, int position) {
    }
    
    public CoinDataItemsAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super io.horizontalsystems.bankwallet.modules.market.search.CoinDataViewItem, kotlin.Unit> onItemClick) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/search/CoinDataItemsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "onItemClick", "Lkotlin/Function1;", "Lio/horizontalsystems/bankwallet/modules/market/search/CoinDataViewItem;", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "getContainerView", "()Landroid/view/View;", "item", "bind", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
        private io.horizontalsystems.bankwallet.modules.market.search.CoinDataViewItem item;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View containerView = null;
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.search.CoinDataItemsAdapter.ViewHolder.Companion Companion = null;
        private java.util.HashMap _$_findViewCache;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.market.search.CoinDataViewItem item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getContainerView() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View containerView, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super io.horizontalsystems.bankwallet.modules.market.search.CoinDataViewItem, kotlin.Unit> onItemClick) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/search/CoinDataItemsAdapter$ViewHolder$Companion;", "", "()V", "create", "Lio/horizontalsystems/bankwallet/modules/market/search/CoinDataItemsAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onItemClick", "Lkotlin/Function1;", "Lio/horizontalsystems/bankwallet/modules/market/search/CoinDataViewItem;", "", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.modules.market.search.CoinDataItemsAdapter.ViewHolder create(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent, int viewType, @org.jetbrains.annotations.NotNull()
            kotlin.jvm.functions.Function1<? super io.horizontalsystems.bankwallet.modules.market.search.CoinDataViewItem, kotlin.Unit> onItemClick) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/search/CoinDataItemsAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lio/horizontalsystems/bankwallet/modules/market/search/CoinDataViewItem;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}