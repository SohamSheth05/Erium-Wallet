package io.horizontalsystems.bankwallet.modules.receive.viewitems

import io.horizontalsystems.coinkit2.models.Coin

data class AddressItem(var address: String, var addressType: String?,  var coin: Coin)
