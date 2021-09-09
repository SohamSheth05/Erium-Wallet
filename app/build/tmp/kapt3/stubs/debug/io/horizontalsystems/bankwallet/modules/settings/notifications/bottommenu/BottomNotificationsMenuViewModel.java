package io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0012\u0010\u0018\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0012\u0010\u001d\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0013J\b\u0010!\u001a\u00020\u001fH\u0002R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/notifications/bottommenu/BottomNotificationsMenuViewModel;", "Landroidx/lifecycle/ViewModel;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "coinName", "", "priceAlertManager", "Lio/horizontalsystems/bankwallet/core/IPriceAlertManager;", "mode", "Lio/horizontalsystems/bankwallet/modules/settings/notifications/bottommenu/NotificationMenuMode;", "(Lio/horizontalsystems/coinkit2/models/CoinType;Ljava/lang/String;Lio/horizontalsystems/bankwallet/core/IPriceAlertManager;Lio/horizontalsystems/bankwallet/modules/settings/notifications/bottommenu/NotificationMenuMode;)V", "alertStates", "Lkotlin/Pair;", "Lio/horizontalsystems/bankwallet/entities/PriceAlert$ChangeState;", "Lio/horizontalsystems/bankwallet/entities/PriceAlert$TrendState;", "changeState", "menuItemsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lio/horizontalsystems/bankwallet/modules/settings/notifications/bottommenu/NotificationMenuViewItem;", "getMenuItemsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "trendState", "getChangeList", "getChangeState", "optionValue", "Lio/horizontalsystems/bankwallet/modules/settings/notifications/bottommenu/OptionValue;", "getFullList", "getTrendList", "getTrendState", "onOptionClick", "", "item", "setItems", "app_debug"})
public final class BottomNotificationsMenuViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.NotificationMenuViewItem>> menuItemsLiveData = null;
    private final kotlin.Pair<io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState, io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState> alertStates = null;
    private io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState changeState;
    private io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState trendState;
    private final io.horizontalsystems.coinkit2.models.CoinType coinType = null;
    private final java.lang.String coinName = null;
    private final io.horizontalsystems.bankwallet.core.IPriceAlertManager priceAlertManager = null;
    private final io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.NotificationMenuMode mode = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.NotificationMenuViewItem>> getMenuItemsLiveData() {
        return null;
    }
    
    public final void onOptionClick(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.NotificationMenuViewItem item) {
    }
    
    private final void setItems() {
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.NotificationMenuViewItem> getFullList() {
        return null;
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.NotificationMenuViewItem> getChangeList() {
        return null;
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.NotificationMenuViewItem> getTrendList() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.entities.PriceAlert.ChangeState getChangeState(io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.OptionValue optionValue) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.entities.PriceAlert.TrendState getTrendState(io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.OptionValue optionValue) {
        return null;
    }
    
    public BottomNotificationsMenuViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    java.lang.String coinName, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IPriceAlertManager priceAlertManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.NotificationMenuMode mode) {
        super();
    }
}