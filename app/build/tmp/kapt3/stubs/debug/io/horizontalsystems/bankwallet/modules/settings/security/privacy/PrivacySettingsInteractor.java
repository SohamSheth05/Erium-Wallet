package io.horizontalsystems.bankwallet.modules.settings.security.privacy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020=H\u0016J\b\u0010?\u001a\u00020=H\u0016J\b\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020=2\u0006\u0010C\u001a\u00020AH\u0016J\u0010\u0010D\u001a\u00020=2\u0006\u0010E\u001a\u00020FH\u0016J\b\u0010G\u001a\u00020=H\u0016J\b\u0010H\u001a\u00020=H\u0016J \u0010I\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020-0J0(H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u001a\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010+R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020-8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00102\u001a\u00020-8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u0010/R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u00104\u001a\u0002032\u0006\u0010,\u001a\u0002038V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020:0(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b;\u0010+\u00a8\u0006K"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsInteractor;", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsModule$IPrivacySettingsInteractor;", "pinComponent", "Lio/horizontalsystems/core/IPinComponent;", "torManager", "Lio/horizontalsystems/bankwallet/core/ITorManager;", "syncModeSettingsManager", "Lio/horizontalsystems/bankwallet/core/IInitialSyncModeSettingsManager;", "ethereumRpcModeSettingsManager", "Lio/horizontalsystems/bankwallet/core/IEthereumRpcModeSettingsManager;", "coinManager", "Lio/horizontalsystems/bankwallet/core/ICoinManager;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "localStorageManager", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "(Lio/horizontalsystems/core/IPinComponent;Lio/horizontalsystems/bankwallet/core/ITorManager;Lio/horizontalsystems/bankwallet/core/IInitialSyncModeSettingsManager;Lio/horizontalsystems/bankwallet/core/IEthereumRpcModeSettingsManager;Lio/horizontalsystems/bankwallet/core/ICoinManager;Lio/horizontalsystems/bankwallet/core/IWalletManager;Lio/horizontalsystems/bankwallet/core/IAccountManager;Lio/horizontalsystems/bankwallet/core/ILocalStorage;)V", "activeAccount", "Lio/horizontalsystems/bankwallet/entities/Account;", "getActiveAccount", "()Lio/horizontalsystems/bankwallet/entities/Account;", "binance", "Lio/horizontalsystems/coinkit2/models/Coin;", "getBinance", "()Lio/horizontalsystems/coinkit2/models/Coin;", "binanceSmartChain", "getBinanceSmartChain", "delegate", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsModule$IPrivacySettingsInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsModule$IPrivacySettingsInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsModule$IPrivacySettingsInteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "ether", "getEther", "ethereumCommunicationModes", "", "Lio/horizontalsystems/bankwallet/entities/CommunicationMode;", "getEthereumCommunicationModes", "()Ljava/util/List;", "value", "", "isTorEnabled", "()Z", "setTorEnabled", "(Z)V", "isTorNotificationEnabled", "Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;", "transactionsSortingType", "getTransactionsSortingType", "()Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;", "setTransactionsSortingType", "(Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;)V", "wallets", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "getWallets", "clear", "", "disableTor", "enableTor", "ethereumConnection", "Lio/horizontalsystems/bankwallet/entities/EthereumRpcMode;", "saveEthereumRpcModeSetting", "rpcModeSetting", "saveSyncModeSetting", "syncModeSetting", "Lio/horizontalsystems/bankwallet/entities/InitialSyncSetting;", "stopTor", "subscribeToTorStatus", "syncSettings", "Lkotlin/Triple;", "app_debug"})
public final class PrivacySettingsInteractor implements io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsModule.IPrivacySettingsInteractor {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsModule.IPrivacySettingsInteractorDelegate delegate;
    private io.reactivex.disposables.CompositeDisposable disposables;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.coinkit2.models.Coin ether = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.coinkit2.models.Coin binance = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.coinkit2.models.Coin binanceSmartChain = null;
    private final io.horizontalsystems.core.IPinComponent pinComponent = null;
    private final io.horizontalsystems.bankwallet.core.ITorManager torManager = null;
    private final io.horizontalsystems.bankwallet.core.IInitialSyncModeSettingsManager syncModeSettingsManager = null;
    private final io.horizontalsystems.bankwallet.core.IEthereumRpcModeSettingsManager ethereumRpcModeSettingsManager = null;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bankwallet.core.IAccountManager accountManager = null;
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorageManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsModule.IPrivacySettingsInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsModule.IPrivacySettingsInteractorDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.TransactionDataSortingType getTransactionsSortingType() {
        return null;
    }
    
    @java.lang.Override()
    public void setTransactionsSortingType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionDataSortingType value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> getWallets() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.Account getActiveAccount() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isTorEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public void setTorEnabled(boolean value) {
    }
    
    @java.lang.Override()
    public boolean isTorNotificationEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.entities.CommunicationMode> getEthereumCommunicationModes() {
        return null;
    }
    
    @java.lang.Override()
    public void subscribeToTorStatus() {
    }
    
    @java.lang.Override()
    public void stopTor() {
    }
    
    @java.lang.Override()
    public void enableTor() {
    }
    
    @java.lang.Override()
    public void disableTor() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<kotlin.Triple<io.horizontalsystems.bankwallet.entities.InitialSyncSetting, io.horizontalsystems.coinkit2.models.Coin, java.lang.Boolean>> syncSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.EthereumRpcMode ethereumConnection() {
        return null;
    }
    
    @java.lang.Override()
    public void saveEthereumRpcModeSetting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.EthereumRpcMode rpcModeSetting) {
    }
    
    @java.lang.Override()
    public void saveSyncModeSetting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.InitialSyncSetting syncModeSetting) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.coinkit2.models.Coin getEther() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.coinkit2.models.Coin getBinance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.coinkit2.models.Coin getBinanceSmartChain() {
        return null;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public PrivacySettingsInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.IPinComponent pinComponent, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ITorManager torManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IInitialSyncModeSettingsManager syncModeSettingsManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IEthereumRpcModeSettingsManager ethereumRpcModeSettingsManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ICoinManager coinManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorageManager) {
        super();
    }
}