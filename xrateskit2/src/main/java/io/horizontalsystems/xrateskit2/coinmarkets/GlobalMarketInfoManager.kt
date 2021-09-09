package io.horizontalsystems.xrateskit2.coinmarkets

import io.horizontalsystems.xrateskit2.core.IGlobalCoinMarketProvider
import io.horizontalsystems.xrateskit2.core.IInfoManager
import io.horizontalsystems.xrateskit2.entities.GlobalCoinMarket
import io.horizontalsystems.xrateskit2.entities.GlobalCoinMarketPoint
import io.horizontalsystems.xrateskit2.entities.GlobalCoinMarketPointInfo
import io.horizontalsystems.xrateskit2.entities.TimePeriod
import io.horizontalsystems.xrateskit2.storage.Storage
import io.reactivex.Single

class GlobalMarketInfoManager(
    private val globalMarketsProvider: IGlobalCoinMarketProvider,
    private val storage: Storage
) : IInfoManager {

    private val DATA_LIFETIME_SECONDS = 600 // 6 mins

    fun getGlobalMarketInfo(currencyCode: String, timePeriod: TimePeriod): Single<GlobalCoinMarket> {
        return getGlobalMarketPoints(currencyCode, timePeriod).map {
            GlobalCoinMarket.calculateData(currencyCode, it)
        }
    }

    fun getGlobalMarketPoints(currencyCode: String, timePeriod: TimePeriod): Single<List<GlobalCoinMarketPoint>> {

        val currentTimestamp = System.currentTimeMillis()/1000
        storage.getGlobalMarketPointInfo(currencyCode, timePeriod)?.let { data ->
            if((currentTimestamp - data.timestamp ) <= DATA_LIFETIME_SECONDS )
                return  Single.just(data.points)
            else
                storage.deleteGlobalMarketPointInfo(currencyCode, timePeriod)
        }

        return globalMarketsProvider.getGlobalCoinMarketPointsAsync(currencyCode, timePeriod).map { globalMarketPoints ->

            val pointInfo = GlobalCoinMarketPointInfo(currencyCode = currencyCode, timePeriod = timePeriod, timestamp = currentTimestamp)
            pointInfo.points.addAll(globalMarketPoints)
            storage.saveGlobalMarketPointInfo(pointInfo)

            globalMarketPoints
        }
    }

    override fun destroy() {
        globalMarketsProvider.destroy()
    }
}
