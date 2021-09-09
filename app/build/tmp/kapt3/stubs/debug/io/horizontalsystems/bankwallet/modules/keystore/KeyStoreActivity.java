package io.horizontalsystems.bankwallet.modules.keystore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/keystore/KeyStoreActivity;", "Lio/horizontalsystems/keystore/BaseKeyStoreActivity;", "()V", "viewModel", "Lio/horizontalsystems/keystore/KeyStoreViewModel;", "getViewModel", "()Lio/horizontalsystems/keystore/KeyStoreViewModel;", "setViewModel", "(Lio/horizontalsystems/keystore/KeyStoreViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "openMainModule", "Companion", "app_debug"})
public final class KeyStoreActivity extends io.horizontalsystems.keystore.BaseKeyStoreActivity {
    public io.horizontalsystems.keystore.KeyStoreViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.keystore.KeyStoreActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.keystore.KeyStoreViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void setViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.keystore.KeyStoreViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void openMainModule() {
    }
    
    public KeyStoreActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/keystore/KeyStoreActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "mode", "Lio/horizontalsystems/keystore/KeyStoreModule$ModeType;", "startForInvalidKey", "startForNoSystemLock", "startForUserAuthentication", "app_debug"})
    public static final class Companion {
        
        public final void startForNoSystemLock(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        public final void startForInvalidKey(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        public final void startForUserAuthentication(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private final void start(android.content.Context context, io.horizontalsystems.keystore.KeyStoreModule.ModeType mode) {
        }
        
        private Companion() {
            super();
        }
    }
}