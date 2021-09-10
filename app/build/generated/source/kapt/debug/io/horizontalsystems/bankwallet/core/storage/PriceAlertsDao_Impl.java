package io.horizontalsystems.bankwallet.core.storage;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.horizontalsystems.bankwallet.entities.PriceAlert;
import io.horizontalsystems.coinkit2.models.CoinType;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PriceAlertsDao_Impl implements PriceAlertsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PriceAlert> __insertionAdapterOfPriceAlert;

  private final DatabaseConverters __databaseConverters = new DatabaseConverters();

  private final EntityDeletionOrUpdateAdapter<PriceAlert> __deletionAdapterOfPriceAlert;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public PriceAlertsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPriceAlert = new EntityInsertionAdapter<PriceAlert>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `PriceAlert` (`coinType`,`coinName`,`changeState`,`trendState`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PriceAlert value) {
        final String _tmp;
        _tmp = __databaseConverters.fromCoinType(value.getCoinType());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getCoinName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCoinName());
        }
        final String _tmp_1;
        _tmp_1 = __databaseConverters.fromChangeState(value.getChangeState());
        if (_tmp_1 == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __databaseConverters.fromTrendState(value.getTrendState());
        if (_tmp_2 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_2);
        }
      }
    };
    this.__deletionAdapterOfPriceAlert = new EntityDeletionOrUpdateAdapter<PriceAlert>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `PriceAlert` WHERE `coinType` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PriceAlert value) {
        final String _tmp;
        _tmp = __databaseConverters.fromCoinType(value.getCoinType());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM PriceAlert";
        return _query;
      }
    };
  }

  @Override
  public void update(final PriceAlert priceAlert) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPriceAlert.insert(priceAlert);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final PriceAlert it) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPriceAlert.handle(it);
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
  public List<PriceAlert> all() {
    final String _sql = "SELECT * FROM PriceAlert";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCoinType = CursorUtil.getColumnIndexOrThrow(_cursor, "coinType");
      final int _cursorIndexOfCoinName = CursorUtil.getColumnIndexOrThrow(_cursor, "coinName");
      final int _cursorIndexOfChangeState = CursorUtil.getColumnIndexOrThrow(_cursor, "changeState");
      final int _cursorIndexOfTrendState = CursorUtil.getColumnIndexOrThrow(_cursor, "trendState");
      final List<PriceAlert> _result = new ArrayList<PriceAlert>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final PriceAlert _item;
        final CoinType _tmpCoinType;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfCoinType)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfCoinType);
        }
        _tmpCoinType = __databaseConverters.toCoinType(_tmp);
        final String _tmpCoinName;
        if (_cursor.isNull(_cursorIndexOfCoinName)) {
          _tmpCoinName = null;
        } else {
          _tmpCoinName = _cursor.getString(_cursorIndexOfCoinName);
        }
        final PriceAlert.ChangeState _tmpChangeState;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfChangeState)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfChangeState);
        }
        _tmpChangeState = __databaseConverters.toChangeState(_tmp_1);
        final PriceAlert.TrendState _tmpTrendState;
        final String _tmp_2;
        if (_cursor.isNull(_cursorIndexOfTrendState)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getString(_cursorIndexOfTrendState);
        }
        _tmpTrendState = __databaseConverters.toTrendState(_tmp_2);
        _item = new PriceAlert(_tmpCoinType,_tmpCoinName,_tmpChangeState,_tmpTrendState);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public PriceAlert priceAlert(final CoinType coinType) {
    final String _sql = "SELECT * FROM PriceAlert WHERE coinType = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final String _tmp;
    _tmp = __databaseConverters.fromCoinType(coinType);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCoinType = CursorUtil.getColumnIndexOrThrow(_cursor, "coinType");
      final int _cursorIndexOfCoinName = CursorUtil.getColumnIndexOrThrow(_cursor, "coinName");
      final int _cursorIndexOfChangeState = CursorUtil.getColumnIndexOrThrow(_cursor, "changeState");
      final int _cursorIndexOfTrendState = CursorUtil.getColumnIndexOrThrow(_cursor, "trendState");
      final PriceAlert _result;
      if(_cursor.moveToFirst()) {
        final CoinType _tmpCoinType;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfCoinType)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfCoinType);
        }
        _tmpCoinType = __databaseConverters.toCoinType(_tmp_1);
        final String _tmpCoinName;
        if (_cursor.isNull(_cursorIndexOfCoinName)) {
          _tmpCoinName = null;
        } else {
          _tmpCoinName = _cursor.getString(_cursorIndexOfCoinName);
        }
        final PriceAlert.ChangeState _tmpChangeState;
        final String _tmp_2;
        if (_cursor.isNull(_cursorIndexOfChangeState)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getString(_cursorIndexOfChangeState);
        }
        _tmpChangeState = __databaseConverters.toChangeState(_tmp_2);
        final PriceAlert.TrendState _tmpTrendState;
        final String _tmp_3;
        if (_cursor.isNull(_cursorIndexOfTrendState)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getString(_cursorIndexOfTrendState);
        }
        _tmpTrendState = __databaseConverters.toTrendState(_tmp_3);
        _result = new PriceAlert(_tmpCoinType,_tmpCoinName,_tmpChangeState,_tmpTrendState);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int count() {
    final String _sql = "SELECT COUNT(*) FROM PriceAlert";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
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
