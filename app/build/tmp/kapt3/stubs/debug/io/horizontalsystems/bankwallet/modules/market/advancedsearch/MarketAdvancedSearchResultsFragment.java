package io.horizontalsystems.bankwallet.modules.market.advancedsearch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/advancedsearch/MarketAdvancedSearchResultsFragment;", "Lio/horizontalsystems/bankwallet/core/BaseFragment;", "Lio/horizontalsystems/bankwallet/ui/extensions/MarketListHeaderView$Listener;", "Lio/horizontalsystems/bankwallet/modules/market/ViewHolderMarketItem$Listener;", "()V", "marketListViewModel", "Lio/horizontalsystems/bankwallet/modules/market/list/MarketListViewModel;", "getMarketListViewModel", "()Lio/horizontalsystems/bankwallet/modules/market/list/MarketListViewModel;", "marketListViewModel$delegate", "Lkotlin/Lazy;", "marketSearchFilterViewModel", "Lio/horizontalsystems/bankwallet/modules/market/advancedsearch/MarketAdvancedSearchViewModel;", "getMarketSearchFilterViewModel", "()Lio/horizontalsystems/bankwallet/modules/market/advancedsearch/MarketAdvancedSearchViewModel;", "marketSearchFilterViewModel$delegate", "onClickSortingField", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "marketViewItem", "Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem;", "onSelectMarketField", "marketField", "Lio/horizontalsystems/bankwallet/modules/market/MarketField;", "onViewCreated", "view", "app_debug"})
public final class MarketAdvancedSearchResultsFragment extends io.horizontalsystems.bankwallet.core.BaseFragment implements io.horizontalsystems.bankwallet.ui.extensions.MarketListHeaderView.Listener, io.horizontalsystems.bankwallet.modules.market.ViewHolderMarketItem.Listener {
    private final kotlin.Lazy marketSearchFilterViewModel$delegate = null;
    private final kotlin.Lazy marketListViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final io.horizontalsystems.bankwallet.modules.market.advancedsearch.MarketAdvancedSearchViewModel getMarketSearchFilterViewModel() {
        return null;
    }
    
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
    
    public MarketAdvancedSearchResultsFragment() {
        super();
    }
}