package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/core/App;", "Lio/horizontalsystems/core/CoreApp;", "()V", "attachBaseContext", "", "base", "Landroid/content/Context;", "localizedContext", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "onTrimMemory", "level", "", "setAppTheme", "startTasks", "Companion", "app_debug"})
public final class App extends io.horizontalsystems.core.CoreApp {
    private static io.horizontalsystems.bankwallet.core.App app;
    public static io.horizontalsystems.bankwallet.core.providers.FeeRateProvider feeRateProvider;
    public static io.horizontalsystems.bankwallet.core.ILocalStorage localStorage;
    public static io.horizontalsystems.bankwallet.core.IMarketStorage marketStorage;
    public static io.horizontalsystems.bankwallet.core.ITorManager torKitManager;
    public static io.horizontalsystems.bankwallet.core.IChartTypeStorage chartTypeStorage;
    public static io.horizontalsystems.bankwallet.core.IRestoreSettingsStorage restoreSettingsStorage;
    public static io.horizontalsystems.bankwallet.core.managers.WordsManager wordsManager;
    public static io.horizontalsystems.bankwallet.core.INetworkManager networkManager;
    public static io.horizontalsystems.bankwallet.core.managers.BackgroundStateChangeListener backgroundStateChangeListener;
    public static io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider;
    public static io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager;
    public static io.horizontalsystems.bankwallet.core.IWalletManager walletManager;
    public static io.horizontalsystems.bankwallet.core.IWalletStorage walletStorage;
    public static io.horizontalsystems.bankwallet.core.IAccountManager accountManager;
    public static io.horizontalsystems.bankwallet.core.IAccountFactory accountFactory;
    public static io.horizontalsystems.bankwallet.core.IBackupManager backupManager;
    public static io.horizontalsystems.bankwallet.core.IRateManager xRateManager;
    public static io.horizontalsystems.bankwallet.core.managers.ConnectivityManager connectivityManager;
    public static io.horizontalsystems.bankwallet.core.storage.AppDatabase appDatabase;
    public static io.horizontalsystems.bankwallet.core.IAccountsStorage accountsStorage;
    public static io.horizontalsystems.bankwallet.core.IPriceAlertManager priceAlertManager;
    public static io.horizontalsystems.bankwallet.core.IEnabledWalletStorage enabledWalletsStorage;
    public static io.horizontalsystems.bankwallet.core.IBlockchainSettingsStorage blockchainSettingsStorage;
    public static io.horizontalsystems.bankwallet.core.managers.EthereumKitManager ethereumKitManager;
    public static io.horizontalsystems.bankwallet.core.managers.BinanceSmartChainKitManager binanceSmartChainKitManager;
    public static io.horizontalsystems.bankwallet.core.managers.BinanceKitManager binanceKitManager;
    public static io.horizontalsystems.bankwallet.core.IAppNumberFormatter numberFormatter;
    public static io.horizontalsystems.bankwallet.core.factories.AddressParserFactory addressParserFactory;
    public static io.horizontalsystems.bankwallet.core.providers.FeeCoinProvider feeCoinProvider;
    public static io.horizontalsystems.bankwallet.core.notifications.NotificationNetworkWrapper notificationNetworkWrapper;
    public static io.horizontalsystems.bankwallet.core.INotificationManager notificationManager;
    public static io.horizontalsystems.bankwallet.core.IEthereumRpcModeSettingsManager ethereumRpcModeSettingsManager;
    public static io.horizontalsystems.bankwallet.core.IInitialSyncModeSettingsManager initialSyncModeSettingsManager;
    public static io.horizontalsystems.bankwallet.core.IDerivationSettingsManager derivationSettingsManager;
    public static io.horizontalsystems.bankwallet.core.managers.BitcoinCashCoinTypeManager bitcoinCashCoinTypeManager;
    public static io.horizontalsystems.bankwallet.core.IAccountCleaner accountCleaner;
    public static io.horizontalsystems.bankwallet.core.IRateAppManager rateAppManager;
    public static io.horizontalsystems.bankwallet.core.ICoinManager coinManager;
    public static io.horizontalsystems.bankwallet.core.storage.WalletConnectSessionStorage walletConnectSessionStorage;
    public static io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectSessionManager walletConnectSessionManager;
    public static io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectManager walletConnectManager;
    public static io.horizontalsystems.bankwallet.core.INotificationSubscriptionManager notificationSubscriptionManager;
    public static io.horizontalsystems.bankwallet.core.ITermsManager termsManager;
    public static io.horizontalsystems.bankwallet.core.managers.MarketFavoritesManager marketFavoritesManager;
    public static io.horizontalsystems.coinkit2.CoinKit coinKit;
    public static io.horizontalsystems.bankwallet.core.managers.ActivateCoinManager activateCoinManager;
    public static io.horizontalsystems.bankwallet.core.managers.ReleaseNotesManager releaseNotesManager;
    public static io.horizontalsystems.bankwallet.core.managers.RestoreSettingsManager restoreSettingsManager;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.App.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void setAppTheme() {
    }
    
