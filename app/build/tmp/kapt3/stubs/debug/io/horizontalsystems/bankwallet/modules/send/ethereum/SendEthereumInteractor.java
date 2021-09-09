package io.horizontalsystems.bankwallet.modules.send.ethereum;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J/\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016\u00a2\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J6\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\b\u00a8\u0006!"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/ethereum/SendEthereumInteractor;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendEthereumInteractor;", "adapter", "Lio/horizontalsystems/bankwallet/core/ISendEthereumAdapter;", "(Lio/horizontalsystems/bankwallet/core/ISendEthereumAdapter;)V", "balance", "Ljava/math/BigDecimal;", "getBalance", "()Ljava/math/BigDecimal;", "ethereumBalance", "getEthereumBalance", "minimumAmount", "getMinimumAmount", "minimumRequiredBalance", "getMinimumRequiredBalance", "availableBalance", "gasPrice", "", "gasLimit", "estimateGasLimit", "Lio/reactivex/Single;", "toAddress", "", "value", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;)Lio/reactivex/Single;", "fee", "send", "", "amount", "address", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "validate", "app_debug"})
public final class SendEthereumInteractor implements io.horizontalsystems.bankwallet.modules.send.SendModule.ISendEthereumInteractor {
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal balance = null;
    private final io.horizontalsystems.bankwallet.core.ISendEthereumAdapter adapter = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getEthereumBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getMinimumRequiredBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getMinimumAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal availableBalance(long gasPrice, long gasLimit) {
        return null;
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
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
    
    public SendEthereumInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ISendEthereumAdapter adapter) {
        super();
    }
}