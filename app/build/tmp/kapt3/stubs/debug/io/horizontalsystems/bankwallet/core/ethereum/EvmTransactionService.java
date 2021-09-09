package io.horizontalsystems.bankwallet.core.ethereum;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004CDEFB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001e\u00107\u001a\b\u0012\u0004\u0012\u00020\"082\u0006\u00109\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0002J\u001e\u0010:\u001a\b\u0012\u0004\u0012\u00020;082\u0006\u00109\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0002J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020\f082\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u00020;H\u0002J\u001e\u0010?\u001a\b\u0012\u0004\u0012\u00020)082\u0006\u00109\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0002J\u0006\u0010@\u001a\u00020AJ\b\u0010B\u001a\u00020AH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00100\u00100\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u000f\u001a\u0004\u0018\u00010\"@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R0\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020)0(@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001d\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0019R(\u00101\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020) \u001c*\n\u0012\u0004\u0012\u00020)\u0018\u00010(0(0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u001e038F\u00a2\u0006\u0006\u001a\u0004\b4\u00105R\u001c\u00106\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001e0\u001e0\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006G"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService;", "", "evmKit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "feeRateProvider", "Lio/horizontalsystems/bankwallet/core/IFeeRateProvider;", "gasLimitSurchargePercent", "", "(Lio/horizontalsystems/ethereumkit/core/EthereumKit;Lio/horizontalsystems/bankwallet/core/IFeeRateProvider;I)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "evmBalance", "Ljava/math/BigInteger;", "getEvmBalance", "()Ljava/math/BigInteger;", "value", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasPriceType;", "gasPriceType", "getGasPriceType", "()Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasPriceType;", "setGasPriceType", "(Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasPriceType;)V", "gasPriceTypeObservable", "Lio/reactivex/Observable;", "getGasPriceTypeObservable", "()Lio/reactivex/Observable;", "gasPriceTypeSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "hasEstimatedFee", "", "getHasEstimatedFee", "()Z", "recommendedGasPrice", "Lio/horizontalsystems/ethereumkit/models/TransactionData;", "transactionData", "getTransactionData", "()Lio/horizontalsystems/ethereumkit/models/TransactionData;", "setTransactionData", "(Lio/horizontalsystems/ethereumkit/models/TransactionData;)V", "Lio/horizontalsystems/bankwallet/entities/DataState;", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$Transaction;", "transactionStatus", "getTransactionStatus", "()Lio/horizontalsystems/bankwallet/entities/DataState;", "setTransactionStatus", "(Lio/horizontalsystems/bankwallet/entities/DataState;)V", "transactionStatusObservable", "getTransactionStatusObservable", "transactionStatusSubject", "warningOfStuckObservable", "Lio/reactivex/Flowable;", "getWarningOfStuckObservable", "()Lio/reactivex/Flowable;", "warningOfStuckSubject", "getAdjustedTransactionDataAsync", "Lio/reactivex/Single;", "gasPrice", "getGasLimitAsync", "", "getGasPriceAsync", "getSurchargedGasLimit", "estimatedGasLimit", "getTransactionAsync", "onCleared", "", "sync", "GasData", "GasDataError", "GasPriceType", "Transaction", "app_debug"})
public final class EvmTransactionService {
    private java.math.BigInteger recommendedGasPrice;
    private io.reactivex.subjects.PublishSubject<java.lang.Boolean> warningOfStuckSubject;
    private final boolean hasEstimatedFee = false;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.ethereumkit.models.TransactionData transactionData;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasPriceType gasPriceType;
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasPriceType> gasPriceTypeSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasPriceType> gasPriceTypeObservable = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.entities.DataState<io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.Transaction> transactionStatus;
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.entities.DataState<io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.Transaction>> transactionStatusSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<io.horizontalsystems.bankwallet.entities.DataState<io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.Transaction>> transactionStatusObservable = null;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final io.horizontalsystems.ethereumkit.core.EthereumKit evmKit = null;
    private final io.horizontalsystems.bankwallet.core.IFeeRateProvider feeRateProvider = null;
    private final int gasLimitSurchargePercent = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.lang.Boolean> getWarningOfStuckObservable() {
        return null;
    }
    
    public final boolean getHasEstimatedFee() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.ethereumkit.models.TransactionData getTransactionData() {
        return null;
    }
    
