package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/ServiceNotifications;", "", "()V", "service", "Lio/horizontalsystems/bankwallet/core/managers/ServiceNotifications$NotificationsAPI;", "apiURL", "", "NotificationsAPI", "app_debug"})
public final class ServiceNotifications {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.managers.ServiceNotifications INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.core.managers.ServiceNotifications.NotificationsAPI service(@org.jetbrains.annotations.NotNull()
    java.lang.String apiURL) {
        return null;
    }
    
    private ServiceNotifications() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J%\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/ServiceNotifications$NotificationsAPI;", "", "getNotifications", "Lretrofit2/Response;", "Lcom/google/gson/JsonObject;", "path", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribe", "body", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unsubscribe", "app_debug"})
    public static abstract interface NotificationsAPI {
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.Headers(value = {"Content-Type: application/json"})
        @retrofit2.http.GET()
        public abstract java.lang.Object getNotifications(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Url()
        java.lang.String path, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super retrofit2.Response<com.google.gson.JsonObject>> p1);
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.Headers(value = {"Content-Type: application/json"})
        @retrofit2.http.POST()
        public abstract java.lang.Object subscribe(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Url()
        java.lang.String path, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Body()
        java.lang.String body, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.google.gson.JsonObject> p2);
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.Headers(value = {"Content-Type: application/json"})
        @retrofit2.http.POST()
        public abstract java.lang.Object unsubscribe(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Url()
        java.lang.String path, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Body()
        java.lang.String body, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.google.gson.JsonObject> p2);
    }
}