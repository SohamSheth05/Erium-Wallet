package io.horizontalsystems.bankwallet.core.storage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lio/horizontalsystems/bankwallet/core/storage/BlockchainSettingsStorage;", "Lio/horizontalsystems/bankwallet/core/IBlockchainSettingsStorage;", "appDatabase", "Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;", "(Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;)V", "newValue", "Lio/horizontalsystems/bankwallet/entities/BitcoinCashCoinType;", "bitcoinCashCoinType", "getBitcoinCashCoinType", "()Lio/horizontalsystems/bankwallet/entities/BitcoinCashCoinType;", "setBitcoinCashCoinType", "(Lio/horizontalsystems/bankwallet/entities/BitcoinCashCoinType;)V", "deleteDerivationSettings", "", "derivationSetting", "Lio/horizontalsystems/bankwallet/entities/DerivationSetting;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "ethereumRpcModeSetting", "Lio/horizontalsystems/bankwallet/entities/EthereumRpcMode;", "initialSyncSetting", "Lio/horizontalsystems/bankwallet/entities/InitialSyncSetting;", "saveDerivationSetting", "saveEthereumRpcModeSetting", "saveInitialSyncSetting", "Companion", "app_debug"})
public final class BlockchainSettingsStorage implements io.horizontalsystems.bankwallet.core.IBlockchainSettingsStorage {
    private final io.horizontalsystems.bankwallet.core.storage.AppDatabase appDatabase = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String syncModeSettingKey = "sync_mode";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String derivationSettingKey = "derivation";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ethereumRpcModeSettingKey = "communication";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String networkCoinTypeKey = "network_coin_type";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.storage.BlockchainSettingsStorage.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType getBitcoinCashCoinType() {
        return null;
    }
    
    @java.lang.Override()
    public void setBitcoinCashCoinType(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType newValue) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.DerivationSetting derivationSetting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return null;
    }
    
    @java.lang.Override()
    public void saveDerivationSetting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.DerivationSetting derivationSetting) {
    }
    
    @java.lang.Override()
    public void deleteDerivationSettings() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.InitialSyncSetting initialSyncSetting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return null;
    }
    
    @java.lang.Override()
    public void saveInitialSyncSetting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.InitialSyncSetting initialSyncSetting) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.EthereumRpcMode ethereumRpcModeSetting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return null;
    }
    
    @java.lang.Override()
    public void saveEthereumRpcModeSetting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.EthereumRpcMode ethereumRpcModeSetting) {
    }
    
    public BlockchainSettingsStorage(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.storage.AppDatabase appDatabase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/core/storage/BlockchainSettingsStorage$Companion;", "", "()V", "derivationSettingKey", "", "ethereumRpcModeSettingKey", "networkCoinTypeKey", "syncModeSettingKey", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}