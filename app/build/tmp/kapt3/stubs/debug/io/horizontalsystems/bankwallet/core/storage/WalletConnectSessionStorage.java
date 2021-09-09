package io.horizontalsystems.bankwallet.core.storage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0014\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0013R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bankwallet/core/storage/WalletConnectSessionStorage;", "", "appDatabase", "Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;", "(Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;)V", "dao", "Lio/horizontalsystems/bankwallet/core/storage/WalletConnectSessionDao;", "getDao", "()Lio/horizontalsystems/bankwallet/core/storage/WalletConnectSessionDao;", "dao$delegate", "Lkotlin/Lazy;", "deleteSessionsByPeerId", "", "peerId", "", "deleteSessionsExcept", "accountIds", "", "getSessions", "Lio/horizontalsystems/bankwallet/entities/WalletConnectSession;", "accountId", "save", "session", "app_debug"})
public final class WalletConnectSessionStorage {
    private final kotlin.Lazy dao$delegate = null;
    
    private final io.horizontalsystems.bankwallet.core.storage.WalletConnectSessionDao getDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.entities.WalletConnectSession> getSessions(@org.jetbrains.annotations.NotNull()
    java.lang.String accountId) {
        return null;
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.WalletConnectSession session) {
    }
    
    public final void deleteSessionsByPeerId(@org.jetbrains.annotations.NotNull()
    java.lang.String peerId) {
    }
    
    public final void deleteSessionsExcept(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> accountIds) {
    }
    
    public WalletConnectSessionStorage(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.storage.AppDatabase appDatabase) {
        super();
    }
}