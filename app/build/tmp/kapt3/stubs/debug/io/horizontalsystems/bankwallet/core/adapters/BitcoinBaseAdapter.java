package io.horizontalsystems.bankwallet.core.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 r2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001rB!\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ.\u0010K\u001a\u00020\u00132\u0006\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010%2\u0014\u0010O\u001a\u0010\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020Q\u0018\u000107J\b\u0010R\u001a\u00020\u000fH\u0016J6\u0010S\u001a\u00020\u00132\u0006\u0010T\u001a\u00020\u00132\u0006\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010%2\u0014\u0010O\u001a\u0010\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020Q\u0018\u000107J\u0012\u0010U\u001a\u0004\u0018\u00010%2\u0006\u0010V\u001a\u00020%H\u0016J&\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B0X2\b\u0010Y\u001a\u0004\u0018\u00010C2\u0006\u0010Z\u001a\u00020[H\u0016J\u001c\u0010\\\u001a\u0004\u0018\u00010\u00132\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020Q07J\u0010\u0010]\u001a\u00020\u00132\b\u0010N\u001a\u0004\u0018\u00010%J\b\u0010^\u001a\u00020\u000fH\u0016J\u001a\u0010_\u001a\u00020\u00132\u0006\u0010=\u001a\u00020M2\b\b\u0002\u0010`\u001a\u00020aH\u0002J\u0019\u0010_\u001a\u0004\u0018\u00010\u00132\b\u0010=\u001a\u0004\u0018\u00010MH\u0002\u00a2\u0006\u0002\u0010bJL\u0010c\u001a\b\u0012\u0004\u0012\u00020\u000f0X2\u0006\u0010T\u001a\u00020\u00132\u0006\u0010N\u001a\u00020%2\u0006\u0010L\u001a\u00020M2\u0014\u0010O\u001a\u0010\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020Q\u0018\u0001072\b\u0010d\u001a\u0004\u0018\u00010e2\u0006\u0010f\u001a\u00020gJ\u0010\u0010h\u001a\u00020\u000f2\u0006\u0010i\u001a\u00020jH\u0004J\b\u0010k\u001a\u00020\u000fH\u0016J\b\u0010l\u001a\u00020\u000fH\u0016J\u000e\u0010m\u001a\u00020C2\u0006\u0010n\u001a\u00020oJ$\u0010p\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020%2\u0014\u0010O\u001a\u0010\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020Q\u0018\u000107J\b\u0010q\u001a\u00020\u000fH\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0011R\u0014\u0010$\u001a\u00020%X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010*\u001a\u0004\u0018\u00010+8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u001fR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0011R\u0014\u00102\u001a\u00020%8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b3\u0010\'R\u0012\u00104\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b5\u0010\u0015R\u001d\u00106\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u000208078F\u00a2\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u001e\u0010>\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u0019@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b?\u0010@R \u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B0\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bD\u0010\u001fR \u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B0\u000eX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0011R\u0014\u0010G\u001a\u00020\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bH\u0010\u001bR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bJ\u0010\u001f\u00a8\u0006s"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/BitcoinBaseAdapter;", "Lio/horizontalsystems/bankwallet/core/IAdapter;", "Lio/horizontalsystems/bankwallet/core/ITransactionsAdapter;", "Lio/horizontalsystems/bankwallet/core/IBalanceAdapter;", "Lio/horizontalsystems/bankwallet/core/IReceiveAdapter;", "Lio/horizontalsystems/core/BackgroundManager$Listener;", "kit", "Lio/horizontalsystems/bitcoincore/AbstractKit;", "syncMode", "Lio/horizontalsystems/bankwallet/entities/SyncMode;", "backgroundManager", "Lio/horizontalsystems/core/BackgroundManager;", "(Lio/horizontalsystems/bitcoincore/AbstractKit;Lio/horizontalsystems/bankwallet/entities/SyncMode;Lio/horizontalsystems/core/BackgroundManager;)V", "adapterStateUpdatedSubject", "Lio/reactivex/subjects/PublishSubject;", "", "getAdapterStateUpdatedSubject", "()Lio/reactivex/subjects/PublishSubject;", "balance", "Ljava/math/BigDecimal;", "getBalance", "()Ljava/math/BigDecimal;", "balanceLocked", "getBalanceLocked", "balanceState", "Lio/horizontalsystems/bankwallet/core/AdapterState;", "getBalanceState", "()Lio/horizontalsystems/bankwallet/core/AdapterState;", "balanceStateUpdatedFlowable", "Lio/reactivex/Flowable;", "getBalanceStateUpdatedFlowable", "()Lio/reactivex/Flowable;", "balanceUpdatedFlowable", "getBalanceUpdatedFlowable", "balanceUpdatedSubject", "getBalanceUpdatedSubject", "debugInfo", "", "getDebugInfo", "()Ljava/lang/String;", "getKit", "()Lio/horizontalsystems/bitcoincore/AbstractKit;", "lastBlockInfo", "Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "getLastBlockInfo", "()Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "lastBlockUpdatedFlowable", "getLastBlockUpdatedFlowable", "lastBlockUpdatedSubject", "getLastBlockUpdatedSubject", "receiveAddress", "getReceiveAddress", "satoshisInBitcoin", "getSatoshisInBitcoin", "statusInfo", "", "", "getStatusInfo", "()Ljava/util/Map;", "getSyncMode", "()Lio/horizontalsystems/bankwallet/entities/SyncMode;", "value", "syncState", "setSyncState", "(Lio/horizontalsystems/bankwallet/core/AdapterState;)V", "transactionRecordsFlowable", "", "Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "getTransactionRecordsFlowable", "transactionRecordsSubject", "getTransactionRecordsSubject", "transactionsState", "getTransactionsState", "transactionsStateUpdatedFlowable", "getTransactionsStateUpdatedFlowable", "availableBalance", "feeRate", "", "address", "pluginData", "", "Lio/horizontalsystems/bitcoincore/core/IPluginData;", "didEnterBackground", "fee", "amount", "getRawTransaction", "transactionHash", "getTransactions", "Lio/reactivex/Single;", "from", "limit", "", "maximumSendAmount", "minimumSendAmount", "refresh", "satoshiToBTC", "roundingMode", "Ljava/math/RoundingMode;", "(Ljava/lang/Long;)Ljava/math/BigDecimal;", "send", "transactionSorting", "Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "setState", "kitState", "Lio/horizontalsystems/bitcoincore/BitcoinCore$KitState;", "start", "stop", "transactionRecord", "transaction", "Lio/horizontalsystems/bitcoincore/models/TransactionInfo;", "validate", "willEnterForeground", "Companion", "app_debug"})
public abstract class BitcoinBaseAdapter implements io.horizontalsystems.bankwallet.core.IAdapter, io.horizontalsystems.bankwallet.core.ITransactionsAdapter, io.horizontalsystems.bankwallet.core.IBalanceAdapter, io.horizontalsystems.bankwallet.core.IReceiveAdapter, io.horizontalsystems.core.BackgroundManager.Listener {
    private io.horizontalsystems.bankwallet.core.AdapterState syncState;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> balanceUpdatedSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> lastBlockUpdatedSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> adapterStateUpdatedSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord>> transactionRecordsSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String debugInfo = "";
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitcoincore.AbstractKit kit = null;
    @org.jetbrains.annotations.Nullable()
    private final io.horizontalsystems.bankwallet.entities.SyncMode syncMode = null;
    public static final int confirmationsThreshold = 3;
    public static final int decimal = 8;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.adapters.BitcoinBaseAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal getSatoshisInBitcoin();
    
    @java.lang.Override()
    public void willEnterForeground() {
    }
    
    @java.lang.Override()
    public void didEnterBackground() {
    }
    
    private final void setSyncState(io.horizontalsystems.bankwallet.core.AdapterState value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.core.AdapterState getTransactionsState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.core.AdapterState getBalanceState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.LastBlockInfo getLastBlockInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getReceiveAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.subjects.PublishSubject<kotlin.Unit> getBalanceUpdatedSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.subjects.PublishSubject<kotlin.Unit> getLastBlockUpdatedSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.subjects.PublishSubject<kotlin.Unit> getAdapterStateUpdatedSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.subjects.PublishSubject<java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord>> getTransactionRecordsSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getBalanceUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getLastBlockUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getTransactionsStateUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getBalanceStateUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord>> getTransactionRecordsFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDebugInfo() {
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
    public io.reactivex.Single<java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord>> getTransactions(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.TransactionRecord from, int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getRawTransaction(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash) {
        return null;
    }
    
    protected final void setState(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitcoincore.BitcoinCore.KitState kitState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String address, long feeRate, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.TransactionDataSortingType transactionSorting, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AppLogger logger) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal availableBalance(long feeRate, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal minimumSendAmount(@org.jetbrains.annotations.Nullable()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal maximumSendAmount(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal fee(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, long feeRate, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData) {
        return null;
    }
    
    public final void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.TransactionRecord transactionRecord(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitcoincore.models.TransactionInfo transaction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> getStatusInfo() {
        return null;
    }
    
    private final java.math.BigDecimal satoshiToBTC(long value, java.math.RoundingMode roundingMode) {
        return null;
    }
    
    private final java.math.BigDecimal satoshiToBTC(java.lang.Long value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitcoincore.AbstractKit getKit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.horizontalsystems.bankwallet.entities.SyncMode getSyncMode() {
        return null;
    }
    
    public BitcoinBaseAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitcoincore.AbstractKit kit, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.SyncMode syncMode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.BackgroundManager backgroundManager) {
        super();
    }
    
    public void willEnterForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/BitcoinBaseAdapter$Companion;", "", "()V", "confirmationsThreshold", "", "decimal", "getBip", "Lio/horizontalsystems/bitcoincore/core/Bip;", "derivation", "Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;", "getSyncMode", "Lio/horizontalsystems/bitcoincore/BitcoinCore$SyncMode;", "mode", "Lio/horizontalsystems/bankwallet/entities/SyncMode;", "getTransactionSortingType", "Lio/horizontalsystems/bitcoincore/models/TransactionDataSortType;", "sortType", "Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitcoincore.models.TransactionDataSortType getTransactionSortingType(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.entities.TransactionDataSortingType sortType) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitcoincore.core.Bip getBip(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.AccountType.Derivation derivation) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitcoincore.BitcoinCore.SyncMode getSyncMode(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.entities.SyncMode mode) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}