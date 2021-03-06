package io.horizontalsystems.bankwallet.modules.addtoken;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%H\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u0018H\u0002J\u0006\u0010*\u001a\u00020\u0018J\b\u0010+\u001a\u00020\u0018H\u0014J\u0010\u0010,\u001a\u00020\u00182\b\u0010-\u001a\u0004\u0018\u00010.J\u0010\u0010/\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020(H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\f\u00a8\u00060"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenViewModel;", "Landroidx/lifecycle/ViewModel;", "addTokenService", "Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenService;", "titleTextRes", "", "hintTextRes", "(Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenService;II)V", "cautionLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/Caution;", "getCautionLiveData", "()Landroidx/lifecycle/MutableLiveData;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getHintTextRes", "()I", "loadingLiveData", "", "getLoadingLiveData", "showAddButton", "getShowAddButton", "showSuccess", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getShowSuccess", "()Lio/horizontalsystems/core/SingleLiveEvent;", "getTitleTextRes", "viewItemLiveData", "Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$ViewItem;", "getViewItemLiveData", "getErrorText", "", "error", "", "getViewItem", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "getViewItemByState", "state", "Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State;", "observeState", "onAddClick", "onCleared", "onTextChange", "text", "", "sync", "app_debug"})
public final class AddTokenViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadingLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> cautionLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.ViewItem> viewItemLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showAddButton = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> showSuccess = null;
    private io.reactivex.disposables.CompositeDisposable disposables;
    private final io.horizontalsystems.bankwallet.modules.addtoken.AddTokenService addTokenService = null;
    private final int titleTextRes = 0;
    private final int hintTextRes = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> getCautionLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.ViewItem> getViewItemLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowAddButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getShowSuccess() {
        return null;
    }
    
    private final void observeState() {
    }
    
    public final void onTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void onAddClick() {
    }
    
    private final void sync(io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.State state) {
    }
    
    private final io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.ViewItem getViewItemByState(io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.State state) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.ViewItem getViewItem(io.horizontalsystems.coinkit2.models.Coin coin) {
        return null;
    }
    
    private final java.lang.String getErrorText(java.lang.Throwable error) {
        return null;
    }
    
    public final int getTitleTextRes() {
        return 0;
    }
    
    public final int getHintTextRes() {
        return 0;
    }
    
    public AddTokenViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.addtoken.AddTokenService addTokenService, int titleTextRes, int hintTextRes) {
        super();
    }
}