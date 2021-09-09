package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010t\u001a\u00020uH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\u0010X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u0016X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u0016X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010!\u001a\u0004\u0018\u00010\u0016X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001a\u0010$\u001a\u0004\u0018\u00010\u0016X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010\'\u001a\u0004\u0018\u00010\u0016X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR\u001a\u0010*\u001a\u0004\u0018\u00010\u0016X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001a\u0010-\u001a\u0004\u0018\u00010.X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u0004\u0018\u00010\u0016X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u0010\u001aR\u001e\u00106\u001a\b\u0012\u0004\u0012\u0002070\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b8\u0010\f\"\u0004\b9\u0010\u000eR\u0018\u0010:\u001a\u00020;X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u0004\u0018\u00010\u0016X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bA\u0010\u0018\"\u0004\bB\u0010\u001aR\u0018\u0010C\u001a\u00020\u0010X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bD\u0010\u0012\"\u0004\bE\u0010\u0014R\u0018\u0010F\u001a\u00020\u0010X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bF\u0010\u0012\"\u0004\bG\u0010\u0014R\u0018\u0010H\u001a\u00020\u0010X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bH\u0010\u0012\"\u0004\bI\u0010\u0014R\u0018\u0010J\u001a\u00020\u0010X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bK\u0010\u0012\"\u0004\bL\u0010\u0014R\u001a\u0010M\u001a\u0004\u0018\u00010\u0016X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bN\u0010\u0018\"\u0004\bO\u0010\u001aR\u0018\u0010P\u001a\u00020QX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0018\u0010V\u001a\u00020QX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bW\u0010S\"\u0004\bX\u0010UR\u001a\u0010Y\u001a\u0004\u0018\u00010ZX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0018\u0010_\u001a\u00020`X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001a\u0010e\u001a\u0004\u0018\u00010fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0018\u0010k\u001a\u00020\u0010X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bl\u0010\u0012\"\u0004\bm\u0010\u0014R\u0018\u0010n\u001a\u00020oX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bp\u0010q\"\u0004\br\u0010s\u00a8\u0006v"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "", "appLaunchCount", "", "getAppLaunchCount", "()I", "setAppLaunchCount", "(I)V", "appVersions", "", "Lio/horizontalsystems/core/entities/AppVersion;", "getAppVersions", "()Ljava/util/List;", "setAppVersions", "(Ljava/util/List;)V", "balanceHidden", "", "getBalanceHidden", "()Z", "setBalanceHidden", "(Z)V", "baseBinanceProvider", "", "getBaseBinanceProvider", "()Ljava/lang/String;", "setBaseBinanceProvider", "(Ljava/lang/String;)V", "baseBitcoinProvider", "getBaseBitcoinProvider", "setBaseBitcoinProvider", "baseCurrencyCode", "getBaseCurrencyCode", "setBaseCurrencyCode", "baseDashProvider", "getBaseDashProvider", "setBaseDashProvider", "baseEthereumProvider", "getBaseEthereumProvider", "setBaseEthereumProvider", "baseLitecoinProvider", "getBaseLitecoinProvider", "setBaseLitecoinProvider", "baseZcashProvider", "getBaseZcashProvider", "setBaseZcashProvider", "bitcoinDerivation", "Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;", "getBitcoinDerivation", "()Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;", "setBitcoinDerivation", "(Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;)V", "changelogShownForAppVersion", "getChangelogShownForAppVersion", "setChangelogShownForAppVersion", "checkedTerms", "Lio/horizontalsystems/bankwallet/core/managers/Term;", "getCheckedTerms", "setCheckedTerms", "currentTheme", "Lio/horizontalsystems/bankwallet/modules/settings/theme/ThemeType;", "getCurrentTheme", "()Lio/horizontalsystems/bankwallet/modules/settings/theme/ThemeType;", "setCurrentTheme", "(Lio/horizontalsystems/bankwallet/modules/settings/theme/ThemeType;)V", "encryptedSampleText", "getEncryptedSampleText", "setEncryptedSampleText", "ignoreRootedDeviceWarning", "getIgnoreRootedDeviceWarning", "setIgnoreRootedDeviceWarning", "isAlertNotificationOn", "setAlertNotificationOn", "isLockTimeEnabled", "setLockTimeEnabled", "mainShowedOnce", "getMainShowedOnce", "setMainShowedOnce", "notificationId", "getNotificationId", "setNotificationId", "notificationServerTime", "", "getNotificationServerTime", "()J", "setNotificationServerTime", "(J)V", "rateAppLastRequestTime", "getRateAppLastRequestTime", "setRateAppLastRequestTime", "sendInputType", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;", "getSendInputType", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;", "setSendInputType", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;)V", "sortType", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceSortType;", "getSortType", "()Lio/horizontalsystems/bankwallet/modules/balance/BalanceSortType;", "setSortType", "(Lio/horizontalsystems/bankwallet/modules/balance/BalanceSortType;)V", "syncMode", "Lio/horizontalsystems/bankwallet/entities/SyncMode;", "getSyncMode", "()Lio/horizontalsystems/bankwallet/entities/SyncMode;", "setSyncMode", "(Lio/horizontalsystems/bankwallet/entities/SyncMode;)V", "torEnabled", "getTorEnabled", "setTorEnabled", "transactionSortingType", "Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;", "getTransactionSortingType", "()Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;", "setTransactionSortingType", "(Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;)V", "clear", "", "app_debug"})
public abstract interface ILocalStorage {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.modules.send.SendModule.InputType getSendInputType();
    
