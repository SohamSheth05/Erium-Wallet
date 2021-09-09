package io.horizontalsystems.bankwallet.modules.market.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewItemsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem;", "Lio/horizontalsystems/bankwallet/modules/market/overview/ViewHolderMarketOverviewItem;", "listener", "Lio/horizontalsystems/bankwallet/modules/market/overview/ViewHolderMarketOverviewItem$Listener;", "itemsLiveData", "Landroidx/lifecycle/LiveData;", "", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Lio/horizontalsystems/bankwallet/modules/market/overview/ViewHolderMarketOverviewItem$Listener;Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LifecycleOwner;)V", "getListPosition", "Lio/horizontalsystems/views/ListPosition;", "position", "", "onBindViewHolder", "", "holder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "app_debug"})
public final class MarketOverviewItemsAdapter extends androidx.recyclerview.widget.ListAdapter<io.horizontalsystems.bankwallet.modules.market.MarketViewItem, io.horizontalsystems.bankwallet.modules.market.overview.ViewHolderMarketOverviewItem> {
    private final io.horizontalsystems.bankwallet.modules.market.overview.ViewHolderMarketOverviewItem.Listener listener = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<io.horizontalsystems.bankwallet.modules.market.MarketViewItem> coinRateDiff = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewItemsAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.market.overview.ViewHolderMarketOverviewItem onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.overview.ViewHolderMarketOverviewItem holder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.overview.ViewHolderMarketOverviewItem holder, int position) {
    }
    
    private final io.horizontalsystems.views.ListPosition getListPosition(int position) {
        return null;
    }
    
    public MarketOverviewItemsAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.overview.ViewHolderMarketOverviewItem.Listener listener, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<io.horizontalsystems.bankwallet.modules.market.MarketViewItem>> itemsLiveData, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner viewLifecycleOwner) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewItemsAdapter$Companion;", "", "()V", "coinRateDiff", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}