package io.horizontalsystems.bankwallet.modules.swap.approve;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020$H\u0014J\u0006\u0010(\u001a\u00020$J\u000e\u0010)\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveViewModel;", "Landroidx/lifecycle/ViewModel;", "dex", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Dex;", "service", "Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService;", "coinService", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmCoinService;", "(Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Dex;Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService;Lio/horizontalsystems/bankwallet/core/ethereum/EvmCoinService;)V", "value", "", "amount", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "amountErrorLiveData", "Landroidx/lifecycle/MutableLiveData;", "getAmountErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "approveAllowedLiveData", "", "getApproveAllowedLiveData", "getDex", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Dex;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "openConfirmationLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData;", "getOpenConfirmationLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "convertError", "error", "", "handle", "", "approveState", "Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService$State;", "onCleared", "onProceed", "validateAmount", "app_debug"})
public final class SwapApproveViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> approveAllowedLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData> openConfirmationLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> amountErrorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex dex = null;
    private final io.horizontalsystems.bankwallet.modules.swap.approve.SwapApproveService service = null;
    private final io.horizontalsystems.bankwallet.core.ethereum.EvmCoinService coinService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAmount() {
        return null;
    }
    
    public final void setAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getApproveAllowedLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData> getOpenConfirmationLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAmountErrorLiveData() {
        return null;
    }
    
    public final boolean validateAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return false;
    }
    
    private final void handle(io.horizontalsystems.bankwallet.modules.swap.approve.SwapApproveService.State approveState) {
    }
    
    private final java.lang.String convertError(java.lang.Throwable error) {
        return null;
    }
    
    public final void onProceed() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex getDex() {
        return null;
    }
    
    public SwapApproveViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex dex, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.approve.SwapApproveService service, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ethereum.EvmCoinService coinService) {
        super();
    }
}