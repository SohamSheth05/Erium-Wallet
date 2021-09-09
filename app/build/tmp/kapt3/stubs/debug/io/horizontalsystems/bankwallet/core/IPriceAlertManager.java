package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J\u0011\u0010\n\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0011H&J(\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000fH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IPriceAlertManager;", "", "notificationChangedFlowable", "Lio/reactivex/Flowable;", "", "getNotificationChangedFlowable", "()Lio/reactivex/Flowable;", "deactivateAllNotifications", "disablePriceAlerts", "enablePriceAlerts", "fetchNotifications", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlertStates", "Lkotlin/Pair;", "Lio/horizontalsystems/bankwallet/entities/PriceAlert$ChangeState;", "Lio/horizontalsystems/bankwallet/entities/PriceAlert$TrendState;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "getPriceAlerts", "", "Lio/horizontalsystems/bankwallet/entities/PriceAlert;", "hasPriceAlert", "", "savePriceAlert", "coinName", "", "changeState", "trendState", "app_debug"})
public abstract interface IPriceAlertManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<kotlin.Unit> getNotificationChangedFlowable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bankwallet.entities.PriceAlert> getPriceAlerts();
    
    public abstract void savePriceAlert(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String coinName, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState changeState, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState trendState);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.Pair<io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState, io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState> getAlertStates(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType);
    
    public abstract boolean hasPriceAlert(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType);
    
    public abstract void deactivateAllNotifications();
    
    public abstract void enablePriceAlerts();
    
    public abstract void disablePriceAlerts();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchNotifications(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
}