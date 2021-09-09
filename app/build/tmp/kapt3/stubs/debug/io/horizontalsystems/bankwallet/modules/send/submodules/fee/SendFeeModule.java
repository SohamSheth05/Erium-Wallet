package io.horizontalsystems.bankwallet.modules.send.submodules.fee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule;", "", "()V", "Factory", "FeeRateInfoViewItem", "IFeeModule", "IFeeModuleDelegate", "IInteractor", "IInteractorDelegate", "IView", "IViewDelegate", "InsufficientFeeBalance", "app_debug"})
public final class SendFeeModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule INSTANCE = null;
    
    private SendFeeModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00060\u0001j\u0002`\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$InsufficientFeeBalance;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "coinProtocol", "", "feeCoin", "fee", "Lio/horizontalsystems/bankwallet/entities/CoinValue;", "(Lio/horizontalsystems/coinkit2/models/Coin;Ljava/lang/String;Lio/horizontalsystems/coinkit2/models/Coin;Lio/horizontalsystems/bankwallet/entities/CoinValue;)V", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "getCoinProtocol", "()Ljava/lang/String;", "getFee", "()Lio/horizontalsystems/bankwallet/entities/CoinValue;", "getFeeCoin", "app_debug"})
    public static final class InsufficientFeeBalance extends java.lang.Exception {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.coinkit2.models.Coin coin = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String coinProtocol = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.coinkit2.models.Coin feeCoin = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.entities.CoinValue fee = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin getCoin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCoinProtocol() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin getFeeCoin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.CoinValue getFee() {
            return null;
        }
        
        public InsufficientFeeBalance(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        java.lang.String coinProtocol, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin feeCoin, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.CoinValue fee) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0018\u0010\r\u001a\u00020\u00032\u000e\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H&J\u001a\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0005H&J\u0012\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\fH&J\u0012\u0010\u001f\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\fH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0005H&J\u0016\u0010\"\u001a\u00020\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0005H&\u00a8\u0006\'"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IView;", "", "setAdjustableFeeVisible", "", "visible", "", "setCustomFeeParams", "value", "", "range", "Lkotlin/ranges/IntRange;", "label", "", "setError", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "setFee", "fee", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "convertedFee", "setFeePriority", "priority", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "setInsufficientFeeBalanceError", "insufficientFeeBalance", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$InsufficientFeeBalance;", "setLoading", "loading", "setPrimaryFee", "feeAmount", "setSecondaryFee", "showCustomFeePriority", "show", "showFeeRatePrioritySelector", "feeRates", "", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$FeeRateInfoViewItem;", "showLowFeeWarning", "app_debug"})
    public static abstract interface IView {
        
        public abstract void setAdjustableFeeVisible(boolean visible);
        
        public abstract void setPrimaryFee(@org.jetbrains.annotations.Nullable()
        java.lang.String feeAmount);
        
        public abstract void setSecondaryFee(@org.jetbrains.annotations.Nullable()
        java.lang.String feeAmount);
        
        public abstract void setInsufficientFeeBalanceError(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.InsufficientFeeBalance insufficientFeeBalance);
        
        public abstract void setFeePriority(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.FeeRatePriority priority);
        
        public abstract void showFeeRatePrioritySelector(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.FeeRateInfoViewItem> feeRates);
        
        public abstract void showCustomFeePriority(boolean show);
        
        public abstract void setCustomFeeParams(int value, @org.jetbrains.annotations.NotNull()
        kotlin.ranges.IntRange range, @org.jetbrains.annotations.Nullable()
        java.lang.String label);
        
        public abstract void setLoading(boolean loading);
        
        public abstract void setFee(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo fee, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo convertedFee);
        
        public abstract void setError(@org.jetbrains.annotations.Nullable()
        java.lang.Exception error);
        
        public abstract void showLowFeeWarning(boolean show);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IViewDelegate;", "", "onChangeFeeRate", "", "feeRatePriority", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "onChangeFeeRateValue", "value", "", "onClickFeeRatePriority", "onViewDidLoad", "app_debug"})
    public static abstract interface IViewDelegate {
        
        public abstract void onViewDidLoad();
        
        public abstract void onChangeFeeRate(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.FeeRatePriority feeRatePriority);
        
        public abstract void onChangeFeeRateValue(int value);
        
        public abstract void onClickFeeRatePriority();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IInteractor;", "", "defaultFeeRatePriority", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "getDefaultFeeRatePriority", "()Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "feeRatePriorityList", "", "getFeeRatePriorityList", "()Ljava/util/List;", "getRate", "Ljava/math/BigDecimal;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "onClear", "", "syncFeeRate", "feeRatePriority", "app_debug"})
    public static abstract interface IInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<io.horizontalsystems.bankwallet.core.FeeRatePriority> getFeeRatePriorityList();
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.horizontalsystems.bankwallet.core.FeeRatePriority getDefaultFeeRatePriority();
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.math.BigDecimal getRate(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.CoinType coinType);
        
        public abstract void syncFeeRate(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.FeeRatePriority feeRatePriority);
        
        public abstract void onClear();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IInteractorDelegate;", "", "didReceiveError", "", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "didUpdate", "feeRate", "Ljava/math/BigInteger;", "feeRatePriority", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "didUpdateExchangeRate", "rate", "Ljava/math/BigDecimal;", "app_debug"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void didUpdate(@org.jetbrains.annotations.NotNull()
        java.math.BigInteger feeRate, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.FeeRatePriority feeRatePriority);
        
        public abstract void didReceiveError(@org.jetbrains.annotations.NotNull()
        java.lang.Exception error);
        
        public abstract void didUpdateExchangeRate(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal rate);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001aH&J\u0018\u0010\u001d\u001a\u00020\u00142\u000e\u0010\u001e\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` H&J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u001aH&J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H&J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020\u000bH&J\u0012\u0010(\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010\u001aH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006*"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;", "", "feeRate", "", "getFeeRate", "()Ljava/lang/Long;", "feeRateState", "Lio/horizontalsystems/bankwallet/entities/FeeRateState;", "getFeeRateState", "()Lio/horizontalsystems/bankwallet/entities/FeeRateState;", "isValid", "", "()Z", "primaryAmountInfo", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "getPrimaryAmountInfo", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "secondaryAmountInfo", "getSecondaryAmountInfo", "fetchFeeRate", "", "setAmountInfo", "sendAmountInfo", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo;", "setAvailableFeeBalance", "availableFeeBalance", "Ljava/math/BigDecimal;", "setBalance", "balance", "setError", "externalError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "setFee", "fee", "setInputType", "inputType", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;", "setLoading", "loading", "setRate", "rate", "app_debug"})
    public static abstract interface IFeeModule {
        
        public abstract boolean isValid();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.entities.FeeRateState getFeeRateState();
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Long getFeeRate();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getPrimaryAmountInfo();
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getSecondaryAmountInfo();
        
        public abstract void setLoading(boolean loading);
        
        public abstract void setFee(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal fee);
        
        public abstract void setError(@org.jetbrains.annotations.Nullable()
        java.lang.Exception externalError);
        
        public abstract void setAvailableFeeBalance(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal availableFeeBalance);
        
        public abstract void setInputType(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.InputType inputType);
        
        public abstract void fetchFeeRate();
        
        public abstract void setBalance(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal balance);
        
        public abstract void setRate(@org.jetbrains.annotations.Nullable()
        java.math.BigDecimal rate);
        
        public abstract void setAmountInfo(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountInfo sendAmountInfo);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;", "", "onUpdateFeeRate", "", "app_debug"})
    public static abstract interface IFeeModuleDelegate {
        
        public abstract void onUpdateFeeRate();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$FeeRateInfoViewItem;", "", "feeRatePriority", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "selected", "", "(Lio/horizontalsystems/bankwallet/core/FeeRatePriority;Z)V", "getFeeRatePriority", "()Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "getSelected", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class FeeRateInfoViewItem {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.core.FeeRatePriority feeRatePriority = null;
        private final boolean selected = false;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.FeeRatePriority getFeeRatePriority() {
            return null;
        }
        
        public final boolean getSelected() {
            return false;
        }
        
        public FeeRateInfoViewItem(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.FeeRatePriority feeRatePriority, boolean selected) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.FeeRatePriority component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.FeeRateInfoViewItem copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.FeeRatePriority feeRatePriority, boolean selected) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "sendHandler", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;", "feeModuleDelegate", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;", "customPriorityUnit", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/CustomPriorityUnit;", "(Lio/horizontalsystems/coinkit2/models/Coin;Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/CustomPriorityUnit;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final io.horizontalsystems.coinkit2.models.Coin coin = null;
        private final io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler sendHandler = null;
        private final io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate feeModuleDelegate = null;
        private final io.horizontalsystems.bankwallet.modules.send.submodules.fee.CustomPriorityUnit customPriorityUnit = null;
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler sendHandler, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate feeModuleDelegate, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.send.submodules.fee.CustomPriorityUnit customPriorityUnit) {
            super();
        }
    }
}