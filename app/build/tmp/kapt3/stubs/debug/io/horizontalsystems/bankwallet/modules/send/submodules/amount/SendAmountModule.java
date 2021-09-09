package io.horizontalsystems.bankwallet.modules.send.submodules.amount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule;", "", "()V", "Factory", "IAmountModule", "IAmountModuleDelegate", "IInteractor", "IInteractorDelegate", "IView", "IViewDelegate", "ValidationError", "app_debug"})
public final class SendAmountModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule INSTANCE = null;
    
    private SendAmountModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0010H&J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IView;", "", "revertAmount", "", "amount", "", "setAmount", "setAvailableBalance", "availableBalance", "setHint", "hint", "setInputFields", "inputParams", "Lio/horizontalsystems/bankwallet/ui/extensions/AmountInputView$InputParams;", "setLoading", "loading", "", "setMaxButtonVisible", "visible", "setValidationError", "error", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$ValidationError;", "app_debug"})
    public static abstract interface IView {
        
        public abstract void setLoading(boolean loading);
        
        public abstract void setAmount(@org.jetbrains.annotations.NotNull()
        java.lang.String amount);
        
        public abstract void setAvailableBalance(@org.jetbrains.annotations.NotNull()
        java.lang.String availableBalance);
        
        public abstract void setHint(@org.jetbrains.annotations.NotNull()
        java.lang.String hint);
        
        public abstract void setValidationError(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.ValidationError error);
        
        public abstract void revertAmount(@org.jetbrains.annotations.NotNull()
        java.lang.String amount);
        
        public abstract void setMaxButtonVisible(boolean visible);
        
        public abstract void setInputFields(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.ui.extensions.AmountInputView.InputParams inputParams);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IViewDelegate;", "", "onAmountChange", "", "amountString", "", "onMaxClick", "onSwitchClick", "onViewDidLoad", "app_debug"})
    public static abstract interface IViewDelegate {
        
        public abstract void onViewDidLoad();
        
        public abstract void onAmountChange(@org.jetbrains.annotations.NotNull()
        java.lang.String amountString);
        
        public abstract void onSwitchClick();
        
        public abstract void onMaxClick();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u000bH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IInteractor;", "", "defaultInputType", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;", "getDefaultInputType", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;", "setDefaultInputType", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;)V", "getRate", "Ljava/math/BigDecimal;", "onCleared", "", "app_debug"})
    public static abstract interface IInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.modules.send.SendModule.InputType getDefaultInputType();
        
        public abstract void setDefaultInputType(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.InputType p0);
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.math.BigDecimal getRate();
        
        public abstract void onCleared();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IInteractorDelegate;", "", "didUpdateRate", "", "rate", "Ljava/math/BigDecimal;", "willEnterForeground", "app_debug"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void didUpdateRate(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal rate);
        
        public abstract void willEnterForeground();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0018\u001a\u00020\u0019H&J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H&J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007H&J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0007H&J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H&J\u0012\u0010#\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0007H&J\u0010\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u0007H&J\b\u0010)\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\t\u00a8\u0006*"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IAmountModule;", "", "coinAmount", "Lio/horizontalsystems/bankwallet/entities/CoinValue;", "getCoinAmount", "()Lio/horizontalsystems/bankwallet/entities/CoinValue;", "currentAmount", "Ljava/math/BigDecimal;", "getCurrentAmount", "()Ljava/math/BigDecimal;", "fiatAmount", "Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "getFiatAmount", "()Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "inputType", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;", "getInputType", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;", "sendAmountInfo", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo;", "getSendAmountInfo", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo;", "xRate", "getXRate", "primaryAmountInfo", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "secondaryAmountInfo", "setAmount", "", "amount", "setAvailableBalance", "availableBalance", "setLoading", "loading", "", "setMaximumAmount", "maximumAmount", "setMinimumAmount", "minimumAmount", "setMinimumRequiredBalance", "minimumRequiredBalance", "validAmount", "app_debug"})
    public static abstract interface IAmountModule {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.math.BigDecimal getXRate();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountInfo getSendAmountInfo();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal getCurrentAmount();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.modules.send.SendModule.InputType getInputType();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.entities.CoinValue getCoinAmount();
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.horizontalsystems.bankwallet.entities.CurrencyValue getFiatAmount();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primaryAmountInfo();
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryAmountInfo();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal validAmount();
        
        public abstract void setLoading(boolean loading);
        
        public abstract void setAmount(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount);
        
        public abstract void setAvailableBalance(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal availableBalance);
        
        public abstract void setMinimumAmount(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal minimumAmount);
        
        public abstract void setMaximumAmount(@org.jetbrains.annotations.Nullable()
        java.math.BigDecimal maximumAmount);
        
        public abstract void setMinimumRequiredBalance(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal minimumRequiredBalance);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;", "", "onChangeAmount", "", "onChangeInputType", "inputType", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;", "onRateUpdated", "rate", "Ljava/math/BigDecimal;", "app_debug"})
    public static abstract interface IAmountModuleDelegate {
        
        public abstract void onChangeAmount();
        
        public abstract void onChangeInputType(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.InputType inputType);
        
        public abstract void onRateUpdated(@org.jetbrains.annotations.Nullable()
        java.math.BigDecimal rate);
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            public static void onRateUpdated(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IAmountModuleDelegate $this, @org.jetbrains.annotations.Nullable()
            java.math.BigDecimal rate) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u0004\u0005\u0006\u0007\bB\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$ValidationError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "EmptyValue", "InsufficientBalance", "MaxAmountLimit", "NotEnoughForMinimumRequiredBalance", "TooFewAmount", "app_debug"})
    public static class ValidationError extends java.lang.Exception {
        
        public ValidationError() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$ValidationError$EmptyValue;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$ValidationError;", "field", "", "(Ljava/lang/String;)V", "getField", "()Ljava/lang/String;", "app_debug"})
        public static final class EmptyValue extends io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.ValidationError {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String field = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getField() {
                return null;
            }
            
            public EmptyValue(@org.jetbrains.annotations.NotNull()
            java.lang.String field) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$ValidationError$InsufficientBalance;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$ValidationError;", "availableBalance", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;)V", "getAvailableBalance", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "app_debug"})
        public static final class InsufficientBalance extends io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.ValidationError {
            @org.jetbrains.annotations.Nullable()
            private final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo availableBalance = null;
            
            @org.jetbrains.annotations.Nullable()
            public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getAvailableBalance() {
                return null;
            }
            
            public InsufficientBalance(@org.jetbrains.annotations.Nullable()
            io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo availableBalance) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$ValidationError$NotEnoughForMinimumRequiredBalance;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$ValidationError;", "minimumRequiredBalance", "Lio/horizontalsystems/bankwallet/entities/CoinValue;", "(Lio/horizontalsystems/bankwallet/entities/CoinValue;)V", "getMinimumRequiredBalance", "()Lio/horizontalsystems/bankwallet/entities/CoinValue;", "app_debug"})
        public static final class NotEnoughForMinimumRequiredBalance extends io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.ValidationError {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.bankwallet.entities.CoinValue minimumRequiredBalance = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.entities.CoinValue getMinimumRequiredBalance() {
                return null;
            }
            
            public NotEnoughForMinimumRequiredBalance(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.entities.CoinValue minimumRequiredBalance) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$ValidationError$TooFewAmount;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$ValidationError;", "minimumAmount", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;)V", "getMinimumAmount", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "app_debug"})
        public static final class TooFewAmount extends io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.ValidationError {
            @org.jetbrains.annotations.Nullable()
            private final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo minimumAmount = null;
            
            @org.jetbrains.annotations.Nullable()
            public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getMinimumAmount() {
                return null;
            }
            
            public TooFewAmount(@org.jetbrains.annotations.Nullable()
            io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo minimumAmount) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$ValidationError$MaxAmountLimit;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$ValidationError;", "maximumAmount", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;)V", "getMaximumAmount", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "app_debug"})
        public static final class MaxAmountLimit extends io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.ValidationError {
            @org.jetbrains.annotations.Nullable()
            private final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo maximumAmount = null;
            
            @org.jetbrains.annotations.Nullable()
            public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getMaximumAmount() {
                return null;
            }
            
            public MaxAmountLimit(@org.jetbrains.annotations.Nullable()
            io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo maximumAmount) {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "sendHandler", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;", "(Lio/horizontalsystems/bankwallet/entities/Wallet;Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final io.horizontalsystems.bankwallet.entities.Wallet wallet = null;
        private final io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler sendHandler = null;
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler sendHandler) {
            super();
        }
    }
}