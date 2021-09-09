package io.horizontalsystems.bankwallet.modules.swap.coinselect;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/coinselect/SelectSwapCoinViewModel;", "Landroidx/lifecycle/ViewModel;", "coins", "", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$CoinBalanceItem;", "(Ljava/util/List;)V", "coinItemsLivedData", "Landroidx/lifecycle/MutableLiveData;", "getCoinItemsLivedData", "()Landroidx/lifecycle/MutableLiveData;", "filter", "", "filtered", "items", "syncViewState", "", "updateFilter", "newText", "app_debug"})
public final class SelectSwapCoinViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem>> coinItemsLivedData = null;
    private java.lang.String filter;
    private final java.util.List<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem> coins = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem>> getCoinItemsLivedData() {
        return null;
    }
    
    public final void updateFilter(@org.jetbrains.annotations.Nullable()
    java.lang.String newText) {
    }
    
    private final void syncViewState() {
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem> filtered(java.util.List<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem> items) {
        return null;
    }
    
    public SelectSwapCoinViewModel(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem> coins) {
        super();
    }
}