package io.horizontalsystems.bankwallet.modules.settings.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsInteractor;", "Lio/horizontalsystems/bankwallet/modules/settings/security/SecuritySettingsModule$ISecuritySettingsInteractor;", "systemInfoManager", "Lio/horizontalsystems/core/ISystemInfoManager;", "pinComponent", "Lio/horizontalsystems/core/IPinComponent;", "(Lio/horizontalsystems/core/ISystemInfoManager;Lio/horizontalsystems/core/IPinComponent;)V", "value", "", "isBiometricAuthEnabled", "()Z", "setBiometricAuthEnabled", "(Z)V", "isBiometricAuthSupported", "isPinSet", "disablePin", "", "app_debug"})
public final class SecuritySettingsInteractor implements io.horizontalsystems.bankwallet.modules.settings.security.SecuritySettingsModule.ISecuritySettingsInteractor {
    private final io.horizontalsystems.core.ISystemInfoManager systemInfoManager = null;
    private final io.horizontalsystems.core.IPinComponent pinComponent = null;
    
    @java.lang.Override()
    public boolean isBiometricAuthSupported() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isBiometricAuthEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public void setBiometricAuthEnabled(boolean value) {
    }
    
    @java.lang.Override()
    public boolean isPinSet() {
        return false;
    }
    
    @java.lang.Override()
    public void disablePin() {
    }
    
    public SecuritySettingsInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ISystemInfoManager systemInfoManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.IPinComponent pinComponent) {
        super();
    }
}