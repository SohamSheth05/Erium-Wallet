package io.horizontalsystems.bankwallet.modules.tor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/tor/TorStatusView;", "Lio/horizontalsystems/bankwallet/modules/tor/TorStatusModule$View;", "()V", "torConnectionStatus", "Lio/horizontalsystems/core/SingleLiveEvent;", "Lio/horizontalsystems/bankwallet/core/managers/TorStatus;", "getTorConnectionStatus", "()Lio/horizontalsystems/core/SingleLiveEvent;", "updateConnectionStatus", "", "connectionStatus", "app_debug"})
public final class TorStatusView implements io.horizontalsystems.bankwallet.modules.tor.TorStatusModule.View {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.core.managers.TorStatus> torConnectionStatus = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.core.managers.TorStatus> getTorConnectionStatus() {
        return null;
    }
    
    @java.lang.Override()
    public void updateConnectionStatus(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.TorStatus connectionStatus) {
    }
    
    public TorStatusView() {
        super();
    }
}