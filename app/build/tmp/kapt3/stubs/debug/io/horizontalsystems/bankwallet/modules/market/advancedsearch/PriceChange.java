package io.horizontalsystems.bankwallet.modules.market.advancedsearch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B3\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR!\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/advancedsearch/PriceChange;", "", "titleResId", "", "colorResId", "values", "Lkotlin/Pair;", "", "(Ljava/lang/String;IIILkotlin/Pair;)V", "getColorResId", "()I", "getTitleResId", "getValues", "()Lkotlin/Pair;", "Positive_10_plus", "Positive_25_plus", "Positive_50_plus", "Positive_100_plus", "Negative_10_minus", "Negative_25_minus", "Negative_50_minus", "Negative_100_minus", "app_debug"})
public enum PriceChange {
    /*public static final*/ Positive_10_plus /* = new Positive_10_plus(0, 0, null) */,
    /*public static final*/ Positive_25_plus /* = new Positive_25_plus(0, 0, null) */,
    /*public static final*/ Positive_50_plus /* = new Positive_50_plus(0, 0, null) */,
    /*public static final*/ Positive_100_plus /* = new Positive_100_plus(0, 0, null) */,
    /*public static final*/ Negative_10_minus /* = new Negative_10_minus(0, 0, null) */,
    /*public static final*/ Negative_25_minus /* = new Negative_25_minus(0, 0, null) */,
    /*public static final*/ Negative_50_minus /* = new Negative_50_minus(0, 0, null) */,
    /*public static final*/ Negative_100_minus /* = new Negative_100_minus(0, 0, null) */;
    private final int titleResId = 0;
    private final int colorResId = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Pair<java.lang.Long, java.lang.Long> values = null;
    
    public final int getTitleResId() {
        return 0;
    }
    
    public final int getColorResId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.Long, java.lang.Long> getValues() {
        return null;
    }
    
    PriceChange(@androidx.annotation.StringRes()
    int titleResId, @androidx.annotation.ColorRes()
    int colorResId, kotlin.Pair<java.lang.Long, java.lang.Long> values) {
    }
}