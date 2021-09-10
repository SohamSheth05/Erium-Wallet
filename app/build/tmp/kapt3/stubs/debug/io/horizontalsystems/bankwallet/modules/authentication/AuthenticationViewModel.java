package io.horizontalsystems.bankwallet.modules.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0017\u001a\u00020\u00182\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001aj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\u001bJ\u0006\u0010\u001c\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/authentication/AuthenticationViewModel;", "Lio/horizontalsystems/bankwallet/modules/base/BaseViewModel;", "context", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getContext", "()Landroid/app/Application;", "email", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getEmail", "()Landroidx/databinding/ObservableField;", "setEmail", "(Landroidx/databinding/ObservableField;)V", "loginObserver", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/bankwallet/entities/response/UserData;", "getLoginObserver", "()Landroidx/lifecycle/MutableLiveData;", "password", "getPassword", "setPassword", "callLoginApi", "", "param", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "callRegisterAPI", "app_debug"})
public final class AuthenticationViewModel extends io.horizontalsystems.bankwallet.modules.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> email;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> password;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.entities.response.UserData> loginObserver = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.entities.response.UserData> getLoginObserver() {
        return null;
    }
    
    public final void callRegisterAPI() {
    }
    
    public final void callLoginApi(@org.jetbrains.annotations.NotNull()
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