package io.horizontalsystems.bankwallet.modules.sendevm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\u0006\u0010 \u001a\u00020\u001fJ\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#H\u0002J\u0012\u0010!\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006&"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService;", "clearables", "", "Lio/horizontalsystems/bankwallet/core/Clearable;", "(Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService;Ljava/util/List;)V", "amountCautionLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/Caution;", "getAmountCautionLiveData", "()Landroidx/lifecycle/MutableLiveData;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "proceedEnabledLiveData", "", "kotlin.jvm.PlatformType", "getProceedEnabledLiveData", "proceedLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData;", "getProceedLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "getService", "()Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService;", "onCleared", "", "onClickProceed", "sync", "state", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$State;", "amountError", "", "app_debug"})
public final class SendEvmViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> proceedEnabledLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> amountCautionLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData> proceedLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService service = null;
    private final java.util.List<io.horizontalsystems.bankwallet.core.Clearable> clearables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getProceedEnabledLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> getAmountCautionLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData> getProceedLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.coinkit2.models.Coin getCoin() {
        return null;
    }
    
    public final void onClickProceed() {
    }
    
    private final void sync(io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService.State state) {
    }
    
    private final void sync(java.lang.Throwable amountError) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService getService() {
        return null;
    }
    
    public SendEvmViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService service, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.core.Clearable> clearables) {
        super();
    }
}