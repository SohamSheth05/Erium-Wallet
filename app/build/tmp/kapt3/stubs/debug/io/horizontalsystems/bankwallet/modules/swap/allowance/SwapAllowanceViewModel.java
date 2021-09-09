package io.horizontalsystems.bankwallet.modules.swap.allowance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\u001eJ\u0012\u0010\u001f\u001a\u00020 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0016\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u001eJ\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u001eJ\b\u0010$\u001a\u00020 H\u0014J\u0014\u0010%\u001a\u00020 2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001dH\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00110\u00110\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService;", "allowanceService", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService;", "pendingAllowanceService", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapPendingAllowanceService;", "formatter", "Lio/horizontalsystems/bankwallet/modules/swap/SwapViewItemHelper;", "(Lio/horizontalsystems/bankwallet/modules/swap/SwapService;Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService;Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapPendingAllowanceService;Lio/horizontalsystems/bankwallet/modules/swap/SwapViewItemHelper;)V", "allowanceLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "value", "", "isError", "setError", "(Z)V", "isErrorLiveData", "kotlin.jvm.PlatformType", "isVisible", "()Z", "setVisible", "isVisibleLiveData", "allowance", "allowanceState", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$State;", "Landroidx/lifecycle/LiveData;", "handle", "", "errors", "", "", "onCleared", "syncVisible", "state", "app_debug"})
public final class SwapAllowanceViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVisibleLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> allowanceLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isErrorLiveData = null;
    private boolean isVisible = false;
    private boolean isError = false;
    private final io.horizontalsystems.bankwallet.modules.swap.SwapService service = null;
    private final io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService allowanceService = null;
    private final io.horizontalsystems.bankwallet.modules.swap.allowance.SwapPendingAllowanceService pendingAllowanceService = null;
    private final io.horizontalsystems.bankwallet.modules.swap.SwapViewItemHelper formatter = null;
    
    public final boolean isVisible() {
        return false;
    }
    
    private final void setVisible(boolean value) {
    }
    
    private final void setError(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isVisibleLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> allowanceLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isErrorLiveData() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void syncVisible(io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.State state) {
    }
    
    private final void handle(java.util.List<? extends java.lang.Throwable> errors) {
    }
    
    private final void handle(io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.State allowanceState) {
    }
    
    private final java.lang.String allowance(io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.State allowanceState) {
        return null;
    }
    
    public SwapAllowanceViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.SwapService service, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService allowanceService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.allowance.SwapPendingAllowanceService pendingAllowanceService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.SwapViewItemHelper formatter) {
        super();
    }
}