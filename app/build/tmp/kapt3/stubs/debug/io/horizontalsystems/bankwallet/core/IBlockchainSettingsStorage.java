package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IBlockchainSettingsStorage;", "", "bitcoinCashCoinType", "Lio/horizontalsystems/bankwallet/entities/BitcoinCashCoinType;", "getBitcoinCashCoinType", "()Lio/horizontalsystems/bankwallet/entities/BitcoinCashCoinType;", "setBitcoinCashCoinType", "(Lio/horizontalsystems/bankwallet/entities/BitcoinCashCoinType;)V", "deleteDerivationSettings", "", "derivationSetting", "Lio/horizontalsystems/bankwallet/entities/DerivationSetting;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "ethereumRpcModeSetting", "Lio/horizontalsystems/bankwallet/entities/EthereumRpcMode;", "initialSyncSetting", "Lio/horizontalsystems/bankwallet/entities/InitialSyncSetting;", "saveDerivationSetting", "saveEthereumRpcModeSetting", "saveInitialSyncSetting", "app_debug"})
public abstract interface IBlockchainSettingsStorage {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType getBitcoinCashCoinType();
    
    public abstract void setBitcoinCashCoinType(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.entities.DerivationSetting derivationSetting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType);
    
    public abstract void saveDerivationSetting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.DerivationSetting derivationSetting);
    
    public abstract void deleteDerivationSettings();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.entities.InitialSyncSetting initialSyncSetting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType);
    
    public abstract void saveInitialSyncSetting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.InitialSyncSetting initialSyncSetting);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.entities.EthereumRpcMode ethereumRpcModeSetting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType);
    
    public abstract void saveEthereumRpcModeSetting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.EthereumRpcMode ethereumRpcModeSetting);
}