package io.horizontalsystems.bankwallet.modules.coin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/CoinExtraPage;", "", "()V", "Investors", "TradingVolume", "Lio/horizontalsystems/bankwallet/modules/coin/CoinExtraPage$TradingVolume;", "Lio/horizontalsystems/bankwallet/modules/coin/CoinExtraPage$Investors;", "app_debug"})
public abstract class CoinExtraPage {
    
    private CoinExtraPage() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/CoinExtraPage$TradingVolume;", "Lio/horizontalsystems/bankwallet/modules/coin/CoinExtraPage;", "position", "Lio/horizontalsystems/views/ListPosition;", "value", "", "canShowMarkets", "", "(Lio/horizontalsystems/views/ListPosition;Ljava/lang/String;Z)V", "getCanShowMarkets", "()Z", "getPosition", "()Lio/horizontalsystems/views/ListPosition;", "getValue", "()Ljava/lang/String;", "app_debug"})
    public static final class TradingVolume extends io.horizontalsystems.bankwallet.modules.coin.CoinExtraPage {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.views.ListPosition position = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String value = null;
        private final boolean canShowMarkets = false;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.views.ListPosition getPosition() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getValue() {
            return null;
        }
        
        public final boolean getCanShowMarkets() {
            return false;
        }
        
        public TradingVolume(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.views.ListPosition position, @org.jetbrains.annotations.Nullable()
        java.lang.String value, boolean canShowMarkets) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/CoinExtraPage$Investors;", "Lio/horizontalsystems/bankwallet/modules/coin/CoinExtraPage;", "position", "Lio/horizontalsystems/views/ListPosition;", "(Lio/horizontalsystems/views/ListPosition;)V", "getPosition", "()Lio/horizontalsystems/views/ListPosition;", "app_debug"})
    public static final class Investors extends io.horizontalsystems.bankwallet.modules.coin.CoinExtraPage {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.views.ListPosition position = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.views.ListPosition getPosition() {
            return null;
        }
        
        public Investors(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.views.ListPosition position) {
            super();
        }
    }
}