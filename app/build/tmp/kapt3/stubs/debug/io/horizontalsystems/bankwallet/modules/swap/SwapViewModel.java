package io.horizontalsystems.bankwallet.modules.swap;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003?@AB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0$J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100$J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\'H\u0002J\u0006\u0010(\u001a\u00020)J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0$J\b\u0010*\u001a\u00020)H\u0014J\u0006\u0010+\u001a\u00020)J\u0006\u0010,\u001a\u00020)J\u0006\u0010-\u001a\u00020)J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160$J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180$J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100$J\b\u0010.\u001a\u00020)H\u0002J\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0$J\u0010\u0010/\u001a\u00020)2\u0006\u00100\u001a\u000201H\u0002J\u0010\u0010/\u001a\u00020)2\u0006\u00102\u001a\u000203H\u0002J\u0010\u0010/\u001a\u00020)2\u0006\u00104\u001a\u000205H\u0002J\u0016\u0010/\u001a\u00020)2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\'07H\u0002J\b\u00108\u001a\u00020)H\u0002J\b\u00109\u001a\u00020)H\u0002J\u0010\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u000205H\u0002J\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0$J\u0010\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020>H\u0002J\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0$R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService;", "tradeService", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService;", "pendingAllowanceService", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapPendingAllowanceService;", "formatter", "Lio/horizontalsystems/bankwallet/modules/swap/SwapViewItemHelper;", "(Lio/horizontalsystems/bankwallet/modules/swap/SwapService;Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService;Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapPendingAllowanceService;Lio/horizontalsystems/bankwallet/modules/swap/SwapViewItemHelper;)V", "advancedSettingsVisibleLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "approveActionLiveData", "Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel$ActionState;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "isLoadingLiveData", "openApproveLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$ApproveData;", "openConfirmationLiveEvent", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData;", "proceedActionLiveData", "getService", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapService;", "swapErrorLiveData", "", "tradeOptionsViewItemLiveData", "Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel$TradeOptionsViewItem;", "getTradeService", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService;", "tradeViewItemLiveData", "Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel$TradeViewItem;", "Landroidx/lifecycle/LiveData;", "convert", "error", "", "didApprove", "", "onCleared", "onTapApprove", "onTapProceed", "onTapSwitch", "subscribeToServices", "sync", "serviceState", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService$State;", "tradeServiceState", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$State;", "swapTradeOptions", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptions;", "errors", "", "syncApproveAction", "syncProceedAction", "tradeOptionsViewItem", "tradeOptions", "tradeViewItem", "trade", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$Trade;", "ActionState", "TradeOptionsViewItem", "TradeViewItem", "app_debug"})
public final class SwapViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadingLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> swapErrorLiveData = null;
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.TradeViewItem> tradeViewItemLiveData = null;
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.TradeOptionsViewItem> tradeOptionsViewItemLiveData = null;
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.ActionState> proceedActionLiveData = null;
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.ActionState> approveActionLiveData = null;
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.ApproveData> openApproveLiveEvent = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> advancedSettingsVisibleLiveData = null;
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData> openConfirmationLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.swap.SwapService service = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService tradeService = null;
    private final io.horizontalsystems.bankwallet.modules.swap.allowance.SwapPendingAllowanceService pendingAllowanceService = null;
    private final io.horizontalsystems.bankwallet.modules.swap.SwapViewItemHelper formatter = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoadingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> swapErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.TradeViewItem> tradeViewItemLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.TradeOptionsViewItem> tradeOptionsViewItemLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.ActionState> proceedActionLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.ActionState> approveActionLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.ApproveData> openApproveLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> advancedSettingsVisibleLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData> openConfirmationLiveEvent() {
        return null;
    }
    
    public final void onTapSwitch() {
    }
    
    public final void onTapApprove() {
    }
    
    public final void onTapProceed() {
    }
    
    public final void didApprove() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void subscribeToServices() {
    }
    
    private final void sync(io.horizontalsystems.bankwallet.modules.swap.SwapService.State serviceState) {
    }
    
    private final java.lang.String convert(java.lang.Throwable error) {
        return null;
    }
    
    private final void sync(java.util.List<? extends java.lang.Throwable> errors) {
    }
    
    private final void sync(io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.State tradeServiceState) {
    }
    
    private final void sync(io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptions swapTradeOptions) {
    }
    
    private final void syncProceedAction() {
    }
    
    private final void syncApproveAction() {
    }
    
    private final io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.TradeViewItem tradeViewItem(io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.Trade trade) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.TradeOptionsViewItem tradeOptionsViewItem(io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptions tradeOptions) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.swap.SwapService getService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService getTradeService() {
        return null;
    }
    
    public SwapViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.SwapService service, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.SwapTradeService tradeService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.allowance.SwapPendingAllowanceService pendingAllowanceService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.SwapViewItemHelper formatter) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel$TradeViewItem;", "", "price", "", "priceImpact", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$PriceImpactViewItem;", "guaranteedAmount", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$GuaranteedAmountViewItem;", "(Ljava/lang/String;Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$PriceImpactViewItem;Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$GuaranteedAmountViewItem;)V", "getGuaranteedAmount", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$GuaranteedAmountViewItem;", "getPrice", "()Ljava/lang/String;", "getPriceImpact", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$PriceImpactViewItem;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class TradeViewItem {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String price = null;
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.bankwallet.modules.swap.SwapModule.PriceImpactViewItem priceImpact = null;
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.bankwallet.modules.swap.SwapModule.GuaranteedAmountViewItem guaranteedAmount = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.swap.SwapModule.PriceImpactViewItem getPriceImpact() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.swap.SwapModule.GuaranteedAmountViewItem getGuaranteedAmount() {
            return null;
        }
        
        public TradeViewItem(@org.jetbrains.annotations.Nullable()
        java.lang.String price, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.swap.SwapModule.PriceImpactViewItem priceImpact, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.swap.SwapModule.GuaranteedAmountViewItem guaranteedAmount) {
            super();
        }
        
        public TradeViewItem() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.swap.SwapModule.PriceImpactViewItem component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.swap.SwapModule.GuaranteedAmountViewItem component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.TradeViewItem copy(@org.jetbrains.annotations.Nullable()
        java.lang.String price, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.swap.SwapModule.PriceImpactViewItem priceImpact, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.swap.SwapModule.GuaranteedAmountViewItem guaranteedAmount) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel$TradeOptionsViewItem;", "", "slippage", "", "deadline", "recipient", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeadline", "()Ljava/lang/String;", "getRecipient", "getSlippage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class TradeOptionsViewItem {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String slippage = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String deadline = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String recipient = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSlippage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDeadline() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRecipient() {
            return null;
        }
        
        public TradeOptionsViewItem(@org.jetbrains.annotations.Nullable()
        java.lang.String slippage, @org.jetbrains.annotations.Nullable()
        java.lang.String deadline, @org.jetbrains.annotations.Nullable()
        java.lang.String recipient) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.TradeOptionsViewItem copy(@org.jetbrains.annotations.Nullable()
        java.lang.String slippage, @org.jetbrains.annotations.Nullable()
        java.lang.String deadline, @org.jetbrains.annotations.Nullable()
        java.lang.String recipient) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel$ActionState;", "", "()V", "Disabled", "Enabled", "Hidden", "Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel$ActionState$Hidden;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel$ActionState$Enabled;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel$ActionState$Disabled;", "app_debug"})
    public static abstract class ActionState {
        
        private ActionState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel$ActionState$Hidden;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel$ActionState;", "()V", "app_debug"})
        public static final class Hidden extends io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.ActionState {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.ActionState.Hidden INSTANCE = null;
            
            private Hidden() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel$ActionState$Enabled;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel$ActionState;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "app_debug"})
        public static final class Enabled extends io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.ActionState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String title = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTitle() {
                return null;
            }
            
            public Enabled(@org.jetbrains.annotations.NotNull()
            java.lang.String title) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel$ActionState$Disabled;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel$ActionState;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "app_debug"})
        public static final class Disabled extends io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.ActionState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String title = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTitle() {
                return null;
            }
            
            public Disabled(@org.jetbrains.annotations.NotNull()
            java.lang.String title) {
                super();
            }
        }
    }
}