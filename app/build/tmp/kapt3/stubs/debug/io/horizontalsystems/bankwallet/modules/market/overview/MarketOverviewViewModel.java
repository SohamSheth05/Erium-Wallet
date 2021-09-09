package io.horizontalsystems.bankwallet.modules.market.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020*H\u0014J\u0006\u0010+\u001a\u00020*J\u0006\u0010,\u001a\u00020*J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020*2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020*H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010R\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0010\u00a8\u00064"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewService;", "postService", "Lio/horizontalsystems/bankwallet/modules/market/posts/MarketPostService;", "clearables", "", "Lio/horizontalsystems/bankwallet/core/Clearable;", "(Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewService;Lio/horizontalsystems/bankwallet/modules/market/posts/MarketPostService;Ljava/util/List;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "loadingLiveData", "", "kotlin.jvm.PlatformType", "getLoadingLiveData", "postsViewItemsLiveData", "Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewModule$PostViewItem;", "getPostsViewItemsLiveData", "showPoweredByLiveData", "getShowPoweredByLiveData", "toastLiveData", "Lio/horizontalsystems/core/SingleLiveEvent;", "getToastLiveData", "()Lio/horizontalsystems/core/SingleLiveEvent;", "topGainersViewItemsLiveData", "Lio/horizontalsystems/bankwallet/modules/market/MarketViewItem;", "getTopGainersViewItemsLiveData", "topLosersViewItemsLiveData", "getTopLosersViewItemsLiveData", "convertErrorMessage", "it", "", "getTimeAgo", "timestamp", "", "onCleared", "", "onErrorClick", "refresh", "syncPostsState", "postsState", "Lio/horizontalsystems/bankwallet/modules/market/posts/MarketPostService$State;", "syncState", "state", "Lio/horizontalsystems/bankwallet/modules/market/overview/MarketOverviewService$State;", "syncViewItemsBySortingField", "app_debug"})
public final class MarketOverviewViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.market.MarketViewItem>> topGainersViewItemsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.market.MarketViewItem>> topLosersViewItemsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewModule.PostViewItem>> postsViewItemsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showPoweredByLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadingLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> toastLiveData = null;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewService service = null;
    private final io.horizontalsystems.bankwallet.modules.market.posts.MarketPostService postService = null;
    private final java.util.List<io.horizontalsystems.bankwallet.core.Clearable> clearables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.market.MarketViewItem>> getTopGainersViewItemsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.market.MarketViewItem>> getTopLosersViewItemsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewModule.PostViewItem>> getPostsViewItemsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowPoweredByLiveData() {
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
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> getToastLiveData() {
        return null;
    }
    
    private final void syncPostsState(io.horizontalsystems.bankwallet.modules.market.posts.MarketPostService.State postsState) {
    }
    
    private final void syncState(io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewService.State state) {
    }
    
    private final void syncViewItemsBySortingField() {
    }
    
    private final java.lang.String getTimeAgo(long timestamp) {
        return null;
    }
    
    private final java.lang.String convertErrorMessage(java.lang.Throwable it) {
        return null;
    }
    
    public final void onErrorClick() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void refresh() {
    }
    
    public MarketOverviewViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.overview.MarketOverviewService service, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.posts.MarketPostService postService, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.core.Clearable> clearables) {
        super();
    }
}