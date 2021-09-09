package io.horizontalsystems.bankwallet.modules.settings.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\b\u0010B\u001a\u00020CH\u0016R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0014\u0010%\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u001cR\u0014\u0010\'\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u001cR\u0014\u0010)\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u001cR\u0014\u0010+\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u001cR\u0014\u0010-\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u001cR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b0\u0010\u001cR\u001c\u00101\u001a\u0004\u0018\u000102X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u000e\u00107\u001a\u000208X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00109\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b9\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b;\u0010\u0018R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u00020=8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020=8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bA\u0010?R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006D"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsInteractor;", "Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsInteractor;", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "backupManager", "Lio/horizontalsystems/bankwallet/core/IBackupManager;", "languageManager", "Lio/horizontalsystems/core/ILanguageManager;", "systemInfoManager", "Lio/horizontalsystems/core/ISystemInfoManager;", "currencyManager", "Lio/horizontalsystems/core/ICurrencyManager;", "appConfigProvider", "Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;", "termsManager", "Lio/horizontalsystems/bankwallet/core/ITermsManager;", "pinComponent", "Lio/horizontalsystems/core/IPinComponent;", "walletConnectSessionManager", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSessionManager;", "(Lio/horizontalsystems/bankwallet/core/ILocalStorage;Lio/horizontalsystems/bankwallet/core/IBackupManager;Lio/horizontalsystems/core/ILanguageManager;Lio/horizontalsystems/core/ISystemInfoManager;Lio/horizontalsystems/core/ICurrencyManager;Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;Lio/horizontalsystems/bankwallet/core/ITermsManager;Lio/horizontalsystems/core/IPinComponent;Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSessionManager;)V", "allBackedUp", "", "getAllBackedUp", "()Z", "appVersion", "", "getAppVersion", "()Ljava/lang/String;", "appWebPageLink", "getAppWebPageLink", "baseCurrency", "Lio/horizontalsystems/core/entities/Currency;", "getBaseCurrency", "()Lio/horizontalsystems/core/entities/Currency;", "companyFacebookLink", "getCompanyFacebookLink", "companyLinkedLink", "getCompanyLinkedLink", "companyRedditLink", "getCompanyRedditLink", "companyTelegramLink", "getCompanyTelegramLink", "companyTwitterLink", "getCompanyTwitterLink", "companyWebPageLink", "getCompanyWebPageLink", "currentLanguageDisplayName", "getCurrentLanguageDisplayName", "delegate", "Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsInteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "isPinSet", "termsAccepted", "getTermsAccepted", "themeName", "", "getThemeName", "()I", "walletConnectSessionCount", "getWalletConnectSessionCount", "clear", "", "app_debug"})
public final class MainSettingsInteractor implements io.horizontalsystems.bankwallet.modules.settings.main.MainSettingsModule.IMainSettingsInteractor {
    private io.reactivex.disposables.CompositeDisposable disposables;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.settings.main.MainSettingsModule.IMainSettingsInteractorDelegate delegate;
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorage = null;
    private final io.horizontalsystems.bankwallet.core.IBackupManager backupManager = null;
    private final io.horizontalsystems.core.ILanguageManager languageManager = null;
    private final io.horizontalsystems.core.ISystemInfoManager systemInfoManager = null;
    private final io.horizontalsystems.core.ICurrencyManager currencyManager = null;
    private final io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider = null;
    private final io.horizontalsystems.bankwallet.core.ITermsManager termsManager = null;
    private final io.horizontalsystems.core.IPinComponent pinComponent = null;
    private final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectSessionManager walletConnectSessionManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.settings.main.MainSettingsModule.IMainSettingsInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.settings.main.MainSettingsModule.IMainSettingsInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public int getThemeName() {
        return 0;
    }
    
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
    
    @java.lang.Override()
    public boolean getAllBackedUp() {
        return false;
    }
    
    @java.lang.Override()
    public int getWalletConnectSessionCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCurrentLanguageDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCompanyTwitterLink() {
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
    public io.horizontalsystems.core.entities.Currency getBaseCurrency() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getTermsAccepted() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAppVersion() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isPinSet() {
        return false;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public MainSettingsInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IBackupManager backupManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ILanguageManager languageManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ISystemInfoManager systemInfoManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ITermsManager termsManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.IPinComponent pinComponent, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectSessionManager walletConnectSessionManager) {
        super();
    }
}