package io.horizontalsystems.bankwallet.core.storage;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.horizontalsystems.bankwallet.entities.SubscriptionJob;
import io.horizontalsystems.coinkit2.models.CoinType;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SubscriptionJobDao_Impl implements SubscriptionJobDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SubscriptionJob> __insertionAdapterOfSubscriptionJob;

  private final DatabaseConverters __databaseConverters = new DatabaseConverters();

  private final EntityDeletionOrUpdateAdapter<SubscriptionJob> __deletionAdapterOfSubscriptionJob;

  public SubscriptionJobDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSubscriptionJob = new EntityInsertionAdapter<SubscriptionJob>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `SubscriptionJob` (`coinType`,`body`,`stateType`,`jobType`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubscriptionJob value) {
        final String _tmp;
        _tmp = __databaseConverters.fromCoinType(value.getCoinType());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getBody() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBody());
        }
        final String _tmp_1;
        _tmp_1 = __databaseConverters.fromStateType(value.getStateType());
        if (_tmp_1 == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __databaseConverters.fromJobType(value.getJobType());
        if (_tmp_2 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_2);
        }
      }
    };
    this.__deletionAdapterOfSubscriptionJob = new EntityDeletionOrUpdateAdapter<SubscriptionJob>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `SubscriptionJob` WHERE `coinType` = ? AND `stateType` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubscriptionJob value) {
        final String _tmp;
        _tmp = __databaseConverters.fromCoinType(value.getCoinType());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __databaseConverters.fromStateType(value.getStateType());
        if (_tmp_1 == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp_1);
        }
      }
    };
  }

  @Override
  public void save(final SubscriptionJob subscriptionJob) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSubscriptionJob.insert(subscriptionJob);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final SubscriptionJob subscriptionJob) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfSubscriptionJob.handle(subscriptionJob);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<SubscriptionJob> all() {
    final String _sql = "SELECT * FROM SubscriptionJob";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCoinType = CursorUtil.getColumnIndexOrThrow(_cursor, "coinType");
      final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
      final int _cursorIndexOfStateType = CursorUtil.getColumnIndexOrThrow(_cursor, "stateType");
      final int _cursorIndexOfJobType = CursorUtil.getColumnIndexOrThrow(_cursor, "jobType");
      final List<SubscriptionJob> _result = new ArrayList<SubscriptionJob>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SubscriptionJob _item;
        final CoinType _tmpCoinType;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfCoinType)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfCoinType);
        }
        _tmpCoinType = __databaseConverters.toCoinType(_tmp);
        final String _tmpBody;
        if (_cursor.isNull(_cursorIndexOfBody)) {
          _tmpBody = null;
        } else {
          _tmpBody = _cursor.getString(_cursorIndexOfBody);
        }
        final SubscriptionJob.StateType _tmpStateType;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfStateType)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfStateType);
        }
        _tmpStateType = __databaseConverters.toStateType(_tmp_1);
        final SubscriptionJob.JobType _tmpJobType;
        final String _tmp_2;
        if (_cursor.isNull(_cursorIndexOfJobType)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getString(_cursorIndexOfJobType);
        }
        _tmpJobType = __databaseConverters.toJobType(_tmp_2);
        _item = new SubscriptionJob(_tmpCoinType,_tmpBody,_tmpStateType,_tmpJobType);
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
