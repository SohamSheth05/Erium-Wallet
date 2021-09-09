package io.horizontalsystems.bankwallet.modules.settings.experimental;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0005H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/experimental/ExperimentalFeaturesRouter;", "Lio/horizontalsystems/bankwallet/modules/settings/experimental/ExperimentalFeaturesModule$IRouter;", "()V", "showBitcoinHodlingLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getShowBitcoinHodlingLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "showBitcoinHodling", "app_debug"})
public final class ExperimentalFeaturesRouter implements io.horizontalsystems.bankwallet.modules.settings.experimental.ExperimentalFeaturesModule.IRouter {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> showBitcoinHodlingLiveEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getShowBitcoinHodlingLiveEvent() {
        return null;
    }
    
    @java.lang.Override()
    public void showBitcoinHodling() {
    }
    
    public ExperimentalFeaturesRouter() {
        super();
    }
}