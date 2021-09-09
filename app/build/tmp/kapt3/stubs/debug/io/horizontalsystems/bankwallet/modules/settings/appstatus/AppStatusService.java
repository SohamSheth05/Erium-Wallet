package io.horizontalsystems.bankwallet.modules.settings.appstatus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J,\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0001`\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u001dH\u0002J\u0014\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u001dH\u0002J\u0014\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u001dH\u0002J\u0014\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u001dH\u0002J\u0014\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u001dH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R-\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0001`\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/appstatus/AppStatusService;", "", "systemInfoManager", "Lio/horizontalsystems/core/ISystemInfoManager;", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "adapterManager", "Lio/horizontalsystems/bankwallet/core/IAdapterManager;", "ethereumKitManager", "Lio/horizontalsystems/bankwallet/core/managers/EthereumKitManager;", "binanceSmartChainKitManager", "Lio/horizontalsystems/bankwallet/core/managers/BinanceSmartChainKitManager;", "binanceKitManager", "Lio/horizontalsystems/bankwallet/core/IBinanceKitManager;", "(Lio/horizontalsystems/core/ISystemInfoManager;Lio/horizontalsystems/bankwallet/core/ILocalStorage;Lio/horizontalsystems/bankwallet/core/IAccountManager;Lio/horizontalsystems/bankwallet/core/IWalletManager;Lio/horizontalsystems/bankwallet/core/IAdapterManager;Lio/horizontalsystems/bankwallet/core/managers/EthereumKitManager;Lio/horizontalsystems/bankwallet/core/managers/BinanceSmartChainKitManager;Lio/horizontalsystems/bankwallet/core/IBinanceKitManager;)V", "status", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "getStatus", "()Ljava/util/LinkedHashMap;", "getAccountDetails", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "getAppInfo", "", "getBitcoinForkStatuses", "getBlockchainStatus", "getVersionHistory", "getWalletsStatus", "app_debug"})
public final class AppStatusService {
    private final io.horizontalsystems.core.ISystemInfoManager systemInfoManager = null;
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorage = null;
    private final io.horizontalsystems.bankwallet.core.IAccountManager accountManager = null;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.EthereumKitManager ethereumKitManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.BinanceSmartChainKitManager binanceSmartChainKitManager = null;
    private final io.horizontalsystems.bankwallet.core.IBinanceKitManager binanceKitManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, java.lang.Object> getStatus() {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.Object> getAppInfo() {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.Object> getVersionHistory() {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.Object> getWalletsStatus() {
        return null;
    }
    
    private final java.util.LinkedHashMap<java.lang.String, java.lang.Object> getAccountDetails(io.horizontalsystems.bankwallet.entities.Account account) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.Object> getBlockchainStatus() {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.Object> getBitcoinForkStatuses() {
        return null;
    }
    
    public AppStatusService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ISystemInfoManager systemInfoManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.EthereumKitManager ethereumKitManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.BinanceSmartChainKitManager binanceSmartChainKitManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IBinanceKitManager binanceKitManager) {
        super();
    }
}