package io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsModule;", "", "()V", "Factory", "app_debug"})
public final class RestoreSelectCoinsModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsModule INSTANCE = null;
    
    private RestoreSelectCoinsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u001a\u001a\u0002H\u001b\"\b\b\u0000\u0010\u001b*\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001eH\u0016\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006 "}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "accountType", "Lio/horizontalsystems/bankwallet/entities/AccountType;", "(Lio/horizontalsystems/bankwallet/entities/AccountType;)V", "coinSettingsService", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService;", "getCoinSettingsService", "()Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService;", "coinSettingsService$delegate", "Lkotlin/Lazy;", "enableCoinsService", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService;", "getEnableCoinsService", "()Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService;", "enableCoinsService$delegate", "restoreSelectCoinsService", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsService;", "getRestoreSelectCoinsService", "()Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsService;", "restoreSelectCoinsService$delegate", "restoreSettingsService", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsService;", "getRestoreSettingsService", "()Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsService;", "restoreSettingsService$delegate", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final kotlin.Lazy enableCoinsService$delegate = null;
        private final kotlin.Lazy restoreSettingsService$delegate = null;
        private final kotlin.Lazy coinSettingsService$delegate = null;
        private final kotlin.Lazy restoreSelectCoinsService$delegate = null;
        private final io.horizontalsystems.bankwallet.entities.AccountType accountType = null;
        
        private final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService getEnableCoinsService() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsService getRestoreSettingsService() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService getCoinSettingsService() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService getRestoreSelectCoinsService() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.AccountType accountType) {
            super();
        }
    }
}