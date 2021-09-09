package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/NotificationManager;", "Lio/horizontalsystems/bankwallet/core/INotificationManager;", "Lio/horizontalsystems/core/BackgroundManager$Listener;", "androidNotificationManager", "Landroidx/core/app/NotificationManagerCompat;", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "(Landroidx/core/app/NotificationManagerCompat;Lio/horizontalsystems/bankwallet/core/ILocalStorage;)V", "enabled", "", "getEnabled", "()Z", "enabledInPhone", "getEnabledInPhone", "clear", "", "createNotificationChannel", "getPendingIntent", "Landroid/app/PendingIntent;", "show", "notification", "Lio/horizontalsystems/bankwallet/entities/AlertNotification;", "showNotification", "willEnterForeground", "Companion", "app_debug"})
public final class NotificationManager implements io.horizontalsystems.bankwallet.core.INotificationManager, io.horizontalsystems.core.BackgroundManager.Listener {
    private final androidx.core.app.NotificationManagerCompat androidNotificationManager = null;
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorage = null;
    private static final java.lang.String channelId = "priceAlert";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.managers.NotificationManager.Companion Companion = null;
    
    @java.lang.Override()
    public boolean getEnabledInPhone() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public void willEnterForeground() {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    @java.lang.Override()
    public void show(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.AlertNotification notification) {
    }
    
    private final void showNotification(io.horizontalsystems.bankwallet.entities.AlertNotification notification) {
    }
    
    private final android.app.PendingIntent getPendingIntent() {
        return null;
    }
    
    private final void createNotificationChannel() {
    }
    
    public NotificationManager(@org.jetbrains.annotations.NotNull()
    androidx.core.app.NotificationManagerCompat androidNotificationManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorage) {
        super();
    }
    
    public void willEnterForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public void didEnterBackground() {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/NotificationManager$Companion;", "", "()V", "channelId", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}