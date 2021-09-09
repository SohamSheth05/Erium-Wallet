package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/AccountCleaner;", "Lio/horizontalsystems/bankwallet/core/IAccountCleaner;", "testMode", "", "(Z)V", "clearAccount", "", "accountId", "", "clearAccounts", "accountIds", "", "app_debug"})
public final class AccountCleaner implements io.horizontalsystems.bankwallet.core.IAccountCleaner {
    private final boolean testMode = false;
    
    @java.lang.Override()
    public void clearAccounts(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> accountIds) {
    }
    
    private final void clearAccount(java.lang.String accountId) {
    }
    
    public AccountCleaner(boolean testMode) {
        super();
    }
}