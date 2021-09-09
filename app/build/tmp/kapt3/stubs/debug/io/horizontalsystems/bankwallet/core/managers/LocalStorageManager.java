package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\n\u0010\u00cc\u0001\u001a\u00030\u00cd\u0001H\u0016J\n\u0010\u00ce\u0001\u001a\u00030\u00cd\u0001H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R$\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020.8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0002042\u0006\u0010-\u001a\u0002048V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R0\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020;0:8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010B\u001a\u00020A2\u0006\u0010-\u001a\u00020A8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR(\u0010G\u001a\u0004\u0018\u00010\n2\b\u0010-\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR(\u0010L\u001a\u0004\u0018\u00010\n2\b\u0010-\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bM\u0010I\"\u0004\bN\u0010KR(\u0010O\u001a\u0004\u0018\u00010\n2\b\u0010-\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bP\u0010I\"\u0004\bQ\u0010KR(\u0010R\u001a\u0004\u0018\u00010\n2\b\u0010-\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bS\u0010I\"\u0004\bT\u0010KR(\u0010U\u001a\u0004\u0018\u00010\n2\b\u0010-\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bV\u0010I\"\u0004\bW\u0010KR(\u0010X\u001a\u0004\u0018\u00010\n2\b\u0010-\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bY\u0010I\"\u0004\bZ\u0010KR(\u0010[\u001a\u0004\u0018\u00010\n2\b\u0010-\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\\\u0010I\"\u0004\b]\u0010KR$\u0010^\u001a\u00020A2\u0006\u0010-\u001a\u00020A8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b_\u0010D\"\u0004\b`\u0010FR(\u0010c\u001a\u0004\u0018\u00010b2\b\u0010a\u001a\u0004\u0018\u00010b8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR(\u0010h\u001a\u0004\u0018\u00010\n2\b\u0010-\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bi\u0010I\"\u0004\bj\u0010KR(\u0010m\u001a\u0004\u0018\u00010l2\b\u0010k\u001a\u0004\u0018\u00010l8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR0\u0010s\u001a\b\u0012\u0004\u0012\u00020r0:2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020r0:8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bt\u0010>\"\u0004\bu\u0010@R(\u0010w\u001a\u0004\u0018\u00010v2\b\u0010-\u001a\u0004\u0018\u00010v8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\'\u0010~\u001a\u00020}2\u0006\u0010|\u001a\u00020}8V@VX\u0096\u000e\u00a2\u0006\u000f\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R,\u0010\u0084\u0001\u001a\u0004\u0018\u00010\n2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0085\u0001\u0010I\"\u0005\b\u0086\u0001\u0010KR-\u0010\u0087\u0001\u001a\u0004\u0018\u0001042\b\u0010-\u001a\u0004\u0018\u0001048V@VX\u0096\u000e\u00a2\u0006\u0010\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R!\u0010\u008c\u0001\u001a\u00030\u008d\u00018FX\u0086\u0084\u0002\u00a2\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\'\u0010\u0092\u0001\u001a\u00020A2\u0006\u0010-\u001a\u00020A8V@VX\u0096\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0093\u0001\u0010D\"\u0005\b\u0094\u0001\u0010FR(\u0010\u0096\u0001\u001a\u00020A2\u0007\u0010\u0095\u0001\u001a\u00020A8V@VX\u0096\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0096\u0001\u0010D\"\u0005\b\u0097\u0001\u0010FR(\u0010\u0098\u0001\u001a\u00020A2\u0007\u0010\u0095\u0001\u001a\u00020A8V@VX\u0096\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0098\u0001\u0010D\"\u0005\b\u0099\u0001\u0010FR(\u0010\u009a\u0001\u001a\u00020A2\u0007\u0010\u0095\u0001\u001a\u00020A8V@VX\u0096\u000e\u00a2\u0006\u000e\u001a\u0005\b\u009a\u0001\u0010D\"\u0005\b\u009b\u0001\u0010FR-\u0010\u009c\u0001\u001a\u0004\u0018\u00010.2\b\u0010-\u001a\u0004\u0018\u00010.8V@VX\u0096\u000e\u00a2\u0006\u0010\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010\u00a0\u0001R\'\u0010\u00a1\u0001\u001a\u00020A2\u0006\u0010-\u001a\u00020A8V@VX\u0096\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a2\u0001\u0010D\"\u0005\b\u00a3\u0001\u0010FR+\u0010\u00a4\u0001\u001a\u0004\u0018\u00010\n2\b\u0010-\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a5\u0001\u0010I\"\u0005\b\u00a6\u0001\u0010KR\'\u0010\u00a7\u0001\u001a\u00020.2\u0006\u0010-\u001a\u00020.8V@VX\u0096\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a8\u0001\u00101\"\u0005\b\u00a9\u0001\u00103R+\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\n2\b\u0010-\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ab\u0001\u0010I\"\u0005\b\u00ac\u0001\u0010KR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u00ad\u0001\u001a\u00020.2\u0006\u0010-\u001a\u00020.8V@VX\u0096\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ae\u0001\u00101\"\u0005\b\u00af\u0001\u00103R/\u0010\u00b1\u0001\u001a\u0005\u0018\u00010\u00b0\u00012\t\u0010-\u001a\u0005\u0018\u00010\u00b0\u00018V@VX\u0096\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00b2\u0001\u0010\u00b3\u0001\"\u0006\b\u00b4\u0001\u0010\u00b5\u0001R,\u0010\u00b6\u0001\u001a\u00030\u00b7\u00012\b\u0010\u00b6\u0001\u001a\u00030\u00b7\u00018V@VX\u0096\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00b8\u0001\u0010\u00b9\u0001\"\u0006\b\u00ba\u0001\u0010\u00bb\u0001R0\u0010\u00bc\u0001\u001a\u0005\u0018\u00010\u00bd\u00012\n\u0010\u00bc\u0001\u001a\u0005\u0018\u00010\u00bd\u00018V@VX\u0096\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00be\u0001\u0010\u00bf\u0001\"\u0006\b\u00c0\u0001\u0010\u00c1\u0001R(\u0010\u00c2\u0001\u001a\u00020A2\u0007\u0010\u0095\u0001\u001a\u00020A8V@WX\u0096\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c3\u0001\u0010D\"\u0005\b\u00c4\u0001\u0010FR,\u0010\u00c7\u0001\u001a\u00030\u00c6\u00012\b\u0010\u00c5\u0001\u001a\u00030\u00c6\u00018V@VX\u0096\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00c8\u0001\u0010\u00c9\u0001\"\u0006\b\u00ca\u0001\u0010\u00cb\u0001\u00a8\u0006\u00cf\u0001"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/LocalStorageManager;", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "Lio/horizontalsystems/core/IPinStorage;", "Lio/horizontalsystems/bankwallet/core/IChartTypeStorage;", "Lio/horizontalsystems/core/IThirdKeyboard;", "Lio/horizontalsystems/bankwallet/core/IMarketStorage;", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "ALERT_NOTIFICATION_ENABLED", "", "APP_LAST_VISIT_TIME", "APP_LAUNCH_COUNT", "APP_VERSIONS", "BALANCE_HIDDEN", "BASE_BINANCE_PROVIDER", "BASE_BITCOIN_PROVIDER", "BASE_CURRENCY_CODE", "BASE_DASH_PROVIDER", "BASE_ETHEREUM_PROVIDER", "BASE_LITECOIN_PROVIDER", "BASE_ZCASH_PROVIDER", "BIOMETRIC_ENABLED", "BITCOIN_DERIVATION", "CHANGELOG_SHOWN_FOR_APP_VERSION", "CHART_TYPE", "CHECKED_TERMS", "CURRENT_THEME", "ENCRYPTION_CHECKER_TEXT", "FAILED_ATTEMPTS", "IGNORE_ROOTED_DEVICE_WARNING", "LOCKOUT_TIMESTAMP", "LOCK_TIME_ENABLED", "MAIN_SHOWED_ONCE", "MARKET_CURRENT_CATEGORY", "NOTIFICATION_ID", "NOTIFICATION_SERVER_TIME", "PIN", "RATE_APP_LAST_REQ_TIME", "SEND_INPUT_TYPE", "SORT_TYPE", "SYNC_MODE", "THIRD_KEYBOARD_WARNING_MSG", "TOR_ENABLED", "TRANSACTION_DATA_SORTING_TYPE", "value", "", "appLastVisitTime", "getAppLastVisitTime", "()J", "setAppLastVisitTime", "(J)V", "", "appLaunchCount", "getAppLaunchCount", "()I", "setAppLaunchCount", "(I)V", "", "Lio/horizontalsystems/core/entities/AppVersion;", "appVersions", "getAppVersions", "()Ljava/util/List;", "setAppVersions", "(Ljava/util/List;)V", "", "balanceHidden", "getBalanceHidden", "()Z", "setBalanceHidden", "(Z)V", "baseBinanceProvider", "getBaseBinanceProvider", "()Ljava/lang/String;", "setBaseBinanceProvider", "(Ljava/lang/String;)V", "baseBitcoinProvider", "getBaseBitcoinProvider", "setBaseBitcoinProvider", "baseCurrencyCode", "getBaseCurrencyCode", "setBaseCurrencyCode", "baseDashProvider", "getBaseDashProvider", "setBaseDashProvider", "baseEthereumProvider", "getBaseEthereumProvider", "setBaseEthereumProvider", "baseLitecoinProvider", "getBaseLitecoinProvider", "setBaseLitecoinProvider", "baseZcashProvider", "getBaseZcashProvider", "setBaseZcashProvider", "biometricAuthEnabled", "getBiometricAuthEnabled", "setBiometricAuthEnabled", "derivation", "Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;", "bitcoinDerivation", "getBitcoinDerivation", "()Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;", "setBitcoinDerivation", "(Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;)V", "changelogShownForAppVersion", "getChangelogShownForAppVersion", "setChangelogShownForAppVersion", "mode", "Lio/horizontalsystems/xrateskit2/entities/ChartType;", "chartType", "getChartType", "()Lio/horizontalsystems/xrateskit2/entities/ChartType;", "setChartType", "(Lio/horizontalsystems/xrateskit2/entities/ChartType;)V", "Lio/horizontalsystems/bankwallet/core/managers/Term;", "checkedTerms", "getCheckedTerms", "setCheckedTerms", "Lio/horizontalsystems/bankwallet/modules/market/MarketModule$Tab;", "currentTab", "getCurrentTab", "()Lio/horizontalsystems/bankwallet/modules/market/MarketModule$Tab;", "setCurrentTab", "(Lio/horizontalsystems/bankwallet/modules/market/MarketModule$Tab;)V", "themeType", "Lio/horizontalsystems/bankwallet/modules/settings/theme/ThemeType;", "currentTheme", "getCurrentTheme", "()Lio/horizontalsystems/bankwallet/modules/settings/theme/ThemeType;", "setCurrentTheme", "(Lio/horizontalsystems/bankwallet/modules/settings/theme/ThemeType;)V", "encryptedText", "encryptedSampleText", "getEncryptedSampleText", "setEncryptedSampleText", "failedAttempts", "getFailedAttempts", "()Ljava/lang/Integer;", "setFailedAttempts", "(Ljava/lang/Integer;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "ignoreRootedDeviceWarning", "getIgnoreRootedDeviceWarning", "setIgnoreRootedDeviceWarning", "enabled", "isAlertNotificationOn", "setAlertNotificationOn", "isLockTimeEnabled", "setLockTimeEnabled", "isThirdPartyKeyboardAllowed", "setThirdPartyKeyboardAllowed", "lockoutUptime", "getLockoutUptime", "()Ljava/lang/Long;", "setLockoutUptime", "(Ljava/lang/Long;)V", "mainShowedOnce", "getMainShowedOnce", "setMainShowedOnce", "notificationId", "getNotificationId", "setNotificationId", "notificationServerTime", "getNotificationServerTime", "setNotificationServerTime", "pin", "getPin", "setPin", "rateAppLastRequestTime", "getRateAppLastRequestTime", "setRateAppLastRequestTime", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;", "sendInputType", "getSendInputType", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;", "setSendInputType", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;)V", "sortType", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceSortType;", "getSortType", "()Lio/horizontalsystems/bankwallet/modules/balance/BalanceSortType;", "setSortType", "(Lio/horizontalsystems/bankwallet/modules/balance/BalanceSortType;)V", "syncMode", "Lio/horizontalsystems/bankwallet/entities/SyncMode;", "getSyncMode", "()Lio/horizontalsystems/bankwallet/entities/SyncMode;", "setSyncMode", "(Lio/horizontalsystems/bankwallet/entities/SyncMode;)V", "torEnabled", "getTorEnabled", "setTorEnabled", "sortingType", "Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;", "transactionSortingType", "getTransactionSortingType", "()Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;", "setTransactionSortingType", "(Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;)V", "clear", "", "clearPin", "app_debug"})
public final class LocalStorageManager implements io.horizontalsystems.bankwallet.core.ILocalStorage, io.horizontalsystems.core.IPinStorage, io.horizontalsystems.bankwallet.core.IChartTypeStorage, io.horizontalsystems.core.IThirdKeyboard, io.horizontalsystems.bankwallet.core.IMarketStorage {
    private final java.lang.String THIRD_KEYBOARD_WARNING_MSG = "third_keyboard_warning_msg";
    private final java.lang.String SEND_INPUT_TYPE = "send_input_type";
    private final java.lang.String BASE_CURRENCY_CODE = "base_currency_code";
    private final java.lang.String FAILED_ATTEMPTS = "failed_attempts";
    private final java.lang.String LOCKOUT_TIMESTAMP = "lockout_timestamp";
    private final java.lang.String BASE_BITCOIN_PROVIDER = "base_bitcoin_provider";
    private final java.lang.String BASE_LITECOIN_PROVIDER = "base_litecoin_provider";
    private final java.lang.String BASE_ETHEREUM_PROVIDER = "base_ethereum_provider";
    private final java.lang.String BASE_DASH_PROVIDER = "base_dash_provider";
    private final java.lang.String BASE_BINANCE_PROVIDER = "base_binance_provider";
    private final java.lang.String BASE_ZCASH_PROVIDER = "base_zcash_provider";
    private final java.lang.String SYNC_MODE = "sync_mode";
    private final java.lang.String SORT_TYPE = "balance_sort_type";
    private final java.lang.String CHART_TYPE = "prev_chart_type";
    private final java.lang.String APP_VERSIONS = "app_versions";
    private final java.lang.String ALERT_NOTIFICATION_ENABLED = "alert_notification";
    private final java.lang.String LOCK_TIME_ENABLED = "lock_time_enabled";
    private final java.lang.String ENCRYPTION_CHECKER_TEXT = "encryption_checker_text";
    private final java.lang.String BITCOIN_DERIVATION = "bitcoin_derivation";
    private final java.lang.String TOR_ENABLED = "tor_enabled";
    private final java.lang.String APP_LAUNCH_COUNT = "app_launch_count";
    private final java.lang.String RATE_APP_LAST_REQ_TIME = "rate_app_last_req_time";
    private final java.lang.String TRANSACTION_DATA_SORTING_TYPE = "transaction_data_sorting_type";
    private final java.lang.String BALANCE_HIDDEN = "balance_hidden";
    private final java.lang.String CHECKED_TERMS = "checked_terms";
    private final java.lang.String MARKET_CURRENT_CATEGORY = "market_current_category";
    private final java.lang.String APP_LAST_VISIT_TIME = "app_last_visit_time";
    private final java.lang.String BIOMETRIC_ENABLED = "biometric_auth_enabled";
    private final java.lang.String PIN = "lock_pin";
    private final java.lang.String MAIN_SHOWED_ONCE = "main_showed_once";
    private final java.lang.String NOTIFICATION_ID = "notification_id";
    private final java.lang.String NOTIFICATION_SERVER_TIME = "notification_server_time";
    private final java.lang.String CURRENT_THEME = "current_theme";
    private final java.lang.String CHANGELOG_SHOWN_FOR_APP_VERSION = "changelog_shown_for_app_version";
    private final java.lang.String IGNORE_ROOTED_DEVICE_WARNING = "ignore_rooted_device_warning";
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy gson$delegate = null;
    private final android.content.SharedPreferences preferences = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.SendModule.InputType getSendInputType() {
        return null;
    }
    
