package io.horizontalsystems.bankwallet.modules.settings.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsModule;", "", "()V", "init", "", "view", "Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsViewModel;", "router", "Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsRouter;", "ISecuritySettingsInteractor", "ISecuritySettingsRouter", "ISecuritySettingsView", "ISecuritySettingsViewDelegate", "app_debug"})
public final class SecuritySettingsModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.settings.security.SecuritySettingsModule INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.security.SecuritySettingsViewModel view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsRouter router) {
    }
    
    private SecuritySettingsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsView;", "", "setBiometricSettingsVisible", "", "visible", "", "setEditPinVisible", "toggleBiometricEnabled", "enabled", "togglePinSet", "pinSet", "app_debug"})
    public static abstract interface ISecuritySettingsView {
        
        public abstract void togglePinSet(boolean pinSet);
        
        public abstract void setEditPinVisible(boolean visible);
        
        public abstract void setBiometricSettingsVisible(boolean visible);
        
        public abstract void toggleBiometricEnabled(boolean enabled);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsViewDelegate;", "", "didCancelSetPin", "", "didCancelUnlockPinToDisablePin", "didSetPin", "didSwitchBiometricEnabled", "enable", "", "didSwitchPinSet", "didTapEditPin", "didTapPrivacy", "didUnlockPinToDisablePin", "viewDidLoad", "app_debug"})
    public static abstract interface ISecuritySettingsViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void didTapEditPin();
        
        public abstract void didSwitchPinSet(boolean enable);
        
        public abstract void didSwitchBiometricEnabled(boolean enable);
        
        public abstract void didSetPin();
        
        public abstract void didCancelSetPin();
        
        public abstract void didUnlockPinToDisablePin();
        
        public abstract void didCancelUnlockPinToDisablePin();
        
        public abstract void didTapPrivacy();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004R\u0012\u0010\b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0004\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsInteractor;", "", "isBiometricAuthEnabled", "", "()Z", "setBiometricAuthEnabled", "(Z)V", "isBiometricAuthSupported", "isPinSet", "disablePin", "", "app_debug"})
    public static abstract interface ISecuritySettingsInteractor {
        
        public abstract boolean isBiometricAuthSupported();
        
        public abstract boolean isPinSet();
        
        public abstract boolean isBiometricAuthEnabled();
        
        public abstract void setBiometricAuthEnabled(boolean p0);
        
        public abstract void disablePin();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsRouter;", "", "openPrivacySettings", "", "showEditPin", "showSetPin", "showUnlockPin", "app_debug"})
    public static abstract interface ISecuritySettingsRouter {
        
        public abstract void showEditPin();
        
        public abstract void showSetPin();
        
        public abstract void showUnlockPin();
        
        public abstract void openPrivacySettings();
    }
}