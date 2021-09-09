package io.horizontalsystems.bankwallet.modules.managewallets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nJ\b\u0010\u0016\u001a\u00020\u0013H\u0014J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nJ\u0014\u0010\u0018\u001a\u00020\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dJ\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006$"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsService;", "clearables", "", "Lio/horizontalsystems/bankwallet/core/Clearable;", "(Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsService;Ljava/util/List;)V", "disableCoinLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/coinkit2/models/Coin;", "getDisableCoinLiveData", "()Landroidx/lifecycle/MutableLiveData;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "viewStateLiveData", "Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinViewState;", "getViewStateLiveData", "disable", "", "coin", "enable", "onCleared", "onClickSettings", "syncViewState", "serviceState", "Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsService$State;", "updateFilter", "v", "", "viewItem", "Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinViewItem;", "item", "Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsService$Item;", "listPosition", "Lio/horizontalsystems/views/ListPosition;", "app_debug"})
public final class ManageWalletsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinViewState> viewStateLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.coinkit2.models.Coin> disableCoinLiveData = null;
    private io.reactivex.disposables.CompositeDisposable disposables;
    private final io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService service = null;
    private final java.util.List<io.horizontalsystems.bankwallet.core.Clearable> clearables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinViewState> getViewStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.coinkit2.models.Coin> getDisableCoinLiveData() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinViewItem viewItem(io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.Item item, io.horizontalsystems.views.ListPosition listPosition) {
        return null;
    }
    
    private final void syncViewState(io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService.State serviceState) {
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
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public ManageWalletsViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsService service, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.core.Clearable> clearables) {
        super();
    }
}