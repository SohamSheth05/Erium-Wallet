package io.horizontalsystems.bankwallet.core.fiat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001FB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010;\u001a\u00020(H\u0016J\u000e\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020\nJ\u0010\u0010>\u001a\u00020(2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010?\u001a\u00020(2\u0006\u0010=\u001a\u00020\nJ\b\u0010@\u001a\u00020(H\u0002J\b\u0010A\u001a\u00020(H\u0002J\b\u0010B\u001a\u00020(H\u0002J\u0012\u0010C\u001a\u00020(2\b\u0010D\u001a\u0004\u0018\u00010EH\u0002R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\n0\n0\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020!\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u001a8F\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u001cR\u001c\u0010*\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010(0(0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020.@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\"\u00102\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b3\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u00105\u001a\u0004\u0018\u0001042\b\u0010-\u001a\u0004\u0018\u000104@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a8F\u00a2\u0006\u0006\u001a\u0004\b9\u0010\u001cR\u001c\u0010:\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00140\u00140\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006G"}, d2 = {"Lio/horizontalsystems/bankwallet/core/fiat/FiatServiceSendEvm;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "switchService", "Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchServiceSendEvm;", "currencyManager", "Lio/horizontalsystems/core/ICurrencyManager;", "rateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "(Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchServiceSendEvm;Lio/horizontalsystems/core/ICurrencyManager;Lio/horizontalsystems/bankwallet/core/IRateManager;)V", "value", "Ljava/math/BigDecimal;", "_coinAmount", "set_coinAmount", "(Ljava/math/BigDecimal;)V", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "coinAmount", "getCoinAmount", "()Ljava/math/BigDecimal;", "coinAmountLocked", "", "getCoinAmountLocked", "()Z", "setCoinAmountLocked", "(Z)V", "coinAmountObservable", "Lio/reactivex/Flowable;", "getCoinAmountObservable", "()Lio/reactivex/Flowable;", "coinAmountSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "currency", "Lio/horizontalsystems/core/entities/Currency;", "getCurrency", "()Lio/horizontalsystems/core/entities/Currency;", "currencyAmount", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "inputsUpdatedObservable", "", "getInputsUpdatedObservable", "inputsUpdatedSubject", "marketInfoDisposable", "Lio/reactivex/disposables/Disposable;", "<set-?>", "Lio/horizontalsystems/bankwallet/core/fiat/FiatServiceSendEvm$PrimaryInfo;", "primaryInfo", "getPrimaryInfo", "()Lio/horizontalsystems/bankwallet/core/fiat/FiatServiceSendEvm$PrimaryInfo;", "rate", "setRate", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "secondaryAmountInfo", "getSecondaryAmountInfo", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "toggleAvailableObservable", "getToggleAvailableObservable", "toggleAvailableSubject", "clear", "setAmount", "amount", "setCoin", "setCoinAmount", "sync", "syncCoinAmount", "syncCurrencyAmount", "syncLatestRate", "latestRate", "Lio/horizontalsystems/xrateskit2/entities/LatestRate;", "PrimaryInfo", "app_debug"})
public final class FiatServiceSendEvm implements io.horizontalsystems.bankwallet.core.Clearable {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private io.reactivex.disposables.Disposable marketInfoDisposable;
    private io.horizontalsystems.coinkit2.models.Coin coin;
    private io.reactivex.subjects.PublishSubject<java.lang.Boolean> toggleAvailableSubject;
    private java.math.BigDecimal rate;
    private io.reactivex.subjects.PublishSubject<java.math.BigDecimal> coinAmountSubject;
    private java.math.BigDecimal _coinAmount;
    private java.math.BigDecimal currencyAmount;
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> inputsUpdatedSubject = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.core.fiat.FiatServiceSendEvm.PrimaryInfo primaryInfo;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo secondaryAmountInfo;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.entities.Currency currency = null;
    private boolean coinAmountLocked = false;
    private final io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchServiceSendEvm switchService = null;
    private final io.horizontalsystems.core.ICurrencyManager currencyManager = null;
    private final io.horizontalsystems.bankwallet.core.IRateManager rateManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.lang.Boolean> getToggleAvailableObservable() {
        return null;
    }
    
    private final void setRate(java.math.BigDecimal value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.math.BigDecimal> getCoinAmountObservable() {
        return null;
    }
    
    private final void set_coinAmount(java.math.BigDecimal value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getCoinAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<kotlin.Unit> getInputsUpdatedObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.core.fiat.FiatServiceSendEvm.PrimaryInfo getPrimaryInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getSecondaryAmountInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.entities.Currency getCurrency() {
        return null;
    }
    
    public final boolean getCoinAmountLocked() {
        return false;
    }
    
    public final void setCoinAmountLocked(boolean p0) {
    }
    
    private final void syncLatestRate(io.horizontalsystems.xrateskit2.entities.LatestRate latestRate) {
    }
    
    private final void sync() {
    }
    
    private final void syncCoinAmount() {
    }
    
    private final void syncCurrencyAmount() {
    }
    
    public final void setCoin(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public final void setAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount) {
    }
    
    public final void setCoinAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public FiatServiceSendEvm(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchServiceSendEvm switchService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager rateManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/core/fiat/FiatServiceSendEvm$PrimaryInfo;", "", "()V", "Amount", "Info", "Lio/horizontalsystems/bankwallet/core/fiat/FiatServiceSendEvm$PrimaryInfo$Info;", "Lio/horizontalsystems/bankwallet/core/fiat/FiatServiceSendEvm$PrimaryInfo$Amount;", "app_debug"})
    public static abstract class PrimaryInfo {
        
        private PrimaryInfo() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/core/fiat/FiatServiceSendEvm$PrimaryInfo$Info;", "Lio/horizontalsystems/bankwallet/core/fiat/FiatServiceSendEvm$PrimaryInfo;", "amountInfo", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;)V", "getAmountInfo", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$AmountInfo;", "app_debug"})
        public static final class Info extends io.horizontalsystems.bankwallet.core.fiat.FiatServiceSendEvm.PrimaryInfo {
            @org.jetbrains.annotations.Nullable()
            private final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo amountInfo = null;
            
            @org.jetbrains.annotations.Nullable()
            public final io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo getAmountInfo() {
                return null;
            }
            
            public Info(@org.jetbrains.annotations.Nullable()
            io.horizontalsystems.bankwallet.modules.send.SendModule.AmountInfo amountInfo) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/core/fiat/FiatServiceSendEvm$PrimaryInfo$Amount;", "Lio/horizontalsystems/bankwallet/core/fiat/FiatServiceSendEvm$PrimaryInfo;", "amount", "Ljava/math/BigDecimal;", "(Ljava/math/BigDecimal;)V", "getAmount", "()Ljava/math/BigDecimal;", "app_debug"})
        public static final class Amount extends io.horizontalsystems.bankwallet.core.fiat.FiatServiceSendEvm.PrimaryInfo {
            @org.jetbrains.annotations.NotNull()
            private final java.math.BigDecimal amount = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.math.BigDecimal getAmount() {
                return null;
            }
            
            public Amount(@org.jetbrains.annotations.NotNull()
            java.math.BigDecimal amount) {
                super();
            }
        }
    }
}