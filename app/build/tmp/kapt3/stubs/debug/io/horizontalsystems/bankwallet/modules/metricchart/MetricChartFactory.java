package io.horizontalsystems.bankwallet.modules.metricchart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J,\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J \u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartFactory;", "", "numberFormatter", "Lio/horizontalsystems/bankwallet/core/IAppNumberFormatter;", "(Lio/horizontalsystems/bankwallet/core/IAppNumberFormatter;)V", "noChangesLimitPercent", "", "chartData", "Lio/horizontalsystems/chartview/ChartData;", "points", "", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$Item;", "convert", "Lio/horizontalsystems/bankwallet/modules/metricchart/ChartViewItem;", "items", "chartType", "Lio/horizontalsystems/chartview/ChartView$ChartType;", "valueType", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$ValueType;", "currency", "Lio/horizontalsystems/core/entities/Currency;", "formatFiatShortened", "", "value", "Ljava/math/BigDecimal;", "symbol", "getFormattedValue", "selectedPointViewItem", "Lio/horizontalsystems/bankwallet/modules/metricchart/SelectedPoint;", "point", "Lio/horizontalsystems/chartview/models/PointInfo;", "app_debug"})
public final class MetricChartFactory {
    private final float noChangesLimitPercent = 0.2F;
    private final io.horizontalsystems.bankwallet.core.IAppNumberFormatter numberFormatter = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.metricchart.ChartViewItem convert(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.Item> items, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.chartview.ChartView.ChartType chartType, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.ValueType valueType, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency) {
        return null;
    }
    
    private final io.horizontalsystems.chartview.ChartData chartData(java.util.List<io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.Item> points) {
        return null;
    }
    
    private final java.lang.String getFormattedValue(float value, io.horizontalsystems.core.entities.Currency currency, io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.ValueType valueType) {
        return null;
    }
    
    private final java.lang.String formatFiatShortened(java.math.BigDecimal value, java.lang.String symbol) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.metricchart.SelectedPoint selectedPointViewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.chartview.models.PointInfo point, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.ValueType valueType, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency) {
        return null;
    }
    
    public MetricChartFactory(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAppNumberFormatter numberFormatter) {
        super();
    }
}