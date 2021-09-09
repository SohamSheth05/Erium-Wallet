package io.horizontalsystems.bankwallet.modules.enablecoins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService;", "(Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService;)V", "confirmationLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getConfirmationLiveData", "()Landroidx/lifecycle/MutableLiveData;", "disposable", "Lio/reactivex/disposables/Disposable;", "hudStateLiveData", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsViewModel$HudState;", "getHudStateLiveData", "handle", "", "state", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State;", "onConfirmEnable", "HudState", "app_debug"})
public final class EnableCoinsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsViewModel.HudState> hudStateLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> confirmationLiveData = null;
    private final io.reactivex.disposables.Disposable disposable = null;
    private final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsViewModel.HudState> getHudStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getConfirmationLiveData() {
        return null;
    }
    
    public final void onConfirmEnable() {
    }
    
    private final void handle(io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.State state) {
    }
    
    public EnableCoinsViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService service) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsViewModel$HudState;", "", "()V", "Error", "Hidden", "Loading", "Success", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsViewModel$HudState$Hidden;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsViewModel$HudState$Loading;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsViewModel$HudState$Success;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsViewModel$HudState$Error;", "app_debug"})
    public static abstract class HudState {
        
        private HudState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsViewModel$HudState$Hidden;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsViewModel$HudState;", "()V", "app_debug"})
        public static final class Hidden extends io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsViewModel.HudState {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsViewModel.HudState.Hidden INSTANCE = null;
            
            private Hidden() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsViewModel$HudState$Loading;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsViewModel$HudState;", "()V", "app_debug"})
        public static final class Loading extends io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsViewModel.HudState {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsViewModel.HudState.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsViewModel$HudState$Success;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsViewModel$HudState;", "count", "", "(I)V", "getCount", "()I", "app_debug"})
        public static final class Success extends io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsViewModel.HudState {
            private final int count = 0;
            
            public final int getCount() {
                return 0;
            }
            
            public Success(int count) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsViewModel$HudState$Error;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsViewModel$HudState;", "()V", "app_debug"})
        public static final class Error extends io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsViewModel.HudState {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsViewModel.HudState.Error INSTANCE = null;
            
            private Error() {
                super();
            }
        }
    }
}