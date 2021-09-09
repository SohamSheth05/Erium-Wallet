package io.horizontalsystems.bankwallet.modules.swap.tradeoptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010 \u001a\u00020\u001fH\u0014R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\n \u0017*\u0004\u0018\u00010\u000e0\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\n\u00a8\u0006!"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapSlippageViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/IVerifiedInputViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsService;", "(Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsService;)V", "cautionLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/Caution;", "getCautionLiveData", "()Landroidx/lifecycle/MutableLiveData;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "initialValue", "", "getInitialValue", "()Ljava/lang/String;", "inputFieldButtonItems", "", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/InputFieldButtonItem;", "getInputFieldButtonItems", "()Ljava/util/List;", "inputFieldPlaceholder", "kotlin.jvm.PlatformType", "getInputFieldPlaceholder", "setTextLiveData", "getSetTextLiveData", "isValid", "", "text", "onChangeText", "", "onCleared", "app_debug"})
public final class SwapSlippageViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bankwallet.modules.swap.tradeoptions.IVerifiedInputViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final java.lang.String inputFieldPlaceholder = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> setTextLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> cautionLiveData = null;
    private final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptionsService service = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.InputFieldButtonItem> getInputFieldButtonItems() {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String getInputFieldPlaceholder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.lang.String> getSetTextLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> getCautionLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getInitialValue() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @java.lang.Override()
    public void onChangeText(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    @java.lang.Override()
    public boolean isValid(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return false;
    }
    
    public SwapSlippageViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptionsService service) {
        super();
    }
    
    public int getInputFieldMaximumNumberOfLines() {
        return 0;
    }
    
    public boolean getInputFieldCanEdit() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.lang.Boolean> isLoadingLiveData() {
        return null;
    }
}