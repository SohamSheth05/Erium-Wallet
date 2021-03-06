package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/CurrencyManager;", "Lio/horizontalsystems/core/ICurrencyManager;", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "appConfigProvider", "Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;", "(Lio/horizontalsystems/bankwallet/core/ILocalStorage;Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;)V", "value", "Lio/horizontalsystems/core/entities/Currency;", "baseCurrency", "getBaseCurrency", "()Lio/horizontalsystems/core/entities/Currency;", "setBaseCurrency", "(Lio/horizontalsystems/core/entities/Currency;)V", "baseCurrencyUpdatedSignal", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getBaseCurrencyUpdatedSignal", "()Lio/reactivex/subjects/PublishSubject;", "currencies", "", "getCurrencies", "()Ljava/util/List;", "app_debug"})
public final class CurrencyManager implements io.horizontalsystems.core.ICurrencyManager {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> baseCurrencyUpdatedSignal = null;
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorage = null;
    private final io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.core.entities.Currency getBaseCurrency() {
        return null;
    }
    
    @java.lang.Override()
    public void setBaseCurrency(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.core.entities.Currency> getCurrencies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.subjects.PublishSubject<kotlin.Unit> getBaseCurrencyUpdatedSignal() {
        return null;
    }
    
    public CurrencyManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider) {
        super();
    }
}