package io.horizontalsystems.bankwallet.modules.swap.tradeoptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService;", "", "InvalidSlippageType", "State", "TradeOptionsError", "app_debug"})
public abstract interface ISwapTradeOptionsService {
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$InvalidSlippageType;", "", "()V", "Higher", "Lower", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$InvalidSlippageType$Lower;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$InvalidSlippageType$Higher;", "app_debug"})
    public static abstract class InvalidSlippageType {
        
        private InvalidSlippageType() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$InvalidSlippageType$Lower;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$InvalidSlippageType;", "min", "Ljava/math/BigDecimal;", "(Ljava/math/BigDecimal;)V", "getMin", "()Ljava/math/BigDecimal;", "app_debug"})
        public static final class Lower extends io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.InvalidSlippageType {
            @org.jetbrains.annotations.NotNull()
            private final java.math.BigDecimal min = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.math.BigDecimal getMin() {
                return null;
            }
            
            public Lower(@org.jetbrains.annotations.NotNull()
            java.math.BigDecimal min) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$InvalidSlippageType$Higher;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$InvalidSlippageType;", "max", "Ljava/math/BigDecimal;", "(Ljava/math/BigDecimal;)V", "getMax", "()Ljava/math/BigDecimal;", "app_debug"})
        public static final class Higher extends io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.InvalidSlippageType {
            @org.jetbrains.annotations.NotNull()
            private final java.math.BigDecimal max = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.math.BigDecimal getMax() {
                return null;
            }
            
            public Higher(@org.jetbrains.annotations.NotNull()
            java.math.BigDecimal max) {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$TradeOptionsError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "InvalidAddress", "InvalidSlippage", "ZeroDeadline", "ZeroSlippage", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$TradeOptionsError$ZeroSlippage;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$TradeOptionsError$ZeroDeadline;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$TradeOptionsError$InvalidSlippage;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$TradeOptionsError$InvalidAddress;", "app_debug"})
    public static abstract class TradeOptionsError extends java.lang.Exception {
        
        private TradeOptionsError() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$TradeOptionsError$ZeroSlippage;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$TradeOptionsError;", "()V", "getLocalizedMessage", "", "app_debug"})
        public static final class ZeroSlippage extends io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.TradeOptionsError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.TradeOptionsError.ZeroSlippage INSTANCE = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getLocalizedMessage() {
                return null;
            }
            
            private ZeroSlippage() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$TradeOptionsError$ZeroDeadline;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$TradeOptionsError;", "()V", "getLocalizedMessage", "", "app_debug"})
        public static final class ZeroDeadline extends io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.TradeOptionsError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.TradeOptionsError.ZeroDeadline INSTANCE = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getLocalizedMessage() {
                return null;
            }
            
            private ZeroDeadline() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$TradeOptionsError$InvalidSlippage;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$TradeOptionsError;", "invalidSlippageType", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$InvalidSlippageType;", "(Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$InvalidSlippageType;)V", "getInvalidSlippageType", "()Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$InvalidSlippageType;", "getLocalizedMessage", "", "app_debug"})
        public static final class InvalidSlippage extends io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.TradeOptionsError {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.InvalidSlippageType invalidSlippageType = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getLocalizedMessage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.InvalidSlippageType getInvalidSlippageType() {
                return null;
            }
            
            public InvalidSlippage(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.InvalidSlippageType invalidSlippageType) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$TradeOptionsError$InvalidAddress;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$TradeOptionsError;", "()V", "getLocalizedMessage", "", "app_debug"})
        public static final class InvalidAddress extends io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.TradeOptionsError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.TradeOptionsError.InvalidAddress INSTANCE = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getLocalizedMessage() {
                return null;
            }
            
            private InvalidAddress() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$State;", "", "()V", "Invalid", "Valid", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$State$Valid;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$State$Invalid;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$State$Valid;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$State;", "tradeOptions", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptions;", "(Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptions;)V", "getTradeOptions", "()Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptions;", "app_debug"})
        public static final class Valid extends io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.State {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptions tradeOptions = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptions getTradeOptions() {
                return null;
            }
            
            public Valid(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptions tradeOptions) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$State$Invalid;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$State;", "()V", "app_debug"})
        public static final class Invalid extends io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.State.Invalid INSTANCE = null;
            
            private Invalid() {
                super();
            }
        }
    }
}