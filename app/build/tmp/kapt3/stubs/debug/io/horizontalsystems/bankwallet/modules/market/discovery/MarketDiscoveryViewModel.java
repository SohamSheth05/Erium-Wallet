package io.horizontalsystems.bankwallet.modules.market.discovery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR/\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketDiscoveryViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketDiscoveryService;", "clearables", "", "Lio/horizontalsystems/bankwallet/core/Clearable;", "(Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketDiscoveryService;Ljava/util/List;)V", "marketCategories", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "getMarketCategories", "()Ljava/util/List;", "marketCategories$delegate", "Lkotlin/reflect/KProperty0;", "<set-?>", "marketCategory", "getMarketCategory", "()Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "setMarketCategory", "(Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;)V", "marketCategory$delegate", "Lkotlin/reflect/KMutableProperty0;", "onCleared", "", "app_debug"})
public final class MarketDiscoveryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.reflect.KProperty0 marketCategories$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.reflect.KMutableProperty0 marketCategory$delegate = null;
    private final io.horizontalsystems.bankwallet.modules.market.discovery.MarketDiscoveryService service = null;
    private final java.util.List<io.horizontalsystems.bankwallet.core.Clearable> clearables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory> getMarketCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory getMarketCategory() {
        return null;
    }
    
    public final void setMarketCategory(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory p0) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public MarketDiscoveryViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.discovery.MarketDiscoveryService service, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.core.Clearable> clearables) {
        super();
    }
}