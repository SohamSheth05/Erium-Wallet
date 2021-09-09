package io.horizontalsystems.bankwallet.modules.send;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u001d\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005H\u0016J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0018H\u0016J\u0016\u0010!\u001a\u00020\u001b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0011H\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00050\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013\u00a8\u0006#"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendView;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$IView;", "()V", "confirmationViewItems", "Landroidx/lifecycle/MutableLiveData;", "", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$SendConfirmationViewItem;", "getConfirmationViewItems", "()Landroidx/lifecycle/MutableLiveData;", "delegate", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$IViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$IViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$IViewDelegate;)V", "error", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getError", "()Lio/horizontalsystems/core/SingleLiveEvent;", "inputItems", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input;", "getInputItems", "sendButtonEnabled", "Lio/horizontalsystems/bankwallet/modules/send/SendPresenter$ActionState;", "getSendButtonEnabled", "showSendConfirmation", "", "getShowSendConfirmation", "loadInputItems", "inputs", "setSendButtonEnabled", "actionState", "showConfirmation", "showErrorInToast", "app_debug"})
public final class SendView implements io.horizontalsystems.bankwallet.modules.send.SendModule.IView {
    public io.horizontalsystems.bankwallet.modules.send.SendModule.IViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.Throwable> error = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationViewItem>> confirmationViewItems = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> showSendConfirmation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.send.SendPresenter.ActionState> sendButtonEnabled = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.util.List<io.horizontalsystems.bankwallet.modules.send.SendModule.Input>> inputItems = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.SendModule.IViewDelegate getDelegate() {
        return null;
    }
    
    @java.lang.Override()
    public void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.SendModule.IViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.Throwable> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationViewItem>> getConfirmationViewItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getShowSendConfirmation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.send.SendPresenter.ActionState> getSendButtonEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.util.List<io.horizontalsystems.bankwallet.modules.send.SendModule.Input>> getInputItems() {
        return null;
    }
    
    @java.lang.Override()
    public void loadInputItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.modules.send.SendModule.Input> inputs) {
    }
    
    @java.lang.Override()
    public void setSendButtonEnabled(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.SendPresenter.ActionState actionState) {
    }
    
    @java.lang.Override()
    public void showErrorInToast(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
    }
    
    @java.lang.Override()
    public void showConfirmation(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationViewItem> confirmationViewItems) {
    }
    
    public SendView() {
        super();
    }
}