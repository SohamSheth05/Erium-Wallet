package io.horizontalsystems.bankwallet.modules.metricchart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule;", "", "()V", "Factory", "IMetricChartConfiguration", "IMetricChartFetcher", "Item", "ValueType", "app_debug"})
public final class MetricChartModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule INSTANCE = null;
    
    private MetricChartModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "metricsChartType", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartType;", "(Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartType;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final io.horizontalsystems.bankwallet.modules.metricchart.MetricChartType metricsChartType = null;
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.metricchart.MetricChartType metricsChartType) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$IMetricChartFetcher;", "", "fetchSingle", "Lio/reactivex/Single;", "", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$Item;", "currencyCode", "", "timePeriod", "Lio/horizontalsystems/xrateskit2/entities/TimePeriod;", "app_debug"})
    public static abstract interface IMetricChartFetcher {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Single<java.util.List<io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.Item>> fetchSingle(@org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.xrateskit2.entities.TimePeriod timePeriod);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$IMetricChartConfiguration;", "", "description", "", "getDescription", "()Ljava/lang/Integer;", "title", "getTitle", "()I", "valueType", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$ValueType;", "getValueType", "()Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$ValueType;", "app_debug"})
    public static abstract interface IMetricChartConfiguration {
        
        public abstract int getTitle();
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Integer getDescription();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.ValueType getValueType();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$Item;", "", "value", "Ljava/math/BigDecimal;", "timestamp", "", "(Ljava/math/BigDecimal;J)V", "getTimestamp", "()J", "getValue", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Item {
        @org.jetbrains.annotations.NotNull()
        private final java.math.BigDecimal value = null;
        private final long timestamp = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal getValue() {
            return null;
        }
        
        public final long getTimestamp() {
            return 0L;
        }
        
        public Item(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal value, long timestamp) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal component1() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.metricchart.MetricChartModule.Item copy(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal value, long timestamp) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartModule$ValueType;", "", "(Ljava/lang/String;I)V", "Percent", "CompactCurrencyValue", "CurrencyValue", "app_debug"})
    public static enum ValueType {
        /*public static final*/ Percent /* = new Percent() */,
        /*public static final*/ CompactCurrencyValue /* = new CompactCurrencyValue() */,
        /*public static final*/ CurrencyValue /* = new CurrencyValue() */;
        
        ValueType() {
        }
    }
}