package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001.B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010#\u001a\u0004\u0018\u00010\t2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u000eH\u0016J\b\u0010\'\u001a\u00020\u000eH\u0016J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010)\u001a\u00020\u000eH\u0016J\u0010\u0010*\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\tH\u0016J\u0012\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010-\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u000e0\u000e0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R(\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0013*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001b0\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R(\u0010\u001d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0013*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001b0\u001b0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020!8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/AccountManager;", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "storage", "Lio/horizontalsystems/bankwallet/core/IAccountsStorage;", "accountCleaner", "Lio/horizontalsystems/bankwallet/core/IAccountCleaner;", "(Lio/horizontalsystems/bankwallet/core/IAccountsStorage;Lio/horizontalsystems/bankwallet/core/IAccountCleaner;)V", "accounts", "", "Lio/horizontalsystems/bankwallet/entities/Account;", "getAccounts", "()Ljava/util/List;", "accountsDeletedFlowable", "Lio/reactivex/Flowable;", "", "getAccountsDeletedFlowable", "()Lio/reactivex/Flowable;", "accountsDeletedSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "accountsFlowable", "getAccountsFlowable", "accountsSubject", "activeAccount", "getActiveAccount", "()Lio/horizontalsystems/bankwallet/entities/Account;", "activeAccountObservable", "Ljava/util/Optional;", "getActiveAccountObservable", "activeAccountSubject", "cache", "Lio/horizontalsystems/bankwallet/core/managers/AccountManager$AccountsCache;", "isAccountsEmpty", "", "()Z", "account", "id", "", "clear", "clearAccounts", "delete", "loadAccounts", "save", "setActiveAccountId", "activeAccountId", "update", "AccountsCache", "app_debug"})
public final class AccountManager implements io.horizontalsystems.bankwallet.core.IAccountManager {
    private final io.horizontalsystems.bankwallet.core.managers.AccountManager.AccountsCache cache = null;
    private final io.reactivex.subjects.PublishSubject<java.util.List<io.horizontalsystems.bankwallet.entities.Account>> accountsSubject = null;
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> accountsDeletedSubject = null;
    private final io.reactivex.subjects.PublishSubject<java.util.Optional<io.horizontalsystems.bankwallet.entities.Account>> activeAccountSubject = null;
    private final io.horizontalsystems.bankwallet.core.IAccountsStorage storage = null;
    private final io.horizontalsystems.bankwallet.core.IAccountCleaner accountCleaner = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.Account getActiveAccount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.Optional<io.horizontalsystems.bankwallet.entities.Account>> getActiveAccountObservable() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isAccountsEmpty() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.entities.Account> getAccounts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<io.horizontalsystems.bankwallet.entities.Account>> getAccountsFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getAccountsDeletedFlowable() {
        return null;
    }
    
    @java.lang.Override()
    public void setActiveAccountId(@org.jetbrains.annotations.Nullable()
    java.lang.String activeAccountId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.Account account(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @java.lang.Override()
    public void loadAccounts() {
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account) {
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account) {
    }
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    @java.lang.Override()
    public void clearAccounts() {
    }
    
    public AccountManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountsStorage storage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountCleaner accountCleaner) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0005J\u0014\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014J\u0010\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0005R*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/AccountManager$AccountsCache;", "", "()V", "<set-?>", "", "Lio/horizontalsystems/bankwallet/entities/Account;", "accountsSet", "getAccountsSet", "()Ljava/util/Set;", "activeAccount", "getActiveAccount", "()Lio/horizontalsystems/bankwallet/entities/Account;", "delete", "", "id", "", "insert", "account", "set", "accounts", "", "setActiveAccountId", "activeAccountId", "update", "app_debug"})
    static final class AccountsCache {
        @org.jetbrains.annotations.NotNull()
        private java.util.Set<io.horizontalsystems.bankwallet.entities.Account> accountsSet;
        @org.jetbrains.annotations.Nullable()
        private io.horizontalsystems.bankwallet.entities.Account activeAccount;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<io.horizontalsystems.bankwallet.entities.Account> getAccountsSet() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.entities.Account getActiveAccount() {
            return null;
        }
        
        public final void insert(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Account account) {
        }
        
        public final void update(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Account account) {
        }
        
        public final void set(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.entities.Account> accounts) {
        }
        
        public final void delete(@org.jetbrains.annotations.NotNull()
        java.lang.String id) {
        }
        
        public final void setActiveAccountId(@org.jetbrains.annotations.Nullable()
        java.lang.String activeAccountId) {
        }
        
        public AccountsCache() {
            super();
        }
    }
}