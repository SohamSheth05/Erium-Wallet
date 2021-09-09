package io.horizontalsystems.bankwallet.modules.receive;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u000bH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/receive/ReceiveView;", "Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IView;", "()V", "hintDetails", "", "getHintDetails", "()Ljava/lang/String;", "setHintDetails", "(Ljava/lang/String;)V", "setHintText", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getSetHintText", "()Lio/horizontalsystems/core/SingleLiveEvent;", "showAddress", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/bankwallet/modules/receive/viewitems/AddressItem;", "getShowAddress", "()Landroidx/lifecycle/MutableLiveData;", "showCopied", "", "getShowCopied", "showError", "getShowError", "setHint", "hint", "address", "error", "app_debug"})
public final class ReceiveView implements io.horizontalsystems.bankwallet.modules.receive.ReceiveModule.IView {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.receive.viewitems.AddressItem> showAddress = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> showError = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> showCopied = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.Integer> setHintText = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String hintDetails;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.receive.viewitems.AddressItem> getShowAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getShowError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getShowCopied() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.Integer> getSetHintText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHintDetails() {
        return null;
    }
    
    public final void setHintDetails(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void showAddress(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.receive.viewitems.AddressItem address) {
    }
    
    @java.lang.Override()
    public void showError(int error) {
    }
    
    @java.lang.Override()
    public void showCopied() {
    }
    
    @java.lang.Override()
    public void setHint(int hint, @org.jetbrains.annotations.Nullable()
    java.lang.String hintDetails) {
    }
    
    public ReceiveView() {
        super();
    }
}