package io.horizontalsystems.bankwallet.core.storage;

import java.lang.System;

@androidx.room.TypeConverters(value = {io.horizontalsystems.bankwallet.core.storage.DatabaseConverters.class})
@androidx.room.Database(version = 33, exportSchema = false, entities = {io.horizontalsystems.bankwallet.entities.EnabledWallet.class, io.horizontalsystems.bankwallet.entities.PriceAlert.class, io.horizontalsystems.bankwallet.core.storage.AccountRecord.class, io.horizontalsystems.bankwallet.entities.BlockchainSetting.class, io.horizontalsystems.bankwallet.entities.SubscriptionJob.class, io.horizontalsystems.bankwallet.entities.LogEntry.class, io.horizontalsystems.bankwallet.core.storage.FavoriteCoin.class, io.horizontalsystems.bankwallet.entities.WalletConnectSession.class, io.horizontalsystems.bankwallet.entities.RestoreSettingRecord.class, io.horizontalsystems.bankwallet.entities.ActiveAccount.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "accountsDao", "Lio/horizontalsystems/bankwallet/core/storage/AccountsDao;", "blockchainSettingDao", "Lio/horizontalsystems/bankwallet/core/storage/BlockchainSettingDao;", "logsDao", "Lio/horizontalsystems/bankwallet/core/storage/LogsDao;", "marketFavoritesDao", "Lio/horizontalsystems/bankwallet/core/storage/MarketFavoritesDao;", "priceAlertsDao", "Lio/horizontalsystems/bankwallet/core/storage/PriceAlertsDao;", "restoreSettingDao", "Lio/horizontalsystems/bankwallet/core/storage/RestoreSettingDao;", "subscriptionJobDao", "Lio/horizontalsystems/bankwallet/core/storage/SubscriptionJobDao;", "walletConnectSessionDao", "Lio/horizontalsystems/bankwallet/core/storage/WalletConnectSessionDao;", "walletsDao", "Lio/horizontalsystems/bankwallet/core/storage/EnabledWalletsDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    private static volatile io.horizontalsystems.bankwallet.core.storage.AppDatabase INSTANCE;
    private static final androidx.room.migration.Migration MIGRATION_8_9 = null;
    private static final androidx.room.migration.Migration MIGRATION_9_10 = null;
    private static final androidx.room.migration.Migration MIGRATION_10_11 = null;
    private static final androidx.room.migration.Migration renameCoinDaiToSai = null;
    private static final androidx.room.migration.Migration moveCoinSettingsFromAccountToWallet = null;
    private static final androidx.room.migration.Migration storeBipToPreferences = null;
    private static final androidx.room.migration.Migration addBlockchainSettingsTable = null;
    private static final androidx.room.migration.Migration addIndexToEnableWallet = null;
    private static final androidx.room.migration.Migration updateBchSyncMode = null;
    private static final androidx.room.migration.Migration addCoinRecordTable = null;
    private static final androidx.room.migration.Migration removeRateStorageTable = null;
    private static final androidx.room.migration.Migration addNotificationTables = null;
    private static final androidx.room.migration.Migration addLogsTable = null;
    private static final androidx.room.migration.Migration updateEthereumCommunicationMode = null;
    private static final androidx.room.migration.Migration addBirthdayHeightToAccount = null;
    private static final androidx.room.migration.Migration addBep2SymbolToRecord = null;
    private static final androidx.room.migration.Migration MIGRATION_24_25 = null;
    private static final androidx.room.migration.Migration MIGRATION_25_26 = null;
    private static final androidx.room.migration.Migration MIGRATION_26_27 = null;
    private static final androidx.room.migration.Migration MIGRATION_27_28 = null;
    private static final androidx.room.migration.Migration MIGRATION_28_29 = null;
    private static final androidx.room.migration.Migration MIGRATION_29_30 = null;
    private static final androidx.room.migration.Migration MIGRATION_30_31 = null;
    private static final java.util.Map<java.lang.String, io.horizontalsystems.coinkit2.models.CoinType> oldTypeIds = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.storage.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bankwallet.core.storage.EnabledWalletsDao walletsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bankwallet.core.storage.AccountsDao accountsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bankwallet.core.storage.PriceAlertsDao priceAlertsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bankwallet.core.storage.BlockchainSettingDao blockchainSettingDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bankwallet.core.storage.RestoreSettingDao restoreSettingDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bankwallet.core.storage.SubscriptionJobDao subscriptionJobDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bankwallet.core.storage.LogsDao logsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bankwallet.core.storage.MarketFavoritesDao marketFavoritesDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bankwallet.core.storage.WalletConnectSessionDao walletConnectSessionDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#H\u0002J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\'\u001a\u00020(H\u0002J\u000e\u0010)\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#J \u0010*\u001a\u0004\u0018\u00010\u001a2\u0006\u0010+\u001a\u00020\u001a2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J\u001e\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\'\u001a\u00020(H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lio/horizontalsystems/bankwallet/core/storage/AppDatabase$Companion;", "", "()V", "INSTANCE", "Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;", "MIGRATION_10_11", "Landroidx/room/migration/Migration;", "MIGRATION_24_25", "MIGRATION_25_26", "MIGRATION_26_27", "MIGRATION_27_28", "MIGRATION_28_29", "MIGRATION_29_30", "MIGRATION_30_31", "MIGRATION_8_9", "MIGRATION_9_10", "addBep2SymbolToRecord", "addBirthdayHeightToAccount", "addBlockchainSettingsTable", "addCoinRecordTable", "addIndexToEnableWallet", "addLogsTable", "addNotificationTables", "moveCoinSettingsFromAccountToWallet", "oldTypeIds", "", "", "Lio/horizontalsystems/coinkit2/models/CoinType;", "removeRateStorageTable", "renameCoinDaiToSai", "storeBipToPreferences", "updateBchSyncMode", "updateEthereumCommunicationMode", "buildDatabase", "context", "Landroid/content/Context;", "extractCustomCoins", "", "Lio/horizontalsystems/coinkit2/models/Coin;", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getInstance", "newCoinId", "old", "coins", "updateCoinIdInEnabledWallets", "", "customCoins", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.storage.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.core.storage.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private final java.util.List<io.horizontalsystems.coinkit2.models.Coin> extractCustomCoins(androidx.sqlite.db.SupportSQLiteDatabase database) {
            return null;
        }
        
        private final void updateCoinIdInEnabledWallets(java.util.List<io.horizontalsystems.coinkit2.models.Coin> customCoins, androidx.sqlite.db.SupportSQLiteDatabase database) {
        }
        
        private final java.lang.String newCoinId(java.lang.String old, java.util.List<io.horizontalsystems.coinkit2.models.Coin> coins) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}