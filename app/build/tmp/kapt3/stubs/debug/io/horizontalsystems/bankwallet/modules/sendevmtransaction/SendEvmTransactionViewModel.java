package io.horizontalsystems.bankwallet.modules.sendevmtransaction;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u001d\u001a\n \u001e*\u0004\u0018\u00010\u000b0\u000b2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010&\u001a\u00020\'H\u0002J\"\u0010(\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u001a\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u000b2\u0006\u00100\u001a\u000201H\u0002J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u00103\u001a\u000204H\u0002J\"\u00105\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u00106\u001a\u0002072\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J \u00108\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u00109\u001a\u00020:2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\"\u0010;\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010<\u001a\u00020=2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u000e\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020@J\u0010\u0010A\u001a\u00020\u00172\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010A\u001a\u00020\u00172\u0006\u0010D\u001a\u00020EH\u0002J\u0010\u0010A\u001a\u00020\u00172\u0006\u0010F\u001a\u00020GH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\r\u00a8\u0006H"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService;", "coinServiceFactory", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmCoinServiceFactory;", "(Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService;Lio/horizontalsystems/bankwallet/core/ethereum/EvmCoinServiceFactory;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "sendEnabledLiveData", "", "getSendEnabledLiveData", "sendFailedLiveData", "getSendFailedLiveData", "sendSuccessLiveData", "", "getSendSuccessLiveData", "sendingLiveData", "", "getSendingLiveData", "viewItemsLiveData", "", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SectionViewItem;", "getViewItemsLiveData", "convertError", "kotlin.jvm.PlatformType", "error", "", "getCoinService", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmCoinService;", "token", "Lio/horizontalsystems/ethereumkit/core/TransactionDecoration$Swap$Token;", "getEip20ApproveViewItems", "eip20Approve", "Lio/horizontalsystems/ethereumkit/core/TransactionDecoration$Eip20Approve;", "getEip20TransferViewItems", "eip20Transfer", "Lio/horizontalsystems/ethereumkit/core/TransactionDecoration$Eip20Transfer;", "additionalInfo", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$AdditionalInfo;", "getEstimatedSwapAmount", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/ViewItem;", "value", "type", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/ValueType;", "getFallbackViewItems", "transactionData", "Lio/horizontalsystems/ethereumkit/models/TransactionData;", "getSwapViewItems", "swap", "Lio/horizontalsystems/ethereumkit/core/TransactionDecoration$Swap;", "getTransferViewItems", "transfer", "Lio/horizontalsystems/ethereumkit/core/TransactionDecoration$Transfer;", "getViewItems", "decoration", "Lio/horizontalsystems/ethereumkit/core/TransactionDecoration;", "send", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "sync", "sendState", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$SendState;", "state", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$State;", "txDataState", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$TxDataState;", "app_debug"})
public final class SendEvmTransactionViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> sendEnabledLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> sendingLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<byte[]> sendSuccessLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> sendFailedLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.sendevmtransaction.SectionViewItem>> viewItemsLiveData = null;
    private final io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService service = null;
    private final io.horizontalsystems.bankwallet.core.ethereum.EvmCoinServiceFactory coinServiceFactory = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSendEnabledLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getSendingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<byte[]> getSendSuccessLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSendFailedLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.sendevmtransaction.SectionViewItem>> getViewItemsLiveData() {
        return null;
    }
    
    public final void send(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AppLogger logger) {
    }
    
    private final void sync(io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.State state) {
    }
    
    private final void sync(io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.TxDataState txDataState) {
    }
    
    private final void sync(io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.SendState sendState) {
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.sendevmtransaction.SectionViewItem> getViewItems(io.horizontalsystems.ethereumkit.core.TransactionDecoration decoration, io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo additionalInfo) {
        return null;
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.sendevmtransaction.SectionViewItem> getTransferViewItems(io.horizontalsystems.ethereumkit.core.TransactionDecoration.Transfer transfer, io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo additionalInfo) {
        return null;
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.sendevmtransaction.SectionViewItem> getEip20TransferViewItems(io.horizontalsystems.ethereumkit.core.TransactionDecoration.Eip20Transfer eip20Transfer, io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo additionalInfo) {
        return null;
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.sendevmtransaction.SectionViewItem> getEip20ApproveViewItems(io.horizontalsystems.ethereumkit.core.TransactionDecoration.Eip20Approve eip20Approve) {
        return null;
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.sendevmtransaction.SectionViewItem> getSwapViewItems(io.horizontalsystems.ethereumkit.core.TransactionDecoration.Swap swap, io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo additionalInfo) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.sendevmtransaction.ViewItem getEstimatedSwapAmount(java.lang.String value, io.horizontalsystems.bankwallet.modules.sendevmtransaction.ValueType type) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.core.ethereum.EvmCoinService getCoinService(io.horizontalsystems.ethereumkit.core.TransactionDecoration.Swap.Token token) {
        return null;
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.sendevmtransaction.SectionViewItem> getFallbackViewItems(io.horizontalsystems.ethereumkit.models.TransactionData transactionData) {
        return null;
    }
    
    private final java.lang.String convertError(java.lang.Throwable error) {
        return null;
    }
    
    public SendEvmTransactionViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService service, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ethereum.EvmCoinServiceFactory coinServiceFactory) {
        super();
    }
}