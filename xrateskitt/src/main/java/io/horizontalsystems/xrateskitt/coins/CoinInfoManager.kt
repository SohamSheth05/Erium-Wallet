package io.horizontalsystems.xrateskit2.coins

import io.horizontalsystems.coinkit2.models.CoinType
import io.horizontalsystems.xrateskit2.coins.provider.CoinInfoSyncer
import io.horizontalsystems.xrateskit2.core.IStorage
import io.horizontalsystems.xrateskit2.entities.*
import io.reactivex.Single

class CoinInfoManager(
    private val storage: IStorage,
    private val coinInfoSyncer: CoinInfoSyncer
) {

    fun sync(): Single<Unit> {
        return Single.create { emitter ->
            coinInfoSyncer.sync()
            emitter.onSuccess(Unit)
        }
    }

    fun getCoinInfoDescription(coinType: CoinType): String? {
        return storage.getCoinInfo(coinType)?.description
    }

    fun getCoinRating(coinType: CoinType): String? {
        return storage.getCoinInfo(coinType)?.rating
    }

    fun getExchangeInfo(exchagenId: String): ExchangeInfoEntity? {
        return storage.getExchangeInfo(exchagenId)
    }

    fun getCoinCategories(coinType: CoinType): List<CoinCategory> {
        return storage.getCoinInfo(coinType)?.let {
            storage.getCoinCategories(it.coinType)
        } ?: emptyList()
    }

    fun getCoinFundCategories(coinType: CoinType): List<CoinFundCategory> {

        return storage.getCoinInfo(coinType)?.let {
            val funds = storage.getCoinFunds(it.coinType)
            val categories = storage.getCoinFundCategories(funds.map { it.categoryId })

            categories.forEach {  category ->
                category.funds.addAll(funds.filter { it.categoryId.contentEquals(category.id) })
            }
            categories
        } ?: emptyList()
    }

    fun getCoinCodesByCategory(categoryId: String): List<CoinType> {
        val coinInfoEntity = storage.getCoinInfosByCategory(categoryId)
        return coinInfoEntity.map { it.coinType }
    }

    fun getCoinRatingsAsync(): Single<Map<CoinType, String>> =
        Single.create { emitter ->
            try {
                val coinRatingsMap = mutableMapOf<CoinType, String>()

                storage.getCoinInfos().forEach { coin ->
                    coin.rating?.let {
                        if (it.isNotEmpty()) {
                            coinRatingsMap[coin.coinType] = it
                        }
                    }
                }
                emitter.onSuccess(coinRatingsMap)
            } catch (error: Throwable) {
                emitter.onError(error)
            }
        }

    fun getLinks(coinType: CoinType, linksByProvider: Map<LinkType, String>): Map<LinkType, String> {
        val links = mutableMapOf<LinkType, String>()
        val linksStored = storage.getCoinLinks(coinType).map { it.linkType to it.link }.toMap()

        LinkType.values().forEach { linkType ->
            val ls = linksStored[linkType]
            val lp = linksByProvider[linkType]

            val link =
                if(ls != null && ! ls.isNullOrEmpty()) ls
                else if(lp!=null && !lp.isNullOrEmpty()) lp
                else null

            link?.let{
                links.put(linkType, link)
            }
        }

        return links
    }
}