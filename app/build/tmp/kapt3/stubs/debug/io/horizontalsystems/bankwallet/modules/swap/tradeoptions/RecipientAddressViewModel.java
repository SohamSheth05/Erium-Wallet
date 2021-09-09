package io.horizontalsystems.bankwallet.modules.swap.tradeoptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0017J\u0012\u0010%\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\'\u001a\u00020#H\u0014J\u0010\u0010(\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010\nJ\b\u0010)\u001a\u00020#H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001f\u00a8\u0006*"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/RecipientAddressViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/IVerifiedInputViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/IRecipientAddressService;", "resolutionService", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/AddressResolutionService;", "addressParser", "Lio/horizontalsystems/bankwallet/core/IAddressParser;", "inputFieldPlaceholder", "", "clearables", "", "Lio/horizontalsystems/bankwallet/core/Clearable;", "(Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/IRecipientAddressService;Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/AddressResolutionService;Lio/horizontalsystems/bankwallet/core/IAddressParser;Ljava/lang/String;Ljava/util/List;)V", "cautionLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/Caution;", "getCautionLiveData", "()Landroidx/lifecycle/MutableLiveData;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "forceShowError", "", "initialValue", "getInitialValue", "()Ljava/lang/String;", "getInputFieldPlaceholder", "isEditing", "isLoadingLiveData", "Lio/horizontalsystems/core/SingleLiveEvent;", "()Lio/horizontalsystems/core/SingleLiveEvent;", "setTextLiveData", "getSetTextLiveData", "onChangeFocus", "", "hasFocus", "onChangeText", "text", "onCleared", "onFetch", "sync", "app_debug"})
public final class RecipientAddressViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bankwallet.modules.swap.tradeoptions.IVerifiedInputViewModel {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> setTextLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> cautionLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.Boolean> isLoadingLiveData = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String initialValue = null;
    private boolean isEditing = false;
    private boolean forceShowError = false;
    private io.reactivex.disposables.CompositeDisposable disposables;
    private final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.IRecipientAddressService service = null;
    private final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.AddressResolutionService resolutionService = null;
    private final io.horizontalsystems.bankwallet.core.IAddressParser addressParser = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String inputFieldPlaceholder = null;
    private final java.util.List<io.horizontalsystems.bankwallet.core.Clearable> clearables = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.core.SingleLiveEvent<java.lang.String> getSetTextLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> getCautionLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.core.SingleLiveEvent<java.lang.Boolean> isLoadingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getInitialValue() {
        return null;
    }
    
    @java.lang.Override()
    public void onChangeText(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    public final void onChangeFocus(boolean hasFocus) {
    }
    
    public final void onFetch(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    private final void sync() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getInputFieldPlaceholder() {
        return null;
    }
    
    public RecipientAddressViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.tradeoptions.IRecipientAddressService service, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.tradeoptions.AddressResolutionService resolutionService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAddressParser addressParser, @org.jetbrains.annotations.NotNull()
    java.lang.String inputFieldPlaceholder, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.core.Clearable> clearables) {
        super();
    }
    
    public int getInputFieldMaximumNumberOfLines() {
        return 0;
    }
    
    public boolean getInputFieldCanEdit() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.InputFieldButtonItem> getInputFieldButtonItems() {
        return null;
    }
    
    public boolean isValid(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return false;
    }
}