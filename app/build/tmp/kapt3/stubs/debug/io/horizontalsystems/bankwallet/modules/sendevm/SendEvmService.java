package io.horizontalsystems.bankwallet.modules.sendevm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003JKLB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010D\u001a\u000202H\u0016J\u0010\u0010E\u001a\u0002022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010F\u001a\u0002022\b\u0010G\u001a\u0004\u0018\u000108H\u0016J\u0010\u0010F\u001a\u0002022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010H\u001a\u000202H\u0002J\u0010\u0010I\u001a\u0002062\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \u0016*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00150\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u001c\u0010\u0012R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00150\u001e8F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R(\u0010!\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \u0016*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00150\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010 R\u0014\u0010$\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u001aR\u0014\u0010&\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u001aR\u0014\u0010(\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010*R \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00150\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010 R\u0016\u0010-\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u000202018VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b3\u00104R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u00107\u001a\u0004\u0018\u0001088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b9\u0010:R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010<\u001a\u00020;2\u0006\u0010\u000e\u001a\u00020;@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020;0\u001e8F\u00a2\u0006\u0006\u001a\u0004\bB\u0010 R\u001c\u0010C\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010;0;0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006M"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService;", "Lio/horizontalsystems/bankwallet/modules/sendevm/IAvailableBalanceService;", "Lio/horizontalsystems/bankwallet/modules/sendevm/IAmountInputService;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/IRecipientAddressService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "sendCoin", "Lio/horizontalsystems/coinkit2/models/Coin;", "adapter", "Lio/horizontalsystems/bankwallet/core/ISendEthereumAdapter;", "(Lio/horizontalsystems/coinkit2/models/Coin;Lio/horizontalsystems/bankwallet/core/ISendEthereumAdapter;)V", "getAdapter", "()Lio/horizontalsystems/bankwallet/core/ISendEthereumAdapter;", "addressData", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$AddressData;", "value", "", "addressError", "setAddressError", "(Ljava/lang/Throwable;)V", "addressErrorSubject", "Lio/reactivex/subjects/PublishSubject;", "Ljava/util/Optional;", "kotlin.jvm.PlatformType", "amount", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "amountError", "setAmountError", "amountErrorObservable", "Lio/reactivex/Flowable;", "getAmountErrorObservable", "()Lio/reactivex/Flowable;", "amountErrorSubject", "amountObservable", "getAmountObservable", "availableBalance", "getAvailableBalance", "balance", "getBalance", "coin", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "coinObservable", "getCoinObservable", "error", "getError", "()Ljava/lang/Throwable;", "errorObservable", "Lio/reactivex/Observable;", "", "getErrorObservable", "()Lio/reactivex/Observable;", "evmAmount", "Ljava/math/BigInteger;", "initialAddress", "Lio/horizontalsystems/bankwallet/entities/Address;", "getInitialAddress", "()Lio/horizontalsystems/bankwallet/entities/Address;", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$State;", "state", "getState", "()Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$State;", "setState", "(Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$State;)V", "stateObservable", "getStateObservable", "stateSubject", "clear", "onChangeAmount", "set", "address", "syncState", "validEvmAmount", "AddressData", "AmountError", "State", "app_debug"})
public final class SendEvmService implements io.horizontalsystems.bankwallet.modules.sendevm.IAvailableBalanceService, io.horizontalsystems.bankwallet.modules.sendevm.IAmountInputService, io.horizontalsystems.bankwallet.modules.swap.tradeoptions.IRecipientAddressService, io.horizontalsystems.bankwallet.core.Clearable {
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService.State> stateSubject = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService.State state;
    private java.math.BigInteger evmAmount;
    private io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService.AddressData addressData;
    private final io.reactivex.subjects.PublishSubject<java.util.Optional<java.lang.Throwable>> amountErrorSubject = null;
    private java.lang.Throwable amountError;
    private final io.reactivex.subjects.PublishSubject<java.util.Optional<java.lang.Throwable>> addressErrorSubject = null;
    private java.lang.Throwable addressError;
    private final io.horizontalsystems.coinkit2.models.Coin sendCoin = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.core.ISendEthereumAdapter adapter = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService.State getState() {
        return null;
    }
    
    private final void setState(io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService.State value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService.State> getStateObservable() {
        return null;
    }
    
    private final void setAmountError(java.lang.Throwable value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.Optional<java.lang.Throwable>> getAmountErrorObservable() {
        return null;
    }
    
    private final void setAddressError(java.lang.Throwable value) {
    }
    
    private final void syncState() {
    }
    
    private final java.math.BigInteger validEvmAmount(java.math.BigDecimal amount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getAvailableBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.coinkit2.models.Coin getCoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.math.BigDecimal> getAmountObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.Optional<io.horizontalsystems.coinkit2.models.Coin>> getCoinObservable() {
        return null;
    }
    
    @java.lang.Override()
    public void onChangeAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.Address getInitialAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Throwable getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<kotlin.Unit> getErrorObservable() {
        return null;
    }
    
    @java.lang.Override()
    public void set(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.Address address) {
    }
    
    @java.lang.Override()
    public void set(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.core.ISendEthereumAdapter getAdapter() {
        return null;
    }
    
    public SendEvmService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin sendCoin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ISendEthereumAdapter adapter) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$State;", "", "()V", "NotReady", "Ready", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$State$Ready;", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$State$NotReady;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$State$Ready;", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$State;", "sendData", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData;", "(Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData;)V", "getSendData", "()Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmData;", "app_debug"})
        public static final class Ready extends io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService.State {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData sendData = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData getSendData() {
                return null;
            }
            
            public Ready(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.modules.sendevm.SendEvmData sendData) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$State$NotReady;", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$State;", "()V", "app_debug"})
        public static final class NotReady extends io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService.State.NotReady INSTANCE = null;
            
            private NotReady() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$AmountError;", "", "()V", "InsufficientBalance", "InvalidDecimal", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$AmountError$InvalidDecimal;", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$AmountError$InsufficientBalance;", "app_debug"})
    public static abstract class AmountError extends java.lang.Throwable {
        
        private AmountError() {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$AmountError$InvalidDecimal;", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$AmountError;", "()V", "app_debug"})
        public static final class InvalidDecimal extends io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService.AmountError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService.AmountError.InvalidDecimal INSTANCE = null;
            
            private InvalidDecimal() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$AmountError$InsufficientBalance;", "Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$AmountError;", "()V", "getLocalizedMessage", "", "app_debug"})
        public static final class InsufficientBalance extends io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService.AmountError {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService.AmountError.InsufficientBalance INSTANCE = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getLocalizedMessage() {
                return null;
            }
            
            private InsufficientBalance() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/sendevm/SendEvmService$AddressData;", "", "evmAddress", "Lio/horizontalsystems/ethereumkit/models/Address;", "domain", "", "(Lio/horizontalsystems/ethereumkit/models/Address;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getEvmAddress", "()Lio/horizontalsystems/ethereumkit/models/Address;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class AddressData {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.ethereumkit.models.Address evmAddress = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String domain = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.ethereumkit.models.Address getEvmAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDomain() {
            return null;
        }
        
        public AddressData(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.ethereumkit.models.Address evmAddress, @org.jetbrains.annotations.Nullable()
        java.lang.String domain) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.ethereumkit.models.Address component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.sendevm.SendEvmService.AddressData copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.ethereumkit.models.Address evmAddress, @org.jetbrains.annotations.Nullable()
        java.lang.String domain) {
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
}