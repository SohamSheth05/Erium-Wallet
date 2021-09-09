package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR*\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ICoinManager;", "", "coinAddedObservable", "Lio/reactivex/Flowable;", "", "Lio/horizontalsystems/coinkit2/models/Coin;", "getCoinAddedObservable", "()Lio/reactivex/Flowable;", "coins", "getCoins", "()Ljava/util/List;", "groupedCoins", "Lkotlin/Pair;", "getGroupedCoins", "()Lkotlin/Pair;", "getCoin", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "save", "", "app_debug"})
public abstract interface ICoinManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.List<io.horizontalsystems.coinkit2.models.Coin>> getCoinAddedObservable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.coinkit2.models.Coin> getCoins();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.Pair<java.util.List<io.horizontalsystems.coinkit2.models.Coin>, java.util.List<io.horizontalsystems.coinkit2.models.Coin>> getGroupedCoins();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.coinkit2.models.Coin getCoin(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType);
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.coinkit2.models.Coin> coins);
}