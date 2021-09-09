package io.horizontalsystems.bankwallet.modules.settings.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010+\u001a\u00020,J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0003J(\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020 2\b\u00104\u001a\u0004\u0018\u000105H\u0002J\u0012\u00106\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000107H\u0003J\b\u00108\u001a\u00020,H\u0002J\b\u00109\u001a\u00020,H\u0014J\u000e\u0010:\u001a\u00020,2\u0006\u0010;\u001a\u00020\u0014J\u0006\u0010<\u001a\u00020,J\u0006\u0010=\u001a\u00020,J\u000e\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u00020\rJ\b\u0010@\u001a\u00020,H\u0002R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR)\u0010\u001d\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001e0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000fR\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u000fR\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140*X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/notifications/NotificationsViewModel;", "Landroidx/lifecycle/ViewModel;", "priceAlertManager", "Lio/horizontalsystems/bankwallet/core/IPriceAlertManager;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "notificationManager", "Lio/horizontalsystems/bankwallet/core/INotificationManager;", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "(Lio/horizontalsystems/bankwallet/core/IPriceAlertManager;Lio/horizontalsystems/bankwallet/core/IWalletManager;Lio/horizontalsystems/bankwallet/core/INotificationManager;Lio/horizontalsystems/bankwallet/core/ILocalStorage;)V", "controlsVisible", "Landroidx/lifecycle/MutableLiveData;", "", "getControlsVisible", "()Landroidx/lifecycle/MutableLiveData;", "disposable", "Lio/reactivex/disposables/Disposable;", "itemsLiveData", "", "Lio/horizontalsystems/bankwallet/modules/settings/notifications/NotificationViewItem;", "getItemsLiveData", "notificationIsOnLiveData", "getNotificationIsOnLiveData", "openNotificationSettings", "Lio/horizontalsystems/core/SingleLiveEvent;", "Ljava/lang/Void;", "getOpenNotificationSettings", "()Lio/horizontalsystems/core/SingleLiveEvent;", "openOptionsDialog", "Lkotlin/Triple;", "", "Lio/horizontalsystems/coinkit2/models/CoinType;", "Lio/horizontalsystems/bankwallet/modules/settings/notifications/bottommenu/NotificationMenuMode;", "getOpenOptionsDialog", "portfolioCoins", "Lio/horizontalsystems/coinkit2/models/Coin;", "setDeactivateButtonEnabled", "getSetDeactivateButtonEnabled", "setWarningVisible", "getSetWarningVisible", "viewItems", "", "deactivateAll", "", "getChangeValue", "", "changeState", "Lio/horizontalsystems/bankwallet/entities/PriceAlert$ChangeState;", "getPriceAlertViewItems", "coinName", "coinType", "priceAlert", "Lio/horizontalsystems/bankwallet/entities/PriceAlert;", "getTrendValue", "Lio/horizontalsystems/bankwallet/entities/PriceAlert$TrendState;", "loadAlerts", "onCleared", "onDropdownTap", "item", "onResume", "openSettings", "switchAlertNotification", "checked", "updateControlsVisibility", "app_debug"})
public final class NotificationsViewModel extends androidx.lifecycle.ViewModel {
    private final java.util.List<io.horizontalsystems.bankwallet.modules.settings.notifications.NotificationViewItem> viewItems = null;
    private final java.util.List<io.horizontalsystems.coinkit2.models.Coin> portfolioCoins = null;
    private io.reactivex.disposables.Disposable disposable;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.settings.notifications.NotificationViewItem>> itemsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.Void> openNotificationSettings = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> setWarningVisible = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> notificationIsOnLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Triple<java.lang.String, io.horizontalsystems.coinkit2.models.CoinType, io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.NotificationMenuMode>> openOptionsDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsVisible = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> setDeactivateButtonEnabled = null;
    private final io.horizontalsystems.bankwallet.core.IPriceAlertManager priceAlertManager = null;
    private final io.horizontalsystems.bankwallet.core.INotificationManager notificationManager = null;
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorage = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.settings.notifications.NotificationViewItem>> getItemsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.Void> getOpenNotificationSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSetWarningVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getNotificationIsOnLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Triple<java.lang.String, io.horizontalsystems.coinkit2.models.CoinType, io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.NotificationMenuMode>> getOpenOptionsDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getControlsVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSetDeactivateButtonEnabled() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void openSettings() {
    }
    
    public final void deactivateAll() {
    }
    
    public final void onResume() {
    }
    
    public final void switchAlertNotification(boolean checked) {
    }
    
    public final void onDropdownTap(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.notifications.NotificationViewItem item) {
    }
    
    private final void updateControlsVisibility() {
    }
    
    private final void loadAlerts() {
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.settings.notifications.NotificationViewItem> getPriceAlertViewItems(java.lang.String coinName, io.horizontalsystems.coinkit2.models.CoinType coinType, io.horizontalsystems.bankwallet.entities.PriceAlert priceAlert) {
        return null;
    }
    
    @androidx.annotation.StringRes()
    private final int getChangeValue(io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState changeState) {
        return 0;
    }
    
    @androidx.annotation.StringRes()
    private final int getTrendValue(io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState changeState) {
        return 0;
    }
    
    public NotificationsViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IPriceAlertManager priceAlertManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.INotificationManager notificationManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorage) {
        super();
    }
}