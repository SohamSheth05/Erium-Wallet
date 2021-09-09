package io.horizontalsystems.bankwallet.modules.send.submodules.confirmation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/SendConfirmationPresenter;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/SendConfirmationModule$IViewDelegate;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/SendConfirmationModule$IInteractorDelegate;", "view", "Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/SendConfirmationModule$IView;", "interactor", "Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/SendConfirmationModule$IInteractor;", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/SendConfirmationModule$IView;Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/SendConfirmationModule$IInteractor;)V", "confirmationViewItems", "", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$SendConfirmationViewItem;", "getConfirmationViewItems", "()Ljava/util/List;", "setConfirmationViewItems", "(Ljava/util/List;)V", "receiver", "", "getView", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/SendConfirmationModule$IView;", "didCopyToClipboard", "", "onReceiverClick", "onSendError", "onViewDidLoad", "app_debug"})
public final class SendConfirmationPresenter extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationModule.IViewDelegate, io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationModule.IInteractorDelegate {
    private java.lang.String receiver = "";
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationViewItem> confirmationViewItems;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationModule.IView view = null;
    private final io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationModule.IInteractor interactor = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationViewItem> getConfirmationViewItems() {
        return null;
    }
    
    public final void setConfirmationViewItems(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationViewItem> p0) {
    }
    
    @java.lang.Override()
    public void onViewDidLoad() {
    }
    
    @java.lang.Override()
    public void onReceiverClick() {
    }
    
    @java.lang.Override()
    public void didCopyToClipboard() {
    }
    
    @java.lang.Override()
    public void onSendError() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationModule.IView getView() {
        return null;
    }
    
    public SendConfirmationPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationModule.IView view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationModule.IInteractor interactor) {
        super();
    }
}