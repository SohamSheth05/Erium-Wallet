package io.horizontalsystems.bankwallet.modules.settings.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule;", "", "()V", "Factory", "IMainSettingsInteractor", "IMainSettingsInteractorDelegate", "IMainSettingsRouter", "IMainSettingsView", "IMainSettingsViewDelegate", "app_debug"})
public final class MainSettingsModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.settings.main.MainSettingsModule INSTANCE = null;
    
    private MainSettingsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\bH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\bH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsView;", "", "setAppVersion", "", "appVersion", "", "setBackedUp", "backedUp", "", "setBaseCurrency", "currency", "setLanguage", "language", "setPinIsSet", "pinSet", "setTermsAccepted", "termsAccepted", "setThemeName", "themeName", "", "setWalletConnectSessionCount", "count", "app_debug"})
    public static abstract interface IMainSettingsView {
        
        public abstract void setBackedUp(boolean backedUp);
        
        public abstract void setBaseCurrency(@org.jetbrains.annotations.NotNull()
        java.lang.String currency);
        
        public abstract void setLanguage(@org.jetbrains.annotations.NotNull()
        java.lang.String language);
        
        public abstract void setThemeName(int themeName);
        
        public abstract void setAppVersion(@org.jetbrains.annotations.NotNull()
        java.lang.String appVersion);
        
        public abstract void setTermsAccepted(boolean termsAccepted);
        
        public abstract void setPinIsSet(boolean pinSet);
        
        public abstract void setWalletConnectSessionCount(@org.jetbrains.annotations.Nullable()
        java.lang.String count);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsViewDelegate;", "", "didTapAboutApp", "", "didTapAcademy", "didTapBaseCurrency", "didTapCompanyLogo", "didTapExperimentalFeatures", "didTapFacebook", "didTapFaq", "didTapLanguage", "didTapLinked", "didTapManageKeys", "didTapNotifications", "didTapReddit", "didTapSecurity", "didTapTelegram", "didTapTheme", "didTapTwitter", "didTapWalletConnect", "viewDidLoad", "app_debug"})
    public static abstract interface IMainSettingsViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void didTapSecurity();
        
        public abstract void didTapBaseCurrency();
        
        public abstract void didTapLanguage();
        
        public abstract void didTapTheme();
        
        public abstract void didTapAboutApp();
        
        public abstract void didTapCompanyLogo();
        
        public abstract void didTapNotifications();
        
        public abstract void didTapExperimentalFeatures();
        
        public abstract void didTapManageKeys();
        
        public abstract void didTapWalletConnect();
        
        public abstract void didTapFaq();
        
        public abstract void didTapAcademy();
        
        public abstract void didTapTwitter();
        
        public abstract void didTapTelegram();
        
        public abstract void didTapFacebook();
        
        public abstract void didTapLinked();
        
        public abstract void didTapReddit();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\'\u001a\u00020(H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0012\u0010\u0012\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0012\u0010\u0014\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0012\u0010\u0016\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u0012\u0010\u0018\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u0012\u0010\u001a\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0012\u0010\u001c\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0012\u0010\u001e\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0005R\u0012\u0010\u001f\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0005R\u0012\u0010!\u001a\u00020\"X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u0012\u0010%\u001a\u00020\"X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010$\u00a8\u0006)"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsInteractor;", "", "allBackedUp", "", "getAllBackedUp", "()Z", "appVersion", "", "getAppVersion", "()Ljava/lang/String;", "appWebPageLink", "getAppWebPageLink", "baseCurrency", "Lio/horizontalsystems/core/entities/Currency;", "getBaseCurrency", "()Lio/horizontalsystems/core/entities/Currency;", "companyFacebookLink", "getCompanyFacebookLink", "companyLinkedLink", "getCompanyLinkedLink", "companyRedditLink", "getCompanyRedditLink", "companyTelegramLink", "getCompanyTelegramLink", "companyTwitterLink", "getCompanyTwitterLink", "companyWebPageLink", "getCompanyWebPageLink", "currentLanguageDisplayName", "getCurrentLanguageDisplayName", "isPinSet", "termsAccepted", "getTermsAccepted", "themeName", "", "getThemeName", "()I", "walletConnectSessionCount", "getWalletConnectSessionCount", "clear", "", "app_debug"})
    public static abstract interface IMainSettingsInteractor {
        
        public abstract int getThemeName();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getCompanyWebPageLink();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getAppWebPageLink();
        
        public abstract boolean getAllBackedUp();
        
        public abstract int getWalletConnectSessionCount();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getCurrentLanguageDisplayName();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.core.entities.Currency getBaseCurrency();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getAppVersion();
        
        public abstract boolean getTermsAccepted();
        
        public abstract boolean isPinSet();
        
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
        
        public abstract void clear();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsInteractorDelegate;", "", "didUpdateAllBackedUp", "", "allBackedUp", "", "didUpdateBaseCurrency", "didUpdatePinSet", "didUpdateTermsAccepted", "allAccepted", "didUpdateWalletConnectSessionCount", "count", "", "app_debug"})
    public static abstract interface IMainSettingsInteractorDelegate {
        
        public abstract void didUpdateAllBackedUp(boolean allBackedUp);
        
        public abstract void didUpdateBaseCurrency();
        
        public abstract void didUpdateTermsAccepted(boolean allAccepted);
        
        public abstract void didUpdatePinSet();
        
        public abstract void didUpdateWalletConnectSessionCount(int count);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$IMainSettingsRouter;", "", "openAcademy", "", "openFaq", "openLink", "url", "", "openWalletConnect", "showAboutApp", "showBaseCurrencySettings", "showExperimentalFeatures", "showLanguageSettings", "showManageKeys", "showNotifications", "showSecuritySettings", "showThemeSwitcher", "app_debug"})
    public static abstract interface IMainSettingsRouter {
        
        public abstract void showSecuritySettings();
        
        public abstract void showBaseCurrencySettings();
        
        public abstract void showLanguageSettings();
        
        public abstract void showAboutApp();
        
        public abstract void openLink(@org.jetbrains.annotations.NotNull()
        java.lang.String url);
        
        public abstract void showNotifications();
        
        public abstract void showExperimentalFeatures();
        
        public abstract void showManageKeys();
        
        public abstract void openWalletConnect();
        
        public abstract void openFaq();
        
        public abstract void openAcademy();
        
        public abstract void showThemeSwitcher();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/main/MainSettingsModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory() {
            super();
        }
    }
}