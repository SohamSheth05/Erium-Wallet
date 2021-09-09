package io.horizontalsystems.bankwallet.modules.sendevm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00110\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/IAmountInputService;", "", "amount", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "amountObservable", "Lio/reactivex/Flowable;", "getAmountObservable", "()Lio/reactivex/Flowable;", "balance", "getBalance", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "coinObservable", "Ljava/util/Optional;", "getCoinObservable", "onChangeAmount", "", "app_debug"})
public abstract interface IAmountInputService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal getAmount();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.coinkit2.models.Coin getCoin();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.math.BigDecimal getBalance();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.math.BigDecimal> getAmountObservable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.Optional<io.horizontalsystems.coinkit2.models.Coin>> getCoinObservable();
    
    public abstract void onChangeAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount);
}