package io.horizontalsystems.bankwallet.modules.sendevm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ;2\u00020\u0001:\u0001;B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rJ\u001a\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u00102\b\u0010&\u001a\u0004\u0018\u00010\u0010J\u0012\u0010\'\u001a\u0004\u0018\u00010\u00102\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010(\u001a\u00020)H\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010\u00102\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0010J\b\u00100\u001a\u00020.H\u0014J\u0006\u00101\u001a\u00020.J\u0006\u00102\u001a\u00020.J\u0010\u00103\u001a\u00020.2\u0006\u0010/\u001a\u000204H\u0002J\u0012\u00105\u001a\u00020.2\b\u00106\u001a\u0004\u0018\u000107H\u0002J\u0010\u00108\u001a\u00020.2\u0006\u0010/\u001a\u000204H\u0002J\b\u00109\u001a\u00020.H\u0002J\b\u0010:\u001a\u00020.H\u0002R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\t0\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#\u00a8\u0006<"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/AmountInputViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/sendevm/IAmountInputService;", "fiatService", "Lio/horizontalsystems/bankwallet/core/fiat/FiatServiceSendEvm;", "switchService", "Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchServiceSendEvm;", "isMaxSupported", "", "clearables", "", "Lio/horizontalsystems/bankwallet/core/Clearable;", "(Lio/horizontalsystems/bankwallet/modules/sendevm/IAmountInputService;Lio/horizontalsystems/bankwallet/core/fiat/FiatServiceSendEvm;Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchServiceSendEvm;ZLjava/util/List;)V", "amountLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getAmountLiveData", "()Landroidx/lifecycle/MutableLiveData;", "coinDecimal", "", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "inputParamsLiveData", "Lio/horizontalsystems/bankwallet/ui/extensions/AmountInputView$InputParams;", "getInputParamsLiveData", "maxEnabledLiveData", "kotlin.jvm.PlatformType", "getMaxEnabledLiveData", "revertAmountLiveData", "getRevertAmountLiveData", "secondaryTextLiveData", "getSecondaryTextLiveData", "validDecimal", "getValidDecimal", "()I", "areAmountsEqual", "lhs", "rhs", "getAmountString", "primaryInfo", "Lio/horizontalsystems/bankwallet/core/fiat/FiatServiceSendEvm$PrimaryInfo;", "getAmountType", "Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService$AmountType;", "getPrefix", "onChangeAmount", "", "amount", "onCleared", "onClickMax", "onSwitch", "syncAmount", "Ljava/math/BigDecimal;", "syncCoin", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "syncCoinAmount", "syncInputs", "updateInputFields", "Companion", "app_debug"})
public final class AmountInputViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private int coinDecimal = 8;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> amountLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> maxEnabledLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> secondaryTextLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> revertAmountLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.extensions.AmountInputView.InputParams> inputParamsLiveData = null;
    private final io.horizontalsystems.bankwallet.modules.sendevm.IAmountInputService service = null;
    private final io.horizontalsystems.bankwallet.core.fiat.FiatServiceSendEvm fiatService = null;
    private final io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchServiceSendEvm switchService = null;
    private final boolean isMaxSupported = false;
    private final java.util.List<io.horizontalsystems.bankwallet.core.Clearable> clearables = null;
    public static final int maxCoinDecimal = 8;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.sendevm.AmountInputViewModel.Companion Companion = null;
    
    private final int getValidDecimal() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAmountLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getMaxEnabledLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSecondaryTextLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getRevertAmountLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.extensions.AmountInputView.InputParams> getInputParamsLiveData() {
        return null;
    }
    
    private final void syncInputs() {
    }
    
    private final void syncAmount(java.math.BigDecimal amount) {
    }
    
    private final void syncCoin(io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    private final void syncCoinAmount(java.math.BigDecimal amount) {
    }
    
    private final java.lang.String getPrefix(io.horizontalsystems.bankwallet.core.fiat.FiatServiceSendEvm.PrimaryInfo primaryInfo) {
        return null;
    }
    
    private final java.lang.String getAmountString(io.horizontalsystems.bankwallet.core.fiat.FiatServiceSendEvm.PrimaryInfo primaryInfo) {
        return null;
    }
    
    private final void updateInputFields() {
    }
    
    private final io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.AmountType getAmountType(io.horizontalsystems.bankwallet.core.fiat.FiatServiceSendEvm.PrimaryInfo primaryInfo) {
        return null;
    }
    
    public final boolean areAmountsEqual(@org.jetbrains.annotations.Nullable()
    java.lang.String lhs, @org.jetbrains.annotations.Nullable()
    java.lang.String rhs) {
        return false;
    }
    
    public final void onChangeAmount(@org.jetbrains.annotations.Nullable()
    java.lang.String amount) {
    }
    
    public final void onClickMax() {
    }
    
    public final void onSwitch() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public AmountInputViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.sendevm.IAmountInputService service, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.fiat.FiatServiceSendEvm fiatService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchServiceSendEvm switchService, boolean isMaxSupported, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.core.Clearable> clearables) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/AmountInputViewModel$Companion;", "", "()V", "maxCoinDecimal", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}