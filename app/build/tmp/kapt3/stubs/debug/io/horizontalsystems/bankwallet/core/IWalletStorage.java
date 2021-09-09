package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IWalletStorage;", "", "delete", "", "wallets", "", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "save", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "accounts", "app_debug"})
public abstract interface IWalletStorage {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Account> accounts);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account);
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets);
}