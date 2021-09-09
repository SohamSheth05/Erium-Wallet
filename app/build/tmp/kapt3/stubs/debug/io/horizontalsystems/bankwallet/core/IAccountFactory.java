package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IAccountFactory;", "", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "type", "Lio/horizontalsystems/bankwallet/entities/AccountType;", "origin", "Lio/horizontalsystems/bankwallet/entities/AccountOrigin;", "backedUp", "", "app_debug"})
public abstract interface IAccountFactory {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bankwallet.entities.Account account(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.AccountType type, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.AccountOrigin origin, boolean backedUp);
}