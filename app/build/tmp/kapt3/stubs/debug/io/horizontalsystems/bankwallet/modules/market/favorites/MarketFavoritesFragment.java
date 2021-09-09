package io.horizontalsystems.bankwallet.modules.market.favorites;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/favorites/MarketFavoritesFragment;", "Lio/horizontalsystems/bankwallet/core/BaseFragment;", "Lio/horizontalsystems/bankwallet/ui/extensions/MarketListHeaderView$Listener;", "Lio/horizontalsystems/bankwallet/modules/market/ViewHolderMarketItem$Listener;", "()V", "marketListViewModel", "Lio/horizontalsystems/bankwallet/modules/market/list/MarketListViewModel;", "getMarketListViewModel", "()Lio/horizontalsystems/bankwallet/modules/market/list/MarketListViewModel;", "marketListViewModel$delegate", "Lkotlin/Lazy;", "onClickSortingField", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "marketViewItem", "Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem;", "onSelectMarketField", "marketField", "Lio/horizontalsystems/bankwallet/modules/market/MarketField;", "onViewCreated", "view", "EmptyFavoritesViewHolder", "app_debug"})
public final class MarketFavoritesFragment extends io.horizontalsystems.bankwallet.core.BaseFragment implements io.horizontalsystems.bankwallet.ui.extensions.MarketListHeaderView.Listener, io.horizontalsystems.bankwallet.modules.market.ViewHolderMarketItem.Listener {
    private final kotlin.Lazy marketListViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final io.horizontalsystems.bankwallet.modules.market.list.MarketListViewModel getMarketListViewModel() {
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
    public void onClickSortingField() {
    }
    
    @java.lang.Override()
    public void onSelectMarketField(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.MarketField marketField) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.MarketViewItem marketViewItem) {
    }
    
    public MarketFavoritesFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/favorites/MarketFavoritesFragment$EmptyFavoritesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "containerView", "Landroid/view/View;", "(Landroid/view/View;)V", "Companion", "app_debug"})
    public static final class EmptyFavoritesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.favorites.MarketFavoritesFragment.EmptyFavoritesViewHolder.Companion Companion = null;
        
        public EmptyFavoritesViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View containerView) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/favorites/MarketFavoritesFragment$EmptyFavoritesViewHolder$Companion;", "", "()V", "create", "Lio/horizontalsystems/bankwallet/modules/market/favorites/MarketFavoritesFragment$EmptyFavoritesViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.modules.market.favorites.MarketFavoritesFragment.EmptyFavoritesViewHolder create(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent, int viewType) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}