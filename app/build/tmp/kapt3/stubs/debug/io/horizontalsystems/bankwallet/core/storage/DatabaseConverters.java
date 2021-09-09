package io.horizontalsystems.bankwallet.core.storage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0007J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0012\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020 H\u0007J\u0014\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0010\u0010#\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020$H\u0007J\u0010\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\'H\u0007J\u0010\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020*H\u0007J\u0014\u0010+\u001a\u0004\u0018\u00010\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001aH\u0007J\u0014\u0010/\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u00100\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u00101\u001a\u0004\u0018\u00010\f2\b\u00102\u001a\u0004\u0018\u00010\"H\u0007J\u0014\u00103\u001a\u0004\u0018\u00010$2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0010\u00104\u001a\u00020\'2\u0006\u00105\u001a\u00020\fH\u0007J\u0010\u00106\u001a\u00020*2\u0006\u00105\u001a\u00020\fH\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u00067"}, d2 = {"Lio/horizontalsystems/bankwallet/core/storage/DatabaseConverters;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "decryptSecretList", "Lio/horizontalsystems/bankwallet/core/storage/SecretList;", "value", "", "decryptSecretString", "Lio/horizontalsystems/bankwallet/core/storage/SecretString;", "encryptSecretList", "secretList", "encryptSecretString", "secretString", "fromChangeState", "state", "Lio/horizontalsystems/bankwallet/entities/PriceAlert$ChangeState;", "fromCoinType", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "fromDate", "", "date", "Ljava/util/Date;", "fromJobType", "Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$JobType;", "fromStateType", "Lio/horizontalsystems/bankwallet/entities/SubscriptionJob$StateType;", "fromString", "Ljava/math/BigDecimal;", "fromTrendState", "Lio/horizontalsystems/bankwallet/entities/PriceAlert$TrendState;", "fromWCPeerMeta", "peerMeta", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "fromWCSession", "session", "Lcom/trustwallet/walletconnect/models/session/WCSession;", "toChangeState", "toCoinType", "toDate", "timestamp", "toJobType", "toStateType", "toString", "bigDecimal", "toTrendState", "toWCPeerMeta", "json", "toWCSession", "app_debug"})
public final class DatabaseConverters {
    private final kotlin.Lazy gson$delegate = null;
    
    private final com.google.gson.Gson getGson() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.math.BigDecimal fromString(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String toString(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal bigDecimal) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final io.horizontalsystems.bankwallet.core.storage.SecretString decryptSecretString(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String encryptSecretString(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.core.storage.SecretString secretString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final io.horizontalsystems.bankwallet.core.storage.SecretList decryptSecretList(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String encryptSecretList(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.core.storage.SecretList secretList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromCoinType(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final io.horizontalsystems.coinkit2.models.CoinType toCoinType(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromChangeState(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState state) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState toChangeState(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromTrendState(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState state) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState toTrendState(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromStateType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.SubscriptionJob.StateType state) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final io.horizontalsystems.bankwallet.entities.SubscriptionJob.StateType toStateType(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromJobType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.SubscriptionJob.JobType state) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final io.horizontalsystems.bankwallet.entities.SubscriptionJob.JobType toJobType(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromWCPeerMeta(@org.jetbrains.annotations.NotNull()
    com.trustwallet.walletconnect.models.WCPeerMeta peerMeta) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final com.trustwallet.walletconnect.models.WCPeerMeta toWCPeerMeta(@org.jetbrains.annotations.NotNull()
    java.lang.String json) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromWCSession(@org.jetbrains.annotations.NotNull()
    com.trustwallet.walletconnect.models.session.WCSession session) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final com.trustwallet.walletconnect.models.session.WCSession toWCSession(@org.jetbrains.annotations.NotNull()
    java.lang.String json) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    public final long fromDate(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.util.Date toDate(long timestamp) {
        return null;
    }
    
    public DatabaseConverters() {
        super();
    }
}