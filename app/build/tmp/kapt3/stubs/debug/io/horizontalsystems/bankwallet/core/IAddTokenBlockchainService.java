package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IAddTokenBlockchainService;", "", "coinAsync", "Lio/reactivex/Single;", "Lio/horizontalsystems/coinkit2/models/Coin;", "reference", "", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "validate", "", "app_debug"})
public abstract interface IAddTokenBlockchainService {
    
    public abstract void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String reference);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.coinkit2.models.CoinType coinType(@org.jetbrains.annotations.NotNull()
    java.lang.String reference);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<io.horizontalsystems.coinkit2.models.Coin> coinAsync(@org.jetbrains.annotations.NotNull()
    java.lang.String reference);
}