package io.horizontalsystems.bankwallet.ui.selector;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010$\u001a\u00020\u0013H\u0002J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016R&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u0006-"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/selector/SelectorPopupDialog;", "ItemClass", "Landroidx/fragment/app/DialogFragment;", "()V", "itemViewHolderFactory", "Lio/horizontalsystems/bankwallet/ui/selector/ItemViewHolderFactory;", "Lio/horizontalsystems/bankwallet/ui/selector/ItemViewHolder;", "getItemViewHolderFactory", "()Lio/horizontalsystems/bankwallet/ui/selector/ItemViewHolderFactory;", "setItemViewHolderFactory", "(Lio/horizontalsystems/bankwallet/ui/selector/ItemViewHolderFactory;)V", "items", "", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "onSelectListener", "Lkotlin/Function1;", "", "getOnSelectListener", "()Lkotlin/jvm/functions/Function1;", "setOnSelectListener", "(Lkotlin/jvm/functions/Function1;)V", "selectedItem", "getSelectedItem", "()Ljava/lang/Object;", "setSelectedItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "titleText", "", "getTitleText", "()Ljava/lang/String;", "setTitleText", "(Ljava/lang/String;)V", "hideKeyBoard", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class SelectorPopupDialog<ItemClass extends java.lang.Object> extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends ItemClass> items;
    @org.jetbrains.annotations.Nullable()
    private ItemClass selectedItem;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super ItemClass, kotlin.Unit> onSelectListener;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String titleText = "";
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
    public final io.horizontalsystems.bankwallet.ui.selector.ItemViewHolderFactory<io.horizontalsystems.bankwallet.ui.selector.ItemViewHolder<ItemClass>> getItemViewHolderFactory() {
        return null;
    }
    
    public final void setItemViewHolderFactory(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.selector.ItemViewHolderFactory<io.horizontalsystems.bankwallet.ui.selector.ItemViewHolder<ItemClass>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void hideKeyBoard() {
    }
    
    public SelectorPopupDialog() {
        super();
    }
}