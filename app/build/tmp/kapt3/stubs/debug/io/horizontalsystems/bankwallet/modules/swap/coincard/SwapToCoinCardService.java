package io.horizontalsystems.bankwallet.modules.swap.coincard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010*\u001a\u00020+2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\fR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000f0\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000f0\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011R\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/coincard/SwapToCoinCardService;", "Lio/horizontalsystems/bankwallet/modules/swap/coincard/ISwapCoinCardService;", "service", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService;", "tradeService", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService;", "coinProvider", "Lio/horizontalsystems/bankwallet/modules/swap/coincard/SwapCoinProvider;", "(Lio/horizontalsystems/bankwallet/modules/swap/SwapService;Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService;Lio/horizontalsystems/bankwallet/modules/swap/coincard/SwapCoinProvider;)V", "amount", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "amountObservable", "Lio/reactivex/Observable;", "Ljava/util/Optional;", "getAmountObservable", "()Lio/reactivex/Observable;", "balance", "getBalance", "balanceObservable", "getBalanceObservable", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "coinObservable", "getCoinObservable", "errorObservable", "", "getErrorObservable", "isEstimated", "", "()Z", "isEstimatedObservable", "tokensForSelection", "", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$CoinBalanceItem;", "getTokensForSelection", "()Ljava/util/List;", "tradeType", "Lio/horizontalsystems/uniswapkit/models/TradeType;", "onChangeAmount", "", "onSelectCoin", "app_debug"})
public final class SwapToCoinCardService implements io.horizontalsystems.bankwallet.modules.swap.coincard.ISwapCoinCardService {
    private final io.horizontalsystems.uniswapkit.models.TradeType tradeType = io.horizontalsystems.uniswapkit.models.TradeType.ExactOut;
    private final io.horizontalsystems.bankwallet.modules.swap.SwapService service = null;
    private final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService tradeService = null;
    private final io.horizontalsystems.bankwallet.modules.swap.coincard.SwapCoinProvider coinProvider = null;
    
    @java.lang.Override()
    public boolean isEstimated() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.math.BigDecimal getAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.coinkit2.models.Coin getCoin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.math.BigDecimal getBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem> getTokensForSelection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.lang.Boolean> isEstimatedObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.Optional<java.math.BigDecimal>> getAmountObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.Optional<io.horizontalsystems.coinkit2.models.Coin>> getCoinObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.Optional<java.math.BigDecimal>> getBalanceObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.Optional<java.lang.Throwable>> getErrorObservable() {
        return null;
    }
    
    @java.lang.Override()
    public void onChangeAmount(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal amount) {
    }
    
    @java.lang.Override()
    public void onSelectCoin(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public SwapToCoinCardService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.SwapService service, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.SwapTradeService tradeService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.coincard.SwapCoinProvider coinProvider) {
        super();
    }
}