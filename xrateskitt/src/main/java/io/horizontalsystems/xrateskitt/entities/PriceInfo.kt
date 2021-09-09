package io.horizontalsystems.xrateskit2.entities

import java.math.BigDecimal

class PriceInfo(
    val coinCode: String,
    val coinName: String,
    val rate: BigDecimal,
    val diff: BigDecimal
)
