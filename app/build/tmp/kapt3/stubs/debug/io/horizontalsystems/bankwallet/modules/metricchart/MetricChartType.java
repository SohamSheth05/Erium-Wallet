package io.horizontalsystems.bankwallet.modules.metricchart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartType;", "Landroid/os/Parcelable;", "()V", "Coin", "MarketGlobal", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartType$Coin;", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartType$MarketGlobal;", "app_debug"})
public abstract class MetricChartType implements android.os.Parcelable {
    
    private MetricChartType() {
        super();
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartType$Coin;", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartType;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "(Lio/horizontalsystems/coinkit2/models/CoinType;)V", "getCoinType", "()Lio/horizontalsystems/coinkit2/models/CoinType;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class Coin extends io.horizontalsystems.bankwallet.modules.metricchart.MetricChartType {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.coinkit2.models.CoinType coinType = null;
        public static final android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.metricchart.MetricChartType.Coin> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.CoinType getCoinType() {
            return null;
        }
        
        public Coin(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.CoinType coinType) {
            super();
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.metricchart.MetricChartType.Coin> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.horizontalsystems.bankwallet.modules.metricchart.MetricChartType.Coin[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.horizontalsystems.bankwallet.modules.metricchart.MetricChartType.Coin createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartType$MarketGlobal;", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricChartType;", "metricsType", "Lio/horizontalsystems/bankwallet/modules/metricchart/MetricsType;", "(Lio/horizontalsystems/bankwallet/modules/metricchart/MetricsType;)V", "getMetricsType", "()Lio/horizontalsystems/bankwallet/modules/metricchart/MetricsType;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class MarketGlobal extends io.horizontalsystems.bankwallet.modules.metricchart.MetricChartType {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.modules.metricchart.MetricsType metricsType = null;
        public static final android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.metricchart.MetricChartType.MarketGlobal> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.metricchart.MetricsType getMetricsType() {
            return null;
        }
        
        public MarketGlobal(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.metricchart.MetricsType metricsType) {
            super();
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.metricchart.MetricChartType.MarketGlobal> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.horizontalsystems.bankwallet.modules.metricchart.MetricChartType.MarketGlobal[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.horizontalsystems.bankwallet.modules.metricchart.MetricChartType.MarketGlobal createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
}