package io.horizontalsystems.bankwallet.modules.swap.coincard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 C2\u00020\u0001:\u0001CB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0$J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0$J\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0$J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160$J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0$J\u0010\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u000fJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0$J\u0010\u0010\'\u001a\u00020(2\b\u0010&\u001a\u0004\u0018\u00010\u000fJ\b\u0010)\u001a\u00020(H\u0014J\u000e\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020(J\u0006\u0010.\u001a\u00020(J\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0$J\n\u0010/\u001a\u0004\u0018\u00010\u000fH\u0002J\u001a\u00100\u001a\u00020(2\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\tH\u0002J\b\u00104\u001a\u00020(H\u0002J\u0012\u00105\u001a\u00020(2\b\u0010&\u001a\u0004\u0018\u000102H\u0002J\u0012\u00106\u001a\u00020(2\b\u00107\u001a\u0004\u0018\u000102H\u0002J\u0012\u00108\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0012\u00109\u001a\u00020(2\b\u0010:\u001a\u0004\u0018\u00010;H\u0002J\u0010\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020\tH\u0002J(\u0010>\u001a\u00020(2\b\u0010?\u001a\u0004\u0018\u00010@2\b\b\u0002\u00103\u001a\u00020\t2\n\b\u0002\u0010A\u001a\u0004\u0018\u000102H\u0002J\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0$J\b\u0010B\u001a\u00020(H\u0002R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\t0\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\t0\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\t0\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#\u00a8\u0006D"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/coincard/SwapCoinCardViewModel;", "Landroidx/lifecycle/ViewModel;", "coinCardService", "Lio/horizontalsystems/bankwallet/modules/swap/coincard/ISwapCoinCardService;", "fiatService", "Lio/horizontalsystems/bankwallet/core/fiat/FiatService;", "switchService", "Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService;", "maxButtonSupported", "", "formatter", "Lio/horizontalsystems/bankwallet/modules/swap/SwapViewItemHelper;", "(Lio/horizontalsystems/bankwallet/modules/swap/coincard/ISwapCoinCardService;Lio/horizontalsystems/bankwallet/core/fiat/FiatService;Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService;ZLio/horizontalsystems/bankwallet/modules/swap/SwapViewItemHelper;)V", "amountLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "balanceErrorLiveData", "kotlin.jvm.PlatformType", "balanceLiveData", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "inputParamsLiveData", "Lio/horizontalsystems/bankwallet/ui/extensions/AmountInputView$InputParams;", "isEstimatedLiveData", "maxEnabledLiveData", "secondaryInfoLiveData", "tokenCodeLiveData", "tokensForSelection", "", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$CoinBalanceItem;", "getTokensForSelection", "()Ljava/util/List;", "validDecimals", "", "getValidDecimals", "()I", "Landroidx/lifecycle/LiveData;", "isValid", "amount", "onChangeAmount", "", "onCleared", "onSelectCoin", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "onSwitch", "onTapMax", "secondaryInfoPlaceHolder", "setCoinValueToService", "coinAmount", "Ljava/math/BigDecimal;", "force", "subscribeToServices", "syncAmount", "syncBalance", "balance", "syncCoin", "syncError", "error", "", "syncEstimated", "estimated", "syncFullAmountInfo", "fullAmountInfo", "Lio/horizontalsystems/bankwallet/core/fiat/FiatService$FullAmountInfo;", "inputAmount", "updateInputFields", "Companion", "app_debug"})
public final class SwapCoinCardViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> amountLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> balanceLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> balanceErrorLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> tokenCodeLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEstimatedLiveData = null;
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.extensions.AmountInputView.InputParams> inputParamsLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> secondaryInfoLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> maxEnabledLiveData = null;
    private final io.horizontalsystems.bankwallet.modules.swap.coincard.ISwapCoinCardService coinCardService = null;
    private final io.horizontalsystems.bankwallet.core.fiat.FiatService fiatService = null;
    private final io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService switchService = null;
    private final boolean maxButtonSupported = false;
    private final io.horizontalsystems.bankwallet.modules.swap.SwapViewItemHelper formatter = null;
    private static final int maxValidDecimals = 8;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.swap.coincard.SwapCoinCardViewModel.Companion Companion = null;
    
    private final int getValidDecimals() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> amountLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> balanceLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> balanceErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> tokenCodeLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isEstimatedLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<io.horizontalsystems.bankwallet.ui.extensions.AmountInputView.InputParams> inputParamsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> secondaryInfoLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> maxEnabledLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem> getTokensForSelection() {
        return null;
    }
    
    public final void onSelectCoin(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public final void onChangeAmount(@org.jetbrains.annotations.Nullable()
    java.lang.String amount) {
    }
    
    public final boolean isValid(@org.jetbrains.annotations.Nullable()
    java.lang.String amount) {
        return false;
    }
    
    public final void onSwitch() {
    }
    
    public final void onTapMax() {
    }
    
    private final void subscribeToServices() {
    }
    
    private final void syncEstimated(boolean estimated) {
    }
    
    private final void syncAmount(java.math.BigDecimal amount) {
    }
    
    private final void syncCoin(io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    private final void syncBalance(java.math.BigDecimal balance) {
    }
    
    private final void syncError(java.lang.Throwable error) {
    }
    
    private final java.lang.String secondaryInfoPlaceHolder() {
        return null;
    }
    
    private final void syncFullAmountInfo(io.horizontalsystems.bankwallet.core.fiat.FiatService.FullAmountInfo fullAmountInfo, boolean force, java.math.BigDecimal inputAmount) {
    }
    
    private final void updateInputFields() {
    }
    
    private final void setCoinValueToService(java.math.BigDecimal coinAmount, boolean force) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public SwapCoinCardViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.coincard.ISwapCoinCardService coinCardService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.fiat.FiatService fiatService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService switchService, boolean maxButtonSupported, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.SwapViewItemHelper formatter) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/coincard/SwapCoinCardViewModel$Companion;", "", "()V", "maxValidDecimals", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}