package io.horizontalsystems.bankwallet.modules.swap.tradeoptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/IRecipientAddressService;", "", "error", "", "getError", "()Ljava/lang/Throwable;", "errorObservable", "Lio/reactivex/Observable;", "", "getErrorObservable", "()Lio/reactivex/Observable;", "initialAddress", "Lio/horizontalsystems/bankwallet/entities/Address;", "getInitialAddress", "()Lio/horizontalsystems/bankwallet/entities/Address;", "set", "address", "amount", "Ljava/math/BigDecimal;", "app_debug"})
public abstract interface IRecipientAddressService {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.entities.Address getInitialAddress();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Throwable getError();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<kotlin.Unit> getErrorObservable();
    
    public abstract void set(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.Address address);
    
    public abstract void set(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount);
}