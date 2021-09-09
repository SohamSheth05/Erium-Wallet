package io.horizontalsystems.bankwallet.modules.swap.allowance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\u001c\u001a\u00020\u001aH\u0002J\u0006\u0010\u001d\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\f0\f0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapPendingAllowanceService;", "", "adapterManager", "Lio/horizontalsystems/bankwallet/core/IAdapterManager;", "allowanceService", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService;", "(Lio/horizontalsystems/bankwallet/core/IAdapterManager;Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService;)V", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "value", "", "isPending", "()Z", "setPending", "(Z)V", "isPendingObservable", "Lio/reactivex/Observable;", "()Lio/reactivex/Observable;", "isPendingSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "pendingAllowance", "Ljava/math/BigDecimal;", "onCleared", "", "set", "sync", "syncAllowance", "app_debug"})
public final class SwapPendingAllowanceService {
    private io.horizontalsystems.coinkit2.models.Coin coin;
    private java.math.BigDecimal pendingAllowance;
    private final io.reactivex.subjects.PublishSubject<java.lang.Boolean> isPendingSubject = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private boolean isPending = false;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.lang.Boolean> isPendingObservable = null;
    private final io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager = null;
    private final io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService allowanceService = null;
    
    public final boolean isPending() {
        return false;
    }
    
    private final void setPending(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Boolean> isPendingObservable() {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public final void syncAllowance() {
    }
    
    public final void onCleared() {
    }
    
    private final void sync() {
    }
    
    public SwapPendingAllowanceService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService allowanceService) {
        super();
    }
}