package io.horizontalsystems.bankwallet.ui.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00018B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\'\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020*H\u0002J\u0018\u0010+\u001a\u00020\u00072\u0006\u0010)\u001a\u00020*2\u0006\u0010,\u001a\u00020\nH\u0002J\u0010\u0010-\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010\u001cJ\u001a\u0010/\u001a\u00020\u00122\b\u00100\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u00101\u001a\u00020\nJ\u0006\u00102\u001a\u00020\u0012J\u000e\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u000205J\u0010\u00106\u001a\u00020\u00122\b\u00100\u001a\u0004\u0018\u00010\u001cJ\b\u00107\u001a\u00020\u0012H\u0002R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016RP\u0010\u001a\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\u001c\u00a2\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001c\u00a2\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/extensions/AmountInputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "maxButtonVisible", "getMaxButtonVisible", "()Z", "setMaxButtonVisible", "(Z)V", "onTapMaxCallback", "Lkotlin/Function0;", "", "getOnTapMaxCallback", "()Lkotlin/jvm/functions/Function0;", "setOnTapMaxCallback", "(Lkotlin/jvm/functions/Function0;)V", "onTapSecondaryCallback", "getOnTapSecondaryCallback", "setOnTapSecondaryCallback", "onTextChangeCallback", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "prevText", "newText", "getOnTextChangeCallback", "()Lkotlin/jvm/functions/Function2;", "setOnTextChangeCallback", "(Lkotlin/jvm/functions/Function2;)V", "textWatcher", "Landroid/text/TextWatcher;", "getAmount", "getPrimaryTextColor", "type", "Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService$AmountType;", "getSecondaryTextColor", "switchEnabled", "revertAmount", "amount", "setAmount", "text", "skipChangeEvent", "setFocus", "setInputParams", "inputParams", "Lio/horizontalsystems/bankwallet/ui/extensions/AmountInputView$InputParams;", "setSecondaryText", "syncButtonStates", "InputParams", "app_debug"})
public final class AmountInputView extends androidx.constraintlayout.widget.ConstraintLayout {
    private boolean maxButtonVisible = false;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> onTextChangeCallback;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onTapMaxCallback;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onTapSecondaryCallback;
    private final android.text.TextWatcher textWatcher = null;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean getMaxButtonVisible() {
        return false;
    }
    
    public final void setMaxButtonVisible(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> getOnTextChangeCallback() {
        return null;
    }
    
    public final void setOnTextChangeCallback(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnTapMaxCallback() {
        return null;
    }
    
    public final void setOnTapMaxCallback(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnTapSecondaryCallback() {
        return null;
    }
    
    public final void setOnTapSecondaryCallback(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAmount() {
        return null;
    }
    
    public final void setAmount(@org.jetbrains.annotations.Nullable()
    java.lang.String text, boolean skipChangeEvent) {
    }
    
    public final void setInputParams(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.extensions.AmountInputView.InputParams inputParams) {
    }
    
    private final int getPrimaryTextColor(io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.AmountType type) {
        return 0;
    }
    
    private final int getSecondaryTextColor(io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.AmountType type, boolean switchEnabled) {
        return 0;
    }
    
    public final void setSecondaryText(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    public final void setFocus() {
    }
    
    public final void revertAmount(@org.jetbrains.annotations.Nullable()
    java.lang.String amount) {
    }
    
    private final void syncButtonStates() {
    }
    
    public AmountInputView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public AmountInputView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public AmountInputView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/extensions/AmountInputView$InputParams;", "", "amountType", "Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService$AmountType;", "primaryPrefix", "", "switchEnabled", "", "(Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService$AmountType;Ljava/lang/String;Z)V", "getAmountType", "()Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService$AmountType;", "getPrimaryPrefix", "()Ljava/lang/String;", "getSwitchEnabled", "()Z", "app_debug"})
    public static final class InputParams {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.AmountType amountType = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String primaryPrefix = null;
        private final boolean switchEnabled = false;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.AmountType getAmountType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPrimaryPrefix() {
            return null;
        }
        
        public final boolean getSwitchEnabled() {
            return false;
        }
        
        public InputParams(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.AmountType amountType, @org.jetbrains.annotations.Nullable()
        java.lang.String primaryPrefix, boolean switchEnabled) {
            super();
        }
    }
}