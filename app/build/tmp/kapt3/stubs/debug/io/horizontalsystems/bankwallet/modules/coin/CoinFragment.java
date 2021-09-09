package io.horizontalsystems.bankwallet.modules.coin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00e4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u0000 d2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001dB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0002J\u0017\u0010\'\u001a\u0004\u0018\u00010\t2\u0006\u0010$\u001a\u00020(H\u0002\u00a2\u0006\u0002\u0010)J\u0014\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010-\u001a\u00020\"H\u0002J$\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0010\u00106\u001a\u00020\"2\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020\"2\u0006\u00107\u001a\u000208H\u0016J\u0010\u0010:\u001a\u00020\"2\u0006\u00107\u001a\u000208H\u0016J\b\u0010;\u001a\u00020\"H\u0016J\u0010\u0010<\u001a\u00020\"2\u0006\u0010=\u001a\u00020>H\u0016J\b\u0010?\u001a\u00020\"H\u0016J\u001a\u0010@\u001a\u00020\"2\u0006\u0010A\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0010\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0002J \u0010F\u001a\u00020\"2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u00062\b\u0010I\u001a\u0004\u0018\u00010JH\u0002J\u0010\u0010K\u001a\u00020\"2\u0006\u0010L\u001a\u00020MH\u0002J\u0016\u0010N\u001a\u00020\"2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u0006H\u0002J&\u0010Q\u001a\u00020\"2\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u000b0S2\b\u0010U\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010V\u001a\u00020\"2\u0006\u0010W\u001a\u00020XH\u0002J\u0016\u0010Y\u001a\u00020\"2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u0006H\u0002J\u0016\u0010\\\u001a\u00020\"2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020[0\u0006H\u0002J)\u0010^\u001a\u00020\"2\u0012\u0010_\u001a\n\u0012\u0006\b\u0001\u0012\u00020/0`\"\u00020/2\u0006\u0010a\u001a\u00020XH\u0002\u00a2\u0006\u0002\u0010bJ\b\u0010c\u001a\u00020\"H\u0002R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/CoinFragment;", "Lio/horizontalsystems/bankwallet/core/BaseFragment;", "Lio/horizontalsystems/chartview/Chart$Listener;", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "()V", "actions", "", "Lkotlin/Pair;", "Lio/horizontalsystems/xrateskit2/entities/ChartType;", "", "coinCode", "", "getCoinCode", "()Ljava/lang/String;", "coinCode$delegate", "Lkotlin/Lazy;", "coinTitle", "getCoinTitle", "coinTitle$delegate", "formatter", "Lio/horizontalsystems/bankwallet/core/IAppNumberFormatter;", "notificationMenuItem", "Landroid/view/MenuItem;", "viewModel", "Lio/horizontalsystems/bankwallet/modules/coin/CoinViewModel;", "getViewModel", "()Lio/horizontalsystems/bankwallet/modules/coin/CoinViewModel;", "viewModel$delegate", "vmFactory", "Lio/horizontalsystems/bankwallet/modules/coin/CoinModule$Factory;", "getVmFactory", "()Lio/horizontalsystems/bankwallet/modules/coin/CoinModule$Factory;", "vmFactory$delegate", "bindActions", "", "formatFiatShortened", "value", "Ljava/math/BigDecimal;", "symbol", "getHistogramColor", "", "(F)Ljava/lang/Integer;", "getRatingIcon", "Landroid/graphics/drawable/Drawable;", "rating", "observeData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onTabReselected", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabSelected", "onTabUnselected", "onTouchDown", "onTouchSelect", "point", "Lio/horizontalsystems/chartview/models/PointInfo;", "onTouchUp", "onViewCreated", "view", "removeLinkSpans", "Landroid/text/Spannable;", "spanned", "Landroid/text/Spanned;", "setCategoriesAndContractInfo", "categories", "Lio/horizontalsystems/xrateskit2/entities/CoinCategory;", "contractInfo", "Lio/horizontalsystems/bankwallet/modules/coin/ContractInfo;", "setCoinPerformance", "item", "Lio/horizontalsystems/bankwallet/modules/coin/CoinDetailsViewItem;", "setExtraPages", "pages", "Lio/horizontalsystems/bankwallet/modules/coin/CoinExtraPage;", "setLinks", "links", "", "Lio/horizontalsystems/xrateskit2/entities/LinkType;", "guideUrl", "setMacdInfoVisible", "visible", "", "setMarketData", "marketDataList", "Lio/horizontalsystems/bankwallet/modules/coin/CoinDataItem;", "setTvlData", "tvlDataList", "setViewVisibility", "views", "", "isVisible", "([Landroid/view/View;Z)V", "updateNotificationMenuItem", "Companion", "app_debug"})
public final class CoinFragment extends io.horizontalsystems.bankwallet.core.BaseFragment implements io.horizontalsystems.chartview.Chart.Listener, com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
    private final kotlin.Lazy coinTitle$delegate = null;
    private final kotlin.Lazy coinCode$delegate = null;
    private final kotlin.Lazy vmFactory$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final io.horizontalsystems.bankwallet.core.IAppNumberFormatter formatter = null;
    private android.view.MenuItem notificationMenuItem;
    private final java.util.List<kotlin.Pair<io.horizontalsystems.xrateskit2.entities.ChartType, java.lang.Integer>> actions = null;
    private static final int ABOUT_MAX_LINES = 8;
    private static final int ABOUT_TOGGLE_LINES = 2;
    private static final java.lang.String COIN_TYPE_KEY = "coin_type_key";
    private static final java.lang.String COIN_CODE_KEY = "coin_code_key";
    private static final java.lang.String COIN_TITLE_KEY = "coin_title_key";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.coin.CoinFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final java.lang.String getCoinTitle() {
        return null;
    }
    
    private final java.lang.String getCoinCode() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.coin.CoinModule.Factory getVmFactory() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.coin.CoinViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
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
    
    private final void updateNotificationMenuItem() {
    }
    
    @java.lang.Override()
    public void onTouchDown() {
    }
    
    @java.lang.Override()
    public void onTouchUp() {
    }
    
    @java.lang.Override()
    public void onTouchSelect(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.chartview.models.PointInfo point) {
    }
    
    @java.lang.Override()
    public void onTabSelected(@org.jetbrains.annotations.NotNull()
    com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    @java.lang.Override()
    public void onTabUnselected(@org.jetbrains.annotations.NotNull()
    com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    @java.lang.Override()
    public void onTabReselected(@org.jetbrains.annotations.NotNull()
    com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    private final void observeData() {
    }
    
    private final void setCoinPerformance(io.horizontalsystems.bankwallet.modules.coin.CoinDetailsViewItem item) {
    }
    
    private final void setMacdInfoVisible(boolean visible) {
    }
    
    private final void setExtraPages(java.util.List<? extends io.horizontalsystems.bankwallet.modules.coin.CoinExtraPage> pages) {
    }
    
    private final android.graphics.drawable.Drawable getRatingIcon(java.lang.String rating) {
        return null;
    }
    
    private final void setMarketData(java.util.List<io.horizontalsystems.bankwallet.modules.coin.CoinDataItem> marketDataList) {
    }
    
    private final void setTvlData(java.util.List<io.horizontalsystems.bankwallet.modules.coin.CoinDataItem> tvlDataList) {
    }
    
    private final void setLinks(java.util.Map<io.horizontalsystems.xrateskit2.entities.LinkType, java.lang.String> links, java.lang.String guideUrl) {
    }
    
    private final void setCategoriesAndContractInfo(java.util.List<io.horizontalsystems.xrateskit2.entities.CoinCategory> categories, io.horizontalsystems.bankwallet.modules.coin.ContractInfo contractInfo) {
    }
    
    private final android.text.Spannable removeLinkSpans(android.text.Spanned spanned) {
        return null;
    }
    
    private final java.lang.String formatFiatShortened(java.math.BigDecimal value, java.lang.String symbol) {
        return null;
    }
    
    private final java.lang.Integer getHistogramColor(float value) {
        return null;
    }
    
    private final void bindActions() {
    }
    
    private final void setViewVisibility(android.view.View[] views, boolean isVisible) {
    }
    
    public CoinFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/CoinFragment$Companion;", "", "()V", "ABOUT_MAX_LINES", "", "ABOUT_TOGGLE_LINES", "COIN_CODE_KEY", "", "COIN_TITLE_KEY", "COIN_TYPE_KEY", "prepareParams", "Landroid/os/Bundle;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "coinCode", "coinTitle", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle prepareParams(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
        java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
        java.lang.String coinTitle) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}