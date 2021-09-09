package io.horizontalsystems.bankwallet.modules.market.posts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0002\u000f\u0010B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/posts/ViewHolderMarketPostItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "listener", "Lio/horizontalsystems/bankwallet/modules/market/posts/ViewHolderMarketPostItem$Listener;", "(Landroid/view/View;Lio/horizontalsystems/bankwallet/modules/market/posts/ViewHolderMarketPostItem$Listener;)V", "getContainerView", "()Landroid/view/View;", "item", "Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewModule$PostViewItem;", "bind", "", "prev", "Companion", "Listener", "app_debug"})
public final class ViewHolderMarketPostItem extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
    private io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewModule.PostViewItem item;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View containerView = null;
    private final io.horizontalsystems.bankwallet.modules.market.posts.ViewHolderMarketPostItem.Listener listener = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.market.posts.ViewHolderMarketPostItem.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewModule.PostViewItem item, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewModule.PostViewItem prev) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getContainerView() {
        return null;
    }
    
    public ViewHolderMarketPostItem(@org.jetbrains.annotations.NotNull()
    android.view.View containerView, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.posts.ViewHolderMarketPostItem.Listener listener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/posts/ViewHolderMarketPostItem$Listener;", "", "onPostClick", "", "postViewItem", "Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewModule$PostViewItem;", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onPostClick(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewModule.PostViewItem postViewItem);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/posts/ViewHolderMarketPostItem$Companion;", "", "()V", "create", "Lio/horizontalsystems/bankwallet/modules/market/posts/ViewHolderMarketPostItem;", "parent", "Landroid/view/ViewGroup;", "listener", "Lio/horizontalsystems/bankwallet/modules/market/posts/ViewHolderMarketPostItem$Listener;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.market.posts.ViewHolderMarketPostItem create(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.market.posts.ViewHolderMarketPostItem.Listener listener) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}