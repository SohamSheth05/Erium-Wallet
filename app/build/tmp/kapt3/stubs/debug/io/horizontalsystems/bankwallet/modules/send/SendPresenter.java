package io.horizontalsystems.bankwallet.modules.send;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001KB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u000207H\u0016J\u0010\u0010;\u001a\u00020<2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010=\u001a\u00020<2\u0006\u00108\u001a\u000209H\u0002J$\u0010>\u001a\u0002072\u0006\u0010?\u001a\u00020<2\b\u0010@\u001a\u0004\u0018\u0001092\b\u0010A\u001a\u0004\u0018\u000109H\u0016J\b\u0010B\u001a\u000207H\u0016J\b\u0010C\u001a\u000207H\u0014J\b\u0010D\u001a\u000207H\u0016J\b\u0010E\u001a\u000207H\u0016J\u0010\u0010F\u001a\u0002072\u0006\u0010G\u001a\u00020HH\u0016J\b\u0010I\u001a\u000207H\u0016J\b\u0010J\u001a\u000207H\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\u000201X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105\u00a8\u0006L"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendPresenter;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$IViewDelegate;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendInteractorDelegate;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandlerDelegate;", "interactor", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendInteractor;", "router", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$IRouter;", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendInteractor;Lio/horizontalsystems/bankwallet/modules/send/SendModule$IRouter;)V", "addressModuleDelegate", "Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;", "getAddressModuleDelegate", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;", "setAddressModuleDelegate", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;)V", "amountModuleDelegate", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;", "getAmountModuleDelegate", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;", "setAmountModuleDelegate", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;)V", "customPriorityUnit", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/CustomPriorityUnit;", "getCustomPriorityUnit", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/CustomPriorityUnit;", "setCustomPriorityUnit", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/CustomPriorityUnit;)V", "feeModuleDelegate", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;", "getFeeModuleDelegate", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;", "setFeeModuleDelegate", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;)V", "handler", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;", "getHandler", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;", "setHandler", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;)V", "hodlerModuleDelegate", "Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModuleDelegate;", "getHodlerModuleDelegate", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModuleDelegate;", "setHodlerModuleDelegate", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModuleDelegate;)V", "getRouter", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$IRouter;", "view", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$IView;", "getView", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$IView;", "setView", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$IView;)V", "didFailToSend", "", "error", "", "didSend", "isEmptyAddressError", "", "isEmptyAmountError", "onChange", "isValid", "amountError", "addressError", "onClear", "onCleared", "onModulesDidLoad", "onProceedClicked", "onSendConfirmed", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "onViewDidLoad", "sync", "ActionState", "app_debug"})
public final class SendPresenter extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bankwallet.modules.send.SendModule.IViewDelegate, io.horizontalsystems.bankwallet.modules.send.SendModule.ISendInteractorDelegate, io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandlerDelegate {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IAmountModuleDelegate amountModuleDelegate;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate addressModuleDelegate;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate feeModuleDelegate;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IHodlerModuleDelegate hodlerModuleDelegate;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.send.submodules.fee.CustomPriorityUnit customPriorityUnit;
    public io.horizontalsystems.bankwallet.modules.send.SendModule.IView view;
    public io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler handler;
    private final io.horizontalsystems.bankwallet.modules.send.SendModule.ISendInteractor interactor = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.send.SendModule.IRouter router = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IAmountModuleDelegate getAmountModuleDelegate() {
        return null;
    }
    
    public final void setAmountModuleDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IAmountModuleDelegate p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate getAddressModuleDelegate() {
        return null;
    }
    
    public final void setAddressModuleDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate getFeeModuleDelegate() {
        return null;
    }
    
    public final void setFeeModuleDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IHodlerModuleDelegate getHodlerModuleDelegate() {
        return null;
    }
    
    public final void setHodlerModuleDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IHodlerModuleDelegate p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.send.submodules.fee.CustomPriorityUnit getCustomPriorityUnit() {
        return null;
    }
    
    public final void setCustomPriorityUnit(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.submodules.fee.CustomPriorityUnit p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.SendModule.IView getView() {
        return null;
    }
    
    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.SendModule.IView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler getHandler() {
        return null;
    }
    
    public void setHandler(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler p0) {
    }
    
    @java.lang.Override()
    public void onViewDidLoad() {
    }
    
    @java.lang.Override()
    public void onModulesDidLoad() {
    }
    
    @java.lang.Override()
    public void onProceedClicked() {
    }
    
    @java.lang.Override()
    public void onSendConfirmed(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AppLogger logger) {
    }
    
    @java.lang.Override()
    public void onClear() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @java.lang.Override()
    public void sync() {
    }
    
    @java.lang.Override()
    public void didSend() {
    }
    
    @java.lang.Override()
    public void didFailToSend(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
    }
    
    @java.lang.Override()
    public void onChange(boolean isValid, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable amountError, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable addressError) {
    }
    
    private final boolean isEmptyAmountError(java.lang.Throwable error) {
        return false;
    }
    
    private final boolean isEmptyAddressError(java.lang.Throwable error) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.send.SendModule.IRouter getRouter() {
        return null;
    }
    
    public SendPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.SendModule.ISendInteractor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.SendModule.IRouter router) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendPresenter$ActionState;", "", "()V", "Disabled", "Enabled", "Lio/horizontalsystems/bankwallet/modules/send/SendPresenter$ActionState$Enabled;", "Lio/horizontalsystems/bankwallet/modules/send/SendPresenter$ActionState$Disabled;", "app_debug"})
    public static abstract class ActionState {
        
        private ActionState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendPresenter$ActionState$Enabled;", "Lio/horizontalsystems/bankwallet/modules/send/SendPresenter$ActionState;", "()V", "app_debug"})
        public static final class Enabled extends io.horizontalsystems.bankwallet.modules.send.SendPresenter.ActionState {
            
            public Enabled() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendPresenter$ActionState$Disabled;", "Lio/horizontalsystems/bankwallet/modules/send/SendPresenter$ActionState;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "app_debug"})
        public static final class Disabled extends io.horizontalsystems.bankwallet.modules.send.SendPresenter.ActionState {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String title = null;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getTitle() {
                return null;
            }
            
            public Disabled(@org.jetbrains.annotations.Nullable()
            java.lang.String title) {
                super();
            }
        }
    }
}