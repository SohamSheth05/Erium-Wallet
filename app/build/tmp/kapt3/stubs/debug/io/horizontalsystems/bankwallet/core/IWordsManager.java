package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H&J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IWordsManager;", "", "generateWords", "", "", "count", "", "isWordPartiallyValid", "", "word", "isWordValid", "validateChecksum", "", "words", "app_debug"})
public abstract interface IWordsManager {
    
    public abstract void validateChecksum(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> words);
    
    public abstract boolean isWordValid(@org.jetbrains.annotations.NotNull()
    java.lang.String word);
    
    public abstract boolean isWordPartiallyValid(@org.jetbrains.annotations.NotNull()
    java.lang.String word);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> generateWords(int count);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}