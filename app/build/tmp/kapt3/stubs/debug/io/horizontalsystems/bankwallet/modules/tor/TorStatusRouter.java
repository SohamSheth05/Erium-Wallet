package io.horizontalsystems.bankwallet.modules.tor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/tor/TorStatusRouter;", "Lio/horizontalsystems/bankwallet/modules/tor/TorStatusModule$Router;", "()V", "closeEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getCloseEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "restartAppEvent", "getRestartAppEvent", "closeView", "restartApp", "app_debug"})
public final class TorStatusRouter implements io.horizontalsystems.bankwallet.modules.tor.TorStatusModule.Router {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> closeEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> restartAppEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getCloseEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getRestartAppEvent() {
        return null;
    }
    
    @java.lang.Override()
    public void closeView() {
    }
    
    @java.lang.Override()
    public void restartApp() {
    }
    
    public TorStatusRouter() {
        super();
    }
}