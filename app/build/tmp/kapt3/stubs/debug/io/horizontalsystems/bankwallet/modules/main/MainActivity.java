package io.horizontalsystems.bankwallet.modules.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/main/MainActivity;", "Lio/horizontalsystems/bankwallet/core/BaseActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onTrimMemory", "level", "", "openSend", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "Companion", "app_debug"})
public final class MainActivity extends io.horizontalsystems.bankwallet.core.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTIVE_TAB_KEY = "active_tab";
    public static final int SETTINGS_TAB_POSITION = 3;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.main.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onTrimMemory(int level) {
    }
    
    public final void openSend(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/main/MainActivity$Companion;", "", "()V", "ACTIVE_TAB_KEY", "", "SETTINGS_TAB_POSITION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}