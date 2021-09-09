package io.horizontalsystems.bankwallet.modules.coin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\u0018\u0000 72\u00020\u0001:\u00017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJP\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0018J\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001a2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u001aJ\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u001aJ\u0018\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0018H\u0002J&\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0002JJ\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u001a2\u001e\u00101\u001a\u001a\u0012\u0004\u0012\u00020\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020*02022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0002J\u001e\u00105\u001a\b\u0012\u0004\u0012\u00020.0\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u00106\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/CoinViewFactory;", "", "currency", "Lio/horizontalsystems/core/entities/Currency;", "numberFormatter", "Lio/horizontalsystems/bankwallet/core/IAppNumberFormatter;", "(Lio/horizontalsystems/core/entities/Currency;Lio/horizontalsystems/bankwallet/core/IAppNumberFormatter;)V", "createChartData", "Lio/horizontalsystems/chartview/ChartData;", "chartInfo", "Lio/horizontalsystems/xrateskit2/entities/ChartInfo;", "lastPoint", "Lio/horizontalsystems/bankwallet/modules/coin/LastPoint;", "chartType", "Lio/horizontalsystems/chartview/ChartView$ChartType;", "createChartInfo", "Lio/horizontalsystems/bankwallet/modules/coin/ChartInfoViewItem;", "type", "Lio/horizontalsystems/xrateskit2/entities/ChartType;", "createCoinDetailsViewItem", "Lio/horizontalsystems/bankwallet/modules/coin/CoinDetailsViewItem;", "coinMarket", "Lio/horizontalsystems/xrateskit2/entities/CoinMarketDetails;", "coinCode", "", "rateDiffCoinCodes", "", "rateDiffPeriods", "Lio/horizontalsystems/xrateskit2/entities/TimePeriod;", "contractInfo", "Lio/horizontalsystems/bankwallet/modules/coin/ContractInfo;", "guideUrl", "createCoinInvestorItems", "Lio/horizontalsystems/bankwallet/modules/coin/InvestorItem;", "fundCategories", "Lio/horizontalsystems/xrateskit2/entities/CoinFundCategory;", "createCoinMarketItems", "Lio/horizontalsystems/bankwallet/modules/coin/MarketTickerViewItem;", "tickers", "Lio/horizontalsystems/xrateskit2/entities/MarketTicker;", "formatFiatShortened", "value", "Ljava/math/BigDecimal;", "symbol", "getMarketData", "", "Lio/horizontalsystems/bankwallet/modules/coin/CoinDataItem;", "getRoi", "Lio/horizontalsystems/bankwallet/modules/coin/RoiViewItem;", "rateDiffs", "", "roiCoinCodes", "roiPeriods", "getTvlInfo", "getVolume", "Companion", "app_debug"})
public final class CoinViewFactory {
    private final io.horizontalsystems.core.entities.Currency currency = null;
    private final io.horizontalsystems.bankwallet.core.IAppNumberFormatter numberFormatter = null;
    public static final int SCALE_UP_TO_BILLIONTH = 9;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.coin.CoinViewFactory.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.coin.ChartInfoViewItem createChartInfo(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.ChartType type, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.ChartInfo chartInfo, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.coin.LastPoint lastPoint) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.coin.CoinDetailsViewItem createCoinDetailsViewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.CoinMarketDetails coinMarket, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency, @org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> rateDiffCoinCodes, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.xrateskit2.entities.TimePeriod> rateDiffPeriods, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.coin.ContractInfo contractInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String guideUrl) {
        return null;
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.coin.RoiViewItem> getRoi(java.util.Map<io.horizontalsystems.xrateskit2.entities.TimePeriod, ? extends java.util.Map<java.lang.String, ? extends java.math.BigDecimal>> rateDiffs, java.util.List<java.lang.String> roiCoinCodes, java.util.List<? extends io.horizontalsystems.xrateskit2.entities.TimePeriod> roiPeriods) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVolume(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.xrateskit2.entities.CoinMarketDetails coinMarket) {
        return null;
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.coin.CoinDataItem> getTvlInfo(io.horizontalsystems.xrateskit2.entities.CoinMarketDetails coinMarket, io.horizontalsystems.core.entities.Currency currency) {
        return null;
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.coin.CoinDataItem> getMarketData(io.horizontalsystems.xrateskit2.entities.CoinMarketDetails coinMarket, io.horizontalsystems.core.entities.Currency currency, java.lang.String coinCode) {
        return null;
    }
    
    private final io.horizontalsystems.chartview.ChartData createChartData(io.horizontalsystems.xrateskit2.entities.ChartInfo chartInfo, io.horizontalsystems.bankwallet.modules.coin.LastPoint lastPoint, io.horizontalsystems.chartview.ChartView.ChartType chartType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.coin.MarketTickerViewItem> createCoinMarketItems(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.xrateskit2.entities.MarketTicker> tickers) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.coin.InvestorItem> createCoinInvestorItems(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.xrateskit2.entities.CoinFundCategory> fundCategories) {
        return null;
    }
    
    private final java.lang.String formatFiatShortened(java.math.BigDecimal value, java.lang.String symbol) {
        return null;
    }
    
    public CoinViewFactory(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAppNumberFormatter numberFormatter) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/CoinViewFactory$Companion;", "", "()V", "SCALE_UP_TO_BILLIONTH", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}