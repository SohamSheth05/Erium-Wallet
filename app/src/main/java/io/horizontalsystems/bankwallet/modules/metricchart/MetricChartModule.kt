package io.horizontalsystems.bankwallet.modules.metricchart

import android.os.Parcelable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import io.horizontalsystems.bankwallet.R
import io.horizontalsystems.bankwallet.core.App
import io.horizontalsystems.bankwallet.modules.coin.cointvl.CoinTvlFetcher
import io.horizontalsystems.bankwallet.modules.market.marketglobal.MarketGlobalFetcher
import io.horizontalsystems.chartview.ChartData
import io.horizontalsystems.chartview.ChartView
import io.horizontalsystems.coinkit2.models.CoinType
import io.horizontalsystems.xrateskit2.entities.TimePeriod
import io.reactivex.Single
import kotlinx.android.parcel.Parcelize
import java.math.BigDecimal

object MetricChartModule {

    class Factory(private val metricsChartType: MetricChartType?) : ViewModelProvider.Factory {
        
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            val fetcher = when (val type = metricsChartType) {
                is MetricChartType.Coin -> CoinTvlFetcher(App.xRateManager, type.coinType)
                is MetricChartType.MarketGlobal -> MarketGlobalFetcher(App.xRateManager, type.metricsType)
                else -> throw IllegalArgumentException("Expected type of MetricChartType, but got different value")
            }

            val service = MetricChartService(App.currencyManager.baseCurrency, fetcher)
            val factory = MetricChartFactory(App.numberFormatter)

            return MetricChartViewModel(service, fetcher, factory, listOf(service)) as T
        }
    }

    interface IMetricChartFetcher {
        fun fetchSingle(currencyCode: String, timePeriod: TimePeriod): Single<List<Item>>
    }

    interface IMetricChartConfiguration {
        val title: Int
        val description: Int?
        val valueType: ValueType
    }

    data class Item(val value: BigDecimal, val timestamp: Long)

    enum class ValueType {
        Percent, CompactCurrencyValue, CurrencyValue
    }

}


sealed class MetricChartType: Parcelable {
    @Parcelize
    class Coin(val coinType: CoinType) : MetricChartType()
    @Parcelize
    class MarketGlobal(val metricsType: MetricsType) : MetricChartType()
}

data class SelectedPoint(val value: String, val date: String)
data class LastValueWithDiff(val value: String, val diff: BigDecimal?)
data class ChartViewItem(
        val lastValueWithDiff: LastValueWithDiff?,
        val chartData: ChartData?,
        val maxValue: String?,
        val minValue: String?,
        val chartType: ChartView.ChartType
)

@Parcelize
enum class MetricsType: Parcelable  {
    BtcDominance,  Volume24h, DefiCap, TvlInDefi;

    val title: Int
        get() = when (this) {
            BtcDominance -> R.string.MarketGlobalMetrics_BtcDominance
            Volume24h -> R.string.MarketGlobalMetrics_Volume
            DefiCap -> R.string.MarketGlobalMetrics_DefiCap
            TvlInDefi -> R.string.MarketGlobalMetrics_TvlInDefi
        }

    val description: Int
        get() = when (this) {
            BtcDominance -> R.string.MarketGlobalMetrics_BtcDominanceDescription
            Volume24h -> R.string.MarketGlobalMetrics_VolumeDescription
            DefiCap -> R.string.MarketGlobalMetrics_DefiCapDescription
            TvlInDefi -> R.string.MarketGlobalMetrics_TvlInDefiDescription
        }
}
