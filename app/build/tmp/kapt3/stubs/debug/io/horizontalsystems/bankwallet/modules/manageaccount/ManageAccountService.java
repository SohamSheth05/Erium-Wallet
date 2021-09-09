package io.horizontalsystems.bankwallet.modules.manageaccount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0001;B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u00100\u001a\u00020\u0014H\u0016J\u0006\u00101\u001a\u00020\u0014J\u0016\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020\u001fJ\u0016\u00105\u001a\u00020\u00142\f\u00106\u001a\b\u0012\u0004\u0012\u00020\f0\u001dH\u0002J\u0006\u00107\u001a\u00020\u0014J\u000e\u00108\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u0003J\b\u0010:\u001a\u00020\u0014H\u0002R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00140\u00140\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R)\u0010\u001c\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u001e0\u001d8F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\f0\f0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010(\u001a\u00020\'2\u0006\u0010\u000b\u001a\u00020\'@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\'0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0016R\u001c\u0010/\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\'0\'0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/manageaccount/ManageAccountService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "accountId", "", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "restoreSettingsManager", "Lio/horizontalsystems/bankwallet/core/managers/RestoreSettingsManager;", "(Ljava/lang/String;Lio/horizontalsystems/bankwallet/core/IAccountManager;Lio/horizontalsystems/bankwallet/core/IWalletManager;Lio/horizontalsystems/bankwallet/core/managers/RestoreSettingsManager;)V", "value", "Lio/horizontalsystems/bankwallet/entities/Account;", "account", "getAccount", "()Lio/horizontalsystems/bankwallet/entities/Account;", "setAccount", "(Lio/horizontalsystems/bankwallet/entities/Account;)V", "accountDeletedObservable", "Lio/reactivex/Flowable;", "", "getAccountDeletedObservable", "()Lio/reactivex/Flowable;", "accountDeletedSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "accountObservable", "getAccountObservable", "accountSettingsInfo", "", "Lkotlin/Triple;", "Lio/horizontalsystems/coinkit2/models/Coin;", "Lio/horizontalsystems/bankwallet/core/managers/RestoreSettingType;", "getAccountSettingsInfo", "()Ljava/util/List;", "accountSubject", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "newName", "Lio/horizontalsystems/bankwallet/modules/manageaccount/ManageAccountService$State;", "state", "getState", "()Lio/horizontalsystems/bankwallet/modules/manageaccount/ManageAccountService$State;", "setState", "(Lio/horizontalsystems/bankwallet/modules/manageaccount/ManageAccountService$State;)V", "stateObservable", "getStateObservable", "stateSubject", "clear", "deleteAccount", "getSettingsTitle", "settingType", "coin", "handleUpdatedAccounts", "accounts", "saveAccount", "setName", "name", "syncState", "State", "app_debug"})
public final class ManageAccountService implements io.horizontalsystems.bankwallet.core.Clearable {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.entities.Account> accountSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Flowable<io.horizontalsystems.bankwallet.entities.Account> accountObservable = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.entities.Account account;
    private java.lang.String newName;
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.manageaccount.ManageAccountService.State> stateSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Flowable<io.horizontalsystems.bankwallet.modules.manageaccount.ManageAccountService.State> stateObservable = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.manageaccount.ManageAccountService.State state = io.horizontalsystems.bankwallet.modules.manageaccount.ManageAccountService.State.CannotSave;
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> accountDeletedSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Flowable<kotlin.Unit> accountDeletedObservable = null;
    private final io.horizontalsystems.bankwallet.core.IAccountManager accountManager = null;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.RestoreSettingsManager restoreSettingsManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<io.horizontalsystems.bankwallet.entities.Account> getAccountObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.Account getAccount() {
        return null;
    }
    
    private final void setAccount(io.horizontalsystems.bankwallet.entities.Account value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<io.horizontalsystems.bankwallet.modules.manageaccount.ManageAccountService.State> getStateObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.manageaccount.ManageAccountService.State getState() {
        return null;
    }
    
    private final void setState(io.horizontalsystems.bankwallet.modules.manageaccount.ManageAccountService.State value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<kotlin.Unit> getAccountDeletedObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Triple<io.horizontalsystems.coinkit2.models.Coin, io.horizontalsystems.bankwallet.core.managers.RestoreSettingType, java.lang.String>> getAccountSettingsInfo() {
        return null;
    }
    
    private final void syncState() {
    }
    
    private final void handleUpdatedAccounts(java.util.List<io.horizontalsystems.bankwallet.entities.Account> accounts) {
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void saveAccount() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSettingsTitle(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.RestoreSettingType settingType, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
        return null;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public final void deleteAccount() {
    }
    
    public ManageAccountService(@org.jetbrains.annotations.NotNull()
    java.lang.String accountId, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.RestoreSettingsManager restoreSettingsManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/manageaccount/ManageAccountService$State;", "", "(Ljava/lang/String;I)V", "CanSave", "CannotSave", "app_debug"})
    public static enum State {
        /*public static final*/ CanSave /* = new CanSave() */,
        /*public static final*/ CannotSave /* = new CannotSave() */;
        
        State() {
        }
    }
}