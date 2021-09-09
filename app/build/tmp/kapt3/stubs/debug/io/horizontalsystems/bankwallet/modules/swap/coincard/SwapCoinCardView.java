package io.horizontalsystems.bankwallet.modules.swap.coincard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0019\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\nH\u0002J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\nH\u0002J\u0012\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0011H\u0002\u00a8\u0006 "}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/coincard/SwapCoinCardView;", "Landroidx/cardview/widget/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "amountsEqual", "", "amount1", "Ljava/math/BigDecimal;", "amount2", "initialize", "", "title", "", "viewModel", "Lio/horizontalsystems/bankwallet/modules/swap/coincard/SwapCoinCardViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "observe", "setBalance", "balance", "setBalanceError", "show", "setEstimated", "setTokenCode", "code", "app_debug"})
public final class SwapCoinCardView extends androidx.cardview.widget.CardView {
    private java.util.HashMap _$_findViewCache;
    
    public final void initialize(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.coincard.SwapCoinCardViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
    }
    
    private final void observe(io.horizontalsystems.bankwallet.modules.swap.coincard.SwapCoinCardViewModel viewModel, androidx.lifecycle.LifecycleOwner lifecycleOwner) {
    }
    
    private final boolean amountsEqual(java.math.BigDecimal amount1, java.math.BigDecimal amount2) {
        return false;
    }
    
    private final void setTokenCode(java.lang.String code) {
    }
    
    private final void setBalance(java.lang.String balance) {
    }
    
    private final void setBalanceError(boolean show) {
    }
    
    private final void setEstimated(boolean show) {
    }
    
    public SwapCoinCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public SwapCoinCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public SwapCoinCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}