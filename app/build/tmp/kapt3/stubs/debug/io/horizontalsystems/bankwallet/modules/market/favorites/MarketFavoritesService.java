package io.horizontalsystems.bankwallet.modules.market.favorites;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\rH\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\r0\r0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/favorites/MarketFavoritesService;", "Lio/horizontalsystems/bankwallet/modules/market/list/IMarketListFetcher;", "Lio/horizontalsystems/core/BackgroundManager$Listener;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "rateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "marketFavoritesManager", "Lio/horizontalsystems/bankwallet/core/managers/MarketFavoritesManager;", "backgroundManager", "Lio/horizontalsystems/core/BackgroundManager;", "(Lio/horizontalsystems/bankwallet/core/IRateManager;Lio/horizontalsystems/bankwallet/core/managers/MarketFavoritesManager;Lio/horizontalsystems/core/BackgroundManager;)V", "dataUpdatedAsync", "Lio/reactivex/Observable;", "", "getDataUpdatedAsync", "()Lio/reactivex/Observable;", "dataUpdatedSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "clear", "fetchAsync", "Lio/reactivex/Single;", "", "Lio/horizontalsystems/bankwallet/modules/market/MarketItem;", "currency", "Lio/horizontalsystems/core/entities/Currency;", "willEnterForeground", "app_debug"})
public final class MarketFavoritesService implements io.horizontalsystems.bankwallet.modules.market.list.IMarketListFetcher, io.horizontalsystems.core.BackgroundManager.Listener, io.horizontalsystems.bankwallet.core.Clearable {
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> dataUpdatedSubject = null;
    private final io.horizontalsystems.bankwallet.core.IRateManager rateManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.MarketFavoritesManager marketFavoritesManager = null;
    private final io.horizontalsystems.core.BackgroundManager backgroundManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<kotlin.Unit> getDataUpdatedAsync() {
        return null;
    }
    
    @java.lang.Override()
    public void willEnterForeground() {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<io.horizontalsystems.bankwallet.modules.market.MarketItem>> fetchAsync(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency) {
        return null;
    }
    
    public MarketFavoritesService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager rateManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.MarketFavoritesManager marketFavoritesManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.BackgroundManager backgroundManager) {
        super();
    }
    
    public void willEnterForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public void didEnterBackground() {
    }
}