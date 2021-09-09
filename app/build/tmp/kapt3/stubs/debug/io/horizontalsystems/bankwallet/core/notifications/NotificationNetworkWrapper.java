package io.horizontalsystems.bankwallet.core.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bankwallet/core/notifications/NotificationNetworkWrapper;", "", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "networkManager", "Lio/horizontalsystems/bankwallet/core/INetworkManager;", "appConfigProvider", "Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;", "(Lio/horizontalsystems/bankwallet/core/ILocalStorage;Lio/horizontalsystems/bankwallet/core/INetworkManager;Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;)V", "host", "", "notificationId", "getNotificationId", "()Ljava/lang/String;", "fetchNotifications", "Lretrofit2/Response;", "Lcom/google/gson/JsonObject;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processSubscription", "", "jobType", "Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$JobType;", "body", "(Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$JobType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NotificationNetworkWrapper {
    private final java.lang.String host = null;
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorage = null;
    private final io.horizontalsystems.bankwallet.core.INetworkManager networkManager = null;
    
    private final java.lang.String getNotificationId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object processSubscription(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.SubscriptionJob.JobType jobType, @org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchNotifications(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.google.gson.JsonObject>> p0) {
        return null;
    }
    
    public NotificationNetworkWrapper(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.INetworkManager networkManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider) {
        super();
    }
}