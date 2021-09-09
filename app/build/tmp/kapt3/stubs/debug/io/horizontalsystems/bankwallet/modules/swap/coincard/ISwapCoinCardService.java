package io.horizontalsystems.bankwallet.modules.swap.coincard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010!\u001a\u00020\"2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u0010H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0005R\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u001e\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\nR\u0012\u0010\u0018\u001a\u00020\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\nR\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \u00a8\u0006$"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/coincard/ISwapCoinCardService;", "", "amount", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "amountObservable", "Lio/reactivex/Observable;", "Ljava/util/Optional;", "getAmountObservable", "()Lio/reactivex/Observable;", "balance", "getBalance", "balanceObservable", "getBalanceObservable", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "coinObservable", "getCoinObservable", "errorObservable", "", "getErrorObservable", "isEstimated", "", "()Z", "isEstimatedObservable", "tokensForSelection", "", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$CoinBalanceItem;", "getTokensForSelection", "()Ljava/util/List;", "onChangeAmount", "", "onSelectCoin", "app_debug"})
public abstract interface ISwapCoinCardService {
    
    public abstract boolean isEstimated();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.math.BigDecimal getAmount();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.coinkit2.models.Coin getCoin();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.math.BigDecimal getBalance();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem> getTokensForSelection();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> isEstimatedObservable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.Optional<java.math.BigDecimal>> getAmountObservable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.Optional<io.horizontalsystems.coinkit2.models.Coin>> getCoinObservable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.Optional<java.math.BigDecimal>> getBalanceObservable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.Optional<java.lang.Throwable>> getErrorObservable();
    
    public abstract void onChangeAmount(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal amount);
    
    public abstract void onSelectCoin(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin);
}