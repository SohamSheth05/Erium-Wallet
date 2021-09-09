package io.horizontalsystems.bankwallet.core.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\bR\u0014\u0010\u000f\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0014\u0010\u0017\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0014\u0010\u0019\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0014\u0010\u001b\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR\u001b\u0010\u001d\u001a\u00020\u00068VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u001e\u0010\bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020\u00068VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\u000e\u001a\u0004\b&\u0010\bR\u001b\u0010(\u001a\u00020\u00068VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\u000e\u001a\u0004\b)\u0010\bR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020,0!X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060!X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0014\u00100\u001a\u000201X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001b\u00104\u001a\u00020\u00068VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b6\u0010\u000e\u001a\u0004\b5\u0010\bR\u001b\u00107\u001a\u00020\u00068VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b9\u0010\u000e\u001a\u0004\b8\u0010\bR\u001b\u0010:\u001a\u00020\u00068VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b<\u0010\u000e\u001a\u0004\b;\u0010\bR\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060!8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b>\u0010$R\u0014\u0010?\u001a\u000201X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00103R\u0014\u0010A\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\bR\u0014\u0010C\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\bR\u0014\u0010E\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010\bR\u0014\u0010G\u001a\u00020HX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010J\u00a8\u0006K"}, d2 = {"Lio/horizontalsystems/bankwallet/core/providers/AppConfigProvider;", "Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;", "Lio/horizontalsystems/core/ILanguageConfigProvider;", "Lio/horizontalsystems/core/IBuildConfigProvider;", "()V", "appGithubLink", "", "getAppGithubLink", "()Ljava/lang/String;", "appWebPageLink", "getAppWebPageLink", "bscscanApiKey", "getBscscanApiKey", "bscscanApiKey$delegate", "Lkotlin/Lazy;", "btcCoreRpcUrl", "getBtcCoreRpcUrl", "companyFacebookLink", "getCompanyFacebookLink", "companyLinkedLink", "getCompanyLinkedLink", "companyRedditLink", "getCompanyRedditLink", "companyTelegramLink", "getCompanyTelegramLink", "companyTwitterLink", "getCompanyTwitterLink", "companyWebPageLink", "getCompanyWebPageLink", "cryptoCompareApiKey", "getCryptoCompareApiKey", "cryptoCompareApiKey$delegate", "currencies", "", "Lio/horizontalsystems/core/entities/Currency;", "getCurrencies", "()Ljava/util/List;", "etherscanApiKey", "getEtherscanApiKey", "etherscanApiKey$delegate", "faqUrl", "getFaqUrl", "faqUrl$delegate", "featuredCoinTypes", "Lio/horizontalsystems/coinkit2/models/CoinType;", "getFeaturedCoinTypes", "feeRateAdjustForCurrencies", "getFeeRateAdjustForCurrencies", "fiatDecimal", "", "getFiatDecimal", "()I", "guidesUrl", "getGuidesUrl", "guidesUrl$delegate", "infuraProjectId", "getInfuraProjectId", "infuraProjectId$delegate", "infuraProjectSecret", "getInfuraProjectSecret", "infuraProjectSecret$delegate", "localizations", "getLocalizations", "maxDecimal", "getMaxDecimal", "notificationUrl", "getNotificationUrl", "releaseNotesUrl", "getReleaseNotesUrl", "reportEmail", "getReportEmail", "testMode", "", "getTestMode", "()Z", "app_debug"})
public final class AppConfigProvider implements io.horizontalsystems.bankwallet.core.IAppConfigProvider, io.horizontalsystems.core.ILanguageConfigProvider, io.horizontalsystems.core.IBuildConfigProvider {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String companyWebPageLink = "https://erium.com";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String appWebPageLink = "https://erium.com";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String appGithubLink = "https://github.com/erium";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String reportEmail = "support@dgcusa.com";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String companyTwitterLink = "https://twitter.com/erium";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String companyTelegramLink = "https://t.me/erium";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String companyRedditLink = "https://www.instagram.com/erium/";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String companyFacebookLink = "https://m.facebook.com/erium";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String companyLinkedLink = "https://www.linkedin.com/company/erium";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String btcCoreRpcUrl = "https://btc.horizontalsystems.xyz/rpc";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String notificationUrl = "https://pns-dev.horizontalsystems.xyz/api/v1/pns/";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String releaseNotesUrl = "https://api.github.com/repos/Erium Wallet/Erium Wallet-wallet-android/releases/tags/";
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy cryptoCompareApiKey$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy infuraProjectId$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy infuraProjectSecret$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy etherscanApiKey$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy bscscanApiKey$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy guidesUrl$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy faqUrl$delegate = null;
    private final int fiatDecimal = 2;
    private final int maxDecimal = 8;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> feeRateAdjustForCurrencies = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.core.entities.Currency> currencies = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.coinkit2.models.CoinType> featuredCoinTypes = null;
    private final boolean testMode = io.horizontalsystems.bankwallet.BuildConfig.testMode;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCompanyWebPageLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAppWebPageLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAppGithubLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getReportEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCompanyTwitterLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCompanyTelegramLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCompanyRedditLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCompanyFacebookLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCompanyLinkedLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getBtcCoreRpcUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getNotificationUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getReleaseNotesUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCryptoCompareApiKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getInfuraProjectId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getInfuraProjectSecret() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getEtherscanApiKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getBscscanApiKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getGuidesUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFaqUrl() {
        return null;
    }
    
    @java.lang.Override()
    public int getFiatDecimal() {
        return 0;
    }
    
    @java.lang.Override()
    public int getMaxDecimal() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getFeeRateAdjustForCurrencies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.core.entities.Currency> getCurrencies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.coinkit2.models.CoinType> getFeaturedCoinTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getLocalizations() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getTestMode() {
        return false;
    }
    
    public AppConfigProvider() {
        super();
    }
}