package io.horizontalsystems.xrateskit2.entities

import io.horizontalsystems.coinkit2.models.CoinType

data class ChartInfoKey(
    val coinType: CoinType,
    val currency: String,
    val chartType: ChartType
)

