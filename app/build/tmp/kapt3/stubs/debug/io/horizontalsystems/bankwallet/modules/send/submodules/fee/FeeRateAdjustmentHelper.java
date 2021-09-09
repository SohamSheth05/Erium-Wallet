package io.horizontalsystems.bankwallet.modules.send.submodules.fee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fR\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0007R\u00020\u00000\u00060\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/FeeRateAdjustmentHelper;", "", "appConfigProvider", "Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;", "(Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;)V", "amountRules", "", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/FeeRateAdjustmentHelper$Rule;", "rulesByCoin", "", "Lio/horizontalsystems/coinkit2/models/CoinType;", "applyRule", "", "coinType", "feeRateAdjustmentInfo", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/FeeRateAdjustmentInfo;", "feeRate", "Rule", "app_debug"})
public final class FeeRateAdjustmentHelper {
    private final java.util.List<io.horizontalsystems.bankwallet.modules.send.submodules.fee.FeeRateAdjustmentHelper.Rule> amountRules = null;
    private final java.util.Map<io.horizontalsystems.coinkit2.models.CoinType, java.util.List<io.horizontalsystems.bankwallet.modules.send.submodules.fee.FeeRateAdjustmentHelper.Rule>> rulesByCoin = null;
    private final io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider = null;
    
    public final long applyRule(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.fee.FeeRateAdjustmentInfo feeRateAdjustmentInfo, long feeRate) {
        return 0L;
    }
    
    public FeeRateAdjustmentHelper(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/FeeRateAdjustmentHelper$Rule;", "", "range", "Lkotlin/ranges/LongRange;", "coefficient", "", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/FeeRateAdjustmentHelper;Lkotlin/ranges/LongRange;F)V", "getCoefficient", "()F", "getRange", "()Lkotlin/ranges/LongRange;", "app_debug"})
    public final class Rule {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.ranges.LongRange range = null;
        private final float coefficient = 0.0F;
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.ranges.LongRange getRange() {
            return null;
        }
        
        public final float getCoefficient() {
            return 0.0F;
        }
        
        public Rule(@org.jetbrains.annotations.NotNull()
        kotlin.ranges.LongRange range, float coefficient) {
            super();
        }
    }
}