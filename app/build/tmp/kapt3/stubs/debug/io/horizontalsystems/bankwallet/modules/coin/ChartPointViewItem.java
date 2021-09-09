package io.horizontalsystems.bankwallet.modules.coin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u00c6\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/ChartPointViewItem;", "", "date", "", "price", "Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "volume", "macdInfo", "Lio/horizontalsystems/chartview/models/MacdInfo;", "(JLio/horizontalsystems/bankwallet/entities/CurrencyValue;Lio/horizontalsystems/bankwallet/entities/CurrencyValue;Lio/horizontalsystems/chartview/models/MacdInfo;)V", "getDate", "()J", "getMacdInfo", "()Lio/horizontalsystems/chartview/models/MacdInfo;", "getPrice", "()Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "getVolume", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class ChartPointViewItem {
    private final long date = 0L;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.entities.CurrencyValue price = null;
    @org.jetbrains.annotations.Nullable()
    private final io.horizontalsystems.bankwallet.entities.CurrencyValue volume = null;
    @org.jetbrains.annotations.Nullable()
    private final io.horizontalsystems.chartview.models.MacdInfo macdInfo = null;
    
    public final long getDate() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue getVolume() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.chartview.models.MacdInfo getMacdInfo() {
        return null;
    }
    
    public ChartPointViewItem(long date, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CurrencyValue price, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.CurrencyValue volume, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.chartview.models.MacdInfo macdInfo) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.entities.CurrencyValue component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.chartview.models.MacdInfo component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.coin.ChartPointViewItem copy(long date, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CurrencyValue price, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.CurrencyValue volume, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.chartview.models.MacdInfo macdInfo) {
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
}