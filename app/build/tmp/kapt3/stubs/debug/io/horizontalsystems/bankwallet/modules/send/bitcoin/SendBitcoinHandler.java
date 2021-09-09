package io.horizontalsystems.bankwallet.modules.send.bitcoin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0015\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000e\u00105\u001a\b\u0012\u0004\u0012\u0002060+H\u0016J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u0002082\u0006\u0010<\u001a\u00020:H\u0016J\b\u0010=\u001a\u000208H\u0016J\u0010\u0010>\u001a\u0002082\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u000208H\u0016J\u0012\u0010B\u001a\u0002082\b\u0010C\u001a\u0004\u0018\u00010:H\u0016J\b\u0010D\u001a\u000208H\u0016J\u0010\u0010E\u001a\u0002082\u0006\u0010F\u001a\u00020:H\u0016J\b\u0010G\u001a\u000208H\u0016J\u0012\u0010H\u001a\u0002082\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u0002080L2\u0006\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u000208H\u0016J\b\u0010P\u001a\u000208H\u0002J\b\u0010Q\u001a\u000208H\u0002J\b\u0010R\u001a\u000208H\u0002J\b\u0010S\u001a\u000208H\u0002J\b\u0010T\u001a\u000208H\u0002J\u0010\u0010U\u001a\u0002082\u0006\u0010V\u001a\u00020WH\u0016R\u001a\u0010\f\u001a\u00020\rX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u000200X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104\u00a8\u0006X"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/bitcoin/SendBitcoinHandler;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendBitcoinInteractorDelegate;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModuleDelegate;", "interactor", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendBitcoinInteractor;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendBitcoinInteractor;Lio/horizontalsystems/coinkit2/models/CoinType;)V", "addressModule", "Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModule;", "getAddressModule", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModule;", "setAddressModule", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModule;)V", "amountModule", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IAmountModule;", "getAmountModule", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IAmountModule;", "setAmountModule", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IAmountModule;)V", "delegate", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandlerDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandlerDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandlerDelegate;)V", "feeModule", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;", "getFeeModule", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;", "setFeeModule", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;)V", "hodlerModule", "Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModule;", "getHodlerModule", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModule;", "setHodlerModule", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModule;)V", "inputItems", "", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input;", "getInputItems", "()Ljava/util/List;", "memoModule", "Lio/horizontalsystems/bankwallet/modules/send/submodules/memo/SendMemoModule$IMemoModule;", "getMemoModule", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/memo/SendMemoModule$IMemoModule;", "setMemoModule", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/memo/SendMemoModule$IMemoModule;)V", "confirmationViewItems", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$SendConfirmationViewItem;", "didFetchAvailableBalance", "", "availableBalance", "Ljava/math/BigDecimal;", "didFetchFee", "fee", "onChangeAmount", "onChangeInputType", "inputType", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;", "onModulesDidLoad", "onRateUpdated", "rate", "onUpdateAddress", "onUpdateAmount", "amount", "onUpdateFeeRate", "onUpdateLockTimeInterval", "timeInterval", "Lio/horizontalsystems/hodler/LockTimeInterval;", "sendSingle", "Lio/reactivex/Single;", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "sync", "syncCurrencyAmount", "syncMaximumAmount", "syncMinimumAmount", "syncState", "syncValidation", "validate", "address", "", "app_debug"})
public final class SendBitcoinHandler implements io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler, io.horizontalsystems.bankwallet.modules.send.SendModule.ISendBitcoinInteractorDelegate, io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IAmountModuleDelegate, io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate, io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate, io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IHodlerModuleDelegate {
    public io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IAmountModule amountModule;
    public io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IAddressModule addressModule;
    public io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IFeeModule feeModule;
    public io.horizontalsystems.bankwallet.modules.send.submodules.memo.SendMemoModule.IMemoModule memoModule;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IHodlerModule hodlerModule;
    public io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandlerDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.modules.send.SendModule.Input> inputItems = null;
    private final io.horizontalsystems.bankwallet.modules.send.SendModule.ISendBitcoinInteractor interactor = null;
    private final io.horizontalsystems.coinkit2.models.CoinType coinType = null;
    
    private final void syncValidation() {
    }
    
    private final void syncMinimumAmount() {
    }
    
    private final void syncMaximumAmount() {
    }
    
    private final void syncCurrencyAmount() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IAmountModule getAmountModule() {
        return null;
    }
    
    @java.lang.Override()
    public void setAmountModule(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IAmountModule p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IAddressModule getAddressModule() {
        return null;
    }
    
    @java.lang.Override()
    public void setAddressModule(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IAddressModule p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IFeeModule getFeeModule() {
        return null;
    }
    
    @java.lang.Override()
    public void setFeeModule(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IFeeModule p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.submodules.memo.SendMemoModule.IMemoModule getMemoModule() {
        return null;
    }
    
    @java.lang.Override()
    public void setMemoModule(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.memo.SendMemoModule.IMemoModule p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IHodlerModule getHodlerModule() {
        return null;
    }
    
    @java.lang.Override()
    public void setHodlerModule(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IHodlerModule p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandlerDelegate getDelegate() {
        return null;
    }
    
    @java.lang.Override()
    public void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandlerDelegate p0) {
    }
    
    @java.lang.Override()
    public void sync() {
    }
    
    private final void syncState() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.modules.send.SendModule.Input> getInputItems() {
        return null;
    }
    
    @java.lang.Override()
    public void onModulesDidLoad() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationViewItem> confirmationViewItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Unit> sendSingle(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AppLogger logger) {
        return null;
    }
    
    @java.lang.Override()
    public void didFetchAvailableBalance(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal availableBalance) {
    }
    
    @java.lang.Override()
    public void didFetchFee(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal fee) {
    }
    
    @java.lang.Override()
    public void onChangeAmount() {
    }
    
    @java.lang.Override()
    public void onChangeInputType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.SendModule.InputType inputType) {
    }
    
    @java.lang.Override()
    public void onRateUpdated(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal rate) {
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @java.lang.Override()
    public void onUpdateAddress() {
    }
    
    @java.lang.Override()
    public void onUpdateAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount) {
    }
    
    @java.lang.Override()
    public void onUpdateFeeRate() {
    }
    
    @java.lang.Override()
    public void onUpdateLockTimeInterval(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.hodler.LockTimeInterval timeInterval) {
    }
    
    public SendBitcoinHandler(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.SendModule.ISendBitcoinInteractor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType) {
        super();
    }
    
    public void onClear() {
    }
}