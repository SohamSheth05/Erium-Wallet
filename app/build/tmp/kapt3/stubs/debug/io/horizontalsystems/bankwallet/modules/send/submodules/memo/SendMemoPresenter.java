package io.horizontalsystems.bankwallet.modules.send.submodules.memo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/memo/SendMemoPresenter;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/memo/SendMemoModule$IViewDelegate;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/memo/SendMemoModule$IMemoModule;", "maxLength", "", "view", "Lio/horizontalsystems/bankwallet/modules/send/submodules/memo/SendMemoModule$IView;", "(ILio/horizontalsystems/bankwallet/modules/send/submodules/memo/SendMemoModule$IView;)V", "<set-?>", "", "memo", "getMemo", "()Ljava/lang/String;", "getView", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/memo/SendMemoModule$IView;", "setView", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/memo/SendMemoModule$IView;)V", "onTextEntered", "", "onViewDidLoad", "app_debug"})
public final class SendMemoPresenter extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bankwallet.modules.send.submodules.memo.SendMemoModule.IViewDelegate, io.horizontalsystems.bankwallet.modules.send.submodules.memo.SendMemoModule.IMemoModule {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String memo;
    private final int maxLength = 0;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.send.submodules.memo.SendMemoModule.IView view;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getMemo() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewDidLoad() {
    }
    
    @java.lang.Override()
    public void onTextEntered(@org.jetbrains.annotations.NotNull()
    java.lang.String memo) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.send.submodules.memo.SendMemoModule.IView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.memo.SendMemoModule.IView p0) {
    }
    
    public SendMemoPresenter(int maxLength, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.memo.SendMemoModule.IView view) {
        super();
    }
}