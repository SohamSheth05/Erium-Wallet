package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000fH&J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0003H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\rH&J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\rH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IAccountsStorage;", "", "activeAccountId", "", "getActiveAccountId", "()Ljava/lang/String;", "setActiveAccountId", "(Ljava/lang/String;)V", "isAccountsEmpty", "", "()Z", "allAccounts", "", "Lio/horizontalsystems/bankwallet/entities/Account;", "clear", "", "clearDeleted", "delete", "id", "getDeletedAccountIds", "getNonBackedUpCount", "Lio/reactivex/Flowable;", "", "save", "account", "update", "app_debug"})
public abstract interface IAccountsStorage {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getActiveAccountId();
    
    public abstract void setActiveAccountId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    public abstract boolean isAccountsEmpty();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bankwallet.entities.Account> allAccounts();
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account);
    
    public abstract void update(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.lang.Integer> getNonBackedUpCount();
    
    public abstract void clear();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getDeletedAccountIds();
    
    public abstract void clearDeleted();
}