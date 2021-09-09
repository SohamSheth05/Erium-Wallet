package io.horizontalsystems.bankwallet.ui.selector;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\'\"\u0004\b,\u0010)\u00a8\u00062"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/selector/SelectorBottomSheetDialog;", "ItemClass", "Lio/horizontalsystems/bankwallet/ui/extensions/BaseBottomSheetDialogFragment;", "()V", "headerIconResourceId", "", "getHeaderIconResourceId", "()I", "setHeaderIconResourceId", "(I)V", "itemViewHolderFactory", "Lio/horizontalsystems/bankwallet/ui/selector/ItemViewHolderFactory;", "Lio/horizontalsystems/bankwallet/ui/selector/ItemViewHolder;", "getItemViewHolderFactory", "()Lio/horizontalsystems/bankwallet/ui/selector/ItemViewHolderFactory;", "setItemViewHolderFactory", "(Lio/horizontalsystems/bankwallet/ui/selector/ItemViewHolderFactory;)V", "items", "", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "onSelectListener", "Lkotlin/Function1;", "", "getOnSelectListener", "()Lkotlin/jvm/functions/Function1;", "setOnSelectListener", "(Lkotlin/jvm/functions/Function1;)V", "selectedItem", "getSelectedItem", "()Ljava/lang/Object;", "setSelectedItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "subtitleText", "", "getSubtitleText", "()Ljava/lang/String;", "setSubtitleText", "(Ljava/lang/String;)V", "titleText", "getTitleText", "setTitleText", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class SelectorBottomSheetDialog<ItemClass extends java.lang.Object> extends io.horizontalsystems.bankwallet.ui.extensions.BaseBottomSheetDialogFragment {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends ItemClass> items;
    @org.jetbrains.annotations.Nullable()
    private ItemClass selectedItem;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super ItemClass, kotlin.Unit> onSelectListener;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String titleText = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String subtitleText = "";
    @androidx.annotation.DrawableRes()
    private int headerIconResourceId = 0;
    public io.horizontalsystems.bankwallet.ui.selector.ItemViewHolderFactory<io.horizontalsystems.bankwallet.ui.selector.ItemViewHolder<ItemClass>> itemViewHolderFactory;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<ItemClass> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends ItemClass> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ItemClass getSelectedItem() {
        return null;
    }
    
    public final void setSelectedItem(@org.jetbrains.annotations.Nullable()
    ItemClass p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<ItemClass, kotlin.Unit> getOnSelectListener() {
        return null;
    }
    
    public final void setOnSelectListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super ItemClass, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitleText() {
        return null;
    }
    
    public final void setTitleText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubtitleText() {
        return null;
    }
    
    public final void setSubtitleText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getHeaderIconResourceId() {
        return 0;
    }
    
    public final void setHeaderIconResourceId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.ui.selector.ItemViewHolderFactory<io.horizontalsystems.bankwallet.ui.selector.ItemViewHolder<ItemClass>> getItemViewHolderFactory() {
        return null;
    }
    
    public final void setItemViewHolderFactory(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.selector.ItemViewHolderFactory<io.horizontalsystems.bankwallet.ui.selector.ItemViewHolder<ItemClass>> p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public SelectorBottomSheetDialog() {
        super();
    }
}