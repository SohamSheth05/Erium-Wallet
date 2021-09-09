package io.horizontalsystems.xrateskit2.entities

import java.math.BigDecimal

data class TokenHolder(
    val address: String,
    val share: BigDecimal
)