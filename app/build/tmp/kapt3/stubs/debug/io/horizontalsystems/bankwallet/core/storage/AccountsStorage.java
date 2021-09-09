package io.horizontalsystems.bankwallet.core.storage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0001&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0017H\u0002J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0017H\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0017H\u0016R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014\u00a8\u0006\'"}, d2 = {"Lio/horizontalsystems/bankwallet/core/storage/AccountsStorage;", "Lio/horizontalsystems/bankwallet/core/IAccountsStorage;", "appDatabase", "Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;", "(Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;)V", "value", "", "activeAccountId", "getActiveAccountId", "()Ljava/lang/String;", "setActiveAccountId", "(Ljava/lang/String;)V", "dao", "Lio/horizontalsystems/bankwallet/core/storage/AccountsDao;", "getDao", "()Lio/horizontalsystems/bankwallet/core/storage/AccountsDao;", "dao$delegate", "Lkotlin/Lazy;", "isAccountsEmpty", "", "()Z", "allAccounts", "", "Lio/horizontalsystems/bankwallet/entities/Account;", "clear", "", "clearDeleted", "delete", "id", "getAccountRecord", "Lio/horizontalsystems/bankwallet/core/storage/AccountRecord;", "account", "getDeletedAccountIds", "getNonBackedUpCount", "Lio/reactivex/Flowable;", "", "save", "update", "Companion", "app_debug"})
public final class AccountsStorage implements io.horizontalsystems.bankwallet.core.IAccountsStorage {
    private final kotlin.Lazy dao$delegate = null;
    private static final java.lang.String MNEMONIC = "mnemonic";
    private static final java.lang.String PRIVATE_KEY = "private_key";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.storage.AccountsStorage.Companion Companion = null;
    
    private final io.horizontalsystems.bankwallet.core.storage.AccountsDao getDao() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getActiveAccountId() {
        return null;
    }
    
    @java.lang.Override()
    public void setActiveAccountId(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public boolean isAccountsEmpty() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.entities.Account> allAccounts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getDeletedAccountIds() {
        return null;
    }
    
    @java.lang.Override()
    public void clearDeleted() {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.lang.Integer> getNonBackedUpCount() {
        return null;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    private final io.horizontalsystems.bankwallet.core.storage.AccountRecord getAccountRecord(io.horizontalsystems.bankwallet.entities.Account account) {
        return null;
    }
    
    public AccountsStorage(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.storage.AppDatabase appDatabase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/core/storage/AccountsStorage$Companion;", "", "()V", "MNEMONIC", "", "PRIVATE_KEY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}