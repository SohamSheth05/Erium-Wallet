package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0016R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006 "}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager;", "Lio/horizontalsystems/core/BackgroundManager$Listener;", "backgroundManager", "Lio/horizontalsystems/core/BackgroundManager;", "(Lio/horizontalsystems/core/BackgroundManager;)V", "callback", "Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager$ConnectionStatusCallback;", "connectivityManager", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "connectivityManager$delegate", "Lkotlin/Lazy;", "hasConnection", "", "hasValidInternet", "isConnected", "()Z", "setConnected", "(Z)V", "networkAvailabilitySignal", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getNetworkAvailabilitySignal", "()Lio/reactivex/subjects/PublishSubject;", "didEnterBackground", "getInitialConnectionStatus", "setInitialValues", "updatedConnectionState", "willEnterForeground", "ConnectionStatusCallback", "app_debug"})
public final class ConnectivityManager implements io.horizontalsystems.core.BackgroundManager.Listener {
    private final kotlin.Lazy connectivityManager$delegate = null;
    private boolean isConnected;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> networkAvailabilitySignal = null;
    private io.horizontalsystems.bankwallet.core.managers.ConnectivityManager.ConnectionStatusCallback callback;
    private boolean hasValidInternet = false;
    private boolean hasConnection = false;
    
    private final android.net.ConnectivityManager getConnectivityManager() {
        return null;
    }
    
    public final boolean isConnected() {
        return false;
    }
    
    public final void setConnected(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<kotlin.Unit> getNetworkAvailabilitySignal() {
        return null;
    }
    
    @java.lang.Override()
    public void willEnterForeground() {
    }
    
    @java.lang.Override()
    public void didEnterBackground() {
    }
    
    private final void setInitialValues() {
    }
    
    private final boolean getInitialConnectionStatus() {
        return false;
    }
    
    private final void updatedConnectionState() {
    }
    
    public ConnectivityManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.BackgroundManager backgroundManager) {
        super();
    }
    
    public void willEnterForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager$ConnectionStatusCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "(Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager;)V", "activeNetworks", "", "Landroid/net/Network;", "onAvailable", "", "network", "onCapabilitiesChanged", "networkCapabilities", "Landroid/net/NetworkCapabilities;", "onLost", "app_debug"})
    public final class ConnectionStatusCallback extends android.net.ConnectivityManager.NetworkCallback {
        private final java.util.List<android.net.Network> activeNetworks = null;
        
        @java.lang.Override()
        public void onLost(@org.jetbrains.annotations.NotNull()
        android.net.Network network) {
        }
        
        @java.lang.Override()
        public void onCapabilitiesChanged(@org.jetbrains.annotations.NotNull()
        android.net.Network network, @org.jetbrains.annotations.NotNull()
        android.net.NetworkCapabilities networkCapabilities) {
        }
        
        @java.lang.Override()
        public void onAvailable(@org.jetbrains.annotations.NotNull()
        android.net.Network network) {
        }
        
        public ConnectionStatusCallback() {
            super();
        }
    }
}