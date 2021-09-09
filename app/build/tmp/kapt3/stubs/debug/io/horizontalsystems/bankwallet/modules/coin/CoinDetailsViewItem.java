package io.horizontalsystems.bankwallet.modules.coin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u0015J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\rH\u00c6\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u008d\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u000207H\u00d6\u0001J\t\u00108\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010!\u00a8\u00069"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/CoinDetailsViewItem;", "", "currency", "Lio/horizontalsystems/core/entities/Currency;", "rateValue", "Ljava/math/BigDecimal;", "marketDataList", "", "Lio/horizontalsystems/bankwallet/modules/coin/CoinDataItem;", "rateHigh24h", "rateLow24h", "marketCapDiff24h", "coinMeta", "Lio/horizontalsystems/xrateskit2/entities/CoinMeta;", "rateDiffs", "Lio/horizontalsystems/bankwallet/modules/coin/RoiViewItem;", "guideUrl", "", "tvlInfo", "contractInfo", "Lio/horizontalsystems/bankwallet/modules/coin/ContractInfo;", "(Lio/horizontalsystems/core/entities/Currency;Ljava/math/BigDecimal;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lio/horizontalsystems/xrateskit2/entities/CoinMeta;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lio/horizontalsystems/bankwallet/modules/coin/ContractInfo;)V", "getCoinMeta", "()Lio/horizontalsystems/xrateskit2/entities/CoinMeta;", "getContractInfo", "()Lio/horizontalsystems/bankwallet/modules/coin/ContractInfo;", "getCurrency", "()Lio/horizontalsystems/core/entities/Currency;", "getGuideUrl", "()Ljava/lang/String;", "getMarketCapDiff24h", "()Ljava/math/BigDecimal;", "getMarketDataList", "()Ljava/util/List;", "getRateDiffs", "getRateHigh24h", "getRateLow24h", "getRateValue", "getTvlInfo", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class CoinDetailsViewItem {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.entities.Currency currency = null;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal rateValue = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.modules.coin.CoinDataItem> marketDataList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal rateHigh24h = null;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal rateLow24h = null;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal marketCapDiff24h = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.xrateskit2.entities.CoinMeta coinMeta = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.modules.coin.RoiViewItem> rateDiffs = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String guideUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.modules.coin.CoinDataItem> tvlInfo = null;
    @org.jetbrains.annotations.Nullable()
    private final io.horizontalsystems.bankwallet.modules.coin.ContractInfo contractInfo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.entities.Currency getCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getRateValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.coin.CoinDataItem> getMarketDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getRateHigh24h() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getRateLow24h() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getMarketCapDiff24h() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.xrateskit2.entities.CoinMeta getCoinMeta() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.coin.RoiViewItem> getRateDiffs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGuideUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.coin.CoinDataItem> getTvlInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.coin.ContractInfo getContractInfo() {
        return null;
    }
    
    public CoinDetailsViewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal rateValue, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.coin.CoinDataItem> marketDataList, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal rateHigh24h, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal rateLow24h, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal marketCapDiff24h, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.CoinMeta coinMeta, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.modules.coin.RoiViewItem> rateDiffs, @org.jetbrains.annotations.Nullable()
    java.lang.String guideUrl, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.coin.CoinDataItem> tvlInfo, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.coin.ContractInfo contractInfo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.entities.Currency component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.coin.CoinDataItem> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component4() {
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
    public final io.horizontalsystems.xrateskit2.entities.CoinMeta component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.coin.RoiViewItem> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.coin.CoinDataItem> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.coin.ContractInfo component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.coin.CoinDetailsViewItem copy(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal rateValue, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.coin.CoinDataItem> marketDataList, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal rateHigh24h, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal rateLow24h, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal marketCapDiff24h, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.CoinMeta coinMeta, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.modules.coin.RoiViewItem> rateDiffs, @org.jetbrains.annotations.Nullable()
    java.lang.String guideUrl, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.coin.CoinDataItem> tvlInfo, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.coin.ContractInfo contractInfo) {
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