    @java.lang.Override()
    public void setSendInputType(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.SendModule.InputType value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getBaseCurrencyCode() {
        return null;
    }
    
    @java.lang.Override()
    public void setBaseCurrencyCode(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getBaseBitcoinProvider() {
        return null;
    }
    
    @java.lang.Override()
    public void setBaseBitcoinProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getBaseLitecoinProvider() {
        return null;
    }
    
    @java.lang.Override()
    public void setBaseLitecoinProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getBaseEthereumProvider() {
        return null;
    }
    
    @java.lang.Override()
    public void setBaseEthereumProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getBaseDashProvider() {
        return null;
    }
    
    @java.lang.Override()
    public void setBaseDashProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getBaseBinanceProvider() {
        return null;
    }
    
    @java.lang.Override()
    public void setBaseBinanceProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getBaseZcashProvider() {
        return null;
    }
    
    @java.lang.Override()
    public void setBaseZcashProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.balance.BalanceSortType getSortType() {
        return null;
    }
    
    @java.lang.Override()
    public void setSortType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceSortType sortType) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.core.entities.AppVersion> getAppVersions() {
        return null;
    }
    
    @java.lang.Override()
    public void setAppVersions(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.core.entities.AppVersion> value) {
    }
    
    @java.lang.Override()
    public boolean isAlertNotificationOn() {
        return false;
    }
    
    @java.lang.Override()
    public void setAlertNotificationOn(boolean enabled) {
    }
    
    @java.lang.Override()
    public boolean isLockTimeEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public void setLockTimeEnabled(boolean enabled) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getEncryptedSampleText() {
        return null;
    }
    
    @java.lang.Override()
    public void setEncryptedSampleText(@org.jetbrains.annotations.Nullable()
    java.lang.String encryptedText) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.settings.theme.ThemeType getCurrentTheme() {
        return null;
    }
    
    @java.lang.Override()
    public void setCurrentTheme(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.theme.ThemeType themeType) {
    }
    
    @java.lang.Override()
    public boolean isThirdPartyKeyboardAllowed() {
        return false;
    }
    
    @java.lang.Override()
    public void setThirdPartyKeyboardAllowed(boolean enabled) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getFailedAttempts() {
        return null;
    }
    
    @java.lang.Override()
    public void setFailedAttempts(@org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Long getLockoutUptime() {
        return null;
    }
    
    @java.lang.Override()
    public void setLockoutUptime(@org.jetbrains.annotations.Nullable()
    java.lang.Long value) {
    }
    
    @java.lang.Override()
    public long getAppLastVisitTime() {
        return 0L;
    }
    
    @java.lang.Override()
    public void setAppLastVisitTime(long value) {
    }
    
    @java.lang.Override()
    public boolean getBiometricAuthEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public void setBiometricAuthEnabled(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getPin() {
        return null;
    }
    
    @java.lang.Override()
    public void setPin(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public void clearPin() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.SyncMode getSyncMode() {
        return null;
    }
    
    @java.lang.Override()
    public void setSyncMode(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.SyncMode syncMode) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.AccountType.Derivation getBitcoinDerivation() {
        return null;
    }
    
    @java.lang.Override()
    public void setBitcoinDerivation(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.AccountType.Derivation derivation) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.xrateskit2.entities.ChartType getChartType() {
        return null;
    }
    
    @java.lang.Override()
    public void setChartType(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.xrateskit2.entities.ChartType mode) {
    }
    
    @java.lang.Override()
    public boolean getTorEnabled() {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"ApplySharedPref"})
    @java.lang.Override()
    public void setTorEnabled(boolean enabled) {
    }
    
    @java.lang.Override()
    public int getAppLaunchCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void setAppLaunchCount(int value) {
    }
    
    @java.lang.Override()
    public long getRateAppLastRequestTime() {
        return 0L;
    }
    
    @java.lang.Override()
    public void setRateAppLastRequestTime(long value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.TransactionDataSortingType getTransactionSortingType() {
        return null;
    }
    
    @java.lang.Override()
    public void setTransactionSortingType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionDataSortingType sortingType) {
    }
    
    @java.lang.Override()
    public boolean getBalanceHidden() {
        return false;
    }
    
    @java.lang.Override()
    public void setBalanceHidden(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.core.managers.Term> getCheckedTerms() {
        return null;
    }
    
    @java.lang.Override()
    public void setCheckedTerms(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.core.managers.Term> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.market.MarketModule.Tab getCurrentTab() {
        return null;
    }
    
    @java.lang.Override()
    public void setCurrentTab(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.market.MarketModule.Tab value) {
    }
    
    @java.lang.Override()
    public boolean getMainShowedOnce() {
        return false;
    }
    
    @java.lang.Override()
    public void setMainShowedOnce(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getNotificationId() {
        return null;
    }
    
    @java.lang.Override()
    public void setNotificationId(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public long getNotificationServerTime() {
        return 0L;
    }
    
    @java.lang.Override()
    public void setNotificationServerTime(long value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getChangelogShownForAppVersion() {
        return null;
    }
    
    @java.lang.Override()
    public void setChangelogShownForAppVersion(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public boolean getIgnoreRootedDeviceWarning() {
        return false;
    }
    
    @java.lang.Override()
    public void setIgnoreRootedDeviceWarning(boolean value) {
    }
    
    public LocalStorageManager(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences) {
        super();
    }
}