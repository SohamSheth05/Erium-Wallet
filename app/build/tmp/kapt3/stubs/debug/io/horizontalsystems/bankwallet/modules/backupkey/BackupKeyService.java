package io.horizontalsystems.bankwallet.modules.backupkey;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/backupkey/BackupKeyService;", "", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "pinComponent", "Lio/horizontalsystems/core/IPinComponent;", "(Lio/horizontalsystems/bankwallet/entities/Account;Lio/horizontalsystems/core/IPinComponent;)V", "getAccount", "()Lio/horizontalsystems/bankwallet/entities/Account;", "isPinSet", "", "()Z", "passphrase", "", "getPassphrase", "()Ljava/lang/String;", "words", "", "getWords", "()Ljava/util/List;", "app_debug"})
public final class BackupKeyService {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> words = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String passphrase = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.entities.Account account = null;
    private final io.horizontalsystems.core.IPinComponent pinComponent = null;
    
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
    public final io.horizontalsystems.bankwallet.entities.Account getAccount() {
        return null;
    }
    
    public BackupKeyService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.IPinComponent pinComponent) {
        super();
    }
}