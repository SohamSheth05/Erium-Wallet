package io.horizontalsystems.bankwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0016\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#J\u001e\u0010$\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceCellAnimator;", "", "()V", "animationPlaybackSpeed", "", "balanceWrapperHeight", "", "collapsedBalanceHiddenHeight", "collapsedHeight", "expandedHeight", "expandedHeightBalanceHidden", "listItemExpandDuration", "", "getListItemExpandDuration", "()J", "lockedBalanceWrapperHeight", "measured", "", "getHeight", "expanded", "balanceHidden", "showLocked", "measureHeights", "", "holder", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceItemViewHolder;", "setExpandProgress", "view", "Landroid/view/View;", "smallHeight", "bigHeight", "progress", "", "toggleBalanceAndButtons", "viewItem", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceViewItem;", "toggleBalanceAndButtonsAnimate", "current", "prev", "app_debug"})
public final class BalanceCellAnimator {
    private static int lockedBalanceWrapperHeight = -1;
    private static int balanceWrapperHeight = -1;
    private static int collapsedHeight = -1;
    private static int expandedHeight = -1;
    private static int expandedHeightBalanceHidden = -1;
    private static int collapsedBalanceHiddenHeight = -1;
    private static final double animationPlaybackSpeed = 1.3;
    private static boolean measured = false;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.balance.BalanceCellAnimator INSTANCE = null;
    
    private final long getListItemExpandDuration() {
        return 0L;
    }
    
    public final void measureHeights(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceItemViewHolder holder) {
    }
    
    private final int getHeight(boolean expanded, boolean balanceHidden, boolean showLocked) {
        return 0;
    }
    
    public final void toggleBalanceAndButtons(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceItemViewHolder holder, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem) {
    }
    
    public final void toggleBalanceAndButtonsAnimate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceItemViewHolder holder, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem current, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem prev) {
    }
    
    private final void setExpandProgress(android.view.View view, int smallHeight, int bigHeight, float progress) {
    }
    
    private BalanceCellAnimator() {
        super();
    }
}