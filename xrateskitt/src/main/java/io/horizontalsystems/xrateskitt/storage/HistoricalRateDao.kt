package io.horizontalsystems.xrateskit2.storage

import androidx.room.*
import io.horizontalsystems.coinkit2.models.CoinType
import io.horizontalsystems.xrateskit2.entities.HistoricalRate

@Dao
interface HistoricalRateDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(rate: HistoricalRate)

    @Delete
    fun delete(rate: HistoricalRate)

    @Query("SELECT * FROM HistoricalRate WHERE coinType = :coinType AND currencyCode = :currency AND timestamp = :timestamp LIMIT 1")
    fun getRate(coinType: CoinType, currency: String, timestamp: Long): HistoricalRate?
}
