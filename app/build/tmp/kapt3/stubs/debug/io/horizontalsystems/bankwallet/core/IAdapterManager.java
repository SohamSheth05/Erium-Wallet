package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u0014\u001a\u00020\u0004H&J\b\u0010\u0015\u001a\u00020\u0004H&J\u0016\u0010\u0016\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001a"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IAdapterManager;", "", "adaptersReadyObservable", "Lio/reactivex/Flowable;", "", "getAdaptersReadyObservable", "()Lio/reactivex/Flowable;", "getAdapterForCoin", "Lio/horizontalsystems/bankwallet/core/IAdapter;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "getAdapterForWallet", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "getBalanceAdapterForWallet", "Lio/horizontalsystems/bankwallet/core/IBalanceAdapter;", "getReceiveAdapterForWallet", "Lio/horizontalsystems/bankwallet/core/IReceiveAdapter;", "getTransactionsAdapterForWallet", "Lio/horizontalsystems/bankwallet/core/ITransactionsAdapter;", "preloadAdapters", "refresh", "refreshAdapters", "wallets", "", "refreshByWallet", "app_debug"})
public abstract interface IAdapterManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<kotlin.Unit> getAdaptersReadyObservable();
    
    public abstract void preloadAdapters();
    
    public abstract void refresh();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.core.IAdapter getAdapterForWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.core.IAdapter getAdapterForCoin(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.core.ITransactionsAdapter getTransactionsAdapterForWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.core.IBalanceAdapter getBalanceAdapterForWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.core.IReceiveAdapter getReceiveAdapterForWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet);
    
    public abstract void refreshAdapters(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets);
    
    public abstract void refreshByWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet);
}