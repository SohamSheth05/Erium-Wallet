package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0001#B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\b\u0010 \u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/RateAppManager;", "Lio/horizontalsystems/bankwallet/core/IRateAppManager;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "adapterManager", "Lio/horizontalsystems/bankwallet/core/IAdapterManager;", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "(Lio/horizontalsystems/bankwallet/core/IWalletManager;Lio/horizontalsystems/bankwallet/core/IAdapterManager;Lio/horizontalsystems/bankwallet/core/ILocalStorage;)V", "COUNTDOWN_TIME_INTERVAL", "", "MIN_COINS_COUNT", "", "MIN_LAUNCH_COUNT", "REQUEST_TIME_INTERVAL", "isCountdownAllowed", "", "isCountdownPassed", "isOnBalancePage", "isRequestAllowed", "showRateAppObservable", "Lio/reactivex/subjects/PublishSubject;", "Lio/horizontalsystems/bankwallet/core/managers/RateUsType;", "kotlin.jvm.PlatformType", "getShowRateAppObservable", "()Lio/reactivex/subjects/PublishSubject;", "forceShow", "", "onAppBecomeActive", "onAppLaunch", "onBalancePageActive", "onBalancePageInactive", "onCountdownPass", "showIfAllowed", "startCountdownChecker", "Companion", "app_debug"})
public final class RateAppManager implements io.horizontalsystems.bankwallet.core.IRateAppManager {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.core.managers.RateUsType> showRateAppObservable = null;
    private final int MIN_LAUNCH_COUNT = 5;
    private final int MIN_COINS_COUNT = 2;
    private final long COUNTDOWN_TIME_INTERVAL = 10000L;
    private final int REQUEST_TIME_INTERVAL = 3456000;
    private boolean isCountdownAllowed = false;
    private boolean isCountdownPassed = false;
    private boolean isRequestAllowed = false;
    private boolean isOnBalancePage = false;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager = null;
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorage = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.managers.RateAppManager.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.core.managers.RateUsType> getShowRateAppObservable() {
        return null;
    }
    
    private final void onCountdownPass() {
    }
    
    @java.lang.Override()
    public void onBalancePageActive() {
    }
    
    @java.lang.Override()
    public void onBalancePageInactive() {
    }
    
    @java.lang.Override()
    public void onAppLaunch() {
    }
    
    @java.lang.Override()
    public void onAppBecomeActive() {
    }
    
    @java.lang.Override()
    public void forceShow() {
    }
    
    private final void showIfAllowed() {
    }
    
    private final void startCountdownChecker() {
    }
    
    public RateAppManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorage) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/RateAppManager$Companion;", "", "()V", "getPlayMarketAppIntent", "Landroid/content/Intent;", "getPlayMarketSiteIntent", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getPlayMarketAppIntent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getPlayMarketSiteIntent() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}