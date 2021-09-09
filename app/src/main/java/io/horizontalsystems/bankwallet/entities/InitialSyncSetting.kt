package io.horizontalsystems.bankwallet.entities

import io.horizontalsystems.coinkit2.models.CoinType

data class InitialSyncSetting(
    val coinType: CoinType,
    var syncMode: SyncMode
)
