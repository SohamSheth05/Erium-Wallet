package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0012\u0010\u0014\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0012\u0010\u0016\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0012\u0010\u0018\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0005R\u0012\u0010!\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0005R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u001eR\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u001eR\u0012\u0010(\u001a\u00020)X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010+R\u0012\u0010,\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b-\u0010\u0005R\u0012\u0010.\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u0005R\u0012\u00100\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b1\u0010\u0005R\u0012\u00102\u001a\u00020)X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b3\u0010+R\u0012\u00104\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b5\u0010\u0005R\u0012\u00106\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b7\u0010\u0005R\u0012\u00108\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b9\u0010\u0005\u00a8\u0006:"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;", "", "appGithubLink", "", "getAppGithubLink", "()Ljava/lang/String;", "appWebPageLink", "getAppWebPageLink", "bscscanApiKey", "getBscscanApiKey", "btcCoreRpcUrl", "getBtcCoreRpcUrl", "companyFacebookLink", "getCompanyFacebookLink", "companyLinkedLink", "getCompanyLinkedLink", "companyRedditLink", "getCompanyRedditLink", "companyTelegramLink", "getCompanyTelegramLink", "companyTwitterLink", "getCompanyTwitterLink", "companyWebPageLink", "getCompanyWebPageLink", "cryptoCompareApiKey", "getCryptoCompareApiKey", "currencies", "", "Lio/horizontalsystems/core/entities/Currency;", "getCurrencies", "()Ljava/util/List;", "etherscanApiKey", "getEtherscanApiKey", "faqUrl", "getFaqUrl", "featuredCoinTypes", "Lio/horizontalsystems/coinkit2/models/CoinType;", "getFeaturedCoinTypes", "feeRateAdjustForCurrencies", "getFeeRateAdjustForCurrencies", "fiatDecimal", "", "getFiatDecimal", "()I", "guidesUrl", "getGuidesUrl", "infuraProjectId", "getInfuraProjectId", "infuraProjectSecret", "getInfuraProjectSecret", "maxDecimal", "getMaxDecimal", "notificationUrl", "getNotificationUrl", "releaseNotesUrl", "getReleaseNotesUrl", "reportEmail", "getReportEmail", "app_debug"})
public abstract interface IAppConfigProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCompanyWebPageLink();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getAppWebPageLink();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getAppGithubLink();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getReportEmail();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCryptoCompareApiKey();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getInfuraProjectId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getInfuraProjectSecret();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getBtcCoreRpcUrl();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getNotificationUrl();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getReleaseNotesUrl();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getEtherscanApiKey();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getBscscanApiKey();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getGuidesUrl();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getFaqUrl();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCompanyFacebookLink();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCompanyLinkedLink();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCompanyTwitterLink();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCompanyTelegramLink();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCompanyRedditLink();
    
    public abstract int getFiatDecimal();
    
    public abstract int getMaxDecimal();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getFeeRateAdjustForCurrencies();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.core.entities.Currency> getCurrencies();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.coinkit2.models.CoinType> getFeaturedCoinTypes();
}