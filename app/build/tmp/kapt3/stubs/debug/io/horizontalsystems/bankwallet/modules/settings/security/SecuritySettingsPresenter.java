package io.horizontalsystems.bankwallet.modules.settings.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsPresenter;", "Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsViewDelegate;", "router", "Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsRouter;", "interactor", "Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsInteractor;", "(Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsRouter;Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsInteractor;)V", "view", "Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsView;", "getView", "()Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsView;", "setView", "(Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsView;)V", "didCancelSetPin", "", "didCancelUnlockPinToDisablePin", "didSetPin", "didSwitchBiometricEnabled", "enable", "", "didSwitchPinSet", "didTapEditPin", "didTapPrivacy", "didUnlockPinToDisablePin", "syncPinSet", "pinSet", "viewDidLoad", "app_debug"})
public final class SecuritySettingsPresenter implements io.horizontalsystems.bankwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsViewDelegate {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsView view;
    private final io.horizontalsystems.bankwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsRouter router = null;
    private final io.horizontalsystems.bankwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsInteractor interactor = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsView p0) {
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void didSwitchBiometricEnabled(boolean enable) {
    }
    
    @java.lang.Override()
    public void didSetPin() {
    }
    
    @java.lang.Override()
    public void didCancelSetPin() {
    }
    
    @java.lang.Override()
    public void didUnlockPinToDisablePin() {
    }
    
    @java.lang.Override()
    public void didCancelUnlockPinToDisablePin() {
    }
    
    private final void syncPinSet(boolean pinSet) {
    }
    
    @java.lang.Override()
    public void didSwitchPinSet(boolean enable) {
    }
    
    @java.lang.Override()
    public void didTapEditPin() {
    }
    
    @java.lang.Override()
    public void didTapPrivacy() {
    }
    
    public SecuritySettingsPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsRouter router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsInteractor interactor) {
        super();
    }
}