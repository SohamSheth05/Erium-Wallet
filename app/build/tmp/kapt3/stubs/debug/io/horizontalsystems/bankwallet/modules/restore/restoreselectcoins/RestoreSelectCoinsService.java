package io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002QRBE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u001e\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u001b2\f\u00109\u001a\b\u0012\u0004\u0012\u00020#0\'H\u0002J\b\u0010:\u001a\u000207H\u0016J\u000e\u0010;\u001a\u0002072\u0006\u00108\u001a\u00020\u001bJ$\u00109\u001a\b\u0012\u0004\u0012\u00020#0\'2\u0006\u00108\u001a\u00020\u001b2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\'H\u0002J\u000e\u0010>\u001a\u0002072\u0006\u00108\u001a\u00020\u001bJ\u000e\u0010?\u001a\u0002072\u0006\u00108\u001a\u00020\u001bJ \u0010?\u001a\u0002072\f\u00109\u001a\b\u0012\u0004\u0012\u00020#0\'2\b\b\u0002\u0010@\u001a\u00020\u0015H\u0002J\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001b0\'2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\'H\u0002J \u0010B\u001a\u0002072\u0006\u00108\u001a\u00020\u001b2\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\'H\u0002J\u001a\u0010C\u001a\u0002072\u0006\u00108\u001a\u00020\u001b2\b\b\u0002\u0010D\u001a\u00020,H\u0002J\u0016\u0010E\u001a\u0002072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\'H\u0002J\u0010\u0010F\u001a\u0002072\u0006\u00108\u001a\u00020\u001bH\u0002J\u0010\u0010G\u001a\u0002072\u0006\u00108\u001a\u00020\u001bH\u0002J\u0010\u0010H\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u001bH\u0002J\u0010\u0010I\u001a\u00020J2\u0006\u00108\u001a\u00020\u001bH\u0002J\u0010\u0010K\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u001bH\u0002J\u0006\u0010L\u001a\u000207J\u0010\u0010M\u001a\u0002072\b\u0010N\u001a\u0004\u0018\u00010)J\b\u0010@\u001a\u000207H\u0002J\b\u0010O\u001a\u000207H\u0002J\b\u0010P\u001a\u000207H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u001b0\u001b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020,0+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020.@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001f\u00104\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010.0.0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0018R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006S"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "accountType", "Lio/horizontalsystems/bankwallet/entities/AccountType;", "accountFactory", "Lio/horizontalsystems/bankwallet/core/IAccountFactory;", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "coinManager", "Lio/horizontalsystems/bankwallet/core/ICoinManager;", "enableCoinsService", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService;", "restoreSettingsService", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsService;", "coinSettingsService", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService;", "(Lio/horizontalsystems/bankwallet/entities/AccountType;Lio/horizontalsystems/bankwallet/core/IAccountFactory;Lio/horizontalsystems/bankwallet/core/IAccountManager;Lio/horizontalsystems/bankwallet/core/IWalletManager;Lio/horizontalsystems/bankwallet/core/ICoinManager;Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService;Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsService;Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService;)V", "canRestore", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "getCanRestore", "()Lio/reactivex/subjects/BehaviorSubject;", "cancelEnableCoinAsync", "Lio/reactivex/subjects/PublishSubject;", "Lio/horizontalsystems/coinkit2/models/Coin;", "getCancelEnableCoinAsync", "()Lio/reactivex/subjects/PublishSubject;", "coins", "", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "enabledCoins", "Lio/horizontalsystems/bankwallet/entities/ConfiguredCoin;", "getEnabledCoins", "()Ljava/util/List;", "featuredCoins", "", "filter", "", "restoreSettingsMap", "", "Lio/horizontalsystems/bankwallet/core/managers/RestoreSettings;", "value", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsService$State;", "state", "getState", "()Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsService$State;", "setState", "(Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsService$State;)V", "stateObservable", "getStateObservable", "applySettings", "", "coin", "configuredCoins", "clear", "configure", "settingsList", "Lio/horizontalsystems/bankwallet/entities/CoinSettings;", "disable", "enable", "sortCoins", "filtered", "handleApproveCoinSettings", "handleApproveRestoreSettings", "settings", "handleEnable", "handleRejectApproveCoinSettings", "handleRejectApproveRestoreSettings", "isEnabled", "item", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsService$Item;", "notEnabled", "restore", "setFilter", "v", "syncCanRestore", "syncState", "Item", "State", "app_debug"})
public final class RestoreSelectCoinsService implements io.horizontalsystems.bankwallet.core.Clearable {
    private java.lang.String filter;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final java.util.List<io.horizontalsystems.coinkit2.models.Coin> featuredCoins = null;
    private final java.util.List<io.horizontalsystems.coinkit2.models.Coin> coins = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.entities.ConfiguredCoin> enabledCoins = null;
    private java.util.Map<io.horizontalsystems.coinkit2.models.Coin, io.horizontalsystems.bankwallet.core.managers.RestoreSettings> restoreSettingsMap;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.coinkit2.models.Coin> cancelEnableCoinAsync = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> canRestore = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.State> stateObservable = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.State state;
    private final io.horizontalsystems.bankwallet.entities.AccountType accountType = null;
    private final io.horizontalsystems.bankwallet.core.IAccountFactory accountFactory = null;
    private final io.horizontalsystems.bankwallet.core.IAccountManager accountManager = null;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bankwallet.core.ICoinManager coinManager = null;
    private final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService enableCoinsService = null;
    private final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsService restoreSettingsService = null;
    private final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService coinSettingsService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.entities.ConfiguredCoin> getEnabledCoins() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<io.horizontalsystems.coinkit2.models.Coin> getCancelEnableCoinAsync() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> getCanRestore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.State> getStateObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.State getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.State value) {
    }
    
    private final boolean isEnabled(io.horizontalsystems.coinkit2.models.Coin coin) {
        return false;
    }
    
    private final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.Item item(io.horizontalsystems.coinkit2.models.Coin coin) {
        return null;
    }
    
    private final java.util.List<io.horizontalsystems.coinkit2.models.Coin> filtered(java.util.List<io.horizontalsystems.coinkit2.models.Coin> coins) {
        return null;
    }
    
    private final void sortCoins() {
    }
    
    private final void syncState() {
    }
    
    private final void syncCanRestore() {
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.entities.ConfiguredCoin> configuredCoins(io.horizontalsystems.coinkit2.models.Coin coin, java.util.List<io.horizontalsystems.bankwallet.entities.CoinSettings> settingsList) {
        return null;
    }
    
    private final void handleApproveRestoreSettings(io.horizontalsystems.coinkit2.models.Coin coin, io.horizontalsystems.bankwallet.core.managers.RestoreSettings settings) {
    }
    
    private final void handleRejectApproveRestoreSettings(io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    private final void handleApproveCoinSettings(io.horizontalsystems.coinkit2.models.Coin coin, java.util.List<io.horizontalsystems.bankwallet.entities.CoinSettings> settingsList) {
    }
    
    private final void handleRejectApproveCoinSettings(io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    private final void applySettings(io.horizontalsystems.coinkit2.models.Coin coin, java.util.List<io.horizontalsystems.bankwallet.entities.ConfiguredCoin> configuredCoins) {
    }
    
    private final void handleEnable(java.util.List<io.horizontalsystems.coinkit2.models.Coin> coins) {
    }
    
    private final boolean notEnabled(io.horizontalsystems.coinkit2.models.Coin coin) {
        return false;
    }
    
    private final void enable(java.util.List<io.horizontalsystems.bankwallet.entities.ConfiguredCoin> configuredCoins, boolean sortCoins) {
    }
    
    public final void setFilter(@org.jetbrains.annotations.Nullable()
    java.lang.String v) {
    }
    
    public final void enable(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public final void disable(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public final void configure(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public final void restore() {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public RestoreSelectCoinsService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.AccountType accountType, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountFactory accountFactory, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ICoinManager coinManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService enableCoinsService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsService restoreSettingsService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService coinSettingsService) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsService$State;", "", "featured", "", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsService$Item;", "items", "(Ljava/util/List;Ljava/util/List;)V", "getFeatured", "()Ljava/util/List;", "getItems", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class State {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.Item> featured = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.Item> items = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.Item> getFeatured() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.Item> getItems() {
            return null;
        }
        
        public State(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.Item> featured, @org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.Item> items) {
            super();
        }
        
        public State() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.Item> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.Item> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.State copy(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.Item> featured, @org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.Item> items) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsService$Item;", "", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "hasSettings", "", "enabled", "(Lio/horizontalsystems/coinkit2/models/Coin;ZZ)V", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "getEnabled", "()Z", "getHasSettings", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Item {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.coinkit2.models.Coin coin = null;
        private final boolean hasSettings = false;
        private final boolean enabled = false;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin getCoin() {
            return null;
        }
        
        public final boolean getHasSettings() {
            return false;
        }
        
        public final boolean getEnabled() {
            return false;
        }
        
        public Item(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, boolean hasSettings, boolean enabled) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.Item copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, boolean hasSettings, boolean enabled) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}