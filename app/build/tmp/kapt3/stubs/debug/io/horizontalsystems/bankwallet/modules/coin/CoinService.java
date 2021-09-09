package io.horizontalsystems.bankwallet.modules.coin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001ZBE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\b\u0010O\u001a\u00020\u0015H\u0016J\u0006\u0010P\u001a\u00020\u0015J\"\u0010Q\u001a\u00020\u00152\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00110S2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020U0SJ\u0006\u0010V\u001a\u00020@J\b\u0010W\u001a\u00020\u0015H\u0002J\u0006\u0010X\u001a\u00020\u0015J\u0006\u0010Y\u001a\u00020\u0015R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R$\u0010\'\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020&8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0017R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u000e\u00109\u001a\u00020:X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010;\u001a\u0004\u0018\u00010\u00118F\u00a2\u0006\u0006\u001a\u0004\b<\u0010=R\u000e\u0010\u0010\u001a\u00020>X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010?\u001a\u00020@8F\u00a2\u0006\u0006\u001a\u0004\bA\u0010BR(\u0010D\u001a\u0004\u0018\u00010C2\b\u0010\u0018\u001a\u0004\u0018\u00010C@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001f\u0010I\u001a\u0010\u0012\f\u0012\n K*\u0004\u0018\u00010J0J0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010\u0017R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010M\u001a\u00020@8F\u00a2\u0006\u0006\u001a\u0004\bN\u0010BR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006["}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/CoinService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "currency", "Lio/horizontalsystems/core/entities/Currency;", "xRateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "chartTypeStorage", "Lio/horizontalsystems/bankwallet/core/IChartTypeStorage;", "priceAlertManager", "Lio/horizontalsystems/bankwallet/core/IPriceAlertManager;", "notificationManager", "Lio/horizontalsystems/bankwallet/core/INotificationManager;", "marketFavoritesManager", "Lio/horizontalsystems/bankwallet/core/managers/MarketFavoritesManager;", "guidesBaseUrl", "", "(Lio/horizontalsystems/coinkit2/models/CoinType;Lio/horizontalsystems/core/entities/Currency;Lio/horizontalsystems/bankwallet/core/IRateManager;Lio/horizontalsystems/bankwallet/core/IChartTypeStorage;Lio/horizontalsystems/bankwallet/core/IPriceAlertManager;Lio/horizontalsystems/bankwallet/core/INotificationManager;Lio/horizontalsystems/bankwallet/core/managers/MarketFavoritesManager;Ljava/lang/String;)V", "alertNotificationUpdatedObservable", "Lio/reactivex/subjects/BehaviorSubject;", "", "getAlertNotificationUpdatedObservable", "()Lio/reactivex/subjects/BehaviorSubject;", "value", "Lio/horizontalsystems/xrateskit2/entities/ChartInfo;", "chartInfo", "getChartInfo", "()Lio/horizontalsystems/xrateskit2/entities/ChartInfo;", "setChartInfo", "(Lio/horizontalsystems/xrateskit2/entities/ChartInfo;)V", "chartInfoDisposable", "Lio/reactivex/disposables/Disposable;", "chartInfoErrorObservable", "", "getChartInfoErrorObservable", "chartInfoUpdatedObservable", "getChartInfoUpdatedObservable", "Lio/horizontalsystems/xrateskit2/entities/ChartType;", "chartType", "getChartType", "()Lio/horizontalsystems/xrateskit2/entities/ChartType;", "setChartType", "(Lio/horizontalsystems/xrateskit2/entities/ChartType;)V", "coinDetailsStateObservable", "Lio/horizontalsystems/bankwallet/modules/coin/CoinService$CoinDetailsState;", "getCoinDetailsStateObservable", "coinMarketDetails", "Lio/horizontalsystems/xrateskit2/entities/CoinMarketDetails;", "getCoinMarketDetails", "()Lio/horizontalsystems/xrateskit2/entities/CoinMarketDetails;", "setCoinMarketDetails", "(Lio/horizontalsystems/xrateskit2/entities/CoinMarketDetails;)V", "getCoinType", "()Lio/horizontalsystems/coinkit2/models/CoinType;", "getCurrency", "()Lio/horizontalsystems/core/entities/Currency;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "guideUrl", "getGuideUrl", "()Ljava/lang/String;", "Ljava/net/URL;", "hasPriceAlert", "", "getHasPriceAlert", "()Z", "Lio/horizontalsystems/bankwallet/modules/coin/LastPoint;", "lastPoint", "getLastPoint", "()Lio/horizontalsystems/bankwallet/modules/coin/LastPoint;", "setLastPoint", "(Lio/horizontalsystems/bankwallet/modules/coin/LastPoint;)V", "latestRateAsync", "Lio/horizontalsystems/xrateskit2/entities/LatestRate;", "kotlin.jvm.PlatformType", "getLatestRateAsync", "notificationsAreEnabled", "getNotificationsAreEnabled", "clear", "favorite", "getCoinDetails", "rateDiffCoinCodes", "", "rateDiffPeriods", "Lio/horizontalsystems/xrateskit2/entities/TimePeriod;", "isCoinFavorite", "triggerChartUpdateIfEnoughData", "unfavorite", "updateChartInfo", "CoinDetailsState", "app_debug"})
public final class CoinService implements io.horizontalsystems.bankwallet.core.Clearable {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.xrateskit2.entities.LatestRate> latestRateAsync = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<kotlin.Unit> chartInfoUpdatedObservable = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<java.lang.Throwable> chartInfoErrorObservable = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.modules.coin.CoinService.CoinDetailsState> coinDetailsStateObservable = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<kotlin.Unit> alertNotificationUpdatedObservable = null;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.xrateskit2.entities.CoinMarketDetails coinMarketDetails;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.coin.LastPoint lastPoint;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.xrateskit2.entities.ChartInfo chartInfo;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private io.reactivex.disposables.Disposable chartInfoDisposable;
    private final java.net.URL guidesBaseUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.coinkit2.models.CoinType coinType = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.entities.Currency currency = null;
    private final io.horizontalsystems.bankwallet.core.IRateManager xRateManager = null;
    private final io.horizontalsystems.bankwallet.core.IChartTypeStorage chartTypeStorage = null;
    private final io.horizontalsystems.bankwallet.core.IPriceAlertManager priceAlertManager = null;
    private final io.horizontalsystems.bankwallet.core.INotificationManager notificationManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.MarketFavoritesManager marketFavoritesManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.xrateskit2.entities.LatestRate> getLatestRateAsync() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<kotlin.Unit> getChartInfoUpdatedObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<java.lang.Throwable> getChartInfoErrorObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.modules.coin.CoinService.CoinDetailsState> getCoinDetailsStateObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<kotlin.Unit> getAlertNotificationUpdatedObservable() {
        return null;
    }
    
