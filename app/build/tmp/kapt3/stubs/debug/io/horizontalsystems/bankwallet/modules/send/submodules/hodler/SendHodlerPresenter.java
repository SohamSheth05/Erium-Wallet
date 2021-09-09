package io.horizontalsystems.bankwallet.modules.send.submodules.hodler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerPresenter;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IViewDelegate;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModule;", "view", "Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IView;", "interactor", "Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IInteractor;", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IView;Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IInteractor;)V", "lockTimeIntervalSelected", "Lio/horizontalsystems/hodler/LockTimeInterval;", "lockTimeIntervals", "", "[Lio/horizontalsystems/hodler/LockTimeInterval;", "moduleDelegate", "Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModuleDelegate;", "getModuleDelegate", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModuleDelegate;", "setModuleDelegate", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModuleDelegate;)V", "getView", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IView;", "onClickLockTimeInterval", "", "onSelectLockTimeInterval", "position", "", "onViewDidLoad", "pluginData", "", "", "Lio/horizontalsystems/bitcoincore/core/IPluginData;", "app_debug"})
public final class SendHodlerPresenter extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IViewDelegate, io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IHodlerModule {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IHodlerModuleDelegate moduleDelegate;
    private io.horizontalsystems.hodler.LockTimeInterval[] lockTimeIntervals = {};
    private io.horizontalsystems.hodler.LockTimeInterval lockTimeIntervalSelected;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IView view = null;
    private final io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IInteractor interactor = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IHodlerModuleDelegate getModuleDelegate() {
        return null;
    }
    
    public final void setModuleDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IHodlerModuleDelegate p0) {
    }
    
    @java.lang.Override()
    public void onViewDidLoad() {
    }
    
    @java.lang.Override()
    public void onClickLockTimeInterval() {
    }
    
    @java.lang.Override()
    public void onSelectLockTimeInterval(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.Byte, io.horizontalsystems.bitcoincore.core.IPluginData> pluginData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IView getView() {
        return null;
    }
    
    public SendHodlerPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IView view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IInteractor interactor) {
        super();
    }
}