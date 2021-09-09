package io.horizontalsystems.bankwallet.modules.swap.approve;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveModule;", "", "()V", "dataKey", "", "requestKey", "resultKey", "start", "", "fragment", "Landroidx/fragment/app/Fragment;", "navigateTo", "", "navOptions", "Landroidx/navigation/NavOptions;", "approveData", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$ApproveData;", "Factory", "app_debug"})
public final class SwapApproveModule {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String requestKey = "approve";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String resultKey = "result";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String dataKey = "data_key";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.swap.approve.SwapApproveModule INSTANCE = null;
    
    public final void start(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int navigateTo, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavOptions navOptions, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.ApproveData approveData) {
    }
    
    private SwapApproveModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/approve/SwapApproveModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "approveData", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$ApproveData;", "(Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$ApproveData;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.ApproveData approveData = null;
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.ApproveData approveData) {
            super();
        }
    }
}