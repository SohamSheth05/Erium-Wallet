package io.horizontalsystems.bankwallet.modules.coin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007J\u001c\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eJ\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fH\u0002\u00a8\u0006 "}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/CoinPerformanceRowView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bind", "", "title", "", "values", "", "Ljava/math/BigDecimal;", "itemsCount", "position", "bindHeader", "periods", "Lio/horizontalsystems/xrateskit2/entities/TimePeriod;", "getDiffTextView", "Landroid/widget/TextView;", "percentage", "getHeaderTextView", "getPeriodName", "period", "getRowTitleTextView", "getSeparatorLine", "Landroid/view/View;", "getTextView", "Companion", "app_debug"})
public final class CoinPerformanceRowView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.coin.CoinPerformanceRowView.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void bindHeader(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.xrateskit2.entities.TimePeriod> periods) {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.math.BigDecimal> values, int itemsCount, int position) {
    }
    
    private final android.view.View getSeparatorLine() {
        return null;
    }
    
    private final android.widget.TextView getHeaderTextView(java.lang.String title) {
        return null;
    }
    
    private final android.widget.TextView getRowTitleTextView(java.lang.String title) {
        return null;
    }
    
    private final android.widget.TextView getTextView(java.lang.String title) {
        return null;
    }
    
    private final android.widget.TextView getDiffTextView(java.math.BigDecimal percentage) {
        return null;
    }
    
    private final java.lang.String getPeriodName(io.horizontalsystems.xrateskit2.entities.TimePeriod period) {
        return null;
    }
    
    public CoinPerformanceRowView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public CoinPerformanceRowView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CoinPerformanceRowView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/CoinPerformanceRowView$Companion;", "", "()V", "getBackground", "", "size", "position", "app_debug"})
    public static final class Companion {
        
        public final int getBackground(int size, int position) {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}