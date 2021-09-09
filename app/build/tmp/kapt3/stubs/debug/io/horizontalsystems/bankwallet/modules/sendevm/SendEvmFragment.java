package io.horizontalsystems.bankwallet.modules.sendevm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0012\u00101\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u000103H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\b\u001a\u0004\b#\u0010$\u00a8\u00064"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmFragment;", "Lio/horizontalsystems/bankwallet/core/BaseFragment;", "()V", "amountViewModel", "Lio/horizontalsystems/bankwallet/modules/sendevm/AmountInputViewModel;", "getAmountViewModel", "()Lio/horizontalsystems/bankwallet/modules/sendevm/AmountInputViewModel;", "amountViewModel$delegate", "Lkotlin/Lazy;", "availableBalanceViewModel", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendAvailableBalanceViewModel;", "getAvailableBalanceViewModel", "()Lio/horizontalsystems/bankwallet/modules/sendevm/SendAvailableBalanceViewModel;", "availableBalanceViewModel$delegate", "qrScannerResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "recipientAddressViewModel", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/RecipientAddressViewModel;", "getRecipientAddressViewModel", "()Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/RecipientAddressViewModel;", "recipientAddressViewModel$delegate", "viewModel", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmViewModel;", "getViewModel", "()Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmViewModel;", "viewModel$delegate", "vmFactory", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmModule$Factory;", "getVmFactory", "()Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmModule$Factory;", "vmFactory$delegate", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "getWallet", "()Lio/horizontalsystems/bankwallet/entities/Wallet;", "wallet$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "setAmountInputCaution", "caution", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/Caution;", "app_debug"})
public final class SendEvmFragment extends io.horizontalsystems.bankwallet.core.BaseFragment {
    private final kotlin.Lazy wallet$delegate = null;
    private final kotlin.Lazy vmFactory$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy availableBalanceViewModel$delegate = null;
    private final kotlin.Lazy amountViewModel$delegate = null;
    private final kotlin.Lazy recipientAddressViewModel$delegate = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> qrScannerResultLauncher = null;
    private java.util.HashMap _$_findViewCache;
    
    private final io.horizontalsystems.bankwallet.entities.Wallet getWallet() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmModule.Factory getVmFactory() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmViewModel getViewModel() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.sendevm.SendAvailableBalanceViewModel getAvailableBalanceViewModel() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.sendevm.AmountInputViewModel getAmountViewModel() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.RecipientAddressViewModel getRecipientAddressViewModel() {
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
    
    private final void setAmountInputCaution(io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution caution) {
    }
    
    public SendEvmFragment() {
        super();
    }
}