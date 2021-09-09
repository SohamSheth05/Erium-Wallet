package io.horizontalsystems.bankwallet.modules.receive;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/receive/ReceiveRouter;", "Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IRouter;", "()V", "shareAddress", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getShareAddress", "()Lio/horizontalsystems/core/SingleLiveEvent;", "", "address", "app_debug"})
public final class ReceiveRouter implements io.horizontalsystems.bankwallet.modules.receive.ReceiveModule.IRouter {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> shareAddress = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> getShareAddress() {
        return null;
    }
    
    @java.lang.Override()
    public void shareAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    public ReceiveRouter() {
        super();
    }
}