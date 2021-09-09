package io.horizontalsystems.bankwallet.modules.market.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020 H\u0014J\u0006\u00102\u001a\u00020 J\u0006\u00103\u001a\u00020 J\u0010\u00104\u001a\u00020 2\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020 2\u0006\u00108\u001a\u00020\u0012H\u0002J\u001e\u00109\u001a\u00020 2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R)\u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u0007\u0012\u0004\u0012\u00020\u00120\u001b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010#\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\r\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0010R\u001e\u0010&\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020%@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0019\u0010)\u001a\b\u0012\u0004\u0012\u00020%0*\u00a2\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,\u00a8\u0006:"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/list/MarketListViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/market/list/MarketListService;", "connectivityManager", "Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager;", "clearables", "", "Lio/horizontalsystems/bankwallet/core/Clearable;", "(Lio/horizontalsystems/bankwallet/modules/market/list/MarketListService;Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager;Ljava/util/List;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "loadingLiveData", "", "kotlin.jvm.PlatformType", "getLoadingLiveData", "<set-?>", "Lio/horizontalsystems/bankwallet/modules/market/MarketField;", "marketField", "getMarketField", "()Lio/horizontalsystems/bankwallet/modules/market/MarketField;", "marketViewItemsLiveData", "Lkotlin/Pair;", "Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem;", "getMarketViewItemsLiveData", "networkNotAvailable", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getNetworkNotAvailable", "()Lio/horizontalsystems/core/SingleLiveEvent;", "showEmptyListTextLiveData", "getShowEmptyListTextLiveData", "Lio/horizontalsystems/bankwallet/modules/market/SortingField;", "sortingField", "getSortingField", "()Lio/horizontalsystems/bankwallet/modules/market/SortingField;", "sortingFields", "", "getSortingFields", "()[Lio/horizontalsystems/bankwallet/modules/market/SortingField;", "[Lio/horizontalsystems/bankwallet/modules/market/SortingField;", "convertErrorMessage", "it", "", "onCleared", "onErrorClick", "refresh", "syncState", "state", "Lio/horizontalsystems/bankwallet/modules/market/list/MarketListService$State;", "syncViewItemsBySortingField", "scrollToTop", "update", "app_debug"})
public final class MarketListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.market.SortingField[] sortingFields = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.market.SortingField sortingField;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.market.MarketField marketField = io.horizontalsystems.bankwallet.modules.market.MarketField.PriceDiff;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.util.List<io.horizontalsystems.bankwallet.modules.market.MarketViewItem>, java.lang.Boolean>> marketViewItemsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadingLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> networkNotAvailable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showEmptyListTextLiveData = null;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final io.horizontalsystems.bankwallet.modules.market.list.MarketListService service = null;
    private final io.horizontalsystems.bankwallet.core.managers.ConnectivityManager connectivityManager = null;
    private final java.util.List<io.horizontalsystems.bankwallet.core.Clearable> clearables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.market.SortingField[] getSortingFields() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.market.SortingField getSortingField() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.market.MarketField getMarketField() {
        return null;
    }
    
    public final void update(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.market.SortingField sortingField, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.market.MarketField marketField) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.util.List<io.horizontalsystems.bankwallet.modules.market.MarketViewItem>, java.lang.Boolean>> getMarketViewItemsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getNetworkNotAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowEmptyListTextLiveData() {
        return null;
    }
    
    private final void syncState(io.horizontalsystems.bankwallet.modules.market.list.MarketListService.State state) {
    }
    
    private final void syncViewItemsBySortingField(boolean scrollToTop) {
    }
    
    private final java.lang.String convertErrorMessage(java.lang.Throwable it) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void refresh() {
    }
    
    public final void onErrorClick() {
    }
    
    public MarketListViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.list.MarketListService service, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.ConnectivityManager connectivityManager, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.core.Clearable> clearables) {
        super();
    }
}