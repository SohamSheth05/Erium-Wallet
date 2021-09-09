package io.horizontalsystems.bankwallet.modules.showkey;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/showkey/ShowKeyService;", "", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "pinComponent", "Lio/horizontalsystems/core/IPinComponent;", "ethereumKitManager", "Lio/horizontalsystems/bankwallet/core/managers/EthereumKitManager;", "(Lio/horizontalsystems/bankwallet/entities/Account;Lio/horizontalsystems/core/IPinComponent;Lio/horizontalsystems/bankwallet/core/managers/EthereumKitManager;)V", "evmPrivateKey", "", "getEvmPrivateKey", "()Ljava/lang/String;", "isPinSet", "", "()Z", "passphrase", "getPassphrase", "words", "", "getWords", "()Ljava/util/List;", "app_debug"})
public final class ShowKeyService {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> words = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String passphrase = null;
    private final io.horizontalsystems.core.IPinComponent pinComponent = null;
    private final io.horizontalsystems.bankwallet.core.managers.EthereumKitManager ethereumKitManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getWords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassphrase() {
        return null;
    }
    
    public final boolean isPinSet() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEvmPrivateKey() {
        return null;
    }
    
    public ShowKeyService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.IPinComponent pinComponent, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.EthereumKitManager ethereumKitManager) {
        super();
    }
}