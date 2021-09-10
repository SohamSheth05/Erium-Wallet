package io.horizontalsystems.bankwallet.core.storage;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.horizontalsystems.coinkit2.models.CoinType;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MarketFavoritesDao_Impl implements MarketFavoritesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FavoriteCoin> __insertionAdapterOfFavoriteCoin;

  private final DatabaseConverters __databaseConverters = new DatabaseConverters();

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public MarketFavoritesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFavoriteCoin = new EntityInsertionAdapter<FavoriteCoin>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `FavoriteCoin` (`id`,`coinType`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoriteCoin value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        final String _tmp;
        _tmp = __databaseConverters.fromCoinType(value.getCoinType());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM FavoriteCoin WHERE coinType = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final FavoriteCoin favoriteCoin) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFavoriteCoin.insert(favoriteCoin);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final CoinType coinType) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    final String _tmp;
    _tmp = __databaseConverters.fromCoinType(coinType);
    if (_tmp == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, _tmp);
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
  public List<FavoriteCoin> getAll() {
    final String _sql = "SELECT * FROM FavoriteCoin";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfCoinType = CursorUtil.getColumnIndexOrThrow(_cursor, "coinType");
      final List<FavoriteCoin> _result = new ArrayList<FavoriteCoin>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final FavoriteCoin _item;
        final CoinType _tmpCoinType;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfCoinType)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfCoinType);
        }
        _tmpCoinType = __databaseConverters.toCoinType(_tmp);
        _item = new FavoriteCoin(_tmpCoinType);
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getCount(final CoinType coinType) {
    final String _sql = "SELECT COUNT(*) FROM FavoriteCoin WHERE coinType = ?";
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
