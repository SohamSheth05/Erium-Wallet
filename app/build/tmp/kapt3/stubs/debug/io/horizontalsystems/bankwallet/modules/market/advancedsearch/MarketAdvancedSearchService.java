package io.horizontalsystems.bankwallet.modules.market.advancedsearch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010M\u001a\u00020\u0017H\u0016J\u0012\u0010N\u001a\u00020&2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010O\u001a\u0004\u0018\u00010\r2\u0006\u0010P\u001a\u00020QH\u0002J\u001c\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0\f0S2\u0006\u0010U\u001a\u00020VH\u0016J1\u0010W\u001a\u00020&2\u0018\u0010X\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001c2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001dH\u0002\u00a2\u0006\u0002\u0010YJ\u0010\u0010Z\u001a\u00020&2\u0006\u0010O\u001a\u00020\rH\u0002J\"\u0010[\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\\0S2\u0006\u0010U\u001a\u00020VH\u0002J\u0018\u0010]\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010P\u001a\u00020QH\u0002J\b\u0010^\u001a\u00020\u0017H\u0002R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000RH\u0010\u001e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001c2\u0018\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001c@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"RH\u0010#\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001c2\u0018\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001c@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R$\u0010\'\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020&@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010,\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020&@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R$\u0010/\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020&@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R$\u00103\u001a\u0002022\u0006\u0010\u000e\u001a\u000202@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107RH\u00108\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001c2\u0018\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001c@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010 \"\u0004\b:\u0010\"R$\u0010;\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020&@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010)\"\u0004\b=\u0010+R$\u0010>\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020&@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010)\"\u0004\b@\u0010+RH\u0010A\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001c2\u0018\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001c@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010 \"\u0004\bC\u0010\"R4\u0010D\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \n*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010F0F0EX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0010\u0010K\u001a\u0004\u0018\u00010LX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006_"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/advancedsearch/MarketAdvancedSearchService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "Lio/horizontalsystems/bankwallet/modules/market/list/IMarketListFetcher;", "xRateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "currencyManager", "Lio/horizontalsystems/core/ICurrencyManager;", "(Lio/horizontalsystems/bankwallet/core/IRateManager;Lio/horizontalsystems/core/ICurrencyManager;)V", "allTimeDeltaPercent", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "cache", "", "Lio/horizontalsystems/xrateskit2/entities/CoinMarket;", "value", "", "coinCount", "getCoinCount", "()I", "setCoinCount", "(I)V", "dataUpdatedAsync", "Lio/reactivex/Observable;", "", "getDataUpdatedAsync", "()Lio/reactivex/Observable;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "Lkotlin/Pair;", "", "filterLiquidity", "getFilterLiquidity", "()Lkotlin/Pair;", "setFilterLiquidity", "(Lkotlin/Pair;)V", "filterMarketCap", "getFilterMarketCap", "setFilterMarketCap", "", "filterOutperformedBnbOn", "getFilterOutperformedBnbOn", "()Z", "setFilterOutperformedBnbOn", "(Z)V", "filterOutperformedBtcOn", "getFilterOutperformedBtcOn", "setFilterOutperformedBtcOn", "filterOutperformedEthOn", "getFilterOutperformedEthOn", "setFilterOutperformedEthOn", "Lio/horizontalsystems/xrateskit2/entities/TimePeriod;", "filterPeriod", "getFilterPeriod", "()Lio/horizontalsystems/xrateskit2/entities/TimePeriod;", "setFilterPeriod", "(Lio/horizontalsystems/xrateskit2/entities/TimePeriod;)V", "filterPriceChange", "getFilterPriceChange", "setFilterPriceChange", "filterPriceCloseToAth", "getFilterPriceCloseToAth", "setFilterPriceCloseToAth", "filterPriceCloseToAtl", "getFilterPriceCloseToAtl", "setFilterPriceCloseToAtl", "filterVolume", "getFilterVolume", "setFilterVolume", "numberOfItemsAsync", "Lio/reactivex/subjects/BehaviorSubject;", "Lio/horizontalsystems/bankwallet/entities/DataState;", "getNumberOfItemsAsync", "()Lio/reactivex/subjects/BehaviorSubject;", "setNumberOfItemsAsync", "(Lio/reactivex/subjects/BehaviorSubject;)V", "topItemsDisposable", "Lio/reactivex/disposables/Disposable;", "clear", "closeToAllTime", "coinMarket", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "fetchAsync", "Lio/reactivex/Single;", "Lio/horizontalsystems/bankwallet/modules/market/MarketItem;", "currency", "Lio/horizontalsystems/core/entities/Currency;", "filterByRange", "filter", "(Lkotlin/Pair;Ljava/lang/Long;)Z", "filterCoinMarket", "getTopMarketList", "", "outperformed", "refreshCounter", "app_debug"})
public final class MarketAdvancedSearchService implements io.horizontalsystems.bankwallet.core.Clearable, io.horizontalsystems.bankwallet.modules.market.list.IMarketListFetcher {
    private final java.math.BigDecimal allTimeDeltaPercent = null;
    private int coinCount;
    @org.jetbrains.annotations.Nullable()
    private kotlin.Pair<java.lang.Long, java.lang.Long> filterMarketCap;
    @org.jetbrains.annotations.Nullable()
    private kotlin.Pair<java.lang.Long, java.lang.Long> filterVolume;
    @org.jetbrains.annotations.Nullable()
    private kotlin.Pair<java.lang.Long, java.lang.Long> filterLiquidity;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.xrateskit2.entities.TimePeriod filterPeriod = io.horizontalsystems.xrateskit2.entities.TimePeriod.HOUR_24;
    @org.jetbrains.annotations.Nullable()
    private kotlin.Pair<java.lang.Long, java.lang.Long> filterPriceChange;
    private boolean filterOutperformedBtcOn = false;
    private boolean filterOutperformedEthOn = false;
    private boolean filterOutperformedBnbOn = false;
    private boolean filterPriceCloseToAth = false;
    private boolean filterPriceCloseToAtl = false;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<kotlin.Unit> dataUpdatedAsync = null;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.entities.DataState<java.lang.Integer>> numberOfItemsAsync;
    private io.reactivex.disposables.Disposable topItemsDisposable;
    private io.reactivex.disposables.CompositeDisposable disposables;
    private java.util.List<io.horizontalsystems.xrateskit2.entities.CoinMarket> cache;
    private final io.horizontalsystems.bankwallet.core.IRateManager xRateManager = null;
    private final io.horizontalsystems.core.ICurrencyManager currencyManager = null;
    
