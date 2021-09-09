package io.horizontalsystems.xrateskit2.cryptonews

import io.horizontalsystems.xrateskit2.entities.CryptoNews
import io.horizontalsystems.xrateskit2.providers.cryptocompare.CryptoCompareProvider
import io.reactivex.Single

class CryptoNewsManager(private val newsProvider: CryptoCompareProvider) {

    fun getNewsAsync(latestTimestamp: Long?): Single<List<CryptoNews>> {
        return newsProvider.getNewsAsync(latestTimestamp)
    }
}