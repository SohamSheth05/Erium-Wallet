package io.horizontalsystems.bankwallet.modules.market.posts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0006\u0010\u0019\u001a\u00020\u0017J\b\u0010\u001a\u001a\u00020\u0017H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/posts/MarketPostService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "Lio/horizontalsystems/core/BackgroundManager$Listener;", "postManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "backgroundManager", "Lio/horizontalsystems/core/BackgroundManager;", "(Lio/horizontalsystems/bankwallet/core/IRateManager;Lio/horizontalsystems/core/BackgroundManager;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "newsItems", "", "Lio/horizontalsystems/xrateskit2/entities/CryptoNews;", "getNewsItems", "()Ljava/util/List;", "setNewsItems", "(Ljava/util/List;)V", "stateObservable", "Lio/reactivex/subjects/BehaviorSubject;", "Lio/horizontalsystems/bankwallet/modules/market/posts/MarketPostService$State;", "getStateObservable", "()Lio/reactivex/subjects/BehaviorSubject;", "clear", "", "fetchPosts", "refresh", "willEnterForeground", "State", "app_debug"})
public final class MarketPostService implements io.horizontalsystems.bankwallet.core.Clearable, io.horizontalsystems.core.BackgroundManager.Listener {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.modules.market.posts.MarketPostService.State> stateObservable = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<io.horizontalsystems.xrateskit2.entities.CryptoNews> newsItems;
    private io.reactivex.disposables.Disposable disposable;
    private final io.horizontalsystems.bankwallet.core.IRateManager postManager = null;
    private final io.horizontalsystems.core.BackgroundManager backgroundManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.modules.market.posts.MarketPostService.State> getStateObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.xrateskit2.entities.CryptoNews> getNewsItems() {
        return null;
    }
    
    public final void setNewsItems(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.xrateskit2.entities.CryptoNews> p0) {
    }
    
    private final void fetchPosts() {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    @java.lang.Override()
    public void willEnterForeground() {
    }
    
    public final void refresh() {
    }
    
    public MarketPostService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager postManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.BackgroundManager backgroundManager) {
        super();
    }
    
    public void willEnterForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public void didEnterBackground() {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/posts/MarketPostService$State;", "", "()V", "Failed", "Loaded", "Loading", "Lio/horizontalsystems/bankwallet/modules/market/posts/MarketPostService$State$Loaded;", "Lio/horizontalsystems/bankwallet/modules/market/posts/MarketPostService$State$Loading;", "Lio/horizontalsystems/bankwallet/modules/market/posts/MarketPostService$State$Failed;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/posts/MarketPostService$State$Loaded;", "Lio/horizontalsystems/bankwallet/modules/market/posts/MarketPostService$State;", "()V", "app_debug"})
        public static final class Loaded extends io.horizontalsystems.bankwallet.modules.market.posts.MarketPostService.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.market.posts.MarketPostService.State.Loaded INSTANCE = null;
            
            private Loaded() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/posts/MarketPostService$State$Loading;", "Lio/horizontalsystems/bankwallet/modules/market/posts/MarketPostService$State;", "()V", "app_debug"})
        public static final class Loading extends io.horizontalsystems.bankwallet.modules.market.posts.MarketPostService.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.market.posts.MarketPostService.State.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/posts/MarketPostService$State$Failed;", "Lio/horizontalsystems/bankwallet/modules/market/posts/MarketPostService$State;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "app_debug"})
        public static final class Failed extends io.horizontalsystems.bankwallet.modules.market.posts.MarketPostService.State {
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
}