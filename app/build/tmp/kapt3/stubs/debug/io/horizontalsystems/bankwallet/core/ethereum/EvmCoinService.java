package io.horizontalsystems.bankwallet.core.ethereum;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0013J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ethereum/EvmCoinService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "currencyManager", "Lio/horizontalsystems/core/ICurrencyManager;", "xRateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "(Lio/horizontalsystems/coinkit2/models/Coin;Lio/horizontalsystems/core/ICurrencyManager;Lio/horizontalsystems/bankwallet/core/IRateManager;)V", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "rate", "Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "getRate", "()Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "amountData", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountData;", "value", "Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "clear", "", "coinValue", "Lio/horizontalsystems/bankwallet/entities/CoinValue;", "convertToFractionalMonetaryValue", "convertToMonetaryValue", "app_debug"})
public final class EvmCoinService implements io.horizontalsystems.bankwallet.core.Clearable {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.coinkit2.models.Coin coin = null;
    private final io.horizontalsystems.core.ICurrencyManager currencyManager = null;
    private final io.horizontalsystems.bankwallet.core.IRateManager xRateManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue getRate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountData amountData(@org.jetbrains.annotations.NotNull()
    java.math.BigInteger value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountData amountData(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.CoinValue coinValue(@org.jetbrains.annotations.NotNull()
    java.math.BigInteger value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal convertToMonetaryValue(@org.jetbrains.annotations.NotNull()
    java.math.BigInteger value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigInteger convertToFractionalMonetaryValue(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal value) {
        return null;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.coinkit2.models.Coin getCoin() {
        return null;
    }
    
    public EvmCoinService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager xRateManager) {
        super();
    }
}