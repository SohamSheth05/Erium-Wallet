package io.horizontalsystems.xrateskit2.coins.provider

import io.horizontalsystems.xrateskit2.entities.ProviderCoinsResource
import io.horizontalsystems.xrateskit2.entities.ResourceInfo
import io.horizontalsystems.xrateskit2.utils.OkHttpUtils

class DataProviderCoinExternalIdsRemote(private val path: String) :
    DataProvider<ProviderCoinsResource> {

    override fun getDataNewerThan(resourceInfo: ResourceInfo?): Data<ProviderCoinsResource>? {
        val response = OkHttpUtils.get(path, resourceInfo?.versionId)

        return when (response.code) {
            200 -> response.body?.byteStream()?.use {
                val etag = response.header("etag") ?: ""
                Data(etag, ProviderCoinsResource.parseFile(false, it))
            }
            else -> null
        }
    }

}
