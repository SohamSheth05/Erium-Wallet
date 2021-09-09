package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH&J8\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH&J\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH&J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&JN\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J&\u0010\u001a\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ISendBitcoinAdapter;", "", "balance", "Ljava/math/BigDecimal;", "getBalance", "()Ljava/math/BigDecimal;", "availableBalance", "feeRate", "", "address", "", "pluginData", "", "", "Lio/horizontalsystems/bitcoincore/core/IPluginData;", "fee", "amount", "maximumSendAmount", "minimumSendAmount", "send", "Lio/reactivex/Single;", "", "transactionSorting", "Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "validate", "app_debug"})
public abstract interface ISendBitcoinAdapter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal getBalance();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal availableBalance(long feeRate, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal minimumSendAmount(@org.jetbrains.annotations.Nullable()
    java.lang.String address);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.math.BigDecimal maximumSendAmount(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.math.BigDecimal fee(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, long feeRate, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData);
    
    public abstract void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String address, long feeRate, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.TransactionDataSortingType transactionSorting, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AppLogger logger);
}