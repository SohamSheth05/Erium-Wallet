package io.horizontalsystems.bankwallet.modules.base;

import java.lang.System;

/**
 * Here we have Use Event class for emitting value only for once.
 * once the value is emitted it will not Emit again.
 *
 * set Message Method is used for communicate with View Class.
 *
 * observedChanges() method used for observing changes in messageString
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0006H\u0016J\b\u0010%\u001a\u00020&H\u0014J\u0010\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020\bH\u0002R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\nR&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\fR&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\fR&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\n\"\u0004\b \u0010\fR&\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\n\"\u0004\b#\u0010\f\u00a8\u0006)"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/base/BaseViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "apiErrorMessage", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/bankwallet/core/utils/Event;", "", "getApiErrorMessage", "()Landroidx/lifecycle/MutableLiveData;", "setApiErrorMessage", "(Landroidx/lifecycle/MutableLiveData;)V", "mDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getMDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "setMDisposable", "(Lio/reactivex/disposables/CompositeDisposable;)V", "messageString", "premiumErrorType", "getPremiumErrorType", "showProgress", "", "getShowProgress", "setShowProgress", "successMessage", "", "getSuccessMessage", "setSuccessMessage", "successStringMessage", "getSuccessStringMessage", "setSuccessStringMessage", "validationErrorMessage", "getValidationErrorMessage", "setValidationErrorMessage", "observedChanges", "onCleared", "", "setMessage", "msg", "app_debug"})
public class BaseViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.Nullable()
    private io.reactivex.disposables.CompositeDisposable mDisposable;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.utils.Event<java.lang.Integer>> validationErrorMessage;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.utils.Event<java.lang.String>> apiErrorMessage;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.utils.Event<java.lang.Integer>> successMessage;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.utils.Event<java.lang.String>> successStringMessage;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.utils.Event<java.lang.Boolean>> showProgress;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.utils.Event<java.lang.String>> premiumErrorType = null;
    private androidx.lifecycle.MutableLiveData<java.lang.String> messageString;
    
    @org.jetbrains.annotations.Nullable()
    protected final io.reactivex.disposables.CompositeDisposable getMDisposable() {
        return null;
    }
    
    protected final void setMDisposable(@org.jetbrains.annotations.Nullable()
    io.reactivex.disposables.CompositeDisposable p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.utils.Event<java.lang.Integer>> getValidationErrorMessage() {
        return null;
    }
    
    public final void setValidationErrorMessage(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.utils.Event<java.lang.Integer>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.utils.Event<java.lang.String>> getApiErrorMessage() {
        return null;
    }
    
    public final void setApiErrorMessage(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.utils.Event<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.utils.Event<java.lang.Integer>> getSuccessMessage() {
        return null;
    }
    
    public final void setSuccessMessage(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.utils.Event<java.lang.Integer>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.utils.Event<java.lang.String>> getSuccessStringMessage() {
        return null;
    }
    
    public final void setSuccessStringMessage(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.utils.Event<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.utils.Event<java.lang.Boolean>> getShowProgress() {
        return null;
    }
    
    public final void setShowProgress(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.utils.Event<java.lang.Boolean>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.utils.Event<java.lang.String>> getPremiumErrorType() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void setMessage(java.lang.String msg) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<java.lang.String> observedChanges() {
        return null;
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}