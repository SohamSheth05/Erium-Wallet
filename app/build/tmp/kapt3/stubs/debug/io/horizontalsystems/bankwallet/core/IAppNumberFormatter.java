package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H&J(\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J(\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0010H&J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0014\u001a\u00020\u0005H&\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IAppNumberFormatter;", "", "format", "", "value", "", "minimumFractionDigits", "", "maximumFractionDigits", "prefix", "suffix", "formatCoin", "code", "formatFiat", "symbol", "getSignificantDecimalCoin", "Ljava/math/BigDecimal;", "getSignificantDecimalFiat", "shortenValue", "Lkotlin/Pair;", "number", "app_debug"})
public abstract interface IAppNumberFormatter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String format(@org.jetbrains.annotations.NotNull()
    java.lang.Number value, int minimumFractionDigits, int maximumFractionDigits, @org.jetbrains.annotations.NotNull()
    java.lang.String prefix, @org.jetbrains.annotations.NotNull()
    java.lang.String suffix);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String formatCoin(@org.jetbrains.annotations.NotNull()
    java.lang.Number value, @org.jetbrains.annotations.NotNull()
    java.lang.String code, int minimumFractionDigits, int maximumFractionDigits);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String formatFiat(@org.jetbrains.annotations.NotNull()
    java.lang.Number value, @org.jetbrains.annotations.NotNull()
    java.lang.String symbol, int minimumFractionDigits, int maximumFractionDigits);
    
    public abstract int getSignificantDecimalFiat(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal value);
    
    public abstract int getSignificantDecimalCoin(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal value);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.Pair<java.math.BigDecimal, java.lang.String> shortenValue(@org.jetbrains.annotations.NotNull()
    java.lang.Number number);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}