package io.horizontalsystems.bankwallet.modules.sendevm.confirmation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/confirmation/SendEvmConfirmationModule;", "", "()V", "start", "", "fragment", "Landroidx/fragment/app/Fragment;", "navigateTo", "", "navOptions", "Landroidx/navigation/NavOptions;", "sendData", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData;", "Factory", "app_debug"})
public final class SendEvmConfirmationModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.sendevm.confirmation.SendEvmConfirmationModule INSTANCE = null;
    
    public final void start(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int navigateTo, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavOptions navOptions, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData sendData) {
    }
    
    private SendEvmConfirmationModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u001c\u001a\u0002H\u001d\"\n\b\u0000\u0010\u001d*\u0004\u0018\u00010\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001d0 H\u0016\u00a2\u0006\u0002\u0010!R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/confirmation/SendEvmConfirmationModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "evmKit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "sendEvmData", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData;", "(Lio/horizontalsystems/ethereumkit/core/EthereumKit;Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData;)V", "coinServiceFactory", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmCoinServiceFactory;", "getCoinServiceFactory", "()Lio/horizontalsystems/bankwallet/core/ethereum/EvmCoinServiceFactory;", "coinServiceFactory$delegate", "Lkotlin/Lazy;", "feeCoin", "Lio/horizontalsystems/coinkit2/models/Coin;", "getFeeCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "feeCoin$delegate", "sendService", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService;", "getSendService", "()Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService;", "sendService$delegate", "transactionService", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService;", "getTransactionService", "()Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService;", "transactionService$delegate", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final kotlin.Lazy feeCoin$delegate = null;
        private final kotlin.Lazy transactionService$delegate = null;
        private final kotlin.Lazy coinServiceFactory$delegate = null;
        private final kotlin.Lazy sendService$delegate = null;
        private final io.horizontalsystems.ethereumkit.core.EthereumKit evmKit = null;
        private final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData sendEvmData = null;
        
        private final io.horizontalsystems.coinkit2.models.Coin getFeeCoin() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService getTransactionService() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.core.ethereum.EvmCoinServiceFactory getCoinServiceFactory() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService getSendService() {
            return null;
        }
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.ethereumkit.core.EthereumKit evmKit, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData sendEvmData) {
            super();
        }
    }
}