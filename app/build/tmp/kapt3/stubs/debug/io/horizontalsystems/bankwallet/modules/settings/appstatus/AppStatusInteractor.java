package io.horizontalsystems.bankwallet.modules.settings.appstatus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/appstatus/AppStatusInteractor;", "Lio/horizontalsystems/bankwallet/modules/settings/appstatus/AppStatusModule$IInteractor;", "appStatusService", "Lio/horizontalsystems/bankwallet/modules/settings/appstatus/AppStatusService;", "clipboardManager", "Lio/horizontalsystems/bankwallet/core/IClipboardManager;", "(Lio/horizontalsystems/bankwallet/modules/settings/appstatus/AppStatusService;Lio/horizontalsystems/bankwallet/core/IClipboardManager;)V", "status", "", "", "", "getStatus", "()Ljava/util/Map;", "copyToClipboard", "", "text", "app_debug"})
public final class AppStatusInteractor implements io.horizontalsystems.bankwallet.modules.settings.appstatus.AppStatusModule.IInteractor {
    private final io.horizontalsystems.bankwallet.modules.settings.appstatus.AppStatusService appStatusService = null;
    private final io.horizontalsystems.bankwallet.core.IClipboardManager clipboardManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.Object> getStatus() {
        return null;
    }
    
    @java.lang.Override()
    public void copyToClipboard(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public AppStatusInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.appstatus.AppStatusService appStatusService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IClipboardManager clipboardManager) {
        super();
    }
}