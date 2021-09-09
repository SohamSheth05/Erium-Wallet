package io.horizontalsystems.bankwallet.ui.selector;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/selector/ItemViewHolderFactory;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "create", "parent", "Landroid/view/ViewGroup;", "viewType", "", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "app_debug"})
public abstract interface ItemViewHolderFactory<VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract VH create(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType);
}