package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\tH&J\b\u0010\u001b\u001a\u00020\tH&J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001d\u001a\u00020\tH&J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0004H&J\u0012\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0019H&J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00120\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0012\u0010\u0014\u001a\u00020\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bankwallet/core/IAccountManager;", "", "accounts", "", "Lio/horizontalsystems/bankwallet/entities/Account;", "getAccounts", "()Ljava/util/List;", "accountsDeletedFlowable", "Lio/reactivex/Flowable;", "", "getAccountsDeletedFlowable", "()Lio/reactivex/Flowable;", "accountsFlowable", "getAccountsFlowable", "activeAccount", "getActiveAccount", "()Lio/horizontalsystems/bankwallet/entities/Account;", "activeAccountObservable", "Ljava/util/Optional;", "getActiveAccountObservable", "isAccountsEmpty", "", "()Z", "account", "id", "", "clear", "clearAccounts", "delete", "loadAccounts", "save", "setActiveAccountId", "activeAccountId", "update", "app_debug"})
public abstract interface IAccountManager {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.entities.Account getActiveAccount();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.Optional<io.horizontalsystems.bankwallet.entities.Account>> getActiveAccountObservable();
    
    public abstract boolean isAccountsEmpty();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bankwallet.entities.Account> getAccounts();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.List<io.horizontalsystems.bankwallet.entities.Account>> getAccountsFlowable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<kotlin.Unit> getAccountsDeletedFlowable();
    
    public abstract void setActiveAccountId(@org.jetbrains.annotations.Nullable()
    java.lang.String activeAccountId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.entities.Account account(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    public abstract void loadAccounts();
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account);
    
    public abstract void update(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    public abstract void clear();
    
    public abstract void clearAccounts();
}