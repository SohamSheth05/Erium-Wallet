package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u000f\u001a\u00020\u0010H&J\u0016\u0010\u0011\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0012\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J$\u0010\u0015\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0018\u001a\u00020\u0010H&J\u0016\u0010\u0019\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IWalletManager;", "", "activeWallets", "", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "getActiveWallets", "()Ljava/util/List;", "activeWalletsUpdatedObservable", "Lio/reactivex/Observable;", "getActiveWalletsUpdatedObservable", "()Lio/reactivex/Observable;", "wallets", "getWallets", "walletsUpdatedObservable", "getWalletsUpdatedObservable", "clear", "", "delete", "enable", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "handle", "newWallets", "deletedWallets", "loadWallets", "save", "app_debug"})
public abstract interface IWalletManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> getActiveWallets();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<io.horizontalsystems.bankwallet.entities.Wallet>> getActiveWalletsUpdatedObservable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> getWallets();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<io.horizontalsystems.bankwallet.entities.Wallet>> getWalletsUpdatedObservable();
    
    public abstract void loadWallets();
    
    public abstract void enable(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets);
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets);
    
    public abstract void clear();
    
    public abstract void handle(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> newWallets, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> deletedWallets);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> getWallets(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account);
}