package io.horizontalsystems.bankwallet.modules.send.submodules.hodler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerView;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IView;", "()V", "selectedLockTimeInterval", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/hodler/LockTimeInterval;", "getSelectedLockTimeInterval", "()Landroidx/lifecycle/MutableLiveData;", "showLockTimeIntervals", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$LockTimeIntervalViewItem;", "getShowLockTimeIntervals", "()Lio/horizontalsystems/core/SingleLiveEvent;", "setSelectedLockTimeInterval", "", "timeInterval", "showLockTimeIntervalSelector", "items", "app_debug"})
public final class SendHodlerView implements io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IView {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.util.List<io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.LockTimeIntervalViewItem>> showLockTimeIntervals = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.hodler.LockTimeInterval> selectedLockTimeInterval = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.util.List<io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.LockTimeIntervalViewItem>> getShowLockTimeIntervals() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.hodler.LockTimeInterval> getSelectedLockTimeInterval() {
        return null;
    }
    
    @java.lang.Override()
    public void showLockTimeIntervalSelector(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.LockTimeIntervalViewItem> items) {
    }
    
    @java.lang.Override()
    public void setSelectedLockTimeInterval(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.hodler.LockTimeInterval timeInterval) {
    }
    
    public SendHodlerView() {
        super();
    }
}