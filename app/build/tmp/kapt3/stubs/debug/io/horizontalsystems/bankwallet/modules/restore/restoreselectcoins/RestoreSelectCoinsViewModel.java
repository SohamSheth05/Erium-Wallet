package io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\nJ\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\nJ\b\u0010\u001f\u001a\u00020\u0016H\u0014J\u000e\u0010 \u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\nJ\u0006\u0010!\u001a\u00020\u0016J\u0014\u0010\"\u001a\u00020\u00162\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u000e\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\'J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\f\u00a8\u0006."}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsService;", "clearables", "", "Lio/horizontalsystems/bankwallet/core/Clearable;", "(Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsService;Ljava/util/List;)V", "disableCoinLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/coinkit2/models/Coin;", "getDisableCoinLiveData", "()Landroidx/lifecycle/MutableLiveData;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "restoreEnabledLiveData", "Landroidx/lifecycle/LiveData;", "", "getRestoreEnabledLiveData", "()Landroidx/lifecycle/LiveData;", "successLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getSuccessLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "viewStateLiveData", "Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinViewState;", "getViewStateLiveData", "disable", "coin", "enable", "onCleared", "onClickSettings", "onRestore", "syncViewState", "serviceState", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsService$State;", "updateFilter", "v", "", "viewItem", "Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinViewItem;", "item", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsService$Item;", "listPosition", "Lio/horizontalsystems/views/ListPosition;", "app_debug"})
public final class RestoreSelectCoinsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinViewState> viewStateLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.coinkit2.models.Coin> disableCoinLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> successLiveEvent = null;
    private io.reactivex.disposables.CompositeDisposable disposables;
    private final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService service = null;
    private final java.util.List<io.horizontalsystems.bankwallet.core.Clearable> clearables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinViewState> getViewStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.coinkit2.models.Coin> getDisableCoinLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getSuccessLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getRestoreEnabledLiveData() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinViewItem viewItem(io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.Item item, io.horizontalsystems.views.ListPosition listPosition) {
        return null;
    }
    
    private final void syncViewState(io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService.State serviceState) {
    }
    
    public final void enable(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public final void disable(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public final void onClickSettings(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public final void updateFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String v) {
    }
    
    public final void onRestore() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public RestoreSelectCoinsViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsService service, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.core.Clearable> clearables) {
        super();
    }
}