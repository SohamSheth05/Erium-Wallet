package io.horizontalsystems.bankwallet.core.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bankwallet/core/retrofit/API;", "", "()V", "Companion", "app_debug"})
public final class API {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "http://erium.eminentinfosystem.com/public/api/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGISTER = "register";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGIN = "login";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_PROFILE = "profile";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_PROFILE = "profile/3";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADD_WALLET_ADDRESS = "wallet";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANGE_PASSWORD = "change-password";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORGOT_PASSWORD = "forgot-password";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADD_MPIN = "mpin";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANGE_MPIN = "change-mpin";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORGOT_MPIN = "forgot-mpin";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.retrofit.API.Companion Companion = null;
    
    public API() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bankwallet/core/retrofit/API$Companion;", "", "()V", "ADD_MPIN", "", "ADD_WALLET_ADDRESS", "BASE_URL", "CHANGE_MPIN", "CHANGE_PASSWORD", "FORGOT_MPIN", "FORGOT_PASSWORD", "GET_PROFILE", "LOGIN", "REGISTER", "UPDATE_PROFILE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}