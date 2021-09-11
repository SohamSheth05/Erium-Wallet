package io.horizontalsystems.bankwallet.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\bJ\u0015\u0010\u0019\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0014J!\u0010 \u001a\u00020\b*\u00020\u000b2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\"H\u0082\bJ4\u0010$\u001a\u0004\u0018\u0001H%\"\n\b\u0000\u0010%\u0018\u0001*\u00020\u0001*\u00020\u000b2\u0006\u0010&\u001a\u00020\u00042\n\b\u0002\u0010\'\u001a\u0004\u0018\u0001H%H\u0086\n\u00a2\u0006\u0002\u0010(J\u001f\u0010)\u001a\u00020\b*\u00020\u000b2\u0006\u0010&\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0086\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006+"}, d2 = {"Lio/horizontalsystems/bankwallet/core/utils/PreferenceHelper;", "", "()V", "APP_PREF", "", "getAPP_PREF", "()Ljava/lang/String;", "accessToken", "", "token", "customPrefs", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "name", "defaultPrefs", "getAccessToken", "getSetupSecurityCounter", "", "getUserDetails", "Lio/horizontalsystems/bankwallet/entities/response/UserData;", "isFromChangePassword", "", "isUserLogin", "logout", "setIsFromChangePassword", "(Ljava/lang/Boolean;)V", "setSetupSecurityCounter", "open", "(Ljava/lang/Integer;)V", "setUserDetails", "request", "edit", "operation", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "get", "T", "key", "defaultValue", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "set", "value", "app_debug"})
public final class PreferenceHelper {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String APP_PREF = "APP_PREF";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.utils.PreferenceHelper INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAPP_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences defaultPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences customPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    private final void edit(android.content.SharedPreferences $this$edit, kotlin.jvm.functions.Function1<? super android.content.SharedPreferences.Editor, kotlin.Unit> operation) {
    }
    
    /**
     * puts a key value pair in shared prefs if doesn't exists, otherwise updates value on given [key]
     */
    public final void set(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$set, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    public final void logout() {
    }
    
    public final void setUserDetails(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.response.UserData request) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.entities.response.UserData getUserDetails() {
        return null;
    }
    
    public final boolean isUserLogin() {
        return false;
    }
    
    public final void setSetupSecurityCounter(@org.jetbrains.annotations.Nullable()
    java.lang.Integer open) {
    }
    
    public final int getSetupSecurityCounter() {
        return 0;
    }
    
    public final void accessToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    public final void setIsFromChangePassword(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean token) {
    }
    
    public final boolean isFromChangePassword() {
        return false;
    }
    
    private PreferenceHelper() {
        super();
    }
}