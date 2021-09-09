package io.horizontalsystems.bankwallet.modules.swap.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\rH\u0002R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/providers/UniswapProvider;", "", "uniswapKit", "Lio/horizontalsystems/uniswapkit/UniswapKit;", "(Lio/horizontalsystems/uniswapkit/UniswapKit;)V", "routerAddress", "Lio/horizontalsystems/ethereumkit/models/Address;", "getRouterAddress", "()Lio/horizontalsystems/ethereumkit/models/Address;", "swapDataSingle", "Lio/reactivex/Single;", "Lio/horizontalsystems/uniswapkit/models/SwapData;", "coinIn", "Lio/horizontalsystems/coinkit2/models/Coin;", "coinOut", "tradeData", "Lio/horizontalsystems/uniswapkit/models/TradeData;", "swapData", "amount", "Ljava/math/BigDecimal;", "tradeType", "Lio/horizontalsystems/uniswapkit/models/TradeType;", "tradeOptions", "Lio/horizontalsystems/uniswapkit/models/TradeOptions;", "transactionData", "Lio/horizontalsystems/ethereumkit/models/TransactionData;", "uniswapToken", "Lio/horizontalsystems/uniswapkit/models/Token;", "coin", "app_debug"})
public final class UniswapProvider {
    private final io.horizontalsystems.uniswapkit.UniswapKit uniswapKit = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.ethereumkit.models.Address getRouterAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<io.horizontalsystems.uniswapkit.models.SwapData> swapDataSingle(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coinIn, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coinOut) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.uniswapkit.models.TradeData tradeData(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.uniswapkit.models.SwapData swapData, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.uniswapkit.models.TradeType tradeType, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.uniswapkit.models.TradeOptions tradeOptions) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.ethereumkit.models.TransactionData transactionData(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.uniswapkit.models.TradeData tradeData) {
        return null;
    }
    
    private final io.horizontalsystems.uniswapkit.models.Token uniswapToken(io.horizontalsystems.coinkit2.models.Coin coin) {
        return null;
    }
    
    public UniswapProvider(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.uniswapkit.UniswapKit uniswapKit) {
        super();
    }
}