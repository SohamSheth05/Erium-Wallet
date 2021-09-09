package io.horizontalsystems.bankwallet.modules.market.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0006\u0010\u001a\u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/list/MarketListService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "fetcher", "Lio/horizontalsystems/bankwallet/modules/market/list/IMarketListFetcher;", "currencyManager", "Lio/horizontalsystems/core/ICurrencyManager;", "(Lio/horizontalsystems/bankwallet/modules/market/list/IMarketListFetcher;Lio/horizontalsystems/core/ICurrencyManager;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "marketItems", "", "Lio/horizontalsystems/bankwallet/modules/market/MarketItem;", "getMarketItems", "()Ljava/util/List;", "setMarketItems", "(Ljava/util/List;)V", "stateObservable", "Lio/reactivex/subjects/BehaviorSubject;", "Lio/horizontalsystems/bankwallet/modules/market/list/MarketListService$State;", "getStateObservable", "()Lio/reactivex/subjects/BehaviorSubject;", "topItemsDisposable", "Lio/reactivex/disposables/Disposable;", "clear", "", "fetch", "refresh", "State", "app_debug"})
public final class MarketListService implements io.horizontalsystems.bankwallet.core.Clearable {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.modules.market.list.MarketListService.State> stateObservable = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<io.horizontalsystems.bankwallet.modules.market.MarketItem> marketItems;
    private io.reactivex.disposables.Disposable topItemsDisposable;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final io.horizontalsystems.bankwallet.modules.market.list.IMarketListFetcher fetcher = null;
    private final io.horizontalsystems.core.ICurrencyManager currencyManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.modules.market.list.MarketListService.State> getStateObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.market.MarketItem> getMarketItems() {
        return null;
    }
    
    public final void setMarketItems(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.market.MarketItem> p0) {
    }
    
    public final void refresh() {
    }
    
    private final void fetch() {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public MarketListService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.list.IMarketListFetcher fetcher, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ICurrencyManager currencyManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/list/MarketListService$State;", "", "()V", "Error", "Loaded", "Loading", "Lio/horizontalsystems/bankwallet/modules/market/list/MarketListService$State$Loading;", "Lio/horizontalsystems/bankwallet/modules/market/list/MarketListService$State$Loaded;", "Lio/horizontalsystems/bankwallet/modules/market/list/MarketListService$State$Error;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/list/MarketListService$State$Loading;", "Lio/horizontalsystems/bankwallet/modules/market/list/MarketListService$State;", "()V", "app_debug"})
        public static final class Loading extends io.horizontalsystems.bankwallet.modules.market.list.MarketListService.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.market.list.MarketListService.State.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/list/MarketListService$State$Loaded;", "Lio/horizontalsystems/bankwallet/modules/market/list/MarketListService$State;", "()V", "app_debug"})
        public static final class Loaded extends io.horizontalsystems.bankwallet.modules.market.list.MarketListService.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.market.list.MarketListService.State.Loaded INSTANCE = null;
            
            private Loaded() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/list/MarketListService$State$Error;", "Lio/horizontalsystems/bankwallet/modules/market/list/MarketListService$State;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Error extends io.horizontalsystems.bankwallet.modules.market.list.MarketListService.State {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable error = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getError() {
                return null;
            }
            
            public Error(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.modules.market.list.MarketListService.State.Error copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error) {
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
}