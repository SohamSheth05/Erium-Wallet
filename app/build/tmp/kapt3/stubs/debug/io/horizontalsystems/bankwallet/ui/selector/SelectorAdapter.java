package io.horizontalsystems.bankwallet.ui.selector;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/selector/SelectorAdapter;", "ItemClass", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lio/horizontalsystems/bankwallet/ui/selector/ItemViewHolder;", "items", "", "selectedItem", "itemViewHolderFactory", "Lio/horizontalsystems/bankwallet/ui/selector/ItemViewHolderFactory;", "onSelectListener", "Lkotlin/Function1;", "", "(Ljava/util/List;Ljava/lang/Object;Lio/horizontalsystems/bankwallet/ui/selector/ItemViewHolderFactory;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/Object;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class SelectorAdapter<ItemClass extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<io.horizontalsystems.bankwallet.ui.selector.ItemViewHolder<ItemClass>> {
    private final java.util.List<ItemClass> items = null;
    private ItemClass selectedItem;
    private final io.horizontalsystems.bankwallet.ui.selector.ItemViewHolderFactory<io.horizontalsystems.bankwallet.ui.selector.ItemViewHolder<ItemClass>> itemViewHolderFactory = null;
    private final kotlin.jvm.functions.Function1<ItemClass, kotlin.Unit> onSelectListener = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.ui.selector.ItemViewHolder<ItemClass> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.selector.ItemViewHolder<ItemClass> holder, int position) {
    }
    
    public SelectorAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends ItemClass> items, @org.jetbrains.annotations.Nullable()
    ItemClass selectedItem, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.selector.ItemViewHolderFactory<io.horizontalsystems.bankwallet.ui.selector.ItemViewHolder<ItemClass>> itemViewHolderFactory, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ItemClass, kotlin.Unit> onSelectListener) {
        super();
    }
}