    public abstract void setSendInputType(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.SendModule.InputType p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getBaseCurrencyCode();
    
    public abstract void setBaseCurrencyCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getBaseBitcoinProvider();
    
    public abstract void setBaseBitcoinProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getBaseLitecoinProvider();
    
    public abstract void setBaseLitecoinProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getBaseEthereumProvider();
    
    public abstract void setBaseEthereumProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getBaseDashProvider();
    
    public abstract void setBaseDashProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getBaseBinanceProvider();
    
    public abstract void setBaseBinanceProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getBaseZcashProvider();
    
    public abstract void setBaseZcashProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.entities.SyncMode getSyncMode();
    
    public abstract void setSyncMode(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.SyncMode p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bankwallet.modules.balance.BalanceSortType getSortType();
    
    public abstract void setSortType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceSortType p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.core.entities.AppVersion> getAppVersions();
    
    public abstract void setAppVersions(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.core.entities.AppVersion> p0);
    
    public abstract boolean isAlertNotificationOn();
    
    public abstract void setAlertNotificationOn(boolean p0);
    
    public abstract boolean isLockTimeEnabled();
    
    public abstract void setLockTimeEnabled(boolean p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getEncryptedSampleText();
    
    public abstract void setEncryptedSampleText(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.entities.AccountType.Derivation getBitcoinDerivation();
    
    public abstract void setBitcoinDerivation(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.AccountType.Derivation p0);
    
    public abstract boolean getTorEnabled();
    
    public abstract void setTorEnabled(boolean p0);
    
    public abstract int getAppLaunchCount();
    
    public abstract void setAppLaunchCount(int p0);
    
    public abstract long getRateAppLastRequestTime();
    
    public abstract void setRateAppLastRequestTime(long p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bankwallet.entities.TransactionDataSortingType getTransactionSortingType();
    
    public abstract void setTransactionSortingType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionDataSortingType p0);
    
    public abstract boolean getBalanceHidden();
    
    public abstract void setBalanceHidden(boolean p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bankwallet.core.managers.Term> getCheckedTerms();
    
    public abstract void setCheckedTerms(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.core.managers.Term> p0);
    
    public abstract boolean getMainShowedOnce();
    
    public abstract void setMainShowedOnce(boolean p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getNotificationId();
    
    public abstract void setNotificationId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    public abstract long getNotificationServerTime();
    
    public abstract void setNotificationServerTime(long p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bankwallet.modules.settings.theme.ThemeType getCurrentTheme();
    
    public abstract void setCurrentTheme(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.theme.ThemeType p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getChangelogShownForAppVersion();
    
    public abstract void setChangelogShownForAppVersion(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    public abstract boolean getIgnoreRootedDeviceWarning();
    
    public abstract void setIgnoreRootedDeviceWarning(boolean p0);
    
    public abstract void clear();
}