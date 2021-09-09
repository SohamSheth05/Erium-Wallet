package io.horizontalsystems.bankwallet.core.storage.migrations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/core/storage/migrations/Migration_31_32;", "Landroidx/room/migration/Migration;", "()V", "createTableActiveAccount", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "createTableRestoreSettings", "handleZcashAccount", "migrate", "moveCoinSettingsFromBlockchainSettingsToWallet", "setAccountUserFriendlyName", "setActiveAccount", "updateAccountRecordTable", "app_debug"})
public final class Migration_31_32 extends androidx.room.migration.Migration {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.storage.migrations.Migration_31_32 INSTANCE = null;
    
    @java.lang.Override()
    public void migrate(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteDatabase database) {
    }
    
    private final void handleZcashAccount(androidx.sqlite.db.SupportSQLiteDatabase database) {
    }
    
    private final void updateAccountRecordTable(androidx.sqlite.db.SupportSQLiteDatabase database) {
    }
    
    private final void createTableActiveAccount(androidx.sqlite.db.SupportSQLiteDatabase database) {
    }
    
    private final void createTableRestoreSettings(androidx.sqlite.db.SupportSQLiteDatabase database) {
    }
    
    private final void moveCoinSettingsFromBlockchainSettingsToWallet(androidx.sqlite.db.SupportSQLiteDatabase database) {
    }
    
    private final void setActiveAccount(androidx.sqlite.db.SupportSQLiteDatabase database) {
    }
    
    private final void setAccountUserFriendlyName(androidx.sqlite.db.SupportSQLiteDatabase database) {
    }
    
    private Migration_31_32() {
        super(0, 0);
    }
}