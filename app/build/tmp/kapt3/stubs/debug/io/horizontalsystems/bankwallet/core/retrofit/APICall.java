package io.horizontalsystems.bankwallet.core.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00040\u00032$\b\u0001\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\tH\'J@\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00040\u00032$\b\u0001\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\tH\'J@\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00040\u00032$\b\u0001\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\tH\'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u000fH\'\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/core/retrofit/APICall;", "", "changePassword", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "Lio/horizontalsystems/bankwallet/entities/response/ResponseData;", "param", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "forgotPassword", "login", "Lio/horizontalsystems/bankwallet/entities/response/UserData;", "register", "Lio/horizontalsystems/bankwallet/entities/response/RegisterResponse;", "Lio/horizontalsystems/bankwallet/entities/request/RegisterRequest;", "app_debug"})
public abstract interface APICall {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "register")
    public abstract io.reactivex.Observable<retrofit2.Response<io.horizontalsystems.bankwallet.entities.response.RegisterResponse>> register(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    io.horizontalsystems.bankwallet.entities.request.RegisterRequest param);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "login")
    public abstract io.reactivex.Observable<retrofit2.Response<io.horizontalsystems.bankwallet.entities.response.ResponseData<io.horizontalsystems.bankwallet.entities.response.UserData>>> login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.HashMap<java.lang.String, java.lang.String> param);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "forgot-password")
    public abstract io.reactivex.Observable<retrofit2.Response<io.horizontalsystems.bankwallet.entities.response.ResponseData<java.lang.Object>>> forgotPassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.HashMap<java.lang.String, java.lang.String> param);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "change-password")
    public abstract io.reactivex.Observable<retrofit2.Response<io.horizontalsystems.bankwallet.entities.response.ResponseData<java.lang.Object>>> changePassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.HashMap<java.lang.String, java.lang.String> param);
}