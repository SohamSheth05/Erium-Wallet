package io.horizontalsystems.bankwallet.modules.send.submodules.fee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0014\u0010\u001d\u001a\u00020\u00122\n\u0010\u001e\u001a\u00060\u001fj\u0002` H\u0002J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeFragment;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/SendSubmoduleFragment;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "feeModuleDelegate", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;", "sendHandler", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;", "customPriorityUnit", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/CustomPriorityUnit;", "(Lio/horizontalsystems/coinkit2/models/Coin;Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/CustomPriorityUnit;)V", "presenter", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeePresenter;", "getPresenter", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeePresenter;", "presenter$delegate", "Lkotlin/Lazy;", "init", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setError", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "setLoading", "loading", "", "app_debug"})
public final class SendFeeFragment extends io.horizontalsystems.bankwallet.modules.send.submodules.SendSubmoduleFragment {
    private final kotlin.Lazy presenter$delegate = null;
    private final io.horizontalsystems.coinkit2.models.Coin coin = null;
    private final io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate feeModuleDelegate = null;
    private final io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler sendHandler = null;
    private final io.horizontalsystems.bankwallet.modules.send.submodules.fee.CustomPriorityUnit customPriorityUnit = null;
    private java.util.HashMap _$_findViewCache;
    
    private final io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeePresenter getPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void init() {
    }
    
    private final void setLoading(boolean loading) {
    }
    
    private final void setError(java.lang.Exception error) {
    }
    
    public SendFeeFragment(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate feeModuleDelegate, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler sendHandler, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.submodules.fee.CustomPriorityUnit customPriorityUnit) {
        super();
    }
}