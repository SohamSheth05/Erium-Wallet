package io.horizontalsystems.bankwallet.modules.manageaccounts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0015*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/manageaccounts/ManageAccountsService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "(Lio/horizontalsystems/bankwallet/core/IAccountManager;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "value", "", "Lio/horizontalsystems/bankwallet/modules/manageaccounts/ManageAccountsService$Item;", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "itemsObservable", "Lio/reactivex/Flowable;", "getItemsObservable", "()Lio/reactivex/Flowable;", "itemsSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "clear", "", "setActiveAccountId", "activeAccountId", "", "syncItems", "Item", "app_debug"})
public final class ManageAccountsService implements io.horizontalsystems.bankwallet.core.Clearable {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final io.reactivex.subjects.PublishSubject<java.util.List<io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsService.Item>> itemsSubject = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsService.Item> items;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Flowable<java.util.List<io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsService.Item>> itemsObservable = null;
    private final io.horizontalsystems.bankwallet.core.IAccountManager accountManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsService.Item> getItems() {
        return null;
    }
    
    private final void setItems(java.util.List<io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsService.Item> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsService.Item>> getItemsObservable() {
        return null;
    }
    
    private final void syncItems() {
    }
    
    public final void setActiveAccountId(@org.jetbrains.annotations.NotNull()
    java.lang.String activeAccountId) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public ManageAccountsService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/manageaccounts/ManageAccountsService$Item;", "", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "isActive", "", "(Lio/horizontalsystems/bankwallet/entities/Account;Z)V", "getAccount", "()Lio/horizontalsystems/bankwallet/entities/Account;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Item {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.entities.Account account = null;
        private final boolean isActive = false;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.Account getAccount() {
            return null;
        }
        
        public final boolean isActive() {
            return false;
        }
        
        public Item(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Account account, boolean isActive) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.Account component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsService.Item copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Account account, boolean isActive) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}