    public final boolean getHasPriceAlert() {
        return false;
    }
    
    public final boolean getNotificationsAreEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.xrateskit2.entities.CoinMarketDetails getCoinMarketDetails() {
        return null;
    }
    
    public final void setCoinMarketDetails(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.xrateskit2.entities.CoinMarketDetails p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.coin.LastPoint getLastPoint() {
        return null;
    }
    
    public final void setLastPoint(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.coin.LastPoint value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.xrateskit2.entities.ChartInfo getChartInfo() {
        return null;
    }
    
    public final void setChartInfo(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.xrateskit2.entities.ChartInfo value) {
    }
    
    private final void triggerChartUpdateIfEnoughData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.xrateskit2.entities.ChartType getChartType() {
        return null;
    }
    
    public final void setChartType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.ChartType value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGuideUrl() {
        return null;
    }
    
    public final void getCoinDetails(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> rateDiffCoinCodes, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.xrateskit2.entities.TimePeriod> rateDiffPeriods) {
    }
    
    public final void updateChartInfo() {
    }
    
    public final boolean isCoinFavorite() {
        return false;
    }
    
    public final void favorite() {
    }
    
    public final void unfavorite() {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.coinkit2.models.CoinType getCoinType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.entities.Currency getCurrency() {
        return null;
    }
    
    public CoinService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager xRateManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IChartTypeStorage chartTypeStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IPriceAlertManager priceAlertManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.INotificationManager notificationManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.MarketFavoritesManager marketFavoritesManager, @org.jetbrains.annotations.NotNull()
    java.lang.String guidesBaseUrl) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/CoinService$CoinDetailsState;", "", "()V", "Error", "Loaded", "Loading", "Lio/horizontalsystems/bankwallet/modules/coin/CoinService$CoinDetailsState$Loading;", "Lio/horizontalsystems/bankwallet/modules/coin/CoinService$CoinDetailsState$Loaded;", "Lio/horizontalsystems/bankwallet/modules/coin/CoinService$CoinDetailsState$Error;", "app_debug"})
    public static abstract class CoinDetailsState {
        
        private CoinDetailsState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/CoinService$CoinDetailsState$Loading;", "Lio/horizontalsystems/bankwallet/modules/coin/CoinService$CoinDetailsState;", "()V", "app_debug"})
        public static final class Loading extends io.horizontalsystems.bankwallet.modules.coin.CoinService.CoinDetailsState {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.coin.CoinService.CoinDetailsState.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/CoinService$CoinDetailsState$Loaded;", "Lio/horizontalsystems/bankwallet/modules/coin/CoinService$CoinDetailsState;", "()V", "app_debug"})
        public static final class Loaded extends io.horizontalsystems.bankwallet.modules.coin.CoinService.CoinDetailsState {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.coin.CoinService.CoinDetailsState.Loaded INSTANCE = null;
            
            private Loaded() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/CoinService$CoinDetailsState$Error;", "Lio/horizontalsystems/bankwallet/modules/coin/CoinService$CoinDetailsState;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Error extends io.horizontalsystems.bankwallet.modules.coin.CoinService.CoinDetailsState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable error = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getError() {
                return null;
            }
            
            public Error(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.modules.coin.CoinService.CoinDetailsState.Error copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error) {
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
    }
}