    public final void setTransactionData(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.ethereumkit.models.TransactionData value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasPriceType getGasPriceType() {
        return null;
    }
    
    public final void setGasPriceType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasPriceType value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasPriceType> getGasPriceTypeObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.DataState<io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.Transaction> getTransactionStatus() {
        return null;
    }
    
    public final void setTransactionStatus(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.DataState<io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.Transaction> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<io.horizontalsystems.bankwallet.entities.DataState<io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.Transaction>> getTransactionStatusObservable() {
        return null;
    }
    
    private final java.math.BigInteger getEvmBalance() {
        return null;
    }
    
    public final void onCleared() {
    }
    
    private final void sync() {
    }
    
    private final io.reactivex.Single<io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.Transaction> getTransactionAsync(java.math.BigInteger gasPrice, io.horizontalsystems.ethereumkit.models.TransactionData transactionData) {
        return null;
    }
    
    private final io.reactivex.Single<io.horizontalsystems.ethereumkit.models.TransactionData> getAdjustedTransactionDataAsync(java.math.BigInteger gasPrice, io.horizontalsystems.ethereumkit.models.TransactionData transactionData) {
        return null;
    }
    
    private final io.reactivex.Single<java.math.BigInteger> getGasPriceAsync(io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasPriceType gasPriceType) {
        return null;
    }
    
    private final io.reactivex.Single<java.lang.Long> getGasLimitAsync(java.math.BigInteger gasPrice, io.horizontalsystems.ethereumkit.models.TransactionData transactionData) {
        return null;
    }
    
    private final long getSurchargedGasLimit(long estimatedGasLimit) {
        return 0L;
    }
    
    public EvmTransactionService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.core.EthereumKit evmKit, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IFeeRateProvider feeRateProvider, int gasLimitSurchargePercent) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasData;", "", "estimatedGasLimit", "", "gasLimit", "gasPrice", "(JJJ)V", "estimatedFee", "Ljava/math/BigInteger;", "getEstimatedFee", "()Ljava/math/BigInteger;", "getEstimatedGasLimit", "()J", "fee", "getFee", "getGasLimit", "getGasPrice", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class GasData {
        private final long estimatedGasLimit = 0L;
        private final long gasLimit = 0L;
        private final long gasPrice = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigInteger getEstimatedFee() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigInteger getFee() {
            return null;
        }
        
        public final long getEstimatedGasLimit() {
            return 0L;
        }
        
        public final long getGasLimit() {
            return 0L;
        }
        
        public final long getGasPrice() {
            return 0L;
        }
        
        public GasData(long estimatedGasLimit, long gasLimit, long gasPrice) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long component3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasData copy(long estimatedGasLimit, long gasLimit, long gasPrice) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$Transaction;", "", "data", "Lio/horizontalsystems/ethereumkit/models/TransactionData;", "gasData", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasData;", "(Lio/horizontalsystems/ethereumkit/models/TransactionData;Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasData;)V", "getData", "()Lio/horizontalsystems/ethereumkit/models/TransactionData;", "getGasData", "()Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasData;", "totalAmount", "Ljava/math/BigInteger;", "getTotalAmount", "()Ljava/math/BigInteger;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Transaction {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.ethereumkit.models.TransactionData data = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasData gasData = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigInteger getTotalAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.ethereumkit.models.TransactionData getData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasData getGasData() {
            return null;
        }
        
        public Transaction(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.ethereumkit.models.TransactionData data, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasData gasData) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.ethereumkit.models.TransactionData component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasData component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.Transaction copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.ethereumkit.models.TransactionData data, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasData gasData) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasPriceType;", "", "()V", "Custom", "Recommended", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasPriceType$Recommended;", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasPriceType$Custom;", "app_debug"})
    public static abstract class GasPriceType {
        
        private GasPriceType() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasPriceType$Recommended;", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasPriceType;", "()V", "app_debug"})
        public static final class Recommended extends io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasPriceType {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasPriceType.Recommended INSTANCE = null;
            
            private Recommended() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasPriceType$Custom;", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasPriceType;", "gasPrice", "", "(J)V", "getGasPrice", "()J", "app_debug"})
        public static final class Custom extends io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasPriceType {
            private final long gasPrice = 0L;
            
            public final long getGasPrice() {
                return 0L;
            }
            
            public Custom(long gasPrice) {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasDataError;", "Ljava/lang/Error;", "Lkotlin/Error;", "()V", "InsufficientBalance", "NoTransactionData", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasDataError$NoTransactionData;", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasDataError$InsufficientBalance;", "app_debug"})
    public static abstract class GasDataError extends java.lang.Error {
        
        private GasDataError() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasDataError$NoTransactionData;", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasDataError;", "()V", "app_debug"})
        public static final class NoTransactionData extends io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasDataError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasDataError.NoTransactionData INSTANCE = null;
            
            private NoTransactionData() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasDataError$InsufficientBalance;", "Lio/horizontalsystems/bankwallet/core/ethereum/EvmTransactionService$GasDataError;", "()V", "app_debug"})
        public static final class InsufficientBalance extends io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasDataError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.core.ethereum.EvmTransactionService.GasDataError.InsufficientBalance INSTANCE = null;
            
            private InsufficientBalance() {
                super();
            }
        }
    }
}