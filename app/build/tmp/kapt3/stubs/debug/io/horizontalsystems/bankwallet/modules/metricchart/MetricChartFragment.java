package io.horizontalsystems.bankwallet.modules.metricchart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\u001a\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0016H\u0002J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020\bH\u0002R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006)"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartFragment;", "Lio/horizontalsystems/bankwallet/ui/extensions/BaseBottomSheetDialogFragment;", "Lio/horizontalsystems/chartview/Chart$Listener;", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "()V", "actions", "", "Lkotlin/Pair;", "Lio/horizontalsystems/chartview/ChartView$ChartType;", "", "metricChartType", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartType;", "getMetricChartType", "()Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartType;", "metricChartType$delegate", "Lkotlin/Lazy;", "viewModel", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartViewModel;", "getViewModel", "()Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartViewModel;", "viewModel$delegate", "onTabReselected", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabSelected", "onTabUnselected", "onTouchDown", "onTouchSelect", "point", "Lio/horizontalsystems/chartview/models/PointInfo;", "onTouchUp", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setChartTabs", "setChartType", "type", "Companion", "app_debug"})
public final class MetricChartFragment extends io.horizontalsystems.bankwallet.ui.extensions.BaseBottomSheetDialogFragment implements io.horizontalsystems.chartview.Chart.Listener, com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
    private final kotlin.Lazy metricChartType$delegate = null;
    private final java.util.List<kotlin.Pair<io.horizontalsystems.chartview.ChartView.ChartType, java.lang.Integer>> actions = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private static final java.lang.String METRICS_CHART_TYPE_KEY = "metric_chart_type";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.metricchart.MetricChartFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final io.horizontalsystems.bankwallet.modules.metricchart.MetricChartType getMetricChartType() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.metricchart.MetricChartViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setChartTabs() {
    }
    
    private final void setChartType(io.horizontalsystems.chartview.ChartView.ChartType type) {
    }
    
    @java.lang.Override()
    public void onTabSelected(@org.jetbrains.annotations.NotNull()
    com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    @java.lang.Override()
    public void onTabUnselected(@org.jetbrains.annotations.Nullable()
    com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    @java.lang.Override()
    public void onTabReselected(@org.jetbrains.annotations.Nullable()
    com.google.android.material.tabs.TabLayout.Tab tab) {
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
    
    public MetricChartFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartFragment$Companion;", "", "()V", "METRICS_CHART_TYPE_KEY", "", "show", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "metricChartType", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartType;", "app_debug"})
    public static final class Companion {
        
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.metricchart.MetricChartType metricChartType) {
        }
        
        private Companion() {
            super();
        }
    }
}