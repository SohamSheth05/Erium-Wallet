package io.horizontalsystems.bankwallet.core.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001:B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\b\u001a\u00020\tH\u0004J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0002J\u0010\u0010$\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001fH\u0004J/\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&2\b\u0010(\u001a\u0004\u0018\u00010\f2\u0006\u0010)\u001a\u00020\u001f2\b\u0010*\u001a\u0004\u0018\u00010\'H\u0016\u00a2\u0006\u0002\u0010+J/\u0010,\u001a\b\u0012\u0004\u0012\u00020\'0&2\b\u0010(\u001a\u0004\u0018\u00010-2\u0006\u0010)\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010\'H$\u00a2\u0006\u0002\u0010.J\u0018\u0010/\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\'2\u0006\u00100\u001a\u00020\'H\u0016J\u001a\u00101\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\b\b\u0002\u00102\u001a\u00020\tH\u0004J\u001a\u00103\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001f2\b\b\u0002\u00102\u001a\u00020\tH\u0004J6\u00104\u001a\b\u0012\u0004\u0012\u00020\u00190&2\u0006\u0010#\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\f2\u0006\u0010*\u001a\u00020\'2\u0006\u00100\u001a\u00020\'2\u0006\u00106\u001a\u000207H\u0016J6\u00108\u001a\b\u0012\u0004\u0012\u00020\u00190&2\u0006\u00105\u001a\u00020-2\u0006\u0010#\u001a\u00020!2\u0006\u0010*\u001a\u00020\'2\u0006\u00100\u001a\u00020\'2\u0006\u00106\u001a\u000207H$J\u0010\u00109\u001a\u00020\u00192\u0006\u00105\u001a\u00020\fH\u0016R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u000e\u00a8\u0006;"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/BaseEvmAdapter;", "Lio/horizontalsystems/bankwallet/core/IAdapter;", "Lio/horizontalsystems/bankwallet/core/ISendEthereumAdapter;", "Lio/horizontalsystems/bankwallet/core/ITransactionsAdapter;", "Lio/horizontalsystems/bankwallet/core/IBalanceAdapter;", "Lio/horizontalsystems/bankwallet/core/IReceiveAdapter;", "evmKit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "decimal", "", "(Lio/horizontalsystems/ethereumkit/core/EthereumKit;I)V", "debugInfo", "", "getDebugInfo", "()Ljava/lang/String;", "getDecimal", "()I", "getEvmKit", "()Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "lastBlockInfo", "Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "getLastBlockInfo", "()Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "lastBlockUpdatedFlowable", "Lio/reactivex/Flowable;", "", "getLastBlockUpdatedFlowable", "()Lio/reactivex/Flowable;", "receiveAddress", "getReceiveAddress", "balanceInBigDecimal", "Ljava/math/BigDecimal;", "balance", "Ljava/math/BigInteger;", "convertToEther", "amount", "convertToWei", "estimateGasLimit", "Lio/reactivex/Single;", "", "toAddress", "value", "gasPrice", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;)Lio/reactivex/Single;", "estimateGasLimitInternal", "Lio/horizontalsystems/ethereumkit/models/Address;", "(Lio/horizontalsystems/ethereumkit/models/Address;Ljava/math/BigInteger;Ljava/lang/Long;)Lio/reactivex/Single;", "fee", "gasLimit", "scaleDown", "decimals", "scaleUp", "send", "address", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "sendInternal", "validate", "Companion", "app_debug"})
public abstract class BaseEvmAdapter implements io.horizontalsystems.bankwallet.core.IAdapter, io.horizontalsystems.bankwallet.core.ISendEthereumAdapter, io.horizontalsystems.bankwallet.core.ITransactionsAdapter, io.horizontalsystems.bankwallet.core.IBalanceAdapter, io.horizontalsystems.bankwallet.core.IReceiveAdapter {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.ethereumkit.core.EthereumKit evmKit = null;
    private final int decimal = 0;
    public static final int confirmationsThreshold = 12;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.adapters.BaseEvmAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDebugInfo() {
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
    public java.math.BigDecimal fee(long gasPrice, long gasLimit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String address, long gasPrice, long gasLimit, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AppLogger logger) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.lang.Long> estimateGasLimit(@org.jetbrains.annotations.Nullable()
    java.lang.String toAddress, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal value, @org.jetbrains.annotations.Nullable()
    java.lang.Long gasPrice) {
        return null;
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.math.BigDecimal scaleDown(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, int decimals) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.math.BigInteger scaleUp(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, int decimals) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.math.BigInteger convertToWei(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount) {
        return null;
    }
    
    private final java.math.BigDecimal convertToEther(java.math.BigDecimal amount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getReceiveAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.math.BigDecimal balanceInBigDecimal(@org.jetbrains.annotations.Nullable()
    java.math.BigInteger balance, int decimal) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract io.reactivex.Single<kotlin.Unit> sendInternal(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.models.Address address, @org.jetbrains.annotations.NotNull()
    java.math.BigInteger amount, long gasPrice, long gasLimit, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AppLogger logger);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract io.reactivex.Single<java.lang.Long> estimateGasLimitInternal(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.ethereumkit.models.Address toAddress, @org.jetbrains.annotations.NotNull()
    java.math.BigInteger value, @org.jetbrains.annotations.Nullable()
    java.lang.Long gasPrice);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.ethereumkit.core.EthereumKit getEvmKit() {
        return null;
    }
    
    public final int getDecimal() {
        return 0;
    }
    
    public BaseEvmAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.core.EthereumKit evmKit, int decimal) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getRawTransaction(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.math.BigDecimal getBalanceLocked() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/BaseEvmAdapter$Companion;", "", "()V", "confirmationsThreshold", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}