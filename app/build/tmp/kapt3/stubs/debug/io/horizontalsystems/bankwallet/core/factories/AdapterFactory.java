package io.horizontalsystems.bankwallet.core.factories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lio/horizontalsystems/bankwallet/core/factories/AdapterFactory;", "", "context", "Landroid/content/Context;", "testMode", "", "ethereumKitManager", "Lio/horizontalsystems/bankwallet/core/managers/EthereumKitManager;", "binanceSmartChainKitManager", "Lio/horizontalsystems/bankwallet/core/managers/BinanceSmartChainKitManager;", "binanceKitManager", "Lio/horizontalsystems/bankwallet/core/managers/BinanceKitManager;", "backgroundManager", "Lio/horizontalsystems/core/BackgroundManager;", "restoreSettingsManager", "Lio/horizontalsystems/bankwallet/core/managers/RestoreSettingsManager;", "(Landroid/content/Context;ZLio/horizontalsystems/bankwallet/core/managers/EthereumKitManager;Lio/horizontalsystems/bankwallet/core/managers/BinanceSmartChainKitManager;Lio/horizontalsystems/bankwallet/core/managers/BinanceKitManager;Lio/horizontalsystems/core/BackgroundManager;Lio/horizontalsystems/bankwallet/core/managers/RestoreSettingsManager;)V", "ethereumRpcModeSettingsManager", "Lio/horizontalsystems/bankwallet/core/IEthereumRpcModeSettingsManager;", "getEthereumRpcModeSettingsManager", "()Lio/horizontalsystems/bankwallet/core/IEthereumRpcModeSettingsManager;", "setEthereumRpcModeSettingsManager", "(Lio/horizontalsystems/bankwallet/core/IEthereumRpcModeSettingsManager;)V", "initialSyncModeSettingsManager", "Lio/horizontalsystems/bankwallet/core/IInitialSyncModeSettingsManager;", "getInitialSyncModeSettingsManager", "()Lio/horizontalsystems/bankwallet/core/IInitialSyncModeSettingsManager;", "setInitialSyncModeSettingsManager", "(Lio/horizontalsystems/bankwallet/core/IInitialSyncModeSettingsManager;)V", "adapter", "Lio/horizontalsystems/bankwallet/core/IAdapter;", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "unlinkAdapter", "", "app_debug"})
public final class AdapterFactory {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.core.IInitialSyncModeSettingsManager initialSyncModeSettingsManager;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.core.IEthereumRpcModeSettingsManager ethereumRpcModeSettingsManager;
    private final android.content.Context context = null;
    private final boolean testMode = false;
    private final io.horizontalsystems.bankwallet.core.managers.EthereumKitManager ethereumKitManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.BinanceSmartChainKitManager binanceSmartChainKitManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.BinanceKitManager binanceKitManager = null;
    private final io.horizontalsystems.core.BackgroundManager backgroundManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.RestoreSettingsManager restoreSettingsManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.core.IInitialSyncModeSettingsManager getInitialSyncModeSettingsManager() {
        return null;
    }
    
    public final void setInitialSyncModeSettingsManager(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.core.IInitialSyncModeSettingsManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.core.IEthereumRpcModeSettingsManager getEthereumRpcModeSettingsManager() {
        return null;
    }
    
    public final void setEthereumRpcModeSettingsManager(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.core.IEthereumRpcModeSettingsManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.core.IAdapter adapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
        return null;
    }
    
    public final void unlinkAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
    }
    
    public AdapterFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean testMode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.EthereumKitManager ethereumKitManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.BinanceSmartChainKitManager binanceSmartChainKitManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.BinanceKitManager binanceKitManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.BackgroundManager backgroundManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.RestoreSettingsManager restoreSettingsManager) {
        super();
    }
}