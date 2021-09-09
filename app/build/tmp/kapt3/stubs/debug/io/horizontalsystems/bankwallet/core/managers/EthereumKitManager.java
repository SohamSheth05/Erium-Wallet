package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\fH\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\fJ\u000e\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\fJ\b\u0010$\u001a\u00020\"H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/EthereumKitManager;", "Lio/horizontalsystems/core/BackgroundManager$Listener;", "infuraProjectId", "", "infuraSecret", "etherscanApiKey", "testMode", "", "backgroundManager", "Lio/horizontalsystems/core/BackgroundManager;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/horizontalsystems/core/BackgroundManager;)V", "currentAccount", "Lio/horizontalsystems/bankwallet/entities/Account;", "<set-?>", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "evmKit", "getEvmKit", "()Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "networkType", "Lio/horizontalsystems/ethereumkit/core/EthereumKit$NetworkType;", "getNetworkType", "()Lio/horizontalsystems/ethereumkit/core/EthereumKit$NetworkType;", "statusInfo", "", "", "getStatusInfo", "()Ljava/util/Map;", "useCount", "", "createKitInstance", "accountType", "Lio/horizontalsystems/bankwallet/entities/AccountType$Mnemonic;", "account", "didEnterBackground", "", "unlink", "willEnterForeground", "app_debug"})
public final class EthereumKitManager implements io.horizontalsystems.core.BackgroundManager.Listener {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.ethereumkit.core.EthereumKit evmKit;
    private int useCount = 0;
    private io.horizontalsystems.bankwallet.entities.Account currentAccount;
    private final java.lang.String infuraProjectId = null;
    private final java.lang.String infuraSecret = null;
    private final java.lang.String etherscanApiKey = null;
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
    public final io.horizontalsystems.ethereumkit.core.EthereumKit.NetworkType getNetworkType() {
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
    
    public EthereumKitManager(@org.jetbrains.annotations.NotNull()
    java.lang.String infuraProjectId, @org.jetbrains.annotations.NotNull()
    java.lang.String infuraSecret, @org.jetbrains.annotations.NotNull()
    java.lang.String etherscanApiKey, boolean testMode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.BackgroundManager backgroundManager) {
        super();
    }
    
    public void willEnterForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
}