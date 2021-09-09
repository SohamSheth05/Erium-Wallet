package io.horizontalsystems.bankwallet.modules.market.metrics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 H2\u00020\u0001:\u0001HB\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0002\u0010\u0016J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0007H\u00c6\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0007H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0007H\u00c6\u0003J\t\u0010=\u001a\u00020\u0007H\u00c6\u0003J\t\u0010>\u001a\u00020\u0007H\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\u0007H\u00c6\u0003J\u00b7\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00072\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010E\u001a\u00020FH\u00d6\u0001J\t\u0010G\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\"\"\u0004\b)\u0010$R\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001aR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0018R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0018\u00a8\u0006I"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/metrics/MarketMetricsItem;", "", "currencyCode", "", "volume24h", "Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "volume24hDiff24h", "Ljava/math/BigDecimal;", "marketCap", "marketCapDiff24h", "btcDominance", "btcDominanceDiff24h", "defiMarketCap", "defiMarketCapDiff24h", "defiTvl", "defiTvlDiff24h", "btcDominancePoints", "", "Lio/horizontalsystems/bankwallet/modules/market/metrics/MarketMetricsPoint;", "volume24Points", "defiMarketCapPoints", "defiTvlPoints", "(Ljava/lang/String;Lio/horizontalsystems/bankwallet/entities/CurrencyValue;Ljava/math/BigDecimal;Lio/horizontalsystems/bankwallet/entities/CurrencyValue;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lio/horizontalsystems/bankwallet/entities/CurrencyValue;Ljava/math/BigDecimal;Lio/horizontalsystems/bankwallet/entities/CurrencyValue;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBtcDominance", "()Ljava/math/BigDecimal;", "setBtcDominance", "(Ljava/math/BigDecimal;)V", "getBtcDominanceDiff24h", "setBtcDominanceDiff24h", "getBtcDominancePoints", "()Ljava/util/List;", "getCurrencyCode", "()Ljava/lang/String;", "getDefiMarketCap", "()Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "setDefiMarketCap", "(Lio/horizontalsystems/bankwallet/entities/CurrencyValue;)V", "getDefiMarketCapDiff24h", "setDefiMarketCapDiff24h", "getDefiMarketCapPoints", "getDefiTvl", "setDefiTvl", "getDefiTvlDiff24h", "setDefiTvlDiff24h", "getDefiTvlPoints", "getMarketCap", "getMarketCapDiff24h", "getVolume24Points", "getVolume24h", "getVolume24hDiff24h", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_debug"})
public final class MarketMetricsItem {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currencyCode = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.entities.CurrencyValue volume24h = null;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal volume24hDiff24h = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.entities.CurrencyValue marketCap = null;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal marketCapDiff24h = null;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal btcDominance;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal btcDominanceDiff24h;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.entities.CurrencyValue defiMarketCap;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal defiMarketCapDiff24h;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.entities.CurrencyValue defiTvl;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal defiTvlDiff24h;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> btcDominancePoints = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> volume24Points = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> defiMarketCapPoints = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> defiTvlPoints = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsItem.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrencyCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue getVolume24h() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getVolume24hDiff24h() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue getMarketCap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getMarketCapDiff24h() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getBtcDominance() {
        return null;
    }
    
    public final void setBtcDominance(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getBtcDominanceDiff24h() {
        return null;
    }
    
    public final void setBtcDominanceDiff24h(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue getDefiMarketCap() {
        return null;
    }
    
    public final void setDefiMarketCap(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CurrencyValue p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getDefiMarketCapDiff24h() {
        return null;
    }
    
    public final void setDefiMarketCapDiff24h(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue getDefiTvl() {
        return null;
    }
    
    public final void setDefiTvl(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CurrencyValue p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getDefiTvlDiff24h() {
        return null;
    }
    
    public final void setDefiTvlDiff24h(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> getBtcDominancePoints() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> getVolume24Points() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> getDefiMarketCapPoints() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> getDefiTvlPoints() {
        return null;
    }
    
    public MarketMetricsItem(@org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CurrencyValue volume24h, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal volume24hDiff24h, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CurrencyValue marketCap, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal marketCapDiff24h, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal btcDominance, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal btcDominanceDiff24h, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CurrencyValue defiMarketCap, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal defiMarketCapDiff24h, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CurrencyValue defiTvl, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal defiTvlDiff24h, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> btcDominancePoints, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> volume24Points, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> defiMarketCapPoints, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> defiTvlPoints) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsItem copy(@org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CurrencyValue volume24h, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal volume24hDiff24h, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CurrencyValue marketCap, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal marketCapDiff24h, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal btcDominance, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal btcDominanceDiff24h, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CurrencyValue defiMarketCap, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal defiMarketCapDiff24h, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CurrencyValue defiTvl, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal defiTvlDiff24h, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> btcDominancePoints, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> volume24Points, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> defiMarketCapPoints, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsPoint> defiTvlPoints) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/metrics/MarketMetricsItem$Companion;", "", "()V", "createFromGlobalCoinMarket", "Lio/horizontalsystems/bankwallet/modules/market/metrics/MarketMetricsItem;", "globalCoinMarket", "Lio/horizontalsystems/xrateskit2/entities/GlobalCoinMarket;", "currency", "Lio/horizontalsystems/core/entities/Currency;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsItem createFromGlobalCoinMarket(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.xrateskit2.entities.GlobalCoinMarket globalCoinMarket, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.core.entities.Currency currency) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}