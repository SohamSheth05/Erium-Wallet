package io.horizontalsystems.bankwallet.modules.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\b\u0010)\u001a\u00020\u001bH\u0014J\u0006\u0010*\u001a\u00020\u001bJ\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u001bH\u0002J\u0014\u0010/\u001a\u00020\u001b2\f\u00100\u001a\b\u0012\u0004\u0012\u00020201J\b\u00103\u001a\u00020\u001bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018\u00a8\u00064"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "pinComponent", "Lio/horizontalsystems/core/IPinComponent;", "rateAppManager", "Lio/horizontalsystems/bankwallet/core/IRateAppManager;", "backupManager", "Lio/horizontalsystems/bankwallet/core/IBackupManager;", "termsManager", "Lio/horizontalsystems/bankwallet/core/ITermsManager;", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "releaseNotesManager", "Lio/horizontalsystems/bankwallet/core/managers/ReleaseNotesManager;", "service", "Lio/horizontalsystems/bankwallet/modules/main/MainService;", "(Lio/horizontalsystems/core/IPinComponent;Lio/horizontalsystems/bankwallet/core/IRateAppManager;Lio/horizontalsystems/bankwallet/core/IBackupManager;Lio/horizontalsystems/bankwallet/core/ITermsManager;Lio/horizontalsystems/bankwallet/core/IAccountManager;Lio/horizontalsystems/bankwallet/core/managers/ReleaseNotesManager;Lio/horizontalsystems/bankwallet/modules/main/MainService;)V", "contentHidden", "", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "hideContentLiveData", "Landroidx/lifecycle/MutableLiveData;", "getHideContentLiveData", "()Landroidx/lifecycle/MutableLiveData;", "openPlayMarketLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getOpenPlayMarketLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "setBadgeVisibleLiveData", "getSetBadgeVisibleLiveData", "showRateAppLiveEvent", "getShowRateAppLiveEvent", "showRootedDeviceWarningLiveEvent", "getShowRootedDeviceWarningLiveEvent", "showWhatsNewLiveEvent", "", "getShowWhatsNewLiveEvent", "transactionTabEnabledLiveData", "getTransactionTabEnabledLiveData", "onCleared", "onResume", "showRateApp", "showRateUs", "Lio/horizontalsystems/bankwallet/core/managers/RateUsType;", "showWhatsNew", "sync", "accounts", "", "Lio/horizontalsystems/bankwallet/entities/Account;", "updateBadgeVisibility", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> showRootedDeviceWarningLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> showRateAppLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> showWhatsNewLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> openPlayMarketLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> hideContentLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> setBadgeVisibleLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> transactionTabEnabledLiveData = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private boolean contentHidden;
    private final io.horizontalsystems.core.IPinComponent pinComponent = null;
    private final io.horizontalsystems.bankwallet.core.IBackupManager backupManager = null;
    private final io.horizontalsystems.bankwallet.core.ITermsManager termsManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.ReleaseNotesManager releaseNotesManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getShowRootedDeviceWarningLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getShowRateAppLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> getShowWhatsNewLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getOpenPlayMarketLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getHideContentLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSetBadgeVisibleLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getTransactionTabEnabledLiveData() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void onResume() {
    }
    
    public final void sync(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Account> accounts) {
    }
    
    private final void showWhatsNew() {
    }
    
    private final void showRateApp(io.horizontalsystems.bankwallet.core.managers.RateUsType showRateUs) {
    }
    
    private final void updateBadgeVisibility() {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.IPinComponent pinComponent, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateAppManager rateAppManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IBackupManager backupManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ITermsManager termsManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.ReleaseNotesManager releaseNotesManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.main.MainService service) {
        super();
    }
}