package io.horizontalsystems.xrateskit2.coinmarkets

import io.horizontalsystems.coinkit2.models.CoinType
import io.horizontalsystems.xrateskit2.core.IInfoManager
import io.horizontalsystems.xrateskit2.core.ITokenInfoProvider
import io.horizontalsystems.xrateskit2.entities.TokenHolder
import io.reactivex.Single

class TokenInfoManager(
    private val tokenInfoProvider: ITokenInfoProvider
) : IInfoManager {

    fun getTopTokenHoldersAsync(coinType: CoinType, itemsCount: Int): Single<List<TokenHolder>> {
        return tokenInfoProvider.getTopTokenHoldersAsync(coinType, itemsCount)
    }

    override fun destroy() {}
}
