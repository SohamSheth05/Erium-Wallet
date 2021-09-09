package io.horizontalsystems.bankwallet.core.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0019\u001a\u00020\u0006H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001a"}, d2 = {"Lio/horizontalsystems/bankwallet/core/providers/BitcoinFeeRateProvider;", "Lio/horizontalsystems/bankwallet/core/IFeeRateProvider;", "feeRateProvider", "Lio/horizontalsystems/bankwallet/core/providers/FeeRateProvider;", "(Lio/horizontalsystems/bankwallet/core/providers/FeeRateProvider;)V", "defaultFeeRatePriority", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "getDefaultFeeRatePriority", "()Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "setDefaultFeeRatePriority", "(Lio/horizontalsystems/bankwallet/core/FeeRatePriority;)V", "feeRatePriorityList", "", "getFeeRatePriorityList", "()Ljava/util/List;", "highPriorityBlockCount", "", "lowPriorityBlockCount", "mediumPriorityBlockCount", "recommendedFeeRate", "Lio/reactivex/Single;", "Ljava/math/BigInteger;", "getRecommendedFeeRate", "()Lio/reactivex/Single;", "feeRate", "feeRatePriority", "app_debug"})
public final class BitcoinFeeRateProvider implements io.horizontalsystems.bankwallet.core.IFeeRateProvider {
    private final int lowPriorityBlockCount = 40;
    private final int mediumPriorityBlockCount = 8;
    private final int highPriorityBlockCount = 2;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.core.FeeRatePriority> feeRatePriorityList = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Single<java.math.BigInteger> recommendedFeeRate = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.core.FeeRatePriority defaultFeeRatePriority;
    private final io.horizontalsystems.bankwallet.core.providers.FeeRateProvider feeRateProvider = null;
    
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.core.FeeRatePriority getDefaultFeeRatePriority() {
        return null;
    }
    
    public void setDefaultFeeRatePriority(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.FeeRatePriority p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.math.BigInteger> feeRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.FeeRatePriority feeRatePriority) {
        return null;
    }
    
    public BitcoinFeeRateProvider(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.providers.FeeRateProvider feeRateProvider) {
        super();
    }
}