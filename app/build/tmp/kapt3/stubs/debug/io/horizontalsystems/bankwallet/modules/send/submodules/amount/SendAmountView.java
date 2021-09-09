package io.horizontalsystems.bankwallet.modules.send.submodules.amount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0005H\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0005H\u0016J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0010H\u0016J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u0010H\u0016J\u0012\u0010$\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\u0019H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007\u00a8\u0006&"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountView;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IView;", "()V", "amount", "Landroidx/lifecycle/MutableLiveData;", "", "getAmount", "()Landroidx/lifecycle/MutableLiveData;", "availableBalance", "getAvailableBalance", "hint", "getHint", "inputParamsLiveData", "Lio/horizontalsystems/bankwallet/ui/extensions/AmountInputView$InputParams;", "getInputParamsLiveData", "maxButtonVisibleValue", "", "getMaxButtonVisibleValue", "revertAmount", "Lio/horizontalsystems/core/SingleLiveEvent;", "getRevertAmount", "()Lio/horizontalsystems/core/SingleLiveEvent;", "setLoading", "getSetLoading", "validationError", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$ValidationError;", "getValidationError", "", "setAmount", "setAvailableBalance", "setHint", "setInputFields", "inputParams", "loading", "setMaxButtonVisible", "visible", "setValidationError", "error", "app_debug"})
public final class SendAmountView implements io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IView {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> amount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> availableBalance = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> hint = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> maxButtonVisibleValue = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> revertAmount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.ValidationError> validationError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> setLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.extensions.AmountInputView.InputParams> inputParamsLiveData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAvailableBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getHint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getMaxButtonVisibleValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> getRevertAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.ValidationError> getValidationError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSetLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.extensions.AmountInputView.InputParams> getInputParamsLiveData() {
        return null;
    }
    
    @java.lang.Override()
    public void setAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String amount) {
    }
    
    @java.lang.Override()
    public void setAvailableBalance(@org.jetbrains.annotations.NotNull()
    java.lang.String availableBalance) {
    }
    
    @java.lang.Override()
    public void setHint(@org.jetbrains.annotations.NotNull()
    java.lang.String hint) {
    }
    
    @java.lang.Override()
    public void setMaxButtonVisible(boolean visible) {
    }
    
    @java.lang.Override()
    public void revertAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String amount) {
    }
    
    @java.lang.Override()
    public void setValidationError(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.ValidationError error) {
    }
    
    @java.lang.Override()
    public void setLoading(boolean loading) {
    }
    
    @java.lang.Override()
    public void setInputFields(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.extensions.AmountInputView.InputParams inputParams) {
    }
    
    public SendAmountView() {
        super();
    }
}