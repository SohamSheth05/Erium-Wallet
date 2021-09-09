package io.horizontalsystems.bankwallet.modules.swap;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010J$\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\nJ&\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u00062\u0006\u0010!\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapViewItemHelper;", "", "numberFormatter", "Lio/horizontalsystems/bankwallet/core/IAppNumberFormatter;", "(Lio/horizontalsystems/bankwallet/core/IAppNumberFormatter;)V", "coinAmount", "", "amount", "Ljava/math/BigDecimal;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "maxFraction", "", "(Ljava/math/BigDecimal;Lio/horizontalsystems/coinkit2/models/Coin;Ljava/lang/Integer;)Ljava/lang/String;", "deadline", "ttl", "", "guaranteedAmountViewItem", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$GuaranteedAmountViewItem;", "tradeData", "Lio/horizontalsystems/uniswapkit/models/TradeData;", "coinIn", "coinOut", "price", "coinFrom", "coinTo", "priceImpactViewItem", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$PriceImpactViewItem;", "trade", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$Trade;", "minLevel", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$PriceImpactLevel;", "slippage", "allowedSlippage", "app_debug"})
public final class SwapViewItemHelper {
    private final io.horizontalsystems.bankwallet.core.IAppNumberFormatter numberFormatter = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String price(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal price, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.coinkit2.models.Coin coinFrom, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.coinkit2.models.Coin coinTo) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.swap.SwapModule.PriceImpactViewItem priceImpactViewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.Trade trade, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.PriceImpactLevel minLevel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.swap.SwapModule.GuaranteedAmountViewItem guaranteedAmountViewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.uniswapkit.models.TradeData tradeData, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.coinkit2.models.Coin coinIn, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.coinkit2.models.Coin coinOut) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String slippage(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal allowedSlippage) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String deadline(long ttl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String coinAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.Nullable()
    java.lang.Integer maxFraction) {
        return null;
    }
    
    public SwapViewItemHelper(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAppNumberFormatter numberFormatter) {
        super();
    }
}