package io.horizontalsystems.bankwallet.modules.send.binance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/binance/SendBinanceInteractor;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendBinanceInteractor;", "adapter", "Lio/horizontalsystems/bankwallet/core/ISendBinanceAdapter;", "(Lio/horizontalsystems/bankwallet/core/ISendBinanceAdapter;)V", "availableBalance", "Ljava/math/BigDecimal;", "getAvailableBalance", "()Ljava/math/BigDecimal;", "availableBinanceBalance", "getAvailableBinanceBalance", "fee", "getFee", "send", "Lio/reactivex/Single;", "", "amount", "address", "", "memo", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "validate", "app_debug"})
public final class SendBinanceInteractor implements io.horizontalsystems.bankwallet.modules.send.SendModule.ISendBinanceInteractor {
    private final io.horizontalsystems.bankwallet.core.ISendBinanceAdapter adapter = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getAvailableBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getAvailableBinanceBalance() {
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
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.String memo, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AppLogger logger) {
        return null;
    }
    
    public SendBinanceInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ISendBinanceAdapter adapter) {
        super();
    }
}