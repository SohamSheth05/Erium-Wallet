package io.horizontalsystems.bankwallet.modules.metricchart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010)\u001a\u00020\'2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020-H\u0002J\u000e\u0010.\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010/\u001a\u00020-H\u0014J\u000e\u00100\u001a\u00020-2\u0006\u00101\u001a\u000202J\u001c\u00103\u001a\u00020-2\u0012\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\t05H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0015\u00a8\u00067"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartService;", "chartConfiguration", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$IMetricChartConfiguration;", "factory", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartFactory;", "clearables", "", "(Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartService;Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$IMetricChartConfiguration;Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartFactory;Ljava/util/List;)V", "chartType", "Lio/horizontalsystems/chartview/ChartView$ChartType;", "getChartType", "()Lio/horizontalsystems/chartview/ChartView$ChartType;", "setChartType", "(Lio/horizontalsystems/chartview/ChartView$ChartType;)V", "chartViewItemLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/bankwallet/modules/metricchart/ChartViewItem;", "getChartViewItemLiveData", "()Landroidx/lifecycle/MutableLiveData;", "description", "", "getDescription", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "loadingLiveData", "", "getLoadingLiveData", "selectedPointLiveData", "Lio/horizontalsystems/bankwallet/modules/metricchart/SelectedPoint;", "getSelectedPointLiveData", "title", "getTitle", "()I", "toastLiveData", "", "getToastLiveData", "convertErrorMessage", "it", "", "fetchChartInfo", "", "onChartTypeSelect", "onCleared", "onTouchSelect", "point", "Lio/horizontalsystems/chartview/models/PointInfo;", "sync", "dataState", "Lio/horizontalsystems/bankwallet/entities/DataState;", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$Item;", "app_debug"})
public final class MetricChartViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.metricchart.ChartViewItem> chartViewItemLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.metricchart.SelectedPoint> selectedPointLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> toastLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadingLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.chartview.ChartView.ChartType chartType = io.horizontalsystems.chartview.ChartView.ChartType.DAILY;
    private final int title = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer description = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final io.horizontalsystems.bankwallet.modules.metricchart.MetricChartService service = null;
    private final io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.IMetricChartConfiguration chartConfiguration = null;
    private final io.horizontalsystems.bankwallet.modules.metricchart.MetricChartFactory factory = null;
    private final java.util.List<io.horizontalsystems.bankwallet.modules.metricchart.MetricChartService> clearables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.metricchart.ChartViewItem> getChartViewItemLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.metricchart.SelectedPoint> getSelectedPointLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getToastLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.chartview.ChartView.ChartType getChartType() {
        return null;
    }
    
    public final void setChartType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.chartview.ChartView.ChartType p0) {
    }
    
    public final int getTitle() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDescription() {
        return null;
    }
    
    private final void sync(io.horizontalsystems.bankwallet.entities.DataState<? extends java.util.List<io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.Item>> dataState) {
    }
    
    public final void onChartTypeSelect(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.chartview.ChartView.ChartType chartType) {
    }
    
    public final void onTouchSelect(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.chartview.models.PointInfo point) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void fetchChartInfo() {
    }
    
    private final java.lang.String convertErrorMessage(java.lang.Throwable it) {
        return null;
    }
    
    public MetricChartViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.metricchart.MetricChartService service, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.IMetricChartConfiguration chartConfiguration, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.metricchart.MetricChartFactory factory, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.metricchart.MetricChartService> clearables) {
        super();
    }
}