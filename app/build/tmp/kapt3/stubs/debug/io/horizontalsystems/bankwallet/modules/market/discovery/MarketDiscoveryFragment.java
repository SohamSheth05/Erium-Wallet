package io.horizontalsystems.bankwallet.modules.market.discovery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*H\u0016J\u001a\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketDiscoveryFragment;", "Lio/horizontalsystems/bankwallet/core/BaseFragment;", "Lio/horizontalsystems/bankwallet/ui/extensions/MarketListHeaderView$Listener;", "Lio/horizontalsystems/bankwallet/modules/market/ViewHolderMarketItem$Listener;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategoriesAdapter$Listener;", "()V", "marketDiscoveryViewModel", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketDiscoveryViewModel;", "getMarketDiscoveryViewModel", "()Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketDiscoveryViewModel;", "marketDiscoveryViewModel$delegate", "Lkotlin/Lazy;", "marketListViewModel", "Lio/horizontalsystems/bankwallet/modules/market/list/MarketListViewModel;", "getMarketListViewModel", "()Lio/horizontalsystems/bankwallet/modules/market/list/MarketListViewModel;", "marketListViewModel$delegate", "marketViewModel", "Lio/horizontalsystems/bankwallet/modules/market/MarketViewModel;", "getMarketViewModel", "()Lio/horizontalsystems/bankwallet/modules/market/MarketViewModel;", "marketViewModel$delegate", "vmFactory", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketDiscoveryModule$Factory;", "onClickSortingField", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "marketViewItem", "Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem;", "onSelect", "marketCategory", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "onSelectMarketField", "marketField", "Lio/horizontalsystems/bankwallet/modules/market/MarketField;", "onViewCreated", "view", "app_debug"})
public final class MarketDiscoveryFragment extends io.horizontalsystems.bankwallet.core.BaseFragment implements io.horizontalsystems.bankwallet.ui.extensions.MarketListHeaderView.Listener, io.horizontalsystems.bankwallet.modules.market.ViewHolderMarketItem.Listener, io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategoriesAdapter.Listener {
    private final io.horizontalsystems.bankwallet.modules.market.discovery.MarketDiscoveryModule.Factory vmFactory = null;
    private final kotlin.Lazy marketDiscoveryViewModel$delegate = null;
    private final kotlin.Lazy marketListViewModel$delegate = null;
    private final kotlin.Lazy marketViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final io.horizontalsystems.bankwallet.modules.market.discovery.MarketDiscoveryViewModel getMarketDiscoveryViewModel() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.market.list.MarketListViewModel getMarketListViewModel() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.market.MarketViewModel getMarketViewModel() {
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
    
    @java.lang.Override()
    public void onSelect(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory marketCategory) {
    }
    
    public MarketDiscoveryFragment() {
        super();
    }
}