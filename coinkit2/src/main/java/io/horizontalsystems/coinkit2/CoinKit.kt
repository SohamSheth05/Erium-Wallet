package io.horizontalsystems.coinkit2

import android.content.Context
import io.horizontalsystems.coinkit2.models.Coin
import io.horizontalsystems.coinkit2.models.CoinType
import io.horizontalsystems.coinkit2.providers.CoinManager
import io.horizontalsystems.coinkit2.providers.CoinProvider
import io.horizontalsystems.coinkit2.storage.Database
import io.horizontalsystems.coinkit2.storage.Storage

class CoinKit(private val coinManager: CoinManager) {

    fun getCoins(): List<Coin> {
        return coinManager.getCoins()
    }

    fun getDefaultCoins(): List<Coin> {
        return coinManager.getDefaultCoins()
    }

    fun getCoin(id: String): Coin? {
        return coinManager.getCoin(id)
    }

    fun getCoin(type: CoinType): Coin? {
        return coinManager.getCoin(type.getCoinId())
    }

    fun saveCoins(coins: List<Coin>) {
        return coinManager.saveCoins(coins)
    }

    companion object {

        fun create(context: Context, isTestnet: Boolean = false): CoinKit {
            val storage = Storage(Database.create(context))
            val coinProvider = CoinProvider(context, isTestnet)
            val coinManager = CoinManager(coinProvider, storage)

            return CoinKit(coinManager)
        }
    }
}