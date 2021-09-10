package io.horizontalsystems.bankwallet.core.storage;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile EnabledWalletsDao _enabledWalletsDao;

  private volatile AccountsDao _accountsDao;

  private volatile PriceAlertsDao _priceAlertsDao;

  private volatile BlockchainSettingDao _blockchainSettingDao;

  private volatile RestoreSettingDao _restoreSettingDao;

  private volatile SubscriptionJobDao _subscriptionJobDao;

  private volatile LogsDao _logsDao;

  private volatile MarketFavoritesDao _marketFavoritesDao;

  private volatile WalletConnectSessionDao _walletConnectSessionDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(33) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `EnabledWallet` (`coinId` TEXT NOT NULL, `coinSettingsId` TEXT NOT NULL, `accountId` TEXT NOT NULL, `walletOrder` INTEGER, PRIMARY KEY(`coinId`, `coinSettingsId`, `accountId`), FOREIGN KEY(`accountId`) REFERENCES `AccountRecord`(`id`) ON UPDATE CASCADE ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_EnabledWallet_accountId` ON `EnabledWallet` (`accountId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PriceAlert` (`coinType` TEXT NOT NULL, `coinName` TEXT NOT NULL, `changeState` TEXT NOT NULL, `trendState` TEXT NOT NULL, PRIMARY KEY(`coinType`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `AccountRecord` (`deleted` INTEGER NOT NULL, `id` TEXT NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `origin` TEXT NOT NULL, `isBackedUp` INTEGER NOT NULL, `words` TEXT, `passphrase` TEXT, `key` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `BlockchainSetting` (`coinType` TEXT NOT NULL, `key` TEXT NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`coinType`, `key`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SubscriptionJob` (`coinType` TEXT NOT NULL, `body` TEXT NOT NULL, `stateType` TEXT NOT NULL, `jobType` TEXT NOT NULL, PRIMARY KEY(`coinType`, `stateType`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `LogEntry` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `date` INTEGER NOT NULL, `level` INTEGER NOT NULL, `actionId` TEXT NOT NULL, `message` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `FavoriteCoin` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `coinType` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `WalletConnectSession` (`chainId` INTEGER NOT NULL, `accountId` TEXT NOT NULL, `session` TEXT NOT NULL, `peerId` TEXT NOT NULL, `remotePeerId` TEXT NOT NULL, `remotePeerMeta` TEXT NOT NULL, `isAutoSign` INTEGER NOT NULL, `date` INTEGER NOT NULL, PRIMARY KEY(`remotePeerId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `RestoreSettingRecord` (`accountId` TEXT NOT NULL, `coinId` TEXT NOT NULL, `key` TEXT NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`accountId`, `coinId`, `key`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ActiveAccount` (`accountId` TEXT NOT NULL, `primaryKey` TEXT NOT NULL, PRIMARY KEY(`primaryKey`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9ead22fe1e92ed622f07e154b0c5f90d')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `EnabledWallet`");
        _db.execSQL("DROP TABLE IF EXISTS `PriceAlert`");
        _db.execSQL("DROP TABLE IF EXISTS `AccountRecord`");
        _db.execSQL("DROP TABLE IF EXISTS `BlockchainSetting`");
        _db.execSQL("DROP TABLE IF EXISTS `SubscriptionJob`");
        _db.execSQL("DROP TABLE IF EXISTS `LogEntry`");
        _db.execSQL("DROP TABLE IF EXISTS `FavoriteCoin`");
        _db.execSQL("DROP TABLE IF EXISTS `WalletConnectSession`");
        _db.execSQL("DROP TABLE IF EXISTS `RestoreSettingRecord`");
        _db.execSQL("DROP TABLE IF EXISTS `ActiveAccount`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsEnabledWallet = new HashMap<String, TableInfo.Column>(4);
        _columnsEnabledWallet.put("coinId", new TableInfo.Column("coinId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEnabledWallet.put("coinSettingsId", new TableInfo.Column("coinSettingsId", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEnabledWallet.put("accountId", new TableInfo.Column("accountId", "TEXT", true, 3, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEnabledWallet.put("walletOrder", new TableInfo.Column("walletOrder", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEnabledWallet = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysEnabledWallet.add(new TableInfo.ForeignKey("AccountRecord", "CASCADE", "CASCADE",Arrays.asList("accountId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesEnabledWallet = new HashSet<TableInfo.Index>(1);
        _indicesEnabledWallet.add(new TableInfo.Index("index_EnabledWallet_accountId", false, Arrays.asList("accountId")));
        final TableInfo _infoEnabledWallet = new TableInfo("EnabledWallet", _columnsEnabledWallet, _foreignKeysEnabledWallet, _indicesEnabledWallet);
        final TableInfo _existingEnabledWallet = TableInfo.read(_db, "EnabledWallet");
        if (! _infoEnabledWallet.equals(_existingEnabledWallet)) {
          return new RoomOpenHelper.ValidationResult(false, "EnabledWallet(io.horizontalsystems.bankwallet.entities.EnabledWallet).\n"
                  + " Expected:\n" + _infoEnabledWallet + "\n"
                  + " Found:\n" + _existingEnabledWallet);
        }
        final HashMap<String, TableInfo.Column> _columnsPriceAlert = new HashMap<String, TableInfo.Column>(4);
        _columnsPriceAlert.put("coinType", new TableInfo.Column("coinType", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPriceAlert.put("coinName", new TableInfo.Column("coinName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPriceAlert.put("changeState", new TableInfo.Column("changeState", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPriceAlert.put("trendState", new TableInfo.Column("trendState", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPriceAlert = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPriceAlert = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPriceAlert = new TableInfo("PriceAlert", _columnsPriceAlert, _foreignKeysPriceAlert, _indicesPriceAlert);
        final TableInfo _existingPriceAlert = TableInfo.read(_db, "PriceAlert");
        if (! _infoPriceAlert.equals(_existingPriceAlert)) {
          return new RoomOpenHelper.ValidationResult(false, "PriceAlert(io.horizontalsystems.bankwallet.entities.PriceAlert).\n"
                  + " Expected:\n" + _infoPriceAlert + "\n"
                  + " Found:\n" + _existingPriceAlert);
        }
        final HashMap<String, TableInfo.Column> _columnsAccountRecord = new HashMap<String, TableInfo.Column>(9);
        _columnsAccountRecord.put("deleted", new TableInfo.Column("deleted", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("origin", new TableInfo.Column("origin", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("isBackedUp", new TableInfo.Column("isBackedUp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("words", new TableInfo.Column("words", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("passphrase", new TableInfo.Column("passphrase", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountRecord.put("key", new TableInfo.Column("key", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAccountRecord = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAccountRecord = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAccountRecord = new TableInfo("AccountRecord", _columnsAccountRecord, _foreignKeysAccountRecord, _indicesAccountRecord);
        final TableInfo _existingAccountRecord = TableInfo.read(_db, "AccountRecord");
        if (! _infoAccountRecord.equals(_existingAccountRecord)) {
          return new RoomOpenHelper.ValidationResult(false, "AccountRecord(io.horizontalsystems.bankwallet.core.storage.AccountRecord).\n"
                  + " Expected:\n" + _infoAccountRecord + "\n"
                  + " Found:\n" + _existingAccountRecord);
        }
        final HashMap<String, TableInfo.Column> _columnsBlockchainSetting = new HashMap<String, TableInfo.Column>(3);
        _columnsBlockchainSetting.put("coinType", new TableInfo.Column("coinType", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBlockchainSetting.put("key", new TableInfo.Column("key", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBlockchainSetting.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBlockchainSetting = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBlockchainSetting = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBlockchainSetting = new TableInfo("BlockchainSetting", _columnsBlockchainSetting, _foreignKeysBlockchainSetting, _indicesBlockchainSetting);
        final TableInfo _existingBlockchainSetting = TableInfo.read(_db, "BlockchainSetting");
        if (! _infoBlockchainSetting.equals(_existingBlockchainSetting)) {
          return new RoomOpenHelper.ValidationResult(false, "BlockchainSetting(io.horizontalsystems.bankwallet.entities.BlockchainSetting).\n"
                  + " Expected:\n" + _infoBlockchainSetting + "\n"
                  + " Found:\n" + _existingBlockchainSetting);
        }
        final HashMap<String, TableInfo.Column> _columnsSubscriptionJob = new HashMap<String, TableInfo.Column>(4);
        _columnsSubscriptionJob.put("coinType", new TableInfo.Column("coinType", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscriptionJob.put("body", new TableInfo.Column("body", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscriptionJob.put("stateType", new TableInfo.Column("stateType", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscriptionJob.put("jobType", new TableInfo.Column("jobType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSubscriptionJob = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSubscriptionJob = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSubscriptionJob = new TableInfo("SubscriptionJob", _columnsSubscriptionJob, _foreignKeysSubscriptionJob, _indicesSubscriptionJob);
        final TableInfo _existingSubscriptionJob = TableInfo.read(_db, "SubscriptionJob");
        if (! _infoSubscriptionJob.equals(_existingSubscriptionJob)) {
          return new RoomOpenHelper.ValidationResult(false, "SubscriptionJob(io.horizontalsystems.bankwallet.entities.SubscriptionJob).\n"
                  + " Expected:\n" + _infoSubscriptionJob + "\n"
                  + " Found:\n" + _existingSubscriptionJob);
        }
        final HashMap<String, TableInfo.Column> _columnsLogEntry = new HashMap<String, TableInfo.Column>(5);
        _columnsLogEntry.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLogEntry.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLogEntry.put("level", new TableInfo.Column("level", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLogEntry.put("actionId", new TableInfo.Column("actionId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLogEntry.put("message", new TableInfo.Column("message", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLogEntry = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLogEntry = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLogEntry = new TableInfo("LogEntry", _columnsLogEntry, _foreignKeysLogEntry, _indicesLogEntry);
        final TableInfo _existingLogEntry = TableInfo.read(_db, "LogEntry");
        if (! _infoLogEntry.equals(_existingLogEntry)) {
          return new RoomOpenHelper.ValidationResult(false, "LogEntry(io.horizontalsystems.bankwallet.entities.LogEntry).\n"
                  + " Expected:\n" + _infoLogEntry + "\n"
                  + " Found:\n" + _existingLogEntry);
        }
        final HashMap<String, TableInfo.Column> _columnsFavoriteCoin = new HashMap<String, TableInfo.Column>(2);
        _columnsFavoriteCoin.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteCoin.put("coinType", new TableInfo.Column("coinType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavoriteCoin = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavoriteCoin = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavoriteCoin = new TableInfo("FavoriteCoin", _columnsFavoriteCoin, _foreignKeysFavoriteCoin, _indicesFavoriteCoin);
        final TableInfo _existingFavoriteCoin = TableInfo.read(_db, "FavoriteCoin");
        if (! _infoFavoriteCoin.equals(_existingFavoriteCoin)) {
          return new RoomOpenHelper.ValidationResult(false, "FavoriteCoin(io.horizontalsystems.bankwallet.core.storage.FavoriteCoin).\n"
                  + " Expected:\n" + _infoFavoriteCoin + "\n"
                  + " Found:\n" + _existingFavoriteCoin);
        }
        final HashMap<String, TableInfo.Column> _columnsWalletConnectSession = new HashMap<String, TableInfo.Column>(8);
        _columnsWalletConnectSession.put("chainId", new TableInfo.Column("chainId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWalletConnectSession.put("accountId", new TableInfo.Column("accountId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWalletConnectSession.put("session", new TableInfo.Column("session", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWalletConnectSession.put("peerId", new TableInfo.Column("peerId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWalletConnectSession.put("remotePeerId", new TableInfo.Column("remotePeerId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWalletConnectSession.put("remotePeerMeta", new TableInfo.Column("remotePeerMeta", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWalletConnectSession.put("isAutoSign", new TableInfo.Column("isAutoSign", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWalletConnectSession.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWalletConnectSession = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWalletConnectSession = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWalletConnectSession = new TableInfo("WalletConnectSession", _columnsWalletConnectSession, _foreignKeysWalletConnectSession, _indicesWalletConnectSession);
        final TableInfo _existingWalletConnectSession = TableInfo.read(_db, "WalletConnectSession");
        if (! _infoWalletConnectSession.equals(_existingWalletConnectSession)) {
          return new RoomOpenHelper.ValidationResult(false, "WalletConnectSession(io.horizontalsystems.bankwallet.entities.WalletConnectSession).\n"
                  + " Expected:\n" + _infoWalletConnectSession + "\n"
                  + " Found:\n" + _existingWalletConnectSession);
        }
        final HashMap<String, TableInfo.Column> _columnsRestoreSettingRecord = new HashMap<String, TableInfo.Column>(4);
        _columnsRestoreSettingRecord.put("accountId", new TableInfo.Column("accountId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestoreSettingRecord.put("coinId", new TableInfo.Column("coinId", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestoreSettingRecord.put("key", new TableInfo.Column("key", "TEXT", true, 3, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRestoreSettingRecord.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRestoreSettingRecord = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRestoreSettingRecord = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRestoreSettingRecord = new TableInfo("RestoreSettingRecord", _columnsRestoreSettingRecord, _foreignKeysRestoreSettingRecord, _indicesRestoreSettingRecord);
        final TableInfo _existingRestoreSettingRecord = TableInfo.read(_db, "RestoreSettingRecord");
        if (! _infoRestoreSettingRecord.equals(_existingRestoreSettingRecord)) {
          return new RoomOpenHelper.ValidationResult(false, "RestoreSettingRecord(io.horizontalsystems.bankwallet.entities.RestoreSettingRecord).\n"
                  + " Expected:\n" + _infoRestoreSettingRecord + "\n"
                  + " Found:\n" + _existingRestoreSettingRecord);
        }
        final HashMap<String, TableInfo.Column> _columnsActiveAccount = new HashMap<String, TableInfo.Column>(2);
        _columnsActiveAccount.put("accountId", new TableInfo.Column("accountId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActiveAccount.put("primaryKey", new TableInfo.Column("primaryKey", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysActiveAccount = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesActiveAccount = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoActiveAccount = new TableInfo("ActiveAccount", _columnsActiveAccount, _foreignKeysActiveAccount, _indicesActiveAccount);
        final TableInfo _existingActiveAccount = TableInfo.read(_db, "ActiveAccount");
        if (! _infoActiveAccount.equals(_existingActiveAccount)) {
          return new RoomOpenHelper.ValidationResult(false, "ActiveAccount(io.horizontalsystems.bankwallet.entities.ActiveAccount).\n"
                  + " Expected:\n" + _infoActiveAccount + "\n"
                  + " Found:\n" + _existingActiveAccount);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "9ead22fe1e92ed622f07e154b0c5f90d", "0762095602932907d01d0c1bf65ab455");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "EnabledWallet","PriceAlert","AccountRecord","BlockchainSetting","SubscriptionJob","LogEntry","FavoriteCoin","WalletConnectSession","RestoreSettingRecord","ActiveAccount");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `EnabledWallet`");
      _db.execSQL("DELETE FROM `PriceAlert`");
      _db.execSQL("DELETE FROM `AccountRecord`");
      _db.execSQL("DELETE FROM `BlockchainSetting`");
      _db.execSQL("DELETE FROM `SubscriptionJob`");
      _db.execSQL("DELETE FROM `LogEntry`");
      _db.execSQL("DELETE FROM `FavoriteCoin`");
      _db.execSQL("DELETE FROM `WalletConnectSession`");
      _db.execSQL("DELETE FROM `RestoreSettingRecord`");
      _db.execSQL("DELETE FROM `ActiveAccount`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(EnabledWalletsDao.class, EnabledWalletsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(AccountsDao.class, AccountsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PriceAlertsDao.class, PriceAlertsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(BlockchainSettingDao.class, BlockchainSettingDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(RestoreSettingDao.class, RestoreSettingDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SubscriptionJobDao.class, SubscriptionJobDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(LogsDao.class, LogsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(MarketFavoritesDao.class, MarketFavoritesDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(WalletConnectSessionDao.class, WalletConnectSessionDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public EnabledWalletsDao walletsDao() {
    if (_enabledWalletsDao != null) {
      return _enabledWalletsDao;
    } else {
      synchronized(this) {
        if(_enabledWalletsDao == null) {
          _enabledWalletsDao = new EnabledWalletsDao_Impl(this);
        }
        return _enabledWalletsDao;
      }
    }
  }

  @Override
  public AccountsDao accountsDao() {
    if (_accountsDao != null) {
      return _accountsDao;
    } else {
      synchronized(this) {
        if(_accountsDao == null) {
          _accountsDao = new AccountsDao_Impl(this);
        }
        return _accountsDao;
      }
    }
  }

  @Override
  public PriceAlertsDao priceAlertsDao() {
    if (_priceAlertsDao != null) {
      return _priceAlertsDao;
    } else {
      synchronized(this) {
        if(_priceAlertsDao == null) {
          _priceAlertsDao = new PriceAlertsDao_Impl(this);
        }
        return _priceAlertsDao;
      }
    }
  }

  @Override
  public BlockchainSettingDao blockchainSettingDao() {
    if (_blockchainSettingDao != null) {
      return _blockchainSettingDao;
    } else {
      synchronized(this) {
        if(_blockchainSettingDao == null) {
          _blockchainSettingDao = new BlockchainSettingDao_Impl(this);
        }
        return _blockchainSettingDao;
      }
    }
  }

  @Override
  public RestoreSettingDao restoreSettingDao() {
    if (_restoreSettingDao != null) {
      return _restoreSettingDao;
    } else {
      synchronized(this) {
        if(_restoreSettingDao == null) {
          _restoreSettingDao = new RestoreSettingDao_Impl(this);
        }
        return _restoreSettingDao;
      }
    }
  }

  @Override
  public SubscriptionJobDao subscriptionJobDao() {
    if (_subscriptionJobDao != null) {
      return _subscriptionJobDao;
    } else {
      synchronized(this) {
        if(_subscriptionJobDao == null) {
          _subscriptionJobDao = new SubscriptionJobDao_Impl(this);
        }
        return _subscriptionJobDao;
      }
    }
  }

  @Override
  public LogsDao logsDao() {
    if (_logsDao != null) {
      return _logsDao;
    } else {
      synchronized(this) {
        if(_logsDao == null) {
          _logsDao = new LogsDao_Impl(this);
        }
        return _logsDao;
      }
    }
  }

  @Override
  public MarketFavoritesDao marketFavoritesDao() {
    if (_marketFavoritesDao != null) {
      return _marketFavoritesDao;
    } else {
      synchronized(this) {
        if(_marketFavoritesDao == null) {
          _marketFavoritesDao = new MarketFavoritesDao_Impl(this);
        }
        return _marketFavoritesDao;
      }
    }
  }

  @Override
  public WalletConnectSessionDao walletConnectSessionDao() {
    if (_walletConnectSessionDao != null) {
      return _walletConnectSessionDao;
    } else {
      synchronized(this) {
        if(_walletConnectSessionDao == null) {
          _walletConnectSessionDao = new WalletConnectSessionDao_Impl(this);
        }
        return _walletConnectSessionDao;
      }
    }
  }
}
