package io.horizontalsystems.bankwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tJ\u0016\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u001e\u0010\u001e\u001a\u00020\r*\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00152\b\b\u0002\u0010 \u001a\u00020!H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "listener", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceItemsAdapter$Listener;", "(Landroid/view/View;Lio/horizontalsystems/bankwallet/modules/balance/BalanceItemsAdapter$Listener;)V", "balanceViewItem", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceViewItem;", "getContainerView", "()Landroid/view/View;", "bind", "", "item", "bindUpdate", "current", "prev", "getRateDiffTextColor", "", "dimmed", "", "getRateDiffTintList", "Landroid/content/res/ColorStateList;", "setRateDiff", "rDiff", "Lio/horizontalsystems/bankwallet/modules/balance/RateDiff;", "setTextSyncing", "syncingData", "Lio/horizontalsystems/bankwallet/modules/balance/SyncingData;", "dimIf", "condition", "dimmedAlpha", "", "app_debug"})
public final class BalanceItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
    private io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem balanceViewItem;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View containerView = null;
    private final io.horizontalsystems.bankwallet.modules.balance.BalanceItemsAdapter.Listener listener = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem item) {
    }
    
    public final void bindUpdate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem current, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem prev) {
    }
    
    private final void setRateDiff(io.horizontalsystems.bankwallet.modules.balance.RateDiff rDiff) {
    }
    
    private final int getRateDiffTextColor(boolean dimmed) {
        return 0;
    }
    
    private final android.content.res.ColorStateList getRateDiffTintList(boolean dimmed) {
        return null;
    }
    
    private final void setTextSyncing(io.horizontalsystems.bankwallet.modules.balance.SyncingData syncingData) {
    }
    
    private final void dimIf(android.view.View $this$dimIf, boolean condition, float dimmedAlpha) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getContainerView() {
        return null;
    }
    
    public BalanceItemViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View containerView, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceItemsAdapter.Listener listener) {
        super(null);
    }
}