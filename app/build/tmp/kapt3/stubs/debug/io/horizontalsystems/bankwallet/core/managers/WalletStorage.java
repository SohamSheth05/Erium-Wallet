package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\f\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/WalletStorage;", "Lio/horizontalsystems/bankwallet/core/IWalletStorage;", "coinManager", "Lio/horizontalsystems/bankwallet/core/ICoinManager;", "storage", "Lio/horizontalsystems/bankwallet/core/IEnabledWalletStorage;", "(Lio/horizontalsystems/bankwallet/core/ICoinManager;Lio/horizontalsystems/bankwallet/core/IEnabledWalletStorage;)V", "delete", "", "wallets", "", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "save", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "accounts", "app_debug"})
public final class WalletStorage implements io.horizontalsystems.bankwallet.core.IWalletStorage {
    private final io.horizontalsystems.bankwallet.core.ICoinManager coinManager = null;
    private final io.horizontalsystems.bankwallet.core.IEnabledWalletStorage storage = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Account> accounts) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account) {
        return null;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
    }
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
    }
    
    public WalletStorage(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ICoinManager coinManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IEnabledWalletStorage storage) {
        super();
    }
}