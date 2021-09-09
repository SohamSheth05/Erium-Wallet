package io.horizontalsystems.bankwallet.entities;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/PriceAlert;", "", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "coinName", "", "changeState", "Lio/horizontalsystems/bankwallet/entities/PriceAlert$ChangeState;", "trendState", "Lio/horizontalsystems/bankwallet/entities/PriceAlert$TrendState;", "(Lio/horizontalsystems/coinkit2/models/CoinType;Ljava/lang/String;Lio/horizontalsystems/bankwallet/entities/PriceAlert$ChangeState;Lio/horizontalsystems/bankwallet/entities/PriceAlert$TrendState;)V", "getChangeState", "()Lio/horizontalsystems/bankwallet/entities/PriceAlert$ChangeState;", "setChangeState", "(Lio/horizontalsystems/bankwallet/entities/PriceAlert$ChangeState;)V", "getCoinName", "()Ljava/lang/String;", "getCoinType", "()Lio/horizontalsystems/coinkit2/models/CoinType;", "getTrendState", "()Lio/horizontalsystems/bankwallet/entities/PriceAlert$TrendState;", "setTrendState", "(Lio/horizontalsystems/bankwallet/entities/PriceAlert$TrendState;)V", "ChangeState", "TrendState", "app_debug"})
public final class PriceAlert {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private final io.horizontalsystems.coinkit2.models.CoinType coinType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coinName = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState changeState;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState trendState;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.coinkit2.models.CoinType getCoinType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoinName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState getChangeState() {
        return null;
    }
    
    public final void setChangeState(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState getTrendState() {
        return null;
    }
    
    public final void setTrendState(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState p0) {
    }
    
    public PriceAlert(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String coinName, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState changeState, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState trendState) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/PriceAlert$ChangeState;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getIntValue", "", "OFF", "PERCENT_2", "PERCENT_5", "PERCENT_10", "Companion", "app_debug"})
    public static enum ChangeState {
        /*public static final*/ OFF /* = new OFF(null) */,
        /*public static final*/ PERCENT_2 /* = new PERCENT_2(null) */,
        /*public static final*/ PERCENT_5 /* = new PERCENT_5(null) */,
        /*public static final*/ PERCENT_10 /* = new PERCENT_10(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState.Companion Companion = null;
        
        public final int getIntValue() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        ChangeState(java.lang.String value) {
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/PriceAlert$ChangeState$Companion;", "", "()V", "valueOf", "Lio/horizontalsystems/bankwallet/entities/PriceAlert$ChangeState;", "value", "", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState valueOf(@org.jetbrains.annotations.Nullable()
            java.lang.String value) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/PriceAlert$TrendState;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OFF", "SHORT", "LONG", "Companion", "app_debug"})
    public static enum TrendState {
        /*public static final*/ OFF /* = new OFF(null) */,
        /*public static final*/ SHORT /* = new SHORT(null) */,
        /*public static final*/ LONG /* = new LONG(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        TrendState(java.lang.String value) {
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/PriceAlert$TrendState$Companion;", "", "()V", "valueOf", "Lio/horizontalsystems/bankwallet/entities/PriceAlert$TrendState;", "value", "", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState valueOf(@org.jetbrains.annotations.Nullable()
            java.lang.String value) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}