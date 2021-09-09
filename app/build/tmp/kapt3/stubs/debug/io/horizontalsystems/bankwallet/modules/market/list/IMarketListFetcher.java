package io.horizontalsystems.bankwallet.modules.market.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/list/IMarketListFetcher;", "", "dataUpdatedAsync", "Lio/reactivex/Observable;", "", "getDataUpdatedAsync", "()Lio/reactivex/Observable;", "fetchAsync", "Lio/reactivex/Single;", "", "Lio/horizontalsystems/bankwallet/modules/market/MarketItem;", "currency", "Lio/horizontalsystems/core/entities/Currency;", "app_debug"})
public abstract interface IMarketListFetcher {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<kotlin.Unit> getDataUpdatedAsync();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<io.horizontalsystems.bankwallet.modules.market.MarketItem>> fetchAsync(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency);
}