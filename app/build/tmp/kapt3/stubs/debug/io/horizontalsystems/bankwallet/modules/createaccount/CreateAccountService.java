package io.horizontalsystems.bankwallet.modules.createaccount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001>B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u000202H\u0016J\u0006\u00106\u001a\u000202J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u000208H\u0002J\u0010\u0010<\u001a\u00020)2\b\u0010=\u001a\u0004\u0018\u00010!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001f\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00110\u00110\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010#\"\u0004\b(\u0010%R$\u0010*\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020)@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001f\u0010/\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010)0)0\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006?"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/createaccount/CreateAccountService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "accountFactory", "Lio/horizontalsystems/bankwallet/core/IAccountFactory;", "wordsManager", "Lio/horizontalsystems/bankwallet/core/managers/WordsManager;", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "passphraseValidator", "Lio/horizontalsystems/bankwallet/core/managers/PassphraseValidator;", "coinKit", "Lio/horizontalsystems/coinkit2/CoinKit;", "(Lio/horizontalsystems/bankwallet/core/IAccountFactory;Lio/horizontalsystems/bankwallet/core/managers/WordsManager;Lio/horizontalsystems/bankwallet/core/IAccountManager;Lio/horizontalsystems/bankwallet/core/IWalletManager;Lio/horizontalsystems/bankwallet/core/managers/PassphraseValidator;Lio/horizontalsystems/coinkit2/CoinKit;)V", "allKinds", "", "Lio/horizontalsystems/bankwallet/modules/createaccount/CreateAccountModule$Kind;", "getAllKinds", "()[Lio/horizontalsystems/bankwallet/modules/createaccount/CreateAccountModule$Kind;", "[Lio/horizontalsystems/bankwallet/modules/createaccount/CreateAccountModule$Kind;", "value", "kind", "getKind", "()Lio/horizontalsystems/bankwallet/modules/createaccount/CreateAccountModule$Kind;", "setKind", "(Lio/horizontalsystems/bankwallet/modules/createaccount/CreateAccountModule$Kind;)V", "kindObservable", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "getKindObservable", "()Lio/reactivex/subjects/BehaviorSubject;", "passphrase", "", "getPassphrase", "()Ljava/lang/String;", "setPassphrase", "(Ljava/lang/String;)V", "passphraseConfirmation", "getPassphraseConfirmation", "setPassphraseConfirmation", "", "passphraseEnabled", "getPassphraseEnabled", "()Z", "setPassphraseEnabled", "(Z)V", "passphraseEnabledObservable", "getPassphraseEnabledObservable", "activateDefaultWallets", "", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "clear", "createAccount", "mnemonicAccountType", "Lio/horizontalsystems/bankwallet/entities/AccountType;", "wordCount", "", "resolveAccountType", "validatePassphrase", "text", "CreateError", "app_debug"})
public final class CreateAccountService implements io.horizontalsystems.bankwallet.core.Clearable {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountModule.Kind[] allKinds = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountModule.Kind kind = io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountModule.Kind.Mnemonic12;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountModule.Kind> kindObservable = null;
    private boolean passphraseEnabled = false;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> passphraseEnabledObservable = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String passphrase = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String passphraseConfirmation = "";
    private final io.horizontalsystems.bankwallet.core.IAccountFactory accountFactory = null;
    private final io.horizontalsystems.bankwallet.core.managers.WordsManager wordsManager = null;
    private final io.horizontalsystems.bankwallet.core.IAccountManager accountManager = null;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.PassphraseValidator passphraseValidator = null;
    private final io.horizontalsystems.coinkit2.CoinKit coinKit = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountModule.Kind[] getAllKinds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountModule.Kind getKind() {
        return null;
    }
    
    public final void setKind(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountModule.Kind value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountModule.Kind> getKindObservable() {
        return null;
    }
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassphraseConfirmation() {
        return null;
    }
    
    public final void setPassphraseConfirmation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public final void createAccount() {
    }
    
    private final void activateDefaultWallets(io.horizontalsystems.bankwallet.entities.Account account) {
    }
    
    private final io.horizontalsystems.bankwallet.entities.AccountType resolveAccountType() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.entities.AccountType mnemonicAccountType(int wordCount) {
        return null;
    }
    
    public final boolean validatePassphrase(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return false;
    }
    
    public CreateAccountService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountFactory accountFactory, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.WordsManager wordsManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.PassphraseValidator passphraseValidator, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.CoinKit coinKit) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/createaccount/CreateAccountService$CreateError;", "", "()V", "EmptyPassphrase", "InvalidConfirmation", "Lio/horizontalsystems/bankwallet/modules/createaccount/CreateAccountService$CreateError$EmptyPassphrase;", "Lio/horizontalsystems/bankwallet/modules/createaccount/CreateAccountService$CreateError$InvalidConfirmation;", "app_debug"})
    public static abstract class CreateError extends java.lang.Throwable {
        
        private CreateError() {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/createaccount/CreateAccountService$CreateError$EmptyPassphrase;", "Lio/horizontalsystems/bankwallet/modules/createaccount/CreateAccountService$CreateError;", "()V", "app_debug"})
        public static final class EmptyPassphrase extends io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountService.CreateError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountService.CreateError.EmptyPassphrase INSTANCE = null;
            
            private EmptyPassphrase() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/createaccount/CreateAccountService$CreateError$InvalidConfirmation;", "Lio/horizontalsystems/bankwallet/modules/createaccount/CreateAccountService$CreateError;", "()V", "app_debug"})
        public static final class InvalidConfirmation extends io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountService.CreateError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.createaccount.CreateAccountService.CreateError.InvalidConfirmation INSTANCE = null;
            
            private InvalidConfirmation() {
                super();
            }
        }
    }
}