package io.horizontalsystems.bankwallet.ui.extensions.coinlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0004J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0016\u0010\u001a\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u001a\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0004J\u0010\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020%H\u0004R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006&"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinListBaseFragment;", "Lio/horizontalsystems/bankwallet/core/BaseWithSearchFragment;", "Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinListAdapter$Listener;", "()V", "featuredItemsAdapter", "Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinListAdapter;", "itemsAdapter", "title", "", "getTitle", "()Ljava/lang/CharSequence;", "disable", "", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "disableCoin", "enable", "onCancelSelection", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSelect", "indexes", "", "", "onViewCreated", "view", "setViewState", "viewState", "Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinViewState;", "showBottomSelectorDialog", "config", "Lio/horizontalsystems/bankwallet/modules/blockchainsettings/BlockchainSettingsModule$Config;", "app_debug"})
public abstract class CoinListBaseFragment extends io.horizontalsystems.bankwallet.core.BaseWithSearchFragment implements io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinListAdapter.Listener {
    private io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinListAdapter featuredItemsAdapter;
    private io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinListAdapter itemsAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.CharSequence getTitle();
    
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
    public void enable(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    @java.lang.Override()
    public void disable(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    protected final void setViewState(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinViewState viewState) {
    }
    
    protected final void disableCoin(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public void onCancelSelection() {
    }
    
    public void onSelect(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> indexes) {
    }
    
    protected final void showBottomSelectorDialog(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.blockchainsettings.BlockchainSettingsModule.Config config) {
    }
    
    public CoinListBaseFragment() {
        super();
    }
    
    public void edit(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
}