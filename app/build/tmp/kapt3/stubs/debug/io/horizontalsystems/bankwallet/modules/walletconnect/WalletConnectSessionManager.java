package io.horizontalsystems.bankwallet.modules.walletconnect;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u0014*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSessionManager;", "", "storage", "Lio/horizontalsystems/bankwallet/core/storage/WalletConnectSessionStorage;", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "(Lio/horizontalsystems/bankwallet/core/storage/WalletConnectSessionStorage;Lio/horizontalsystems/bankwallet/core/IAccountManager;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "sessions", "", "Lio/horizontalsystems/bankwallet/entities/WalletConnectSession;", "getSessions", "()Ljava/util/List;", "sessionsObservable", "Lio/reactivex/Flowable;", "getSessionsObservable", "()Lio/reactivex/Flowable;", "sessionsSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "deleteSession", "", "peerId", "", "handleActiveAccount", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "handleDeletedAccounts", "save", "session", "app_debug"})
public final class WalletConnectSessionManager {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final io.reactivex.subjects.PublishSubject<java.util.List<io.horizontalsystems.bankwallet.entities.WalletConnectSession>> sessionsSubject = null;
    private final io.horizontalsystems.bankwallet.core.storage.WalletConnectSessionStorage storage = null;
    private final io.horizontalsystems.bankwallet.core.IAccountManager accountManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<io.horizontalsystems.bankwallet.entities.WalletConnectSession>> getSessionsObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.entities.WalletConnectSession> getSessions() {
        return null;
    }
    
    private final void handleActiveAccount(io.horizontalsystems.bankwallet.entities.Account account) {
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.WalletConnectSession session) {
    }
    
    public final void deleteSession(@org.jetbrains.annotations.NotNull()
    java.lang.String peerId) {
    }
    
    private final void handleDeletedAccounts() {
    }
    
    public WalletConnectSessionManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.storage.WalletConnectSessionStorage storage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager) {
        super();
    }
}