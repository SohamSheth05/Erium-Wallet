package io.horizontalsystems.bankwallet.modules.basecurrency;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/basecurrency/RVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lio/horizontalsystems/bankwallet/modules/basecurrency/RVAdapter$ViewHolder;", "items", "", "Lio/horizontalsystems/bankwallet/modules/basecurrency/CurrencyViewItemWrapper;", "listener", "Lio/horizontalsystems/bankwallet/modules/basecurrency/RVAdapter$ViewHolder$Listener;", "(Ljava/util/List;Lio/horizontalsystems/bankwallet/modules/basecurrency/RVAdapter$ViewHolder$Listener;)V", "getItems", "()Ljava/util/List;", "getListener", "()Lio/horizontalsystems/bankwallet/modules/basecurrency/RVAdapter$ViewHolder$Listener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class RVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<io.horizontalsystems.bankwallet.modules.basecurrency.RVAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.modules.basecurrency.CurrencyViewItemWrapper> items = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.basecurrency.RVAdapter.ViewHolder.Listener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.basecurrency.RVAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.basecurrency.RVAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.basecurrency.CurrencyViewItemWrapper> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.basecurrency.RVAdapter.ViewHolder.Listener getListener() {
        return null;
    }
    
    public RVAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.basecurrency.CurrencyViewItemWrapper> items, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.basecurrency.RVAdapter.ViewHolder.Listener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0002\u000e\u000fB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/basecurrency/RVAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "listener", "Lio/horizontalsystems/bankwallet/modules/basecurrency/RVAdapter$ViewHolder$Listener;", "(Landroid/view/View;Lio/horizontalsystems/bankwallet/modules/basecurrency/RVAdapter$ViewHolder$Listener;)V", "getContainerView", "()Landroid/view/View;", "item", "Lio/horizontalsystems/bankwallet/modules/basecurrency/CurrencyViewItemWrapper;", "bind", "", "Companion", "Listener", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
        private io.horizontalsystems.bankwallet.modules.basecurrency.CurrencyViewItemWrapper item;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View containerView = null;
        private final io.horizontalsystems.bankwallet.modules.basecurrency.RVAdapter.ViewHolder.Listener listener = null;
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.basecurrency.RVAdapter.ViewHolder.Companion Companion = null;
        private java.util.HashMap _$_findViewCache;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.basecurrency.CurrencyViewItemWrapper item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getContainerView() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View containerView, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.basecurrency.RVAdapter.ViewHolder.Listener listener) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/basecurrency/RVAdapter$ViewHolder$Listener;", "", "onSelectItem", "", "item", "Lio/horizontalsystems/bankwallet/modules/basecurrency/CurrencyViewItemWrapper;", "app_debug"})
        public static abstract interface Listener {
            
            public abstract void onSelectItem(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.modules.basecurrency.CurrencyViewItemWrapper item);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/basecurrency/RVAdapter$ViewHolder$Companion;", "", "()V", "create", "Lio/horizontalsystems/bankwallet/modules/basecurrency/RVAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "listener", "Lio/horizontalsystems/bankwallet/modules/basecurrency/RVAdapter$ViewHolder$Listener;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.modules.basecurrency.RVAdapter.ViewHolder create(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.modules.basecurrency.RVAdapter.ViewHolder.Listener listener) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}