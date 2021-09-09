package io.horizontalsystems.bankwallet.modules.walletconnect.scanqr;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/scanqr/WalletConnectScanQrViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService;", "(Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectService;)V", "openErrorLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getOpenErrorLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "openMainLiveEvent", "", "getOpenMainLiveEvent", "handleScanned", "string", "", "app_debug"})
public final class WalletConnectScanQrViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> openMainLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.Throwable> openErrorLiveEvent = null;
    private final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getOpenMainLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.Throwable> getOpenErrorLiveEvent() {
        return null;
    }
    
    public final void handleScanned(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    public WalletConnectScanQrViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectService service) {
        super();
    }
}