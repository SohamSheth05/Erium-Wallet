package io.horizontalsystems.xrateskit2.storage

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.horizontalsystems.xrateskit2.entities.ResourceInfo

@Dao
interface ResourceInfoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertResouceInfo(info: ResourceInfo)

    @Query("SELECT * FROM ResourceInfo WHERE id=:resourceName")
    fun getResourceInfo(resourceName: String): ResourceInfo?

}