    @java.lang.Override()
    public void onTrimMemory(int level) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context localizedContext() {
        return null;
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    private final void startTasks() {
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0007\u0010\u00bb\u0001\u001a\u00020.R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u000200X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u000206X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0018\u0010;\u001a\u00020<X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020BX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020HX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010M\u001a\u00020NX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00020TX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010Y\u001a\u00020ZX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001a\u0010_\u001a\u00020`X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0018\u0010e\u001a\u00020fX\u0096\u000f\u00a2\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001a\u0010k\u001a\u00020lX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001a\u0010q\u001a\u00020rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001a\u0010w\u001a\u00020xX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u001d\u0010}\u001a\u00020~X\u0086.\u00a2\u0006\u0011\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001e\u0010\u0083\u0001\u001a\u00030\u0084\u0001X\u0096\u000f\u00a2\u0006\u0010\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\u0089\u0001\u001a\u00030\u008a\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R \u0010\u008f\u0001\u001a\u00030\u0090\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001e\u0010\u0095\u0001\u001a\u00030\u0096\u0001X\u0096\u000f\u00a2\u0006\u0010\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R \u0010\u009b\u0001\u001a\u00030\u009c\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010\u00a0\u0001R \u0010\u00a1\u0001\u001a\u00030\u00a2\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a3\u0001\u0010\u00a4\u0001\"\u0006\b\u00a5\u0001\u0010\u00a6\u0001R \u0010\u00a7\u0001\u001a\u00030\u00a8\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a9\u0001\u0010\u00aa\u0001\"\u0006\b\u00ab\u0001\u0010\u00ac\u0001R \u0010\u00ad\u0001\u001a\u00030\u00ae\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00af\u0001\u0010\u00b0\u0001\"\u0006\b\u00b1\u0001\u0010\u00b2\u0001R \u0010\u00b3\u0001\u001a\u00030\u00b4\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b5\u0001\u0010\u00b6\u0001\"\u0006\b\u00b7\u0001\u0010\u00b8\u0001R\u001e\u0010\u00b9\u0001\u001a\u00030\u00ba\u0001X\u0096\u000f\u00a2\u0006\u0010\u001a\u0006\b\u00bb\u0001\u0010\u00bc\u0001\"\u0006\b\u00bd\u0001\u0010\u00be\u0001R\u001e\u0010\u00bf\u0001\u001a\u00030\u00c0\u0001X\u0096\u000f\u00a2\u0006\u0010\u001a\u0006\b\u00c1\u0001\u0010\u00c2\u0001\"\u0006\b\u00c3\u0001\u0010\u00c4\u0001R\u001e\u0010\u00c5\u0001\u001a\u00030\u00c6\u0001X\u0096\u000f\u00a2\u0006\u0010\u001a\u0006\b\u00c7\u0001\u0010\u00c8\u0001\"\u0006\b\u00c9\u0001\u0010\u00ca\u0001R\u001e\u0010\u00cb\u0001\u001a\u00030\u00cc\u0001X\u0096\u000f\u00a2\u0006\u0010\u001a\u0006\b\u00cd\u0001\u0010\u00ce\u0001\"\u0006\b\u00cf\u0001\u0010\u00d0\u0001R\u001e\u0010\u00d1\u0001\u001a\u00030\u00d2\u0001X\u0096\u000f\u00a2\u0006\u0010\u001a\u0006\b\u00d3\u0001\u0010\u00d4\u0001\"\u0006\b\u00d5\u0001\u0010\u00d6\u0001R \u0010\u00d7\u0001\u001a\u00030\u00d8\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00d9\u0001\u0010\u00da\u0001\"\u0006\b\u00db\u0001\u0010\u00dc\u0001R \u0010\u00dd\u0001\u001a\u00030\u00de\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00df\u0001\u0010\u00e0\u0001\"\u0006\b\u00e1\u0001\u0010\u00e2\u0001R \u0010\u00e3\u0001\u001a\u00030\u00e4\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00e5\u0001\u0010\u00e6\u0001\"\u0006\b\u00e7\u0001\u0010\u00e8\u0001R \u0010\u00e9\u0001\u001a\u00030\u00ea\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00eb\u0001\u0010\u00ec\u0001\"\u0006\b\u00ed\u0001\u0010\u00ee\u0001R \u0010\u00ef\u0001\u001a\u00030\u00f0\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00f1\u0001\u0010\u00f2\u0001\"\u0006\b\u00f3\u0001\u0010\u00f4\u0001R \u0010\u00f5\u0001\u001a\u00030\u00f6\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00f7\u0001\u0010\u00f8\u0001\"\u0006\b\u00f9\u0001\u0010\u00fa\u0001R \u0010\u00fb\u0001\u001a\u00030\u00fc\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00fd\u0001\u0010\u00fe\u0001\"\u0006\b\u00ff\u0001\u0010\u0080\u0002R \u0010\u0081\u0002\u001a\u00030\u0082\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002\"\u0006\b\u0085\u0002\u0010\u0086\u0002R\u001e\u0010\u0087\u0002\u001a\u00030\u0088\u0002X\u0096\u000f\u00a2\u0006\u0010\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002\"\u0006\b\u008b\u0002\u0010\u008c\u0002R\u001e\u0010\u008d\u0002\u001a\u00030\u008e\u0002X\u0096\u000f\u00a2\u0006\u0010\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002\"\u0006\b\u0091\u0002\u0010\u0092\u0002R\u001e\u0010\u0093\u0002\u001a\u00030\u0094\u0002X\u0096\u000f\u00a2\u0006\u0010\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002\"\u0006\b\u0097\u0002\u0010\u0098\u0002R \u0010\u0099\u0002\u001a\u00030\u009a\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002\"\u0006\b\u009d\u0002\u0010\u009e\u0002R \u0010\u009f\u0002\u001a\u00030\u00a0\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a1\u0002\u0010\u00a2\u0002\"\u0006\b\u00a3\u0002\u0010\u00a4\u0002R \u0010\u00a5\u0002\u001a\u00030\u00a6\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a7\u0002\u0010\u00a8\u0002\"\u0006\b\u00a9\u0002\u0010\u00aa\u0002R \u0010\u00ab\u0002\u001a\u00030\u00ac\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ad\u0002\u0010\u00ae\u0002\"\u0006\b\u00af\u0002\u0010\u00b0\u0002R \u0010\u00b1\u0002\u001a\u00030\u00b2\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b3\u0002\u0010\u00b4\u0002\"\u0006\b\u00b5\u0002\u0010\u00b6\u0002R\u001e\u0010\u00b7\u0002\u001a\u00030\u00b8\u0002X\u0096\u000f\u00a2\u0006\u0010\u001a\u0006\b\u00b9\u0002\u0010\u00ba\u0002\"\u0006\b\u00bb\u0002\u0010\u00bc\u0002R \u0010\u00bd\u0002\u001a\u00030\u00be\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00bf\u0002\u0010\u00c0\u0002\"\u0006\b\u00c1\u0002\u0010\u00c2\u0002R\u001e\u0010\u00c3\u0002\u001a\u00030\u00c4\u0002X\u0096\u000f\u00a2\u0006\u0010\u001a\u0006\b\u00c5\u0002\u0010\u00c6\u0002\"\u0006\b\u00c7\u0002\u0010\u00c8\u0002R \u0010\u00c9\u0002\u001a\u00030\u00ca\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00cb\u0002\u0010\u00cc\u0002\"\u0006\b\u00cd\u0002\u0010\u00ce\u0002R \u0010\u00cf\u0002\u001a\u00030\u00d0\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00d1\u0002\u0010\u00d2\u0002\"\u0006\b\u00d3\u0002\u0010\u00d4\u0002R \u0010\u00d5\u0002\u001a\u00030\u00d6\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00d7\u0002\u0010\u00d8\u0002\"\u0006\b\u00d9\u0002\u0010\u00da\u0002R \u0010\u00db\u0002\u001a\u00030\u00dc\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00dd\u0002\u0010\u00de\u0002\"\u0006\b\u00df\u0002\u0010\u00e0\u0002R \u0010\u00e1\u0002\u001a\u00030\u00e2\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00e3\u0002\u0010\u00e4\u0002\"\u0006\b\u00e5\u0002\u0010\u00e6\u0002R \u0010\u00e7\u0002\u001a\u00030\u00e8\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00e9\u0002\u0010\u00ea\u0002\"\u0006\b\u00eb\u0002\u0010\u00ec\u0002R \u0010\u00ed\u0002\u001a\u00030\u00ee\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ef\u0002\u0010\u00f0\u0002\"\u0006\b\u00f1\u0002\u0010\u00f2\u0002R \u0010\u00f3\u0002\u001a\u00030\u00f4\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00f5\u0002\u0010\u00f6\u0002\"\u0006\b\u00f7\u0002\u0010\u00f8\u0002\u00a8\u0006\u00f9\u0002"}, d2 = {"Lio/horizontalsystems/bankwallet/core/App$Companion;", "Lio/horizontalsystems/core/ICoreApp;", "()V", "accountCleaner", "Lio/horizontalsystems/bankwallet/core/IAccountCleaner;", "getAccountCleaner", "()Lio/horizontalsystems/bankwallet/core/IAccountCleaner;", "setAccountCleaner", "(Lio/horizontalsystems/bankwallet/core/IAccountCleaner;)V", "accountFactory", "Lio/horizontalsystems/bankwallet/core/IAccountFactory;", "getAccountFactory", "()Lio/horizontalsystems/bankwallet/core/IAccountFactory;", "setAccountFactory", "(Lio/horizontalsystems/bankwallet/core/IAccountFactory;)V", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "getAccountManager", "()Lio/horizontalsystems/bankwallet/core/IAccountManager;", "setAccountManager", "(Lio/horizontalsystems/bankwallet/core/IAccountManager;)V", "accountsStorage", "Lio/horizontalsystems/bankwallet/core/IAccountsStorage;", "getAccountsStorage", "()Lio/horizontalsystems/bankwallet/core/IAccountsStorage;", "setAccountsStorage", "(Lio/horizontalsystems/bankwallet/core/IAccountsStorage;)V", "activateCoinManager", "Lio/horizontalsystems/bankwallet/core/managers/ActivateCoinManager;", "getActivateCoinManager", "()Lio/horizontalsystems/bankwallet/core/managers/ActivateCoinManager;", "setActivateCoinManager", "(Lio/horizontalsystems/bankwallet/core/managers/ActivateCoinManager;)V", "adapterManager", "Lio/horizontalsystems/bankwallet/core/IAdapterManager;", "getAdapterManager", "()Lio/horizontalsystems/bankwallet/core/IAdapterManager;", "setAdapterManager", "(Lio/horizontalsystems/bankwallet/core/IAdapterManager;)V", "addressParserFactory", "Lio/horizontalsystems/bankwallet/core/factories/AddressParserFactory;", "getAddressParserFactory", "()Lio/horizontalsystems/bankwallet/core/factories/AddressParserFactory;", "setAddressParserFactory", "(Lio/horizontalsystems/bankwallet/core/factories/AddressParserFactory;)V", "app", "Lio/horizontalsystems/bankwallet/core/App;", "appConfigProvider", "Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;", "getAppConfigProvider", "()Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;", "setAppConfigProvider", "(Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;)V", "appDatabase", "Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;", "getAppDatabase", "()Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;", "setAppDatabase", "(Lio/horizontalsystems/bankwallet/core/storage/AppDatabase;)V", "backgroundManager", "Lio/horizontalsystems/core/BackgroundManager;", "getBackgroundManager", "()Lio/horizontalsystems/core/BackgroundManager;", "setBackgroundManager", "(Lio/horizontalsystems/core/BackgroundManager;)V", "backgroundStateChangeListener", "Lio/horizontalsystems/bankwallet/core/managers/BackgroundStateChangeListener;", "getBackgroundStateChangeListener", "()Lio/horizontalsystems/bankwallet/core/managers/BackgroundStateChangeListener;", "setBackgroundStateChangeListener", "(Lio/horizontalsystems/bankwallet/core/managers/BackgroundStateChangeListener;)V", "backupManager", "Lio/horizontalsystems/bankwallet/core/IBackupManager;", "getBackupManager", "()Lio/horizontalsystems/bankwallet/core/IBackupManager;", "setBackupManager", "(Lio/horizontalsystems/bankwallet/core/IBackupManager;)V", "binanceKitManager", "Lio/horizontalsystems/bankwallet/core/managers/BinanceKitManager;", "getBinanceKitManager", "()Lio/horizontalsystems/bankwallet/core/managers/BinanceKitManager;", "setBinanceKitManager", "(Lio/horizontalsystems/bankwallet/core/managers/BinanceKitManager;)V", "binanceSmartChainKitManager", "Lio/horizontalsystems/bankwallet/core/managers/BinanceSmartChainKitManager;", "getBinanceSmartChainKitManager", "()Lio/horizontalsystems/bankwallet/core/managers/BinanceSmartChainKitManager;", "setBinanceSmartChainKitManager", "(Lio/horizontalsystems/bankwallet/core/managers/BinanceSmartChainKitManager;)V", "bitcoinCashCoinTypeManager", "Lio/horizontalsystems/bankwallet/core/managers/BitcoinCashCoinTypeManager;", "getBitcoinCashCoinTypeManager", "()Lio/horizontalsystems/bankwallet/core/managers/BitcoinCashCoinTypeManager;", "setBitcoinCashCoinTypeManager", "(Lio/horizontalsystems/bankwallet/core/managers/BitcoinCashCoinTypeManager;)V", "blockchainSettingsStorage", "Lio/horizontalsystems/bankwallet/core/IBlockchainSettingsStorage;", "getBlockchainSettingsStorage", "()Lio/horizontalsystems/bankwallet/core/IBlockchainSettingsStorage;", "setBlockchainSettingsStorage", "(Lio/horizontalsystems/bankwallet/core/IBlockchainSettingsStorage;)V", "buildConfigProvider", "Lio/horizontalsystems/core/IBuildConfigProvider;", "getBuildConfigProvider", "()Lio/horizontalsystems/core/IBuildConfigProvider;", "setBuildConfigProvider", "(Lio/horizontalsystems/core/IBuildConfigProvider;)V", "chartTypeStorage", "Lio/horizontalsystems/bankwallet/core/IChartTypeStorage;", "getChartTypeStorage", "()Lio/horizontalsystems/bankwallet/core/IChartTypeStorage;", "setChartTypeStorage", "(Lio/horizontalsystems/bankwallet/core/IChartTypeStorage;)V", "coinKit", "Lio/horizontalsystems/coinkit2/CoinKit;", "getCoinKit", "()Lio/horizontalsystems/coinkit2/CoinKit;", "setCoinKit", "(Lio/horizontalsystems/coinkit2/CoinKit;)V", "coinManager", "Lio/horizontalsystems/bankwallet/core/ICoinManager;", "getCoinManager", "()Lio/horizontalsystems/bankwallet/core/ICoinManager;", "setCoinManager", "(Lio/horizontalsystems/bankwallet/core/ICoinManager;)V", "connectivityManager", "Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager;", "getConnectivityManager", "()Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager;", "setConnectivityManager", "(Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager;)V", "currencyManager", "Lio/horizontalsystems/core/ICurrencyManager;", "getCurrencyManager", "()Lio/horizontalsystems/core/ICurrencyManager;", "setCurrencyManager", "(Lio/horizontalsystems/core/ICurrencyManager;)V", "derivationSettingsManager", "Lio/horizontalsystems/bankwallet/core/IDerivationSettingsManager;", "getDerivationSettingsManager", "()Lio/horizontalsystems/bankwallet/core/IDerivationSettingsManager;", "setDerivationSettingsManager", "(Lio/horizontalsystems/bankwallet/core/IDerivationSettingsManager;)V", "enabledWalletsStorage", "Lio/horizontalsystems/bankwallet/core/IEnabledWalletStorage;", "getEnabledWalletsStorage", "()Lio/horizontalsystems/bankwallet/core/IEnabledWalletStorage;", "setEnabledWalletsStorage", "(Lio/horizontalsystems/bankwallet/core/IEnabledWalletStorage;)V", "encryptionManager", "Lio/horizontalsystems/core/IEncryptionManager;", "getEncryptionManager", "()Lio/horizontalsystems/core/IEncryptionManager;", "setEncryptionManager", "(Lio/horizontalsystems/core/IEncryptionManager;)V", "ethereumKitManager", "Lio/horizontalsystems/bankwallet/core/managers/EthereumKitManager;", "getEthereumKitManager", "()Lio/horizontalsystems/bankwallet/core/managers/EthereumKitManager;", "setEthereumKitManager", "(Lio/horizontalsystems/bankwallet/core/managers/EthereumKitManager;)V", "ethereumRpcModeSettingsManager", "Lio/horizontalsystems/bankwallet/core/IEthereumRpcModeSettingsManager;", "getEthereumRpcModeSettingsManager", "()Lio/horizontalsystems/bankwallet/core/IEthereumRpcModeSettingsManager;", "setEthereumRpcModeSettingsManager", "(Lio/horizontalsystems/bankwallet/core/IEthereumRpcModeSettingsManager;)V", "feeCoinProvider", "Lio/horizontalsystems/bankwallet/core/providers/FeeCoinProvider;", "getFeeCoinProvider", "()Lio/horizontalsystems/bankwallet/core/providers/FeeCoinProvider;", "setFeeCoinProvider", "(Lio/horizontalsystems/bankwallet/core/providers/FeeCoinProvider;)V", "feeRateProvider", "Lio/horizontalsystems/bankwallet/core/providers/FeeRateProvider;", "getFeeRateProvider", "()Lio/horizontalsystems/bankwallet/core/providers/FeeRateProvider;", "setFeeRateProvider", "(Lio/horizontalsystems/bankwallet/core/providers/FeeRateProvider;)V", "initialSyncModeSettingsManager", "Lio/horizontalsystems/bankwallet/core/IInitialSyncModeSettingsManager;", "getInitialSyncModeSettingsManager", "()Lio/horizontalsystems/bankwallet/core/IInitialSyncModeSettingsManager;", "setInitialSyncModeSettingsManager", "(Lio/horizontalsystems/bankwallet/core/IInitialSyncModeSettingsManager;)V", "instance", "Lio/horizontalsystems/core/CoreApp;", "getInstance", "()Lio/horizontalsystems/core/CoreApp;", "setInstance", "(Lio/horizontalsystems/core/CoreApp;)V", "keyProvider", "Lio/horizontalsystems/core/IKeyProvider;", "getKeyProvider", "()Lio/horizontalsystems/core/IKeyProvider;", "setKeyProvider", "(Lio/horizontalsystems/core/IKeyProvider;)V", "keyStoreManager", "Lio/horizontalsystems/core/IKeyStoreManager;", "getKeyStoreManager", "()Lio/horizontalsystems/core/IKeyStoreManager;", "setKeyStoreManager", "(Lio/horizontalsystems/core/IKeyStoreManager;)V", "languageConfigProvider", "Lio/horizontalsystems/core/ILanguageConfigProvider;", "getLanguageConfigProvider", "()Lio/horizontalsystems/core/ILanguageConfigProvider;", "setLanguageConfigProvider", "(Lio/horizontalsystems/core/ILanguageConfigProvider;)V", "languageManager", "Lio/horizontalsystems/core/ILanguageManager;", "getLanguageManager", "()Lio/horizontalsystems/core/ILanguageManager;", "setLanguageManager", "(Lio/horizontalsystems/core/ILanguageManager;)V", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "getLocalStorage", "()Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "setLocalStorage", "(Lio/horizontalsystems/bankwallet/core/ILocalStorage;)V", "marketFavoritesManager", "Lio/horizontalsystems/bankwallet/core/managers/MarketFavoritesManager;", "getMarketFavoritesManager", "()Lio/horizontalsystems/bankwallet/core/managers/MarketFavoritesManager;", "setMarketFavoritesManager", "(Lio/horizontalsystems/bankwallet/core/managers/MarketFavoritesManager;)V", "marketStorage", "Lio/horizontalsystems/bankwallet/core/IMarketStorage;", "getMarketStorage", "()Lio/horizontalsystems/bankwallet/core/IMarketStorage;", "setMarketStorage", "(Lio/horizontalsystems/bankwallet/core/IMarketStorage;)V", "networkManager", "Lio/horizontalsystems/bankwallet/core/INetworkManager;", "getNetworkManager", "()Lio/horizontalsystems/bankwallet/core/INetworkManager;", "setNetworkManager", "(Lio/horizontalsystems/bankwallet/core/INetworkManager;)V", "notificationManager", "Lio/horizontalsystems/bankwallet/core/INotificationManager;", "getNotificationManager", "()Lio/horizontalsystems/bankwallet/core/INotificationManager;", "setNotificationManager", "(Lio/horizontalsystems/bankwallet/core/INotificationManager;)V", "notificationNetworkWrapper", "Lio/horizontalsystems/bankwallet/core/notifications/NotificationNetworkWrapper;", "getNotificationNetworkWrapper", "()Lio/horizontalsystems/bankwallet/core/notifications/NotificationNetworkWrapper;", "setNotificationNetworkWrapper", "(Lio/horizontalsystems/bankwallet/core/notifications/NotificationNetworkWrapper;)V", "notificationSubscriptionManager", "Lio/horizontalsystems/bankwallet/core/INotificationSubscriptionManager;", "getNotificationSubscriptionManager", "()Lio/horizontalsystems/bankwallet/core/INotificationSubscriptionManager;", "setNotificationSubscriptionManager", "(Lio/horizontalsystems/bankwallet/core/INotificationSubscriptionManager;)V", "numberFormatter", "Lio/horizontalsystems/bankwallet/core/IAppNumberFormatter;", "getNumberFormatter", "()Lio/horizontalsystems/bankwallet/core/IAppNumberFormatter;", "setNumberFormatter", "(Lio/horizontalsystems/bankwallet/core/IAppNumberFormatter;)V", "pinComponent", "Lio/horizontalsystems/core/IPinComponent;", "getPinComponent", "()Lio/horizontalsystems/core/IPinComponent;", "setPinComponent", "(Lio/horizontalsystems/core/IPinComponent;)V", "pinStorage", "Lio/horizontalsystems/core/IPinStorage;", "getPinStorage", "()Lio/horizontalsystems/core/IPinStorage;", "setPinStorage", "(Lio/horizontalsystems/core/IPinStorage;)V", "preferences", "Landroid/content/SharedPreferences;", "getPreferences", "()Landroid/content/SharedPreferences;", "setPreferences", "(Landroid/content/SharedPreferences;)V", "priceAlertManager", "Lio/horizontalsystems/bankwallet/core/IPriceAlertManager;", "getPriceAlertManager", "()Lio/horizontalsystems/bankwallet/core/IPriceAlertManager;", "setPriceAlertManager", "(Lio/horizontalsystems/bankwallet/core/IPriceAlertManager;)V", "rateAppManager", "Lio/horizontalsystems/bankwallet/core/IRateAppManager;", "getRateAppManager", "()Lio/horizontalsystems/bankwallet/core/IRateAppManager;", "setRateAppManager", "(Lio/horizontalsystems/bankwallet/core/IRateAppManager;)V", "releaseNotesManager", "Lio/horizontalsystems/bankwallet/core/managers/ReleaseNotesManager;", "getReleaseNotesManager", "()Lio/horizontalsystems/bankwallet/core/managers/ReleaseNotesManager;", "setReleaseNotesManager", "(Lio/horizontalsystems/bankwallet/core/managers/ReleaseNotesManager;)V", "restoreSettingsManager", "Lio/horizontalsystems/bankwallet/core/managers/RestoreSettingsManager;", "getRestoreSettingsManager", "()Lio/horizontalsystems/bankwallet/core/managers/RestoreSettingsManager;", "setRestoreSettingsManager", "(Lio/horizontalsystems/bankwallet/core/managers/RestoreSettingsManager;)V", "restoreSettingsStorage", "Lio/horizontalsystems/bankwallet/core/IRestoreSettingsStorage;", "getRestoreSettingsStorage", "()Lio/horizontalsystems/bankwallet/core/IRestoreSettingsStorage;", "setRestoreSettingsStorage", "(Lio/horizontalsystems/bankwallet/core/IRestoreSettingsStorage;)V", "systemInfoManager", "Lio/horizontalsystems/core/ISystemInfoManager;", "getSystemInfoManager", "()Lio/horizontalsystems/core/ISystemInfoManager;", "setSystemInfoManager", "(Lio/horizontalsystems/core/ISystemInfoManager;)V", "termsManager", "Lio/horizontalsystems/bankwallet/core/ITermsManager;", "getTermsManager", "()Lio/horizontalsystems/bankwallet/core/ITermsManager;", "setTermsManager", "(Lio/horizontalsystems/bankwallet/core/ITermsManager;)V", "thirdKeyboardStorage", "Lio/horizontalsystems/core/IThirdKeyboard;", "getThirdKeyboardStorage", "()Lio/horizontalsystems/core/IThirdKeyboard;", "setThirdKeyboardStorage", "(Lio/horizontalsystems/core/IThirdKeyboard;)V", "torKitManager", "Lio/horizontalsystems/bankwallet/core/ITorManager;", "getTorKitManager", "()Lio/horizontalsystems/bankwallet/core/ITorManager;", "setTorKitManager", "(Lio/horizontalsystems/bankwallet/core/ITorManager;)V", "walletConnectManager", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectManager;", "getWalletConnectManager", "()Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectManager;", "setWalletConnectManager", "(Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectManager;)V", "walletConnectSessionManager", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSessionManager;", "getWalletConnectSessionManager", "()Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSessionManager;", "setWalletConnectSessionManager", "(Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSessionManager;)V", "walletConnectSessionStorage", "Lio/horizontalsystems/bankwallet/core/storage/WalletConnectSessionStorage;", "getWalletConnectSessionStorage", "()Lio/horizontalsystems/bankwallet/core/storage/WalletConnectSessionStorage;", "setWalletConnectSessionStorage", "(Lio/horizontalsystems/bankwallet/core/storage/WalletConnectSessionStorage;)V", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "getWalletManager", "()Lio/horizontalsystems/bankwallet/core/IWalletManager;", "setWalletManager", "(Lio/horizontalsystems/bankwallet/core/IWalletManager;)V", "walletStorage", "Lio/horizontalsystems/bankwallet/core/IWalletStorage;", "getWalletStorage", "()Lio/horizontalsystems/bankwallet/core/IWalletStorage;", "setWalletStorage", "(Lio/horizontalsystems/bankwallet/core/IWalletStorage;)V", "wordsManager", "Lio/horizontalsystems/bankwallet/core/managers/WordsManager;", "getWordsManager", "()Lio/horizontalsystems/bankwallet/core/managers/WordsManager;", "setWordsManager", "(Lio/horizontalsystems/bankwallet/core/managers/WordsManager;)V", "xRateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "getXRateManager", "()Lio/horizontalsystems/bankwallet/core/IRateManager;", "setXRateManager", "(Lio/horizontalsystems/bankwallet/core/IRateManager;)V", "app_debug"})
    public static final class Companion implements io.horizontalsystems.core.ICoreApp {
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.App getInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.providers.FeeRateProvider getFeeRateProvider() {
            return null;
        }
        
        public final void setFeeRateProvider(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.providers.FeeRateProvider p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.ILocalStorage getLocalStorage() {
            return null;
        }
        
        public final void setLocalStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.ILocalStorage p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IMarketStorage getMarketStorage() {
            return null;
        }
        
        public final void setMarketStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IMarketStorage p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.ITorManager getTorKitManager() {
            return null;
        }
        
        public final void setTorKitManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.ITorManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IChartTypeStorage getChartTypeStorage() {
            return null;
        }
        
        public final void setChartTypeStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IChartTypeStorage p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IRestoreSettingsStorage getRestoreSettingsStorage() {
            return null;
        }
        
        public final void setRestoreSettingsStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IRestoreSettingsStorage p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.managers.WordsManager getWordsManager() {
            return null;
        }
        
        public final void setWordsManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.managers.WordsManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.INetworkManager getNetworkManager() {
            return null;
        }
        
        public final void setNetworkManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.INetworkManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.managers.BackgroundStateChangeListener getBackgroundStateChangeListener() {
            return null;
        }
        
        public final void setBackgroundStateChangeListener(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.managers.BackgroundStateChangeListener p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IAppConfigProvider getAppConfigProvider() {
            return null;
        }
        
        public final void setAppConfigProvider(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IAppConfigProvider p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IAdapterManager getAdapterManager() {
            return null;
        }
        
        public final void setAdapterManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IAdapterManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IWalletManager getWalletManager() {
            return null;
        }
        
        public final void setWalletManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IWalletManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IWalletStorage getWalletStorage() {
            return null;
        }
        
        public final void setWalletStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IWalletStorage p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IAccountManager getAccountManager() {
            return null;
        }
        
        public final void setAccountManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IAccountManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IAccountFactory getAccountFactory() {
            return null;
        }
        
        public final void setAccountFactory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IAccountFactory p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IBackupManager getBackupManager() {
            return null;
        }
        
        public final void setBackupManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IBackupManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IRateManager getXRateManager() {
            return null;
        }
        
        public final void setXRateManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IRateManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.managers.ConnectivityManager getConnectivityManager() {
            return null;
        }
        
        public final void setConnectivityManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.managers.ConnectivityManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.storage.AppDatabase getAppDatabase() {
            return null;
        }
        
        public final void setAppDatabase(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.storage.AppDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IAccountsStorage getAccountsStorage() {
            return null;
        }
        
        public final void setAccountsStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IAccountsStorage p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IPriceAlertManager getPriceAlertManager() {
            return null;
        }
        
        public final void setPriceAlertManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IPriceAlertManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IEnabledWalletStorage getEnabledWalletsStorage() {
            return null;
        }
        
        public final void setEnabledWalletsStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IEnabledWalletStorage p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IBlockchainSettingsStorage getBlockchainSettingsStorage() {
            return null;
        }
        
        public final void setBlockchainSettingsStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IBlockchainSettingsStorage p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.managers.EthereumKitManager getEthereumKitManager() {
            return null;
        }
        
        public final void setEthereumKitManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.managers.EthereumKitManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.managers.BinanceSmartChainKitManager getBinanceSmartChainKitManager() {
            return null;
        }
        
        public final void setBinanceSmartChainKitManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.managers.BinanceSmartChainKitManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.managers.BinanceKitManager getBinanceKitManager() {
            return null;
        }
        
        public final void setBinanceKitManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.managers.BinanceKitManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IAppNumberFormatter getNumberFormatter() {
            return null;
        }
        
        public final void setNumberFormatter(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IAppNumberFormatter p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.factories.AddressParserFactory getAddressParserFactory() {
            return null;
        }
        
        public final void setAddressParserFactory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.factories.AddressParserFactory p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.providers.FeeCoinProvider getFeeCoinProvider() {
            return null;
        }
        
        public final void setFeeCoinProvider(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.providers.FeeCoinProvider p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.notifications.NotificationNetworkWrapper getNotificationNetworkWrapper() {
            return null;
        }
        
        public final void setNotificationNetworkWrapper(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.notifications.NotificationNetworkWrapper p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.INotificationManager getNotificationManager() {
            return null;
        }
        
        public final void setNotificationManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.INotificationManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IEthereumRpcModeSettingsManager getEthereumRpcModeSettingsManager() {
            return null;
        }
        
        public final void setEthereumRpcModeSettingsManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IEthereumRpcModeSettingsManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IInitialSyncModeSettingsManager getInitialSyncModeSettingsManager() {
            return null;
        }
        
        public final void setInitialSyncModeSettingsManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IInitialSyncModeSettingsManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IDerivationSettingsManager getDerivationSettingsManager() {
            return null;
        }
        
        public final void setDerivationSettingsManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IDerivationSettingsManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.managers.BitcoinCashCoinTypeManager getBitcoinCashCoinTypeManager() {
            return null;
        }
        
        public final void setBitcoinCashCoinTypeManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.managers.BitcoinCashCoinTypeManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IAccountCleaner getAccountCleaner() {
            return null;
        }
        
        public final void setAccountCleaner(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IAccountCleaner p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.IRateAppManager getRateAppManager() {
            return null;
        }
        
        public final void setRateAppManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.IRateAppManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.ICoinManager getCoinManager() {
            return null;
        }
        
        public final void setCoinManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.ICoinManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.storage.WalletConnectSessionStorage getWalletConnectSessionStorage() {
            return null;
        }
        
        public final void setWalletConnectSessionStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.storage.WalletConnectSessionStorage p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectSessionManager getWalletConnectSessionManager() {
            return null;
        }
        
        public final void setWalletConnectSessionManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectSessionManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectManager getWalletConnectManager() {
            return null;
        }
        
        public final void setWalletConnectManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.INotificationSubscriptionManager getNotificationSubscriptionManager() {
            return null;
        }
        
        public final void setNotificationSubscriptionManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.INotificationSubscriptionManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.ITermsManager getTermsManager() {
            return null;
        }
        
        public final void setTermsManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.ITermsManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.managers.MarketFavoritesManager getMarketFavoritesManager() {
            return null;
        }
        
        public final void setMarketFavoritesManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.managers.MarketFavoritesManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.CoinKit getCoinKit() {
            return null;
        }
        
        public final void setCoinKit(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.CoinKit p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.managers.ActivateCoinManager getActivateCoinManager() {
            return null;
        }
        
        public final void setActivateCoinManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.managers.ActivateCoinManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.managers.ReleaseNotesManager getReleaseNotesManager() {
            return null;
        }
        
        public final void setReleaseNotesManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.managers.ReleaseNotesManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.managers.RestoreSettingsManager getRestoreSettingsManager() {
            return null;
        }
        
        public final void setRestoreSettingsManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.managers.RestoreSettingsManager p0) {
        }
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public io.horizontalsystems.core.BackgroundManager getBackgroundManager() {
            return null;
        }
        
        @java.lang.Override()
        public void setBackgroundManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.core.BackgroundManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public io.horizontalsystems.core.IBuildConfigProvider getBuildConfigProvider() {
            return null;
        }
        
        @java.lang.Override()
        public void setBuildConfigProvider(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.core.IBuildConfigProvider p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public io.horizontalsystems.core.ICurrencyManager getCurrencyManager() {
            return null;
        }
        
        @java.lang.Override()
        public void setCurrencyManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.core.ICurrencyManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public io.horizontalsystems.core.IEncryptionManager getEncryptionManager() {
            return null;
        }
        
        @java.lang.Override()
        public void setEncryptionManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.core.IEncryptionManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public io.horizontalsystems.core.CoreApp getInstance() {
            return null;
        }
        
        @java.lang.Override()
        public void setInstance(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.core.CoreApp p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public io.horizontalsystems.core.IKeyProvider getKeyProvider() {
            return null;
        }
        
        @java.lang.Override()
        public void setKeyProvider(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.core.IKeyProvider p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public io.horizontalsystems.core.IKeyStoreManager getKeyStoreManager() {
            return null;
        }
        
        @java.lang.Override()
        public void setKeyStoreManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.core.IKeyStoreManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public io.horizontalsystems.core.ILanguageConfigProvider getLanguageConfigProvider() {
            return null;
        }
        
        @java.lang.Override()
        public void setLanguageConfigProvider(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.core.ILanguageConfigProvider p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public io.horizontalsystems.core.ILanguageManager getLanguageManager() {
            return null;
        }
        
        @java.lang.Override()
        public void setLanguageManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.core.ILanguageManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public io.horizontalsystems.core.IPinComponent getPinComponent() {
            return null;
        }
        
        @java.lang.Override()
        public void setPinComponent(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.core.IPinComponent p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public io.horizontalsystems.core.IPinStorage getPinStorage() {
            return null;
        }
        
        @java.lang.Override()
        public void setPinStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.core.IPinStorage p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.content.SharedPreferences getPreferences() {
            return null;
        }
        
        @java.lang.Override()
        public void setPreferences(@org.jetbrains.annotations.NotNull()
        android.content.SharedPreferences p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public io.horizontalsystems.core.ISystemInfoManager getSystemInfoManager() {
            return null;
        }
        
        @java.lang.Override()
        public void setSystemInfoManager(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.core.ISystemInfoManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public io.horizontalsystems.core.IThirdKeyboard getThirdKeyboardStorage() {
            return null;
        }
        
        @java.lang.Override()
        public void setThirdKeyboardStorage(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.core.IThirdKeyboard p0) {
        }
    }
}