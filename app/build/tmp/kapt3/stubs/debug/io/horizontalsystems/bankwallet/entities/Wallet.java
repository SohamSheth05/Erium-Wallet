package io.horizontalsystems.bankwallet.entities;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/Wallet;", "Landroid/os/Parcelable;", "Lio/horizontalsystems/bankwallet/modules/transactions/FilterAdapter$FilterItem;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "(Lio/horizontalsystems/coinkit2/models/Coin;Lio/horizontalsystems/bankwallet/entities/Account;)V", "configuredCoin", "Lio/horizontalsystems/bankwallet/entities/ConfiguredCoin;", "(Lio/horizontalsystems/bankwallet/entities/ConfiguredCoin;Lio/horizontalsystems/bankwallet/entities/Account;)V", "getAccount", "()Lio/horizontalsystems/bankwallet/entities/Account;", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "getConfiguredCoin", "()Lio/horizontalsystems/bankwallet/entities/ConfiguredCoin;", "describeContents", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class Wallet extends io.horizontalsystems.bankwallet.modules.transactions.FilterAdapter.FilterItem implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.entities.ConfiguredCoin configuredCoin = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.entities.Account account = null;
    public static final android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.entities.Wallet> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.coinkit2.models.Coin getCoin() {
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
    public final io.horizontalsystems.bankwallet.entities.ConfiguredCoin getConfiguredCoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.Account getAccount() {
        return null;
    }
    
    public Wallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.ConfiguredCoin configuredCoin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account) {
        super(null);
    }
    
    public Wallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account) {
        super(null);
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
    public static final class Creator implements android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.entities.Wallet> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final io.horizontalsystems.bankwallet.entities.Wallet[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final io.horizontalsystems.bankwallet.entities.Wallet createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}