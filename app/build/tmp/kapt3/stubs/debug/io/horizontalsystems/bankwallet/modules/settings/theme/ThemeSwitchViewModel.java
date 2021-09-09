package io.horizontalsystems.bankwallet.modules.settings.theme;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR+\u0010\n\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u000e*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/theme/ThemeSwitchViewModel;", "Landroidx/lifecycle/ViewModel;", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "(Lio/horizontalsystems/bankwallet/core/ILocalStorage;)V", "changeThemeEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "Lio/horizontalsystems/bankwallet/modules/settings/theme/ThemeType;", "getChangeThemeEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "itemsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lio/horizontalsystems/bankwallet/modules/settings/theme/ThemeViewItem;", "kotlin.jvm.PlatformType", "getItemsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getItems", "onThemeClick", "", "item", "app_debug"})
public final class ThemeSwitchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.settings.theme.ThemeViewItem>> itemsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.settings.theme.ThemeType> changeThemeEvent = null;
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorage = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.settings.theme.ThemeViewItem>> getItemsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.settings.theme.ThemeType> getChangeThemeEvent() {
        return null;
    }
    
    public final void onThemeClick(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.theme.ThemeViewItem item) {
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.settings.theme.ThemeViewItem> getItems() {
        return null;
    }
    
    public ThemeSwitchViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorage) {
        super();
    }
}