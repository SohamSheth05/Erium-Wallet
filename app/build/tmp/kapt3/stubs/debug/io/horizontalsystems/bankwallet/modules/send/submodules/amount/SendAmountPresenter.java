package io.horizontalsystems.bankwallet.modules.send.submodules.amount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B-\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0012\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u00020\u0011H\u0002J\u0010\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0011H\u0016J\u0010\u0010@\u001a\u00020A2\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0010\u0010B\u001a\u00020>2\u0006\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020>H\u0014J\b\u0010F\u001a\u00020>H\u0016J\b\u0010G\u001a\u00020>H\u0016J\b\u0010H\u001a\u00020>H\u0016J\b\u0010I\u001a\u00020;H\u0016J\n\u0010J\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010K\u001a\u00020>2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010L\u001a\u00020>2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010M\u001a\u00020>2\u0006\u0010N\u001a\u000203H\u0016J\u0012\u0010O\u001a\u00020>2\b\u0010#\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010P\u001a\u00020>2\u0006\u0010$\u001a\u00020\u0011H\u0016J\u0010\u0010Q\u001a\u00020>2\u0006\u0010%\u001a\u00020\u0011H\u0016J\b\u0010R\u001a\u00020>H\u0002J\b\u0010S\u001a\u00020>H\u0002J\b\u0010T\u001a\u00020>H\u0002J\b\u0010U\u001a\u00020>H\u0002J\b\u0010V\u001a\u00020>H\u0002J\u0012\u0010W\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010X\u001a\u00020>H\u0002J\b\u0010Y\u001a\u00020\u0011H\u0016J\b\u0010Z\u001a\u00020>H\u0002J\b\u0010[\u001a\u00020>H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u00020-X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u00010\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0019\"\u0004\b8\u00109\u00a8\u0006\\"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountPresenter;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IViewDelegate;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IInteractorDelegate;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IAmountModule;", "view", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IView;", "interactor", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IInteractor;", "presenterHelper", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountPresenterHelper;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "baseCurrency", "Lio/horizontalsystems/core/entities/Currency;", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IView;Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IInteractor;Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountPresenterHelper;Lio/horizontalsystems/coinkit2/models/Coin;Lio/horizontalsystems/core/entities/Currency;)V", "amount", "Ljava/math/BigDecimal;", "availableBalance", "coinAmount", "Lio/horizontalsystems/bankwallet/entities/CoinValue;", "getCoinAmount", "()Lio/horizontalsystems/bankwallet/entities/CoinValue;", "currentAmount", "getCurrentAmount", "()Ljava/math/BigDecimal;", "fiatAmount", "Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "getFiatAmount", "()Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "<set-?>", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;", "inputType", "getInputType", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;", "maximumAmount", "minimumAmount", "minimumRequiredBalance", "moduleDelegate", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;", "getModuleDelegate", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;", "setModuleDelegate", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;)V", "sendAmountInfo", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo;", "getSendAmountInfo", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo;", "setSendAmountInfo", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo;)V", "switchAvailable", "", "getView", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IView;", "xRate", "getXRate", "setXRate", "(Ljava/math/BigDecimal;)V", "amountInfo", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "coinValue", "didUpdateRate", "", "rate", "getAmountType", "Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService$AmountType;", "onAmountChange", "amountString", "", "onCleared", "onMaxClick", "onSwitchClick", "onViewDidLoad", "primaryAmountInfo", "secondaryAmountInfo", "setAmount", "setAvailableBalance", "setLoading", "loading", "setMaximumAmount", "setMinimumAmount", "setMinimumRequiredBalance", "syncAmount", "syncAvailableBalance", "syncError", "syncHint", "syncMaxButton", "syncXRate", "updateInputFields", "validAmount", "validate", "willEnterForeground", "app_debug"})
public final class SendAmountPresenter extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IViewDelegate, io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IInteractorDelegate, io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IAmountModule {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IAmountModuleDelegate moduleDelegate;
    private java.math.BigDecimal amount;
    private java.math.BigDecimal availableBalance;
    private java.math.BigDecimal minimumAmount;
    private java.math.BigDecimal maximumAmount;
    private java.math.BigDecimal minimumRequiredBalance;
    private boolean switchAvailable = false;
    @org.jetbrains.annotations.Nullable()
    private java.math.BigDecimal xRate;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountInfo sendAmountInfo;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.send.SendModule.InputType inputType = io.horizontalsystems.bankwallet.modules.send.SendModule.InputType.COIN;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IView view = null;
    private final io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IInteractor interactor = null;
    private final io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountPresenterHelper presenterHelper = null;
    private final io.horizontalsystems.coinkit2.models.Coin coin = null;
    private final io.horizontalsystems.core.entities.Currency baseCurrency = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IAmountModuleDelegate getModuleDelegate() {
        return null;
    }
    
    public final void setModuleDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IAmountModuleDelegate p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.math.BigDecimal getXRate() {
        return null;
    }
    
    public void setXRate(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountInfo getSendAmountInfo() {
        return null;
    }
    
    public void setSendAmountInfo(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountInfo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.SendModule.InputType getInputType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.CoinValue getCoinAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.CurrencyValue getFiatAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getCurrentAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primaryAmountInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryAmountInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal validAmount() {
        return null;
    }
    
    @java.lang.Override()
    public void setLoading(boolean loading) {
    }
    
    @java.lang.Override()
    public void setAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount) {
    }
    
    @java.lang.Override()
    public void setAvailableBalance(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal availableBalance) {
    }
    
    @java.lang.Override()
    public void setMinimumAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal minimumAmount) {
    }
    
    @java.lang.Override()
    public void setMaximumAmount(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal maximumAmount) {
    }
    
    @java.lang.Override()
    public void setMinimumRequiredBalance(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal minimumRequiredBalance) {
    }
    
    @java.lang.Override()
    public void onViewDidLoad() {
    }
    
    @java.lang.Override()
    public void onSwitchClick() {
    }
    
    @java.lang.Override()
    public void onAmountChange(@org.jetbrains.annotations.NotNull()
    java.lang.String amountString) {
    }
    
    @java.lang.Override()
    public void onMaxClick() {
    }
    
    @java.lang.Override()
    public void didUpdateRate(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal rate) {
    }
    
    @java.lang.Override()
    public void willEnterForeground() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void syncXRate(java.math.BigDecimal rate) {
    }
    
    private final void syncAmount() {
    }
    
    private final void syncAvailableBalance() {
    }
    
    private final void syncHint() {
    }
    
    private final void syncMaxButton() {
    }
    
    private final void validate() {
    }
    
    private final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo amountInfo(java.math.BigDecimal coinValue) {
        return null;
    }
    
    private final void syncError() {
    }
    
    private final void updateInputFields() {
    }
    
    private final io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.AmountType getAmountType(io.horizontalsystems.bankwallet.modules.send.SendModule.InputType inputType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IView getView() {
        return null;
    }
    
    public SendAmountPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IView view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountPresenterHelper presenterHelper, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency baseCurrency) {
        super();
    }
}