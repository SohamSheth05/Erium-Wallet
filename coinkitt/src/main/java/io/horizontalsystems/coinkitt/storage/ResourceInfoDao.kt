package io.horizontalsystems.coinkit2.storage

import androidx.room.*
import io.horizontalsystems.coinkit2.models.Coin
import io.horizontalsystems.coinkit2.models.ResourceInfo

@Dao
interface ResourceInfoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertResouceInfo(info: ResourceInfo)

    @Query("SELECT * FROM ResourceInfo WHERE id=:resourceName")
    fun getResourceInfo(resourceName: String): ResourceInfo?

}
