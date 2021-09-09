package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J:\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010H&J,\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00100\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0012H&J*\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00100\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u0019\u001a\u00020\u0007H&J$\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00100\r2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H&J\u001a\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u001d0\rH&J%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00100\r2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H&\u00a2\u0006\u0002\u0010\"J$\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00100\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0012H&J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\r2\u0006\u0010\u0019\u001a\u00020\u0007H&J\u001a\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010*\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J,\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00100\r2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0012H&J&\u0010/\u001a\b\u0012\u0004\u0012\u00020)0\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!H&J\"\u00100\u001a\u0004\u0018\u00010)2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!H&J\u001a\u00101\u001a\u0004\u0018\u0001022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u00103\u001a\b\u0012\u0004\u0012\u0002020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J0\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002020\u001d0\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u00104\u001a\u0002052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00102\u0006\u00108\u001a\u00020\u0007H&J,\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00100\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010,\u001a\u00020-H&\u00a8\u0006;"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IRateManager;", "", "chartInfo", "Lio/horizontalsystems/xrateskit2/entities/ChartInfo;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "currencyCode", "", "chartType", "Lio/horizontalsystems/xrateskit2/entities/ChartType;", "chartInfoObservable", "Lio/reactivex/Observable;", "coinMarketDetailsAsync", "Lio/reactivex/Single;", "Lio/horizontalsystems/xrateskit2/entities/CoinMarketDetails;", "rateDiffCoinCodes", "", "rateDiffPeriods", "Lio/horizontalsystems/xrateskit2/entities/TimePeriod;", "defiTvlPoints", "Lio/horizontalsystems/xrateskit2/entities/DefiTvlPoint;", "fetchDiffPeriod", "getCoinMarketList", "Lio/horizontalsystems/xrateskit2/entities/CoinMarket;", "coinTypes", "currency", "getCoinMarketListByCategory", "categoryId", "getCoinRatingsAsync", "", "getCryptoNews", "Lio/horizontalsystems/xrateskit2/entities/CryptoNews;", "timestamp", "", "(Ljava/lang/Long;)Lio/reactivex/Single;", "getGlobalCoinMarketPointsAsync", "Lio/horizontalsystems/xrateskit2/entities/GlobalCoinMarketPoint;", "timePeriod", "getGlobalMarketInfoAsync", "Lio/horizontalsystems/xrateskit2/entities/GlobalCoinMarket;", "getLatestRate", "Ljava/math/BigDecimal;", "getNotificationCoinCode", "getTopMarketList", "itemsCount", "", "diffPeriod", "historicalRate", "historicalRateCached", "latestRate", "Lio/horizontalsystems/xrateskit2/entities/LatestRate;", "latestRateObservable", "refresh", "", "searchCoins", "Lio/horizontalsystems/xrateskit2/entities/CoinData;", "searchText", "topDefiTvl", "Lio/horizontalsystems/xrateskit2/entities/DefiTvl;", "app_debug"})
public abstract interface IRateManager {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.xrateskit2.entities.LatestRate latestRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.math.BigDecimal getLatestRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<io.horizontalsystems.xrateskit2.entities.LatestRate> latestRateObservable(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.Map<io.horizontalsystems.coinkit2.models.CoinType, io.horizontalsystems.xrateskit2.entities.LatestRate>> latestRateObservable(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.coinkit2.models.CoinType> coinTypes, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.math.BigDecimal historicalRateCached(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, long timestamp);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.math.BigDecimal> historicalRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, long timestamp);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.xrateskit2.entities.ChartInfo chartInfo(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.ChartType chartType);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<io.horizontalsystems.xrateskit2.entities.ChartInfo> chartInfoObservable(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.ChartType chartType);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<io.horizontalsystems.xrateskit2.entities.CoinMarketDetails> coinMarketDetailsAsync(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> rateDiffCoinCodes, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.xrateskit2.entities.TimePeriod> rateDiffPeriods);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<io.horizontalsystems.xrateskit2.entities.CoinMarket>> getTopMarketList(@org.jetbrains.annotations.NotNull()
    java.lang.String currency, int itemsCount, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.TimePeriod diffPeriod);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<io.horizontalsystems.xrateskit2.entities.CoinMarket>> getCoinMarketList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.coinkit2.models.CoinType> coinTypes, @org.jetbrains.annotations.NotNull()
    java.lang.String currency);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<io.horizontalsystems.xrateskit2.entities.CoinMarket>> getCoinMarketListByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String currency);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.Map<io.horizontalsystems.coinkit2.models.CoinType, java.lang.String>> getCoinRatingsAsync();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<io.horizontalsystems.xrateskit2.entities.GlobalCoinMarket> getGlobalMarketInfoAsync(@org.jetbrains.annotations.NotNull()
    java.lang.String currency);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<io.horizontalsystems.xrateskit2.entities.GlobalCoinMarketPoint>> getGlobalCoinMarketPointsAsync(@org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.TimePeriod timePeriod);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.xrateskit2.entities.CoinData> searchCoins(@org.jetbrains.annotations.NotNull()
    java.lang.String searchText);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getNotificationCoinCode(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<io.horizontalsystems.xrateskit2.entities.DefiTvl>> topDefiTvl(@org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.TimePeriod fetchDiffPeriod, int itemsCount);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<io.horizontalsystems.xrateskit2.entities.DefiTvlPoint>> defiTvlPoints(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.TimePeriod fetchDiffPeriod);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<io.horizontalsystems.xrateskit2.entities.CryptoNews>> getCryptoNews(@org.jetbrains.annotations.Nullable()
    java.lang.Long timestamp);
    
    public abstract void refresh(@org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}