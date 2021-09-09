package io.horizontalsystems.bankwallet.modules.swap.tradeoptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\b\u001a\u0004\b#\u0010$\u00a8\u00061"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsFragment;", "Lio/horizontalsystems/bankwallet/core/BaseFragment;", "()V", "deadlineViewModel", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapDeadlineViewModel;", "getDeadlineViewModel", "()Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapDeadlineViewModel;", "deadlineViewModel$delegate", "Lkotlin/Lazy;", "qrScannerResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "recipientAddressViewModel", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/RecipientAddressViewModel;", "getRecipientAddressViewModel", "()Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/RecipientAddressViewModel;", "recipientAddressViewModel$delegate", "slippageViewModel", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapSlippageViewModel;", "getSlippageViewModel", "()Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapSlippageViewModel;", "slippageViewModel$delegate", "swapViewModel", "Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel;", "getSwapViewModel", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel;", "swapViewModel$delegate", "viewModel", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsViewModel;", "getViewModel", "()Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsViewModel;", "viewModel$delegate", "vmFactory", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsModule$Factory;", "getVmFactory", "()Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsModule$Factory;", "vmFactory$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "app_debug"})
public final class SwapTradeOptionsFragment extends io.horizontalsystems.bankwallet.core.BaseFragment {
    private final kotlin.Lazy swapViewModel$delegate = null;
    private final kotlin.Lazy vmFactory$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy deadlineViewModel$delegate = null;
    private final kotlin.Lazy recipientAddressViewModel$delegate = null;
    private final kotlin.Lazy slippageViewModel$delegate = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> qrScannerResultLauncher = null;
    private java.util.HashMap _$_findViewCache;
    
    private final io.horizontalsystems.bankwallet.modules.swap.SwapViewModel getSwapViewModel() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptionsModule.Factory getVmFactory() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptionsViewModel getViewModel() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapDeadlineViewModel getDeadlineViewModel() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.RecipientAddressViewModel getRecipientAddressViewModel() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapSlippageViewModel getSlippageViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
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
    
    public SwapTradeOptionsFragment() {
        super();
    }
}