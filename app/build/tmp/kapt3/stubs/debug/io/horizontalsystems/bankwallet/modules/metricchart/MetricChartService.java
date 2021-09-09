package io.horizontalsystems.bankwallet.modules.metricchart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "currency", "Lio/horizontalsystems/core/entities/Currency;", "fetcher", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$IMetricChartFetcher;", "(Lio/horizontalsystems/core/entities/Currency;Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$IMetricChartFetcher;)V", "chartInfoDisposable", "Lio/reactivex/disposables/Disposable;", "getCurrency", "()Lio/horizontalsystems/core/entities/Currency;", "stateObservable", "Lio/reactivex/subjects/BehaviorSubject;", "Lio/horizontalsystems/bankwallet/entities/DataState;", "", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$Item;", "getStateObservable", "()Lio/reactivex/subjects/BehaviorSubject;", "clear", "", "getTimePeriod", "Lio/horizontalsystems/xrateskit2/entities/TimePeriod;", "chartType", "Lio/horizontalsystems/chartview/ChartView$ChartType;", "updateChartInfo", "app_debug"})
public final class MetricChartService implements io.horizontalsystems.bankwallet.core.Clearable {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.entities.DataState<java.util.List<io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.Item>>> stateObservable = null;
    private io.reactivex.disposables.Disposable chartInfoDisposable;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.entities.Currency currency = null;
    private final io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.IMetricChartFetcher fetcher = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.entities.DataState<java.util.List<io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.Item>>> getStateObservable() {
        return null;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public final void updateChartInfo(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.chartview.ChartView.ChartType chartType) {
    }
    
    private final io.horizontalsystems.xrateskit2.entities.TimePeriod getTimePeriod(io.horizontalsystems.chartview.ChartView.ChartType chartType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.entities.Currency getCurrency() {
        return null;
    }
    
    public MetricChartService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.IMetricChartFetcher fetcher) {
        super();
    }
}