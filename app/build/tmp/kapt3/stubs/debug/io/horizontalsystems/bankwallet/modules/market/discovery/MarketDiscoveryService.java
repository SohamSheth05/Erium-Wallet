package io.horizontalsystems.bankwallet.modules.market.discovery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001c\u001a\u00020\u000bH\u0016J\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00120\u001e2\u0006\u0010 \u001a\u00020!H\u0016J\u001c\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00120\u001e2\u0006\u0010 \u001a\u00020!H\u0002J$\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00120\u001e2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0002J\u001c\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00120\u001e2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010&\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000b0\u000b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketDiscoveryService;", "Lio/horizontalsystems/bankwallet/modules/market/list/IMarketListFetcher;", "Lio/horizontalsystems/core/BackgroundManager$Listener;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "xRateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "backgroundManager", "Lio/horizontalsystems/core/BackgroundManager;", "(Lio/horizontalsystems/bankwallet/core/IRateManager;Lio/horizontalsystems/core/BackgroundManager;)V", "dataUpdatedAsync", "Lio/reactivex/Observable;", "", "getDataUpdatedAsync", "()Lio/reactivex/Observable;", "dataUpdatedSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "marketCategories", "", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "getMarketCategories", "()Ljava/util/List;", "value", "marketCategory", "getMarketCategory", "()Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "setMarketCategory", "(Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;)V", "clear", "fetchAsync", "Lio/reactivex/Single;", "Lio/horizontalsystems/bankwallet/modules/market/MarketItem;", "currency", "Lio/horizontalsystems/core/entities/Currency;", "getAllMarketItemsAsync", "getMarketItemsByCategoryAsync", "category", "getRatedMarketItemsAsync", "willEnterForeground", "app_debug"})
public final class MarketDiscoveryService implements io.horizontalsystems.bankwallet.modules.market.list.IMarketListFetcher, io.horizontalsystems.core.BackgroundManager.Listener, io.horizontalsystems.bankwallet.core.Clearable {
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> dataUpdatedSubject = null;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory marketCategory;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory> marketCategories = null;
    private final io.horizontalsystems.bankwallet.core.IRateManager xRateManager = null;
    private final io.horizontalsystems.core.BackgroundManager backgroundManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<kotlin.Unit> getDataUpdatedAsync() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<io.horizontalsystems.bankwallet.modules.market.MarketItem>> fetchAsync(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory getMarketCategory() {
        return null;
    }
    
    public final void setMarketCategory(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory> getMarketCategories() {
        return null;
    }
    
    @java.lang.Override()
    public void willEnterForeground() {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    private final io.reactivex.Single<java.util.List<io.horizontalsystems.bankwallet.modules.market.MarketItem>> getAllMarketItemsAsync(io.horizontalsystems.core.entities.Currency currency) {
        return null;
    }
    
    private final io.reactivex.Single<java.util.List<io.horizontalsystems.bankwallet.modules.market.MarketItem>> getRatedMarketItemsAsync(io.horizontalsystems.core.entities.Currency currency) {
        return null;
    }
    
    private final io.reactivex.Single<java.util.List<io.horizontalsystems.bankwallet.modules.market.MarketItem>> getMarketItemsByCategoryAsync(io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory category, io.horizontalsystems.core.entities.Currency currency) {
        return null;
    }
    
    public MarketDiscoveryService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager xRateManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.BackgroundManager backgroundManager) {
        super();
    }
    
    public void willEnterForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public void didEnterBackground() {
    }
}