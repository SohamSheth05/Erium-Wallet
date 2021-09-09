package io.horizontalsystems.bankwallet.ui.selector;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&R\u001e\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/selector/ItemViewHolder;", "ItemClass", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "item", "getItem", "()Ljava/lang/Object;", "setItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "bind", "", "selected", "", "app_debug"})
public abstract class ItemViewHolder<ItemClass extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.Nullable()
    private ItemClass item;
    
    @org.jetbrains.annotations.Nullable()
    public final ItemClass getItem() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.Nullable()
    ItemClass p0) {
    }
    
    public abstract void bind(boolean selected);
    
    public ItemViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null);
    }
}