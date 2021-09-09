package io.horizontalsystems.bankwallet.core.storage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0016\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/core/storage/RestoreSettingsStorage;", "Lio/horizontalsystems/bankwallet/core/IRestoreSettingsStorage;", "appDatabase", "Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;", "(Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;)V", "dao", "Lio/horizontalsystems/bankwallet/core/storage/RestoreSettingDao;", "getDao", "()Lio/horizontalsystems/bankwallet/core/storage/RestoreSettingDao;", "dao$delegate", "Lkotlin/Lazy;", "deleteAllRestoreSettings", "", "accountId", "", "restoreSettings", "", "Lio/horizontalsystems/bankwallet/entities/RestoreSettingRecord;", "coinId", "save", "restoreSettingRecords", "app_debug"})
public final class RestoreSettingsStorage implements io.horizontalsystems.bankwallet.core.IRestoreSettingsStorage {
    private final kotlin.Lazy dao$delegate = null;
    
    private final io.horizontalsystems.bankwallet.core.storage.RestoreSettingDao getDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.entities.RestoreSettingRecord> restoreSettings(@org.jetbrains.annotations.NotNull()
    java.lang.String accountId, @org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.entities.RestoreSettingRecord> restoreSettings(@org.jetbrains.annotations.NotNull()
    java.lang.String accountId) {
        return null;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.RestoreSettingRecord> restoreSettingRecords) {
    }
    
    @java.lang.Override()
    public void deleteAllRestoreSettings(@org.jetbrains.annotations.NotNull()
    java.lang.String accountId) {
    }
    
    public RestoreSettingsStorage(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.storage.AppDatabase appDatabase) {
        super();
    }
}