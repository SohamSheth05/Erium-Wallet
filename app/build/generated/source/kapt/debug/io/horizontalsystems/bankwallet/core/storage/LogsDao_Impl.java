package io.horizontalsystems.bankwallet.core.storage;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.horizontalsystems.bankwallet.entities.LogEntry;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LogsDao_Impl implements LogsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LogEntry> __insertionAdapterOfLogEntry;

  public LogsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLogEntry = new EntityInsertionAdapter<LogEntry>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `LogEntry` (`id`,`date`,`level`,`actionId`,`message`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LogEntry value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        stmt.bindLong(2, value.getDate());
        stmt.bindLong(3, value.getLevel());
        if (value.getActionId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getActionId());
        }
        if (value.getMessage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getMessage());
        }
      }
    };
  }

  @Override
  public void insert(final LogEntry logEntry) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLogEntry.insert(logEntry);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<LogEntry> getAll() {
    final String _sql = "SELECT * FROM LogEntry ORDER BY id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "level");
      final int _cursorIndexOfActionId = CursorUtil.getColumnIndexOrThrow(_cursor, "actionId");
      final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
      final List<LogEntry> _result = new ArrayList<LogEntry>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final LogEntry _item;
        final long _tmpDate;
        _tmpDate = _cursor.getLong(_cursorIndexOfDate);
        final int _tmpLevel;
        _tmpLevel = _cursor.getInt(_cursorIndexOfLevel);
        final String _tmpActionId;
        _tmpActionId = _cursor.getString(_cursorIndexOfActionId);
        final String _tmpMessage;
        _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
        _item = new LogEntry(_tmpDate,_tmpLevel,_tmpActionId,_tmpMessage);
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
}
