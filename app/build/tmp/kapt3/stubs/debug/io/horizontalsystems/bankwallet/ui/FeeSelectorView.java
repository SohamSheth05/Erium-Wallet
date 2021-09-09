package io.horizontalsystems.bankwallet.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020#J4\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010 \u001a\u00020!2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0,J\u0010\u0010-\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010/J\u000e\u00100\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020#J\u000e\u00101\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020#R5\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R5\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u000e0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R5\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000e0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012\u00a8\u00062"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/FeeSelectorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "customFeeSeekBarListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "", "getCustomFeeSeekBarListener", "()Lkotlin/jvm/functions/Function1;", "setCustomFeeSeekBarListener", "(Lkotlin/jvm/functions/Function1;)V", "onTxSpeedClickListener", "Landroid/view/View;", "view", "getOnTxSpeedClickListener", "setOnTxSpeedClickListener", "prioritySelectListener", "position", "getPrioritySelectListener", "setPrioritySelectListener", "openPrioritySelector", "items", "", "Lio/horizontalsystems/bankwallet/core/ethereum/SendPriorityViewItem;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "setEstimatedFeeText", "", "setFeeSelectorViewInteractions", "sendFeeViewModel", "Lio/horizontalsystems/bankwallet/core/ethereum/ISendFeeViewModel;", "sendFeePriorityViewModel", "Lio/horizontalsystems/bankwallet/core/ethereum/ISendFeePriorityViewModel;", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "showSpeedInfoListener", "Lkotlin/Function0;", "setFeeSliderViewItem", "viewItem", "Lio/horizontalsystems/bankwallet/core/ethereum/SendFeeSliderViewItem;", "setFeeText", "setPriorityText", "app_debug"})
public final class FeeSelectorView extends androidx.constraintlayout.widget.ConstraintLayout {
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onTxSpeedClickListener;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> prioritySelectListener;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> customFeeSeekBarListener;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> getOnTxSpeedClickListener() {
        return null;
    }
    
    public final void setOnTxSpeedClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getPrioritySelectListener() {
        return null;
    }
    
    public final void setPrioritySelectListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getCustomFeeSeekBarListener() {
        return null;
    }
    
    public final void setCustomFeeSeekBarListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    public final void setEstimatedFeeText(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final void setFeeText(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final void setPriorityText(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final void setFeeSliderViewItem(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.core.ethereum.SendFeeSliderViewItem viewItem) {
    }
    
    public final void openPrioritySelector(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.core.ethereum.SendPriorityViewItem> items, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager) {
    }
    
    public final void setFeeSelectorViewInteractions(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ethereum.ISendFeeViewModel sendFeeViewModel, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ethereum.ISendFeePriorityViewModel sendFeePriorityViewModel, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner viewLifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> showSpeedInfoListener) {
    }
    
    public FeeSelectorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public FeeSelectorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public FeeSelectorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}