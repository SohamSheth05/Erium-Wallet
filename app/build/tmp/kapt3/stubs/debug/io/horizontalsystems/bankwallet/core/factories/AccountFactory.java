package io.horizontalsystems.bankwallet.core.factories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/core/factories/AccountFactory;", "Lio/horizontalsystems/bankwallet/core/IAccountFactory;", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "(Lio/horizontalsystems/bankwallet/core/IAccountManager;)V", "getAccountManager", "()Lio/horizontalsystems/bankwallet/core/IAccountManager;", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "type", "Lio/horizontalsystems/bankwallet/entities/AccountType;", "origin", "Lio/horizontalsystems/bankwallet/entities/AccountOrigin;", "backedUp", "", "getNextWalletName", "", "app_debug"})
public final class AccountFactory implements io.horizontalsystems.bankwallet.core.IAccountFactory {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.core.IAccountManager accountManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.Account account(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.AccountType type, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.AccountOrigin origin, boolean backedUp) {
        return null;
    }
    
    private final java.lang.String getNextWalletName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.core.IAccountManager getAccountManager() {
        return null;
    }
    
    public AccountFactory(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager) {
        super();
    }
}