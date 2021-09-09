package io.horizontalsystems.bankwallet.modules.basecurrency;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/basecurrency/BaseCurrencySettingsService;", "", "currencyManager", "Lio/horizontalsystems/core/ICurrencyManager;", "(Lio/horizontalsystems/core/ICurrencyManager;)V", "value", "Lio/horizontalsystems/core/entities/Currency;", "baseCurrency", "getBaseCurrency", "()Lio/horizontalsystems/core/entities/Currency;", "setBaseCurrency", "(Lio/horizontalsystems/core/entities/Currency;)V", "otherCurrencies", "", "getOtherCurrencies", "()Ljava/util/List;", "popularCurrencies", "getPopularCurrencies", "popularCurrencyCodes", "", "app_debug"})
public final class BaseCurrencySettingsService {
    private final java.util.List<java.lang.String> popularCurrencyCodes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.core.entities.Currency> popularCurrencies = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.core.entities.Currency> otherCurrencies = null;
    private final io.horizontalsystems.core.ICurrencyManager currencyManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.entities.Currency getBaseCurrency() {
        return null;
    }
    
    public final void setBaseCurrency(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.core.entities.Currency> getPopularCurrencies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.core.entities.Currency> getOtherCurrencies() {
        return null;
    }
    
    public BaseCurrencySettingsService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ICurrencyManager currencyManager) {
        super();
    }
}