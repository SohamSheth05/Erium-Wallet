package io.horizontalsystems.xrateskit2.rates

import io.horizontalsystems.coinkit2.models.CoinType
import io.horizontalsystems.xrateskit2.core.ILatestRateProvider
import io.horizontalsystems.xrateskit2.entities.LatestRateEntity
import io.horizontalsystems.xrateskit2.scheduler.ISchedulerProvider
import io.reactivex.Single

class LatestRatesSchedulerProvider(
    private val manager: LatestRatesManager,
    private val provider: ILatestRateProvider,
    private val currencyCode: String,
    override val expirationInterval: Long,
    override val retryInterval: Long
) : ISchedulerProvider {

    private val coinTypes: List<CoinType>
        get() = dataSource?.getCoinTypes(currencyCode) ?: listOf()

    var dataSource: ILatestRatesCoinTypeDataSource? = null

    override val id = "LatestRateProvider"

    override val lastSyncTimestamp: Long?
        get() = manager.getLastSyncTimestamp(coinTypes, currencyCode)

    override val syncSingle: Single<Unit>
        get() = provider.getLatestRatesAsync(coinTypes, currencyCode)
                .doOnSuccess { rates ->
                    update(rates)
                }
                .map { Unit }

    override fun notifyExpired() {
        manager.notifyExpired(coinTypes, currencyCode)
    }

    private fun update(list: List<LatestRateEntity>) {
        manager.update(list, currencyCode)
    }
}
