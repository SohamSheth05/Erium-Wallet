package io.horizontalsystems.bankwallet.core.ethereum;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001>B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000bH\u0016J\u0016\u0010-\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0002J\u0016\u00101\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0002J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000bH\u0002J\b\u00108\u001a\u00020+H\u0016J\u0010\u00109\u001a\u00020+2\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020+2\u0006\u00104\u001a\u000205H\u0002J\u0016\u0010=\u001a\u00020+2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0002J\u0010\u00107\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0012X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0014\u00a8\u0006?"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ethereum/EthereumFeeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bankwallet/core/ethereum/ISendFeeViewModel;", "Lio/horizontalsystems/bankwallet/core/ethereum/ISendFeePriorityViewModel;", "transactionService", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService;", "coinService", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmCoinService;", "(Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService;Lio/horizontalsystems/bankwallet/core/ethereum/EvmCoinService;)V", "customFeeRange", "Landroid/util/Range;", "", "kotlin.jvm.PlatformType", "customFeeUnit", "", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "estimatedFeeLiveData", "Landroidx/lifecycle/MutableLiveData;", "getEstimatedFeeLiveData", "()Landroidx/lifecycle/MutableLiveData;", "feeLiveData", "getFeeLiveData", "feeSliderLiveData", "Lio/horizontalsystems/bankwallet/core/ethereum/SendFeeSliderViewItem;", "getFeeSliderLiveData", "hasEstimatedFee", "", "getHasEstimatedFee", "()Z", "openSelectPriorityLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "Lio/horizontalsystems/bankwallet/core/ethereum/SendPriorityViewItem;", "getOpenSelectPriorityLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "priorityLiveData", "getPriorityLiveData", "getTransactionService", "()Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService;", "warningOfStuckLiveData", "getWarningOfStuckLiveData", "changeCustomPriority", "", "value", "estimatedFeeStatus", "transactionStatus", "Lio/horizontalsystems/bankwallet/entities/DataState;", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$Transaction;", "feeStatus", "getPriority", "Lio/horizontalsystems/bankwallet/core/ethereum/EthereumFeeViewModel$Priority;", "gasPriceType", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasPriceType;", "gwei", "wei", "openSelectPriority", "selectPriority", "index", "", "syncGasPriceType", "syncTransactionStatus", "Priority", "app_debug"})
public final class EthereumFeeViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bankwallet.core.ethereum.ISendFeeViewModel, io.horizontalsystems.bankwallet.core.ethereum.ISendFeePriorityViewModel {
    private final boolean hasEstimatedFee = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> estimatedFeeLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> feeLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> priorityLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.util.List<io.horizontalsystems.bankwallet.core.ethereum.SendPriorityViewItem>> openSelectPriorityLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.ethereum.SendFeeSliderViewItem> feeSliderLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> warningOfStuckLiveData = null;
    private final java.lang.String customFeeUnit = "gwei";
    private final android.util.Range<java.lang.Long> customFeeRange = null;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService transactionService = null;
    private final io.horizontalsystems.bankwallet.core.ethereum.EvmCoinService coinService = null;
    
    @java.lang.Override()
    public boolean getHasEstimatedFee() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.lang.String> getEstimatedFeeLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.lang.String> getFeeLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.lang.String> getPriorityLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.core.SingleLiveEvent<java.util.List<io.horizontalsystems.bankwallet.core.ethereum.SendPriorityViewItem>> getOpenSelectPriorityLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.ethereum.SendFeeSliderViewItem> getFeeSliderLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.lang.Boolean> getWarningOfStuckLiveData() {
        return null;
    }
    
    @java.lang.Override()
    public void openSelectPriority() {
    }
    
    @java.lang.Override()
    public void selectPriority(int index) {
    }
    
    @java.lang.Override()
    public void changeCustomPriority(long value) {
    }
    
    private final void syncTransactionStatus(io.horizontalsystems.bankwallet.entities.DataState<io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.Transaction> transactionStatus) {
    }
    
    private final void syncGasPriceType(io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasPriceType gasPriceType) {
    }
    
    private final long gwei(long wei) {
        return 0L;
    }
    
    private final long wei(long gwei) {
        return 0L;
    }
    
    private final io.horizontalsystems.bankwallet.core.ethereum.EthereumFeeViewModel.Priority getPriority(io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasPriceType gasPriceType) {
        return null;
    }
    
    private final java.lang.String estimatedFeeStatus(io.horizontalsystems.bankwallet.entities.DataState<io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.Transaction> transactionStatus) {
        return null;
    }
    
    private final java.lang.String feeStatus(io.horizontalsystems.bankwallet.entities.DataState<io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.Transaction> transactionStatus) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService getTransactionService() {
        return null;
    }
    
    public EthereumFeeViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService transactionService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ethereum.EvmCoinService coinService) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ethereum/EthereumFeeViewModel$Priority;", "", "(Ljava/lang/String;I)V", "description", "", "getDescription", "()Ljava/lang/String;", "Recommended", "Custom", "app_debug"})
    public static enum Priority {
        /*public static final*/ Recommended /* = new @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u001b\u0010\u0002\u001a\u00020\u00038VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ethereum/EthereumFeeViewModel$Priority$Recommended;", "Lio/horizontalsystems/bankwallet/core/ethereum/EthereumFeeViewModel$Priority;", "description", "", "getDescription", "()Ljava/lang/String;", "description$delegate", "Lkotlin/Lazy;", "app_debug"}) Recommended(){
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy description$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDescription() {
        return null;
    }
    
    Recommended() {
        super();
    }
} */,
        /*public static final*/ Custom /* = new @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0001\u0018\u00002\u00020\u0001R\u001b\u0010\u0002\u001a\u00020\u00038VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ethereum/EthereumFeeViewModel$Priority$Custom;", "Lio/horizontalsystems/bankwallet/core/ethereum/EthereumFeeViewModel$Priority;", "description", "", "getDescription", "()Ljava/lang/String;", "description$delegate", "Lkotlin/Lazy;", "app_debug"}) Custom(){
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy description$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDescription() {
        return null;
    }
    
    Custom() {
        super();
    }
} */;
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getDescription();
        
        Priority() {
        }
    }
}