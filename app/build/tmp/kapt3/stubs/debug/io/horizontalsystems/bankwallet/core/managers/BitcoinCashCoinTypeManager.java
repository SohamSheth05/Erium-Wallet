package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/BitcoinCashCoinTypeManager;", "", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "adapterManager", "Lio/horizontalsystems/bankwallet/core/IAdapterManager;", "storage", "Lio/horizontalsystems/bankwallet/core/IBlockchainSettingsStorage;", "(Lio/horizontalsystems/bankwallet/core/IWalletManager;Lio/horizontalsystems/bankwallet/core/IAdapterManager;Lio/horizontalsystems/bankwallet/core/IBlockchainSettingsStorage;)V", "bitcoinCashCoinType", "Lio/horizontalsystems/bankwallet/entities/BitcoinCashCoinType;", "getBitcoinCashCoinType", "()Lio/horizontalsystems/bankwallet/entities/BitcoinCashCoinType;", "defaultCoinType", "hasActiveSetting", "", "getHasActiveSetting", "()Z", "reset", "", "save", "app_debug"})
public final class BitcoinCashCoinTypeManager {
    private final io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType defaultCoinType = io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType.type145;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager = null;
    private final io.horizontalsystems.bankwallet.core.IBlockchainSettingsStorage storage = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType getBitcoinCashCoinType() {
        return null;
    }
    
    public final boolean getHasActiveSetting() {
        return false;
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType bitcoinCashCoinType) {
    }
    
    public final void reset() {
    }
    
    public BitcoinCashCoinTypeManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IBlockchainSettingsStorage storage) {
        super();
    }
}