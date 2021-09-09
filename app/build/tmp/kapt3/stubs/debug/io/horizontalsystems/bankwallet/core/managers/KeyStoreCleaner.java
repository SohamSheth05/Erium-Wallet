package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/KeyStoreCleaner;", "Lio/horizontalsystems/core/IKeyStoreCleaner;", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "(Lio/horizontalsystems/bankwallet/core/ILocalStorage;Lio/horizontalsystems/bankwallet/core/IAccountManager;Lio/horizontalsystems/bankwallet/core/IWalletManager;)V", "value", "", "encryptedSampleText", "getEncryptedSampleText", "()Ljava/lang/String;", "setEncryptedSampleText", "(Ljava/lang/String;)V", "cleanApp", "", "app_debug"})
public final class KeyStoreCleaner implements io.horizontalsystems.core.IKeyStoreCleaner {
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorage = null;
    private final io.horizontalsystems.bankwallet.core.IAccountManager accountManager = null;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getEncryptedSampleText() {
        return null;
    }
    
    @java.lang.Override()
    public void setEncryptedSampleText(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public void cleanApp() {
    }
    
    public KeyStoreCleaner(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager) {
        super();
    }
}