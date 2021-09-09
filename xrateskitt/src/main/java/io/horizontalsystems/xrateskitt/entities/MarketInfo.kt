package io.horizontalsystems.xrateskit2.entities

import io.horizontalsystems.coinkit2.models.CoinType
import java.math.BigDecimal
import java.util.*

class MarketInfo(
    var coinType: CoinType,
    val currencyCode: String,
    val rate: BigDecimal,
    val rateOpenDay: BigDecimal,
    val rateDiff: BigDecimal,
    val volume: BigDecimal,
    val supply: BigDecimal,
    val rateDiffPeriod: BigDecimal?,
    val timestamp: Long,
    val marketCap: BigDecimal?,
    val athChangePercentage: BigDecimal?,
    val atlChangePercentage: BigDecimal?,
    val totalSupply: BigDecimal?,
    val dilutedMarketCap: BigDecimal?,
    val expirationInterval: Long){

    fun isExpired(): Boolean {
        return Date().time / 1000 - expirationInterval > timestamp
    }
}
