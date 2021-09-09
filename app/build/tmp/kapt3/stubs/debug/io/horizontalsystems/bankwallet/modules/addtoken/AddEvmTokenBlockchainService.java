package io.horizontalsystems.bankwallet.modules.addtoken;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/addtoken/AddEvmTokenBlockchainService;", "Lio/horizontalsystems/bankwallet/core/IAddTokenBlockchainService;", "resolver", "Lio/horizontalsystems/bankwallet/modules/addtoken/IAddEvmTokenResolver;", "networkManager", "Lio/horizontalsystems/bankwallet/core/INetworkManager;", "(Lio/horizontalsystems/bankwallet/modules/addtoken/IAddEvmTokenResolver;Lio/horizontalsystems/bankwallet/core/INetworkManager;)V", "coinAsync", "Lio/reactivex/Single;", "Lio/horizontalsystems/coinkit2/models/Coin;", "reference", "", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "validate", "", "app_debug"})
public final class AddEvmTokenBlockchainService implements io.horizontalsystems.bankwallet.core.IAddTokenBlockchainService {
    private final io.horizontalsystems.bankwallet.modules.addtoken.IAddEvmTokenResolver resolver = null;
    private final io.horizontalsystems.bankwallet.core.INetworkManager networkManager = null;
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String reference) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.coinkit2.models.CoinType coinType(@org.jetbrains.annotations.NotNull()
    java.lang.String reference) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<io.horizontalsystems.coinkit2.models.Coin> coinAsync(@org.jetbrains.annotations.NotNull()
    java.lang.String reference) {
        return null;
    }
    
    public AddEvmTokenBlockchainService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.addtoken.IAddEvmTokenResolver resolver, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.INetworkManager networkManager) {
        super();
    }
}