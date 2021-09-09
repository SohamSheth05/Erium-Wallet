package io.horizontalsystems.bankwallet.modules.rooteddevice;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/rooteddevice/RootedDeviceViewModel;", "Landroidx/lifecycle/ViewModel;", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "(Lio/horizontalsystems/bankwallet/core/ILocalStorage;)V", "openMainActivity", "Lio/horizontalsystems/core/SingleLiveEvent;", "Ljava/lang/Void;", "getOpenMainActivity", "()Lio/horizontalsystems/core/SingleLiveEvent;", "ignoreRootedDeviceWarningButtonClicked", "", "app_debug"})
public final class RootedDeviceViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.Void> openMainActivity = null;
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorage = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.Void> getOpenMainActivity() {
        return null;
    }
    
    public final void ignoreRootedDeviceWarningButtonClicked() {
    }
    
    public RootedDeviceViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorage) {
        super();
    }
}