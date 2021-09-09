package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/ReleaseNotesManager;", "", "systemInfoManager", "Lio/horizontalsystems/core/ISystemInfoManager;", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "appConfigProvider", "Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;", "(Lio/horizontalsystems/core/ISystemInfoManager;Lio/horizontalsystems/bankwallet/core/ILocalStorage;Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;)V", "currentAppVersion", "", "getCurrentAppVersion", "()Ljava/lang/String;", "currentAppVersion$delegate", "Lkotlin/Lazy;", "releaseNotesUrl", "getReleaseNotesUrl", "shouldShowChangeLog", "", "updateShownAppVersion", "", "app_debug"})
public final class ReleaseNotesManager {
    private final kotlin.Lazy currentAppVersion$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String releaseNotesUrl = null;
    private final io.horizontalsystems.core.ISystemInfoManager systemInfoManager = null;
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorage = null;
    
    private final java.lang.String getCurrentAppVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReleaseNotesUrl() {
        return null;
    }
    
    public final boolean shouldShowChangeLog() {
        return false;
    }
    
    private final void updateShownAppVersion() {
    }
    
    public ReleaseNotesManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ISystemInfoManager systemInfoManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider) {
        super();
    }
}