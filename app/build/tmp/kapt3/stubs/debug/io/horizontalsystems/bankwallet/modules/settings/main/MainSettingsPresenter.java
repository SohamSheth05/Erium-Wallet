package io.horizontalsystems.bankwallet.modules.settings.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\b\u0010 \u001a\u00020\u0012H\u0016J\b\u0010!\u001a\u00020\u0012H\u0016J\b\u0010\"\u001a\u00020\u0012H\u0016J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0012H\u0016J\b\u0010\'\u001a\u00020\u0012H\u0016J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020%H\u0016J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u0012H\u0014J\u0010\u0010.\u001a\u00020\u00122\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010/\u001a\u00020\u0012H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u00060"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsPresenter;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsViewDelegate;", "Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsInteractorDelegate;", "view", "Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsView;", "router", "Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsRouter;", "interactor", "Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsInteractor;", "(Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsView;Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsRouter;Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsInteractor;)V", "helper", "Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsHelper;", "getRouter", "()Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsRouter;", "getView", "()Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsView;", "didTapAboutApp", "", "didTapAcademy", "didTapBaseCurrency", "didTapCompanyLogo", "didTapExperimentalFeatures", "didTapFacebook", "didTapFaq", "didTapLanguage", "didTapLinked", "didTapManageKeys", "didTapNotifications", "didTapReddit", "didTapSecurity", "didTapTelegram", "didTapTheme", "didTapTwitter", "didTapWalletConnect", "didUpdateAllBackedUp", "allBackedUp", "", "didUpdateBaseCurrency", "didUpdatePinSet", "didUpdateTermsAccepted", "allAccepted", "didUpdateWalletConnectSessionCount", "count", "", "onCleared", "setWalletConnectSessionCount", "viewDidLoad", "app_debug"})
public final class MainSettingsPresenter extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bankwallet.modules.settings.main.MainSettingsModule.IMainSettingsViewDelegate, io.horizontalsystems.bankwallet.modules.settings.main.MainSettingsModule.IMainSettingsInteractorDelegate {
    private final io.horizontalsystems.bankwallet.modules.settings.main.MainSettingsHelper helper = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.settings.main.MainSettingsModule.IMainSettingsView view = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.settings.main.MainSettingsModule.IMainSettingsRouter router = null;
    private final io.horizontalsystems.bankwallet.modules.settings.main.MainSettingsModule.IMainSettingsInteractor interactor = null;
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    private final void setWalletConnectSessionCount(int count) {
    }
    
    @java.lang.Override()
    public void didTapManageKeys() {
    }
    
    @java.lang.Override()
    public void didTapFacebook() {
    }
    
    @java.lang.Override()
    public void didTapLinked() {
    }
    
    @java.lang.Override()
    public void didTapWalletConnect() {
    }
    
    @java.lang.Override()
    public void didTapFaq() {
    }
    
    @java.lang.Override()
    public void didTapAcademy() {
    }
    
    @java.lang.Override()
    public void didTapTwitter() {
    }
    
    @java.lang.Override()
    public void didTapTelegram() {
    }
    
    @java.lang.Override()
    public void didTapReddit() {
    }
    
    @java.lang.Override()
    public void didTapSecurity() {
    }
    
    @java.lang.Override()
    public void didTapExperimentalFeatures() {
    }
    
    @java.lang.Override()
    public void didTapBaseCurrency() {
    }
    
    @java.lang.Override()
    public void didTapLanguage() {
    }
    
    @java.lang.Override()
    public void didTapTheme() {
    }
    
    @java.lang.Override()
    public void didTapAboutApp() {
    }
    
    @java.lang.Override()
    public void didTapCompanyLogo() {
    }
    
    @java.lang.Override()
    public void didTapNotifications() {
    }
    
    @java.lang.Override()
    public void didUpdateAllBackedUp(boolean allBackedUp) {
    }
    
    @java.lang.Override()
    public void didUpdateBaseCurrency() {
    }
    
    @java.lang.Override()
    public void didUpdateTermsAccepted(boolean allAccepted) {
    }
    
    @java.lang.Override()
    public void didUpdatePinSet() {
    }
    
    @java.lang.Override()
    public void didUpdateWalletConnectSessionCount(int count) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.settings.main.MainSettingsModule.IMainSettingsView getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.settings.main.MainSettingsModule.IMainSettingsRouter getRouter() {
        return null;
    }
    
    public MainSettingsPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.main.MainSettingsModule.IMainSettingsView view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.main.MainSettingsModule.IMainSettingsRouter router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.main.MainSettingsModule.IMainSettingsInteractor interactor) {
        super();
    }
}