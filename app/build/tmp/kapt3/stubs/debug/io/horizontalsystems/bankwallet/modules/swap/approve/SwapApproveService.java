package io.horizontalsystems.bankwallet.modules.swap.approve;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\b\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u000f0\u000f0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService;", "", "erc20Kit", "Lio/horizontalsystems/erc20kit/core/Erc20Kit;", "amount", "Ljava/math/BigInteger;", "spenderAddress", "Lio/horizontalsystems/ethereumkit/models/Address;", "allowance", "(Lio/horizontalsystems/erc20kit/core/Erc20Kit;Ljava/math/BigInteger;Lio/horizontalsystems/ethereumkit/models/Address;Ljava/math/BigInteger;)V", "value", "getAmount", "()Ljava/math/BigInteger;", "setAmount", "(Ljava/math/BigInteger;)V", "Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService$State;", "state", "getState", "()Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService$State;", "setState", "(Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService$State;)V", "stateObservable", "Lio/reactivex/Flowable;", "getStateObservable", "()Lio/reactivex/Flowable;", "stateSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "syncState", "", "State", "TransactionAmountError", "app_debug"})
public final class SwapApproveService {
    private final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.modules.swap.approve.SwapApproveService.State> stateSubject = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.swap.approve.SwapApproveService.State state;
    @org.jetbrains.annotations.Nullable()
    private java.math.BigInteger amount;
    private final io.horizontalsystems.erc20kit.core.Erc20Kit erc20Kit = null;
    private final io.horizontalsystems.ethereumkit.models.Address spenderAddress = null;
    private final java.math.BigInteger allowance = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<io.horizontalsystems.bankwallet.modules.swap.approve.SwapApproveService.State> getStateObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.swap.approve.SwapApproveService.State getState() {
        return null;
    }
    
    private final void setState(io.horizontalsystems.bankwallet.modules.swap.approve.SwapApproveService.State value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigInteger getAmount() {
        return null;
    }
    
    public final void setAmount(@org.jetbrains.annotations.Nullable()
    java.math.BigInteger value) {
    }
    
    private final void syncState() {
    }
    
    public SwapApproveService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.erc20kit.core.Erc20Kit erc20Kit, @org.jetbrains.annotations.NotNull()
    java.math.BigInteger amount, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.models.Address spenderAddress, @org.jetbrains.annotations.NotNull()
    java.math.BigInteger allowance) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService$State;", "", "()V", "ApproveAllowed", "ApproveNotAllowed", "Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService$State$ApproveNotAllowed;", "Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService$State$ApproveAllowed;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService$State$ApproveNotAllowed;", "Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService$State;", "errors", "", "", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "app_debug"})
        public static final class ApproveNotAllowed extends io.horizontalsystems.bankwallet.modules.swap.approve.SwapApproveService.State {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<java.lang.Throwable> errors = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<java.lang.Throwable> getErrors() {
                return null;
            }
            
            public ApproveNotAllowed(@org.jetbrains.annotations.NotNull()
            java.util.List<? extends java.lang.Throwable> errors) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService$State$ApproveAllowed;", "Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService$State;", "transactionData", "Lio/horizontalsystems/ethereumkit/models/TransactionData;", "(Lio/horizontalsystems/ethereumkit/models/TransactionData;)V", "getTransactionData", "()Lio/horizontalsystems/ethereumkit/models/TransactionData;", "app_debug"})
        public static final class ApproveAllowed extends io.horizontalsystems.bankwallet.modules.swap.approve.SwapApproveService.State {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.ethereumkit.models.TransactionData transactionData = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.ethereumkit.models.TransactionData getTransactionData() {
                return null;
            }
            
            public ApproveAllowed(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.ethereumkit.models.TransactionData transactionData) {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0001\u0005\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService$TransactionAmountError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "AlreadyApproved", "Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService$TransactionAmountError$AlreadyApproved;", "app_debug"})
    public static abstract class TransactionAmountError extends java.lang.Exception {
        
        private TransactionAmountError() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService$TransactionAmountError$AlreadyApproved;", "Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveService$TransactionAmountError;", "()V", "app_debug"})
        public static final class AlreadyApproved extends io.horizontalsystems.bankwallet.modules.swap.approve.SwapApproveService.TransactionAmountError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.swap.approve.SwapApproveService.TransactionAmountError.AlreadyApproved INSTANCE = null;
            
            private AlreadyApproved() {
                super();
            }
        }
    }
}