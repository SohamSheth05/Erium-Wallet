package io.horizontalsystems.bankwallet.modules.sendevmtransaction;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004DEFGB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u000208H\u0016J\b\u0010<\u001a\u000208H\u0002J\u000e\u0010=\u001a\u0002082\u0006\u0010>\u001a\u00020?J\u0014\u0010@\u001a\u0002082\n\b\u0002\u0010A\u001a\u0004\u0018\u00010BH\u0002J\b\u0010C\u001a\u000208H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f8F\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\u00180\u00180#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010&\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020%@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020%0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u001c\u0010-\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010%0%0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010/\u001a\u00020.2\u0006\u0010\u0017\u001a\u00020.@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020.0\u001f8F\u00a2\u0006\u0006\u001a\u0004\b5\u0010!R\u001c\u00106\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010.0.0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "sendEvmData", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData;", "evmKit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "transactionsService", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService;", "activateCoinManager", "Lio/horizontalsystems/bankwallet/core/managers/ActivateCoinManager;", "gasPrice", "", "(Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData;Lio/horizontalsystems/ethereumkit/core/EthereumKit;Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService;Lio/horizontalsystems/bankwallet/core/managers/ActivateCoinManager;Ljava/lang/Long;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "evmBalance", "Ljava/math/BigInteger;", "getEvmBalance", "()Ljava/math/BigInteger;", "ownAddress", "Lio/horizontalsystems/ethereumkit/models/Address;", "getOwnAddress", "()Lio/horizontalsystems/ethereumkit/models/Address;", "value", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$SendState;", "sendState", "getSendState", "()Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$SendState;", "setSendState", "(Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$SendState;)V", "sendStateObservable", "Lio/reactivex/Flowable;", "getSendStateObservable", "()Lio/reactivex/Flowable;", "sendStateSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$State;", "state", "getState", "()Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$State;", "setState", "(Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$State;)V", "stateObservable", "getStateObservable", "stateSubject", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$TxDataState;", "txDataState", "getTxDataState", "()Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$TxDataState;", "setTxDataState", "(Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$TxDataState;)V", "txDataStateObservable", "getTxDataStateObservable", "txDataStateSubject", "activateSwapCoinOut", "", "tokenOut", "Lio/horizontalsystems/ethereumkit/core/TransactionDecoration$Swap$Token;", "clear", "handlePostSendActions", "send", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "syncDataState", "transaction", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$Transaction;", "syncState", "SendState", "State", "TransactionError", "TxDataState", "app_debug"})
public final class SendEvmTransactionService implements io.horizontalsystems.bankwallet.core.Clearable {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.State> stateSubject = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.State state;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Flowable<io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.State> stateObservable = null;
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.SendState> sendStateSubject = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.SendState sendState;
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.TxDataState> txDataStateSubject = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.TxDataState txDataState;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.ethereumkit.models.Address ownAddress = null;
    private final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData sendEvmData = null;
    private final io.horizontalsystems.ethereumkit.core.EthereumKit evmKit = null;
    private final io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService transactionsService = null;
    private final io.horizontalsystems.bankwallet.core.managers.ActivateCoinManager activateCoinManager = null;
    
    private final java.math.BigInteger getEvmBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.State getState() {
        return null;
    }
    
    private final void setState(io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.State value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.State> getStateObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.SendState getSendState() {
        return null;
    }
    
    private final void setSendState(io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.SendState value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.SendState> getSendStateObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.TxDataState getTxDataState() {
        return null;
    }
    
    private final void setTxDataState(io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.TxDataState value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.TxDataState> getTxDataStateObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.ethereumkit.models.Address getOwnAddress() {
        return null;
    }
    
    public final void send(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AppLogger logger) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    private final void syncState() {
    }
    
    private final void syncDataState(io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.Transaction transaction) {
    }
    
    private final void handlePostSendActions() {
    }
    
    private final void activateSwapCoinOut(io.horizontalsystems.ethereumkit.core.TransactionDecoration.Swap.Token tokenOut) {
    }
    
    public SendEvmTransactionService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData sendEvmData, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.core.EthereumKit evmKit, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService transactionsService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.ActivateCoinManager activateCoinManager, @org.jetbrains.annotations.Nullable()
    java.lang.Long gasPrice) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$State;", "", "()V", "NotReady", "Ready", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$State$Ready;", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$State$NotReady;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$State$Ready;", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$State;", "()V", "app_debug"})
        public static final class Ready extends io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.State.Ready INSTANCE = null;
            
