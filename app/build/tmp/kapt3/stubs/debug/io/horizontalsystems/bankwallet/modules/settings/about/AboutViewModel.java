package io.horizontalsystems.bankwallet.modules.settings.about;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010+\u001a\u00020 J\b\u0010,\u001a\u00020 H\u0014J\u0006\u0010-\u001a\u00020 J\u0006\u0010.\u001a\u00020 J\u0006\u0010/\u001a\u00020 J\u0006\u00100\u001a\u00020 J\u0006\u00101\u001a\u00020 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*\u00a8\u00062"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/about/AboutViewModel;", "Landroidx/lifecycle/ViewModel;", "appConfigProvider", "Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;", "clipboardManager", "Lio/horizontalsystems/bankwallet/core/IClipboardManager;", "rateAppManager", "Lio/horizontalsystems/bankwallet/core/IRateAppManager;", "releaseNotesManager", "Lio/horizontalsystems/bankwallet/core/managers/ReleaseNotesManager;", "termsManager", "Lio/horizontalsystems/bankwallet/core/ITermsManager;", "systemInfoManager", "Lio/horizontalsystems/core/ISystemInfoManager;", "(Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;Lio/horizontalsystems/bankwallet/core/IClipboardManager;Lio/horizontalsystems/bankwallet/core/IRateAppManager;Lio/horizontalsystems/bankwallet/core/managers/ReleaseNotesManager;Lio/horizontalsystems/bankwallet/core/ITermsManager;Lio/horizontalsystems/core/ISystemInfoManager;)V", "appVersion", "", "getAppVersion", "()Ljava/lang/String;", "disposable", "Lio/reactivex/disposables/Disposable;", "getDisposable", "()Lio/reactivex/disposables/Disposable;", "setDisposable", "(Lio/reactivex/disposables/Disposable;)V", "openLinkLiveData", "Lio/horizontalsystems/core/SingleLiveEvent;", "getOpenLinkLiveData", "()Lio/horizontalsystems/core/SingleLiveEvent;", "reportEmail", "getReportEmail", "showCopiedLiveEvent", "", "getShowCopiedLiveEvent", "showShareAppLiveData", "getShowShareAppLiveData", "showWhatsNewLiveEvent", "getShowWhatsNewLiveEvent", "termsAcceptedData", "Landroidx/lifecycle/MutableLiveData;", "", "getTermsAcceptedData", "()Landroidx/lifecycle/MutableLiveData;", "didFailSendMail", "onCleared", "onGithubLinkTap", "onRateUsClicked", "onSiteLinkTap", "onTellFriendsTap", "onWhatsNewTap", "app_debug"})
public final class AboutViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> openLinkLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> showShareAppLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> termsAcceptedData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> showCopiedLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> showWhatsNewLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String appVersion = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String reportEmail = null;
    @org.jetbrains.annotations.Nullable()
    private io.reactivex.disposables.Disposable disposable;
    private final io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider = null;
    private final io.horizontalsystems.bankwallet.core.IClipboardManager clipboardManager = null;
    private final io.horizontalsystems.bankwallet.core.IRateAppManager rateAppManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.ReleaseNotesManager releaseNotesManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> getOpenLinkLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> getShowShareAppLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getTermsAcceptedData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getShowCopiedLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> getShowWhatsNewLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReportEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.disposables.Disposable getDisposable() {
        return null;
    }
    
    public final void setDisposable(@org.jetbrains.annotations.Nullable()
    io.reactivex.disposables.Disposable p0) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void onGithubLinkTap() {
    }
    
    public final void onSiteLinkTap() {
    }
    
    public final void onTellFriendsTap() {
    }
    
    public final void didFailSendMail() {
    }
    
    public final void onRateUsClicked() {
    }
    
    public final void onWhatsNewTap() {
    }
    
    public AboutViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IClipboardManager clipboardManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateAppManager rateAppManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.ReleaseNotesManager releaseNotesManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ITermsManager termsManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ISystemInfoManager systemInfoManager) {
        super();
    }
}