package io.horizontalsystems.xrateskit2.coins.provider

import io.horizontalsystems.xrateskit2.entities.ProviderCoinsResource
import io.horizontalsystems.xrateskit2.entities.ResourceInfo
import io.horizontalsystems.xrateskit2.entities.ResourceType
import io.horizontalsystems.xrateskit2.storage.Storage

class CoinExternalIdsSyncer(
    private val dataProvider: DataProvider<ProviderCoinsResource>,
    private val storage: Storage
) {
    fun sync() {
        val resourceInfo = storage.getResourceInfo(ResourceType.PROVIDER_COINS)

        dataProvider.getDataNewerThan(resourceInfo)?.let {
            storage.saveProviderCoins(it.value.providerCoins)
            storage.saveResourceInfo(ResourceInfo(ResourceType.PROVIDER_COINS, it.versionId))
        }
    }

}
