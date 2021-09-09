package io.horizontalsystems.bankwallet.modules.walletconnect;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectManager;", "", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "ethereumKitManager", "Lio/horizontalsystems/bankwallet/core/managers/EthereumKitManager;", "binanceSmartChainKitManager", "Lio/horizontalsystems/bankwallet/core/managers/BinanceSmartChainKitManager;", "(Lio/horizontalsystems/bankwallet/core/IAccountManager;Lio/horizontalsystems/bankwallet/core/managers/EthereumKitManager;Lio/horizontalsystems/bankwallet/core/managers/BinanceSmartChainKitManager;)V", "activeAccount", "Lio/horizontalsystems/bankwallet/entities/Account;", "getActiveAccount", "()Lio/horizontalsystems/bankwallet/entities/Account;", "evmKit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "chainId", "", "account", "app_debug"})
public final class WalletConnectManager {
    private final io.horizontalsystems.bankwallet.core.IAccountManager accountManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.EthereumKitManager ethereumKitManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.BinanceSmartChainKitManager binanceSmartChainKitManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.entities.Account getActiveAccount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.ethereumkit.core.EthereumKit evmKit(int chainId, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account) {
        return null;
    }
    
    public WalletConnectManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.EthereumKitManager ethereumKitManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.BinanceSmartChainKitManager binanceSmartChainKitManager) {
        super();
    }
}