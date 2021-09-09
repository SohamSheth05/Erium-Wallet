package io.horizontalsystems.xrateskit2.storage

import androidx.room.*
import io.horizontalsystems.xrateskit2.entities.GlobalCoinMarketPoint
import io.horizontalsystems.xrateskit2.entities.GlobalCoinMarketPointInfo
import io.horizontalsystems.xrateskit2.entities.TimePeriod

@Dao
interface GlobalMarketInfoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPointInfo(globalCoinMarketPointInfo: GlobalCoinMarketPointInfo): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPoints(globalCoinMarketPoints: List<GlobalCoinMarketPoint>)

    @Query("DELETE FROM GlobalCoinMarketPointInfo WHERE currencyCode = :currencyCode and timePeriod = :timePeriod")
    fun deletePointInfo(currencyCode: String, timePeriod: TimePeriod)

    @Query("SELECT * FROM GlobalCoinMarketPointInfo WHERE currencyCode = :currencyCode and timePeriod = :timePeriod")
    fun getPointInfo(currencyCode: String, timePeriod: TimePeriod ): GlobalCoinMarketPointInfo?

    @Query("SELECT * FROM GlobalCoinMarketPoint WHERE pointInfoId =:poinInfoId")
    fun getPoints(poinInfoId: Long): List<GlobalCoinMarketPoint>

    @Transaction
    fun insertPointsInfoDetails(globalCoinMarketPointInfo: GlobalCoinMarketPointInfo){
        val id = insertPointInfo(globalCoinMarketPointInfo)
        globalCoinMarketPointInfo.points.forEach{ point ->
            point.pointInfoId = id
        }
        insertPoints(globalCoinMarketPointInfo.points)
    }

}