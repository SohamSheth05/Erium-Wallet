package io.horizontalsystems.bankwallet.modules.send.submodules.fee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/FeeRateAdjustmentInfo;", "", "amountInfo", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo;", "xRate", "Ljava/math/BigDecimal;", "currency", "Lio/horizontalsystems/core/entities/Currency;", "balance", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo;Ljava/math/BigDecimal;Lio/horizontalsystems/core/entities/Currency;Ljava/math/BigDecimal;)V", "getAmountInfo", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo;", "setAmountInfo", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo;)V", "getBalance", "()Ljava/math/BigDecimal;", "setBalance", "(Ljava/math/BigDecimal;)V", "getCurrency", "()Lio/horizontalsystems/core/entities/Currency;", "getXRate", "setXRate", "app_debug"})
public final class FeeRateAdjustmentInfo {
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountInfo amountInfo;
    @org.jetbrains.annotations.Nullable()
    private java.math.BigDecimal xRate;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.entities.Currency currency = null;
    @org.jetbrains.annotations.Nullable()
    private java.math.BigDecimal balance;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountInfo getAmountInfo() {
        return null;
    }
    
    public final void setAmountInfo(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountInfo p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal getXRate() {
        return null;
    }
    
    public final void setXRate(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.entities.Currency getCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal getBalance() {
        return null;
    }
    
    public final void setBalance(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal p0) {
    }
    
    public FeeRateAdjustmentInfo(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountInfo amountInfo, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal xRate, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal balance) {
        super();
    }
}