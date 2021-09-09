package io.horizontalsystems.bankwallet.modules.metricchart;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\t\u0010\n\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007j\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/metricchart/MetricsType;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "description", "", "getDescription", "()I", "title", "getTitle", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "BtcDominance", "Volume24h", "DefiCap", "TvlInDefi", "app_debug"})
public enum MetricsType implements android.os.Parcelable {
    /*public static final*/ BtcDominance /* = new BtcDominance() */,
    /*public static final*/ Volume24h /* = new Volume24h() */,
    /*public static final*/ DefiCap /* = new DefiCap() */,
    /*public static final*/ TvlInDefi /* = new TvlInDefi() */;
    public static final android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.metricchart.MetricsType> CREATOR = null;
    
    public final int getTitle() {
        return 0;
    }
    
    public final int getDescription() {
        return 0;
    }
    
    MetricsType() {
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
    public static final class Creator implements android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.metricchart.MetricsType> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final io.horizontalsystems.bankwallet.modules.metricchart.MetricsType[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final io.horizontalsystems.bankwallet.modules.metricchart.MetricsType createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}