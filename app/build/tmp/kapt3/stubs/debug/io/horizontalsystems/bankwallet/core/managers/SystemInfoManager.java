package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/SystemInfoManager;", "Lio/horizontalsystems/core/ISystemInfoManager;", "()V", "appVersion", "", "getAppVersion", "()Ljava/lang/String;", "biometricAuthSupported", "", "getBiometricAuthSupported", "()Z", "biometricManager", "Landroidx/biometric/BiometricManager;", "getBiometricManager", "()Landroidx/biometric/BiometricManager;", "biometricManager$delegate", "Lkotlin/Lazy;", "deviceModel", "getDeviceModel", "isSystemLockOff", "osVersion", "getOsVersion", "app_debug"})
public final class SystemInfoManager implements io.horizontalsystems.core.ISystemInfoManager {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String appVersion = "0.21.3";
    private final kotlin.Lazy biometricManager$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAppVersion() {
        return null;
    }
    
    private final androidx.biometric.BiometricManager getBiometricManager() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isSystemLockOff() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getBiometricAuthSupported() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDeviceModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getOsVersion() {
        return null;
    }
    
    public SystemInfoManager() {
        super();
    }
}