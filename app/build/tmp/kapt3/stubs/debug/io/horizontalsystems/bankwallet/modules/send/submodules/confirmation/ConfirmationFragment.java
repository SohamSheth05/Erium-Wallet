package io.horizontalsystems.bankwallet.modules.send.submodules.confirmation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/ConfirmationFragment;", "Lio/horizontalsystems/bankwallet/core/BaseFragment;", "sendPresenter", "Lio/horizontalsystems/bankwallet/modules/send/SendPresenter;", "(Lio/horizontalsystems/bankwallet/modules/send/SendPresenter;)V", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "presenter", "Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/SendConfirmationPresenter;", "getPresenter", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/SendConfirmationPresenter;", "presenter$delegate", "Lkotlin/Lazy;", "presenterView", "Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/SendConfirmationView;", "sendButtonView", "Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/subviews/ConfirmationSendButtonView;", "sendView", "Lio/horizontalsystems/bankwallet/modules/send/SendView;", "getErrorText", "", "error", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "app_debug"})
public final class ConfirmationFragment extends io.horizontalsystems.bankwallet.core.BaseFragment {
    private io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.subviews.ConfirmationSendButtonView sendButtonView;
    private final kotlin.Lazy presenter$delegate = null;
    private io.horizontalsystems.bankwallet.modules.send.SendView sendView;
    private io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationView presenterView;
    private final io.horizontalsystems.bankwallet.core.AppLogger logger = null;
    private io.horizontalsystems.bankwallet.modules.send.SendPresenter sendPresenter;
    private java.util.HashMap _$_findViewCache;
    
    private final io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationPresenter getPresenter() {
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
    
    private final java.lang.String getErrorText(java.lang.Throwable error) {
        return null;
    }
    
    public ConfirmationFragment(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.SendPresenter sendPresenter) {
        super();
    }
}