package io.horizontalsystems.bankwallet.core.storage;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u000b\u001a\u00020\u0006H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nH\'\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/core/storage/WalletConnectSessionDao;", "", "deleteAllExcept", "", "accountIds", "", "", "deleteByPeerId", "peerId", "getByAccountId", "Lio/horizontalsystems/bankwallet/entities/WalletConnectSession;", "accountId", "insert", "session", "app_debug"})
public abstract interface WalletConnectSessionDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM WalletConnectSession WHERE accountId = :accountId")
    public abstract java.util.List<io.horizontalsystems.bankwallet.entities.WalletConnectSession> getByAccountId(@org.jetbrains.annotations.NotNull()
    java.lang.String accountId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.WalletConnectSession session);
    
    @androidx.room.Query(value = "DELETE FROM WalletConnectSession WHERE accountId NOT IN (:accountIds)")
    public abstract void deleteAllExcept(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> accountIds);
    
    @androidx.room.Query(value = "DELETE FROM WalletConnectSession WHERE remotePeerId = :peerId")
    public abstract void deleteByPeerId(@org.jetbrains.annotations.NotNull()
    java.lang.String peerId);
}