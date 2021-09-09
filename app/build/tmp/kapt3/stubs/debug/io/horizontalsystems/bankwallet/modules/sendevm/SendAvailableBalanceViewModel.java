package io.horizontalsystems.bankwallet.modules.sendevm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendAvailableBalanceViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/sendevm/IAvailableBalanceService;", "coinService", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmCoinService;", "clearables", "", "Lio/horizontalsystems/bankwallet/core/Clearable;", "(Lio/horizontalsystems/bankwallet/modules/sendevm/IAvailableBalanceService;Lio/horizontalsystems/bankwallet/core/ethereum/EvmCoinService;Ljava/util/List;)V", "viewStateLiveData", "Landroidx/lifecycle/LiveData;", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendAvailableBalanceViewModel$ViewState;", "getViewStateLiveData", "()Landroidx/lifecycle/LiveData;", "viewStateSubject", "Landroidx/lifecycle/MutableLiveData;", "onCleared", "", "sync", "ViewState", "app_debug"})
public final class SendAvailableBalanceViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.sendevm.SendAvailableBalanceViewModel.ViewState> viewStateSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<io.horizontalsystems.bankwallet.modules.sendevm.SendAvailableBalanceViewModel.ViewState> viewStateLiveData = null;
    private final io.horizontalsystems.bankwallet.modules.sendevm.IAvailableBalanceService service = null;
    private final io.horizontalsystems.bankwallet.core.ethereum.EvmCoinService coinService = null;
    private final java.util.List<io.horizontalsystems.bankwallet.core.Clearable> clearables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<io.horizontalsystems.bankwallet.modules.sendevm.SendAvailableBalanceViewModel.ViewState> getViewStateLiveData() {
        return null;
    }
    
    private final void sync() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public SendAvailableBalanceViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.sendevm.IAvailableBalanceService service, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ethereum.EvmCoinService coinService, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.core.Clearable> clearables) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendAvailableBalanceViewModel$ViewState;", "", "()V", "Loaded", "Loading", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendAvailableBalanceViewModel$ViewState$Loading;", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendAvailableBalanceViewModel$ViewState$Loaded;", "app_debug"})
    public static abstract class ViewState {
        
        private ViewState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendAvailableBalanceViewModel$ViewState$Loading;", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendAvailableBalanceViewModel$ViewState;", "()V", "app_debug"})
        public static final class Loading extends io.horizontalsystems.bankwallet.modules.sendevm.SendAvailableBalanceViewModel.ViewState {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.sendevm.SendAvailableBalanceViewModel.ViewState.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendAvailableBalanceViewModel$ViewState$Loaded;", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendAvailableBalanceViewModel$ViewState;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "app_debug"})
        public static final class Loaded extends io.horizontalsystems.bankwallet.modules.sendevm.SendAvailableBalanceViewModel.ViewState {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String value = null;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getValue() {
                return null;
            }
            
            public Loaded(@org.jetbrains.annotations.Nullable()
            java.lang.String value) {
                super();
            }
        }
    }
}