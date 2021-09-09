package io.horizontalsystems.bankwallet.core.fiat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001%B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u001d\u001a\u00020\u001e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\nJ\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0002J\u0016\u0010!\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120#H\u0002J\u0006\u0010$\u001a\u00020\u001eR$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00030\u00030\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0012@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00120\u00120\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchServiceSendEvm;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "amountType", "Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchServiceSendEvm$AmountType;", "(Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchServiceSendEvm$AmountType;)V", "value", "getAmountType", "()Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchServiceSendEvm$AmountType;", "setAmountType", "amountTypeObservable", "Lio/reactivex/Flowable;", "getAmountTypeObservable", "()Lio/reactivex/Flowable;", "amountTypeSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "disposable", "Lio/reactivex/disposables/Disposable;", "", "toggleAvailable", "getToggleAvailable", "()Z", "setToggleAvailable", "(Z)V", "toggleAvailableObservable", "getToggleAvailableObservable", "toggleAvailableObservables", "", "toggleAvailableSubject", "add", "", "clear", "subscribeToObservables", "syncToggleAvailable", "list", "", "toggle", "AmountType", "app_debug"})
public final class AmountTypeSwitchServiceSendEvm implements io.horizontalsystems.bankwallet.core.Clearable {
    private io.reactivex.disposables.Disposable disposable;
    private final java.util.List<io.reactivex.Flowable<java.lang.Boolean>> toggleAvailableObservables = null;
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchServiceSendEvm.AmountType> amountTypeSubject = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchServiceSendEvm.AmountType amountType;
    private final io.reactivex.subjects.PublishSubject<java.lang.Boolean> toggleAvailableSubject = null;
    private boolean toggleAvailable = false;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchServiceSendEvm.AmountType getAmountType() {
        return null;
    }
    
    private final void setAmountType(io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchServiceSendEvm.AmountType value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchServiceSendEvm.AmountType> getAmountTypeObservable() {
        return null;
    }
    
    public final boolean getToggleAvailable() {
        return false;
    }
    
    private final void setToggleAvailable(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.lang.Boolean> getToggleAvailableObservable() {
        return null;
    }
    
    private final void subscribeToObservables() {
    }
    
    private final void syncToggleAvailable(java.util.List<java.lang.Boolean> list) {
    }
    
    public final void toggle() {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    io.reactivex.Flowable<java.lang.Boolean> toggleAvailableObservable) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public AmountTypeSwitchServiceSendEvm(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchServiceSendEvm.AmountType amountType) {
        super();
    }
    
    public AmountTypeSwitchServiceSendEvm() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0000j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchServiceSendEvm$AmountType;", "", "(Ljava/lang/String;I)V", "toggle", "Coin", "Currency", "app_debug"})
    public static enum AmountType {
        /*public static final*/ Coin /* = new Coin() */,
        /*public static final*/ Currency /* = new Currency() */;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchServiceSendEvm.AmountType toggle() {
            return null;
        }
        
        AmountType() {
        }
    }
}