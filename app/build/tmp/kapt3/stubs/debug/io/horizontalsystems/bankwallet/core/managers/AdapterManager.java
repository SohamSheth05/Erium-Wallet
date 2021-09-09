package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u00112\u0006\u0010\"\u001a\u00020\u0010H\u0016J\u0012\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\"\u001a\u00020\u0010H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\"\u001a\u00020\u0010H\u0016J\u0012\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010\"\u001a\u00020\u0010H\u0016J\u0016\u0010)\u001a\u00020\u00142\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100+H\u0002J\b\u0010,\u001a\u00020\u0014H\u0016J\b\u0010-\u001a\u00020\u0014H\u0016J\u0016\u0010.\u001a\u00020\u00142\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100+H\u0016J\u0010\u0010/\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00140\u00140\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/AdapterManager;", "Lio/horizontalsystems/bankwallet/core/IAdapterManager;", "Landroid/os/HandlerThread;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "adapterFactory", "Lio/horizontalsystems/bankwallet/core/factories/AdapterFactory;", "ethereumKitManager", "Lio/horizontalsystems/bankwallet/core/managers/EthereumKitManager;", "binanceSmartChainKitManager", "Lio/horizontalsystems/bankwallet/core/managers/BinanceSmartChainKitManager;", "binanceKitManager", "Lio/horizontalsystems/bankwallet/core/managers/BinanceKitManager;", "(Lio/horizontalsystems/bankwallet/core/IWalletManager;Lio/horizontalsystems/bankwallet/core/factories/AdapterFactory;Lio/horizontalsystems/bankwallet/core/managers/EthereumKitManager;Lio/horizontalsystems/bankwallet/core/managers/BinanceSmartChainKitManager;Lio/horizontalsystems/bankwallet/core/managers/BinanceKitManager;)V", "adaptersMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "Lio/horizontalsystems/bankwallet/core/IAdapter;", "adaptersReadyObservable", "Lio/reactivex/Flowable;", "", "getAdaptersReadyObservable", "()Lio/reactivex/Flowable;", "adaptersReadySubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "handler", "Landroid/os/Handler;", "getAdapterForCoin", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "getAdapterForWallet", "wallet", "getBalanceAdapterForWallet", "Lio/horizontalsystems/bankwallet/core/IBalanceAdapter;", "getReceiveAdapterForWallet", "Lio/horizontalsystems/bankwallet/core/IReceiveAdapter;", "getTransactionsAdapterForWallet", "Lio/horizontalsystems/bankwallet/core/ITransactionsAdapter;", "initAdapters", "wallets", "", "preloadAdapters", "refresh", "refreshAdapters", "refreshByWallet", "app_debug"})
public final class AdapterManager extends android.os.HandlerThread implements io.horizontalsystems.bankwallet.core.IAdapterManager {
    private final android.os.Handler handler = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> adaptersReadySubject = null;
    private final java.util.concurrent.ConcurrentHashMap<io.horizontalsystems.bankwallet.entities.Wallet, io.horizontalsystems.bankwallet.core.IAdapter> adaptersMap = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Flowable<kotlin.Unit> adaptersReadyObservable = null;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bankwallet.core.factories.AdapterFactory adapterFactory = null;
    private final io.horizontalsystems.bankwallet.core.managers.EthereumKitManager ethereumKitManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.BinanceSmartChainKitManager binanceSmartChainKitManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.BinanceKitManager binanceKitManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getAdaptersReadyObservable() {
        return null;
    }
    
    @java.lang.Override()
    public void preloadAdapters() {
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    private final synchronized void initAdapters(java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
    }
    
    /**
     * Partial refresh of adapters
     * For the given list of wallets do:
     * - remove corresponding adapters from adaptersMap and stop them
     * - create new adapters, start and add them to adaptersMap
     * - trigger adaptersReadySubject
     */
    @java.lang.Override()
    public synchronized void refreshAdapters(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> wallets) {
    }
    
    @java.lang.Override()
    public void refreshByWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.core.IAdapter getAdapterForWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.core.IAdapter getAdapterForCoin(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.core.ITransactionsAdapter getTransactionsAdapterForWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.core.IBalanceAdapter getBalanceAdapterForWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.core.IReceiveAdapter getReceiveAdapterForWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
        return null;
    }
    
    public AdapterManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.factories.AdapterFactory adapterFactory, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.EthereumKitManager ethereumKitManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.BinanceSmartChainKitManager binanceSmartChainKitManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.BinanceKitManager binanceKitManager) {
        super(null);
    }
}