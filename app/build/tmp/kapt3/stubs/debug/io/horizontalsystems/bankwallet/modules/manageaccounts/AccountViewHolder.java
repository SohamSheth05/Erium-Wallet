package io.horizontalsystems.bankwallet.modules.manageaccounts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0002\u0012\u0013B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/manageaccounts/AccountViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "listener", "Lio/horizontalsystems/bankwallet/modules/manageaccounts/AccountViewHolder$Listener;", "(Landroid/view/View;Lio/horizontalsystems/bankwallet/modules/manageaccounts/AccountViewHolder$Listener;)V", "getContainerView", "()Landroid/view/View;", "getListener", "()Lio/horizontalsystems/bankwallet/modules/manageaccounts/AccountViewHolder$Listener;", "bind", "", "account", "Lio/horizontalsystems/bankwallet/modules/manageaccounts/ManageAccountsModule$AccountViewItem;", "position", "Lio/horizontalsystems/views/ListPosition;", "Companion", "Listener", "app_debug"})
public final class AccountViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
    @org.jetbrains.annotations.NotNull()
    private final android.view.View containerView = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.manageaccounts.AccountViewHolder.Listener listener = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.manageaccounts.AccountViewHolder.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsModule.AccountViewItem account, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.views.ListPosition position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getContainerView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.manageaccounts.AccountViewHolder.Listener getListener() {
        return null;
    }
    
    public AccountViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View containerView, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.manageaccounts.AccountViewHolder.Listener listener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/manageaccounts/AccountViewHolder$Listener;", "", "onEdit", "", "accountViewItem", "Lio/horizontalsystems/bankwallet/modules/manageaccounts/ManageAccountsModule$AccountViewItem;", "onSelect", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onSelect(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsModule.AccountViewItem accountViewItem);
        
        public abstract void onEdit(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.manageaccounts.ManageAccountsModule.AccountViewItem accountViewItem);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/manageaccounts/AccountViewHolder$Companion;", "", "()V", "create", "Lio/horizontalsystems/bankwallet/modules/manageaccounts/AccountViewHolder;", "parent", "Landroid/view/ViewGroup;", "listener", "Lio/horizontalsystems/bankwallet/modules/manageaccounts/AccountViewHolder$Listener;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.manageaccounts.AccountViewHolder create(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.manageaccounts.AccountViewHolder.Listener listener) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}