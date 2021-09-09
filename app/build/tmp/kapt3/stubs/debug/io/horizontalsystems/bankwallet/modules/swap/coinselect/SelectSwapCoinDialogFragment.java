package io.horizontalsystems.bankwallet.modules.swap.coinselect;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/coinselect/SelectSwapCoinDialogFragment;", "Lio/horizontalsystems/bankwallet/core/BaseWithSearchDialogFragment;", "()V", "viewModel", "Lio/horizontalsystems/bankwallet/modules/swap/coinselect/SelectSwapCoinViewModel;", "closeWithResult", "", "coinBalanceItem", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$CoinBalanceItem;", "requestId", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "updateFilter", "query", "", "Companion", "app_debug"})
public final class SelectSwapCoinDialogFragment extends io.horizontalsystems.bankwallet.core.BaseWithSearchDialogFragment {
    private io.horizontalsystems.bankwallet.modules.swap.coinselect.SelectSwapCoinViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String resultBundleKey = "selectSwapCoinResultKey";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String coinBalanceItemsListKey = "coinBalanceItemsListKey";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String requestIdKey = "requestIdKey";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String coinBalanceItemResultKey = "coinBalanceItemResultKey";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.swap.coinselect.SelectSwapCoinDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
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
    
    @java.lang.Override()
    public void updateFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    private final void closeWithResult(io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem coinBalanceItem, int requestId) {
    }
    
    public SelectSwapCoinDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/coinselect/SelectSwapCoinDialogFragment$Companion;", "", "()V", "coinBalanceItemResultKey", "", "coinBalanceItemsListKey", "requestIdKey", "resultBundleKey", "params", "Landroid/os/Bundle;", "requestId", "", "coinBalanceItems", "Ljava/util/ArrayList;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$CoinBalanceItem;", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle params(int requestId, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem> coinBalanceItems) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}