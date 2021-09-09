package io.horizontalsystems.bankwallet.ui.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001#B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0002J%\u0010\u0017\u001a\u00020\u00152\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0002\u00a2\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u001dJ\u000e\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0007J\u0012\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/extensions/PriceGradientView;", "Landroidx/cardview/widget/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "alphaDuration", "", "diffPrev", "", "Ljava/lang/Float;", "gradient", "Landroid/graphics/drawable/Drawable;", "gradientRed", "matrixImage", "Lio/horizontalsystems/bankwallet/ui/extensions/PriceGradientView$MatrixImage;", "translateDuration", "animateAlpha", "", "alpha", "animateBgChange", "arrayOf", "", "diff", "([Landroid/graphics/drawable/Drawable;F)V", "animateHorizontal", "(Ljava/lang/Float;)V", "animateVertical", "setBackground", "color", "setGradient", "drawable", "MatrixImage", "app_debug"})
public final class PriceGradientView extends androidx.cardview.widget.CardView {
    private final io.horizontalsystems.bankwallet.ui.extensions.PriceGradientView.MatrixImage matrixImage = null;
    private java.lang.Float diffPrev;
    private android.graphics.drawable.Drawable gradient;
    private android.graphics.drawable.Drawable gradientRed;
    private final long alphaDuration = 600L;
    private final long translateDuration = 1000L;
    private java.util.HashMap _$_findViewCache;
    
    public final void animateHorizontal(@org.jetbrains.annotations.Nullable()
    java.lang.Float diff) {
    }
    
    public final void setBackground(int color) {
    }
    
    public final void animateVertical(@org.jetbrains.annotations.Nullable()
    java.lang.Float diff) {
    }
    
    private final void animateBgChange(android.graphics.drawable.Drawable[] arrayOf, float diff) {
    }
    
    private final void animateAlpha(float alpha) {
    }
    
    private final void setGradient(android.graphics.drawable.Drawable drawable) {
    }
    
    public PriceGradientView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public PriceGradientView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public PriceGradientView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\t\u001a\u00020\bJ\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/extensions/PriceGradientView$MatrixImage;", "", "imageView", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;)V", "matrix", "Landroid/graphics/Matrix;", "diff", "", "to", "getTranslateX", "Lkotlin/Pair;", "getTranslateY", "setTranslateX", "", "dx", "setTranslateY", "dy", "app_debug"})
    public static final class MatrixImage {
        private final android.graphics.Matrix matrix = null;
        private final android.widget.ImageView imageView = null;
        
        public final void setTranslateX(float dx) {
        }
        
        public final void setTranslateY(float dy) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<java.lang.Float, java.lang.Float> getTranslateY(float to) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<java.lang.Float, java.lang.Float> getTranslateX(float to) {
            return null;
        }
        
        private final float diff(float to) {
            return 0.0F;
        }
        
        public MatrixImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView imageView) {
            super();
        }
    }
}