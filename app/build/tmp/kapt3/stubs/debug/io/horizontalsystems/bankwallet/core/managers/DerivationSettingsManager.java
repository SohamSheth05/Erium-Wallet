package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f0\u000eH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/DerivationSettingsManager;", "Lio/horizontalsystems/bankwallet/core/IDerivationSettingsManager;", "blockchainSettingsStorage", "Lio/horizontalsystems/bankwallet/core/IBlockchainSettingsStorage;", "adapterManager", "Lio/horizontalsystems/bankwallet/core/IAdapterManager;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "(Lio/horizontalsystems/bankwallet/core/IBlockchainSettingsStorage;Lio/horizontalsystems/bankwallet/core/IAdapterManager;Lio/horizontalsystems/bankwallet/core/IWalletManager;)V", "supportedCoinTypes", "", "Lio/horizontalsystems/coinkit2/models/CoinType;", "Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;", "allActiveSettings", "", "Lkotlin/Pair;", "Lio/horizontalsystems/bankwallet/entities/DerivationSetting;", "defaultSetting", "coinType", "resetStandardSettings", "", "save", "setting", "app_debug"})
public final class DerivationSettingsManager implements io.horizontalsystems.bankwallet.core.IDerivationSettingsManager {
    private final java.util.Map<io.horizontalsystems.coinkit2.models.CoinType, io.horizontalsystems.bankwallet.entities.AccountType.Derivation> supportedCoinTypes = null;
    private final io.horizontalsystems.bankwallet.core.IBlockchainSettingsStorage blockchainSettingsStorage = null;
    private final io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager = null;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<kotlin.Pair<io.horizontalsystems.bankwallet.entities.DerivationSetting, io.horizontalsystems.coinkit2.models.CoinType>> allActiveSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.DerivationSetting defaultSetting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.DerivationSetting setting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return null;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.DerivationSetting setting) {
    }
    
    @java.lang.Override()
    public void resetStandardSettings() {
    }
    
    public DerivationSettingsManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IBlockchainSettingsStorage blockchainSettingsStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager) {
        super();
    }
}