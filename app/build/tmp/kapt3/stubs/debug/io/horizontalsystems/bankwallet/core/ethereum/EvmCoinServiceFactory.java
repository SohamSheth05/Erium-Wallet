package io.horizontalsystems.bankwallet.core.ethereum;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ethereum/EvmCoinServiceFactory;", "", "baseCoin", "Lio/horizontalsystems/coinkit2/models/Coin;", "coinKit", "Lio/horizontalsystems/coinkit2/CoinKit;", "currencyManager", "Lio/horizontalsystems/core/ICurrencyManager;", "rateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "(Lio/horizontalsystems/coinkit2/models/Coin;Lio/horizontalsystems/coinkit2/CoinKit;Lio/horizontalsystems/core/ICurrencyManager;Lio/horizontalsystems/bankwallet/core/IRateManager;)V", "baseCoinService", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmCoinService;", "getBaseCoinService", "()Lio/horizontalsystems/bankwallet/core/ethereum/EvmCoinService;", "getCoin", "contractAddress", "", "getCoinService", "Lio/horizontalsystems/ethereumkit/models/Address;", "app_debug"})
public final class EvmCoinServiceFactory {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.core.ethereum.EvmCoinService baseCoinService = null;
    private final io.horizontalsystems.coinkit2.models.Coin baseCoin = null;
    private final io.horizontalsystems.coinkit2.CoinKit coinKit = null;
    private final io.horizontalsystems.core.ICurrencyManager currencyManager = null;
    private final io.horizontalsystems.bankwallet.core.IRateManager rateManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.core.ethereum.EvmCoinService getBaseCoinService() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.core.ethereum.EvmCoinService getCoinService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.models.Address contractAddress) {
        return null;
    }
    
    private final io.horizontalsystems.coinkit2.models.Coin getCoin(java.lang.String contractAddress) {
        return null;
    }
    
    public EvmCoinServiceFactory(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin baseCoin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.CoinKit coinKit, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager rateManager) {
        super();
    }
}