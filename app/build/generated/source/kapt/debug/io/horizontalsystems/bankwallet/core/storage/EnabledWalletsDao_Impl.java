package io.horizontalsystems.bankwallet.core.storage;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.horizontalsystems.bankwallet.entities.EnabledWallet;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class EnabledWalletsDao_Impl implements EnabledWalletsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<EnabledWallet> __insertionAdapterOfEnabledWallet;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public EnabledWalletsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEnabledWallet = new EntityInsertionAdapter<EnabledWallet>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `EnabledWallet` (`coinId`,`coinSettingsId`,`accountId`,`walletOrder`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EnabledWallet value) {
        if (value.getCoinId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCoinId());
        }
        if (value.getCoinSettingsId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCoinSettingsId());
        }
        if (value.getAccountId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAccountId());
        }
        if (value.getWalletOrder() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getWalletOrder());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM EnabledWallet";
        return _query;
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM EnabledWallet WHERE coinId = ? AND accountId = ? AND coinSettingsId = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final EnabledWallet storableCoin) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfEnabledWallet.insert(storableCoin);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertWallets(final List<EnabledWallet> coins) {
    __db.beginTransaction();
    try {
      EnabledWalletsDao.DefaultImpls.insertWallets(EnabledWalletsDao_Impl.this, coins);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteWallets(final List<EnabledWallet> enabledWallets) {
    __db.beginTransaction();
    try {
      EnabledWalletsDao.DefaultImpls.deleteWallets(EnabledWalletsDao_Impl.this, enabledWallets);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public void delete(final String coinId, final String accountId, final String coinSettingsId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    if (coinId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, coinId);
    }
    _argIndex = 2;
    if (accountId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, accountId);
    }
    _argIndex = 3;
    if (coinSettingsId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, coinSettingsId);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public List<EnabledWallet> enabledCoins() {
    final String _sql = "SELECT * FROM EnabledWallet ORDER BY `walletOrder` ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCoinId = CursorUtil.getColumnIndexOrThrow(_cursor, "coinId");
      final int _cursorIndexOfCoinSettingsId = CursorUtil.getColumnIndexOrThrow(_cursor, "coinSettingsId");
      final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "accountId");
      final int _cursorIndexOfWalletOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "walletOrder");
      final List<EnabledWallet> _result = new ArrayList<EnabledWallet>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final EnabledWallet _item;
        final String _tmpCoinId;
        if (_cursor.isNull(_cursorIndexOfCoinId)) {
          _tmpCoinId = null;
        } else {
          _tmpCoinId = _cursor.getString(_cursorIndexOfCoinId);
        }
        final String _tmpCoinSettingsId;
        if (_cursor.isNull(_cursorIndexOfCoinSettingsId)) {
          _tmpCoinSettingsId = null;
        } else {
          _tmpCoinSettingsId = _cursor.getString(_cursorIndexOfCoinSettingsId);
        }
        final String _tmpAccountId;
        if (_cursor.isNull(_cursorIndexOfAccountId)) {
          _tmpAccountId = null;
        } else {
          _tmpAccountId = _cursor.getString(_cursorIndexOfAccountId);
        }
        final Integer _tmpWalletOrder;
        if (_cursor.isNull(_cursorIndexOfWalletOrder)) {
          _tmpWalletOrder = null;
        } else {
          _tmpWalletOrder = _cursor.getInt(_cursorIndexOfWalletOrder);
        }
        _item = new EnabledWallet(_tmpCoinId,_tmpCoinSettingsId,_tmpAccountId,_tmpWalletOrder);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<EnabledWallet> enabledCoins(final String accountId) {
    final String _sql = "SELECT * FROM EnabledWallet WHERE accountId = ? ORDER BY `walletOrder` ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (accountId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, accountId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCoinId = CursorUtil.getColumnIndexOrThrow(_cursor, "coinId");
      final int _cursorIndexOfCoinSettingsId = CursorUtil.getColumnIndexOrThrow(_cursor, "coinSettingsId");
      final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "accountId");
      final int _cursorIndexOfWalletOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "walletOrder");
      final List<EnabledWallet> _result = new ArrayList<EnabledWallet>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final EnabledWallet _item;
        final String _tmpCoinId;
        if (_cursor.isNull(_cursorIndexOfCoinId)) {
          _tmpCoinId = null;
        } else {
          _tmpCoinId = _cursor.getString(_cursorIndexOfCoinId);
        }
        final String _tmpCoinSettingsId;
        if (_cursor.isNull(_cursorIndexOfCoinSettingsId)) {
          _tmpCoinSettingsId = null;
        } else {
          _tmpCoinSettingsId = _cursor.getString(_cursorIndexOfCoinSettingsId);
        }
        final String _tmpAccountId;
        if (_cursor.isNull(_cursorIndexOfAccountId)) {
          _tmpAccountId = null;
        } else {
          _tmpAccountId = _cursor.getString(_cursorIndexOfAccountId);
        }
        final Integer _tmpWalletOrder;
        if (_cursor.isNull(_cursorIndexOfWalletOrder)) {
          _tmpWalletOrder = null;
        } else {
          _tmpWalletOrder = _cursor.getInt(_cursorIndexOfWalletOrder);
        }
        _item = new EnabledWallet(_tmpCoinId,_tmpCoinSettingsId,_tmpAccountId,_tmpWalletOrder);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
