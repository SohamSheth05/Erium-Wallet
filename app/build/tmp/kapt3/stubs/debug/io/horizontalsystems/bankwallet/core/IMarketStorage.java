package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IMarketStorage;", "", "currentTab", "Lio/horizontalsystems/bankwallet/modules/market/MarketModule$Tab;", "getCurrentTab", "()Lio/horizontalsystems/bankwallet/modules/market/MarketModule$Tab;", "setCurrentTab", "(Lio/horizontalsystems/bankwallet/modules/market/MarketModule$Tab;)V", "app_debug"})
public abstract interface IMarketStorage {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.modules.market.MarketModule.Tab getCurrentTab();
    
    public abstract void setCurrentTab(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.market.MarketModule.Tab p0);
}