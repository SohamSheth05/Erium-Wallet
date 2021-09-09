package io.horizontalsystems.bankwallet.core.storage;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\u0003H\'J\b\u0010\b\u001a\u00020\u0003H\'J\n\u0010\t\u001a\u0004\u0018\u00010\nH\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\'J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\'J\b\u0010\u0012\u001a\u00020\u0011H\'J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\rH\'J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\nH\'J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\rH\'\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bankwallet/core/storage/AccountsDao;", "", "clearDeleted", "", "delete", "id", "", "deleteActiveAccount", "deleteAll", "getActiveAccount", "Lio/horizontalsystems/bankwallet/entities/ActiveAccount;", "getAll", "", "Lio/horizontalsystems/bankwallet/core/storage/AccountRecord;", "getDeletedIds", "getNonBackedUpCount", "Lio/reactivex/Flowable;", "", "getTotalCount", "insert", "accountRow", "insertActiveAccount", "activeAccount", "update", "app_debug"})
public abstract interface AccountsDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.storage.AccountRecord accountRow);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.storage.AccountRecord accountRow);
    
    @androidx.room.Query(value = "UPDATE AccountRecord SET deleted = 1 WHERE id = :id")
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM AccountRecord WHERE deleted = 0")
    public abstract java.util.List<io.horizontalsystems.bankwallet.core.storage.AccountRecord> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT id FROM AccountRecord WHERE deleted = 1")
    public abstract java.util.List<java.lang.String> getDeletedIds();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COUNT(*) FROM AccountRecord WHERE isBackedUp = 0 AND deleted = 0")
    public abstract io.reactivex.Flowable<java.lang.Integer> getNonBackedUpCount();
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM AccountRecord WHERE deleted = 0")
    public abstract int getTotalCount();
    
    @androidx.room.Query(value = "UPDATE AccountRecord SET deleted = 1")
    public abstract void deleteAll();
    
    @androidx.room.Query(value = "DELETE FROM AccountRecord WHERE deleted = 1")
    public abstract void clearDeleted();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM ActiveAccount LIMIT 1")
    public abstract io.horizontalsystems.bankwallet.entities.ActiveAccount getActiveAccount();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertActiveAccount(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.ActiveAccount activeAccount);
    
    @androidx.room.Query(value = "DELETE FROM ActiveAccount")
    public abstract void deleteActiveAccount();
}