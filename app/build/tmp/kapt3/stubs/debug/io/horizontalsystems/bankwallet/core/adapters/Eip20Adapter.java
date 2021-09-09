package io.horizontalsystems.bankwallet.core.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 R2\u00020\u0001:\u0001RBC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000eJ\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b022\u0006\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u000205J\u0018\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u000208H\u0016J\u0010\u0010:\u001a\u00020\u00132\u0006\u0010;\u001a\u00020<H\u0002J/\u0010=\u001a\b\u0012\u0004\u0012\u000208022\b\u0010>\u001a\u0004\u0018\u00010\u001d2\u0006\u0010?\u001a\u00020@2\b\u00107\u001a\u0004\u0018\u000108H\u0014\u00a2\u0006\u0002\u0010AJ\u0018\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020@2\u0006\u0010E\u001a\u00020\u001dH\u0016J&\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\'022\b\u0010G\u001a\u0004\u0018\u00010(2\u0006\u0010H\u001a\u00020\u0007H\u0016J\b\u0010I\u001a\u00020\u0018H\u0016J6\u0010J\u001a\b\u0012\u0004\u0012\u00020\u0018022\u0006\u0010E\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020@2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002082\u0006\u0010K\u001a\u00020LH\u0014J\b\u0010M\u001a\u00020\u0018H\u0016J\b\u0010N\u001a\u00020\u0018H\u0016J\u0010\u0010O\u001a\u00020(2\u0006\u0010P\u001a\u00020QH\u0002R\u0014\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u000e\u0010\b\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u0011R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0011R\u0014\u0010\r\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0011R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'8F\u00a2\u0006\u0006\u001a\u0004\b)\u0010*R \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\'0\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u001aR\u0014\u0010-\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u0015R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b0\u0010\u001a\u00a8\u0006S"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/Eip20Adapter;", "Lio/horizontalsystems/bankwallet/core/adapters/BaseEvmAdapter;", "context", "Landroid/content/Context;", "evmKit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "decimal", "", "contractAddress", "", "fee", "Ljava/math/BigDecimal;", "minimumRequiredBalance", "minimumSendAmount", "(Landroid/content/Context;Lio/horizontalsystems/ethereumkit/core/EthereumKit;ILjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "balance", "getBalance", "()Ljava/math/BigDecimal;", "balanceState", "Lio/horizontalsystems/bankwallet/core/AdapterState;", "getBalanceState", "()Lio/horizontalsystems/bankwallet/core/AdapterState;", "balanceStateUpdatedFlowable", "Lio/reactivex/Flowable;", "", "getBalanceStateUpdatedFlowable", "()Lio/reactivex/Flowable;", "balanceUpdatedFlowable", "getBalanceUpdatedFlowable", "Lio/horizontalsystems/ethereumkit/models/Address;", "eip20Kit", "Lio/horizontalsystems/erc20kit/core/Erc20Kit;", "getEip20Kit", "()Lio/horizontalsystems/erc20kit/core/Erc20Kit;", "ethereumBalance", "getEthereumBalance", "getMinimumRequiredBalance", "getMinimumSendAmount", "pendingTransactions", "", "Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "getPendingTransactions", "()Ljava/util/List;", "transactionRecordsFlowable", "getTransactionRecordsFlowable", "transactionsState", "getTransactionsState", "transactionsStateUpdatedFlowable", "getTransactionsStateUpdatedFlowable", "allowance", "Lio/reactivex/Single;", "spenderAddress", "defaultBlockParameter", "Lio/horizontalsystems/ethereumkit/models/DefaultBlockParameter;", "availableBalance", "gasPrice", "", "gasLimit", "convertToAdapterState", "syncState", "Lio/horizontalsystems/ethereumkit/core/EthereumKit$SyncState;", "estimateGasLimitInternal", "toAddress", "value", "Ljava/math/BigInteger;", "(Lio/horizontalsystems/ethereumkit/models/Address;Ljava/math/BigInteger;Ljava/lang/Long;)Lio/reactivex/Single;", "getTransactionData", "Lio/horizontalsystems/ethereumkit/models/TransactionData;", "amount", "address", "getTransactions", "from", "limit", "refresh", "sendInternal", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "start", "stop", "transactionRecord", "transaction", "Lio/horizontalsystems/erc20kit/models/Transaction;", "Companion", "app_debug"})
public final class Eip20Adapter extends io.horizontalsystems.bankwallet.core.adapters.BaseEvmAdapter {
    private final io.horizontalsystems.ethereumkit.models.Address contractAddress = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.erc20kit.core.Erc20Kit eip20Kit = null;
    private final java.math.BigDecimal fee = null;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal minimumRequiredBalance = null;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal minimumSendAmount = null;
    private static final int approveConfirmationsThreshold = 1;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.adapters.Eip20Adapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.erc20kit.core.Erc20Kit getEip20Kit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.entities.TransactionRecord> getPendingTransactions() {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getBalanceUpdatedFlowable() {
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
    protected io.reactivex.Single<kotlin.Unit> sendInternal(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.models.Address address, @org.jetbrains.annotations.NotNull()
    java.math.BigInteger amount, long gasPrice, long gasLimit, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AppLogger logger) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected io.reactivex.Single<java.lang.Long> estimateGasLimitInternal(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.ethereumkit.models.Address toAddress, @org.jetbrains.annotations.NotNull()
    java.math.BigInteger value, @org.jetbrains.annotations.Nullable()
    java.lang.Long gasPrice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal availableBalance(long gasPrice, long gasLimit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getEthereumBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.ethereumkit.models.TransactionData getTransactionData(@org.jetbrains.annotations.NotNull()
    java.math.BigInteger amount, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.models.Address address) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.core.AdapterState convertToAdapterState(io.horizontalsystems.ethereumkit.core.EthereumKit.SyncState syncState) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.entities.TransactionRecord transactionRecord(io.horizontalsystems.erc20kit.models.Transaction transaction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.math.BigDecimal> allowance(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.models.Address spenderAddress, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.models.DefaultBlockParameter defaultBlockParameter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getMinimumRequiredBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getMinimumSendAmount() {
        return null;
    }
    
    public Eip20Adapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.core.EthereumKit evmKit, int decimal, @org.jetbrains.annotations.NotNull()
    java.lang.String contractAddress, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal fee, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal minimumRequiredBalance, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal minimumSendAmount) {
        super(null, 0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/Eip20Adapter$Companion;", "", "()V", "approveConfirmationsThreshold", "", "clear", "", "walletId", "", "testMode", "", "app_debug"})
    public static final class Companion {
        
        public final void clear(@org.jetbrains.annotations.NotNull()
        java.lang.String walletId, boolean testMode) {
        }
        
        private Companion() {
            super();
        }
    }
}