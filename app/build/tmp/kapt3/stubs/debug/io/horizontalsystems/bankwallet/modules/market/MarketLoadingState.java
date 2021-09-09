package io.horizontalsystems.bankwallet.modules.market;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016\u0082\u0001\u0002\f\r\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketLoadingState;", "", "()V", "equals", "", "other", "hashCode", "", "toString", "", "Error", "Loading", "Lio/horizontalsystems/bankwallet/modules/market/MarketLoadingState$Loading;", "Lio/horizontalsystems/bankwallet/modules/market/MarketLoadingState$Error;", "app_debug"})
public abstract class MarketLoadingState {
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    private MarketLoadingState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketLoadingState$Loading;", "Lio/horizontalsystems/bankwallet/modules/market/MarketLoadingState;", "()V", "app_debug"})
    public static final class Loading extends io.horizontalsystems.bankwallet.modules.market.MarketLoadingState {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.MarketLoadingState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketLoadingState$Error;", "Lio/horizontalsystems/bankwallet/modules/market/MarketLoadingState;", "message", "", "(I)V", "getMessage", "()I", "app_debug"})
    public static final class Error extends io.horizontalsystems.bankwallet.modules.market.MarketLoadingState {
        private final int message = 0;
        
        public final int getMessage() {
            return 0;
        }
        
        public Error(@androidx.annotation.StringRes()
        int message) {
            super();
        }
    }
}