package io.horizontalsystems.bankwallet.modules.addtoken.bep2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/addtoken/bep2/AddBep2TokenBlockchainService;", "Lio/horizontalsystems/bankwallet/core/IAddTokenBlockchainService;", "appConfigProvider", "Lio/horizontalsystems/core/IBuildConfigProvider;", "(Lio/horizontalsystems/core/IBuildConfigProvider;)V", "binanceApi", "Lio/horizontalsystems/binancechainkit/core/api/BinanceChainApi;", "networkType", "Lio/horizontalsystems/binancechainkit/BinanceChainKit$NetworkType;", "coinAsync", "Lio/reactivex/Single;", "Lio/horizontalsystems/coinkit2/models/Coin;", "reference", "", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "validate", "", "app_debug"})
public final class AddBep2TokenBlockchainService implements io.horizontalsystems.bankwallet.core.IAddTokenBlockchainService {
    private final io.horizontalsystems.binancechainkit.BinanceChainKit.NetworkType networkType = null;
    private final io.horizontalsystems.binancechainkit.core.api.BinanceChainApi binanceApi = null;
    
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
    
    public AddBep2TokenBlockchainService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.IBuildConfigProvider appConfigProvider) {
        super();
    }
}