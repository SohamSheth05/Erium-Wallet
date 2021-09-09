package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\r0\r0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/MarketFavoritesManager;", "", "appDatabase", "Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;", "(Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;)V", "dao", "Lio/horizontalsystems/bankwallet/core/storage/MarketFavoritesDao;", "getDao", "()Lio/horizontalsystems/bankwallet/core/storage/MarketFavoritesDao;", "dao$delegate", "Lkotlin/Lazy;", "dataUpdatedAsync", "Lio/reactivex/Observable;", "", "getDataUpdatedAsync", "()Lio/reactivex/Observable;", "dataUpdatedSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "add", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "getAll", "", "Lio/horizontalsystems/bankwallet/core/storage/FavoriteCoin;", "isCoinInFavorites", "", "remove", "app_debug"})
public final class MarketFavoritesManager {
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> dataUpdatedSubject = null;
    private final kotlin.Lazy dao$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<kotlin.Unit> getDataUpdatedAsync() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.core.storage.MarketFavoritesDao getDao() {
        return null;
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType) {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.core.storage.FavoriteCoin> getAll() {
        return null;
    }
    
    public final boolean isCoinInFavorites(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return false;
    }
    
    public MarketFavoritesManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.storage.AppDatabase appDatabase) {
        super();
    }
}