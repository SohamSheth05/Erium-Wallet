package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H&J/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&\u00a2\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H&J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H&J6\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00152\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$H&J\u0010\u0010%\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u0017H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005\u00a8\u0006&"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ISendEthereumAdapter;", "", "balance", "Ljava/math/BigDecimal;", "getBalance", "()Ljava/math/BigDecimal;", "ethereumBalance", "getEthereumBalance", "evmKit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "getEvmKit", "()Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "minimumRequiredBalance", "getMinimumRequiredBalance", "minimumSendAmount", "getMinimumSendAmount", "availableBalance", "gasPrice", "", "gasLimit", "estimateGasLimit", "Lio/reactivex/Single;", "toAddress", "", "value", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;)Lio/reactivex/Single;", "fee", "getTransactionData", "Lio/horizontalsystems/ethereumkit/models/TransactionData;", "amount", "Ljava/math/BigInteger;", "address", "Lio/horizontalsystems/ethereumkit/models/Address;", "send", "", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "validate", "app_debug"})
public abstract interface ISendEthereumAdapter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.ethereumkit.core.EthereumKit getEvmKit();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal getBalance();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal getEthereumBalance();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal getMinimumRequiredBalance();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal getMinimumSendAmount();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal availableBalance(long gasPrice, long gasLimit);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal fee(long gasPrice, long gasLimit);
    
    public abstract void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String address);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String address, long gasPrice, long gasLimit, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AppLogger logger);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.lang.Long> estimateGasLimit(@org.jetbrains.annotations.Nullable()
    java.lang.String toAddress, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal value, @org.jetbrains.annotations.Nullable()
    java.lang.Long gasPrice);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.ethereumkit.models.TransactionData getTransactionData(@org.jetbrains.annotations.NotNull()
    java.math.BigInteger amount, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.models.Address address);
}