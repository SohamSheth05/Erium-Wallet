package io.horizontalsystems.bankwallet.modules.swap;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 L2\u00020\u0001:\u0003LMNB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0012\u0010=\u001a\u0004\u0018\u00010\u00122\u0006\u0010>\u001a\u00020?H\u0002J\u0006\u0010@\u001a\u00020AJ\u0010\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020DH\u0002J\u0012\u0010E\u001a\u00020A2\b\u0010F\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010G\u001a\u00020A2\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J\u0012\u0010H\u001a\u00020A2\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J\u0010\u0010I\u001a\u00020A2\u0006\u00105\u001a\u00020JH\u0002J\b\u0010K\u001a\u00020AH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001a0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR(\u0010\u001d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012 \u001f*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a0\u001a0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010 \u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001a0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR(\u0010%\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012 \u001f*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a0\u001a0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020+0*@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001d\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001cR(\u00103\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020+ \u001f*\n\u0012\u0004\u0012\u00020+\u0018\u00010*0*0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u00105\u001a\u0002042\u0006\u0010\u0011\u001a\u000204@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u0002040\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\u001cR\u001c\u0010<\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u000104040\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006O"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapService;", "", "dex", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Dex;", "tradeService", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService;", "allowanceService", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService;", "pendingAllowanceService", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapPendingAllowanceService;", "adapterManager", "Lio/horizontalsystems/bankwallet/core/IAdapterManager;", "(Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Dex;Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService;Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService;Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapPendingAllowanceService;Lio/horizontalsystems/bankwallet/core/IAdapterManager;)V", "approveData", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$ApproveData;", "getApproveData", "()Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$ApproveData;", "value", "Ljava/math/BigDecimal;", "balanceFrom", "getBalanceFrom", "()Ljava/math/BigDecimal;", "setBalanceFrom", "(Ljava/math/BigDecimal;)V", "balanceFromObservable", "Lio/reactivex/Observable;", "Ljava/util/Optional;", "getBalanceFromObservable", "()Lio/reactivex/Observable;", "balanceFromSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "balanceTo", "getBalanceTo", "setBalanceTo", "balanceToObservable", "getBalanceToObservable", "balanceToSubject", "getDex", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Dex;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "", "", "errors", "getErrors", "()Ljava/util/List;", "setErrors", "(Ljava/util/List;)V", "errorsObservable", "getErrorsObservable", "errorsSubject", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService$State;", "state", "getState", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapService$State;", "setState", "(Lio/horizontalsystems/bankwallet/modules/swap/SwapService$State;)V", "stateObservable", "getStateObservable", "stateSubject", "balance", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "onCleared", "", "onUpdateAllowancePending", "isPending", "", "onUpdateAmountFrom", "amount", "onUpdateCoinFrom", "onUpdateCoinTo", "onUpdateTrade", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$State;", "syncState", "Companion", "State", "SwapError", "app_debug"})
public final class SwapService {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.swap.SwapService.State> stateSubject = null;
    private final io.reactivex.subjects.PublishSubject<java.util.List<java.lang.Throwable>> errorsSubject = null;
    private final io.reactivex.subjects.PublishSubject<java.util.Optional<java.math.BigDecimal>> balanceFromSubject = null;
    private final io.reactivex.subjects.PublishSubject<java.util.Optional<java.math.BigDecimal>> balanceToSubject = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.swap.SwapService.State state;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<io.horizontalsystems.bankwallet.modules.swap.SwapService.State> stateObservable = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends java.lang.Throwable> errors;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.util.List<java.lang.Throwable>> errorsObservable = null;
    @org.jetbrains.annotations.Nullable()
    private java.math.BigDecimal balanceFrom;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.util.Optional<java.math.BigDecimal>> balanceFromObservable = null;
    @org.jetbrains.annotations.Nullable()
    private java.math.BigDecimal balanceTo;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.util.Optional<java.math.BigDecimal>> balanceToObservable = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex dex = null;
    private final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService tradeService = null;
    private final io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService allowanceService = null;
    private final io.horizontalsystems.bankwallet.modules.swap.allowance.SwapPendingAllowanceService pendingAllowanceService = null;
    private final io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.math.BigDecimal defaultSlippage = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.swap.SwapService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.swap.SwapService.State getState() {
        return null;
    }
    
    private final void setState(io.horizontalsystems.bankwallet.modules.swap.SwapService.State value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<io.horizontalsystems.bankwallet.modules.swap.SwapService.State> getStateObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Throwable> getErrors() {
        return null;
    }
    
    private final void setErrors(java.util.List<? extends java.lang.Throwable> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<java.lang.Throwable>> getErrorsObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal getBalanceFrom() {
        return null;
    }
    
    private final void setBalanceFrom(java.math.BigDecimal value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.Optional<java.math.BigDecimal>> getBalanceFromObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal getBalanceTo() {
        return null;
    }
    
    private final void setBalanceTo(java.math.BigDecimal value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.Optional<java.math.BigDecimal>> getBalanceToObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.ApproveData getApproveData() {
        return null;
    }
    
    public final void onCleared() {
    }
    
    private final void onUpdateTrade(io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.State state) {
    }
    
    private final void onUpdateCoinFrom(io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    private final void onUpdateCoinTo(io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    private final void onUpdateAmountFrom(java.math.BigDecimal amount) {
    }
    
    private final void onUpdateAllowancePending(boolean isPending) {
    }
    
    private final void syncState() {
    }
    
    private final java.math.BigDecimal balance(io.horizontalsystems.coinkit2.models.Coin coin) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex getDex() {
        return null;
    }
    
    public SwapService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex dex, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.SwapTradeService tradeService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService allowanceService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.allowance.SwapPendingAllowanceService pendingAllowanceService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapService$State;", "", "()V", "Loading", "NotReady", "Ready", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService$State$Loading;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService$State$Ready;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService$State$NotReady;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapService$State$Loading;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService$State;", "()V", "app_debug"})
        public static final class Loading extends io.horizontalsystems.bankwallet.modules.swap.SwapService.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.swap.SwapService.State.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapService$State$Ready;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService$State;", "transactionData", "Lio/horizontalsystems/ethereumkit/models/TransactionData;", "(Lio/horizontalsystems/ethereumkit/models/TransactionData;)V", "getTransactionData", "()Lio/horizontalsystems/ethereumkit/models/TransactionData;", "app_debug"})
        public static final class Ready extends io.horizontalsystems.bankwallet.modules.swap.SwapService.State {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.ethereumkit.models.TransactionData transactionData = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.ethereumkit.models.TransactionData getTransactionData() {
                return null;
            }
            
            public Ready(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.ethereumkit.models.TransactionData transactionData) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapService$State$NotReady;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService$State;", "()V", "app_debug"})
        public static final class NotReady extends io.horizontalsystems.bankwallet.modules.swap.SwapService.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.swap.SwapService.State.NotReady INSTANCE = null;
            
            private NotReady() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapService$SwapError;", "", "()V", "ForbiddenPriceImpactLevel", "InsufficientAllowance", "InsufficientBalanceFrom", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService$SwapError$InsufficientBalanceFrom;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService$SwapError$InsufficientAllowance;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService$SwapError$ForbiddenPriceImpactLevel;", "app_debug"})
    public static abstract class SwapError extends java.lang.Throwable {
        
        private SwapError() {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapService$SwapError$InsufficientBalanceFrom;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService$SwapError;", "()V", "app_debug"})
        public static final class InsufficientBalanceFrom extends io.horizontalsystems.bankwallet.modules.swap.SwapService.SwapError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.swap.SwapService.SwapError.InsufficientBalanceFrom INSTANCE = null;
            
            private InsufficientBalanceFrom() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapService$SwapError$InsufficientAllowance;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService$SwapError;", "()V", "app_debug"})
        public static final class InsufficientAllowance extends io.horizontalsystems.bankwallet.modules.swap.SwapService.SwapError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.swap.SwapService.SwapError.InsufficientAllowance INSTANCE = null;
            
            private InsufficientAllowance() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapService$SwapError$ForbiddenPriceImpactLevel;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService$SwapError;", "()V", "app_debug"})
        public static final class ForbiddenPriceImpactLevel extends io.horizontalsystems.bankwallet.modules.swap.SwapService.SwapError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.swap.SwapService.SwapError.ForbiddenPriceImpactLevel INSTANCE = null;
            
            private ForbiddenPriceImpactLevel() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapService$Companion;", "", "()V", "defaultSlippage", "Ljava/math/BigDecimal;", "getDefaultSlippage", "()Ljava/math/BigDecimal;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal getDefaultSlippage() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}