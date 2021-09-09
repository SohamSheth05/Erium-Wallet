package io.horizontalsystems.bankwallet.core.adapters.zcash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 s2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002stB%\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010N\u001a\u00020/2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010/H\u0002\u00a2\u0006\u0002\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010F2\u0006\u0010R\u001a\u00020SH\u0002J&\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0E0U2\b\u0010V\u001a\u0004\u0018\u00010F2\u0006\u0010W\u001a\u00020&H\u0016J\u0010\u0010X\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020YH\u0002J\u0018\u0010Z\u001a\u00020\u00112\u0006\u0010[\u001a\u00020&2\u0006\u0010\\\u001a\u00020&H\u0002J\u0010\u0010]\u001a\u00020\u00112\u0006\u0010^\u001a\u00020&H\u0002J\u0012\u0010_\u001a\u00020\r2\b\u0010`\u001a\u0004\u0018\u00010aH\u0002J\u0010\u0010b\u001a\u00020\u00112\u0006\u0010c\u001a\u00020dH\u0002J\u0010\u0010e\u001a\u00020\u00112\u0006\u0010f\u001a\u00020gH\u0002J\b\u0010h\u001a\u00020\u0011H\u0016J.\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00110U2\u0006\u0010j\u001a\u00020\u00132\u0006\u0010k\u001a\u00020(2\u0006\u0010l\u001a\u00020(2\u0006\u0010m\u001a\u00020nH\u0016J\b\u0010o\u001a\u00020\u0011H\u0016J\b\u0010p\u001a\u00020\u0011H\u0016J\b\u0010q\u001a\u00020\u0011H\u0002J\u0010\u0010r\u001a\u00020\u00112\u0006\u0010k\u001a\u00020(H\u0016R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u001f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u001f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010!R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\u00020(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b-\u0010\u0015R\u000e\u0010.\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00100\u001a\u0004\u0018\u0001018VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u00103R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u001f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b5\u0010!R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020&X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u00109\u001a\u00020(X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u000e\u0010;\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010?\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u001b@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b@\u0010AR\u000e\u0010B\u001a\u00020CX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0E0\u001f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bG\u0010!R\u000e\u0010H\u001a\u00020IX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010J\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bK\u0010\u001dR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00110\u001f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bM\u0010!\u00a8\u0006u"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/zcash/ZcashAdapter;", "Lio/horizontalsystems/bankwallet/core/IAdapter;", "Lio/horizontalsystems/bankwallet/core/IBalanceAdapter;", "Lio/horizontalsystems/bankwallet/core/IReceiveAdapter;", "Lio/horizontalsystems/bankwallet/core/ITransactionsAdapter;", "Lio/horizontalsystems/bankwallet/core/ISendZcashAdapter;", "context", "Landroid/content/Context;", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "restoreSettings", "Lio/horizontalsystems/bankwallet/core/managers/RestoreSettings;", "testMode", "", "(Landroid/content/Context;Lio/horizontalsystems/bankwallet/entities/Wallet;Lio/horizontalsystems/bankwallet/core/managers/RestoreSettings;Z)V", "adapterStateUpdatedSubject", "Lio/reactivex/subjects/PublishSubject;", "", "availableBalance", "Ljava/math/BigDecimal;", "getAvailableBalance", "()Ljava/math/BigDecimal;", "balance", "getBalance", "balanceLocked", "getBalanceLocked", "balanceState", "Lio/horizontalsystems/bankwallet/core/AdapterState;", "getBalanceState", "()Lio/horizontalsystems/bankwallet/core/AdapterState;", "balanceStateUpdatedFlowable", "Lio/reactivex/Flowable;", "getBalanceStateUpdatedFlowable", "()Lio/reactivex/Flowable;", "balanceUpdatedFlowable", "getBalanceUpdatedFlowable", "balanceUpdatedSubject", "confirmationsThreshold", "", "debugInfo", "", "getDebugInfo", "()Ljava/lang/String;", "downloadProgress", "fee", "getFee", "feeChangeHeight", "", "lastBlockInfo", "Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "getLastBlockInfo", "()Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "lastBlockUpdatedFlowable", "getLastBlockUpdatedFlowable", "lastBlockUpdatedSubject", "lightWalletDHost", "lightWalletDPort", "receiveAddress", "getReceiveAddress", "scanProgress", "seed", "", "value", "syncState", "setSyncState", "(Lio/horizontalsystems/bankwallet/core/AdapterState;)V", "synchronizer", "Lcash/z/ecc/android/sdk/Synchronizer;", "transactionRecordsFlowable", "", "Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "getTransactionRecordsFlowable", "transactionsProvider", "Lio/horizontalsystems/bankwallet/core/adapters/zcash/ZcashTransactionsProvider;", "transactionsState", "getTransactionsState", "transactionsStateUpdatedFlowable", "getTransactionsStateUpdatedFlowable", "defaultFee", "height", "(Ljava/lang/Long;)J", "getTransactionRecord", "zcashTransaction", "Lio/horizontalsystems/bankwallet/core/adapters/zcash/ZcashTransaction;", "getTransactions", "Lio/reactivex/Single;", "from", "limit", "onBalance", "Lcash/z/ecc/android/sdk/block/CompactBlockProcessor$WalletBalance;", "onChainError", "errorHeight", "rewindHeight", "onDownloadProgress", "progress", "onProcessorError", "error", "", "onProcessorInfo", "processorInfo", "Lcash/z/ecc/android/sdk/block/CompactBlockProcessor$ProcessorInfo;", "onStatus", "status", "Lcash/z/ecc/android/sdk/Synchronizer$Status;", "refresh", "send", "amount", "address", "memo", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "start", "stop", "updateSyncingState", "validate", "Companion", "ZcashError", "app_debug"})
public final class ZcashAdapter implements io.horizontalsystems.bankwallet.core.IAdapter, io.horizontalsystems.bankwallet.core.IBalanceAdapter, io.horizontalsystems.bankwallet.core.IReceiveAdapter, io.horizontalsystems.bankwallet.core.ITransactionsAdapter, io.horizontalsystems.bankwallet.core.ISendZcashAdapter {
    private final int confirmationsThreshold = 10;
    private final long feeChangeHeight = 0L;
    private final java.lang.String lightWalletDHost = null;
    private final int lightWalletDPort = 9067;
    private final cash.z.ecc.android.sdk.Synchronizer synchronizer = null;
    private final byte[] seed = null;
    private final io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashTransactionsProvider transactionsProvider = null;
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> adapterStateUpdatedSubject = null;
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> lastBlockUpdatedSubject = null;
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> balanceUpdatedSubject = null;
    private int scanProgress = 0;
    private int downloadProgress = 0;
    private io.horizontalsystems.bankwallet.core.AdapterState syncState;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String receiveAddress = null;
    private static final java.lang.String ALIAS_PREFIX = "zcash_";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashAdapter.Companion Companion = null;
    
    private final long defaultFee(java.lang.Long height) {
        return 0L;
    }
    
    private final void setSyncState(io.horizontalsystems.bankwallet.core.AdapterState value) {
    }
    
    @java.lang.Override()
    public void start() {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDebugInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.core.AdapterState getBalanceState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getBalanceStateUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.math.BigDecimal getBalanceLocked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getBalanceUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getReceiveAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.core.AdapterState getTransactionsState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getTransactionsStateUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.LastBlockInfo getLastBlockInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getLastBlockUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord>> getTransactions(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.TransactionRecord from, int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord>> getTransactionRecordsFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getAvailableBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getFee() {
        return null;
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String memo, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AppLogger logger) {
        return null;
    }
    
    private final boolean onProcessorError(java.lang.Throwable error) {
        return false;
    }
    
    private final void onChainError(int errorHeight, int rewindHeight) {
    }
    
    private final void onStatus(cash.z.ecc.android.sdk.Synchronizer.Status status) {
    }
    
    private final void onDownloadProgress(int progress) {
    }
    
    private final void onProcessorInfo(cash.z.ecc.android.sdk.block.CompactBlockProcessor.ProcessorInfo processorInfo) {
    }
    
    private final void onBalance(cash.z.ecc.android.sdk.block.CompactBlockProcessor.WalletBalance balance) {
    }
    
    private final void updateSyncingState() {
    }
    
    private final io.horizontalsystems.bankwallet.entities.TransactionRecord getTransactionRecord(io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashTransaction zcashTransaction) {
        return null;
    }
    
    public ZcashAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.RestoreSettings restoreSettings, boolean testMode) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getRawTransaction(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/zcash/ZcashAdapter$ZcashError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "InvalidAddress", "SendToSelfNotAllowed", "TransparentAddressNotAllowed", "Lio/horizontalsystems/bankwallet/core/adapters/zcash/ZcashAdapter$ZcashError$InvalidAddress;", "Lio/horizontalsystems/bankwallet/core/adapters/zcash/ZcashAdapter$ZcashError$TransparentAddressNotAllowed;", "Lio/horizontalsystems/bankwallet/core/adapters/zcash/ZcashAdapter$ZcashError$SendToSelfNotAllowed;", "app_debug"})
    public static abstract class ZcashError extends java.lang.Exception {
        
        private ZcashError() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/zcash/ZcashAdapter$ZcashError$InvalidAddress;", "Lio/horizontalsystems/bankwallet/core/adapters/zcash/ZcashAdapter$ZcashError;", "()V", "app_debug"})
        public static final class InvalidAddress extends io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashAdapter.ZcashError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashAdapter.ZcashError.InvalidAddress INSTANCE = null;
            
            private InvalidAddress() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/zcash/ZcashAdapter$ZcashError$TransparentAddressNotAllowed;", "Lio/horizontalsystems/bankwallet/core/adapters/zcash/ZcashAdapter$ZcashError;", "()V", "app_debug"})
        public static final class TransparentAddressNotAllowed extends io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashAdapter.ZcashError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashAdapter.ZcashError.TransparentAddressNotAllowed INSTANCE = null;
            
            private TransparentAddressNotAllowed() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/zcash/ZcashAdapter$ZcashError$SendToSelfNotAllowed;", "Lio/horizontalsystems/bankwallet/core/adapters/zcash/ZcashAdapter$ZcashError;", "()V", "app_debug"})
        public static final class SendToSelfNotAllowed extends io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashAdapter.ZcashError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.core.adapters.zcash.ZcashAdapter.ZcashError.SendToSelfNotAllowed INSTANCE = null;
            
            private SendToSelfNotAllowed() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/zcash/ZcashAdapter$Companion;", "", "()V", "ALIAS_PREFIX", "", "clear", "", "accountId", "getValidAliasFromAccountId", "app_debug"})
    public static final class Companion {
        
        private final java.lang.String getValidAliasFromAccountId(java.lang.String accountId) {
            return null;
        }
        
        public final void clear(@org.jetbrains.annotations.NotNull()
        java.lang.String accountId) {
        }
        
        private Companion() {
            super();
        }
    }
}