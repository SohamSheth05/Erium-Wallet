package io.horizontalsystems.bankwallet.modules.send.submodules.fee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001cH\u0016J\"\u0010\u0012\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010\u000eH\u0016J\u0018\u0010\u0017\u001a\u00020)2\u000e\u0010.\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019H\u0016J\u001a\u0010/\u001a\u00020)2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000101H\u0016J\u0010\u00103\u001a\u00020)2\u0006\u00104\u001a\u00020\u0005H\u0016J\u0012\u00105\u001a\u00020)2\b\u00106\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u001b\u001a\u00020)2\u0006\u00107\u001a\u00020\u001cH\u0016J\u0012\u00108\u001a\u00020)2\b\u00109\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010:\u001a\u00020)2\b\u00109\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010 \u001a\u00020)2\u0006\u0010;\u001a\u00020\u001cH\u0016J\u0016\u0010<\u001a\u00020)2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016J\u0010\u0010>\u001a\u00020)2\u0006\u0010;\u001a\u00020\u001cH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R+\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00130\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u001b\u0010\u0017\u001a\f\u0012\b\u0012\u00060\u0018j\u0002`\u00190\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\fR\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0007\u00a8\u0006?"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeView;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$IView;", "()V", "feePriority", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "getFeePriority", "()Landroidx/lifecycle/MutableLiveData;", "insufficientFeeBalanceError", "Lio/horizontalsystems/core/SingleLiveEvent;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$InsufficientFeeBalance;", "getInsufficientFeeBalanceError", "()Lio/horizontalsystems/core/SingleLiveEvent;", "primaryFee", "", "getPrimaryFee", "secondaryFee", "getSecondaryFee", "setCustomFeeParams", "Lkotlin/Triple;", "", "Lkotlin/ranges/IntRange;", "getSetCustomFeeParams", "setError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getSetError", "setLoading", "", "getSetLoading", "showAdjustableFeeMenu", "getShowAdjustableFeeMenu", "showCustomFeePriority", "getShowCustomFeePriority", "showFeePriorityOptions", "", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/SendFeeModule$FeeRateInfoViewItem;", "getShowFeePriorityOptions", "showLowFeeWarningLiveData", "getShowLowFeeWarningLiveData", "setAdjustableFeeVisible", "", "visible", "value", "range", "label", "error", "setFee", "fee", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "convertedFee", "setFeePriority", "priority", "setInsufficientFeeBalanceError", "insufficientFeeBalance", "loading", "setPrimaryFee", "feeAmount", "setSecondaryFee", "show", "showFeeRatePrioritySelector", "feeRates", "showLowFeeWarning", "app_debug"})
public final class SendFeeView implements io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.IView {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showAdjustableFeeMenu = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> primaryFee = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> secondaryFee = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.FeeRatePriority> feePriority = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.FeeRateInfoViewItem>> showFeePriorityOptions = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.Boolean> showCustomFeePriority = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Triple<java.lang.Integer, kotlin.ranges.IntRange, java.lang.String>> setCustomFeeParams = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.InsufficientFeeBalance> insufficientFeeBalanceError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> setLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Exception> setError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showLowFeeWarningLiveData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowAdjustableFeeMenu() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPrimaryFee() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSecondaryFee() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.core.FeeRatePriority> getFeePriority() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.FeeRateInfoViewItem>> getShowFeePriorityOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.Boolean> getShowCustomFeePriority() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Triple<java.lang.Integer, kotlin.ranges.IntRange, java.lang.String>> getSetCustomFeeParams() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.InsufficientFeeBalance> getInsufficientFeeBalanceError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSetLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Exception> getSetError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowLowFeeWarningLiveData() {
        return null;
    }
    
    @java.lang.Override()
    public void setAdjustableFeeVisible(boolean visible) {
    }
    
    @java.lang.Override()
    public void setPrimaryFee(@org.jetbrains.annotations.Nullable()
    java.lang.String feeAmount) {
    }
    
    @java.lang.Override()
    public void setSecondaryFee(@org.jetbrains.annotations.Nullable()
    java.lang.String feeAmount) {
    }
    
    @java.lang.Override()
    public void setFeePriority(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.FeeRatePriority priority) {
    }
    
    @java.lang.Override()
    public void showFeeRatePrioritySelector(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.FeeRateInfoViewItem> feeRates) {
    }
    
    @java.lang.Override()
    public void showCustomFeePriority(boolean show) {
    }
    
    @java.lang.Override()
    public void setCustomFeeParams(int value, @org.jetbrains.annotations.NotNull()
    kotlin.ranges.IntRange range, @org.jetbrains.annotations.Nullable()
    java.lang.String label) {
    }
    
    @java.lang.Override()
    public void setLoading(boolean loading) {
    }
    
    @java.lang.Override()
    public void setFee(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo fee, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo convertedFee) {
    }
    
    @java.lang.Override()
    public void setError(@org.jetbrains.annotations.Nullable()
    java.lang.Exception error) {
    }
    
    @java.lang.Override()
    public void setInsufficientFeeBalanceError(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.submodules.fee.SendFeeModule.InsufficientFeeBalance insufficientFeeBalance) {
    }
    
    @java.lang.Override()
    public void showLowFeeWarning(boolean show) {
    }
    
    public SendFeeView() {
        super();
    }
}