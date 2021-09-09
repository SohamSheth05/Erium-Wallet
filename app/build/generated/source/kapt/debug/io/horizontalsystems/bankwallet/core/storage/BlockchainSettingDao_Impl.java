package io.horizontalsystems.bankwallet.core.storage;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.horizontalsystems.bankwallet.entities.BlockchainSetting;
import io.horizontalsystems.coinkit2.models.CoinType;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BlockchainSettingDao_Impl implements BlockchainSettingDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BlockchainSetting> __insertionAdapterOfBlockchainSetting;

  private final DatabaseConverters __databaseConverters = new DatabaseConverters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteDerivationSettings;

  public BlockchainSettingDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBlockchainSetting = new EntityInsertionAdapter<BlockchainSetting>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `BlockchainSetting` (`coinType`,`key`,`value`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BlockchainSetting value) {
        final String _tmp;
        _tmp = __databaseConverters.fromCoinType(value.getCoinType());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getKey() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getKey());
        }
        if (value.getValue() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getValue());
        }
      }
    };
    this.__preparedStmtOfDeleteDerivationSettings = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM BlockchainSetting WHERE `key` = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final BlockchainSetting item) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfBlockchainSetting.insert(item);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteDerivationSettings(final String key) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteDerivationSettings.acquire();
    int _argIndex = 1;
    if (key == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, key);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteDerivationSettings.release(_stmt);
    }
  }

  @Override
  public List<BlockchainSetting> getAll() {
    final String _sql = "SELECT * FROM BlockchainSetting";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCoinType = CursorUtil.getColumnIndexOrThrow(_cursor, "coinType");
      final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
      final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
      final List<BlockchainSetting> _result = new ArrayList<BlockchainSetting>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final BlockchainSetting _item;
        final CoinType _tmpCoinType;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfCoinType);
        _tmpCoinType = __databaseConverters.toCoinType(_tmp);
        final String _tmpKey;
        _tmpKey = _cursor.getString(_cursorIndexOfKey);
        final String _tmpValue;
        _tmpValue = _cursor.getString(_cursorIndexOfValue);
        _item = new BlockchainSetting(_tmpCoinType,_tmpKey,_tmpValue);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public BlockchainSetting getSetting(final CoinType coinType, final String key) {
    final String _sql = "SELECT * FROM BlockchainSetting WHERE coinType = ? AND `key` == ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    final String _tmp;
    _tmp = __databaseConverters.fromCoinType(coinType);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    _argIndex = 2;
    if (key == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, key);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCoinType = CursorUtil.getColumnIndexOrThrow(_cursor, "coinType");
      final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
      final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
      final BlockchainSetting _result;
      if(_cursor.moveToFirst()) {
        final CoinType _tmpCoinType;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfCoinType);
        _tmpCoinType = __databaseConverters.toCoinType(_tmp_1);
        final String _tmpKey;
        _tmpKey = _cursor.getString(_cursorIndexOfKey);
        final String _tmpValue;
        _tmpValue = _cursor.getString(_cursorIndexOfValue);
        _result = new BlockchainSetting(_tmpCoinType,_tmpKey,_tmpValue);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
