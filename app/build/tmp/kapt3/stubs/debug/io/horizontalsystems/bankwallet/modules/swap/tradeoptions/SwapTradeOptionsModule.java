package io.horizontalsystems.bankwallet.modules.swap.tradeoptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsModule;", "", "()V", "Factory", "app_debug"})
public final class SwapTradeOptionsModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptionsModule INSTANCE = null;
    
    private SwapTradeOptionsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u000b\u001a\u0002H\f\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "tradeService", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService;", "(Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService;)V", "service", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsService;", "getService", "()Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptionsService;", "service$delegate", "Lkotlin/Lazy;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final kotlin.Lazy service$delegate = null;
        private final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService tradeService = null;
        
        private final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptionsService getService() {
            return null;
        }
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.swap.SwapTradeService tradeService) {
            super();
        }
    }
}