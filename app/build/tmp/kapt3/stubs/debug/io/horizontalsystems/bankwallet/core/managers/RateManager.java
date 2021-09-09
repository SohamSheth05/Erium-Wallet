package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J:\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001dH\u0016J,\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001d0\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u001fH\u0016J*\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001d0\u001a2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\u0006\u0010&\u001a\u00020\u0014H\u0016J$\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001d0\u001a2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0014H\u0016J\u001a\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00140*0\u001aH\u0016J#\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u001d0\u001a2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016\u00a2\u0006\u0002\u0010/J$\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u001d0\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u00102\u001a\u00020\u001fH\u0016J\u0016\u00103\u001a\b\u0012\u0004\u0012\u0002040\u001a2\u0006\u0010&\u001a\u00020\u0014H\u0016J\u001a\u00105\u001a\u0004\u0018\u0001062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u00107\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J,\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001d0\u001a2\u0006\u0010&\u001a\u00020\u00142\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u001fH\u0016J&\u0010<\u001a\b\u0012\u0004\u0012\u0002060\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010-\u001a\u00020.H\u0016J\"\u0010=\u001a\u0004\u0018\u0001062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010-\u001a\u00020.H\u0016J\u001a\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J0\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020?0*0\u00182\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010A\u001a\u00020B2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u001d2\u0006\u0010E\u001a\u00020\u0014H\u0016J,\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\u001d0\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u001f2\u0006\u00109\u001a\u00020:H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006H"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/RateManager;", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "context", "Landroid/content/Context;", "currencyManager", "Lio/horizontalsystems/core/ICurrencyManager;", "appConfigProvider", "Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;", "(Landroid/content/Context;Lio/horizontalsystems/core/ICurrencyManager;Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;)V", "kit", "Lio/horizontalsystems/xrateskit2/XRatesKit;", "getKit", "()Lio/horizontalsystems/xrateskit2/XRatesKit;", "kit$delegate", "Lkotlin/Lazy;", "chartInfo", "Lio/horizontalsystems/xrateskit2/entities/ChartInfo;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "currencyCode", "", "chartType", "Lio/horizontalsystems/xrateskit2/entities/ChartType;", "chartInfoObservable", "Lio/reactivex/Observable;", "coinMarketDetailsAsync", "Lio/reactivex/Single;", "Lio/horizontalsystems/xrateskit2/entities/CoinMarketDetails;", "rateDiffCoinCodes", "", "rateDiffPeriods", "Lio/horizontalsystems/xrateskit2/entities/TimePeriod;", "defiTvlPoints", "Lio/horizontalsystems/xrateskit2/entities/DefiTvlPoint;", "fetchDiffPeriod", "getCoinMarketList", "Lio/horizontalsystems/xrateskit2/entities/CoinMarket;", "coinTypes", "currency", "getCoinMarketListByCategory", "categoryId", "getCoinRatingsAsync", "", "getCryptoNews", "Lio/horizontalsystems/xrateskit2/entities/CryptoNews;", "timestamp", "", "(Ljava/lang/Long;)Lio/reactivex/Single;", "getGlobalCoinMarketPointsAsync", "Lio/horizontalsystems/xrateskit2/entities/GlobalCoinMarketPoint;", "timePeriod", "getGlobalMarketInfoAsync", "Lio/horizontalsystems/xrateskit2/entities/GlobalCoinMarket;", "getLatestRate", "Ljava/math/BigDecimal;", "getNotificationCoinCode", "getTopMarketList", "itemsCount", "", "diffPeriod", "historicalRate", "historicalRateCached", "latestRate", "Lio/horizontalsystems/xrateskit2/entities/LatestRate;", "latestRateObservable", "refresh", "", "searchCoins", "Lio/horizontalsystems/xrateskit2/entities/CoinData;", "searchText", "topDefiTvl", "Lio/horizontalsystems/xrateskit2/entities/DefiTvl;", "app_debug"})
public final class RateManager implements io.horizontalsystems.bankwallet.core.IRateManager {
    private final kotlin.Lazy kit$delegate = null;
    private final io.horizontalsystems.core.ICurrencyManager currencyManager = null;
    private final io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider = null;
    
    private final io.horizontalsystems.xrateskit2.XRatesKit getKit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.xrateskit2.entities.LatestRate latestRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.math.BigDecimal getLatestRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<io.horizontalsystems.xrateskit2.entities.LatestRate> latestRateObservable(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.Map<io.horizontalsystems.coinkit2.models.CoinType, io.horizontalsystems.xrateskit2.entities.LatestRate>> latestRateObservable(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.coinkit2.models.CoinType> coinTypes, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.math.BigDecimal historicalRateCached(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, long timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.math.BigDecimal> historicalRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, long timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.xrateskit2.entities.ChartInfo chartInfo(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.ChartType chartType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<io.horizontalsystems.xrateskit2.entities.ChartInfo> chartInfoObservable(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.ChartType chartType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<io.horizontalsystems.xrateskit2.entities.CoinMarketDetails> coinMarketDetailsAsync(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> rateDiffCoinCodes, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.xrateskit2.entities.TimePeriod> rateDiffPeriods) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<io.horizontalsystems.xrateskit2.entities.CoinMarket>> getTopMarketList(@org.jetbrains.annotations.NotNull()
    java.lang.String currency, int itemsCount, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.TimePeriod diffPeriod) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<io.horizontalsystems.xrateskit2.entities.CoinMarket>> getCoinMarketList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.coinkit2.models.CoinType> coinTypes, @org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<io.horizontalsystems.xrateskit2.entities.CoinMarket>> getCoinMarketListByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.Map<io.horizontalsystems.coinkit2.models.CoinType, java.lang.String>> getCoinRatingsAsync() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<io.horizontalsystems.xrateskit2.entities.GlobalCoinMarket> getGlobalMarketInfoAsync(@org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<io.horizontalsystems.xrateskit2.entities.GlobalCoinMarketPoint>> getGlobalCoinMarketPointsAsync(@org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.TimePeriod timePeriod) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.xrateskit2.entities.CoinData> searchCoins(@org.jetbrains.annotations.NotNull()
    java.lang.String searchText) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getNotificationCoinCode(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<io.horizontalsystems.xrateskit2.entities.DefiTvl>> topDefiTvl(@org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.TimePeriod fetchDiffPeriod, int itemsCount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<io.horizontalsystems.xrateskit2.entities.DefiTvlPoint>> defiTvlPoints(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.TimePeriod fetchDiffPeriod) {
        return null;
    }
    
    @java.lang.Override()
    public void refresh(@org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<io.horizontalsystems.xrateskit2.entities.CryptoNews>> getCryptoNews(@org.jetbrains.annotations.Nullable()
    java.lang.Long timestamp) {
        return null;
    }
    
    public RateManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider) {
        super();
    }
}