package io.horizontalsystems.bankwallet.core.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J4\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b`\fJ4\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b`\fJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000fJ4\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\"\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b`\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bankwallet/core/retrofit/APITask;", "Lio/horizontalsystems/bankwallet/core/retrofit/BaseAPITask;", "()V", "apiCall", "Lio/horizontalsystems/bankwallet/core/retrofit/APICall;", "forgotPassword", "Lio/reactivex/disposables/Disposable;", "listener", "Lio/horizontalsystems/bankwallet/core/retrofit/OnResponseListener;", "params", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "login", "register", "Lio/horizontalsystems/bankwallet/entities/request/RegisterRequest;", "resetPassword", "paramMap", "Singleton", "app_debug"})
public final class APITask extends io.horizontalsystems.bankwallet.core.retrofit.BaseAPITask {
    private final io.horizontalsystems.bankwallet.core.retrofit.APICall apiCall = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.retrofit.APITask.Singleton Singleton = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.disposables.Disposable register(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.retrofit.OnResponseListener listener, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.request.RegisterRequest params) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.disposables.Disposable login(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.retrofit.OnResponseListener listener, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.disposables.Disposable forgotPassword(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.retrofit.OnResponseListener listener, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.disposables.Disposable resetPassword(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.retrofit.OnResponseListener listener, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> paramMap) {
        return null;
    }
    
    public APITask() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/core/retrofit/APITask$Singleton;", "", "()V", "getInstance", "Lio/horizontalsystems/bankwallet/core/retrofit/APITask;", "app_debug"})
    public static final class Singleton {
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.retrofit.APITask getInstance() {
            return null;
        }
        
        private Singleton() {
            super();
        }
    }
}