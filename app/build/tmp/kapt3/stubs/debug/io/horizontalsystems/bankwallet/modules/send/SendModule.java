package io.horizontalsystems.bankwallet.modules.send;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0019\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule;", "", "()V", "AmountData", "AmountInfo", "Factory", "IRouter", "ISendBinanceInteractor", "ISendBitcoinInteractor", "ISendBitcoinInteractorDelegate", "ISendDashInteractor", "ISendDashInteractorDelegate", "ISendEthereumInteractor", "ISendHandler", "ISendHandlerDelegate", "ISendInteractor", "ISendInteractorDelegate", "ISendZcashInteractor", "IView", "IViewDelegate", "Input", "InputType", "SendConfirmationAmountViewItem", "SendConfirmationFeeViewItem", "SendConfirmationLockTimeViewItem", "SendConfirmationMemoViewItem", "SendConfirmationTotalViewItem", "SendConfirmationViewItem", "app_debug"})
public final class SendModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.send.SendModule INSTANCE = null;
    
    private SendModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0016\u0010\u0010\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$IView;", "", "delegate", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$IViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$IViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$IViewDelegate;)V", "loadInputItems", "", "inputs", "", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input;", "setSendButtonEnabled", "actionState", "Lio/horizontalsystems/bankwallet/modules/send/SendPresenter$ActionState;", "showConfirmation", "confirmationViewItems", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$SendConfirmationViewItem;", "showErrorInToast", "error", "", "app_debug"})
    public static abstract interface IView {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.modules.send.SendModule.IViewDelegate getDelegate();
        
        public abstract void setDelegate(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.IViewDelegate p0);
        
        public abstract void loadInputItems(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends io.horizontalsystems.bankwallet.modules.send.SendModule.Input> inputs);
        
        public abstract void setSendButtonEnabled(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendPresenter.ActionState actionState);
        
        public abstract void showConfirmation(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationViewItem> confirmationViewItems);
        
        public abstract void showErrorInToast(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\rH&J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$IViewDelegate;", "", "handler", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;", "getHandler", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;", "view", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$IView;", "getView", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$IView;", "setView", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$IView;)V", "onClear", "", "onModulesDidLoad", "onProceedClicked", "onSendConfirmed", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "onViewDidLoad", "app_debug"})
    public static abstract interface IViewDelegate {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.modules.send.SendModule.IView getView();
        
        public abstract void setView(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.IView p0);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler getHandler();
        
        public abstract void onViewDidLoad();
        
        public abstract void onModulesDidLoad();
        
        public abstract void onProceedClicked();
        
        public abstract void onSendConfirmed(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.AppLogger logger);
        
        public abstract void onClear();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\t\u001a\u00020\nH&J0\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011H&J8\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011H&J\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H&J\u0012\u0010\u0017\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&JD\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00112\u0006\u0010\u001a\u001a\u00020\u001bH&J&\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\b\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendBitcoinInteractor;", "", "balance", "Ljava/math/BigDecimal;", "getBalance", "()Ljava/math/BigDecimal;", "isLockTimeEnabled", "", "()Z", "clear", "", "fetchAvailableBalance", "feeRate", "", "address", "", "pluginData", "", "", "Lio/horizontalsystems/bitcoincore/core/IPluginData;", "fetchFee", "amount", "fetchMaximumAmount", "fetchMinimumAmount", "send", "Lio/reactivex/Single;", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "validate", "app_debug"})
    public static abstract interface ISendBitcoinInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal getBalance();
        
        public abstract boolean isLockTimeEnabled();
        
        public abstract void fetchAvailableBalance(long feeRate, @org.jetbrains.annotations.Nullable()
        java.lang.String address, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal fetchMinimumAmount(@org.jetbrains.annotations.Nullable()
        java.lang.String address);
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.math.BigDecimal fetchMaximumAmount(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData);
        
        public abstract void fetchFee(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount, long feeRate, @org.jetbrains.annotations.Nullable()
        java.lang.String address, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData);
        
        public abstract void validate(@org.jetbrains.annotations.NotNull()
        java.lang.String address, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
        java.lang.String address, long feeRate, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.AppLogger logger);
        
        public abstract void clear();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendBitcoinInteractorDelegate;", "", "didFetchAvailableBalance", "", "availableBalance", "Ljava/math/BigDecimal;", "didFetchFee", "fee", "app_debug"})
    public static abstract interface ISendBitcoinInteractorDelegate {
        
        public abstract void didFetchAvailableBalance(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal availableBalance);
        
        public abstract void didFetchFee(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal fee);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendDashInteractor;", "", "clear", "", "fetchAvailableBalance", "address", "", "fetchFee", "amount", "Ljava/math/BigDecimal;", "fetchMinimumAmount", "send", "Lio/reactivex/Single;", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "validate", "app_debug"})
    public static abstract interface ISendDashInteractor {
        
        public abstract void fetchAvailableBalance(@org.jetbrains.annotations.Nullable()
        java.lang.String address);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal fetchMinimumAmount(@org.jetbrains.annotations.Nullable()
        java.lang.String address);
        
        public abstract void fetchFee(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable()
        java.lang.String address);
        
        public abstract void validate(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
        java.lang.String address, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.AppLogger logger);
        
        public abstract void clear();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendDashInteractorDelegate;", "", "didFetchAvailableBalance", "", "availableBalance", "Ljava/math/BigDecimal;", "didFetchFee", "fee", "app_debug"})
    public static abstract interface ISendDashInteractorDelegate {
        
        public abstract void didFetchAvailableBalance(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal availableBalance);
        
        public abstract void didFetchFee(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal fee);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH&J/\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&\u00a2\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH&J6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0013H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005\u00a8\u0006\u001e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendEthereumInteractor;", "", "balance", "Ljava/math/BigDecimal;", "getBalance", "()Ljava/math/BigDecimal;", "ethereumBalance", "getEthereumBalance", "minimumAmount", "getMinimumAmount", "minimumRequiredBalance", "getMinimumRequiredBalance", "availableBalance", "gasPrice", "", "gasLimit", "estimateGasLimit", "Lio/reactivex/Single;", "toAddress", "", "value", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;)Lio/reactivex/Single;", "fee", "send", "", "amount", "address", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "validate", "app_debug"})
    public static abstract interface ISendEthereumInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal getBalance();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal getEthereumBalance();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal getMinimumRequiredBalance();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal getMinimumAmount();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal availableBalance(long gasPrice, long gasLimit);
        
        public abstract void validate(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal fee(long gasPrice, long gasLimit);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
        java.lang.String address, long gasPrice, long gasLimit, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.AppLogger logger);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Single<java.lang.Long> estimateGasLimit(@org.jetbrains.annotations.Nullable()
        java.lang.String toAddress, @org.jetbrains.annotations.NotNull()
        java.math.BigDecimal value, @org.jetbrains.annotations.Nullable()
        java.lang.Long gasPrice);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendBinanceInteractor;", "", "availableBalance", "Ljava/math/BigDecimal;", "getAvailableBalance", "()Ljava/math/BigDecimal;", "availableBinanceBalance", "getAvailableBinanceBalance", "fee", "getFee", "send", "Lio/reactivex/Single;", "", "amount", "address", "", "memo", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "validate", "app_debug"})
    public static abstract interface ISendBinanceInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal getAvailableBalance();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal getAvailableBinanceBalance();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal getFee();
        
        public abstract void validate(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
        java.lang.String address, @org.jetbrains.annotations.Nullable()
        java.lang.String memo, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.AppLogger logger);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendZcashInteractor;", "", "availableBalance", "Ljava/math/BigDecimal;", "getAvailableBalance", "()Ljava/math/BigDecimal;", "fee", "getFee", "send", "Lio/reactivex/Single;", "", "amount", "address", "", "memo", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "validate", "app_debug"})
    public static abstract interface ISendZcashInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal getAvailableBalance();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal getFee();
        
        public abstract void validate(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
        java.lang.String address, @org.jetbrains.annotations.Nullable()
        java.lang.String memo, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.AppLogger logger);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$IRouter;", "", "closeWithSuccess", "", "app_debug"})
    public static abstract interface IRouter {
        
        public abstract void closeWithSuccess();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\u001e\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\r\u001a\u00020\u000eH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendInteractor;", "", "delegate", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendInteractorDelegate;)V", "clear", "", "send", "sendSingle", "Lio/reactivex/Single;", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "app_debug"})
    public static abstract interface ISendInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.modules.send.SendModule.ISendInteractorDelegate getDelegate();
        
        public abstract void setDelegate(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.ISendInteractorDelegate p0);
        
        public abstract void send(@org.jetbrains.annotations.NotNull()
        io.reactivex.Single<kotlin.Unit> sendSingle, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.AppLogger logger);
        
        public abstract void clear();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendInteractorDelegate;", "", "didFailToSend", "", "error", "", "didSend", "sync", "app_debug"})
    public static abstract interface ISendInteractorDelegate {
        
        public abstract void sync();
        
        public abstract void didSend();
        
        public abstract void didFailToSend(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020,0!H&J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020.H&J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020.012\u0006\u00102\u001a\u000203H&J\b\u00104\u001a\u00020.H&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\u0015X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u0018\u0010%\u001a\u00020&X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*\u00a8\u00065"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;", "", "addressModule", "Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModule;", "getAddressModule", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModule;", "setAddressModule", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModule;)V", "amountModule", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IAmountModule;", "getAmountModule", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IAmountModule;", "setAmountModule", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IAmountModule;)V", "delegate", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandlerDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandlerDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandlerDelegate;)V", "feeModule", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;", "getFeeModule", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;", "setFeeModule", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;)V", "hodlerModule", "Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModule;", "getHodlerModule", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModule;", "setHodlerModule", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModule;)V", "inputItems", "", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input;", "getInputItems", "()Ljava/util/List;", "memoModule", "Lio/horizontalsystems/bankwallet/modules/send/submodules/memo/SendMemoModule$IMemoModule;", "getMemoModule", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/memo/SendMemoModule$IMemoModule;", "setMemoModule", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/memo/SendMemoModule$IMemoModule;)V", "confirmationViewItems", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$SendConfirmationViewItem;", "onClear", "", "onModulesDidLoad", "sendSingle", "Lio/reactivex/Single;", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "sync", "app_debug"})
    public static abstract interface ISendHandler {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IAmountModule getAmountModule();
        
        public abstract void setAmountModule(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IAmountModule p0);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IAddressModule getAddressModule();
        
        public abstract void setAddressModule(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IAddressModule p0);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IFeeModule getFeeModule();
        
        public abstract void setFeeModule(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IFeeModule p0);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.modules.send.submodules.memo.SendMemoModule.IMemoModule getMemoModule();
        
        public abstract void setMemoModule(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.submodules.memo.SendMemoModule.IMemoModule p0);
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IHodlerModule getHodlerModule();
        
        public abstract void setHodlerModule(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IHodlerModule p0);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<io.horizontalsystems.bankwallet.modules.send.SendModule.Input> getInputItems();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandlerDelegate getDelegate();
        
        public abstract void setDelegate(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandlerDelegate p0);
        
        public abstract void sync();
        
        public abstract void onModulesDidLoad();
        
        public abstract void onClear();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationViewItem> confirmationViewItems();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Single<kotlin.Unit> sendSingle(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.AppLogger logger);
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            public static void onClear(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandlerDelegate;", "", "onChange", "", "isValid", "", "amountError", "", "addressError", "app_debug"})
    public static abstract interface ISendHandlerDelegate {
        
        public abstract void onChange(boolean isValid, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable amountError, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable addressError);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$SendConfirmationViewItem;", "", "()V", "app_debug"})
    public static abstract class SendConfirmationViewItem {
        
        public SendConfirmationViewItem() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$SendConfirmationAmountViewItem;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$SendConfirmationViewItem;", "primaryInfo", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "secondaryInfo", "receiver", "Lio/horizontalsystems/bankwallet/entities/Address;", "locked", "", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;Lio/horizontalsystems/bankwallet/entities/Address;Z)V", "getLocked", "()Z", "getPrimaryInfo", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "getReceiver", "()Lio/horizontalsystems/bankwallet/entities/Address;", "getSecondaryInfo", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class SendConfirmationAmountViewItem extends io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationViewItem {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primaryInfo = null;
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryInfo = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.entities.Address receiver = null;
        private final boolean locked = false;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getPrimaryInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getSecondaryInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.Address getReceiver() {
            return null;
        }
        
        public final boolean getLocked() {
            return false;
        }
        
        public SendConfirmationAmountViewItem(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primaryInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryInfo, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Address receiver, boolean locked) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.Address component3() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationAmountViewItem copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primaryInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryInfo, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Address receiver, boolean locked) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$SendConfirmationFeeViewItem;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$SendConfirmationViewItem;", "primaryInfo", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "secondaryInfo", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;)V", "getPrimaryInfo", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "getSecondaryInfo", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class SendConfirmationFeeViewItem extends io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationViewItem {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primaryInfo = null;
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryInfo = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getPrimaryInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getSecondaryInfo() {
            return null;
        }
        
        public SendConfirmationFeeViewItem(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primaryInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryInfo) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationFeeViewItem copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primaryInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryInfo) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$SendConfirmationTotalViewItem;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$SendConfirmationViewItem;", "primaryInfo", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "secondaryInfo", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;)V", "getPrimaryInfo", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "getSecondaryInfo", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class SendConfirmationTotalViewItem extends io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationViewItem {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primaryInfo = null;
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryInfo = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getPrimaryInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getSecondaryInfo() {
            return null;
        }
        
        public SendConfirmationTotalViewItem(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primaryInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryInfo) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationTotalViewItem copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primaryInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryInfo) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$SendConfirmationMemoViewItem;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$SendConfirmationViewItem;", "memo", "", "(Ljava/lang/String;)V", "getMemo", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class SendConfirmationMemoViewItem extends io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationViewItem {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String memo = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMemo() {
            return null;
        }
        
        public SendConfirmationMemoViewItem(@org.jetbrains.annotations.Nullable()
        java.lang.String memo) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationMemoViewItem copy(@org.jetbrains.annotations.Nullable()
        java.lang.String memo) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$SendConfirmationLockTimeViewItem;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$SendConfirmationViewItem;", "lockTimeInterval", "Lio/horizontalsystems/hodler/LockTimeInterval;", "(Lio/horizontalsystems/hodler/LockTimeInterval;)V", "getLockTimeInterval", "()Lio/horizontalsystems/hodler/LockTimeInterval;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class SendConfirmationLockTimeViewItem extends io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationViewItem {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.hodler.LockTimeInterval lockTimeInterval = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.hodler.LockTimeInterval getLockTimeInterval() {
            return null;
        }
        
        public SendConfirmationLockTimeViewItem(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.hodler.LockTimeInterval lockTimeInterval) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.hodler.LockTimeInterval component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.SendConfirmationLockTimeViewItem copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.hodler.LockTimeInterval lockTimeInterval) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "(Lio/horizontalsystems/bankwallet/entities/Wallet;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final io.horizontalsystems.bankwallet.entities.Wallet wallet = null;
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0000j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;", "", "(Ljava/lang/String;I)V", "reversed", "COIN", "CURRENCY", "app_debug"})
    public static enum InputType {
        /*public static final*/ COIN /* = new COIN() */,
        /*public static final*/ CURRENCY /* = new CURRENCY() */;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.InputType reversed() {
            return null;
        }
        
        InputType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input;", "", "()V", "Address", "Amount", "Fee", "Hodler", "Memo", "ProceedButton", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input$Amount;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input$Address;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input$Fee;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input$Memo;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input$ProceedButton;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input$Hodler;", "app_debug"})
    public static abstract class Input {
        
        private Input() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input$Amount;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input;", "()V", "app_debug"})
        public static final class Amount extends io.horizontalsystems.bankwallet.modules.send.SendModule.Input {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.send.SendModule.Input.Amount INSTANCE = null;
            
            private Amount() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input$Address;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input;", "editable", "", "(Z)V", "getEditable", "()Z", "app_debug"})
        public static final class Address extends io.horizontalsystems.bankwallet.modules.send.SendModule.Input {
            private final boolean editable = false;
            
            public final boolean getEditable() {
                return false;
            }
            
            public Address(boolean editable) {
                super();
            }
            
            public Address() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input$Fee;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input;", "()V", "app_debug"})
        public static final class Fee extends io.horizontalsystems.bankwallet.modules.send.SendModule.Input {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.send.SendModule.Input.Fee INSTANCE = null;
            
            private Fee() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input$Memo;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input;", "maxLength", "", "(I)V", "getMaxLength", "()I", "app_debug"})
        public static final class Memo extends io.horizontalsystems.bankwallet.modules.send.SendModule.Input {
            private final int maxLength = 0;
            
            public final int getMaxLength() {
                return 0;
            }
            
            public Memo(int maxLength) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input$ProceedButton;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input;", "()V", "app_debug"})
        public static final class ProceedButton extends io.horizontalsystems.bankwallet.modules.send.SendModule.Input {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.send.SendModule.Input.ProceedButton INSTANCE = null;
            
            private ProceedButton() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input$Hodler;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$Input;", "()V", "app_debug"})
        public static final class Hodler extends io.horizontalsystems.bankwallet.modules.send.SendModule.Input {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.send.SendModule.Input.Hodler INSTANCE = null;
            
            private Hodler() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountData;", "", "primary", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "secondary", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;)V", "getPrimary", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "getSecondary", "component1", "component2", "copy", "equals", "", "other", "getFormatted", "", "hashCode", "", "toString", "app_debug"})
    public static final class AmountData {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primary = null;
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondary = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFormatted() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getPrimary() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getSecondary() {
            return null;
        }
        
        public AmountData(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primary, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondary) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountData copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primary, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondary) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u0012\u0013\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "", "()V", "decimal", "", "getDecimal", "()I", "value", "Ljava/math/BigDecimal;", "getValue", "()Ljava/math/BigDecimal;", "getAmountName", "", "getFormatted", "getFormattedForTxInfo", "getFormattedPlain", "CoinValueInfo", "CurrencyValueInfo", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo$CoinValueInfo;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo$CurrencyValueInfo;", "app_debug"})
    public static abstract class AmountInfo {
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal getValue() {
            return null;
        }
        
        public final int getDecimal() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAmountName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFormatted() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFormattedPlain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFormattedForTxInfo() {
            return null;
        }
        
        private AmountInfo() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo$CoinValueInfo;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "coinValue", "Lio/horizontalsystems/bankwallet/entities/CoinValue;", "(Lio/horizontalsystems/bankwallet/entities/CoinValue;)V", "getCoinValue", "()Lio/horizontalsystems/bankwallet/entities/CoinValue;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class CoinValueInfo extends io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.bankwallet.entities.CoinValue coinValue = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.entities.CoinValue getCoinValue() {
                return null;
            }
            
            public CoinValueInfo(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.entities.CoinValue coinValue) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.entities.CoinValue component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo.CoinValueInfo copy(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.entities.CoinValue coinValue) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo$CurrencyValueInfo;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "currencyValue", "Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "(Lio/horizontalsystems/bankwallet/entities/CurrencyValue;)V", "getCurrencyValue", "()Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class CurrencyValueInfo extends io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.bankwallet.entities.CurrencyValue currencyValue = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.entities.CurrencyValue getCurrencyValue() {
                return null;
            }
            
            public CurrencyValueInfo(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.entities.CurrencyValue currencyValue) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.entities.CurrencyValue component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo.CurrencyValueInfo copy(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.entities.CurrencyValue currencyValue) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
}