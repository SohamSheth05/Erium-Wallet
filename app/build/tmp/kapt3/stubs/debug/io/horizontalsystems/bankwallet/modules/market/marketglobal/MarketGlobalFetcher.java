package io.horizontalsystems.bankwallet.modules.market.marketglobal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J$\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/marketglobal/MarketGlobalFetcher;", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$IMetricChartFetcher;", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$IMetricChartConfiguration;", "rateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "metricsType", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricsType;", "(Lio/horizontalsystems/bankwallet/core/IRateManager;Lio/horizontalsystems/bankwallet/modules/metricchart/MetricsType;)V", "description", "", "getDescription", "()Ljava/lang/Integer;", "title", "getTitle", "()I", "valueType", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$ValueType;", "getValueType", "()Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$ValueType;", "fetchSingle", "Lio/reactivex/Single;", "", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$Item;", "currencyCode", "", "timePeriod", "Lio/horizontalsystems/xrateskit2/entities/TimePeriod;", "app_debug"})
public final class MarketGlobalFetcher implements io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.IMetricChartFetcher, io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.IMetricChartConfiguration {
    private final int title = 0;
    private final int description = 0;
    private final io.horizontalsystems.bankwallet.core.IRateManager rateManager = null;
    private final io.horizontalsystems.bankwallet.modules.metricchart.MetricsType metricsType = null;
    
    @java.lang.Override()
    public int getTitle() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Integer getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.ValueType getValueType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.Item>> fetchSingle(@org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.TimePeriod timePeriod) {
        return null;
    }
    
    public MarketGlobalFetcher(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager rateManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.metricchart.MetricsType metricsType) {
        super();
    }
}