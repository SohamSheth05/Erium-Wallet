package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IFeeRateProvider;", "", "defaultFeeRatePriority", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "getDefaultFeeRatePriority", "()Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "feeRatePriorityList", "", "getFeeRatePriorityList", "()Ljava/util/List;", "recommendedFeeRate", "Lio/reactivex/Single;", "Ljava/math/BigInteger;", "getRecommendedFeeRate", "()Lio/reactivex/Single;", "feeRate", "feeRatePriority", "app_debug"})
public abstract interface IFeeRateProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bankwallet.core.FeeRatePriority> getFeeRatePriorityList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.math.BigInteger> getRecommendedFeeRate();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bankwallet.core.FeeRatePriority getDefaultFeeRatePriority();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.math.BigInteger> feeRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.FeeRatePriority feeRatePriority);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static io.horizontalsystems.bankwallet.core.FeeRatePriority getDefaultFeeRatePriority(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IFeeRateProvider $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static io.reactivex.Single<java.math.BigInteger> feeRate(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IFeeRateProvider $this, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.FeeRatePriority feeRatePriority) {
            return null;
        }
    }
}