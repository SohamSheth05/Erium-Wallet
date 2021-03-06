package io.horizontalsystems.bankwallet.core.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002J\u001e\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\bH\u0002J\u0016\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002J\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/core/providers/FeeCoinProvider;", "", "coinKit", "Lio/horizontalsystems/coinkit2/CoinKit;", "(Lio/horizontalsystems/coinkit2/CoinKit;)V", "bep20", "Lkotlin/Pair;", "Lio/horizontalsystems/coinkit2/models/Coin;", "", "binance", "symbol", "erc20", "feeCoinData", "coin", "app_debug"})
public final class FeeCoinProvider {
    private final io.horizontalsystems.coinkit2.CoinKit coinKit = null;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Pair<io.horizontalsystems.coinkit2.models.Coin, java.lang.String> feeCoinData(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
        return null;
    }
    
    private final kotlin.Pair<io.horizontalsystems.coinkit2.models.Coin, java.lang.String> erc20() {
        return null;
    }
    
    private final kotlin.Pair<io.horizontalsystems.coinkit2.models.Coin, java.lang.String> bep20() {
        return null;
    }
    
    private final kotlin.Pair<io.horizontalsystems.coinkit2.models.Coin, java.lang.String> binance(java.lang.String symbol) {
        return null;
    }
    
    public FeeCoinProvider(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.CoinKit coinKit) {
        super();
    }
}