    public final int getCoinCount() {
        return 0;
    }
    
    public final void setCoinCount(int value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Pair<java.lang.Long, java.lang.Long> getFilterMarketCap() {
        return null;
    }
    
    public final void setFilterMarketCap(@org.jetbrains.annotations.Nullable()
    kotlin.Pair<java.lang.Long, java.lang.Long> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Pair<java.lang.Long, java.lang.Long> getFilterVolume() {
        return null;
    }
    
    public final void setFilterVolume(@org.jetbrains.annotations.Nullable()
    kotlin.Pair<java.lang.Long, java.lang.Long> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Pair<java.lang.Long, java.lang.Long> getFilterLiquidity() {
        return null;
    }
    
    public final void setFilterLiquidity(@org.jetbrains.annotations.Nullable()
    kotlin.Pair<java.lang.Long, java.lang.Long> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.xrateskit2.entities.TimePeriod getFilterPeriod() {
        return null;
    }
    
    public final void setFilterPeriod(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.TimePeriod value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Pair<java.lang.Long, java.lang.Long> getFilterPriceChange() {
        return null;
    }
    
    public final void setFilterPriceChange(@org.jetbrains.annotations.Nullable()
    kotlin.Pair<java.lang.Long, java.lang.Long> value) {
    }
    
    public final boolean getFilterOutperformedBtcOn() {
        return false;
    }
    
    public final void setFilterOutperformedBtcOn(boolean value) {
    }
    
    public final boolean getFilterOutperformedEthOn() {
        return false;
    }
    
    public final void setFilterOutperformedEthOn(boolean value) {
    }
    
    public final boolean getFilterOutperformedBnbOn() {
        return false;
    }
    
    public final void setFilterOutperformedBnbOn(boolean value) {
    }
    
    public final boolean getFilterPriceCloseToAth() {
        return false;
    }
    
    public final void setFilterPriceCloseToAth(boolean value) {
    }
    
    public final boolean getFilterPriceCloseToAtl() {
        return false;
    }
    
    public final void setFilterPriceCloseToAtl(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<kotlin.Unit> getDataUpdatedAsync() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.entities.DataState<java.lang.Integer>> getNumberOfItemsAsync() {
        return null;
    }
    
    public final void setNumberOfItemsAsync(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.entities.DataState<java.lang.Integer>> p0) {
    }
    
    private final void refreshCounter() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<io.horizontalsystems.bankwallet.modules.market.MarketItem>> fetchAsync(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency) {
        return null;
    }
    
    private final io.reactivex.Single<java.util.Map<java.lang.Integer, io.horizontalsystems.xrateskit2.entities.CoinMarket>> getTopMarketList(io.horizontalsystems.core.entities.Currency currency) {
        return null;
    }
    
    private final boolean filterCoinMarket(io.horizontalsystems.xrateskit2.entities.CoinMarket coinMarket) {
        return false;
    }
    
    private final boolean filterByRange(kotlin.Pair<java.lang.Long, java.lang.Long> filter, java.lang.Long value) {
        return false;
    }
    
    private final io.horizontalsystems.xrateskit2.entities.CoinMarket coinMarket(io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return null;
    }
    
    private final boolean outperformed(java.math.BigDecimal value, io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return false;
    }
    
    private final boolean closeToAllTime(java.math.BigDecimal value) {
        return false;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public MarketAdvancedSearchService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager xRateManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ICurrencyManager currencyManager) {
        super();
    }
}