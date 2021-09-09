package io.horizontalsystems.bankwallet.modules.market;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\nH\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J\t\u0010#\u001a\u00020\rH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003J]\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020*H\u00d6\u0001J\t\u0010+\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018\u00a8\u0006-"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketItem;", "", "score", "Lio/horizontalsystems/bankwallet/modules/market/Score;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "coinCode", "", "coinName", "volume", "Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "rate", "diff", "Ljava/math/BigDecimal;", "marketCap", "(Lio/horizontalsystems/bankwallet/modules/market/Score;Lio/horizontalsystems/coinkit2/models/CoinType;Ljava/lang/String;Ljava/lang/String;Lio/horizontalsystems/bankwallet/entities/CurrencyValue;Lio/horizontalsystems/bankwallet/entities/CurrencyValue;Ljava/math/BigDecimal;Lio/horizontalsystems/bankwallet/entities/CurrencyValue;)V", "getCoinCode", "()Ljava/lang/String;", "getCoinName", "getCoinType", "()Lio/horizontalsystems/coinkit2/models/CoinType;", "getDiff", "()Ljava/math/BigDecimal;", "getMarketCap", "()Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "getRate", "getScore", "()Lio/horizontalsystems/bankwallet/modules/market/Score;", "getVolume", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_debug"})
public final class MarketItem {
    @org.jetbrains.annotations.Nullable()
    private final io.horizontalsystems.bankwallet.modules.market.Score score = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.coinkit2.models.CoinType coinType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coinCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coinName = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.entities.CurrencyValue volume = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.entities.CurrencyValue rate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal diff = null;
    @org.jetbrains.annotations.Nullable()
    private final io.horizontalsystems.bankwallet.entities.CurrencyValue marketCap = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.market.MarketItem.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.market.Score getScore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.coinkit2.models.CoinType getCoinType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoinCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoinName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue getVolume() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue getRate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getDiff() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue getMarketCap() {
        return null;
    }
    
    public MarketItem(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.market.Score score, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String coinName, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CurrencyValue volume, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CurrencyValue rate, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal diff, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.CurrencyValue marketCap) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.market.Score component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.coinkit2.models.CoinType component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.market.MarketItem copy(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.market.Score score, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String coinName, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CurrencyValue volume, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CurrencyValue rate, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal diff, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.CurrencyValue marketCap) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketItem$Companion;", "", "()V", "createFromCoinMarket", "Lio/horizontalsystems/bankwallet/modules/market/MarketItem;", "coinMarket", "Lio/horizontalsystems/xrateskit2/entities/CoinMarket;", "currency", "Lio/horizontalsystems/core/entities/Currency;", "score", "Lio/horizontalsystems/bankwallet/modules/market/Score;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.market.MarketItem createFromCoinMarket(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.xrateskit2.entities.CoinMarket coinMarket, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.core.entities.Currency currency, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.market.Score score) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}