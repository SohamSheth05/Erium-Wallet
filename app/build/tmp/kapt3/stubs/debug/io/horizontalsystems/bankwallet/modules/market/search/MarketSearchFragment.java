package io.horizontalsystems.bankwallet.modules.market.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u001a\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/search/MarketSearchFragment;", "Lio/horizontalsystems/bankwallet/core/BaseFragment;", "()V", "marketSearchViewModel", "Lio/horizontalsystems/bankwallet/modules/market/search/MarketSearchViewModel;", "getMarketSearchViewModel", "()Lio/horizontalsystems/bankwallet/modules/market/search/MarketSearchViewModel;", "marketSearchViewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "", "coinDataViewItem", "Lio/horizontalsystems/bankwallet/modules/market/search/CoinDataViewItem;", "onViewCreated", "view", "EmptyResultsViewHolder", "app_debug"})
public final class MarketSearchFragment extends io.horizontalsystems.bankwallet.core.BaseFragment {
    private final kotlin.Lazy marketSearchViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final io.horizontalsystems.bankwallet.modules.market.search.MarketSearchViewModel getMarketSearchViewModel() {
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
    
    public final void onItemClick(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.search.CoinDataViewItem coinDataViewItem) {
    }
    
    public MarketSearchFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/search/MarketSearchFragment$EmptyResultsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "Companion", "app_debug"})
    public static final class EmptyResultsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.search.MarketSearchFragment.EmptyResultsViewHolder.Companion Companion = null;
        
        public EmptyResultsViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/search/MarketSearchFragment$EmptyResultsViewHolder$Companion;", "", "()V", "create", "Lio/horizontalsystems/bankwallet/modules/market/search/MarketSearchFragment$EmptyResultsViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.modules.market.search.MarketSearchFragment.EmptyResultsViewHolder create(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent, int viewType) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}