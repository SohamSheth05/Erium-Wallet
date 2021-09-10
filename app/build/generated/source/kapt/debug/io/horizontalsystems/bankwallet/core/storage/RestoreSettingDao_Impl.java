package io.horizontalsystems.bankwallet.core.storage;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.horizontalsystems.bankwallet.entities.RestoreSettingRecord;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RestoreSettingDao_Impl implements RestoreSettingDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RestoreSettingRecord> __insertionAdapterOfRestoreSettingRecord;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public RestoreSettingDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRestoreSettingRecord = new EntityInsertionAdapter<RestoreSettingRecord>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `RestoreSettingRecord` (`accountId`,`coinId`,`key`,`value`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RestoreSettingRecord value) {
        if (value.getAccountId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getAccountId());
        }
        if (value.getCoinId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCoinId());
        }
        if (value.getKey() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getKey());
        }
        if (value.getValue() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getValue());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM `RestoreSettingRecord` WHERE accountId = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final List<RestoreSettingRecord> records) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRestoreSettingRecord.insert(records);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final String accountId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    if (accountId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, accountId);
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
  public List<RestoreSettingRecord> get(final String accountId, final String coinId) {
    final String _sql = "SELECT * FROM `RestoreSettingRecord` WHERE accountId = ? AND coinId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (accountId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, accountId);
    }
    _argIndex = 2;
    if (coinId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, coinId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "accountId");
      final int _cursorIndexOfCoinId = CursorUtil.getColumnIndexOrThrow(_cursor, "coinId");
      final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
      final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
      final List<RestoreSettingRecord> _result = new ArrayList<RestoreSettingRecord>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final RestoreSettingRecord _item;
        final String _tmpAccountId;
        if (_cursor.isNull(_cursorIndexOfAccountId)) {
          _tmpAccountId = null;
        } else {
          _tmpAccountId = _cursor.getString(_cursorIndexOfAccountId);
        }
        final String _tmpCoinId;
        if (_cursor.isNull(_cursorIndexOfCoinId)) {
          _tmpCoinId = null;
        } else {
          _tmpCoinId = _cursor.getString(_cursorIndexOfCoinId);
        }
        final String _tmpKey;
        if (_cursor.isNull(_cursorIndexOfKey)) {
          _tmpKey = null;
        } else {
          _tmpKey = _cursor.getString(_cursorIndexOfKey);
        }
        final String _tmpValue;
        if (_cursor.isNull(_cursorIndexOfValue)) {
          _tmpValue = null;
        } else {
          _tmpValue = _cursor.getString(_cursorIndexOfValue);
        }
        _item = new RestoreSettingRecord(_tmpAccountId,_tmpCoinId,_tmpKey,_tmpValue);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<RestoreSettingRecord> get(final String accountId) {
    final String _sql = "SELECT * FROM `RestoreSettingRecord` WHERE accountId = ?";
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
      final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "accountId");
      final int _cursorIndexOfCoinId = CursorUtil.getColumnIndexOrThrow(_cursor, "coinId");
      final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
      final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
      final List<RestoreSettingRecord> _result = new ArrayList<RestoreSettingRecord>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final RestoreSettingRecord _item;
        final String _tmpAccountId;
        if (_cursor.isNull(_cursorIndexOfAccountId)) {
          _tmpAccountId = null;
        } else {
          _tmpAccountId = _cursor.getString(_cursorIndexOfAccountId);
        }
        final String _tmpCoinId;
        if (_cursor.isNull(_cursorIndexOfCoinId)) {
          _tmpCoinId = null;
        } else {
          _tmpCoinId = _cursor.getString(_cursorIndexOfCoinId);
        }
        final String _tmpKey;
        if (_cursor.isNull(_cursorIndexOfKey)) {
          _tmpKey = null;
        } else {
          _tmpKey = _cursor.getString(_cursorIndexOfKey);
        }
        final String _tmpValue;
        if (_cursor.isNull(_cursorIndexOfValue)) {
          _tmpValue = null;
        } else {
          _tmpValue = _cursor.getString(_cursorIndexOfValue);
        }
        _item = new RestoreSettingRecord(_tmpAccountId,_tmpCoinId,_tmpKey,_tmpValue);
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
