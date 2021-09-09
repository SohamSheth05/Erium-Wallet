package io.horizontalsystems.bankwallet.core.fiat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010*\u001a\u0004\u0018\u00010\u00172\b\u0010+\u001a\u0004\u0018\u00010\fJ\u0012\u0010,\u001a\u0004\u0018\u00010\u00172\b\u0010+\u001a\u0004\u0018\u00010\fJ\u0012\u0010-\u001a\u0004\u0018\u00010\u00172\b\u0010+\u001a\u0004\u0018\u00010\fJ\n\u0010.\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010/\u001a\u0002002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u00101\u001a\u000200H\u0002J\u0010\u00102\u001a\u0002002\u0006\u00103\u001a\u000204H\u0002J\u0012\u00105\u001a\u0002002\b\u00106\u001a\u0004\u0018\u000107H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R(\u0010\u001a\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0017 \u001c*\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u00160\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!@RX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\b\u0012\u0004\u0012\u00020!0\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u0019R\u001c\u0010)\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010!0!0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lio/horizontalsystems/bankwallet/core/fiat/FiatService;", "Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService$IToggleAvailableListener;", "switchService", "Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService;", "currencyManager", "Lio/horizontalsystems/core/ICurrencyManager;", "rateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "(Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService;Lio/horizontalsystems/core/ICurrencyManager;Lio/horizontalsystems/bankwallet/core/IRateManager;)V", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "coinAmount", "Ljava/math/BigDecimal;", "currency", "Lio/horizontalsystems/core/entities/Currency;", "getCurrency", "()Lio/horizontalsystems/core/entities/Currency;", "currencyAmount", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "fullAmountInfoObservable", "Lio/reactivex/Observable;", "Ljava/util/Optional;", "Lio/horizontalsystems/bankwallet/core/fiat/FiatService$FullAmountInfo;", "getFullAmountInfoObservable", "()Lio/reactivex/Observable;", "fullAmountInfoSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "latestRateDisposable", "Lio/reactivex/disposables/Disposable;", "rate", "value", "", "toggleAvailable", "getToggleAvailable", "()Z", "setToggleAvailable", "(Z)V", "toggleAvailableObservable", "getToggleAvailableObservable", "toggleAvailableSubject", "buildAmountInfo", "amount", "buildForCoin", "buildForCurrency", "fullAmountInfo", "set", "", "subscribeToLatestRate", "syncAmountType", "amountType", "Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService$AmountType;", "syncLatestRate", "latestRate", "Lio/horizontalsystems/xrateskit2/entities/LatestRate;", "FullAmountInfo", "app_debug"})
public final class FiatService implements io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.IToggleAvailableListener {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private io.reactivex.disposables.Disposable latestRateDisposable;
    private io.horizontalsystems.coinkit2.models.Coin coin;
    private java.math.BigDecimal coinAmount;
    private java.math.BigDecimal currencyAmount;
    private final io.reactivex.subjects.PublishSubject<java.lang.Boolean> toggleAvailableSubject = null;
    private boolean toggleAvailable = false;
    private java.math.BigDecimal rate;
    private final io.reactivex.subjects.PublishSubject<java.util.Optional<io.horizontalsystems.bankwallet.core.fiat.FiatService.FullAmountInfo>> fullAmountInfoSubject = null;
    private final io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService switchService = null;
    private final io.horizontalsystems.core.ICurrencyManager currencyManager = null;
    private final io.horizontalsystems.bankwallet.core.IRateManager rateManager = null;
    
    @java.lang.Override()
    public boolean getToggleAvailable() {
        return false;
    }
    
    private void setToggleAvailable(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.lang.Boolean> getToggleAvailableObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.entities.Currency getCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.Optional<io.horizontalsystems.bankwallet.core.fiat.FiatService.FullAmountInfo>> getFullAmountInfoObservable() {
        return null;
    }
    
    private final void subscribeToLatestRate() {
    }
    
    private final void syncLatestRate(io.horizontalsystems.xrateskit2.entities.LatestRate latestRate) {
    }
    
    private final io.horizontalsystems.bankwallet.core.fiat.FiatService.FullAmountInfo fullAmountInfo() {
        return null;
    }
    
    private final void syncAmountType(io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.AmountType amountType) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.core.fiat.FiatService.FullAmountInfo buildForCoin(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal amount) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.core.fiat.FiatService.FullAmountInfo buildForCurrency(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal amount) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.core.fiat.FiatService.FullAmountInfo buildAmountInfo(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal amount) {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public FiatService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService switchService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager rateManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u00a8\u0006\u001f"}, d2 = {"Lio/horizontalsystems/bankwallet/core/fiat/FiatService$FullAmountInfo;", "", "primaryInfo", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "secondaryInfo", "coinValue", "Lio/horizontalsystems/bankwallet/entities/CoinValue;", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;Lio/horizontalsystems/bankwallet/entities/CoinValue;)V", "getCoinValue", "()Lio/horizontalsystems/bankwallet/entities/CoinValue;", "primaryDecimal", "", "getPrimaryDecimal", "()I", "getPrimaryInfo", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "primaryValue", "Ljava/math/BigDecimal;", "getPrimaryValue", "()Ljava/math/BigDecimal;", "getSecondaryInfo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
    public static final class FullAmountInfo {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primaryInfo = null;
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryInfo = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.entities.CoinValue coinValue = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal getPrimaryValue() {
            return null;
        }
        
        public final int getPrimaryDecimal() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getPrimaryInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getSecondaryInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.CoinValue getCoinValue() {
            return null;
        }
        
        public FullAmountInfo(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primaryInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryInfo, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.CoinValue coinValue) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.CoinValue component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.fiat.FiatService.FullAmountInfo copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo primaryInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryInfo, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.CoinValue coinValue) {
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