package io.horizontalsystems.bankwallet.modules.manageaccounts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u000eH\u0014J\u000e\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0016J\u0016\u0010#\u001a\u00020\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006%"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/manageaccounts/ManageAccountsViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/manageaccounts/ManageAccountsService;", "mode", "Lio/horizontalsystems/bankwallet/modules/manageaccounts/ManageAccountsModule$Mode;", "clearables", "", "Lio/horizontalsystems/bankwallet/core/Clearable;", "(Lio/horizontalsystems/bankwallet/modules/manageaccounts/ManageAccountsService;Lio/horizontalsystems/bankwallet/modules/manageaccounts/ManageAccountsModule$Mode;Ljava/util/List;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "finishLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getFinishLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "isCloseButtonVisible", "", "()Z", "viewItemsLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/bankwallet/modules/manageaccounts/ManageAccountsModule$AccountViewItem;", "getViewItemsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getDescription", "", "accountType", "Lio/horizontalsystems/bankwallet/entities/AccountType;", "getViewItem", "item", "Lio/horizontalsystems/bankwallet/modules/manageaccounts/ManageAccountsService$Item;", "onCleared", "onSelect", "accountViewItem", "sync", "items", "app_debug"})
public final class ManageAccountsViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsModule.AccountViewItem>> viewItemsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> finishLiveEvent = null;
    private final boolean isCloseButtonVisible = false;
    private final io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsService service = null;
    private final io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsModule.Mode mode = null;
    private final java.util.List<io.horizontalsystems.bankwallet.core.Clearable> clearables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsModule.AccountViewItem>> getViewItemsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getFinishLiveEvent() {
        return null;
    }
    
    public final boolean isCloseButtonVisible() {
        return false;
    }
    
    private final void sync(java.util.List<io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsService.Item> items) {
    }
    
    private final io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsModule.AccountViewItem getViewItem(io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsService.Item item) {
        return null;
    }
    
    private final java.lang.String getDescription(io.horizontalsystems.bankwallet.entities.AccountType accountType) {
        return null;
    }
    
    public final void onSelect(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsModule.AccountViewItem accountViewItem) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public ManageAccountsViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsService service, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsModule.Mode mode, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.core.Clearable> clearables) {
        super();
    }
}