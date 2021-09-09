package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\u0013\b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u0082\u0001\u0003\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/core/EvmError;", "", "message", "", "(Ljava/lang/String;)V", "ExecutionReverted", "InsufficientBalanceWithFee", "RpcError", "Lio/horizontalsystems/bankwallet/core/EvmError$InsufficientBalanceWithFee;", "Lio/horizontalsystems/bankwallet/core/EvmError$ExecutionReverted;", "Lio/horizontalsystems/bankwallet/core/EvmError$RpcError;", "app_debug"})
public abstract class EvmError extends java.lang.Throwable {
    
    private EvmError(java.lang.String message) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/core/EvmError$InsufficientBalanceWithFee;", "Lio/horizontalsystems/bankwallet/core/EvmError;", "()V", "app_debug"})
    public static final class InsufficientBalanceWithFee extends io.horizontalsystems.bankwallet.core.EvmError {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.core.EvmError.InsufficientBalanceWithFee INSTANCE = null;
        
        private InsufficientBalanceWithFee() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/core/EvmError$ExecutionReverted;", "Lio/horizontalsystems/bankwallet/core/EvmError;", "message", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class ExecutionReverted extends io.horizontalsystems.bankwallet.core.EvmError {
        
        public ExecutionReverted(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/core/EvmError$RpcError;", "Lio/horizontalsystems/bankwallet/core/EvmError;", "message", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class RpcError extends io.horizontalsystems.bankwallet.core.EvmError {
        
        public RpcError(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super(null);
        }
    }
}