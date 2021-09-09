package io.horizontalsystems.bankwallet.modules.walletconnect.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*+B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\bH\u0002J\b\u0010!\u001a\u00020\bH\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\bH\u0016J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u0010@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006,"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/main/DappInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lio/horizontalsystems/bankwallet/modules/walletconnect/main/DappInfoAdapter$ViewHolder;", "()V", "allItems", "", "Lio/horizontalsystems/bankwallet/modules/walletconnect/main/DappInfoAdapter$DappItemData;", "itemCount", "", "value", "", "signedTransactionsVisible", "getSignedTransactionsVisible", "()Z", "setSignedTransactionsVisible", "(Z)V", "Lio/horizontalsystems/bankwallet/modules/walletconnect/main/WalletConnectMainViewModel$Status;", "status", "getStatus", "()Lio/horizontalsystems/bankwallet/modules/walletconnect/main/WalletConnectMainViewModel$Status;", "setStatus", "(Lio/horizontalsystems/bankwallet/modules/walletconnect/main/WalletConnectMainViewModel$Status;)V", "", "url", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "visibleItems", "getVisibleItems", "()Ljava/util/List;", "getItem", "itemId", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DappItemData", "ViewHolder", "app_debug"})
public final class DappInfoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<io.horizontalsystems.bankwallet.modules.walletconnect.main.DappInfoAdapter.ViewHolder> {
    private final java.util.List<io.horizontalsystems.bankwallet.modules.walletconnect.main.DappInfoAdapter.DappItemData> allItems = null;
    private int itemCount;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.walletconnect.main.WalletConnectMainViewModel.Status status;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String url = "";
    private boolean signedTransactionsVisible = false;
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.walletconnect.main.DappInfoAdapter.DappItemData> getVisibleItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.walletconnect.main.WalletConnectMainViewModel.Status getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.walletconnect.main.WalletConnectMainViewModel.Status value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final boolean getSignedTransactionsVisible() {
        return false;
    }
    
    public final void setSignedTransactionsVisible(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.walletconnect.main.DappInfoAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.walletconnect.main.DappInfoAdapter.ViewHolder holder, int position) {
    }
    
    private final io.horizontalsystems.bankwallet.modules.walletconnect.main.DappInfoAdapter.DappItemData getItem(int itemId) {
        return null;
    }
    
    public DappInfoAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\"\u001a\u00020\tH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006#"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/main/DappInfoAdapter$DappItemData;", "", "titleStringResId", "", "(I)V", "getTitleStringResId", "()I", "setTitleStringResId", "value", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "valueColor", "getValueColor", "()Ljava/lang/Integer;", "setValueColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "valueStringResId", "getValueStringResId", "setValueStringResId", "visible", "", "getVisible", "()Z", "setVisible", "(Z)V", "component1", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
    public static final class DappItemData {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String value;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer valueStringResId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer valueColor;
        private boolean visible = false;
        private int titleStringResId;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getValue() {
            return null;
        }
        
        public final void setValue(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getValueStringResId() {
            return null;
        }
        
        public final void setValueStringResId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getValueColor() {
            return null;
        }
        
        public final void setValueColor(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        public final boolean getVisible() {
            return false;
        }
        
        public final void setVisible(boolean p0) {
        }
        
        public final int getTitleStringResId() {
            return 0;
        }
        
        public final void setTitleStringResId(int p0) {
        }
        
        public DappItemData(int titleStringResId) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.walletconnect.main.DappInfoAdapter.DappItemData copy(int titleStringResId) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/main/DappInfoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "(Landroid/view/View;)V", "getContainerView", "()Landroid/view/View;", "bind", "", "dappItemData", "Lio/horizontalsystems/bankwallet/modules/walletconnect/main/DappInfoAdapter$DappItemData;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View containerView = null;
        private java.util.HashMap _$_findViewCache;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.walletconnect.main.DappInfoAdapter.DappItemData dappItemData) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getContainerView() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View containerView) {
            super(null);
        }
    }
}