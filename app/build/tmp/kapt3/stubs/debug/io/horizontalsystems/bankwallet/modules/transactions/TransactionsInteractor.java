package io.horizontalsystems.bankwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0018\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001bH\u0016J\u001e\u0010$\u001a\u00020\u001e2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u001eH\u0016J\u0018\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020\u001eH\u0002J\u0016\u00101\u001a\u00020\u001e2\f\u00102\u001a\b\u0012\u0004\u0012\u00020-0&H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsInteractor;", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IInteractor;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "adapterManager", "Lio/horizontalsystems/bankwallet/core/IAdapterManager;", "currencyManager", "Lio/horizontalsystems/core/ICurrencyManager;", "rateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "connectivityManager", "Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager;", "(Lio/horizontalsystems/bankwallet/core/IWalletManager;Lio/horizontalsystems/bankwallet/core/IAdapterManager;Lio/horizontalsystems/core/ICurrencyManager;Lio/horizontalsystems/bankwallet/core/IRateManager;Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager;)V", "adapterStateUpdatesDisposables", "Lio/reactivex/disposables/CompositeDisposable;", "delegate", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$IInteractorDelegate;)V", "disposables", "lastBlockHeightDisposables", "ratesDisposables", "requestedTimestamps", "Ljava/util/HashMap;", "", "", "transactionUpdatesDisposables", "clear", "", "fetchLastBlockHeights", "fetchRate", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "timestamp", "fetchRecords", "fetchDataList", "", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionsModule$FetchData;", "initial", "", "initialFetch", "onUpdateLastBlock", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "adapter", "Lio/horizontalsystems/bankwallet/core/ITransactionsAdapter;", "onUpdateWallets", "setSelectedWallets", "selectedWallets", "app_debug"})
public final class TransactionsInteractor implements io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IInteractorDelegate delegate;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final io.reactivex.disposables.CompositeDisposable ratesDisposables = null;
    private final io.reactivex.disposables.CompositeDisposable lastBlockHeightDisposables = null;
    private final io.reactivex.disposables.CompositeDisposable transactionUpdatesDisposables = null;
    private final io.reactivex.disposables.CompositeDisposable adapterStateUpdatesDisposables = null;
    private java.util.HashMap<java.lang.String, java.lang.Long> requestedTimestamps;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager = null;
    private final io.horizontalsystems.core.ICurrencyManager currencyManager = null;
    private final io.horizontalsystems.bankwallet.core.IRateManager rateManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.ConnectivityManager connectivityManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.IInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void initialFetch() {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    public void fetchRecords(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.transactions.TransactionsModule.FetchData> fetchDataList, boolean initial) {
    }
    
    @java.lang.Override()
    public void setSelectedWallets(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Wallet> selectedWallets) {
    }
    
    @java.lang.Override()
    public void fetchLastBlockHeights() {
    }
    
    @java.lang.Override()
    public void fetchRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin, long timestamp) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    private final void onUpdateLastBlock(io.horizontalsystems.bankwallet.entities.Wallet wallet, io.horizontalsystems.bankwallet.core.ITransactionsAdapter adapter) {
    }
    
    private final void onUpdateWallets() {
    }
    
    public TransactionsInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager rateManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.ConnectivityManager connectivityManager) {
        super();
    }
}