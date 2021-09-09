package io.horizontalsystems.bankwallet.ui.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\u0013\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015J\u0014\u0010\u0016\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015JB\u0010\u0017\u001a\u00020\u00102:\u0010\u0014\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u000b\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u000b\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\nJ\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000bJ\u000e\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000bJ$\u0010 \u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010!\u001a\u00020\u001a2\b\b\u0002\u0010\"\u001a\u00020\u001aJ\u0016\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'RD\u0010\t\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\u000b\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u000b\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lio/horizontalsystems/bankwallet/ui/extensions/InputWithButtonsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onTextChangeCallback", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "old", "new", "", "textWatcher", "Landroid/text/TextWatcher;", "onLeftButtonClick", "callback", "Lkotlin/Function0;", "onRightButtonClick", "onTextChange", "setDeleteButtonVisibility", "visible", "", "setError", "text", "setHint", "setLeftButtonTitle", "setRightButtonTitle", "setText", "skipChangeEvent", "shakeAnimate", "setViewModel", "viewModel", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/IVerifiedInputViewModel;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "app_debug"})
public final class InputWithButtonsView extends androidx.constraintlayout.widget.ConstraintLayout {
    private kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> onTextChangeCallback;
    private final android.text.TextWatcher textWatcher = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void setText(@org.jetbrains.annotations.Nullable()
    java.lang.String text, boolean skipChangeEvent, boolean shakeAnimate) {
    }
    
    public final void setHint(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    public final void onTextChange(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> callback) {
    }
    
    public final void setLeftButtonTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void onLeftButtonClick(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public final void setRightButtonTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void onRightButtonClick(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    private final void setDeleteButtonVisibility(boolean visible) {
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.tradeoptions.IVerifiedInputViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
    }
    
    public InputWithButtonsView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public InputWithButtonsView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public InputWithButtonsView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}