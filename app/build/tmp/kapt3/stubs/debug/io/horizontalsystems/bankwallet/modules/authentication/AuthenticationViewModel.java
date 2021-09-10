package io.horizontalsystems.bankwallet.modules.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0014\u001a\u00020\u00152\"\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018`\u0019J*\u0010\u001a\u001a\u00020\u00152\"\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018`\u0019J*\u0010\u001b\u001a\u00020\u00152\"\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018`\u0019J\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u001dR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\t\u00a8\u0006\u001e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/authentication/AuthenticationViewModel;", "Lio/horizontalsystems/bankwallet/modules/base/BaseViewModel;", "context", "Landroid/app/Application;", "(Landroid/app/Application;)V", "changePasswordObserver", "Landroidx/lifecycle/MutableLiveData;", "", "getChangePasswordObserver", "()Landroidx/lifecycle/MutableLiveData;", "getContext", "()Landroid/app/Application;", "forgotPasswordObserver", "getForgotPasswordObserver", "loginObserver", "Lio/horizontalsystems/bankwallet/entities/response/UserData;", "getLoginObserver", "registerObserver", "Lio/horizontalsystems/bankwallet/entities/response/RegisterResponse;", "getRegisterObserver", "callChangePassword", "", "param", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "callForgotPassword", "callLoginApi", "callRegisterAPI", "Lio/horizontalsystems/bankwallet/entities/request/RegisterRequest;", "app_debug"})
public final class AuthenticationViewModel extends io.horizontalsystems.bankwallet.modules.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.entities.response.UserData> loginObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.entities.response.RegisterResponse> registerObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> forgotPasswordObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> changePasswordObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.entities.response.UserData> getLoginObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.entities.response.RegisterResponse> getRegisterObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getForgotPasswordObserver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getChangePasswordObserver() {
        return null;
    }
    
    public final void callRegisterAPI(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.request.RegisterRequest param) {
    }
    
    public final void callLoginApi(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> param) {
    }
    
    public final void callForgotPassword(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> param) {
    }
    
    public final void callChangePassword(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> param) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getContext() {
        return null;
    }
    
    public AuthenticationViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application context) {
        super(null);
    }
}