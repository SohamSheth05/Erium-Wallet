package io.horizontalsystems.bankwallet.modules.sendevm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmModule;", "", "()V", "additionalInfoKey", "", "transactionDataKey", "walletKey", "Factory", "TransactionDataParcelable", "app_debug"})
public final class SendEvmModule {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String walletKey = "walletKey";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String transactionDataKey = "transactionData";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String additionalInfoKey = "additionalInfo";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmModule INSTANCE = null;
    
    private SendEvmModule() {
        super();
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0014\u001a\u00020\nH\u00c6\u0003J\'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006#"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmModule$TransactionDataParcelable;", "Landroid/os/Parcelable;", "transactionData", "Lio/horizontalsystems/ethereumkit/models/TransactionData;", "(Lio/horizontalsystems/ethereumkit/models/TransactionData;)V", "toAddress", "", "value", "Ljava/math/BigInteger;", "input", "", "(Ljava/lang/String;Ljava/math/BigInteger;[B)V", "getInput", "()[B", "getToAddress", "()Ljava/lang/String;", "getValue", "()Ljava/math/BigInteger;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class TransactionDataParcelable implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String toAddress = null;
        @org.jetbrains.annotations.NotNull()
        private final java.math.BigInteger value = null;
        @org.jetbrains.annotations.NotNull()
        private final byte[] input = null;
        public static final android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmModule.TransactionDataParcelable> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getToAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigInteger getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] getInput() {
            return null;
        }
        
        public TransactionDataParcelable(@org.jetbrains.annotations.NotNull()
        java.lang.String toAddress, @org.jetbrains.annotations.NotNull()
        java.math.BigInteger value, @org.jetbrains.annotations.NotNull()
        byte[] input) {
            super();
        }
        
        public TransactionDataParcelable(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.ethereumkit.models.TransactionData transactionData) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigInteger component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmModule.TransactionDataParcelable copy(@org.jetbrains.annotations.NotNull()
        java.lang.String toAddress, @org.jetbrains.annotations.NotNull()
        java.math.BigInteger value, @org.jetbrains.annotations.NotNull()
        byte[] input) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
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
        public static final class Creator implements android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmModule.TransactionDataParcelable> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmModule.TransactionDataParcelable[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmModule.TransactionDataParcelable createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0010\u001a\u0002H\u0011\"\n\b\u0000\u0010\u0011*\u0004\u0018\u00010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0014H\u0016\u00a2\u0006\u0002\u0010\u0015R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "(Lio/horizontalsystems/bankwallet/entities/Wallet;)V", "adapter", "Lio/horizontalsystems/bankwallet/core/ISendEthereumAdapter;", "getAdapter", "()Lio/horizontalsystems/bankwallet/core/ISendEthereumAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "service", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService;", "getService", "()Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService;", "service$delegate", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final kotlin.Lazy adapter$delegate = null;
        private final kotlin.Lazy service$delegate = null;
        private final io.horizontalsystems.bankwallet.entities.Wallet wallet = null;
        
        private final io.horizontalsystems.bankwallet.core.ISendEthereumAdapter getAdapter() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService getService() {
            return null;
        }
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet) {
            super();
        }
    }
}