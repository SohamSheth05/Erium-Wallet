package io.horizontalsystems.bankwallet.modules.swap.coincard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/coincard/SwapCoinProvider;", "", "dex", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Dex;", "coinManager", "Lio/horizontalsystems/bankwallet/core/ICoinManager;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "adapterManager", "Lio/horizontalsystems/bankwallet/core/IAdapterManager;", "currencyManager", "Lio/horizontalsystems/core/ICurrencyManager;", "xRateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "(Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Dex;Lio/horizontalsystems/bankwallet/core/ICoinManager;Lio/horizontalsystems/bankwallet/core/IWalletManager;Lio/horizontalsystems/bankwallet/core/IAdapterManager;Lio/horizontalsystems/core/ICurrencyManager;Lio/horizontalsystems/bankwallet/core/IRateManager;)V", "walletItems", "", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$CoinBalanceItem;", "getWalletItems", "()Ljava/util/List;", "balance", "Ljava/math/BigDecimal;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "coins", "enabledCoins", "", "exclude", "dexSupportsCoin", "getFiatValue", "Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "getXRate", "app_debug"})
public final class SwapCoinProvider {
    private final io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex dex = null;
    private final io.horizontalsystems.bankwallet.core.ICoinManager coinManager = null;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager = null;
    private final io.horizontalsystems.core.ICurrencyManager currencyManager = null;
    private final io.horizontalsystems.bankwallet.core.IRateManager xRateManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem> coins(boolean enabledCoins, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.coinkit2.models.Coin> exclude) {
        return null;
    }
    
    private final boolean dexSupportsCoin(io.horizontalsystems.coinkit2.models.Coin coin) {
        return false;
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem> getWalletItems() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.entities.CurrencyValue getFiatValue(io.horizontalsystems.coinkit2.models.Coin coin, java.math.BigDecimal balance) {
        return null;
    }
    
    private final java.math.BigDecimal getXRate(io.horizontalsystems.coinkit2.models.Coin coin) {
        return null;
    }
    
    private final java.math.BigDecimal balance(io.horizontalsystems.coinkit2.models.Coin coin) {
        return null;
    }
    
    public SwapCoinProvider(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex dex, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ICoinManager coinManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager xRateManager) {
        super();
    }
}