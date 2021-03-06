package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/ServicePing;", "", "()V", "service", "Lio/horizontalsystems/bankwallet/core/managers/ServicePing$FullTransactionAPI;", "apiURL", "", "isSafeCall", "", "FullTransactionAPI", "app_debug"})
public final class ServicePing {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.managers.ServicePing INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.core.managers.ServicePing.FullTransactionAPI service(@org.jetbrains.annotations.NotNull()
    java.lang.String apiURL, boolean isSafeCall) {
        return null;
    }
    
    private ServicePing() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/ServicePing$FullTransactionAPI;", "", "ping", "Lio/reactivex/Flowable;", "path", "", "app_debug"})
    public static abstract interface FullTransactionAPI {
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET()
        public abstract io.reactivex.Flowable<java.lang.Object> ping(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Url()
        java.lang.String path);
    }
}