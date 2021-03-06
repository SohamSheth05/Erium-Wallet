package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/ServiceFullTransaction;", "", "()V", "service", "Lio/horizontalsystems/bankwallet/core/managers/ServiceFullTransaction$FullTransactionAPI;", "apiURL", "", "isSafeCall", "", "FullTransactionAPI", "app_debug"})
public final class ServiceFullTransaction {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.managers.ServiceFullTransaction INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.core.managers.ServiceFullTransaction.FullTransactionAPI service(@org.jetbrains.annotations.NotNull()
    java.lang.String apiURL, boolean isSafeCall) {
        return null;
    }
    
    private ServiceFullTransaction() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH\'\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/ServiceFullTransaction$FullTransactionAPI;", "", "getFullTransaction", "Lio/reactivex/Flowable;", "Lcom/google/gson/JsonObject;", "path", "", "getFullTransactionWithPost", "body", "", "app_debug"})
    public static abstract interface FullTransactionAPI {
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Headers(value = {"Content-Type: application/json"})
        @retrofit2.http.GET()
        public abstract io.reactivex.Flowable<com.google.gson.JsonObject> getFullTransaction(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Url()
        java.lang.String path);
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Headers(value = {"Content-Type: application/json"})
        @retrofit2.http.POST()
        public abstract io.reactivex.Flowable<com.google.gson.JsonObject> getFullTransactionWithPost(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Url()
        java.lang.String path, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Body()
        java.util.Map<java.lang.String, java.lang.String> body);
    }
}