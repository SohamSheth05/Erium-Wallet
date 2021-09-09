package io.horizontalsystems.bankwallet.modules.swap.coinselect;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/coinselect/SelectSwapCoinAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lio/horizontalsystems/bankwallet/modules/swap/coinselect/SelectSwapCoinViewHolder;", "onClickItem", "Lkotlin/Function1;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$CoinBalanceItem;", "", "(Lkotlin/jvm/functions/Function1;)V", "items", "", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class SelectSwapCoinAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<io.horizontalsystems.bankwallet.modules.swap.coinselect.SelectSwapCoinViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem> items;
    private final kotlin.jvm.functions.Function1<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem, kotlin.Unit> onClickItem = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem> p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.swap.coinselect.SelectSwapCoinViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.coinselect.SelectSwapCoinViewHolder holder, int position) {
    }
    
    public SelectSwapCoinAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem, kotlin.Unit> onClickItem) {
        super();
    }
}