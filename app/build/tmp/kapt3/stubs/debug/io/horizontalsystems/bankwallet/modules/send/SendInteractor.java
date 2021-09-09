package io.horizontalsystems.bankwallet.modules.send;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendInteractor;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendInteractor;", "()V", "delegate", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendInteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "clear", "", "send", "sendSingle", "Lio/reactivex/Single;", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "app_debug"})
public final class SendInteractor implements io.horizontalsystems.bankwallet.modules.send.SendModule.ISendInteractor {
    private io.reactivex.disposables.CompositeDisposable disposables;
    public io.horizontalsystems.bankwallet.modules.send.SendModule.ISendInteractorDelegate delegate;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.SendModule.ISendInteractorDelegate getDelegate() {
        return null;
    }
    
    @java.lang.Override()
    public void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.SendModule.ISendInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void send(@org.jetbrains.annotations.NotNull()
    io.reactivex.Single<kotlin.Unit> sendSingle, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AppLogger logger) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public SendInteractor() {
        super();
    }
}