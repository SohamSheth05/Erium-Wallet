package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/BackgroundStateChangeListener;", "Lio/horizontalsystems/core/BackgroundManager$Listener;", "systemInfoManager", "Lio/horizontalsystems/core/ISystemInfoManager;", "keyStoreManager", "Lio/horizontalsystems/core/IKeyStoreManager;", "pinComponent", "Lio/horizontalsystems/core/IPinComponent;", "(Lio/horizontalsystems/core/ISystemInfoManager;Lio/horizontalsystems/core/IKeyStoreManager;Lio/horizontalsystems/core/IPinComponent;)V", "didEnterBackground", "", "willEnterForeground", "activity", "Landroid/app/Activity;", "app_debug"})
public final class BackgroundStateChangeListener implements io.horizontalsystems.core.BackgroundManager.Listener {
    private final io.horizontalsystems.core.ISystemInfoManager systemInfoManager = null;
    private final io.horizontalsystems.core.IKeyStoreManager keyStoreManager = null;
    private final io.horizontalsystems.core.IPinComponent pinComponent = null;
    
    @java.lang.Override()
    public void willEnterForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void didEnterBackground() {
    }
    
    public BackgroundStateChangeListener(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ISystemInfoManager systemInfoManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.IKeyStoreManager keyStoreManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.IPinComponent pinComponent) {
        super();
    }
    
    public void willEnterForeground() {
    }
}