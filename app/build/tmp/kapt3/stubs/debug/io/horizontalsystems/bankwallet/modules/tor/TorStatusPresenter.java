package io.horizontalsystems.bankwallet.modules.tor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/tor/TorStatusPresenter;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bankwallet/modules/tor/TorStatusModule$ViewDelegate;", "Lio/horizontalsystems/bankwallet/modules/tor/TorStatusModule$InteractorDelegate;", "view", "Lio/horizontalsystems/bankwallet/modules/tor/TorStatusView;", "router", "Lio/horizontalsystems/bankwallet/modules/tor/TorStatusRouter;", "interactor", "Lio/horizontalsystems/bankwallet/modules/tor/TorStatusInteractor;", "(Lio/horizontalsystems/bankwallet/modules/tor/TorStatusView;Lio/horizontalsystems/bankwallet/modules/tor/TorStatusRouter;Lio/horizontalsystems/bankwallet/modules/tor/TorStatusInteractor;)V", "getRouter", "()Lio/horizontalsystems/bankwallet/modules/tor/TorStatusRouter;", "getView", "()Lio/horizontalsystems/bankwallet/modules/tor/TorStatusView;", "didStopTor", "", "disableTor", "onCleared", "restartTor", "updateConnectionStatus", "connectionStatus", "Lio/horizontalsystems/bankwallet/core/managers/TorStatus;", "viewDidLoad", "app_debug"})
public final class TorStatusPresenter extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bankwallet.modules.tor.TorStatusModule.ViewDelegate, io.horizontalsystems.bankwallet.modules.tor.TorStatusModule.InteractorDelegate {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.tor.TorStatusView view = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.tor.TorStatusRouter router = null;
    private final io.horizontalsystems.bankwallet.modules.tor.TorStatusInteractor interactor = null;
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void updateConnectionStatus(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.TorStatus connectionStatus) {
    }
    
    @java.lang.Override()
    public void restartTor() {
    }
    
    @java.lang.Override()
    public void disableTor() {
    }
    
    @java.lang.Override()
    public void didStopTor() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.tor.TorStatusView getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.tor.TorStatusRouter getRouter() {
        return null;
    }
    
    public TorStatusPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.tor.TorStatusView view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.tor.TorStatusRouter router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.tor.TorStatusInteractor interactor) {
        super();
    }
}