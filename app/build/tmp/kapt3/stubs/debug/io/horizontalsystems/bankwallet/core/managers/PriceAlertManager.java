package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 52\u00020\u0001:\u00015B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u0019\u001a\u00020\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\u0011\u0010\u001c\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010\"\u001a\u00020#H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\u0010\u0010\'\u001a\u00020(2\u0006\u0010\"\u001a\u00020#H\u0016J(\u0010)\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020!H\u0016J \u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020&2\u0006\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020!H\u0002J\u001e\u0010.\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u00103\u001a\u000204H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00130\u00130\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00066"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/PriceAlertManager;", "Lio/horizontalsystems/bankwallet/core/IPriceAlertManager;", "appDatabase", "Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;", "notificationSubscriptionManager", "Lio/horizontalsystems/bankwallet/core/INotificationSubscriptionManager;", "notificationManager", "Lio/horizontalsystems/bankwallet/core/INotificationManager;", "localStorageManager", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "notificationNetworkWrapper", "Lio/horizontalsystems/bankwallet/core/notifications/NotificationNetworkWrapper;", "backgroundManager", "Lio/horizontalsystems/core/BackgroundManager;", "(Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;Lio/horizontalsystems/bankwallet/core/INotificationSubscriptionManager;Lio/horizontalsystems/bankwallet/core/INotificationManager;Lio/horizontalsystems/bankwallet/core/ILocalStorage;Lio/horizontalsystems/bankwallet/core/notifications/NotificationNetworkWrapper;Lio/horizontalsystems/core/BackgroundManager;)V", "dao", "Lio/horizontalsystems/bankwallet/core/storage/PriceAlertsDao;", "notificationChangedFlowable", "Lio/reactivex/Flowable;", "", "getNotificationChangedFlowable", "()Lio/reactivex/Flowable;", "notificationChangedSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "deactivateAllNotifications", "disablePriceAlerts", "enablePriceAlerts", "fetchNotifications", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlertStates", "Lkotlin/Pair;", "Lio/horizontalsystems/bankwallet/entities/PriceAlert$ChangeState;", "Lio/horizontalsystems/bankwallet/entities/PriceAlert$TrendState;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "getPriceAlerts", "", "Lio/horizontalsystems/bankwallet/entities/PriceAlert;", "hasPriceAlert", "", "savePriceAlert", "coinName", "", "changeState", "trendState", "updateSubscription", "newAlert", "oldChangeState", "oldTrendState", "alerts", "jobType", "Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$JobType;", "Companion", "app_debug"})
public final class PriceAlertManager implements io.horizontalsystems.bankwallet.core.IPriceAlertManager {
    private final io.horizontalsystems.bankwallet.core.storage.PriceAlertsDao dao = null;
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> notificationChangedSubject = null;
    private final io.horizontalsystems.bankwallet.core.INotificationSubscriptionManager notificationSubscriptionManager = null;
    private final io.horizontalsystems.bankwallet.core.INotificationManager notificationManager = null;
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorageManager = null;
    private final io.horizontalsystems.bankwallet.core.notifications.NotificationNetworkWrapper notificationNetworkWrapper = null;
    private final io.horizontalsystems.core.BackgroundManager backgroundManager = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.managers.PriceAlertManager.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getNotificationChangedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.entities.PriceAlert> getPriceAlerts() {
        return null;
    }
    
    @java.lang.Override()
    public void savePriceAlert(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String coinName, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState changeState, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState trendState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState, io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState> getAlertStates(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return null;
    }
    
    @java.lang.Override()
    public boolean hasPriceAlert(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return false;
    }
    
    @java.lang.Override()
    public void deactivateAllNotifications() {
    }
    
    @java.lang.Override()
    public void enablePriceAlerts() {
    }
    
    @java.lang.Override()
    public void disablePriceAlerts() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchNotifications(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    private final void updateSubscription(java.util.List<io.horizontalsystems.bankwallet.entities.PriceAlert> alerts, io.horizontalsystems.bankwallet.entities.SubscriptionJob.JobType jobType) {
    }
    
    private final void updateSubscription(io.horizontalsystems.bankwallet.entities.PriceAlert newAlert, io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState oldChangeState, io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState oldTrendState) {
    }
    
    public PriceAlertManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.storage.AppDatabase appDatabase, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.INotificationSubscriptionManager notificationSubscriptionManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.INotificationManager notificationManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorageManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.notifications.NotificationNetworkWrapper notificationNetworkWrapper, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.BackgroundManager backgroundManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/PriceAlertManager$Companion;", "", "()V", "getChangeSubscriptionJob", "Lio/horizontalsystems/bankwallet/entities/SubscriptionJob;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "changeState", "Lio/horizontalsystems/bankwallet/entities/PriceAlert$ChangeState;", "subscribeType", "Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$JobType;", "getTrendSubscriptionJob", "trendState", "Lio/horizontalsystems/bankwallet/entities/PriceAlert$TrendState;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.SubscriptionJob getChangeSubscriptionJob(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState changeState, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.SubscriptionJob.JobType subscribeType) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.SubscriptionJob getTrendSubscriptionJob(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState trendState, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.SubscriptionJob.JobType subscribeType) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}