package io.horizontalsystems.bankwallet.core.providers

import io.horizontalsystems.bankwallet.BuildConfig
import io.horizontalsystems.bankwallet.R
import io.horizontalsystems.bankwallet.core.IAppConfigProvider
import io.horizontalsystems.coinkit2.models.CoinType
import io.horizontalsystems.core.IBuildConfigProvider
import io.horizontalsystems.core.ILanguageConfigProvider
import io.horizontalsystems.core.entities.Currency

class AppConfigProvider : IAppConfigProvider, ILanguageConfigProvider, IBuildConfigProvider {

    override val companyWebPageLink: String = "https://erium.com"
    override val appWebPageLink: String = "https://erium.com"
    override val appGithubLink: String = "https://github.com/erium"
    override val reportEmail = "support@dgcusa.com"
    override val companyTwitterLink: String = "https://twitter.com/erium"
    override val companyTelegramLink: String = "https://t.me/erium"
    override val companyRedditLink: String = "https://www.instagram.com/erium/"
    override val companyFacebookLink: String = "https://m.facebook.com/erium"
    override val companyLinkedLink: String = "https://www.linkedin.com/company/erium"
    override val btcCoreRpcUrl: String = "https://btc.horizontalsystems.xyz/rpc"
    override val notificationUrl: String = "https://pns-dev.horizontalsystems.xyz/api/v1/pns/"
    override val releaseNotesUrl: String =
        "https://api.github.com/repos/Erium Wallet/Erium Wallet-wallet-android/releases/tags/"

    override val cryptoCompareApiKey by lazy {
        Translator.getString(R.string.cryptoCompareApiKey)
    }
    override val infuraProjectId by lazy {
        Translator.getString(R.string.infuraProjectId)
    }
    override val infuraProjectSecret by lazy {
        Translator.getString(R.string.infuraSecretKey)
    }
    override val etherscanApiKey by lazy {
        Translator.getString(R.string.etherscanKey)
    }
    override val bscscanApiKey by lazy {
        Translator.getString(R.string.bscscanKey)
    }
    override val guidesUrl by lazy {
        Translator.getString(R.string.guidesUrl)
    }
    override val faqUrl by lazy {
        Translator.getString(R.string.faqUrl)
    }

    override val fiatDecimal: Int = 2
    override val maxDecimal: Int = 8
    override val feeRateAdjustForCurrencies: List<String> = listOf("USD", "EUR")

    override val currencies: List<Currency> = listOf(
        Currency("AUD", "A$", 2),
        Currency("BRL", "R$", 2),
        Currency("CAD", "C$", 2),
        Currency("CHF", "₣", 2),
        Currency("CNY", "¥", 2),
        Currency("EUR", "€", 2),
        Currency("GBP", "£", 2),
        Currency("HKD", "HK$", 2),
        Currency("ILS", "₪", 2),
        Currency("JPY", "¥", 2),
        Currency("RUB", "₽", 2),
        Currency("SGD", "S$", 2),
        Currency("USD", "$", 2),
    )
    override val featuredCoinTypes: List<CoinType> = listOf(
        CoinType.Dgc,
        //CoinType.Dsc,
        //CoinType.Dpc,
        //CoinType.Bitcoin,
        //CoinType.BitcoinCash,
        //CoinType.Ethereum,
        //CoinType.Zcash,
        //CoinType.BinanceSmartChain
    )

    //  ILanguageConfigProvider

    override val localizations: List<String>
        get() {
            val coinsString = "de,en,es,fa,fr,ko,ru,tr,zh"
            return coinsString.split(",")
        }

    //  IBuildConfigProvider

    override val testMode: Boolean = BuildConfig.testMode

}
