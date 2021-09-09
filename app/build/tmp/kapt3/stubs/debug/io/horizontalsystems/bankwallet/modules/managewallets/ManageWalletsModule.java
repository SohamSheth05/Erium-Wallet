package io.horizontalsystems.bankwallet.modules.managewallets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsModule;", "", "()V", "Factory", "app_debug"})
public final class ManageWalletsModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsModule INSTANCE = null;
    
    private ManageWalletsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0013\u001a\u0002H\u0014\"\b\b\u0000\u0010\u0014*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016\u00a2\u0006\u0002\u0010\u0018R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "coinSettingsService", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService;", "getCoinSettingsService", "()Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService;", "coinSettingsService$delegate", "Lkotlin/Lazy;", "manageWalletsService", "Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsService;", "getManageWalletsService", "()Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsService;", "manageWalletsService$delegate", "restoreSettingsService", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsService;", "getRestoreSettingsService", "()Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsService;", "restoreSettingsService$delegate", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final kotlin.Lazy restoreSettingsService$delegate = null;
        private final kotlin.Lazy coinSettingsService$delegate = null;
        private final kotlin.Lazy manageWalletsService$delegate = null;
        
        private final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsService getRestoreSettingsService() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService getCoinSettingsService() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService getManageWalletsService() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory() {
            super();
        }
    }
}