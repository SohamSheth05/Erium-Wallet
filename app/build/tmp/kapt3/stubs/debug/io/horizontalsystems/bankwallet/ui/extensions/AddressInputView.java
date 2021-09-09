package io.horizontalsystems.bankwallet.ui.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010*\u001a\u00020\u001d2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001d0,J\u001c\u0010-\u001a\u00020\u001d2\u0014\u0010+\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u001d0\u0018J\u001c\u0010.\u001a\u00020\u001d2\u0014\u0010+\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u001d0\u0018J\u0010\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\'H\u0002J\u000e\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\'J\u0010\u00103\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u000105J\u0010\u00106\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019J\u000e\u00107\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\'J\u001a\u00109\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010:\u001a\u00020\'J$\u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001d0,R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0015\u0010\fR-\u0010\u0017\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0019\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R-\u0010\u001e\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0019\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\u000e\u001a\u0004\b#\u0010$R\u000e\u0010&\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/extensions/AddressInputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "buttonDelete", "Landroid/widget/ImageButton;", "getButtonDelete", "()Landroid/widget/ImageButton;", "buttonDelete$delegate", "Lkotlin/Lazy;", "buttonPaste", "Landroid/widget/Button;", "getButtonPaste", "()Landroid/widget/Button;", "buttonPaste$delegate", "buttonQrScan", "getButtonQrScan", "buttonQrScan$delegate", "onPasteCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "text", "", "onTextChangeCallback", "params", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar$delegate", "showQrButton", "", "textWatcher", "Landroid/text/TextWatcher;", "onButtonQrScanClick", "callback", "Lkotlin/Function0;", "onPasteText", "onTextChange", "setDeleteButtonVisibility", "visible", "setEditable", "isEditable", "setError", "caution", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/Caution;", "setHint", "setSpinner", "isVisible", "setText", "skipChangeEvent", "setViewModel", "viewModel", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/RecipientAddressViewModel;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onClickQrScan", "app_debug"})
public final class AddressInputView extends androidx.constraintlayout.widget.ConstraintLayout {
    private boolean showQrButton = false;
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTextChangeCallback;
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onPasteCallback;
    private final android.text.TextWatcher textWatcher = null;
    private final androidx.constraintlayout.widget.ConstraintLayout.LayoutParams params = null;
    private final kotlin.Lazy buttonPaste$delegate = null;
    private final kotlin.Lazy buttonQrScan$delegate = null;
    private final kotlin.Lazy buttonDelete$delegate = null;
    private final kotlin.Lazy progressBar$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final android.widget.Button getButtonPaste() {
        return null;
    }
    
    private final android.widget.ImageButton getButtonQrScan() {
        return null;
    }
    
    private final android.widget.ImageButton getButtonDelete() {
        return null;
    }
    
    private final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.Nullable()
    java.lang.String text, boolean skipChangeEvent) {
    }
    
    public final void setHint(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution caution) {
    }
    
    public final void onTextChange(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
    }
    
    public final void onPasteText(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
    }
    
    public final void setSpinner(boolean isVisible) {
    }
    
    public final void onButtonQrScanClick(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public final void setEditable(boolean isEditable) {
    }
    
    private final void setDeleteButtonVisibility(boolean visible) {
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.tradeoptions.RecipientAddressViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClickQrScan) {
    }
    
    public AddressInputView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public AddressInputView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public AddressInputView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}