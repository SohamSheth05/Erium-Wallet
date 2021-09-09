package io.horizontalsystems.xrateskit2.storage

import androidx.room.TypeConverter
import io.horizontalsystems.coinkit2.models.CoinType
import io.horizontalsystems.xrateskit2.entities.ChartType
import io.horizontalsystems.xrateskit2.entities.LinkType
import io.horizontalsystems.xrateskit2.entities.ResourceType
import io.horizontalsystems.xrateskit2.entities.TimePeriod
import java.math.BigDecimal

class DatabaseConverters {

    // BigDecimal

    @TypeConverter
    fun fromString(value: String?): BigDecimal? {
        return value?.let { BigDecimal(it) }
    }

    @TypeConverter
    fun toString(bigDecimal: BigDecimal?): String? {
        return bigDecimal?.toPlainString()
    }

    // CoinType
    @TypeConverter
    fun toString(chartType: CoinType): String {
        return chartType.getCoinId()
    }

    @TypeConverter
    fun toCoinType(value: String): CoinType {
        return CoinType.fromString(value)
    }

    // LinkType
    @TypeConverter
    fun toString(linkType: LinkType): String {
        return linkType.name
    }

    @TypeConverter
    fun toLinkType(value: String): LinkType {
        return LinkType.valueOf(value)
    }


    // ChartType

    @TypeConverter
    fun toString(chartType: ChartType?): String? {
        return chartType?.name
    }

    @TypeConverter
    fun toChartType(string: String?): ChartType? {
        return ChartType.fromString(string)
    }

    @TypeConverter
    fun toString(resourceType: ResourceType): String {
        return resourceType.name
    }

    @TypeConverter
    fun toResourceType(value: String): ResourceType {
        return ResourceType.valueOf(value)
    }

    @TypeConverter
    fun toString(timePeriod: TimePeriod): String {
        return timePeriod.name
    }

    @TypeConverter
    fun toTimePeriod(value: String): TimePeriod {
        return TimePeriod.valueOf(value)
    }

}
