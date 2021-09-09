package io.horizontalsystems.bankwallet.modules.send;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0016J\u0012\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0006\u0010\u0012\u001a\u00020\bJ\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendActivity;", "Lio/horizontalsystems/bankwallet/core/BaseActivity;", "()V", "mainPresenter", "Lio/horizontalsystems/bankwallet/modules/send/SendPresenter;", "proceedButtonView", "Lio/horizontalsystems/bankwallet/modules/send/submodules/sendbutton/ProceedButtonView;", "addInputItems", "", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "inputItems", "", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input;", "finish", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showFeeInfo", "subscribeToRouterEvents", "router", "Lio/horizontalsystems/bankwallet/modules/send/SendRouter;", "subscribeToViewEvents", "presenterView", "Lio/horizontalsystems/bankwallet/modules/send/SendView;", "Companion", "app_debug"})
public final class SendActivity extends io.horizontalsystems.bankwallet.core.BaseActivity {
    private io.horizontalsystems.bankwallet.modules.send.SendPresenter mainPresenter;
    private io.horizontalsystems.bankwallet.modules.send.submodules.sendbutton.ProceedButtonView proceedButtonView;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WALLET = "wallet_key";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.send.SendActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeToRouterEvents(io.horizontalsystems.bankwallet.modules.send.SendRouter router) {
    }
    
    private final void subscribeToViewEvents(io.horizontalsystems.bankwallet.modules.send.SendView presenterView, io.horizontalsystems.bankwallet.entities.Wallet wallet) {
    }
    
    public final void showFeeInfo() {
    }
    
    private final void addInputItems(io.horizontalsystems.bankwallet.entities.Wallet wallet, java.util.List<? extends io.horizontalsystems.bankwallet.modules.send.SendModule.Input> inputItems) {
    }
    
    @java.lang.Override()
    public void finish() {
    }
    
    public SendActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendActivity$Companion;", "", "()V", "WALLET", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}