package io.horizontalsystems.bankwallet.modules.send.submodules.fee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeInteractor;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IInteractor;", "baseCurrency", "Lio/horizontalsystems/core/entities/Currency;", "rateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "feeRateProvider", "Lio/horizontalsystems/bankwallet/core/IFeeRateProvider;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "(Lio/horizontalsystems/core/entities/Currency;Lio/horizontalsystems/bankwallet/core/IRateManager;Lio/horizontalsystems/bankwallet/core/IFeeRateProvider;Lio/horizontalsystems/coinkit2/models/Coin;)V", "defaultFeeRatePriority", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "getDefaultFeeRatePriority", "()Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "delegate", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IInteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "feeRatePriorityList", "", "getFeeRatePriorityList", "()Ljava/util/List;", "getRate", "Ljava/math/BigDecimal;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "onClear", "", "syncFeeRate", "feeRatePriority", "app_debug"})
public final class SendFeeInteractor implements io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IInteractorDelegate delegate;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.core.FeeRatePriority> feeRatePriorityList = null;
    @org.jetbrains.annotations.Nullable()
    private final io.horizontalsystems.bankwallet.core.FeeRatePriority defaultFeeRatePriority = null;
    private final io.horizontalsystems.core.entities.Currency baseCurrency = null;
    private final io.horizontalsystems.bankwallet.core.IRateManager rateManager = null;
    private final io.horizontalsystems.bankwallet.core.IFeeRateProvider feeRateProvider = null;
    private final io.horizontalsystems.coinkit2.models.Coin coin = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IInteractorDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.core.FeeRatePriority> getFeeRatePriorityList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.core.FeeRatePriority getDefaultFeeRatePriority() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.math.BigDecimal getRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return null;
    }
    
    @java.lang.Override()
    public void syncFeeRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.FeeRatePriority feeRatePriority) {
    }
    
    @java.lang.Override()
    public void onClear() {
    }
    
    public SendFeeInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency baseCurrency, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager rateManager, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.core.IFeeRateProvider feeRateProvider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
        super();
    }
}