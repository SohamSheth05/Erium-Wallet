package io.horizontalsystems.bankwallet.modules.tor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/tor/TorStatusInteractor;", "Lio/horizontalsystems/bankwallet/modules/tor/TorStatusModule$Interactor;", "torManager", "Lio/horizontalsystems/bankwallet/core/ITorManager;", "(Lio/horizontalsystems/bankwallet/core/ITorManager;)V", "delegate", "Lio/horizontalsystems/bankwallet/modules/tor/TorStatusModule$InteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/tor/TorStatusModule$InteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/tor/TorStatusModule$InteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "clear", "", "disableTor", "restartTor", "subscribeToEvents", "app_debug"})
public final class TorStatusInteractor implements io.horizontalsystems.bankwallet.modules.tor.TorStatusModule.Interactor {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.tor.TorStatusModule.InteractorDelegate delegate;
    private io.reactivex.disposables.CompositeDisposable disposables;
    private final io.horizontalsystems.bankwallet.core.ITorManager torManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.tor.TorStatusModule.InteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.tor.TorStatusModule.InteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void subscribeToEvents() {
    }
    
    @java.lang.Override()
    public void restartTor() {
    }
    
    @java.lang.Override()
    public void disableTor() {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public TorStatusInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ITorManager torManager) {
        super();
    }
}