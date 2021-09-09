package io.horizontalsystems.bankwallet.modules.settings.security.privacy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\t\n\u000b\f\rB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsModule;", "", "()V", "init", "", "view", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsViewModel;", "router", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsModule$IPrivacySettingsRouter;", "IPrivacySettingsInteractor", "IPrivacySettingsInteractorDelegate", "IPrivacySettingsRouter", "IPrivacySettingsView", "IPrivacySettingsViewDelegate", "app_debug"})
public final class PrivacySettingsModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsModule INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsViewModel view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsModule.IPrivacySettingsRouter router) {
    }
    
    private PrivacySettingsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&J&\u0010\u0013\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J&\u0010\u001b\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00052\u0006\u0010\u0015\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u001e\u001a\u00020\u0003H&J\u001e\u0010\u001f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0006\u0010 \u001a\u00020\rH&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001aH&\u00a8\u0006#"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsModule$IPrivacySettingsView;", "", "setCommunicationSettingsViewItems", "", "items", "", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsViewItem;", "setRestoreWalletSettingsViewItems", "setTorConnectionStatus", "connectionStatus", "Lio/horizontalsystems/bankwallet/core/managers/TorStatus;", "setTransactionsOrdering", "transactionsOrdering", "Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;", "showCommunicationModeChangeAlert", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "selectedCommunication", "Lio/horizontalsystems/bankwallet/entities/CommunicationMode;", "showCommunicationSelectorDialog", "communicationModeOptions", "selected", "showNotificationsNotEnabledAlert", "showPrivacySettingsInfo", "showRestartAlert", "checked", "", "showSyncModeSelectorDialog", "syncModeOptions", "Lio/horizontalsystems/bankwallet/entities/SyncMode;", "showTorPrerequisitesAlert", "showTransactionsSortingOptions", "selectedItem", "toggleTorEnabled", "torEnabled", "app_debug"})
    public static abstract interface IPrivacySettingsView {
        
        public abstract void showPrivacySettingsInfo();
        
        public abstract void showNotificationsNotEnabledAlert();
        
        public abstract void showTorPrerequisitesAlert();
        
        public abstract void showRestartAlert(boolean checked);
        
        public abstract void toggleTorEnabled(boolean torEnabled);
        
        public abstract void setCommunicationSettingsViewItems(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsViewItem> items);
        
        public abstract void setRestoreWalletSettingsViewItems(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsViewItem> items);
        
        public abstract void showCommunicationSelectorDialog(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends io.horizontalsystems.bankwallet.entities.CommunicationMode> communicationModeOptions, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.CommunicationMode selected, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin);
        
        public abstract void showSyncModeSelectorDialog(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends io.horizontalsystems.bankwallet.entities.SyncMode> syncModeOptions, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.SyncMode selected, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin);
        
        public abstract void showCommunicationModeChangeAlert(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.CommunicationMode selectedCommunication);
        
        public abstract void setTransactionsOrdering(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.TransactionDataSortingType transactionsOrdering);
        
        public abstract void showTransactionsSortingOptions(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends io.horizontalsystems.bankwallet.entities.TransactionDataSortingType> items, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.TransactionDataSortingType selectedItem);
        
        public abstract void setTorConnectionStatus(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.managers.TorStatus connectionStatus);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u001a\u001a\u00020\u0003H&\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsModule$IPrivacySettingsViewDelegate;", "", "clear", "", "didSwitchTorEnabled", "checked", "", "onApplyTorPrerequisites", "onItemTap", "settingType", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsType;", "position", "", "onSelectSetting", "onSelectTransactionSorting", "transactionDataSortingType", "Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;", "onShowPrivacySettingsInfoClick", "onTransactionOrderSettingTap", "proceedWithCommunicationModeChange", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "communicationMode", "Lio/horizontalsystems/bankwallet/entities/CommunicationMode;", "setTorEnabled", "updateTorState", "viewDidLoad", "app_debug"})
    public static abstract interface IPrivacySettingsViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void didSwitchTorEnabled(boolean checked);
        
        public abstract void onApplyTorPrerequisites(boolean checked);
        
        public abstract void updateTorState(boolean checked);
        
        public abstract void setTorEnabled(boolean checked);
        
        public abstract void onItemTap(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsType settingType, int position);
        
        public abstract void onSelectSetting(int position);
        
        public abstract void proceedWithCommunicationModeChange(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.CommunicationMode communicationMode);
        
        public abstract void onTransactionOrderSettingTap();
        
        public abstract void onSelectTransactionSorting(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.TransactionDataSortingType transactionDataSortingType);
        
        public abstract void onShowPrivacySettingsInfoClick();
        
        public abstract void clear();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\"\u001a\u00020#H&J\b\u0010$\u001a\u00020#H&J\b\u0010%\u001a\u00020#H&J\b\u0010&\u001a\u00020\'H&J\u0010\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020\'H&J\u0010\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,H&J\b\u0010-\u001a\u00020#H&J\b\u0010.\u001a\u00020#H&J \u0010/\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014000\u000fH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u0014X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0019\u001a\u00020\u001aX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0012\u00a8\u00061"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsModule$IPrivacySettingsInteractor;", "", "activeAccount", "Lio/horizontalsystems/bankwallet/entities/Account;", "getActiveAccount", "()Lio/horizontalsystems/bankwallet/entities/Account;", "binance", "Lio/horizontalsystems/coinkit2/models/Coin;", "getBinance", "()Lio/horizontalsystems/coinkit2/models/Coin;", "binanceSmartChain", "getBinanceSmartChain", "ether", "getEther", "ethereumCommunicationModes", "", "Lio/horizontalsystems/bankwallet/entities/CommunicationMode;", "getEthereumCommunicationModes", "()Ljava/util/List;", "isTorEnabled", "", "()Z", "setTorEnabled", "(Z)V", "isTorNotificationEnabled", "transactionsSortingType", "Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;", "getTransactionsSortingType", "()Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;", "setTransactionsSortingType", "(Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;)V", "wallets", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "getWallets", "clear", "", "disableTor", "enableTor", "ethereumConnection", "Lio/horizontalsystems/bankwallet/entities/EthereumRpcMode;", "saveEthereumRpcModeSetting", "rpcModeSetting", "saveSyncModeSetting", "syncModeSetting", "Lio/horizontalsystems/bankwallet/entities/InitialSyncSetting;", "stopTor", "subscribeToTorStatus", "syncSettings", "Lkotlin/Triple;", "app_debug"})
    public static abstract interface IPrivacySettingsInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> getWallets();
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.horizontalsystems.bankwallet.entities.Account getActiveAccount();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.entities.TransactionDataSortingType getTransactionsSortingType();
        
        public abstract void setTransactionsSortingType(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.TransactionDataSortingType p0);
        
        public abstract boolean isTorEnabled();
        
        public abstract void setTorEnabled(boolean p0);
        
        public abstract boolean isTorNotificationEnabled();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<io.horizontalsystems.bankwallet.entities.CommunicationMode> getEthereumCommunicationModes();
        
        public abstract void stopTor();
        
        public abstract void enableTor();
        
        public abstract void disableTor();
        
        public abstract void subscribeToTorStatus();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<kotlin.Triple<io.horizontalsystems.bankwallet.entities.InitialSyncSetting, io.horizontalsystems.coinkit2.models.Coin, java.lang.Boolean>> syncSettings();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.entities.EthereumRpcMode ethereumConnection();
        
        public abstract void saveEthereumRpcModeSetting(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.EthereumRpcMode rpcModeSetting);
        
        public abstract void saveSyncModeSetting(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.InitialSyncSetting syncModeSetting);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.coinkit2.models.Coin getEther();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.coinkit2.models.Coin getBinance();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.coinkit2.models.Coin getBinanceSmartChain();
        
        public abstract void clear();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsModule$IPrivacySettingsInteractorDelegate;", "", "didStopTor", "", "onTorConnectionStatusUpdated", "connectionStatus", "Lio/horizontalsystems/bankwallet/core/managers/TorStatus;", "app_debug"})
    public static abstract interface IPrivacySettingsInteractorDelegate {
        
        public abstract void didStopTor();
        
        public abstract void onTorConnectionStatusUpdated(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.managers.TorStatus connectionStatus);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsModule$IPrivacySettingsRouter;", "", "restartApp", "", "app_debug"})
    public static abstract interface IPrivacySettingsRouter {
        
        public abstract void restartApp();
    }
}