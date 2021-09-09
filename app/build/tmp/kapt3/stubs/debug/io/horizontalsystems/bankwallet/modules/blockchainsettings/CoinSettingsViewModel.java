package io.horizontalsystems.bankwallet.modules.blockchainsettings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J,\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005H\u0002J,\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\tH\u0002J\u0006\u0010\u001d\u001a\u00020\u001bJ\b\u0010\u001e\u001a\u00020\u001bH\u0014J\u0014\u0010\u001f\u001a\u00020\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bankwallet/modules/blockchainsettings/CoinSettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService;", "clearables", "", "Lio/horizontalsystems/bankwallet/core/Clearable;", "(Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService;Ljava/util/List;)V", "currentRequest", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService$Request;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "openBottomSelectorLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "Lio/horizontalsystems/bankwallet/modules/blockchainsettings/BlockchainSettingsModule$Config;", "getOpenBottomSelectorLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "bitcoinCashCoinTypeConfig", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "types", "Lio/horizontalsystems/bankwallet/entities/BitcoinCashCoinType;", "current", "derivationConfig", "allDerivations", "Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;", "handle", "", "request", "onCancelSelect", "onCleared", "onSelect", "indexes", "", "app_debug"})
public final class CoinSettingsViewModel extends androidx.lifecycle.ViewModel {
    private io.reactivex.disposables.CompositeDisposable disposables;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.blockchainsettings.BlockchainSettingsModule.Config> openBottomSelectorLiveEvent = null;
    private io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService.Request currentRequest;
    private final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService service = null;
    private final java.util.List<io.horizontalsystems.bankwallet.core.Clearable> clearables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.blockchainsettings.BlockchainSettingsModule.Config> getOpenBottomSelectorLiveEvent() {
        return null;
    }
    
    private final void handle(io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService.Request request) {
    }
    
    private final io.horizontalsystems.bankwallet.modules.blockchainsettings.BlockchainSettingsModule.Config derivationConfig(io.horizontalsystems.coinkit2.models.Coin coin, java.util.List<? extends io.horizontalsystems.bankwallet.entities.AccountType.Derivation> allDerivations, java.util.List<? extends io.horizontalsystems.bankwallet.entities.AccountType.Derivation> current) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.blockchainsettings.BlockchainSettingsModule.Config bitcoinCashCoinTypeConfig(io.horizontalsystems.coinkit2.models.Coin coin, java.util.List<? extends io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType> types, java.util.List<? extends io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType> current) {
        return null;
    }
    
    public final void onSelect(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> indexes) {
    }
    
    public final void onCancelSelect() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public CoinSettingsViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService service, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.core.Clearable> clearables) {
        super();
    }
}