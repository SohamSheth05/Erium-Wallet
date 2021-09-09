package io.horizontalsystems.bankwallet.ui.extensions.coinlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinViewItem;", "Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinWithSwitchViewHolder;", "listener", "Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinListAdapter$Listener;", "(Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinListAdapter$Listener;)V", "disableCoin", "", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onSwitchToggle", "isChecked", "Companion", "Listener", "app_debug"})
public final class CoinListAdapter extends androidx.recyclerview.widget.ListAdapter<io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinViewItem, io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinWithSwitchViewHolder> {
    private final io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinListAdapter.Listener listener = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinViewItem> diffCallback = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinListAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinWithSwitchViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinWithSwitchViewHolder holder, int position) {
    }
    
    private final void onSwitchToggle(boolean isChecked, io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public final boolean disableCoin(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
        return false;
    }
    
    public CoinListAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinListAdapter.Listener listener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinListAdapter$Listener;", "", "disable", "", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "edit", "enable", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void enable(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin);
        
        public abstract void disable(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin);
        
        public abstract void edit(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin);
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            public static void edit(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinListAdapter.Listener $this, @org.jetbrains.annotations.NotNull()
            io.horizontalsystems.coinkit2.models.Coin coin) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinListAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinViewItem;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}