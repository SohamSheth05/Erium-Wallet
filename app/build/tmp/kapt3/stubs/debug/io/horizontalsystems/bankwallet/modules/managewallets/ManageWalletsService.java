package io.horizontalsystems.bankwallet.modules.managewallets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002IJB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u001e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00112\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0018H\u0002J\b\u0010/\u001a\u00020+H\u0016J\u000e\u00100\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0011J$\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00182\u0006\u0010,\u001a\u00020\u00112\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0018H\u0002J\u000e\u00103\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0011J\u000e\u00104\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0011J\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018H\u0002J\u0016\u00106\u001a\u00020+2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018H\u0002J \u00107\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00112\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0018H\u0002J\u001a\u00108\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00112\b\b\u0002\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0011H\u0002J\u0010\u0010<\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0011H\u0002J\u0016\u0010=\u001a\u00020+2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0\u0018H\u0002J\u0010\u0010>\u001a\u00020?2\u0006\u0010,\u001a\u00020\u0011H\u0002J\u0010\u0010@\u001a\u00020A2\u0006\u0010,\u001a\u00020\u0011H\u0002J\u0010\u0010B\u001a\u00020+2\b\u0010C\u001a\u0004\u0018\u00010\u001dJ\b\u0010D\u001a\u00020+H\u0002J\u0016\u0010E\u001a\u00020+2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020)0\u0018H\u0002J\b\u0010G\u001a\u00020+H\u0002J\b\u0010H\u001a\u00020+H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00110\u00110\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001f\u0010%\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u001f0\u001f0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006K"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "coinManager", "Lio/horizontalsystems/bankwallet/core/ICoinManager;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "restoreSettingsService", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsService;", "coinSettingsService", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService;", "(Lio/horizontalsystems/bankwallet/core/ICoinManager;Lio/horizontalsystems/bankwallet/core/IWalletManager;Lio/horizontalsystems/bankwallet/core/IAccountManager;Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsService;Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService;)V", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "addedCoins", "", "Lio/horizontalsystems/coinkit2/models/Coin;", "cancelEnableCoinAsync", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "getCancelEnableCoinAsync", "()Lio/reactivex/subjects/PublishSubject;", "coins", "", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "featuredCoins", "filter", "", "value", "Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsService$State;", "state", "getState", "()Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsService$State;", "setState", "(Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsService$State;)V", "stateAsync", "getStateAsync", "wallets", "", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "applySettings", "", "coin", "configuredCoins", "Lio/horizontalsystems/bankwallet/entities/ConfiguredCoin;", "clear", "configure", "settingsList", "Lio/horizontalsystems/bankwallet/entities/CoinSettings;", "disable", "enable", "filtered", "handleAdded", "handleApproveCoinSettings", "handleApproveRestoreSettings", "settings", "Lio/horizontalsystems/bankwallet/core/managers/RestoreSettings;", "handleRejectApproveCoinSettings", "handleRejectApproveRestoreSettings", "handleUpdated", "isEnabled", "", "item", "Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsService$Item;", "setFilter", "v", "sortCoins", "sync", "walletList", "syncCoins", "syncState", "Item", "State", "app_debug"})
public final class ManageWalletsService implements io.horizontalsystems.bankwallet.core.Clearable {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.State> stateAsync = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.State state;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.coinkit2.models.Coin> cancelEnableCoinAsync = null;
    private final io.horizontalsystems.bankwallet.entities.Account account = null;
    private java.util.Set<io.horizontalsystems.bankwallet.entities.Wallet> wallets;
    private java.util.List<io.horizontalsystems.coinkit2.models.Coin> featuredCoins;
    private java.util.List<io.horizontalsystems.coinkit2.models.Coin> coins;
    private java.util.List<io.horizontalsystems.coinkit2.models.Coin> addedCoins;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private java.lang.String filter;
    private final io.horizontalsystems.bankwallet.core.ICoinManager coinManager = null;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsService restoreSettingsService = null;
    private final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService coinSettingsService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.State> getStateAsync() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.State getState() {
        return null;
    }
    
    private final void setState(io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.State value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<io.horizontalsystems.coinkit2.models.Coin> getCancelEnableCoinAsync() {
        return null;
    }
    
    private final void syncCoins() {
    }
    
    private final boolean isEnabled(io.horizontalsystems.coinkit2.models.Coin coin) {
        return false;
    }
    
    private final void sortCoins() {
    }
    
    private final void sync(java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> walletList) {
    }
    
    private final io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.Item item(io.horizontalsystems.coinkit2.models.Coin coin) {
        return null;
    }
    
    private final java.util.List<io.horizontalsystems.coinkit2.models.Coin> filtered(java.util.List<io.horizontalsystems.coinkit2.models.Coin> coins) {
        return null;
    }
    
    private final void syncState() {
    }
    
    private final void handleUpdated(java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
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
    
    private final void handleAdded(java.util.List<io.horizontalsystems.coinkit2.models.Coin> coins) {
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
    
    @java.lang.Override()
    public void clear() {
    }
    
    public ManageWalletsService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ICoinManager coinManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsService restoreSettingsService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService coinSettingsService) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsService$Item;", "", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "hasSettings", "", "enabled", "(Lio/horizontalsystems/coinkit2/models/Coin;ZZ)V", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "getEnabled", "()Z", "getHasSettings", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
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
        public final io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.Item copy(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsService$State;", "", "featuredItems", "", "Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsService$Item;", "items", "(Ljava/util/List;Ljava/util/List;)V", "getFeaturedItems", "()Ljava/util/List;", "getItems", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class State {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.Item> featuredItems = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.Item> items = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.Item> getFeaturedItems() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.Item> getItems() {
            return null;
        }
        
        public State(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.Item> featuredItems, @org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.Item> items) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.Item> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.Item> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.State copy(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.Item> featuredItems, @org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.Item> items) {
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