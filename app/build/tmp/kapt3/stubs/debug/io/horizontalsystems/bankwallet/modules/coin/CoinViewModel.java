package io.horizontalsystems.bankwallet.modules.coin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fJ\b\u0010W\u001a\u00020\u000fH\u0002J\u0012\u0010X\u001a\u0004\u0018\u00010Y2\u0006\u0010Z\u001a\u00020[H\u0002J\u0012\u0010\\\u001a\u00020\u000f2\b\u0010]\u001a\u0004\u0018\u00010^H\u0002J\b\u0010_\u001a\u00020\u000fH\u0014J\u0006\u0010`\u001a\u00020\u000fJ\u0006\u0010a\u001a\u00020\u000fJ\u000e\u0010b\u001a\u00020\u000f2\u0006\u0010c\u001a\u00020@J\u000e\u0010d\u001a\u00020\u000f2\u0006\u0010e\u001a\u00020fJ\u0006\u0010g\u001a\u00020\u000fJ.\u0010h\u001a\u00020\u000f2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u001e0\n2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\b\u0010k\u001a\u0004\u0018\u00010\u0005H\u0002J\u0016\u0010l\u001a\u00020\u000f2\u0006\u0010m\u001a\u00020\'2\u0006\u0010n\u001a\u00020\u0013J\u0010\u0010o\u001a\u00020\u000f2\u0006\u0010p\u001a\u00020qH\u0002J\b\u0010r\u001a\u00020\u000fH\u0002J\b\u0010s\u001a\u00020\u000fH\u0002J\b\u0010t\u001a\u00020\u000fH\u0002J\b\u0010u\u001a\u00020\u000fH\u0002J\b\u0010v\u001a\u00020\u000fH\u0002J\u0010\u0010w\u001a\u00020\u000f2\u0006\u0010x\u001a\u00020yH\u0002R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\n0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\n0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\n0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0011R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0011R\u000e\u0010/\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0011R\u001a\u00102\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0011R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0011R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0011R\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0011R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0011R\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010\u0011R\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010\u0011R#\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00050P0O\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010\u0011R\u001d\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\n0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010\u0011\u00a8\u0006z"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/CoinViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/coin/CoinService;", "coinCode", "", "coinTitle", "factory", "Lio/horizontalsystems/bankwallet/modules/coin/CoinViewFactory;", "clearables", "", "Lio/horizontalsystems/bankwallet/core/Clearable;", "(Lio/horizontalsystems/bankwallet/modules/coin/CoinService;Ljava/lang/String;Ljava/lang/String;Lio/horizontalsystems/bankwallet/modules/coin/CoinViewFactory;Ljava/util/List;)V", "alertNotificationUpdated", "Landroidx/lifecycle/MutableLiveData;", "", "getAlertNotificationUpdated", "()Landroidx/lifecycle/MutableLiveData;", "chartSpinner", "", "getChartSpinner", "getCoinCode", "()Ljava/lang/String;", "coinDetailsLiveData", "Lio/horizontalsystems/bankwallet/modules/coin/CoinDetailsViewItem;", "getCoinDetailsLiveData", "coinInvestors", "Lio/horizontalsystems/bankwallet/modules/coin/InvestorItem;", "getCoinInvestors", "coinMarkets", "Lio/horizontalsystems/bankwallet/modules/coin/MarketTickerViewItem;", "getCoinMarkets", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "getCoinType", "()Lio/horizontalsystems/coinkit2/models/CoinType;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "enabledIndicator", "Lio/horizontalsystems/chartview/models/ChartIndicator;", "extraPages", "Lio/horizontalsystems/bankwallet/modules/coin/CoinExtraPage;", "getExtraPages", "isFavorite", "latestRateLiveData", "Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "getLatestRateLiveData", "macdIsEnabled", "marketSpinner", "getMarketSpinner", "notificationIconActive", "getNotificationIconActive", "()Z", "setNotificationIconActive", "(Z)V", "notificationIconVisible", "getNotificationIconVisible", "setNotificationIconVisible", "rateDiffCoinCodes", "rateDiffPeriods", "Lio/horizontalsystems/xrateskit2/entities/TimePeriod;", "setChartIndicatorsEnabled", "getSetChartIndicatorsEnabled", "setDefaultMode", "Lio/horizontalsystems/xrateskit2/entities/ChartType;", "getSetDefaultMode", "setSelectedPoint", "Lio/horizontalsystems/bankwallet/modules/coin/ChartPointViewItem;", "getSetSelectedPoint", "showChartError", "getShowChartError", "showChartInfo", "Lio/horizontalsystems/bankwallet/modules/coin/ChartInfoViewItem;", "getShowChartInfo", "showEma", "getShowEma", "showMacd", "getShowMacd", "showNotificationMenu", "Lio/horizontalsystems/core/SingleLiveEvent;", "Lkotlin/Pair;", "getShowNotificationMenu", "()Lio/horizontalsystems/core/SingleLiveEvent;", "showRsi", "getShowRsi", "uncheckIndicators", "getUncheckIndicators", "fetchChartInfo", "getContractInfo", "Lio/horizontalsystems/bankwallet/modules/coin/ContractInfo;", "coinDetails", "Lio/horizontalsystems/xrateskit2/entities/CoinMarketDetails;", "onChartError", "error", "", "onCleared", "onFavoriteClick", "onNotificationClick", "onSelect", "type", "onTouchSelect", "point", "Lio/horizontalsystems/chartview/models/PointInfo;", "onUnfavoriteClick", "setExtraPageButtons", "coinMarketItems", "coinInvestorItems", "coinVolume", "setIndicatorChanged", "indicator", "checked", "syncCoinDetailsState", "state", "Lio/horizontalsystems/bankwallet/modules/coin/CoinService$CoinDetailsState;", "updateAlertNotificationIconState", "updateChartIndicatorState", "updateChartInfo", "updateCoinDetails", "updateFavoriteNotificationItemState", "updateLatestRate", "latestRate", "Lio/horizontalsystems/xrateskit2/entities/LatestRate;", "app_debug"})
public final class CoinViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> chartSpinner = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> marketSpinner = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.xrateskit2.entities.ChartType> setDefaultMode = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.coin.ChartPointViewItem> setSelectedPoint = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.coin.ChartInfoViewItem> showChartInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.coin.CoinDetailsViewItem> coinDetailsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> showChartError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showEma = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showMacd = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showRsi = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> setChartIndicatorsEnabled = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> alertNotificationUpdated = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Pair<io.horizontalsystems.coinkit2.models.CoinType, java.lang.String>> showNotificationMenu = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFavorite = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.coin.MarketTickerViewItem>> coinMarkets = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.coin.InvestorItem>> coinInvestors = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.coin.CoinExtraPage>> extraPages = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.chartview.models.ChartIndicator>> uncheckIndicators = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.entities.CurrencyValue> latestRateLiveData = null;
    private boolean notificationIconVisible;
    private boolean notificationIconActive = false;
    private io.horizontalsystems.chartview.models.ChartIndicator enabledIndicator;
    private boolean macdIsEnabled = false;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final java.util.List<io.horizontalsystems.xrateskit2.entities.TimePeriod> rateDiffPeriods = null;
    private final java.util.List<java.lang.String> rateDiffCoinCodes = null;
    private final io.horizontalsystems.bankwallet.modules.coin.CoinService service = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coinCode = null;
    private final java.lang.String coinTitle = null;
    private final io.horizontalsystems.bankwallet.modules.coin.CoinViewFactory factory = null;
    private final java.util.List<io.horizontalsystems.bankwallet.core.Clearable> clearables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getChartSpinner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getMarketSpinner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.xrateskit2.entities.ChartType> getSetDefaultMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.coin.ChartPointViewItem> getSetSelectedPoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.coin.ChartInfoViewItem> getShowChartInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.coin.CoinDetailsViewItem> getCoinDetailsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getShowChartError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowEma() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowMacd() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowRsi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSetChartIndicatorsEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getAlertNotificationUpdated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Pair<io.horizontalsystems.coinkit2.models.CoinType, java.lang.String>> getShowNotificationMenu() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFavorite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.coin.MarketTickerViewItem>> getCoinMarkets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.coin.InvestorItem>> getCoinInvestors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.coin.CoinExtraPage>> getExtraPages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.chartview.models.ChartIndicator>> getUncheckIndicators() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.entities.CurrencyValue> getLatestRateLiveData() {
        return null;
    }
    
    public final boolean getNotificationIconVisible() {
        return false;
    }
    
    public final void setNotificationIconVisible(boolean p0) {
    }
    
    public final boolean getNotificationIconActive() {
        return false;
    }
    
    public final void setNotificationIconActive(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.coinkit2.models.CoinType getCoinType() {
        return null;
    }
    
    private final void updateLatestRate(io.horizontalsystems.xrateskit2.entities.LatestRate latestRate) {
    }
    
    public final void onSelect(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.ChartType type) {
    }
    
    public final void onTouchSelect(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.chartview.models.PointInfo point) {
    }
    
    public final void onNotificationClick() {
    }
    
    public final void onFavoriteClick() {
    }
    
    public final void onUnfavoriteClick() {
    }
    
    public final void setIndicatorChanged(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.chartview.models.ChartIndicator indicator, boolean checked) {
    }
    
    private final void updateChartIndicatorState() {
    }
    
    private final void onChartError(java.lang.Throwable error) {
    }
    
    private final void fetchChartInfo() {
    }
    
    private final void syncCoinDetailsState(io.horizontalsystems.bankwallet.modules.coin.CoinService.CoinDetailsState state) {
    }
    
    private final void updateAlertNotificationIconState() {
    }
    
    private final void updateFavoriteNotificationItemState() {
    }
    
    private final void updateCoinDetails() {
    }
    
    private final io.horizontalsystems.bankwallet.modules.coin.ContractInfo getContractInfo(io.horizontalsystems.xrateskit2.entities.CoinMarketDetails coinDetails) {
        return null;
    }
    
    private final void setExtraPageButtons(java.util.List<io.horizontalsystems.bankwallet.modules.coin.MarketTickerViewItem> coinMarketItems, java.util.List<? extends io.horizontalsystems.bankwallet.modules.coin.InvestorItem> coinInvestorItems, java.lang.String coinVolume) {
    }
    
    private final void updateChartInfo() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoinCode() {
        return null;
    }
    
    public CoinViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.coin.CoinService service, @org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String coinTitle, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.coin.CoinViewFactory factory, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.core.Clearable> clearables) {
        super();
    }
}