            private Ready() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$State$NotReady;", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$State;", "errors", "", "", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "app_debug"})
        public static final class NotReady extends io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.State {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<java.lang.Throwable> errors = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<java.lang.Throwable> getErrors() {
                return null;
            }
            
            public NotReady(@org.jetbrains.annotations.NotNull()
            java.util.List<? extends java.lang.Throwable> errors) {
                super();
            }
            
            public NotReady() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$TxDataState;", "", "transactionData", "Lio/horizontalsystems/ethereumkit/models/TransactionData;", "additionalInfo", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$AdditionalInfo;", "decoration", "Lio/horizontalsystems/ethereumkit/core/TransactionDecoration;", "(Lio/horizontalsystems/ethereumkit/models/TransactionData;Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$AdditionalInfo;Lio/horizontalsystems/ethereumkit/core/TransactionDecoration;)V", "getAdditionalInfo", "()Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData$AdditionalInfo;", "getDecoration", "()Lio/horizontalsystems/ethereumkit/core/TransactionDecoration;", "getTransactionData", "()Lio/horizontalsystems/ethereumkit/models/TransactionData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class TxDataState {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.ethereumkit.models.TransactionData transactionData = null;
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo additionalInfo = null;
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.ethereumkit.core.TransactionDecoration decoration = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.ethereumkit.models.TransactionData getTransactionData() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo getAdditionalInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.ethereumkit.core.TransactionDecoration getDecoration() {
            return null;
        }
        
        public TxDataState(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.ethereumkit.models.TransactionData transactionData, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo additionalInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.ethereumkit.core.TransactionDecoration decoration) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.ethereumkit.models.TransactionData component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.ethereumkit.core.TransactionDecoration component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.TxDataState copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.ethereumkit.models.TransactionData transactionData, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData.AdditionalInfo additionalInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.ethereumkit.core.TransactionDecoration decoration) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$SendState;", "", "()V", "Failed", "Idle", "Sending", "Sent", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$SendState$Idle;", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$SendState$Sending;", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$SendState$Sent;", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$SendState$Failed;", "app_debug"})
    public static abstract class SendState {
        
        private SendState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$SendState$Idle;", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$SendState;", "()V", "app_debug"})
        public static final class Idle extends io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.SendState {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.SendState.Idle INSTANCE = null;
            
            private Idle() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$SendState$Sending;", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$SendState;", "()V", "app_debug"})
        public static final class Sending extends io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.SendState {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.SendState.Sending INSTANCE = null;
            
            private Sending() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$SendState$Sent;", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$SendState;", "transactionHash", "", "([B)V", "getTransactionHash", "()[B", "app_debug"})
        public static final class Sent extends io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.SendState {
            @org.jetbrains.annotations.NotNull()
            private final byte[] transactionHash = null;
            
            @org.jetbrains.annotations.NotNull()
            public final byte[] getTransactionHash() {
                return null;
            }
            
            public Sent(@org.jetbrains.annotations.NotNull()
            byte[] transactionHash) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$SendState$Failed;", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$SendState;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "app_debug"})
        public static final class Failed extends io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.SendState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable error = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getError() {
                return null;
            }
            
            public Failed(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error) {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$TransactionError;", "", "()V", "InsufficientBalance", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$TransactionError$InsufficientBalance;", "app_debug"})
    public static abstract class TransactionError extends java.lang.Throwable {
        
        private TransactionError() {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$TransactionError$InsufficientBalance;", "Lio/horizontalsystems/bankwallet/modules/sendevmtransaction/SendEvmTransactionService$TransactionError;", "requiredBalance", "Ljava/math/BigInteger;", "(Ljava/math/BigInteger;)V", "getRequiredBalance", "()Ljava/math/BigInteger;", "app_debug"})
        public static final class InsufficientBalance extends io.horizontalsystems.bankwallet.modules.sendevmtransaction.SendEvmTransactionService.TransactionError {
            @org.jetbrains.annotations.NotNull()
            private final java.math.BigInteger requiredBalance = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.math.BigInteger getRequiredBalance() {
                return null;
            }
            
            public InsufficientBalance(@org.jetbrains.annotations.NotNull()
            java.math.BigInteger requiredBalance) {
                super();
            }
        }
    }
}