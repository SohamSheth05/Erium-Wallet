package io.horizontalsystems.bankwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\tJ\u0016\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0005J&\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionMetadataDataSource;", "", "()V", "lastBlockInfos", "", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "rates", "Lio/horizontalsystems/coinkit2/models/Coin;", "", "Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "clearRates", "", "getLastBlockInfo", "wallet", "getRate", "coin", "timestamp", "setLastBlockInfo", "lastBlockInfo", "setRate", "rateValue", "Ljava/math/BigDecimal;", "currency", "Lio/horizontalsystems/core/entities/Currency;", "app_debug"})
public final class TransactionMetadataDataSource {
    private final java.util.Map<io.horizontalsystems.bankwallet.entities.Wallet, io.horizontalsystems.bankwallet.entities.LastBlockInfo> lastBlockInfos = null;
    private final java.util.Map<io.horizontalsystems.coinkit2.models.Coin, java.util.Map<java.lang.Long, io.horizontalsystems.bankwallet.entities.CurrencyValue>> rates = null;
    
    public final void setLastBlockInfo(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.LastBlockInfo lastBlockInfo, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.entities.LastBlockInfo getLastBlockInfo(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
        return null;
    }
    
    public final void setRate(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal rateValue, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency, long timestamp) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue getRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin, long timestamp) {
        return null;
    }
    
    public final void clearRates() {
    }
    
    public TransactionMetadataDataSource() {
        super();
    }
}