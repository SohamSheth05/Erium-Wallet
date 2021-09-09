package io.horizontalsystems.xrateskit2.rates

import io.horizontalsystems.coinkit2.models.CoinType
import io.horizontalsystems.xrateskit2.core.IHistoricalRateProvider
import io.horizontalsystems.xrateskit2.core.IStorage
import io.reactivex.Single
import java.math.BigDecimal

class HistoricalRateManager(private val storage: IStorage, private val rateProvider: IHistoricalRateProvider) {

    fun getHistoricalRate(coinType: CoinType, currency: String, timestamp: Long): BigDecimal? {
        return storage.getHistoricalRate(coinType, currency, timestamp)?.value
    }

    fun getHistoricalRateAsync(coinType: CoinType, currency: String, timestamp: Long): Single<BigDecimal> {
        return rateProvider
                .getHistoricalRateAsync(coinType, currency, timestamp)
                .doOnSuccess {
                    storage.saveHistoricalRate(it)
                }
                .map {
                    it.value
                }
    }
}
