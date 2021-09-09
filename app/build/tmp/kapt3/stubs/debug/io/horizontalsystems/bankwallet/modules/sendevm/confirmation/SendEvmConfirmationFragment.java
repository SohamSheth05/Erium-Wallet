package io.horizontalsystems.bankwallet.modules.sendevm.confirmation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020-H\u0016J\u001a\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b!\u0010\"\u00a8\u00060"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/confirmation/SendEvmConfirmationFragment;", "Lio/horizontalsystems/bankwallet/core/BaseFragment;", "()V", "additionalInfo", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$AdditionalInfo;", "getAdditionalInfo", "()Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$AdditionalInfo;", "feeViewModel", "Lio/horizontalsystems/bankwallet/core/ethereum/EthereumFeeViewModel;", "getFeeViewModel", "()Lio/horizontalsystems/bankwallet/core/ethereum/EthereumFeeViewModel;", "feeViewModel$delegate", "Lkotlin/Lazy;", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "sendEvmMViewModel", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmViewModel;", "getSendEvmMViewModel", "()Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmViewModel;", "sendEvmMViewModel$delegate", "sendViewModel", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionViewModel;", "getSendViewModel", "()Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionViewModel;", "sendViewModel$delegate", "snackbarInProcess", "Lio/horizontalsystems/snackbar/CustomSnackbar;", "transactionData", "Lio/horizontalsystems/ethereumkit/models/TransactionData;", "getTransactionData", "()Lio/horizontalsystems/ethereumkit/models/TransactionData;", "vmFactory", "Lio/horizontalsystems/bankwallet/modules/sendevm/confirmation/SendEvmConfirmationModule$Factory;", "getVmFactory", "()Lio/horizontalsystems/bankwallet/modules/sendevm/confirmation/SendEvmConfirmationModule$Factory;", "vmFactory$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onViewCreated", "view", "app_debug"})
public final class SendEvmConfirmationFragment extends io.horizontalsystems.bankwallet.core.BaseFragment {
    private final io.horizontalsystems.bankwallet.core.AppLogger logger = null;
    private final kotlin.Lazy sendEvmMViewModel$delegate = null;
    private final kotlin.Lazy vmFactory$delegate = null;
    private final kotlin.Lazy sendViewModel$delegate = null;
    private final kotlin.Lazy feeViewModel$delegate = null;
    private io.horizontalsystems.snackbar.CustomSnackbar snackbarInProcess;
    private java.util.HashMap _$_findViewCache;
    
    private final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmViewModel getSendEvmMViewModel() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.sendevm.confirmation.SendEvmConfirmationModule.Factory getVmFactory() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionViewModel getSendViewModel() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.core.ethereum.EthereumFeeViewModel getFeeViewModel() {
        return null;
    }
    
    private final io.horizontalsystems.ethereumkit.models.TransactionData getTransactionData() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo getAdditionalInfo() {
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
    public void onDestroyView() {
    }
    
    public SendEvmConfirmationFragment() {
        super();
    }
}