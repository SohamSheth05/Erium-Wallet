package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/WordsManager;", "Lio/horizontalsystems/bankwallet/core/IWordsManager;", "()V", "wordList", "", "", "generateWords", "count", "", "isWordPartiallyValid", "", "word", "isWordValid", "validateChecksum", "", "words", "app_debug"})
public final class WordsManager implements io.horizontalsystems.bankwallet.core.IWordsManager {
    private final java.util.List<java.lang.String> wordList = null;
    
    @java.lang.Override()
    public void validateChecksum(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> words) {
    }
    
    @java.lang.Override()
    public boolean isWordValid(@org.jetbrains.annotations.NotNull()
    java.lang.String word) {
        return false;
    }
    
    @java.lang.Override()
    public boolean isWordPartiallyValid(@org.jetbrains.annotations.NotNull()
    java.lang.String word) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> generateWords(int count) {
        return null;
    }
    
    public WordsManager() {
        super();
    }
}