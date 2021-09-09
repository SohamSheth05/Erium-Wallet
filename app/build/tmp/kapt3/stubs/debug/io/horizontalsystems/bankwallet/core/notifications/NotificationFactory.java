package io.horizontalsystems.bankwallet.core.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0002\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bankwallet/core/notifications/NotificationFactory;", "", "()V", "getBodyText", "", "type", "Lio/horizontalsystems/bankwallet/core/notifications/NotificationFactory$NotificationType;", "coinCode", "topic", "args", "Lcom/google/gson/JsonArray;", "getMessageFromJson", "Lio/horizontalsystems/bankwallet/entities/AlertNotification;", "jsonObject", "Lcom/google/gson/JsonObject;", "getNotificationId", "", "getNotificationType", "NotificationType", "app_debug"})
public final class NotificationFactory {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.notifications.NotificationFactory INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.entities.AlertNotification getMessageFromJson(@org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject jsonObject) {
        return null;
    }
    
    private final java.lang.String getBodyText(io.horizontalsystems.bankwallet.core.notifications.NotificationFactory.NotificationType type, java.lang.String coinCode, java.lang.String topic, com.google.gson.JsonArray args) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.core.notifications.NotificationFactory.NotificationType getNotificationType(java.lang.String topic) {
        return null;
    }
    
    private final int getNotificationId(java.lang.String topic, java.lang.String coinCode) {
        return 0;
    }
    
    private NotificationFactory() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/core/notifications/NotificationFactory$NotificationType;", "", "(Ljava/lang/String;I)V", "Change", "Trend", "app_debug"})
    public static enum NotificationType {
        /*public static final*/ Change /* = new Change() */,
        /*public static final*/ Trend /* = new Trend() */;
        
        NotificationType() {
        }
    }
}