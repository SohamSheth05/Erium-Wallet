package io.horizontalsystems.bankwallet.core.adapters.zcash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002J6\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\u00122\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\nH\u0002J\u0016\u0010\u001d\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001e0\nH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\t8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/zcash/ZcashTransactionsProvider;", "", "synchronizer", "Lcash/z/ecc/android/sdk/Synchronizer;", "(Lcash/z/ecc/android/sdk/Synchronizer;)V", "confirmedTransactions", "", "Lio/horizontalsystems/bankwallet/core/adapters/zcash/ZcashTransaction;", "newTransactionsFlowable", "Lio/reactivex/Flowable;", "", "getNewTransactionsFlowable", "()Lio/reactivex/Flowable;", "newTransactionsSubject", "Lio/reactivex/subjects/PublishSubject;", "pendingTransactions", "getAllTransactionsSorted", "getTransactions", "Lio/reactivex/Single;", "from", "Lkotlin/Triple;", "", "", "", "limit", "onClearedTransactions", "", "transactions", "Lcash/z/ecc/android/sdk/db/entity/ConfirmedTransaction;", "onPendingTransactions", "Lcash/z/ecc/android/sdk/db/entity/PendingTransaction;", "app_debug"})
public final class ZcashTransactionsProvider {
    private java.util.List<io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashTransaction> confirmedTransactions;
    private java.util.List<io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashTransaction> pendingTransactions;
    private final io.reactivex.subjects.PublishSubject<java.util.List<io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashTransaction>> newTransactionsSubject = null;
    
    private final java.util.List<io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashTransaction> getAllTransactionsSorted() {
        return null;
    }
    
    private final synchronized void onClearedTransactions(java.util.List<cash.z.ecc.android.sdk.db.entity.ConfirmedTransaction> transactions) {
    }
    
    private final synchronized void onPendingTransactions(java.util.List<? extends cash.z.ecc.android.sdk.db.entity.PendingTransaction> transactions) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashTransaction>> getNewTransactionsFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final synchronized io.reactivex.Single<java.util.List<io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashTransaction>> getTransactions(@org.jetbrains.annotations.Nullable()
    kotlin.Triple<byte[], java.lang.Long, java.lang.Integer> from, int limit) {
        return null;
    }
    
    public ZcashTransactionsProvider(@org.jetbrains.annotations.NotNull()
    cash.z.ecc.android.sdk.Synchronizer synchronizer) {
        super();
    }
}