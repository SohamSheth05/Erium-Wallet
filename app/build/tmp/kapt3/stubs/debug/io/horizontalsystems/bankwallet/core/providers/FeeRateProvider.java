package io.horizontalsystems.bankwallet.core.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/core/providers/FeeRateProvider;", "", "appConfig", "Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;", "(Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;)V", "feeRateKit", "Lio/horizontalsystems/feeratekit/FeeRateKit;", "getFeeRateKit", "()Lio/horizontalsystems/feeratekit/FeeRateKit;", "feeRateKit$delegate", "Lkotlin/Lazy;", "binanceSmartChainGasPrice", "Lio/reactivex/Single;", "Ljava/math/BigInteger;", "bitcoinCashFeeRate", "bitcoinFeeRate", "blockCount", "", "dashFeeRate", "ethereumGasPrice", "litecoinFeeRate", "app_debug"})
public final class FeeRateProvider {
    private final kotlin.Lazy feeRateKit$delegate = null;
    
    private final io.horizontalsystems.feeratekit.FeeRateKit getFeeRateKit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.math.BigInteger> bitcoinFeeRate(int blockCount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.math.BigInteger> binanceSmartChainGasPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.math.BigInteger> litecoinFeeRate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.math.BigInteger> bitcoinCashFeeRate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.math.BigInteger> ethereumGasPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.math.BigInteger> dashFeeRate() {
        return null;
    }
    
    public FeeRateProvider(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfig) {
        super();
    }
}