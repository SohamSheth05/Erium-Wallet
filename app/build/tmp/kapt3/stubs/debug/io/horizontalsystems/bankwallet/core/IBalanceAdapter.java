package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IBalanceAdapter;", "", "balance", "Ljava/math/BigDecimal;", "getBalance", "()Ljava/math/BigDecimal;", "balanceLocked", "getBalanceLocked", "balanceState", "Lio/horizontalsystems/bankwallet/core/AdapterState;", "getBalanceState", "()Lio/horizontalsystems/bankwallet/core/AdapterState;", "balanceStateUpdatedFlowable", "Lio/reactivex/Flowable;", "", "getBalanceStateUpdatedFlowable", "()Lio/reactivex/Flowable;", "balanceUpdatedFlowable", "getBalanceUpdatedFlowable", "app_debug"})
public abstract interface IBalanceAdapter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bankwallet.core.AdapterState getBalanceState();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<kotlin.Unit> getBalanceStateUpdatedFlowable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal getBalance();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.math.BigDecimal getBalanceLocked();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<kotlin.Unit> getBalanceUpdatedFlowable();
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable()
        public static java.math.BigDecimal getBalanceLocked(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IBalanceAdapter $this) {
            return null;
        }
    }
}