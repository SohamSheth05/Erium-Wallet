package io.horizontalsystems.bankwallet.modules.send.submodules.fee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00c2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BU\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u0014\u0010G\u001a\u00020H2\n\u0010!\u001a\u00060\"j\u0002`#H\u0016J\u0018\u0010I\u001a\u00020H2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010J\u001a\u00020H2\u0006\u0010K\u001a\u00020\u0018H\u0016J\b\u0010L\u001a\u00020HH\u0016J\u000f\u0010M\u001a\u0004\u0018\u00010&H\u0002\u00a2\u0006\u0002\u0010(J\u0010\u0010N\u001a\u00020H2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010O\u001a\u00020H2\u0006\u0010\u001c\u001a\u00020PH\u0016J\b\u0010Q\u001a\u00020HH\u0014J\b\u0010R\u001a\u00020HH\u0016J\b\u0010S\u001a\u00020HH\u0016J\u0010\u0010T\u001a\u00020H2\u0006\u0010U\u001a\u00020VH\u0016J\u0010\u0010W\u001a\u00020H2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010X\u001a\u00020H2\u0006\u0010Y\u001a\u00020\u0018H\u0016J\u0018\u0010Z\u001a\u00020H2\u000e\u0010[\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#H\u0016J\u0010\u0010\\\u001a\u00020H2\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0010\u0010]\u001a\u00020H2\u0006\u00102\u001a\u000203H\u0016J\u0010\u0010^\u001a\u00020H2\u0006\u0010_\u001a\u000205H\u0016J\u0012\u0010`\u001a\u00020H2\b\u0010K\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010a\u001a\u00020HH\u0002J\b\u0010b\u001a\u00020HH\u0002J\b\u0010c\u001a\u00020HH\u0002J\u0010\u0010d\u001a\u00020H2\u0006\u0010e\u001a\u00020fH\u0002J\b\u0010g\u001a\u00020HH\u0002R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u001f\u0010 R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010%\u001a\u0004\u0018\u00010&8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020.8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u00100R\u0010\u00101\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00104\u001a\u0002058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b4\u00106R\u001c\u00107\u001a\u0004\u0018\u000108X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020>8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b?\u0010@R\u0010\u0010A\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010B\u001a\u0004\u0018\u00010>8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bC\u0010@R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0010\u0010F\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006h"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeePresenter;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IViewDelegate;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IInteractorDelegate;", "view", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IView;", "interactor", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IInteractor;", "helper", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeePresenterHelper;", "baseCoin", "Lio/horizontalsystems/coinkit2/models/Coin;", "baseCurrency", "Lio/horizontalsystems/core/entities/Currency;", "feeCoinData", "Lkotlin/Pair;", "", "customPriorityUnit", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/CustomPriorityUnit;", "feeRateAdjustmentHelper", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/FeeRateAdjustmentHelper;", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IView;Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IInteractor;Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeePresenterHelper;Lio/horizontalsystems/coinkit2/models/Coin;Lio/horizontalsystems/core/entities/Currency;Lkotlin/Pair;Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/CustomPriorityUnit;Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/FeeRateAdjustmentHelper;)V", "availableFeeBalance", "Ljava/math/BigDecimal;", "coin", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "value", "Ljava/math/BigInteger;", "customFeeRate", "setCustomFeeRate", "(Ljava/math/BigInteger;)V", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "fee", "feeRate", "", "getFeeRate", "()Ljava/lang/Long;", "feeRateAdjustmentInfo", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/FeeRateAdjustmentInfo;", "feeRatePriority", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "feeRateState", "Lio/horizontalsystems/bankwallet/entities/FeeRateState;", "getFeeRateState", "()Lio/horizontalsystems/bankwallet/entities/FeeRateState;", "fetchedFeeRate", "inputType", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;", "isValid", "", "()Z", "moduleDelegate", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;", "getModuleDelegate", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;", "setModuleDelegate", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;)V", "primaryAmountInfo", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "getPrimaryAmountInfo", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "recommendedFeeRate", "secondaryAmountInfo", "getSecondaryAmountInfo", "getView", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IView;", "xRate", "didReceiveError", "", "didUpdate", "didUpdateExchangeRate", "rate", "fetchFeeRate", "getSmartFee", "onChangeFeeRate", "onChangeFeeRateValue", "", "onCleared", "onClickFeeRatePriority", "onViewDidLoad", "setAmountInfo", "sendAmountInfo", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo;", "setAvailableFeeBalance", "setBalance", "balance", "setError", "externalError", "setFee", "setInputType", "setLoading", "loading", "setRate", "syncError", "syncFeeRateLabels", "syncFees", "updateCustomFeeParams", "priority", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority$Custom;", "validate", "app_debug"})
public final class SendFeePresenter extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IViewDelegate, io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IFeeModule, io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IInteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate moduleDelegate;
    private java.math.BigDecimal xRate;
    private io.horizontalsystems.bankwallet.modules.send.SendModule.InputType inputType = io.horizontalsystems.bankwallet.modules.send.SendModule.InputType.COIN;
    private java.math.BigDecimal fee;
    private java.math.BigDecimal availableFeeBalance;
    private java.lang.Exception error;
    private java.math.BigInteger customFeeRate;
    private java.math.BigInteger fetchedFeeRate;
    private io.horizontalsystems.bankwallet.core.FeeRatePriority feeRatePriority;
    private io.horizontalsystems.bankwallet.modules.send.submodules.fee.FeeRateAdjustmentInfo feeRateAdjustmentInfo;
    private java.math.BigInteger recommendedFeeRate;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IView view = null;
    private final io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IInteractor interactor = null;
    private final io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeePresenterHelper helper = null;
    private final io.horizontalsystems.coinkit2.models.Coin baseCoin = null;
    private final io.horizontalsystems.core.entities.Currency baseCurrency = null;
    private final kotlin.Pair<io.horizontalsystems.coinkit2.models.Coin, java.lang.String> feeCoinData = null;
    private final io.horizontalsystems.bankwallet.modules.send.submodules.fee.CustomPriorityUnit customPriorityUnit = null;
    private final io.horizontalsystems.bankwallet.modules.send.submodules.fee.FeeRateAdjustmentHelper feeRateAdjustmentHelper = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate getModuleDelegate() {
        return null;
    }
    
    public final void setModuleDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate p0) {
    }
    
    private final void setCustomFeeRate(java.math.BigInteger value) {
    }
    
    private final io.horizontalsystems.coinkit2.models.Coin getCoin() {
        return null;
    }
    
    private final void syncError() {
    }
    
    private final void syncFees() {
    }
    
    private final void syncFeeRateLabels() {
    }
    
    private final void validate() {
    }
    
    private final void updateCustomFeeParams(io.horizontalsystems.bankwallet.core.FeeRatePriority.Custom priority) {
    }
    
    private final java.lang.Long getSmartFee() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isValid() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.FeeRateState getFeeRateState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getPrimaryAmountInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getSecondaryAmountInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Long getFeeRate() {
        return null;
    }
    
    @java.lang.Override()
    public void setLoading(boolean loading) {
    }
    
    @java.lang.Override()
    public void setFee(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal fee) {
    }
    
    @java.lang.Override()
    public void setError(@org.jetbrains.annotations.Nullable()
    java.lang.Exception externalError) {
    }
    
    @java.lang.Override()
    public void fetchFeeRate() {
    }
    
    @java.lang.Override()
    public void setAvailableFeeBalance(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal availableFeeBalance) {
    }
    
    @java.lang.Override()
    public void setInputType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.SendModule.InputType inputType) {
    }
    
    @java.lang.Override()
    public void setBalance(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal balance) {
    }
    
    @java.lang.Override()
    public void setRate(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal rate) {
    }
    
    @java.lang.Override()
    public void setAmountInfo(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountInfo sendAmountInfo) {
    }
    
    @java.lang.Override()
    public void onViewDidLoad() {
    }
    
    @java.lang.Override()
    public void onClickFeeRatePriority() {
    }
    
    @java.lang.Override()
    public void onChangeFeeRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.FeeRatePriority feeRatePriority) {
    }
    
    @java.lang.Override()
    public void onChangeFeeRateValue(int value) {
    }
    
    @java.lang.Override()
    public void didUpdate(@org.jetbrains.annotations.NotNull()
    java.math.BigInteger feeRate, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.FeeRatePriority feeRatePriority) {
    }
    
    @java.lang.Override()
    public void didReceiveError(@org.jetbrains.annotations.NotNull()
    java.lang.Exception error) {
    }
    
    @java.lang.Override()
    public void didUpdateExchangeRate(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal rate) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IView getView() {
        return null;
    }
    
    public SendFeePresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IView view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeePresenterHelper helper, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin baseCoin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency baseCurrency, @org.jetbrains.annotations.Nullable()
    kotlin.Pair<io.horizontalsystems.coinkit2.models.Coin, java.lang.String> feeCoinData, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.submodules.fee.CustomPriorityUnit customPriorityUnit, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.fee.FeeRateAdjustmentHelper feeRateAdjustmentHelper) {
        super();
    }
}