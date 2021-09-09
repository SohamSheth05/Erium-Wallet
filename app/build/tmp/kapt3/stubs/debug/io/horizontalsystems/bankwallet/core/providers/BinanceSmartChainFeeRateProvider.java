package io.horizontalsystems.bankwallet.core.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bankwallet/core/providers/BinanceSmartChainFeeRateProvider;", "Lio/horizontalsystems/bankwallet/core/IFeeRateProvider;", "feeRateProvider", "Lio/horizontalsystems/bankwallet/core/providers/FeeRateProvider;", "(Lio/horizontalsystems/bankwallet/core/providers/FeeRateProvider;)V", "feeRatePriorityList", "", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "getFeeRatePriorityList", "()Ljava/util/List;", "recommendedFeeRate", "Lio/reactivex/Single;", "Ljava/math/BigInteger;", "getRecommendedFeeRate", "()Lio/reactivex/Single;", "app_debug"})
public final class BinanceSmartChainFeeRateProvider implements io.horizontalsystems.bankwallet.core.IFeeRateProvider {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.core.FeeRatePriority> feeRatePriorityList = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Single<java.math.BigInteger> recommendedFeeRate = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.core.FeeRatePriority> getFeeRatePriorityList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.math.BigInteger> getRecommendedFeeRate() {
        return null;
    }
    
    public BinanceSmartChainFeeRateProvider(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.providers.FeeRateProvider feeRateProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bankwallet.core.FeeRatePriority getDefaultFeeRatePriority() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.math.BigInteger> feeRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.FeeRatePriority feeRatePriority) {
        return null;
    }
}