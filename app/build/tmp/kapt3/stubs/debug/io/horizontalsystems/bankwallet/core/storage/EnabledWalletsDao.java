package io.horizontalsystems.bankwallet.core.storage;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\'J\b\u0010\b\u001a\u00020\u0003H\'J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0017J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\'J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0017\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/core/storage/EnabledWalletsDao;", "", "delete", "", "coinId", "", "accountId", "coinSettingsId", "deleteAll", "deleteWallets", "enabledWallets", "", "Lio/horizontalsystems/bankwallet/entities/EnabledWallet;", "enabledCoins", "insert", "storableCoin", "insertWallets", "coins", "app_debug"})
public abstract interface EnabledWalletsDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM EnabledWallet ORDER BY `walletOrder` ASC")
    public abstract java.util.List<io.horizontalsystems.bankwallet.entities.EnabledWallet> enabledCoins();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM EnabledWallet WHERE accountId = :accountId ORDER BY `walletOrder` ASC")
    public abstract java.util.List<io.horizontalsystems.bankwallet.entities.EnabledWallet> enabledCoins(@org.jetbrains.annotations.NotNull()
    java.lang.String accountId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.EnabledWallet storableCoin);
    
    @androidx.room.Query(value = "DELETE FROM EnabledWallet")
    public abstract void deleteAll();
    
    @androidx.room.Query(value = "DELETE FROM EnabledWallet WHERE coinId = :coinId AND accountId = :accountId AND coinSettingsId = :coinSettingsId")
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId, @org.jetbrains.annotations.NotNull()
    java.lang.String accountId, @org.jetbrains.annotations.NotNull()
    java.lang.String coinSettingsId);
    
    @androidx.room.Transaction()
    public abstract void insertWallets(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.EnabledWallet> coins);
    
    @androidx.room.Transaction()
    public abstract void deleteWallets(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.EnabledWallet> enabledWallets);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void insertWallets(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.storage.EnabledWalletsDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.entities.EnabledWallet> coins) {
        }
        
        @androidx.room.Transaction()
        public static void deleteWallets(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.storage.EnabledWalletsDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.entities.EnabledWallet> enabledWallets) {
        }
    }
}