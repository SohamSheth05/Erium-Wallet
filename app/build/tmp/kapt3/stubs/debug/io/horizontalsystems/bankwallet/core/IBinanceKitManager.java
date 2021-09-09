package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R \u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IBinanceKitManager;", "", "binanceKit", "Lio/horizontalsystems/binancechainkit/BinanceChainKit;", "getBinanceKit", "()Lio/horizontalsystems/binancechainkit/BinanceChainKit;", "statusInfo", "", "", "getStatusInfo", "()Ljava/util/Map;", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "unlink", "", "app_debug"})
public abstract interface IBinanceKitManager {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.binancechainkit.BinanceChainKit getBinanceKit();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.Map<java.lang.String, java.lang.Object> getStatusInfo();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.binancechainkit.BinanceChainKit binanceKit(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet);
    
    public abstract void unlink();
}