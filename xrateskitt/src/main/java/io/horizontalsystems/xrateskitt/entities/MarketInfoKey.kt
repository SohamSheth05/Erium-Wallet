package io.horizontalsystems.xrateskit2.entities

import io.horizontalsystems.coinkit2.models.CoinType

data class MarketInfoKey(
        val coinType: CoinType,
        val currency: String
)

