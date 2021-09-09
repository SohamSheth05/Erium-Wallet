package io.horizontalsystems.bankwallet.modules.market;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/Score;", "", "()V", "Rank", "Rating", "Lio/horizontalsystems/bankwallet/modules/market/Score$Rank;", "Lio/horizontalsystems/bankwallet/modules/market/Score$Rating;", "app_debug"})
public abstract class Score {
    
    private Score() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/Score$Rank;", "Lio/horizontalsystems/bankwallet/modules/market/Score;", "rank", "", "(I)V", "getRank", "()I", "app_debug"})
    public static final class Rank extends io.horizontalsystems.bankwallet.modules.market.Score {
        private final int rank = 0;
        
        public final int getRank() {
            return 0;
        }
        
        public Rank(int rank) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/Score$Rating;", "Lio/horizontalsystems/bankwallet/modules/market/Score;", "rating", "", "(Ljava/lang/String;)V", "getRating", "()Ljava/lang/String;", "app_debug"})
    public static final class Rating extends io.horizontalsystems.bankwallet.modules.market.Score {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String rating = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRating() {
            return null;
        }
        
        public Rating(@org.jetbrains.annotations.NotNull()
        java.lang.String rating) {
            super();
        }
    }
}