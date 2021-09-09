package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\'B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010$\u001a\u00020\u001eH\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0&H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0014\u0010\f\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006("}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/TorManager;", "Lio/horizontalsystems/bankwallet/core/ITorManager;", "context", "Landroid/content/Context;", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "(Landroid/content/Context;Lio/horizontalsystems/bankwallet/core/ILocalStorage;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "isTorEnabled", "", "()Z", "isTorNotificationEnabled", "kit", "Lio/horizontalsystems/tor/TorKit;", "getKit", "()Lio/horizontalsystems/tor/TorKit;", "kit$delegate", "Lkotlin/Lazy;", "listener", "Lio/horizontalsystems/bankwallet/core/managers/TorManager$Listener;", "getLocalStorage", "()Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "torObservable", "Lio/reactivex/subjects/BehaviorSubject;", "Lio/horizontalsystems/bankwallet/core/managers/TorStatus;", "kotlin.jvm.PlatformType", "getTorObservable", "()Lio/reactivex/subjects/BehaviorSubject;", "disableTor", "", "enableTor", "getStatus", "torinfo", "Lio/horizontalsystems/tor/Tor$Info;", "setListener", "start", "stop", "Lio/reactivex/Single;", "Listener", "app_debug"})
public final class TorManager implements io.horizontalsystems.bankwallet.core.ITorManager {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.core.managers.TorStatus> torObservable = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private io.horizontalsystems.bankwallet.core.managers.TorManager.Listener listener;
    private final kotlin.Lazy kit$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorage = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.core.managers.TorStatus> getTorObservable() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isTorNotificationEnabled() {
        return false;
    }
    
    private final io.horizontalsystems.tor.TorKit getKit() {
        return null;
    }
    
    @java.lang.Override()
    public void start() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.lang.Boolean> stop() {
        return null;
    }
    
    @java.lang.Override()
    public void enableTor() {
    }
    
    @java.lang.Override()
    public void disableTor() {
    }
    
    @java.lang.Override()
    public void setListener(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.TorManager.Listener listener) {
    }
    
    @java.lang.Override()
    public boolean isTorEnabled() {
        return false;
    }
    
    private final io.horizontalsystems.bankwallet.core.managers.TorStatus getStatus(io.horizontalsystems.tor.Tor.Info torinfo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.core.ILocalStorage getLocalStorage() {
        return null;
    }
    
    public TorManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorage) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/TorManager$Listener;", "", "onStatusChange", "", "torStatus", "Lio/horizontalsystems/bankwallet/core/managers/TorStatus;", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onStatusChange(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.managers.TorStatus torStatus);
    }
}