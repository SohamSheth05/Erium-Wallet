package io.horizontalsystems.bankwallet.modules.settings.appstatus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016R#\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/appstatus/AppStatusView;", "Lio/horizontalsystems/bankwallet/modules/settings/appstatus/AppStatusModule$IView;", "()V", "appStatusLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "", "", "getAppStatusLiveData", "()Landroidx/lifecycle/MutableLiveData;", "showCopiedLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getShowCopiedLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "setAppStatus", "status", "showCopied", "app_debug"})
public final class AppStatusView implements io.horizontalsystems.bankwallet.modules.settings.appstatus.AppStatusModule.IView {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> appStatusLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> showCopiedLiveEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Object>> getAppStatusLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getShowCopiedLiveEvent() {
        return null;
    }
    
    @java.lang.Override()
    public void setAppStatus(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> status) {
    }
    
    @java.lang.Override()
    public void showCopied() {
    }
    
    public AppStatusView() {
        super();
    }
}