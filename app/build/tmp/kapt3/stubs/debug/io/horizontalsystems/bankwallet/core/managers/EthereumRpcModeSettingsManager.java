package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/EthereumRpcModeSettingsManager;", "Lio/horizontalsystems/bankwallet/core/IEthereumRpcModeSettingsManager;", "blockchainSettingsStorage", "Lio/horizontalsystems/bankwallet/core/IBlockchainSettingsStorage;", "adapterManager", "Lio/horizontalsystems/bankwallet/core/IAdapterManager;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "(Lio/horizontalsystems/bankwallet/core/IBlockchainSettingsStorage;Lio/horizontalsystems/bankwallet/core/IAdapterManager;Lio/horizontalsystems/bankwallet/core/IWalletManager;)V", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType$Ethereum;", "communicationModes", "", "Lio/horizontalsystems/bankwallet/entities/CommunicationMode;", "getCommunicationModes", "()Ljava/util/List;", "rpcMode", "Lio/horizontalsystems/bankwallet/entities/EthereumRpcMode;", "save", "", "setting", "app_debug"})
public final class EthereumRpcModeSettingsManager implements io.horizontalsystems.bankwallet.core.IEthereumRpcModeSettingsManager {
    private final io.horizontalsystems.coinkit2.models.CoinType.Ethereum coinType = null;
    private final io.horizontalsystems.bankwallet.core.IBlockchainSettingsStorage blockchainSettingsStorage = null;
    private final io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager = null;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.entities.CommunicationMode> getCommunicationModes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.EthereumRpcMode rpcMode() {
        return null;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.EthereumRpcMode setting) {
    }
    
    public EthereumRpcModeSettingsManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IBlockchainSettingsStorage blockchainSettingsStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager) {
        super();
    }
}