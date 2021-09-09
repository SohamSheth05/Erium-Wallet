package io.horizontalsystems.bankwallet.modules.swap;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0012\u0010*\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010,H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006."}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapFragment;", "Lio/horizontalsystems/bankwallet/core/BaseFragment;", "()V", "allowanceViewModel", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceViewModel;", "getAllowanceViewModel", "()Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceViewModel;", "allowanceViewModel$delegate", "Lkotlin/Lazy;", "viewModel", "Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel;", "getViewModel", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel;", "viewModel$delegate", "vmFactory", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Factory;", "getVmFactory", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Factory;", "vmFactory$delegate", "handleButtonAction", "", "button", "Landroid/widget/Button;", "action", "Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel$ActionState;", "observeViewModel", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "priceImpactColor", "", "ctx", "Landroid/content/Context;", "priceImpactLevel", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$PriceImpactLevel;", "setTradeViewItem", "tradeViewItem", "Lio/horizontalsystems/bankwallet/modules/swap/SwapViewModel$TradeViewItem;", "Companion", "app_debug"})
public final class SwapFragment extends io.horizontalsystems.bankwallet.core.BaseFragment {
    private final kotlin.Lazy vmFactory$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy allowanceViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String fromCoinKey = "fromCoinKey";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.swap.SwapFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final io.horizontalsystems.bankwallet.modules.swap.SwapModule.Factory getVmFactory() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.swap.SwapViewModel getViewModel() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceViewModel getAllowanceViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observeViewModel() {
    }
    
    private final void handleButtonAction(android.widget.Button button, io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.ActionState action) {
    }
    
    private final void setTradeViewItem(io.horizontalsystems.bankwallet.modules.swap.SwapViewModel.TradeViewItem tradeViewItem) {
    }
    
    private final int priceImpactColor(android.content.Context ctx, io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.PriceImpactLevel priceImpactLevel) {
        return 0;
    }
    
    public SwapFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapFragment$Companion;", "", "()V", "fromCoinKey", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}