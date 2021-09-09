package io.horizontalsystems.bankwallet.modules.market.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0014\u0015\u0016B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u000e\u0010\t\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewSectionHeaderAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewSectionHeaderAdapter$SectionHeaderItem;", "Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewSectionHeaderAdapter$SectionHeaderViewHolder;", "hasItemsLiveData", "Landroidx/lifecycle/LiveData;", "", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "settingsHeaderItem", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LifecycleOwner;Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewSectionHeaderAdapter$SectionHeaderItem;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "SectionHeaderItem", "SectionHeaderViewHolder", "app_debug"})
public final class MarketOverviewSectionHeaderAdapter extends androidx.recyclerview.widget.ListAdapter<io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewSectionHeaderAdapter.SectionHeaderItem, io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewSectionHeaderAdapter.SectionHeaderViewHolder> {
    private final io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewSectionHeaderAdapter.SectionHeaderItem settingsHeaderItem = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewSectionHeaderAdapter.SectionHeaderItem> diffCallback = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewSectionHeaderAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewSectionHeaderAdapter.SectionHeaderViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewSectionHeaderAdapter.SectionHeaderViewHolder holder, int position) {
    }
    
    public MarketOverviewSectionHeaderAdapter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.Boolean> hasItemsLiveData, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner viewLifecycleOwner, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewSectionHeaderAdapter.SectionHeaderItem settingsHeaderItem) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \b*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \b*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewSectionHeaderAdapter$SectionHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "(Landroid/view/View;)V", "arrowIcon", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getContainerView", "()Landroid/view/View;", "icon", "titleText", "Landroid/widget/TextView;", "valueText", "bind", "", "item", "Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewSectionHeaderAdapter$SectionHeaderItem;", "Companion", "app_debug"})
    public static final class SectionHeaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
        private final android.widget.TextView titleText = null;
        private final android.widget.TextView valueText = null;
        private final android.widget.ImageView icon = null;
        private final android.widget.ImageView arrowIcon = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View containerView = null;
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewSectionHeaderAdapter.SectionHeaderViewHolder.Companion Companion = null;
        private java.util.HashMap _$_findViewCache;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewSectionHeaderAdapter.SectionHeaderItem item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getContainerView() {
            return null;
        }
        
        public SectionHeaderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View containerView) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewSectionHeaderAdapter$SectionHeaderViewHolder$Companion;", "", "()V", "create", "Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewSectionHeaderAdapter$SectionHeaderViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewSectionHeaderAdapter.SectionHeaderViewHolder create(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewSectionHeaderAdapter$SectionHeaderItem;", "", "title", "", "icon", "value", "", "onClick", "Lkotlin/Function0;", "", "(IILjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getIcon", "()I", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getTitle", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class SectionHeaderItem {
        private final int title = 0;
        private final int icon = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String value;
        @org.jetbrains.annotations.Nullable()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onClick = null;
        
        public final int getTitle() {
            return 0;
        }
        
        public final int getIcon() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getValue() {
            return null;
        }
        
        public final void setValue(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClick() {
            return null;
        }
        
        public SectionHeaderItem(int title, int icon, @org.jetbrains.annotations.Nullable()
        java.lang.String value, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewSectionHeaderAdapter.SectionHeaderItem copy(int title, int icon, @org.jetbrains.annotations.Nullable()
        java.lang.String value, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewSectionHeaderAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewSectionHeaderAdapter$SectionHeaderItem;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}