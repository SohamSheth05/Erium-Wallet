package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ \u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f0\fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/InitialSyncSettingsManager;", "Lio/horizontalsystems/bankwallet/core/IInitialSyncModeSettingsManager;", "coinManager", "Lio/horizontalsystems/bankwallet/core/ICoinManager;", "blockchainSettingsStorage", "Lio/horizontalsystems/bankwallet/core/IBlockchainSettingsStorage;", "adapterManager", "Lio/horizontalsystems/bankwallet/core/IAdapterManager;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "(Lio/horizontalsystems/bankwallet/core/ICoinManager;Lio/horizontalsystems/bankwallet/core/IBlockchainSettingsStorage;Lio/horizontalsystems/bankwallet/core/IAdapterManager;Lio/horizontalsystems/bankwallet/core/IWalletManager;)V", "supportedCoinTypes", "", "Lio/horizontalsystems/bankwallet/core/managers/InitialSyncSettingsManager$SupportedCoinType;", "allSettings", "Lkotlin/Triple;", "Lio/horizontalsystems/bankwallet/entities/InitialSyncSetting;", "Lio/horizontalsystems/coinkit2/models/Coin;", "", "defaultSetting", "supportedCoinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "save", "", "setting", "coinType", "origin", "Lio/horizontalsystems/bankwallet/entities/AccountOrigin;", "SupportedCoinType", "app_debug"})
public final class InitialSyncSettingsManager implements io.horizontalsystems.bankwallet.core.IInitialSyncModeSettingsManager {
    private final java.util.List<io.horizontalsystems.bankwallet.core.managers.InitialSyncSettingsManager.SupportedCoinType> supportedCoinTypes = null;
    private final io.horizontalsystems.bankwallet.core.ICoinManager coinManager = null;
    private final io.horizontalsystems.bankwallet.core.IBlockchainSettingsStorage blockchainSettingsStorage = null;
    private final io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager = null;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<kotlin.Triple<io.horizontalsystems.bankwallet.entities.InitialSyncSetting, io.horizontalsystems.coinkit2.models.Coin, java.lang.Boolean>> allSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.InitialSyncSetting setting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.AccountOrigin origin) {
        return null;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.InitialSyncSetting setting) {
    }
    
    private final io.horizontalsystems.bankwallet.entities.InitialSyncSetting defaultSetting(io.horizontalsystems.coinkit2.models.CoinType supportedCoinType) {
        return null;
    }
    
    public InitialSyncSettingsManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ICoinManager coinManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IBlockchainSettingsStorage blockchainSettingsStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/InitialSyncSettingsManager$SupportedCoinType;", "", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "defaultSyncMode", "Lio/horizontalsystems/bankwallet/entities/SyncMode;", "changeable", "", "(Lio/horizontalsystems/coinkit2/models/CoinType;Lio/horizontalsystems/bankwallet/entities/SyncMode;Z)V", "getChangeable", "()Z", "getCoinType", "()Lio/horizontalsystems/coinkit2/models/CoinType;", "getDefaultSyncMode", "()Lio/horizontalsystems/bankwallet/entities/SyncMode;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
    static final class SupportedCoinType {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.coinkit2.models.CoinType coinType = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.entities.SyncMode defaultSyncMode = null;
        private final boolean changeable = false;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.CoinType getCoinType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.SyncMode getDefaultSyncMode() {
            return null;
        }
        
        public final boolean getChangeable() {
            return false;
        }
        
        public SupportedCoinType(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.SyncMode defaultSyncMode, boolean changeable) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.CoinType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.SyncMode component2() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.managers.InitialSyncSettingsManager.SupportedCoinType copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.SyncMode defaultSyncMode, boolean changeable) {
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