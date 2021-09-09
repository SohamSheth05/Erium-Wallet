package io.horizontalsystems.bankwallet.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0003\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/FeeRateState;", "", "()V", "isError", "", "()Z", "isLoading", "isValid", "Error", "Loading", "Value", "Lio/horizontalsystems/bankwallet/entities/FeeRateState$Loading;", "Lio/horizontalsystems/bankwallet/entities/FeeRateState$Value;", "Lio/horizontalsystems/bankwallet/entities/FeeRateState$Error;", "app_debug"})
public abstract class FeeRateState {
    
    public final boolean isLoading() {
        return false;
    }
    
    public final boolean isValid() {
        return false;
    }
    
    public final boolean isError() {
        return false;
    }
    
    private FeeRateState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/FeeRateState$Loading;", "Lio/horizontalsystems/bankwallet/entities/FeeRateState;", "()V", "app_debug"})
    public static final class Loading extends io.horizontalsystems.bankwallet.entities.FeeRateState {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.entities.FeeRateState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/FeeRateState$Value;", "Lio/horizontalsystems/bankwallet/entities/FeeRateState;", "value", "", "(J)V", "getValue", "()J", "app_debug"})
    public static final class Value extends io.horizontalsystems.bankwallet.entities.FeeRateState {
        private final long value = 0L;
        
        public final long getValue() {
            return 0L;
        }
        
        public Value(long value) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0005R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/FeeRateState$Error;", "Lio/horizontalsystems/bankwallet/entities/FeeRateState;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getError", "()Ljava/lang/Exception;", "app_debug"})
    public static final class Error extends io.horizontalsystems.bankwallet.entities.FeeRateState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Exception error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Exception getError() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.Exception error) {
            super();
        }
    }
}