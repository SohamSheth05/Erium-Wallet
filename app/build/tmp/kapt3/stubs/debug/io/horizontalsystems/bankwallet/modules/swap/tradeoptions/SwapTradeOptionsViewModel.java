package io.horizontalsystems.bankwallet.modules.swap.tradeoptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u000fH\u0002R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsService;", "tradeService", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService;", "(Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsService;Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService;)V", "actionStateLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsViewModel$ActionState;", "getActionStateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "onCleared", "", "onDoneClick", "", "syncAction", "ActionState", "app_debug"})
public final class SwapTradeOptionsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptionsViewModel.ActionState> actionStateLiveData = null;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptionsService service = null;
    private final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService tradeService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptionsViewModel.ActionState> getActionStateLiveData() {
        return null;
    }
    
    private final void syncAction() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final boolean onDoneClick() {
        return false;
    }
    
    public SwapTradeOptionsViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptionsService service, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.SwapTradeService tradeService) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsViewModel$ActionState;", "", "()V", "Disabled", "Enabled", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsViewModel$ActionState$Enabled;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsViewModel$ActionState$Disabled;", "app_debug"})
    public static abstract class ActionState {
        
        private ActionState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsViewModel$ActionState$Enabled;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsViewModel$ActionState;", "()V", "app_debug"})
        public static final class Enabled extends io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptionsViewModel.ActionState {
            
            public Enabled() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsViewModel$ActionState$Disabled;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsViewModel$ActionState;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "app_debug"})
        public static final class Disabled extends io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptionsViewModel.ActionState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String title = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTitle() {
                return null;
            }
            
            public Disabled(@org.jetbrains.annotations.NotNull()
            java.lang.String title) {
                super();
            }
        }
    }
}