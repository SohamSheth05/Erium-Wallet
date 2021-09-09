package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "", "()V", "Custom", "HIGH", "LOW", "RECOMMENDED", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority$LOW;", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority$RECOMMENDED;", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority$HIGH;", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority$Custom;", "app_debug"})
public abstract class FeeRatePriority {
    
    private FeeRatePriority() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/core/FeeRatePriority$LOW;", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "()V", "app_debug"})
    public static final class LOW extends io.horizontalsystems.bankwallet.core.FeeRatePriority {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.core.FeeRatePriority.LOW INSTANCE = null;
        
        private LOW() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/core/FeeRatePriority$RECOMMENDED;", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "()V", "app_debug"})
    public static final class RECOMMENDED extends io.horizontalsystems.bankwallet.core.FeeRatePriority {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.core.FeeRatePriority.RECOMMENDED INSTANCE = null;
        
        private RECOMMENDED() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/core/FeeRatePriority$HIGH;", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "()V", "app_debug"})
    public static final class HIGH extends io.horizontalsystems.bankwallet.core.FeeRatePriority {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.core.FeeRatePriority.HIGH INSTANCE = null;
        
        private HIGH() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/core/FeeRatePriority$Custom;", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "value", "", "range", "Lkotlin/ranges/IntRange;", "(ILkotlin/ranges/IntRange;)V", "getRange", "()Lkotlin/ranges/IntRange;", "getValue", "()I", "app_debug"})
    public static final class Custom extends io.horizontalsystems.bankwallet.core.FeeRatePriority {
        private final int value = 0;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.ranges.IntRange range = null;
        
        public final int getValue() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.ranges.IntRange getRange() {
            return null;
        }
        
        public Custom(int value, @org.jetbrains.annotations.NotNull()
        kotlin.ranges.IntRange range) {
            super();
        }
    }
}