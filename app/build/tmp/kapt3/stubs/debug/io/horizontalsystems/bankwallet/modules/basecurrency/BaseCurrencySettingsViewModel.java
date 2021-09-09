package io.horizontalsystems.bankwallet.modules.basecurrency;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0006\u0010\u0018\u001a\u00020\u000bJ\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0015R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/basecurrency/BaseCurrencySettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/basecurrency/BaseCurrencySettingsService;", "(Lio/horizontalsystems/bankwallet/modules/basecurrency/BaseCurrencySettingsService;)V", "disclaimerLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getDisclaimerLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "finishLiveEvent", "", "getFinishLiveEvent", "otherItems", "", "Lio/horizontalsystems/bankwallet/modules/basecurrency/CurrencyViewItemWrapper;", "getOtherItems", "()Ljava/util/List;", "popularItems", "getPopularItems", "tmpBaseCurrency", "Lio/horizontalsystems/core/entities/Currency;", "doSetBaseCurrency", "v", "onAcceptDisclaimer", "setBaseCurrency", "app_debug"})
public final class BaseCurrencySettingsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> disclaimerLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> finishLiveEvent = null;
    private io.horizontalsystems.core.entities.Currency tmpBaseCurrency;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.modules.basecurrency.CurrencyViewItemWrapper> popularItems = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.modules.basecurrency.CurrencyViewItemWrapper> otherItems = null;
    private final io.horizontalsystems.bankwallet.modules.basecurrency.BaseCurrencySettingsService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> getDisclaimerLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getFinishLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.basecurrency.CurrencyViewItemWrapper> getPopularItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.basecurrency.CurrencyViewItemWrapper> getOtherItems() {
        return null;
    }
    
    public final void setBaseCurrency(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency v) {
    }
    
    public final void onAcceptDisclaimer() {
    }
    
    private final void doSetBaseCurrency(io.horizontalsystems.core.entities.Currency v) {
    }
    
    public BaseCurrencySettingsViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.basecurrency.BaseCurrencySettingsService service) {
        super();
    }
}