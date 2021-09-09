package io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004H\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/notifications/bottommenu/BottomNotificationMenu;", "Lio/horizontalsystems/bankwallet/ui/extensions/BaseBottomSheetDialogFragment;", "Lio/horizontalsystems/bankwallet/modules/settings/notifications/bottommenu/NotificationMenuItemsAdapter$Listener;", "mode", "Lio/horizontalsystems/bankwallet/modules/settings/notifications/bottommenu/NotificationMenuMode;", "coinName", "", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "(Lio/horizontalsystems/bankwallet/modules/settings/notifications/bottommenu/NotificationMenuMode;Ljava/lang/String;Lio/horizontalsystems/coinkit2/models/CoinType;)V", "viewModel", "Lio/horizontalsystems/bankwallet/modules/settings/notifications/bottommenu/BottomNotificationsMenuViewModel;", "getViewModel", "()Lio/horizontalsystems/bankwallet/modules/settings/notifications/bottommenu/BottomNotificationsMenuViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getTitle", "", "onItemClick", "", "item", "Lio/horizontalsystems/bankwallet/modules/settings/notifications/bottommenu/NotificationMenuViewItem;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class BottomNotificationMenu extends io.horizontalsystems.bankwallet.ui.extensions.BaseBottomSheetDialogFragment implements io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.NotificationMenuItemsAdapter.Listener {
    private final kotlin.Lazy viewModel$delegate = null;
    private final io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.NotificationMenuMode mode = null;
    private final java.lang.String coinName = null;
    private final io.horizontalsystems.coinkit2.models.CoinType coinType = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.BottomNotificationMenu.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.BottomNotificationsMenuViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.NotificationMenuViewItem item) {
    }
    
    @androidx.annotation.StringRes()
    private final int getTitle(io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.NotificationMenuMode mode) {
        return 0;
    }
    
    public BottomNotificationMenu(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.NotificationMenuMode mode, @org.jetbrains.annotations.NotNull()
    java.lang.String coinName, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/notifications/bottommenu/BottomNotificationMenu$Companion;", "", "()V", "show", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "mode", "Lio/horizontalsystems/bankwallet/modules/settings/notifications/bottommenu/NotificationMenuMode;", "coinName", "", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "app_debug"})
    public static final class Companion {
        
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.settings.notifications.bottommenu.NotificationMenuMode mode, @org.jetbrains.annotations.NotNull()
        java.lang.String coinName, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.CoinType coinType) {
        }
        
        private Companion() {
            super();
        }
    }
}