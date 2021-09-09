package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/ServiceChangeLogs;", "", "()V", "service", "Lio/horizontalsystems/bankwallet/core/managers/ServiceChangeLogs$ChangeLogsAPI;", "apiURL", "", "ChangeLogsAPI", "app_debug"})
public final class ServiceChangeLogs {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.managers.ServiceChangeLogs INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.core.managers.ServiceChangeLogs.ChangeLogsAPI service(@org.jetbrains.annotations.NotNull()
    java.lang.String apiURL) {
        return null;
    }
    
    private ServiceChangeLogs() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/ServiceChangeLogs$ChangeLogsAPI;", "", "getReleaseNotes", "Lio/reactivex/Single;", "Lcom/google/gson/JsonObject;", "path", "", "app_debug"})
    public static abstract interface ChangeLogsAPI {
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Headers(value = {"Content-Type: application/json"})
        @retrofit2.http.GET()
        public abstract io.reactivex.Single<com.google.gson.JsonObject> getReleaseNotes(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Url()
        java.lang.String path);
    }
}