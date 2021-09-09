package io.horizontalsystems.bankwallet.modules.swap.tradeoptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptions;", "", "allowedSlippage", "Ljava/math/BigDecimal;", "ttl", "", "recipient", "Lio/horizontalsystems/bankwallet/entities/Address;", "(Ljava/math/BigDecimal;JLio/horizontalsystems/bankwallet/entities/Address;)V", "getAllowedSlippage", "()Ljava/math/BigDecimal;", "setAllowedSlippage", "(Ljava/math/BigDecimal;)V", "getRecipient", "()Lio/horizontalsystems/bankwallet/entities/Address;", "setRecipient", "(Lio/horizontalsystems/bankwallet/entities/Address;)V", "tradeOptions", "Lio/horizontalsystems/uniswapkit/models/TradeOptions;", "getTradeOptions", "()Lio/horizontalsystems/uniswapkit/models/TradeOptions;", "getTtl", "()J", "setTtl", "(J)V", "app_debug"})
public final class SwapTradeOptions {
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal allowedSlippage;
    private long ttl;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.entities.Address recipient;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.uniswapkit.models.TradeOptions getTradeOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getAllowedSlippage() {
        return null;
    }
    
    public final void setAllowedSlippage(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    public final long getTtl() {
        return 0L;
    }
    
    public final void setTtl(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.entities.Address getRecipient() {
        return null;
    }
    
    public final void setRecipient(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.Address p0) {
    }
    
    public SwapTradeOptions(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal allowedSlippage, long ttl, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.Address recipient) {
        super();
    }
    
    public SwapTradeOptions() {
        super();
    }
}