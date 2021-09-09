package io.horizontalsystems.xrateskit2.entities

import java.math.BigDecimal

data class ChartPoint(val value: BigDecimal, val volume: BigDecimal?, val timestamp: Long)
