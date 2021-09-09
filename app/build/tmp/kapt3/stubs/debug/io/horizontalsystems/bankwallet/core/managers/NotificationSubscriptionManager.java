package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u000eH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/NotificationSubscriptionManager;", "Lio/horizontalsystems/bankwallet/core/INotificationSubscriptionManager;", "appDatabase", "Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;", "notificationNetworkWrapper", "Lio/horizontalsystems/bankwallet/core/notifications/NotificationNetworkWrapper;", "(Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;Lio/horizontalsystems/bankwallet/core/notifications/NotificationNetworkWrapper;)V", "dao", "Lio/horizontalsystems/bankwallet/core/storage/SubscriptionJobDao;", "ioScope", "Lkotlinx/coroutines/CoroutineScope;", "job", "Lkotlinx/coroutines/CompletableJob;", "addNewJobs", "", "jobs", "", "Lio/horizontalsystems/bankwallet/entities/SubscriptionJob;", "processJob", "subscriptionJob", "(Lio/horizontalsystems/bankwallet/entities/SubscriptionJob;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processJobs", "app_debug"})
public final class NotificationSubscriptionManager implements io.horizontalsystems.bankwallet.core.INotificationSubscriptionManager {
    private final io.horizontalsystems.bankwallet.core.storage.SubscriptionJobDao dao = null;
    private final kotlinx.coroutines.CompletableJob job = null;
    private final kotlinx.coroutines.CoroutineScope ioScope = null;
    private final io.horizontalsystems.bankwallet.core.notifications.NotificationNetworkWrapper notificationNetworkWrapper = null;
    
    @java.lang.Override()
    public void processJobs() {
    }
    
    @java.lang.Override()
    public void addNewJobs(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.SubscriptionJob> jobs) {
    }
    
    public NotificationSubscriptionManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.storage.AppDatabase appDatabase, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.notifications.NotificationNetworkWrapper notificationNetworkWrapper) {
        super();
    }
}