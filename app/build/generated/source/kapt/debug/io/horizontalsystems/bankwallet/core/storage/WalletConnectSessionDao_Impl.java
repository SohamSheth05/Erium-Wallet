package io.horizontalsystems.bankwallet.core.storage;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.trustwallet.walletconnect.models.WCPeerMeta;
import com.trustwallet.walletconnect.models.session.WCSession;
import io.horizontalsystems.bankwallet.entities.WalletConnectSession;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WalletConnectSessionDao_Impl implements WalletConnectSessionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WalletConnectSession> __insertionAdapterOfWalletConnectSession;

  private final DatabaseConverters __databaseConverters = new DatabaseConverters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteByPeerId;

  public WalletConnectSessionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWalletConnectSession = new EntityInsertionAdapter<WalletConnectSession>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `WalletConnectSession` (`chainId`,`accountId`,`session`,`peerId`,`remotePeerId`,`remotePeerMeta`,`isAutoSign`,`date`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WalletConnectSession value) {
        stmt.bindLong(1, value.getChainId());
        if (value.getAccountId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAccountId());
        }
        final String _tmp;
        _tmp = __databaseConverters.fromWCSession(value.getSession());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        if (value.getPeerId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPeerId());
        }
        if (value.getRemotePeerId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getRemotePeerId());
        }
        final String _tmp_1;
        _tmp_1 = __databaseConverters.fromWCPeerMeta(value.getRemotePeerMeta());
        if (_tmp_1 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_1);
        }
        final int _tmp_2;
        _tmp_2 = value.isAutoSign() ? 1 : 0;
        stmt.bindLong(7, _tmp_2);
        final long _tmp_3;
        _tmp_3 = __databaseConverters.fromDate(value.getDate());
        stmt.bindLong(8, _tmp_3);
      }
    };
    this.__preparedStmtOfDeleteByPeerId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM WalletConnectSession WHERE remotePeerId = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final WalletConnectSession session) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWalletConnectSession.insert(session);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteByPeerId(final String peerId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteByPeerId.acquire();
    int _argIndex = 1;
    if (peerId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, peerId);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteByPeerId.release(_stmt);
    }
  }

  @Override
  public List<WalletConnectSession> getByAccountId(final String accountId) {
    final String _sql = "SELECT * FROM WalletConnectSession WHERE accountId = ?";
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
      final int _cursorIndexOfChainId = CursorUtil.getColumnIndexOrThrow(_cursor, "chainId");
      final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "accountId");
      final int _cursorIndexOfSession = CursorUtil.getColumnIndexOrThrow(_cursor, "session");
      final int _cursorIndexOfPeerId = CursorUtil.getColumnIndexOrThrow(_cursor, "peerId");
      final int _cursorIndexOfRemotePeerId = CursorUtil.getColumnIndexOrThrow(_cursor, "remotePeerId");
      final int _cursorIndexOfRemotePeerMeta = CursorUtil.getColumnIndexOrThrow(_cursor, "remotePeerMeta");
      final int _cursorIndexOfIsAutoSign = CursorUtil.getColumnIndexOrThrow(_cursor, "isAutoSign");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final List<WalletConnectSession> _result = new ArrayList<WalletConnectSession>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final WalletConnectSession _item;
        final int _tmpChainId;
        _tmpChainId = _cursor.getInt(_cursorIndexOfChainId);
        final String _tmpAccountId;
        if (_cursor.isNull(_cursorIndexOfAccountId)) {
          _tmpAccountId = null;
        } else {
          _tmpAccountId = _cursor.getString(_cursorIndexOfAccountId);
        }
        final WCSession _tmpSession;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfSession)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfSession);
        }
        _tmpSession = __databaseConverters.toWCSession(_tmp);
        final String _tmpPeerId;
        if (_cursor.isNull(_cursorIndexOfPeerId)) {
          _tmpPeerId = null;
        } else {
          _tmpPeerId = _cursor.getString(_cursorIndexOfPeerId);
        }
        final String _tmpRemotePeerId;
        if (_cursor.isNull(_cursorIndexOfRemotePeerId)) {
          _tmpRemotePeerId = null;
        } else {
          _tmpRemotePeerId = _cursor.getString(_cursorIndexOfRemotePeerId);
        }
        final WCPeerMeta _tmpRemotePeerMeta;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfRemotePeerMeta)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfRemotePeerMeta);
        }
        _tmpRemotePeerMeta = __databaseConverters.toWCPeerMeta(_tmp_1);
        final boolean _tmpIsAutoSign;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfIsAutoSign);
        _tmpIsAutoSign = _tmp_2 != 0;
        final Date _tmpDate;
        final long _tmp_3;
        _tmp_3 = _cursor.getLong(_cursorIndexOfDate);
        _tmpDate = __databaseConverters.toDate(_tmp_3);
        _item = new WalletConnectSession(_tmpChainId,_tmpAccountId,_tmpSession,_tmpPeerId,_tmpRemotePeerId,_tmpRemotePeerMeta,_tmpIsAutoSign,_tmpDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public void deleteAllExcept(final List<String> accountIds) {
    __db.assertNotSuspendingTransaction();
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("DELETE FROM WalletConnectSession WHERE accountId NOT IN (");
    final int _inputSize = accountIds.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
    int _argIndex = 1;
    for (String _item : accountIds) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
