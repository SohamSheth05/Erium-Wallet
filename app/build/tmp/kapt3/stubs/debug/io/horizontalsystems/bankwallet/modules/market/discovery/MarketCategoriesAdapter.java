package io.horizontalsystems.bankwallet.modules.market.discovery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00016B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ(\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J(\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J(\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u001bH\u0002J5\u0010#\u001a\u00020\u00142\n\u0010$\u001a\u00060%R\u00020\u00052\u0006\u0010&\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0002\u0010(J&\u0010)\u001a\u00020\u00142\n\u0010$\u001a\u00060%R\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010*\u001a\u00020\u0010H\u0002J\u0010\u0010+\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010,\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010,\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u0010H\u0002J\u0010\u0010-\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010.\u001a\u00020\u00142\b\u0010/\u001a\u0004\u0018\u00010\bJ\u0010\u00100\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u000201H\u0002J\u0010\u00103\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u000201H\u0002J\u0016\u00104\u001a\u00020\u0016*\u00020\u00162\b\b\u0001\u00105\u001a\u00020\rH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategoriesAdapter;", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "context", "Landroid/content/Context;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "marketCategories", "", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "listener", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategoriesAdapter$Listener;", "(Landroid/content/Context;Lcom/google/android/material/tabs/TabLayout;Ljava/util/List;Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategoriesAdapter$Listener;)V", "activeColor", "", "inactiveColor", "isTabSelected", "", "itemViewMaxLength", "itemViewMinLength", "animateDescription", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "fromAlpha", "", "toAlpha", "animDuration", "", "animateIcon", "view", "Landroid/view/View;", "animateTabColor", "fromColor", "toColor", "duration", "animateTabWidth", "tabView", "Lcom/google/android/material/tabs/TabLayout$TabView;", "toWidth", "lastTabPosition", "(Lcom/google/android/material/tabs/TabLayout$TabView;IJLjava/lang/Integer;)V", "animateTitle", "isInitial", "onTabReselected", "onTabSelected", "onTabUnselected", "selectCategory", "category", "updateDescTextColorAccordingTheme", "Landroid/widget/TextView;", "updateDiscTextView", "updateTitleTextView", "setDescription", "descriptionResId", "Listener", "app_debug"})
public final class MarketCategoriesAdapter implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
    private final int itemViewMaxLength = 0;
    private final int itemViewMinLength = 0;
    private final int activeColor = 0;
    private final int inactiveColor = 0;
    private boolean isTabSelected = false;
    private final android.content.Context context = null;
    private final com.google.android.material.tabs.TabLayout tabLayout = null;
    private final java.util.List<io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory> marketCategories = null;
    private final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategoriesAdapter.Listener listener = null;
    
    public final void selectCategory(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory category) {
    }
    
    private final void onTabSelected(com.google.android.material.tabs.TabLayout.Tab tab, boolean isInitial) {
    }
    
    @java.lang.Override()
    public void onTabSelected(@org.jetbrains.annotations.NotNull()
    com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    @java.lang.Override()
    public void onTabUnselected(@org.jetbrains.annotations.NotNull()
    com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    private final void animateIcon(android.view.View view, float fromAlpha, float toAlpha, long animDuration) {
    }
    
    private final void animateDescription(com.google.android.material.tabs.TabLayout.Tab tab, float fromAlpha, float toAlpha, long animDuration) {
    }
    
    private final void animateTitle(com.google.android.material.tabs.TabLayout.TabView tabView, long animDuration, boolean isInitial) {
    }
    
    private final void animateTabWidth(com.google.android.material.tabs.TabLayout.TabView tabView, int toWidth, long animDuration, java.lang.Integer lastTabPosition) {
    }
    
    private final void animateTabColor(android.view.View view, int fromColor, int toColor, long duration) {
    }
    
    @java.lang.Override()
    public void onTabReselected(@org.jetbrains.annotations.NotNull()
    com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    private final com.google.android.material.tabs.TabLayout.Tab setDescription(com.google.android.material.tabs.TabLayout.Tab $this$setDescription, @androidx.annotation.StringRes()
    int descriptionResId) {
        return null;
    }
    
    private final void updateDescTextColorAccordingTheme(android.widget.TextView view) {
    }
    
    private final void updateTitleTextView(android.widget.TextView view) {
    }
    
    private final void updateDiscTextView(android.widget.TextView view) {
    }
    
    public MarketCategoriesAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.android.material.tabs.TabLayout tabLayout, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory> marketCategories, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategoriesAdapter.Listener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategoriesAdapter$Listener;", "", "onSelect", "", "marketCategory", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onSelect(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory marketCategory);
    }
}