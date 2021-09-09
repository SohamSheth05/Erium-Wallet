package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nH\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/BinanceKitManager;", "Lio/horizontalsystems/bankwallet/core/IBinanceKitManager;", "testMode", "", "(Z)V", "binanceKit", "Lio/horizontalsystems/binancechainkit/BinanceChainKit;", "getBinanceKit", "()Lio/horizontalsystems/binancechainkit/BinanceChainKit;", "currentAccount", "Lio/horizontalsystems/bankwallet/entities/Account;", "kit", "statusInfo", "", "", "", "getStatusInfo", "()Ljava/util/Map;", "useCount", "", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "createKitInstance", "accountType", "Lio/horizontalsystems/bankwallet/entities/AccountType$Mnemonic;", "account", "unlink", "", "app_debug"})
public final class BinanceKitManager implements io.horizontalsystems.bankwallet.core.IBinanceKitManager {
    private io.horizontalsystems.binancechainkit.BinanceChainKit kit;
    private int useCount = 0;
    private io.horizontalsystems.bankwallet.entities.Account currentAccount;
    private final boolean testMode = false;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.binancechainkit.BinanceChainKit getBinanceKit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.Object> getStatusInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.binancechainkit.BinanceChainKit binanceKit(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
        return null;
    }
    
    private final io.horizontalsystems.binancechainkit.BinanceChainKit createKitInstance(io.horizontalsystems.bankwallet.entities.AccountType.Mnemonic accountType, io.horizontalsystems.bankwallet.entities.Account account) {
        return null;
    }
    
    @java.lang.Override()
    public void unlink() {
    }
    
    public BinanceKitManager(boolean testMode) {
        super();
    }
}