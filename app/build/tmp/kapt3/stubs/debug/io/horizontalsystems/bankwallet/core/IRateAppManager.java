package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IRateAppManager;", "", "showRateAppObservable", "Lio/reactivex/Observable;", "Lio/horizontalsystems/bankwallet/core/managers/RateUsType;", "getShowRateAppObservable", "()Lio/reactivex/Observable;", "forceShow", "", "onAppBecomeActive", "onAppLaunch", "onBalancePageActive", "onBalancePageInactive", "app_debug"})
public abstract interface IRateAppManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<io.horizontalsystems.bankwallet.core.managers.RateUsType> getShowRateAppObservable();
    
    public abstract void onBalancePageActive();
    
    public abstract void onBalancePageInactive();
    
    public abstract void onAppLaunch();
    
    public abstract void onAppBecomeActive();
    
    public abstract void forceShow();
}