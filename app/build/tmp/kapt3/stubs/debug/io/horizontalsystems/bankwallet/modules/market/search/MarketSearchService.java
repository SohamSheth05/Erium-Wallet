package io.horizontalsystems.bankwallet.modules.market.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0002R7\u0010\u0005\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b \n*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/search/MarketSearchService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "xRateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "(Lio/horizontalsystems/bankwallet/core/IRateManager;)V", "itemsAsync", "Lio/reactivex/subjects/BehaviorSubject;", "Ljava/util/Optional;", "", "Lio/horizontalsystems/xrateskit2/entities/CoinData;", "kotlin.jvm.PlatformType", "getItemsAsync", "()Lio/reactivex/subjects/BehaviorSubject;", "value", "", "query", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "clear", "", "fetch", "app_debug"})
public final class MarketSearchService implements io.horizontalsystems.bankwallet.core.Clearable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String query = "";
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<java.util.Optional<java.util.List<io.horizontalsystems.xrateskit2.entities.CoinData>>> itemsAsync = null;
    private final io.horizontalsystems.bankwallet.core.IRateManager xRateManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuery() {
        return null;
    }
    
    public final void setQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<java.util.Optional<java.util.List<io.horizontalsystems.xrateskit2.entities.CoinData>>> getItemsAsync() {
        return null;
    }
    
    private final void fetch() {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public MarketSearchService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager xRateManager) {
        super();
    }
}