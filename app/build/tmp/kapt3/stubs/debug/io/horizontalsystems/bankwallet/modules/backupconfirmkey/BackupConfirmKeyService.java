package io.horizontalsystems.bankwallet.modules.backupconfirmkey;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003-./B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010&\u001a\u00020\'J\u0006\u0010(\u001a\u00020\'J\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020,0%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00100\u00100\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0%X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService;", "", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "indexesProvider", "Lio/horizontalsystems/bankwallet/core/IRandomProvider;", "(Lio/horizontalsystems/bankwallet/entities/Account;Lio/horizontalsystems/bankwallet/core/IAccountManager;Lio/horizontalsystems/bankwallet/core/IRandomProvider;)V", "firstWord", "", "getFirstWord", "()Ljava/lang/String;", "setFirstWord", "(Ljava/lang/String;)V", "value", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$IndexItem;", "indexItem", "getIndexItem", "()Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$IndexItem;", "setIndexItem", "(Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$IndexItem;)V", "indexItemObservable", "Lio/reactivex/Flowable;", "getIndexItemObservable", "()Lio/reactivex/Flowable;", "indexItemSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "passphrase", "passphraseConfirm", "getPassphraseConfirm", "setPassphraseConfirm", "secondWord", "getSecondWord", "setSecondWord", "words", "", "backup", "", "generateIndices", "hasPassphrase", "", "validate", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError;", "BackupError", "IndexItem", "ValidationError", "app_debug"})
public final class BackupConfirmKeyService {
    private final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.IndexItem> indexItemSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Flowable<io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.IndexItem> indexItemObservable = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.IndexItem indexItem;
    private final java.util.List<java.lang.String> words = null;
    private final java.lang.String passphrase = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String firstWord = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String secondWord = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String passphraseConfirm = "";
    private final io.horizontalsystems.bankwallet.entities.Account account = null;
    private final io.horizontalsystems.bankwallet.core.IAccountManager accountManager = null;
    private final io.horizontalsystems.bankwallet.core.IRandomProvider indexesProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.IndexItem> getIndexItemObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.IndexItem getIndexItem() {
        return null;
    }
    
    private final void setIndexItem(io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.IndexItem value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstWord() {
        return null;
    }
    
    public final void setFirstWord(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSecondWord() {
        return null;
    }
    
    public final void setSecondWord(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassphraseConfirm() {
        return null;
    }
    
    public final void setPassphraseConfirm(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.ValidationError> validate() {
        return null;
    }
    
    public final void generateIndices() {
    }
    
    public final boolean hasPassphrase() {
        return false;
    }
    
    public final void backup() {
    }
    
    public BackupConfirmKeyService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRandomProvider indexesProvider) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$IndexItem;", "", "first", "", "second", "(II)V", "getFirst", "()I", "getSecond", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
    public static final class IndexItem {
        private final int first = 0;
        private final int second = 0;
        
        public final int getFirst() {
            return 0;
        }
        
        public final int getSecond() {
            return 0;
        }
        
        public IndexItem(int first, int second) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.IndexItem copy(int first, int second) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$BackupError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "validationErrors", "", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError;", "(Ljava/util/List;)V", "getValidationErrors", "()Ljava/util/List;", "app_debug"})
    public static final class BackupError extends java.lang.Exception {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.ValidationError> validationErrors = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.ValidationError> getValidationErrors() {
            return null;
        }
        
        public BackupError(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.ValidationError> validationErrors) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "EmptyFirstWord", "EmptyPassphrase", "EmptySecondWord", "InvalidFirstWord", "InvalidPassphrase", "InvalidSecondWord", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError$EmptyFirstWord;", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError$InvalidFirstWord;", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError$EmptySecondWord;", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError$InvalidSecondWord;", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError$EmptyPassphrase;", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError$InvalidPassphrase;", "app_debug"})
    public static abstract class ValidationError extends java.lang.Exception {
        
        private ValidationError() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError$EmptyFirstWord;", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError;", "()V", "app_debug"})
        public static final class EmptyFirstWord extends io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.ValidationError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.ValidationError.EmptyFirstWord INSTANCE = null;
            
            private EmptyFirstWord() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError$InvalidFirstWord;", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError;", "()V", "app_debug"})
        public static final class InvalidFirstWord extends io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.ValidationError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.ValidationError.InvalidFirstWord INSTANCE = null;
            
            private InvalidFirstWord() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError$EmptySecondWord;", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError;", "()V", "app_debug"})
        public static final class EmptySecondWord extends io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.ValidationError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.ValidationError.EmptySecondWord INSTANCE = null;
            
            private EmptySecondWord() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError$InvalidSecondWord;", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError;", "()V", "app_debug"})
        public static final class InvalidSecondWord extends io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.ValidationError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.ValidationError.InvalidSecondWord INSTANCE = null;
            
            private InvalidSecondWord() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError$EmptyPassphrase;", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError;", "()V", "app_debug"})
        public static final class EmptyPassphrase extends io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.ValidationError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.ValidationError.EmptyPassphrase INSTANCE = null;
            
            private EmptyPassphrase() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError$InvalidPassphrase;", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$ValidationError;", "()V", "app_debug"})
        public static final class InvalidPassphrase extends io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.ValidationError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.ValidationError.InvalidPassphrase INSTANCE = null;
            
            private InvalidPassphrase() {
                super();
            }
        }
    }
}