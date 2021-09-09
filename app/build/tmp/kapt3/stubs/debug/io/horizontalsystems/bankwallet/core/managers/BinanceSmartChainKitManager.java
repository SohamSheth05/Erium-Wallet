package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\nJ\b\u0010\u001e\u001a\u00020\u001cH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/BinanceSmartChainKitManager;", "Lio/horizontalsystems/core/BackgroundManager$Listener;", "bscscanApiKey", "", "testMode", "", "backgroundManager", "Lio/horizontalsystems/core/BackgroundManager;", "(Ljava/lang/String;ZLio/horizontalsystems/core/BackgroundManager;)V", "currentAccount", "Lio/horizontalsystems/bankwallet/entities/Account;", "<set-?>", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "evmKit", "getEvmKit", "()Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "statusInfo", "", "", "getStatusInfo", "()Ljava/util/Map;", "useCount", "", "createKitInstance", "accountType", "Lio/horizontalsystems/bankwallet/entities/AccountType$Mnemonic;", "account", "didEnterBackground", "", "unlink", "willEnterForeground", "app_debug"})
public final class BinanceSmartChainKitManager implements io.horizontalsystems.core.BackgroundManager.Listener {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.ethereumkit.core.EthereumKit evmKit;
    private int useCount = 0;
    private io.horizontalsystems.bankwallet.entities.Account currentAccount;
    private final java.lang.String bscscanApiKey = null;
    private final boolean testMode = false;
    private final io.horizontalsystems.core.BackgroundManager backgroundManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.ethereumkit.core.EthereumKit getEvmKit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.Object> getStatusInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final synchronized io.horizontalsystems.ethereumkit.core.EthereumKit evmKit(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account) {
        return null;
    }
    
    private final io.horizontalsystems.ethereumkit.core.EthereumKit createKitInstance(io.horizontalsystems.bankwallet.entities.AccountType.Mnemonic accountType, io.horizontalsystems.bankwallet.entities.Account account) {
        return null;
    }
    
    public final synchronized void unlink(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account) {
    }
    
    @java.lang.Override()
    public void willEnterForeground() {
    }
    
    @java.lang.Override()
    public void didEnterBackground() {
    }
    
    public BinanceSmartChainKitManager(@org.jetbrains.annotations.NotNull()
    java.lang.String bscscanApiKey, boolean testMode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.BackgroundManager backgroundManager) {
        super();
    }
    
    public void willEnterForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
}