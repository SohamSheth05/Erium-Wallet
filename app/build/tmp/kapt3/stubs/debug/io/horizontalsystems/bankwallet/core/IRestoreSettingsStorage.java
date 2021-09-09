package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IRestoreSettingsStorage;", "", "deleteAllRestoreSettings", "", "accountId", "", "restoreSettings", "", "Lio/horizontalsystems/bankwallet/entities/RestoreSettingRecord;", "coinId", "save", "restoreSettingRecords", "app_debug"})
public abstract interface IRestoreSettingsStorage {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bankwallet.entities.RestoreSettingRecord> restoreSettings(@org.jetbrains.annotations.NotNull()
    java.lang.String accountId, @org.jetbrains.annotations.NotNull()
    java.lang.String coinId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bankwallet.entities.RestoreSettingRecord> restoreSettings(@org.jetbrains.annotations.NotNull()
    java.lang.String accountId);
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.RestoreSettingRecord> restoreSettingRecords);
    
    public abstract void deleteAllRestoreSettings(@org.jetbrains.annotations.NotNull()
    java.lang.String accountId);
}