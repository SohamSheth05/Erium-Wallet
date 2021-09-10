package io.horizontalsystems.bankwallet.core.storage;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.horizontalsystems.bankwallet.entities.ActiveAccount;
import io.reactivex.Flowable;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AccountsDao_Impl implements AccountsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AccountRecord> __insertionAdapterOfAccountRecord;

  private final DatabaseConverters __databaseConverters = new DatabaseConverters();

  private final EntityInsertionAdapter<ActiveAccount> __insertionAdapterOfActiveAccount;

  private final EntityDeletionOrUpdateAdapter<AccountRecord> __updateAdapterOfAccountRecord;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfClearDeleted;

  private final SharedSQLiteStatement __preparedStmtOfDeleteActiveAccount;

  public AccountsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAccountRecord = new EntityInsertionAdapter<AccountRecord>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `AccountRecord` (`deleted`,`id`,`name`,`type`,`origin`,`isBackedUp`,`words`,`passphrase`,`key`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AccountRecord value) {
        final int _tmp;
        _tmp = value.getDeleted() ? 1 : 0;
        stmt.bindLong(1, _tmp);
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getType() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getType());
        }
        if (value.getOrigin() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOrigin());
        }
        final int _tmp_1;
        _tmp_1 = value.isBackedUp() ? 1 : 0;
        stmt.bindLong(6, _tmp_1);
        final String _tmp_2;
        _tmp_2 = __databaseConverters.encryptSecretList(value.getWords());
        if (_tmp_2 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_2);
        }
        final String _tmp_3;
        _tmp_3 = __databaseConverters.encryptSecretString(value.getPassphrase());
        if (_tmp_3 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_3);
        }
        final String _tmp_4;
        _tmp_4 = __databaseConverters.encryptSecretString(value.getKey());
        if (_tmp_4 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_4);
        }
      }
    };
    this.__insertionAdapterOfActiveAccount = new EntityInsertionAdapter<ActiveAccount>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ActiveAccount` (`accountId`,`primaryKey`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ActiveAccount value) {
        if (value.getAccountId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getAccountId());
        }
        if (value.getPrimaryKey() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPrimaryKey());
        }
      }
    };
    this.__updateAdapterOfAccountRecord = new EntityDeletionOrUpdateAdapter<AccountRecord>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `AccountRecord` SET `deleted` = ?,`id` = ?,`name` = ?,`type` = ?,`origin` = ?,`isBackedUp` = ?,`words` = ?,`passphrase` = ?,`key` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AccountRecord value) {
        final int _tmp;
        _tmp = value.getDeleted() ? 1 : 0;
        stmt.bindLong(1, _tmp);
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getType() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getType());
        }
        if (value.getOrigin() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOrigin());
        }
        final int _tmp_1;
        _tmp_1 = value.isBackedUp() ? 1 : 0;
        stmt.bindLong(6, _tmp_1);
        final String _tmp_2;
        _tmp_2 = __databaseConverters.encryptSecretList(value.getWords());
        if (_tmp_2 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_2);
        }
        final String _tmp_3;
        _tmp_3 = __databaseConverters.encryptSecretString(value.getPassphrase());
        if (_tmp_3 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_3);
        }
        final String _tmp_4;
        _tmp_4 = __databaseConverters.encryptSecretString(value.getKey());
        if (_tmp_4 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_4);
        }
        if (value.getId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getId());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE AccountRecord SET deleted = 1 WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE AccountRecord SET deleted = 1";
        return _query;
      }
    };
    this.__preparedStmtOfClearDeleted = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM AccountRecord WHERE deleted = 1";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteActiveAccount = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ActiveAccount";
        return _query;
      }
    };
  }

  @Override
  public void insert(final AccountRecord accountRow) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAccountRecord.insert(accountRow);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertActiveAccount(final ActiveAccount activeAccount) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfActiveAccount.insert(activeAccount);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final AccountRecord accountRow) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfAccountRecord.handle(accountRow);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final String id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    if (id == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, id);
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
  public void clearDeleted() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearDeleted.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearDeleted.release(_stmt);
    }
  }

  @Override
  public void deleteActiveAccount() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteActiveAccount.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteActiveAccount.release(_stmt);
    }
  }

  @Override
  public List<AccountRecord> getAll() {
    final String _sql = "SELECT * FROM AccountRecord WHERE deleted = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfDeleted = CursorUtil.getColumnIndexOrThrow(_cursor, "deleted");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfOrigin = CursorUtil.getColumnIndexOrThrow(_cursor, "origin");
      final int _cursorIndexOfIsBackedUp = CursorUtil.getColumnIndexOrThrow(_cursor, "isBackedUp");
      final int _cursorIndexOfWords = CursorUtil.getColumnIndexOrThrow(_cursor, "words");
      final int _cursorIndexOfPassphrase = CursorUtil.getColumnIndexOrThrow(_cursor, "passphrase");
      final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
      final List<AccountRecord> _result = new ArrayList<AccountRecord>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AccountRecord _item;
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpType;
        if (_cursor.isNull(_cursorIndexOfType)) {
          _tmpType = null;
        } else {
          _tmpType = _cursor.getString(_cursorIndexOfType);
        }
        final String _tmpOrigin;
        if (_cursor.isNull(_cursorIndexOfOrigin)) {
          _tmpOrigin = null;
        } else {
          _tmpOrigin = _cursor.getString(_cursorIndexOfOrigin);
        }
        final boolean _tmpIsBackedUp;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsBackedUp);
        _tmpIsBackedUp = _tmp != 0;
        final SecretList _tmpWords;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfWords)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfWords);
        }
        _tmpWords = __databaseConverters.decryptSecretList(_tmp_1);
        final SecretString _tmpPassphrase;
        final String _tmp_2;
        if (_cursor.isNull(_cursorIndexOfPassphrase)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getString(_cursorIndexOfPassphrase);
        }
        _tmpPassphrase = __databaseConverters.decryptSecretString(_tmp_2);
        final SecretString _tmpKey;
        final String _tmp_3;
        if (_cursor.isNull(_cursorIndexOfKey)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getString(_cursorIndexOfKey);
        }
        _tmpKey = __databaseConverters.decryptSecretString(_tmp_3);
        _item = new AccountRecord(_tmpId,_tmpName,_tmpType,_tmpOrigin,_tmpIsBackedUp,_tmpWords,_tmpPassphrase,_tmpKey);
        final boolean _tmpDeleted;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfDeleted);
        _tmpDeleted = _tmp_4 != 0;
        _item.setDeleted(_tmpDeleted);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<String> getDeletedIds() {
    final String _sql = "SELECT id FROM AccountRecord WHERE deleted = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final String _item;
        if (_cursor.isNull(0)) {
          _item = null;
        } else {
          _item = _cursor.getString(0);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Flowable<Integer> getNonBackedUpCount() {
    final String _sql = "SELECT COUNT(*) FROM AccountRecord WHERE isBackedUp = 0 AND deleted = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"AccountRecord"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public int getTotalCount() {
    final String _sql = "SELECT COUNT(*) FROM AccountRecord WHERE deleted = 0";
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

  @Override
  public ActiveAccount getActiveAccount() {
    final String _sql = "SELECT * FROM ActiveAccount LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "accountId");
      final int _cursorIndexOfPrimaryKey = CursorUtil.getColumnIndexOrThrow(_cursor, "primaryKey");
      final ActiveAccount _result;
      if(_cursor.moveToFirst()) {
        final String _tmpAccountId;
        if (_cursor.isNull(_cursorIndexOfAccountId)) {
          _tmpAccountId = null;
        } else {
          _tmpAccountId = _cursor.getString(_cursorIndexOfAccountId);
        }
        final String _tmpPrimaryKey;
        if (_cursor.isNull(_cursorIndexOfPrimaryKey)) {
          _tmpPrimaryKey = null;
        } else {
          _tmpPrimaryKey = _cursor.getString(_cursorIndexOfPrimaryKey);
        }
        _result = new ActiveAccount(_tmpAccountId,_tmpPrimaryKey);
      } else {
        _result = null;
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
