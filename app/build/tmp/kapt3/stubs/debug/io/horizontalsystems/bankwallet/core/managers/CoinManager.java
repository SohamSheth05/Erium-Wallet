package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0016\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR(\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000f*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R,\u0010\u0013\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/CoinManager;", "Lio/horizontalsystems/bankwallet/core/ICoinManager;", "coinKit", "Lio/horizontalsystems/coinkit2/CoinKit;", "appConfigProvider", "Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;", "(Lio/horizontalsystems/coinkit2/CoinKit;Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;)V", "coinAddedObservable", "Lio/reactivex/Flowable;", "", "Lio/horizontalsystems/coinkit2/models/Coin;", "getCoinAddedObservable", "()Lio/reactivex/Flowable;", "coinAddedSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "coins", "getCoins", "()Ljava/util/List;", "groupedCoins", "Lkotlin/Pair;", "getGroupedCoins", "()Lkotlin/Pair;", "getCoin", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "save", "", "app_debug"})
public final class CoinManager implements io.horizontalsystems.bankwallet.core.ICoinManager {
    private final io.reactivex.subjects.PublishSubject<java.util.List<io.horizontalsystems.coinkit2.models.Coin>> coinAddedSubject = null;
    private final io.horizontalsystems.coinkit2.CoinKit coinKit = null;
    private final io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<io.horizontalsystems.coinkit2.models.Coin>> getCoinAddedObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.coinkit2.models.Coin> getCoins() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.util.List<io.horizontalsystems.coinkit2.models.Coin>, java.util.List<io.horizontalsystems.coinkit2.models.Coin>> getGroupedCoins() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.coinkit2.models.Coin getCoin(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return null;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.coinkit2.models.Coin> coins) {
    }
    
    public CoinManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.CoinKit coinKit, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider) {
        super();
    }
}