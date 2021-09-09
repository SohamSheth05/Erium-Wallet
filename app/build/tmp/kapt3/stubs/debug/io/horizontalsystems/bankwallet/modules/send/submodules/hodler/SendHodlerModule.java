package io.horizontalsystems.bankwallet.modules.send.submodules.hodler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule;", "", "()V", "Factory", "IHodlerModule", "IHodlerModuleDelegate", "IInteractor", "IView", "IViewDelegate", "LockTimeIntervalViewItem", "app_debug"})
public final class SendHodlerModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule INSTANCE = null;
    
    private SendHodlerModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IView;", "", "setSelectedLockTimeInterval", "", "timeInterval", "Lio/horizontalsystems/hodler/LockTimeInterval;", "showLockTimeIntervalSelector", "items", "", "Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$LockTimeIntervalViewItem;", "app_debug"})
    public static abstract interface IView {
        
        public abstract void showLockTimeIntervalSelector(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.LockTimeIntervalViewItem> items);
        
        public abstract void setSelectedLockTimeInterval(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.hodler.LockTimeInterval timeInterval);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IViewDelegate;", "", "onClickLockTimeInterval", "", "onSelectLockTimeInterval", "position", "", "onViewDidLoad", "app_debug"})
    public static abstract interface IViewDelegate {
        
        public abstract void onViewDidLoad();
        
        public abstract void onClickLockTimeInterval();
        
        public abstract void onSelectLockTimeInterval(int position);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IInteractor;", "", "getLockTimeIntervals", "", "Lio/horizontalsystems/hodler/LockTimeInterval;", "()[Lio/horizontalsystems/hodler/LockTimeInterval;", "app_debug"})
    public static abstract interface IInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.hodler.LockTimeInterval[] getLockTimeIntervals();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModule;", "", "pluginData", "", "", "Lio/horizontalsystems/bitcoincore/core/IPluginData;", "app_debug"})
    public static abstract interface IHodlerModule {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.Map<java.lang.Byte, io.horizontalsystems.bitcoincore.core.IPluginData> pluginData();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModuleDelegate;", "", "onUpdateLockTimeInterval", "", "timeInterval", "Lio/horizontalsystems/hodler/LockTimeInterval;", "app_debug"})
    public static abstract interface IHodlerModuleDelegate {
        
        public abstract void onUpdateLockTimeInterval(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.hodler.LockTimeInterval timeInterval);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$LockTimeIntervalViewItem;", "", "lockTimeInterval", "Lio/horizontalsystems/hodler/LockTimeInterval;", "selected", "", "(Lio/horizontalsystems/hodler/LockTimeInterval;Z)V", "getLockTimeInterval", "()Lio/horizontalsystems/hodler/LockTimeInterval;", "getSelected", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class LockTimeIntervalViewItem {
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.hodler.LockTimeInterval lockTimeInterval = null;
        private final boolean selected = false;
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.hodler.LockTimeInterval getLockTimeInterval() {
            return null;
        }
        
        public final boolean getSelected() {
            return false;
        }
        
        public LockTimeIntervalViewItem(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.hodler.LockTimeInterval lockTimeInterval, boolean selected) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.hodler.LockTimeInterval component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.LockTimeIntervalViewItem copy(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.hodler.LockTimeInterval lockTimeInterval, boolean selected) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "sendHandler", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;", "hodlerModuleDelegate", "Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModuleDelegate;", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;Lio/horizontalsystems/bankwallet/modules/send/submodules/hodler/SendHodlerModule$IHodlerModuleDelegate;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler sendHandler = null;
        private final io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IHodlerModuleDelegate hodlerModuleDelegate = null;
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler sendHandler, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.submodules.hodler.SendHodlerModule.IHodlerModuleDelegate hodlerModuleDelegate) {
            super();
        }
    }
}