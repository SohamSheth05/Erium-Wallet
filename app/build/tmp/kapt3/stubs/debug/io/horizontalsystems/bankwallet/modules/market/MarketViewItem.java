package io.horizontalsystems.bankwallet.modules.market;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0002+,B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0000J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0000J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0007H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\t\u0010$\u001a\u00020\u000bH\u00c6\u0003J\t\u0010%\u001a\u00020\rH\u00c6\u0003JQ\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010\'\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020)H\u00d6\u0001J\t\u0010*\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006-"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem;", "", "score", "Lio/horizontalsystems/bankwallet/modules/market/Score;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "coinCode", "", "coinName", "rate", "diff", "Ljava/math/BigDecimal;", "marketDataValue", "Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem$MarketDataValue;", "(Lio/horizontalsystems/bankwallet/modules/market/Score;Lio/horizontalsystems/coinkit2/models/CoinType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem$MarketDataValue;)V", "getCoinCode", "()Ljava/lang/String;", "getCoinName", "getCoinType", "()Lio/horizontalsystems/coinkit2/models/CoinType;", "getDiff", "()Ljava/math/BigDecimal;", "getMarketDataValue", "()Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem$MarketDataValue;", "getRate", "getScore", "()Lio/horizontalsystems/bankwallet/modules/market/Score;", "areContentsTheSame", "", "other", "areItemsTheSame", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "hashCode", "", "toString", "Companion", "MarketDataValue", "app_debug"})
public final class MarketViewItem {
    @org.jetbrains.annotations.Nullable()
    private final io.horizontalsystems.bankwallet.modules.market.Score score = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.coinkit2.models.CoinType coinType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coinCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coinName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String rate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal diff = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.market.MarketViewItem.MarketDataValue marketDataValue = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.market.MarketViewItem.Companion Companion = null;
    
    public final boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.MarketViewItem other) {
        return false;
    }
    
    public final boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.MarketViewItem other) {
        return false;
    }
    
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
    public final java.lang.String getRate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getDiff() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.market.MarketViewItem.MarketDataValue getMarketDataValue() {
        return null;
    }
    
    public MarketViewItem(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.market.Score score, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String coinName, @org.jetbrains.annotations.NotNull()
    java.lang.String rate, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal diff, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.MarketViewItem.MarketDataValue marketDataValue) {
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
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.market.MarketViewItem.MarketDataValue component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.market.MarketViewItem copy(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.market.Score score, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String coinName, @org.jetbrains.annotations.NotNull()
    java.lang.String rate, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal diff, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.MarketViewItem.MarketDataValue marketDataValue) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem$MarketDataValue;", "", "()V", "Diff", "MarketCap", "Volume", "Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem$MarketDataValue$MarketCap;", "Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem$MarketDataValue$Volume;", "Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem$MarketDataValue$Diff;", "app_debug"})
    public static abstract class MarketDataValue {
        
        private MarketDataValue() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem$MarketDataValue$MarketCap;", "Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem$MarketDataValue;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "app_debug"})
        public static final class MarketCap extends io.horizontalsystems.bankwallet.modules.market.MarketViewItem.MarketDataValue {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String value = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getValue() {
                return null;
            }
            
            public MarketCap(@org.jetbrains.annotations.NotNull()
            java.lang.String value) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem$MarketDataValue$Volume;", "Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem$MarketDataValue;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "app_debug"})
        public static final class Volume extends io.horizontalsystems.bankwallet.modules.market.MarketViewItem.MarketDataValue {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String value = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getValue() {
                return null;
            }
            
            public Volume(@org.jetbrains.annotations.NotNull()
            java.lang.String value) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem$MarketDataValue$Diff;", "Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem$MarketDataValue;", "value", "Ljava/math/BigDecimal;", "(Ljava/math/BigDecimal;)V", "getValue", "()Ljava/math/BigDecimal;", "app_debug"})
        public static final class Diff extends io.horizontalsystems.bankwallet.modules.market.MarketViewItem.MarketDataValue {
            @org.jetbrains.annotations.NotNull()
            private final java.math.BigDecimal value = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.math.BigDecimal getValue() {
                return null;
            }
            
            public Diff(@org.jetbrains.annotations.NotNull()
            java.math.BigDecimal value) {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem$Companion;", "", "()V", "create", "Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem;", "marketItem", "Lio/horizontalsystems/bankwallet/modules/market/MarketItem;", "marketField", "Lio/horizontalsystems/bankwallet/modules/market/MarketField;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.market.MarketViewItem create(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.market.MarketItem marketItem, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.market.MarketField marketField) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}