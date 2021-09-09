package io.horizontalsystems.bankwallet.modules.launcher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0014X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/launcher/LaunchInteractor;", "Lio/horizontalsystems/bankwallet/modules/launcher/LaunchModule$IInteractor;", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "pinComponent", "Lio/horizontalsystems/core/IPinComponent;", "systemInfoManager", "Lio/horizontalsystems/core/ISystemInfoManager;", "keyStoreManager", "Lio/horizontalsystems/core/IKeyStoreManager;", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "(Lio/horizontalsystems/bankwallet/core/IAccountManager;Lio/horizontalsystems/core/IPinComponent;Lio/horizontalsystems/core/ISystemInfoManager;Lio/horizontalsystems/core/IKeyStoreManager;Lio/horizontalsystems/bankwallet/core/ILocalStorage;)V", "delegate", "Lio/horizontalsystems/bankwallet/modules/launcher/LaunchModule$IInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/launcher/LaunchModule$IInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/launcher/LaunchModule$IInteractorDelegate;)V", "isAccountsEmpty", "", "()Z", "isPinNotSet", "isSystemLockOff", "mainShowedOnce", "getMainShowedOnce", "validateKeyStore", "Lio/horizontalsystems/core/security/KeyStoreValidationResult;", "app_debug"})
public final class LaunchInteractor implements io.horizontalsystems.bankwallet.modules.launcher.LaunchModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.launcher.LaunchModule.IInteractorDelegate delegate;
    private final boolean mainShowedOnce = false;
    private final io.horizontalsystems.bankwallet.core.IAccountManager accountManager = null;
    private final io.horizontalsystems.core.IPinComponent pinComponent = null;
    private final io.horizontalsystems.core.ISystemInfoManager systemInfoManager = null;
    private final io.horizontalsystems.core.IKeyStoreManager keyStoreManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.launcher.LaunchModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.launcher.LaunchModule.IInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public boolean isPinNotSet() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isAccountsEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isSystemLockOff() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.core.security.KeyStoreValidationResult validateKeyStore() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getMainShowedOnce() {
        return false;
    }
    
    public LaunchInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.IPinComponent pinComponent, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ISystemInfoManager systemInfoManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.IKeyStoreManager keyStoreManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorage) {
        super();
    }
}