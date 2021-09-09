package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J(\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J(\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0019H\u0016J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070\u001c2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/NumberFormatter;", "Lio/horizontalsystems/bankwallet/core/IAppNumberFormatter;", "languageManager", "Lio/horizontalsystems/core/ILanguageManager;", "(Lio/horizontalsystems/core/ILanguageManager;)V", "formatters", "", "", "Ljava/text/NumberFormat;", "format", "value", "", "minimumFractionDigits", "", "maximumFractionDigits", "prefix", "suffix", "formatCoin", "code", "formatFiat", "symbol", "getFormatter", "locale", "Ljava/util/Locale;", "getSignificantDecimalCoin", "Ljava/math/BigDecimal;", "getSignificantDecimalFiat", "shortenValue", "Lkotlin/Pair;", "number", "app_debug"})
public final class NumberFormatter implements io.horizontalsystems.bankwallet.core.IAppNumberFormatter {
    private java.util.Map<java.lang.String, java.text.NumberFormat> formatters;
    private final io.horizontalsystems.core.ILanguageManager languageManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String format(@org.jetbrains.annotations.NotNull()
    java.lang.Number value, int minimumFractionDigits, int maximumFractionDigits, @org.jetbrains.annotations.NotNull()
    java.lang.String prefix, @org.jetbrains.annotations.NotNull()
    java.lang.String suffix) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String formatCoin(@org.jetbrains.annotations.NotNull()
    java.lang.Number value, @org.jetbrains.annotations.NotNull()
    java.lang.String code, int minimumFractionDigits, int maximumFractionDigits) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String formatFiat(@org.jetbrains.annotations.NotNull()
    java.lang.Number value, @org.jetbrains.annotations.NotNull()
    java.lang.String symbol, int minimumFractionDigits, int maximumFractionDigits) {
        return null;
    }
    
    @java.lang.Override()
    public int getSignificantDecimalFiat(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal value) {
        return 0;
    }
    
    @java.lang.Override()
    public int getSignificantDecimalCoin(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal value) {
        return 0;
    }
    
    private final java.text.NumberFormat getFormatter(java.util.Locale locale, int minimumFractionDigits, int maximumFractionDigits) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.math.BigDecimal, java.lang.String> shortenValue(@org.jetbrains.annotations.NotNull()
    java.lang.Number number) {
        return null;
    }
    
    public NumberFormatter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ILanguageManager languageManager) {
        super();
    }
}