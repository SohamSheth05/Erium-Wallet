package io.horizontalsystems.bankwallet.entities;

import java.lang.System;

@androidx.room.Entity(primaryKeys = {"coinType", "stateType"})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/SubscriptionJob;", "", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "body", "", "stateType", "Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$StateType;", "jobType", "Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$JobType;", "(Lio/horizontalsystems/coinkit2/models/CoinType;Ljava/lang/String;Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$StateType;Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$JobType;)V", "getBody", "()Ljava/lang/String;", "getCoinType", "()Lio/horizontalsystems/coinkit2/models/CoinType;", "getJobType", "()Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$JobType;", "getStateType", "()Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$StateType;", "JobType", "StateType", "app_debug"})
public final class SubscriptionJob {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.coinkit2.models.CoinType coinType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String body = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.entities.SubscriptionJob.StateType stateType = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.entities.SubscriptionJob.JobType jobType = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.coinkit2.models.CoinType getCoinType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBody() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.SubscriptionJob.StateType getStateType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.SubscriptionJob.JobType getJobType() {
        return null;
    }
    
    public SubscriptionJob(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.SubscriptionJob.StateType stateType, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.SubscriptionJob.JobType jobType) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$StateType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Change", "Trend", "Companion", "app_debug"})
    public static enum StateType {
        /*public static final*/ Change /* = new Change(null) */,
        /*public static final*/ Trend /* = new Trend(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.entities.SubscriptionJob.StateType.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        StateType(java.lang.String value) {
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$StateType$Companion;", "", "()V", "valueOf", "Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$StateType;", "value", "", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.Nullable()
            public final io.horizontalsystems.bankwallet.entities.SubscriptionJob.StateType valueOf(@org.jetbrains.annotations.Nullable()
            java.lang.String value) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$JobType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Subscribe", "Unsubscribe", "Companion", "app_debug"})
    public static enum JobType {
        /*public static final*/ Subscribe /* = new Subscribe(null) */,
        /*public static final*/ Unsubscribe /* = new Unsubscribe(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.entities.SubscriptionJob.JobType.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        JobType(java.lang.String value) {
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$JobType$Companion;", "", "()V", "valueOf", "Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$JobType;", "value", "", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.Nullable()
            public final io.horizontalsystems.bankwallet.entities.SubscriptionJob.JobType valueOf(@org.jetbrains.annotations.Nullable()
            java.lang.String value) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}