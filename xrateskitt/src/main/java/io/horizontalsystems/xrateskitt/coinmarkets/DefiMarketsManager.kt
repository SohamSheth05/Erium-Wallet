package io.horizontalsystems.xrateskit2.coinmarkets

import io.horizontalsystems.coinkit2.models.CoinType
import io.horizontalsystems.xrateskit2.core.IDefiMarketsProvider
import io.horizontalsystems.xrateskit2.core.IInfoManager
import io.horizontalsystems.xrateskit2.entities.CoinMarket
import io.horizontalsystems.xrateskit2.entities.DefiTvl
import io.horizontalsystems.xrateskit2.entities.DefiTvlPoint
import io.horizontalsystems.xrateskit2.entities.TimePeriod
import io.horizontalsystems.xrateskit2.providers.coingecko.CoinGeckoProvider
import io.reactivex.Single

class DefiMarketsManager(
    private val coinGeckoProvider: CoinGeckoProvider,
    private val defiMarketsProvider: IDefiMarketsProvider
) : IInfoManager {

    fun getTopDefiMarketsAsync(currency: String, fetchDiffPeriod: TimePeriod, itemsCount: Int): Single<List<CoinMarket>> {
        return coinGeckoProvider.getTopCoinMarketsAsync(currency, fetchDiffPeriod, itemsCount, true)
    }

    fun getTopDefiTvlAsync(currency: String, fetchDiffPeriod: TimePeriod, itemsCount: Int): Single<List<DefiTvl>> {
        return defiMarketsProvider.getTopDefiTvlAsync(currency, fetchDiffPeriod, itemsCount)
    }

    fun getDefiTvlPointsAsync(coinType: CoinType, currency: String, fetchDiffPeriod: TimePeriod): Single<List<DefiTvlPoint>> {
        return defiMarketsProvider.getDefiTvlPointsAsync(coinType, currency, fetchDiffPeriod)
    }

    fun getDefiTvlAsync(coinType: CoinType, currency: String): Single<DefiTvl> {
        return defiMarketsProvider.getDefiTvlAsync(coinType, currency)
    }

    override fun destroy() {
        defiMarketsProvider.destroy()
    }
}
