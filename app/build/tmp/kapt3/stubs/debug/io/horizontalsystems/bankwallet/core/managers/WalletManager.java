package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001)B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\u001d\u001a\u00020\u001b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J$\u0010 \u001a\u00020\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0012\u0010#\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010%\u001a\u00020\u001bH\u0016J\b\u0010&\u001a\u00020\u001bH\u0002J\b\u0010\'\u001a\u00020\u001bH\u0002J\u0016\u0010(\u001a\u00020\u001b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR.\u0010\f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u000e*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b0\rX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u000bR.\u0010\u0018\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u000e*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b0\rX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010\u00a8\u0006*"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/WalletManager;", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "storage", "Lio/horizontalsystems/bankwallet/core/IWalletStorage;", "(Lio/horizontalsystems/bankwallet/core/IAccountManager;Lio/horizontalsystems/bankwallet/core/IWalletStorage;)V", "activeWallets", "", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "getActiveWallets", "()Ljava/util/List;", "activeWalletsUpdatedObservable", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "getActiveWalletsUpdatedObservable", "()Lio/reactivex/subjects/PublishSubject;", "cachedActiveWallets", "Lio/horizontalsystems/bankwallet/core/managers/WalletManager$WalletsCache;", "cachedWallets", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "wallets", "getWallets", "walletsUpdatedObservable", "getWalletsUpdatedObservable", "clear", "", "delete", "enable", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "handle", "newWallets", "deletedWallets", "handleUpdated", "activeAccount", "loadWallets", "notifyActiveWallets", "notifyChange", "save", "WalletsCache", "app_debug"})
public final class WalletManager implements io.horizontalsystems.bankwallet.core.IWalletManager {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<java.util.List<io.horizontalsystems.bankwallet.entities.Wallet>> activeWalletsUpdatedObservable = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<java.util.List<io.horizontalsystems.bankwallet.entities.Wallet>> walletsUpdatedObservable = null;
    private final io.horizontalsystems.bankwallet.core.managers.WalletManager.WalletsCache cachedWallets = null;
    private final io.horizontalsystems.bankwallet.core.managers.WalletManager.WalletsCache cachedActiveWallets = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final io.horizontalsystems.bankwallet.core.IAccountManager accountManager = null;
    private final io.horizontalsystems.bankwallet.core.IWalletStorage storage = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> getActiveWallets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.subjects.PublishSubject<java.util.List<io.horizontalsystems.bankwallet.entities.Wallet>> getActiveWalletsUpdatedObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> getWallets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.subjects.PublishSubject<java.util.List<io.horizontalsystems.bankwallet.entities.Wallet>> getWalletsUpdatedObservable() {
        return null;
    }
    
    @java.lang.Override()
    public void loadWallets() {
    }
    
    @java.lang.Override()
    public void enable(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
    }
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
    }
    
    @java.lang.Override()
    public void handle(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> newWallets, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> deletedWallets) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> getWallets(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account) {
        return null;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    private final void notifyChange() {
    }
    
    private final void notifyActiveWallets() {
    }
    
    private final void handleUpdated(io.horizontalsystems.bankwallet.entities.Account activeAccount) {
    }
    
    public WalletManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletStorage storage) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\u0006\u0010\r\u001a\u00020\nJ\u0014\u0010\u000e\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\u0014\u0010\u000f\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fR*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/WalletManager$WalletsCache;", "", "()V", "<set-?>", "", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "walletsSet", "getWalletsSet", "()Ljava/util/Set;", "add", "", "wallets", "", "clear", "remove", "set", "app_debug"})
    static final class WalletsCache {
        @org.jetbrains.annotations.NotNull()
        private java.util.Set<io.horizontalsystems.bankwallet.entities.Wallet> walletsSet;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<io.horizontalsystems.bankwallet.entities.Wallet> getWalletsSet() {
            return null;
        }
        
        public final void add(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
        }
        
        public final void remove(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
        }
        
        public final void set(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
        }
        
        public final void clear() {
        }
        
        public WalletsCache() {
            super();
        }
    }
}