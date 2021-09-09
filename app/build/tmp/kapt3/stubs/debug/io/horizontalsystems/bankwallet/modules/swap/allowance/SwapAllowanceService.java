package io.horizontalsystems.bankwallet.modules.swap.allowance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002()B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020%2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\'\u001a\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR(\u0010\u001b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010 \u001d*\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00180\u00180\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService;", "", "spenderAddress", "Lio/horizontalsystems/ethereumkit/models/Address;", "adapterManager", "Lio/horizontalsystems/bankwallet/core/IAdapterManager;", "ethereumKit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "(Lio/horizontalsystems/ethereumkit/models/Address;Lio/horizontalsystems/bankwallet/core/IAdapterManager;Lio/horizontalsystems/ethereumkit/core/EthereumKit;)V", "allowanceDisposable", "Lio/reactivex/disposables/Disposable;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "value", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$State;", "state", "getState", "()Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$State;", "setState", "(Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$State;)V", "stateObservable", "Lio/reactivex/Observable;", "Ljava/util/Optional;", "getStateObservable", "()Lio/reactivex/Observable;", "stateSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "approveData", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$ApproveData;", "dex", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Dex;", "amount", "Ljava/math/BigDecimal;", "onCleared", "", "set", "sync", "ApproveData", "State", "app_debug"})
public final class SwapAllowanceService {
    private io.horizontalsystems.coinkit2.models.Coin coin;
    private final io.reactivex.subjects.PublishSubject<java.util.Optional<io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.State>> stateSubject = null;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.State state;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.util.Optional<io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.State>> stateObservable = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private io.reactivex.disposables.Disposable allowanceDisposable;
    private final io.horizontalsystems.ethereumkit.models.Address spenderAddress = null;
    private final io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.State getState() {
        return null;
    }
    
    private final void setState(io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.State value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.Optional<io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.State>> getStateObservable() {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.ApproveData approveData(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex dex, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount) {
        return null;
    }
    
    public final void onCleared() {
    }
    
    private final void sync() {
    }
    
    public SwapAllowanceService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.models.Address spenderAddress, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.core.EthereumKit ethereumKit) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016\u0082\u0001\u0003\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$State;", "", "()V", "equals", "", "other", "hashCode", "", "Loading", "NotReady", "Ready", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$State$Loading;", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$State$Ready;", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$State$NotReady;", "app_debug"})
    public static abstract class State {
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$State$Loading;", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$State;", "()V", "app_debug"})
        public static final class Loading extends io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.State.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$State$Ready;", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$State;", "allowance", "Lio/horizontalsystems/bankwallet/entities/CoinValue;", "(Lio/horizontalsystems/bankwallet/entities/CoinValue;)V", "getAllowance", "()Lio/horizontalsystems/bankwallet/entities/CoinValue;", "app_debug"})
        public static final class Ready extends io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.State {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.bankwallet.entities.CoinValue allowance = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.entities.CoinValue getAllowance() {
                return null;
            }
            
            public Ready(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.entities.CoinValue allowance) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$State$NotReady;", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$State;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "app_debug"})
        public static final class NotReady extends io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.State {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable error = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getError() {
                return null;
            }
            
            public NotReady(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error) {
                super();
            }
        }
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\"\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006("}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService$ApproveData;", "Landroid/os/Parcelable;", "dex", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Dex;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "spenderAddress", "", "amount", "Ljava/math/BigDecimal;", "allowance", "(Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Dex;Lio/horizontalsystems/coinkit2/models/Coin;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getAllowance", "()Ljava/math/BigDecimal;", "getAmount", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "getDex", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Dex;", "getSpenderAddress", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class ApproveData implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex dex = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.coinkit2.models.Coin coin = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String spenderAddress = null;
        @org.jetbrains.annotations.NotNull()
        private final java.math.BigDecimal amount = null;
        @org.jetbrains.annotations.NotNull()
        private final java.math.BigDecimal allowance = null;
        public static final android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.ApproveData> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex getDex() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin getCoin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSpenderAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal getAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal getAllowance() {
            return null;
        }
        
        public ApproveData(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex dex, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        java.lang.String spenderAddress, @org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
        java.math.BigDecimal allowance) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.ApproveData copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex dex, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        java.lang.String spenderAddress, @org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
        java.math.BigDecimal allowance) {
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
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.ApproveData> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.ApproveData[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService.ApproveData createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
}