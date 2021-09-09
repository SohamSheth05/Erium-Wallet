package io.horizontalsystems.bankwallet.entities;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bankwallet/entities/CoinSettings;", "Landroid/os/Parcelable;", "id", "", "(Ljava/lang/String;)V", "settings", "", "Lio/horizontalsystems/bankwallet/entities/CoinSettingType;", "(Ljava/util/Map;)V", "bitcoinCashCoinType", "Lio/horizontalsystems/bankwallet/entities/BitcoinCashCoinType;", "getBitcoinCashCoinType", "()Lio/horizontalsystems/bankwallet/entities/BitcoinCashCoinType;", "derivation", "Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;", "getDerivation", "()Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;", "getId", "()Ljava/lang/String;", "getSettings", "()Ljava/util/Map;", "describeContents", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_debug"})
public final class CoinSettings implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<io.horizontalsystems.bankwallet.entities.CoinSettingType, java.lang.String> settings = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.entities.CoinSettings.Companion Companion = null;
    public static final android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.entities.CoinSettings> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.entities.AccountType.Derivation getDerivation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType getBitcoinCashCoinType() {
        return null;
    }
    
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
    public final java.util.Map<io.horizontalsystems.bankwallet.entities.CoinSettingType, java.lang.String> getSettings() {
        return null;
    }
    
    public CoinSettings(@org.jetbrains.annotations.NotNull()
    java.util.Map<io.horizontalsystems.bankwallet.entities.CoinSettingType, java.lang.String> settings) {
        super();
    }
    
    public CoinSettings() {
        super();
    }
    
    public CoinSettings(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        super();
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.entities.CoinSettings> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final io.horizontalsystems.bankwallet.entities.CoinSettings[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final io.horizontalsystems.bankwallet.entities.CoinSettings createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/CoinSettings$Companion;", "", "()V", "fromId", "", "Lio/horizontalsystems/bankwallet/entities/CoinSettingType;", "", "id", "app_debug"})
    public static final class Companion {
        
        private final java.util.Map<io.horizontalsystems.bankwallet.entities.CoinSettingType, java.lang.String> fromId(java.lang.String id) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}