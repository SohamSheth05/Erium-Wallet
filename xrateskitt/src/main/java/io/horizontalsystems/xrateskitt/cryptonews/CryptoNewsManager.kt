package io.horizontalsystems.xrateskit2.cryptonews

import io.horizontalsystems.xrateskit2.providers.cryptocompare.CryptoCompareProvider
import io.horizontalsystems.xrateskit2.entities.CryptoNews
import io.reactivex.Single
import java.sql.Timestamp
import java.util.*
import java.util.concurrent.ConcurrentHashMap

class CryptoNewsManager(private val newsProvider: CryptoCompareProvider) {

    fun getNewsAsync(latestTimestamp: Long?): Single<List<CryptoNews>> {
        return newsProvider.getNewsAsync(latestTimestamp)
    }
}