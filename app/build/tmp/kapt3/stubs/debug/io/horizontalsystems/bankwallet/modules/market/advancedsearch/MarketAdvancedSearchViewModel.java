package io.horizontalsystems.bankwallet.modules.market.advancedsearch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010k\u001a\n \u0012*\u0004\u0018\u00010\u001e0\u001e2\u0006\u0010l\u001a\u00020mH\u0002J\b\u0010n\u001a\u00020oH\u0014J\u0006\u0010p\u001a\u00020oR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u0012*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R4\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\t2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR/\u0010%\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010! \u0012*\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\t0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014R\u001f\u0010\'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\t0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u001f\u0010)\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010*0*0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0014R4\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\t2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010\u000fR/\u0010/\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010! \u0012*\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\t0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0014R\u001f\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\t0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0017R$\u00103\u001a\u00020*2\u0006\u0010\b\u001a\u00020*@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001f\u00108\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010*0*0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0014R$\u0010:\u001a\u00020*2\u0006\u0010\b\u001a\u00020*@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00105\"\u0004\b<\u00107R\u001f\u0010=\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010*0*0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0014R$\u0010?\u001a\u00020*2\u0006\u0010\b\u001a\u00020*@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u00105\"\u0004\bA\u00107R\u001f\u0010B\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010*0*0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0014R0\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020D0\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\r\"\u0004\bG\u0010\u000fR+\u0010H\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020D \u0012*\n\u0012\u0004\u0012\u00020D\u0018\u00010\t0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0014R\u001d\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\t0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010\u0017R4\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0\t2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\r\"\u0004\bO\u0010\u000fR/\u0010P\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010L \u0012*\f\u0012\u0006\u0012\u0004\u0018\u00010L\u0018\u00010\t0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u0014R\u001f\u0010R\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010L0\t0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010\u0017R$\u0010T\u001a\u00020*2\u0006\u0010\b\u001a\u00020*@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u00105\"\u0004\bV\u00107R\u001f\u0010W\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010*0*0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010\u0014R$\u0010Y\u001a\u00020*2\u0006\u0010\b\u001a\u00020*@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u00105\"\u0004\b[\u00107R\u001f\u0010\\\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010*0*0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u001f\u0010`\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010*0*0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010\u0014R\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010\u0014R4\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\t2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\r\"\u0004\bf\u0010\u000fR/\u0010g\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010! \u0012*\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\t0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010\u0014R\u001f\u0010i\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\t0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010\u0017\u00a8\u0006q"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/advancedsearch/MarketAdvancedSearchViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/market/advancedsearch/MarketAdvancedSearchService;", "clearables", "", "Lio/horizontalsystems/bankwallet/core/Clearable;", "(Lio/horizontalsystems/bankwallet/modules/market/advancedsearch/MarketAdvancedSearchService;Ljava/util/List;)V", "value", "Lio/horizontalsystems/bankwallet/ui/selector/ViewItemWrapper;", "Lio/horizontalsystems/bankwallet/modules/market/advancedsearch/CoinList;", "coinListViewItem", "getCoinListViewItem", "()Lio/horizontalsystems/bankwallet/ui/selector/ViewItemWrapper;", "setCoinListViewItem", "(Lio/horizontalsystems/bankwallet/ui/selector/ViewItemWrapper;)V", "coinListViewItemLiveData", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "getCoinListViewItemLiveData", "()Landroidx/lifecycle/MutableLiveData;", "coinListsViewItemOptions", "getCoinListsViewItemOptions", "()Ljava/util/List;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "errorLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getErrorLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "Lio/horizontalsystems/bankwallet/modules/market/advancedsearch/Range;", "liquidityViewItem", "getLiquidityViewItem", "setLiquidityViewItem", "liquidityViewItemLiveData", "getLiquidityViewItemLiveData", "liquidityViewItemOptions", "getLiquidityViewItemOptions", "loadingLiveData", "", "getLoadingLiveData", "marketCapViewItem", "getMarketCapViewItem", "setMarketCapViewItem", "marketCapViewItemLiveData", "getMarketCapViewItemLiveData", "marketCapViewItemOptions", "getMarketCapViewItemOptions", "outperformedBnbOn", "getOutperformedBnbOn", "()Z", "setOutperformedBnbOn", "(Z)V", "outperformedBnbOnFilter", "getOutperformedBnbOnFilter", "outperformedBtcOn", "getOutperformedBtcOn", "setOutperformedBtcOn", "outperformedBtcOnFilter", "getOutperformedBtcOnFilter", "outperformedEthOn", "getOutperformedEthOn", "setOutperformedEthOn", "outperformedEthOnFilter", "getOutperformedEthOnFilter", "Lio/horizontalsystems/bankwallet/modules/market/advancedsearch/TimePeriod;", "periodViewItem", "getPeriodViewItem", "setPeriodViewItem", "periodViewItemLiveData", "getPeriodViewItemLiveData", "periodViewItemOptions", "getPeriodViewItemOptions", "Lio/horizontalsystems/bankwallet/modules/market/advancedsearch/PriceChange;", "priceChangeViewItem", "getPriceChangeViewItem", "setPriceChangeViewItem", "priceChangeViewItemLiveData", "getPriceChangeViewItemLiveData", "priceChangeViewItemOptions", "getPriceChangeViewItemOptions", "priceCloseToAth", "getPriceCloseToAth", "setPriceCloseToAth", "priceCloseToAthFilter", "getPriceCloseToAthFilter", "priceCloseToAtl", "getPriceCloseToAtl", "setPriceCloseToAtl", "priceCloseToAtlFilter", "getPriceCloseToAtlFilter", "getService", "()Lio/horizontalsystems/bankwallet/modules/market/advancedsearch/MarketAdvancedSearchService;", "showResultsEnabledLiveData", "getShowResultsEnabledLiveData", "showResultsTitleLiveData", "getShowResultsTitleLiveData", "volumeViewItem", "getVolumeViewItem", "setVolumeViewItem", "volumeViewItemLiveData", "getVolumeViewItemLiveData", "volumeViewItemOptions", "getVolumeViewItemOptions", "convertErrorMessage", "it", "", "onCleared", "", "reset", "app_debug"})
public final class MarketAdvancedSearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.CoinList>> coinListsViewItemOptions = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range>> marketCapViewItemOptions = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range>> volumeViewItemOptions = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range>> liquidityViewItemOptions = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.TimePeriod>> periodViewItemOptions = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.PriceChange>> priceChangeViewItemOptions = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.CoinList> coinListViewItem;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range> marketCapViewItem;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range> volumeViewItem;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range> liquidityViewItem;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.TimePeriod> periodViewItem;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.PriceChange> priceChangeViewItem;
    private boolean outperformedBtcOn = false;
    private boolean outperformedEthOn = false;
    private boolean outperformedBnbOn = false;
    private boolean priceCloseToAth = false;
    private boolean priceCloseToAtl = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.CoinList>> coinListViewItemLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range>> marketCapViewItemLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range>> volumeViewItemLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range>> liquidityViewItemLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.TimePeriod>> periodViewItemLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.PriceChange>> priceChangeViewItemLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> showResultsTitleLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showResultsEnabledLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> errorLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadingLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> outperformedBtcOnFilter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> outperformedEthOnFilter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> outperformedBnbOnFilter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> priceCloseToAthFilter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> priceCloseToAtlFilter = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.market.advancedsearch.MarketAdvancedSearchService service = null;
    private final java.util.List<io.horizontalsystems.bankwallet.core.Clearable> clearables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.CoinList>> getCoinListsViewItemOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range>> getMarketCapViewItemOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range>> getVolumeViewItemOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range>> getLiquidityViewItemOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.TimePeriod>> getPeriodViewItemOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.PriceChange>> getPriceChangeViewItemOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.CoinList> getCoinListViewItem() {
        return null;
    }
    
    public final void setCoinListViewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.CoinList> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range> getMarketCapViewItem() {
        return null;
    }
    
    public final void setMarketCapViewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range> getVolumeViewItem() {
        return null;
    }
    
    public final void setVolumeViewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range> getLiquidityViewItem() {
        return null;
    }
    
    public final void setLiquidityViewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.TimePeriod> getPeriodViewItem() {
        return null;
    }
    
    public final void setPeriodViewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.TimePeriod> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.PriceChange> getPriceChangeViewItem() {
        return null;
    }
    
    public final void setPriceChangeViewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.PriceChange> value) {
    }
    
    public final boolean getOutperformedBtcOn() {
        return false;
    }
    
    public final void setOutperformedBtcOn(boolean value) {
    }
    
    public final boolean getOutperformedEthOn() {
        return false;
    }
    
    public final void setOutperformedEthOn(boolean value) {
    }
    
    public final boolean getOutperformedBnbOn() {
        return false;
    }
    
    public final void setOutperformedBnbOn(boolean value) {
    }
    
    public final boolean getPriceCloseToAth() {
        return false;
    }
    
    public final void setPriceCloseToAth(boolean value) {
    }
    
    public final boolean getPriceCloseToAtl() {
        return false;
    }
    
    public final void setPriceCloseToAtl(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.CoinList>> getCoinListViewItemLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range>> getMarketCapViewItemLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range>> getVolumeViewItemLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.Range>> getLiquidityViewItemLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.TimePeriod>> getPeriodViewItemLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.ui.selector.ViewItemWrapper<io.horizontalsystems.bankwallet.modules.market.advancedsearch.PriceChange>> getPriceChangeViewItemLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getShowResultsTitleLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowResultsEnabledLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> getErrorLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOutperformedBtcOnFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOutperformedEthOnFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOutperformedBnbOnFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPriceCloseToAthFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPriceCloseToAtlFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getDisposable() {
        return null;
    }
    
    public final void reset() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final java.lang.String convertErrorMessage(java.lang.Throwable it) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.market.advancedsearch.MarketAdvancedSearchService getService() {
        return null;
    }
    
    public MarketAdvancedSearchViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.advancedsearch.MarketAdvancedSearchService service, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.core.Clearable> clearables) {
        super();
    }
}