package io.horizontalsystems.bankwallet.modules.createaccount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010.\u001a\u00020\nH\u0002J\b\u0010/\u001a\u00020\nH\u0002J\u000e\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\u0018J\u000e\u00102\u001a\u00020\n2\u0006\u00101\u001a\u00020\u0018J\b\u00103\u001a\u00020\nH\u0014J\u0006\u00104\u001a\u00020\nJ\u000e\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\u0013J\u0010\u00107\u001a\u00020\u00132\b\u00108\u001a\u0004\u0018\u00010\u0018J\"\u00109\u001a\u00020\u00132\b\u00108\u001a\u0004\u0018\u00010\u00182\u000e\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 H\u0002J\u0010\u0010;\u001a\u00020\u00132\b\u00108\u001a\u0004\u0018\u00010\u0018R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00180\u00180\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 \u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 \u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010#R0\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180\t\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\f\u00a8\u0006<"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/createaccount/CreateAccountViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/createaccount/CreateAccountService;", "clearables", "", "Lio/horizontalsystems/bankwallet/core/Clearable;", "(Lio/horizontalsystems/bankwallet/modules/createaccount/CreateAccountService;Ljava/util/List;)V", "clearInputsLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getClearInputsLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "finishLiveEvent", "getFinishLiveEvent", "inputsVisibleLiveData", "Landroidx/lifecycle/LiveData;", "", "kotlin.jvm.PlatformType", "getInputsVisibleLiveData", "()Landroidx/lifecycle/LiveData;", "kindLiveData", "", "getKindLiveData", "kindViewItems", "Lio/horizontalsystems/bankwallet/ui/selector/ViewItemWrapper;", "Lio/horizontalsystems/bankwallet/modules/createaccount/CreateAccountModule$Kind;", "getKindViewItems", "()Ljava/util/List;", "passphraseCautionLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/Caution;", "getPassphraseCautionLiveData", "()Landroidx/lifecycle/MutableLiveData;", "passphraseConfirmationCautionLiveData", "getPassphraseConfirmationCautionLiveData", "value", "selectedKindViewItem", "getSelectedKindViewItem", "()Lio/horizontalsystems/bankwallet/ui/selector/ViewItemWrapper;", "setSelectedKindViewItem", "(Lio/horizontalsystems/bankwallet/ui/selector/ViewItemWrapper;)V", "showErrorLiveEvent", "getShowErrorLiveEvent", "clearCautions", "clearInputs", "onChangePassphrase", "v", "onChangePassphraseConfirmation", "onCleared", "onClickCreate", "onTogglePassphrase", "enabled", "validatePassphrase", "text", "validatePassphraseAndNotify", "cautionLiveData", "validatePassphraseConfirmation", "app_debug"})
public final class CreateAccountViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> kindLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> inputsVisibleLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> passphraseCautionLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> passphraseConfirmationCautionLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> clearInputsLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> showErrorLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> finishLiveEvent = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountModule.Kind>> kindViewItems = null;
    private final io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountService service = null;
    private final java.util.List<io.horizontalsystems.bankwallet.core.Clearable> clearables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getKindLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getInputsVisibleLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> getPassphraseCautionLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> getPassphraseConfirmationCautionLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getClearInputsLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> getShowErrorLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getFinishLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountModule.Kind>> getKindViewItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountModule.Kind> getSelectedKindViewItem() {
        return null;
    }
    
    public final void setSelectedKindViewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountModule.Kind> value) {
    }
    
    private final void clearInputs() {
    }
    
    private final void clearCautions() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void onTogglePassphrase(boolean enabled) {
    }
    
    public final void onChangePassphrase(@org.jetbrains.annotations.NotNull()
    java.lang.String v) {
    }
    
    public final void onChangePassphraseConfirmation(@org.jetbrains.annotations.NotNull()
    java.lang.String v) {
    }
    
    public final void onClickCreate() {
    }
    
    public final boolean validatePassphrase(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return false;
    }
    
    public final boolean validatePassphraseConfirmation(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return false;
    }
    
    private final boolean validatePassphraseAndNotify(java.lang.String text, androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> cautionLiveData) {
        return false;
    }
    
    public CreateAccountViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountService service, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.core.Clearable> clearables) {
        super();
    }
}