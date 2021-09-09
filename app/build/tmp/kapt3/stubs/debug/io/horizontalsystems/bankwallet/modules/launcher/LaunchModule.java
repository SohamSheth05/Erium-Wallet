package io.horizontalsystems.bankwallet.modules.launcher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/launcher/LaunchModule;", "", "()V", "init", "", "view", "Lio/horizontalsystems/bankwallet/modules/launcher/LaunchViewModel;", "router", "Lio/horizontalsystems/bankwallet/modules/launcher/LaunchModule$IRouter;", "start", "context", "Landroid/content/Context;", "IInteractor", "IInteractorDelegate", "IRouter", "IView", "IViewDelegate", "app_debug"})
public final class LaunchModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.launcher.LaunchModule INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.launcher.LaunchViewModel view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.launcher.LaunchModule.IRouter router) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private LaunchModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/launcher/LaunchModule$IView;", "", "app_debug"})
    public static abstract interface IView {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/launcher/LaunchModule$IViewDelegate;", "", "didCancelUnlock", "", "didUnlock", "viewDidLoad", "app_debug"})
    public static abstract interface IViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void didUnlock();
        
        public abstract void didCancelUnlock();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\t\u001a\u00020\nH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0012\u0010\u0007\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0004\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/launcher/LaunchModule$IInteractor;", "", "isAccountsEmpty", "", "()Z", "isPinNotSet", "isSystemLockOff", "mainShowedOnce", "getMainShowedOnce", "validateKeyStore", "Lio/horizontalsystems/core/security/KeyStoreValidationResult;", "app_debug"})
    public static abstract interface IInteractor {
        
        public abstract boolean isPinNotSet();
        
        public abstract boolean isAccountsEmpty();
        
        public abstract boolean isSystemLockOff();
        
        public abstract boolean getMainShowedOnce();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.core.security.KeyStoreValidationResult validateKeyStore();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/launcher/LaunchModule$IInteractorDelegate;", "", "app_debug"})
    public static abstract interface IInteractorDelegate {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/launcher/LaunchModule$IRouter;", "", "closeApplication", "", "openKeyInvalidatedModule", "openMainModule", "openNoSystemLockModule", "openUnlockModule", "openUserAuthenticationModule", "openWelcomeModule", "app_debug"})
    public static abstract interface IRouter {
        
        public abstract void openWelcomeModule();
        
        public abstract void openMainModule();
        
        public abstract void openUnlockModule();
        
        public abstract void closeApplication();
        
        public abstract void openNoSystemLockModule();
        
        public abstract void openKeyInvalidatedModule();
        
        public abstract void openUserAuthenticationModule();
    }
}