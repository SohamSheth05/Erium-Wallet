package io.horizontalsystems.bankwallet.modules.receive;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0014\u0010\u0013\u001a\u00020\u00122\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\fH\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/receive/ReceivePresenter;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IViewDelegate;", "Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IInteractorDelegate;", "view", "Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IView;", "router", "Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IRouter;", "interactor", "Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IInteractor;", "(Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IView;Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IRouter;Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IInteractor;)V", "receiveAddress", "Lio/horizontalsystems/bankwallet/modules/receive/viewitems/AddressItem;", "getRouter", "()Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IRouter;", "getView", "()Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IView;", "didCopyToClipboard", "", "didFailToReceiveAddress", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "didReceiveAddress", "address", "onAddressClick", "onShareClick", "viewDidLoad", "app_debug"})
public final class ReceivePresenter extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bankwallet.modules.receive.ReceiveModule.IViewDelegate, io.horizontalsystems.bankwallet.modules.receive.ReceiveModule.IInteractorDelegate {
    private io.horizontalsystems.bankwallet.modules.receive.viewitems.AddressItem receiveAddress;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.receive.ReceiveModule.IView view = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.receive.ReceiveModule.IRouter router = null;
    private final io.horizontalsystems.bankwallet.modules.receive.ReceiveModule.IInteractor interactor = null;
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void didReceiveAddress(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.receive.viewitems.AddressItem address) {
    }
    
    @java.lang.Override()
    public void didFailToReceiveAddress(@org.jetbrains.annotations.NotNull()
    java.lang.Exception exception) {
    }
    
    @java.lang.Override()
    public void onShareClick() {
    }
    
    @java.lang.Override()
    public void onAddressClick() {
    }
    
    @java.lang.Override()
    public void didCopyToClipboard() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.receive.ReceiveModule.IView getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.receive.ReceiveModule.IRouter getRouter() {
        return null;
    }
    
    public ReceivePresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.receive.ReceiveModule.IView view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.receive.ReceiveModule.IRouter router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.receive.ReceiveModule.IInteractor interactor) {
        super();
    }
}