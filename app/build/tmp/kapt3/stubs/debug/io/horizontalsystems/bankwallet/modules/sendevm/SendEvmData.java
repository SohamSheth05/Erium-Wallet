package io.horizontalsystems.bankwallet.modules.sendevm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData;", "", "transactionData", "Lio/horizontalsystems/ethereumkit/models/TransactionData;", "additionalInfo", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$AdditionalInfo;", "(Lio/horizontalsystems/ethereumkit/models/TransactionData;Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$AdditionalInfo;)V", "getAdditionalInfo", "()Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$AdditionalInfo;", "getTransactionData", "()Lio/horizontalsystems/ethereumkit/models/TransactionData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AdditionalInfo", "SendInfo", "SwapInfo", "app_debug"})
public final class SendEvmData {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.ethereumkit.models.TransactionData transactionData = null;
    @org.jetbrains.annotations.Nullable()
    private final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo additionalInfo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.ethereumkit.models.TransactionData getTransactionData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo getAdditionalInfo() {
        return null;
    }
    
    public SendEvmData(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.models.TransactionData transactionData, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo additionalInfo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.ethereumkit.models.TransactionData component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData copy(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.models.TransactionData transactionData, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo additionalInfo) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$AdditionalInfo;", "Landroid/os/Parcelable;", "()V", "sendInfo", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$SendInfo;", "getSendInfo", "()Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$SendInfo;", "swapInfo", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$SwapInfo;", "getSwapInfo", "()Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$SwapInfo;", "Send", "Swap", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$AdditionalInfo$Send;", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$AdditionalInfo$Swap;", "app_debug"})
    public static abstract class AdditionalInfo implements android.os.Parcelable {
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SendInfo getSendInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SwapInfo getSwapInfo() {
            return null;
        }
        
        private AdditionalInfo() {
            super();
        }
        
        @kotlinx.android.parcel.Parcelize()
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$AdditionalInfo$Send;", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$AdditionalInfo;", "info", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$SendInfo;", "(Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$SendInfo;)V", "getInfo", "()Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$SendInfo;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
        public static final class Send extends io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SendInfo info = null;
            public static final android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo.Send> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SendInfo getInfo() {
                return null;
            }
            
            public Send(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SendInfo info) {
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
            public static final class Creator implements android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo.Send> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo.Send[] newArray(int size) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo.Send createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
            }
        }
        
        @kotlinx.android.parcel.Parcelize()
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$AdditionalInfo$Swap;", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$AdditionalInfo;", "info", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$SwapInfo;", "(Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$SwapInfo;)V", "getInfo", "()Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$SwapInfo;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
        public static final class Swap extends io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SwapInfo info = null;
            public static final android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo.Swap> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SwapInfo getInfo() {
                return null;
            }
            
            public Swap(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SwapInfo info) {
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
            public static final class Creator implements android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo.Swap> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo.Swap[] newArray(int size) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo.Swap createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
            }
        }
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$SendInfo;", "Landroid/os/Parcelable;", "domain", "", "(Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class SendInfo implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String domain = null;
        public static final android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SendInfo> CREATOR = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDomain() {
            return null;
        }
        
        public SendInfo(@org.jetbrains.annotations.Nullable()
        java.lang.String domain) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SendInfo copy(@org.jetbrains.annotations.Nullable()
        java.lang.String domain) {
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
        public static final class Creator implements android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SendInfo> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SendInfo[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SendInfo createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003JY\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\t\u0010#\u001a\u00020\u001eH\u00d6\u0001J\t\u0010$\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eH\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006*"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$SwapInfo;", "Landroid/os/Parcelable;", "estimatedOut", "Ljava/math/BigDecimal;", "estimatedIn", "slippage", "", "deadline", "recipientDomain", "price", "priceImpact", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeadline", "()Ljava/lang/String;", "getEstimatedIn", "()Ljava/math/BigDecimal;", "getEstimatedOut", "getPrice", "getPriceImpact", "getRecipientDomain", "getSlippage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class SwapInfo implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.math.BigDecimal estimatedOut = null;
        @org.jetbrains.annotations.NotNull()
        private final java.math.BigDecimal estimatedIn = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String slippage = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String deadline = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String recipientDomain = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String price = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String priceImpact = null;
        public static final android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SwapInfo> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal getEstimatedOut() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal getEstimatedIn() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSlippage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDeadline() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRecipientDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPriceImpact() {
            return null;
        }
        
        public SwapInfo(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal estimatedOut, @org.jetbrains.annotations.NotNull()
        java.math.BigDecimal estimatedIn, @org.jetbrains.annotations.Nullable()
        java.lang.String slippage, @org.jetbrains.annotations.Nullable()
        java.lang.String deadline, @org.jetbrains.annotations.Nullable()
        java.lang.String recipientDomain, @org.jetbrains.annotations.Nullable()
        java.lang.String price, @org.jetbrains.annotations.Nullable()
        java.lang.String priceImpact) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SwapInfo copy(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal estimatedOut, @org.jetbrains.annotations.NotNull()
        java.math.BigDecimal estimatedIn, @org.jetbrains.annotations.Nullable()
        java.lang.String slippage, @org.jetbrains.annotations.Nullable()
        java.lang.String deadline, @org.jetbrains.annotations.Nullable()
        java.lang.String recipientDomain, @org.jetbrains.annotations.Nullable()
        java.lang.String price, @org.jetbrains.annotations.Nullable()
        java.lang.String priceImpact) {
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
        public static final class Creator implements android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SwapInfo> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SwapInfo[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.SwapInfo createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
}