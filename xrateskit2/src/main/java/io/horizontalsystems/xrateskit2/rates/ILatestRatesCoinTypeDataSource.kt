package io.horizontalsystems.xrateskit2.rates

import io.horizontalsystems.coinkit2.models.CoinType

interface ILatestRatesCoinTypeDataSource {
    fun getCoinTypes(currencyCode: String): List<CoinType>
}
