package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\fH&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ITorManager;", "", "isTorEnabled", "", "()Z", "isTorNotificationEnabled", "torObservable", "Lio/reactivex/subjects/Subject;", "Lio/horizontalsystems/bankwallet/core/managers/TorStatus;", "getTorObservable", "()Lio/reactivex/subjects/Subject;", "disableTor", "", "enableTor", "setListener", "listener", "Lio/horizontalsystems/bankwallet/core/managers/TorManager$Listener;", "start", "stop", "Lio/reactivex/Single;", "app_debug"})
public abstract interface ITorManager {
    
    public abstract void start();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.lang.Boolean> stop();
    
    public abstract void enableTor();
    
    public abstract void disableTor();
    
    public abstract void setListener(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.TorManager.Listener listener);
    
    public abstract boolean isTorEnabled();
    
    public abstract boolean isTorNotificationEnabled();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.subjects.Subject<io.horizontalsystems.bankwallet.core.managers.TorStatus> getTorObservable();
}