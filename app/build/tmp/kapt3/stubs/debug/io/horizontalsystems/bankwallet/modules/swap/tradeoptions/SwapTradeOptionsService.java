package io.horizontalsystems.bankwallet.modules.swap.tradeoptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001>B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u00109\u001a\u00020\u0015H\u0016J\u0012\u0010:\u001a\u00020\u00152\b\u0010;\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010:\u001a\u00020\u00152\u0006\u0010<\u001a\u00020+H\u0016J\b\u0010=\u001a\u00020\u0015H\u0002R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00182\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010\u001e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e  *\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00180\u00180\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R(\u0010\'\u001a\u0004\u0018\u00010$2\b\u0010\u0006\u001a\u0004\u0018\u00010$@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010&\"\u0004\b)\u0010*R$\u0010,\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020+@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00102\u001a\u0002012\u0006\u0010\u0006\u001a\u000201@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001f\u00107\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u000101010\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\"\u00a8\u0006?"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsService;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/IRecipientAddressService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "tradeOptions", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptions;", "(Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptions;)V", "value", "", "deadline", "getDeadline", "()J", "setDeadline", "(J)V", "error", "", "getError", "()Ljava/lang/Throwable;", "setError", "(Ljava/lang/Throwable;)V", "errorObservable", "Lio/reactivex/Observable;", "", "getErrorObservable", "()Lio/reactivex/Observable;", "", "errors", "getErrors", "()Ljava/util/List;", "setErrors", "(Ljava/util/List;)V", "errorsObservable", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "getErrorsObservable", "()Lio/reactivex/subjects/BehaviorSubject;", "initialAddress", "Lio/horizontalsystems/bankwallet/entities/Address;", "getInitialAddress", "()Lio/horizontalsystems/bankwallet/entities/Address;", "recipient", "getRecipient", "setRecipient", "(Lio/horizontalsystems/bankwallet/entities/Address;)V", "Ljava/math/BigDecimal;", "slippage", "getSlippage", "()Ljava/math/BigDecimal;", "setSlippage", "(Ljava/math/BigDecimal;)V", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$State;", "state", "getState", "()Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$State;", "setState", "(Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/ISwapTradeOptionsService$State;)V", "stateObservable", "getStateObservable", "clear", "set", "address", "amount", "sync", "Companion", "app_debug"})
public final class SwapTradeOptionsService implements io.horizontalsystems.bankwallet.modules.swap.tradeoptions.IRecipientAddressService, io.horizontalsystems.bankwallet.core.Clearable {
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.State state;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.State> stateObservable = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<java.util.List<java.lang.Throwable>> errorsObservable = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends java.lang.Throwable> errors;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal slippage;
    private long deadline;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.entities.Address recipient;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Throwable error;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<kotlin.Unit> errorObservable = null;
    @org.jetbrains.annotations.NotNull()
    private static final android.util.Range<java.math.BigDecimal> recommendedSlippageBounds = null;
    @org.jetbrains.annotations.NotNull()
    private static final android.util.Range<java.lang.Long> recommendedDeadlineBounds = null;
    @org.jetbrains.annotations.NotNull()
    private static final android.util.Range<java.math.BigDecimal> limitSlippageBounds = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptionsService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.State getState() {
        return null;
    }
    
    private final void setState(io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.State value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.ISwapTradeOptionsService.State> getStateObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<java.util.List<java.lang.Throwable>> getErrorsObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Throwable> getErrors() {
        return null;
    }
    
    private final void setErrors(java.util.List<? extends java.lang.Throwable> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getSlippage() {
        return null;
    }
    
    public final void setSlippage(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal value) {
    }
    
    public final long getDeadline() {
        return 0L;
    }
    
    public final void setDeadline(long value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.entities.Address getRecipient() {
        return null;
    }
    
    public final void setRecipient(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.Address value) {
    }
    
    private final void sync() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.Address getInitialAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Throwable getError() {
        return null;
    }
    
    public void setError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<kotlin.Unit> getErrorObservable() {
        return null;
    }
    
    @java.lang.Override()
    public void set(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.Address address) {
    }
    
    @java.lang.Override()
    public void set(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public SwapTradeOptionsService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptions tradeOptions) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsService$Companion;", "", "()V", "limitSlippageBounds", "Landroid/util/Range;", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "getLimitSlippageBounds", "()Landroid/util/Range;", "recommendedDeadlineBounds", "", "getRecommendedDeadlineBounds", "recommendedSlippageBounds", "getRecommendedSlippageBounds", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.util.Range<java.math.BigDecimal> getRecommendedSlippageBounds() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.util.Range<java.lang.Long> getRecommendedDeadlineBounds() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.util.Range<java.math.BigDecimal> getLimitSlippageBounds() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}