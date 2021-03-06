package io.horizontalsystems.bankwallet.modules.restoremnemonic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002$%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\bJ\u000e\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\bJ\u0010\u0010\"\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u000e0\u000e0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restoremnemonic/RestoreMnemonicService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "wordsManager", "Lio/horizontalsystems/bankwallet/core/managers/WordsManager;", "passphraseValidator", "Lio/horizontalsystems/bankwallet/core/managers/PassphraseValidator;", "(Lio/horizontalsystems/bankwallet/core/managers/WordsManager;Lio/horizontalsystems/bankwallet/core/managers/PassphraseValidator;)V", "passphrase", "", "getPassphrase", "()Ljava/lang/String;", "setPassphrase", "(Ljava/lang/String;)V", "value", "", "passphraseEnabled", "getPassphraseEnabled", "()Z", "setPassphraseEnabled", "(Z)V", "passphraseEnabledObservable", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "getPassphraseEnabledObservable", "()Lio/reactivex/subjects/BehaviorSubject;", "accountType", "Lio/horizontalsystems/bankwallet/entities/AccountType;", "words", "", "clear", "", "isWordPartiallyValid", "word", "isWordValid", "validatePassphrase", "text", "RestoreError", "ValidationError", "app_debug"})
public final class RestoreMnemonicService implements io.horizontalsystems.bankwallet.core.Clearable {
    private boolean passphraseEnabled = false;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> passphraseEnabledObservable = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String passphrase = "";
    private final io.horizontalsystems.bankwallet.core.managers.WordsManager wordsManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.PassphraseValidator passphraseValidator = null;
    
    public final boolean getPassphraseEnabled() {
        return false;
    }
    
    public final void setPassphraseEnabled(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> getPassphraseEnabledObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassphrase() {
        return null;
    }
    
    public final void setPassphrase(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public final boolean isWordValid(@org.jetbrains.annotations.NotNull()
    java.lang.String word) {
        return false;
    }
    
    public final boolean isWordPartiallyValid(@org.jetbrains.annotations.NotNull()
    java.lang.String word) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.AccountType accountType(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> words) {
        return null;
    }
    
    public final boolean validatePassphrase(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return false;
    }
    
    public RestoreMnemonicService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.WordsManager wordsManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.PassphraseValidator passphraseValidator) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restoremnemonic/RestoreMnemonicService$ValidationError;", "", "()V", "InvalidWordCountException", "Lio/horizontalsystems/bankwallet/modules/restoremnemonic/RestoreMnemonicService$ValidationError$InvalidWordCountException;", "app_debug"})
    public static abstract class ValidationError extends java.lang.Throwable {
        
        private ValidationError() {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restoremnemonic/RestoreMnemonicService$ValidationError$InvalidWordCountException;", "Lio/horizontalsystems/bankwallet/modules/restoremnemonic/RestoreMnemonicService$ValidationError;", "count", "", "(I)V", "getCount", "()I", "app_debug"})
        public static final class InvalidWordCountException extends io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicService.ValidationError {
            private final int count = 0;
            
            public final int getCount() {
                return 0;
            }
            
            public InvalidWordCountException(int count) {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restoremnemonic/RestoreMnemonicService$RestoreError;", "", "()V", "EmptyPassphrase", "Lio/horizontalsystems/bankwallet/modules/restoremnemonic/RestoreMnemonicService$RestoreError$EmptyPassphrase;", "app_debug"})
    public static abstract class RestoreError extends java.lang.Throwable {
        
        private RestoreError() {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restoremnemonic/RestoreMnemonicService$RestoreError$EmptyPassphrase;", "Lio/horizontalsystems/bankwallet/modules/restoremnemonic/RestoreMnemonicService$RestoreError;", "()V", "app_debug"})
        public static final class EmptyPassphrase extends io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicService.RestoreError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicService.RestoreError.EmptyPassphrase INSTANCE = null;
            
            private EmptyPassphrase() {
                super();
            }
        }
    }
}