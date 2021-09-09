package io.horizontalsystems.bankwallet.modules.market;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fJ\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0007R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/market/MarketService;", "(Lio/horizontalsystems/bankwallet/modules/market/MarketService;)V", "currentTabLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/bankwallet/modules/market/MarketModule$Tab;", "kotlin.jvm.PlatformType", "getCurrentTabLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setCurrentTabLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "discoveryListTypeLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "Lio/horizontalsystems/bankwallet/modules/market/MarketModule$ListType;", "getDiscoveryListTypeLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "tabs", "", "getTabs", "()[Lio/horizontalsystems/bankwallet/modules/market/MarketModule$Tab;", "[Lio/horizontalsystems/bankwallet/modules/market/MarketModule$Tab;", "onClickSeeAll", "", "listType", "onSelect", "tab", "app_debug"})
public final class MarketViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.market.MarketModule.Tab[] tabs = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.market.MarketModule.Tab> currentTabLiveData;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.market.MarketModule.ListType> discoveryListTypeLiveEvent = null;
    private final io.horizontalsystems.bankwallet.modules.market.MarketService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.market.MarketModule.Tab[] getTabs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.market.MarketModule.Tab> getCurrentTabLiveData() {
        return null;
    }
    
    public final void setCurrentTabLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.market.MarketModule.Tab> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.market.MarketModule.ListType> getDiscoveryListTypeLiveEvent() {
        return null;
    }
    
    public final void onSelect(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.MarketModule.Tab tab) {
    }
    
    public final void onClickSeeAll(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.MarketModule.ListType listType) {
    }
    
    public MarketViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.MarketService service) {
        super();
    }
}