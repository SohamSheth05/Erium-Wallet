package io.horizontalsystems.bankwallet.modules.market.metrics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0002J\u0016\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0005H\u0002J\u0006\u0010%\u001a\u00020&J\u0006\u0010\'\u001a\u00020&J\b\u0010(\u001a\u00020&H\u0014J\u0006\u0010)\u001a\u00020&J\u0006\u0010*\u001a\u00020&J\u0006\u0010+\u001a\u00020&J\u0016\u0010,\u001a\u00020&2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017\u00a8\u00060"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/metrics/MarketMetricsViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/market/metrics/MarketMetricsService;", "clearables", "", "Lio/horizontalsystems/bankwallet/core/Clearable;", "(Lio/horizontalsystems/bankwallet/modules/market/metrics/MarketMetricsService;Ljava/util/List;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "marketMetricsLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/bankwallet/modules/market/metrics/MarketMetricsWrapper;", "getMarketMetricsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "value", "metricsWrapper", "setMetricsWrapper", "(Lio/horizontalsystems/bankwallet/modules/market/metrics/MarketMetricsWrapper;)V", "showGlobalMarketMetricsPage", "Lio/horizontalsystems/core/SingleLiveEvent;", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricsType;", "getShowGlobalMarketMetricsPage", "()Lio/horizontalsystems/core/SingleLiveEvent;", "toastLiveData", "", "getToastLiveData", "convertErrorMessage", "it", "", "formatFiatShortened", "Ljava/math/BigDecimal;", "symbol", "getChartData", "Lio/horizontalsystems/chartview/ChartData;", "marketMetricsPoints", "Lio/horizontalsystems/bankwallet/modules/market/metrics/MarketMetricsPoint;", "on24VolumeClick", "", "onBtcDominanceClick", "onCleared", "onDefiCapClick", "onTvlInDefiClick", "refresh", "syncMarketMetrics", "dataState", "Lio/horizontalsystems/bankwallet/entities/DataState;", "Lio/horizontalsystems/bankwallet/modules/market/metrics/MarketMetricsItem;", "app_debug"})
public final class MarketMetricsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsWrapper> marketMetricsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> toastLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.metricchart.MetricsType> showGlobalMarketMetricsPage = null;
    private io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsWrapper metricsWrapper;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsService service = null;
    private final java.util.List<io.horizontalsystems.bankwallet.core.Clearable> clearables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsWrapper> getMarketMetricsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> getToastLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.metricchart.MetricsType> getShowGlobalMarketMetricsPage() {
        return null;
    }
    
    private final void setMetricsWrapper(io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsWrapper value) {
    }
    
    public final void refresh() {
    }
    
    private final void syncMarketMetrics(io.horizontalsystems.bankwallet.entities.DataState<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsItem> dataState) {
    }
    
    private final io.horizontalsystems.chartview.ChartData getChartData(java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> marketMetricsPoints) {
        return null;
    }
    
    private final java.lang.String formatFiatShortened(java.math.BigDecimal value, java.lang.String symbol) {
        return null;
    }
    
    private final java.lang.String convertErrorMessage(java.lang.Throwable it) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void onBtcDominanceClick() {
    }
    
    public final void on24VolumeClick() {
    }
    
    public final void onDefiCapClick() {
    }
    
    public final void onTvlInDefiClick() {
    }
    
    public MarketMetricsViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsService service, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.core.Clearable> clearables) {
        super();
    }
}