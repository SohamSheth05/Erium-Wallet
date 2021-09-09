package io.horizontalsystems.coinkit2.storage

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.horizontalsystems.coinkit2.models.ResourceInfo

@Dao
interface ResourceInfoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertResouceInfo(info: ResourceInfo)

    @Query("SELECT * FROM ResourceInfo WHERE id=:resourceName")
    fun getResourceInfo(resourceName: String): ResourceInfo?

}
