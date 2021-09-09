package io.horizontalsystems.bankwallet.core.fiat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002()B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020&H\u0002J\u0006\u0010\'\u001a\u00020&R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00040\u00040\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001c@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010\rR\u001c\u0010$\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u001c0\u001c0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService;", "", "()V", "value", "Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService$AmountType;", "amountType", "getAmountType", "()Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService$AmountType;", "setAmountType", "(Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService$AmountType;)V", "amountTypeObservable", "Lio/reactivex/Observable;", "getAmountTypeObservable", "()Lio/reactivex/Observable;", "amountTypeSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService$IToggleAvailableListener;", "fromListener", "getFromListener", "()Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService$IToggleAvailableListener;", "setFromListener", "(Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService$IToggleAvailableListener;)V", "toListener", "getToListener", "setToListener", "", "toggleAvailable", "getToggleAvailable", "()Z", "setToggleAvailable", "(Z)V", "toggleAvailableObservable", "getToggleAvailableObservable", "toggleAvailableSubject", "syncToggleAvailable", "", "toggle", "AmountType", "IToggleAvailableListener", "app_debug"})
public final class AmountTypeSwitchService {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.AmountType> amountTypeSubject = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.AmountType amountType = io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.AmountType.Coin;
    private final io.reactivex.subjects.PublishSubject<java.lang.Boolean> toggleAvailableSubject = null;
    private boolean toggleAvailable = false;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.IToggleAvailableListener fromListener;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.IToggleAvailableListener toListener;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.AmountType getAmountType() {
        return null;
    }
    
    private final void setAmountType(io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.AmountType value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.AmountType> getAmountTypeObservable() {
        return null;
    }
    
    public final boolean getToggleAvailable() {
        return false;
    }
    
    private final void setToggleAvailable(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Boolean> getToggleAvailableObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.IToggleAvailableListener getFromListener() {
        return null;
    }
    
    public final void setFromListener(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.IToggleAvailableListener value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.IToggleAvailableListener getToListener() {
        return null;
    }
    
    public final void setToListener(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService.IToggleAvailableListener value) {
    }
    
    private final void syncToggleAvailable() {
    }
    
    public final void toggle() {
    }
    
    public AmountTypeSwitchService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService$IToggleAvailableListener;", "", "toggleAvailable", "", "getToggleAvailable", "()Z", "toggleAvailableObservable", "Lio/reactivex/Observable;", "getToggleAvailableObservable", "()Lio/reactivex/Observable;", "app_debug"})
    public static abstract interface IToggleAvailableListener {
        
        public abstract boolean getToggleAvailable();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Observable<java.lang.Boolean> getToggleAvailableObservable();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService$AmountType;", "", "(Ljava/lang/String;I)V", "Coin", "Currency", "app_debug"})
    public static enum AmountType {
        /*public static final*/ Coin /* = new Coin() */,
        /*public static final*/ Currency /* = new Currency() */;
        
        AmountType() {
        }
    }
}