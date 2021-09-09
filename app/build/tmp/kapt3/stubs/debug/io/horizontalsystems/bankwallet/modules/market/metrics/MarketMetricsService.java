package io.horizontalsystems.bankwallet.modules.market.metrics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0006\u0010\u0015\u001a\u00020\u0013J\b\u0010\u0016\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/metrics/MarketMetricsService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "Lio/horizontalsystems/core/BackgroundManager$Listener;", "xRateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "backgroundManager", "Lio/horizontalsystems/core/BackgroundManager;", "currencyManager", "Lio/horizontalsystems/core/ICurrencyManager;", "(Lio/horizontalsystems/bankwallet/core/IRateManager;Lio/horizontalsystems/core/BackgroundManager;Lio/horizontalsystems/core/ICurrencyManager;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "marketMetricsObservable", "Lio/reactivex/subjects/BehaviorSubject;", "Lio/horizontalsystems/bankwallet/entities/DataState;", "Lio/horizontalsystems/bankwallet/modules/market/metrics/MarketMetricsItem;", "getMarketMetricsObservable", "()Lio/reactivex/subjects/BehaviorSubject;", "clear", "", "fetchMarketMetrics", "refresh", "willEnterForeground", "app_debug"})
public final class MarketMetricsService implements io.horizontalsystems.bankwallet.core.Clearable, io.horizontalsystems.core.BackgroundManager.Listener {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.entities.DataState<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsItem>> marketMetricsObservable = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final io.horizontalsystems.bankwallet.core.IRateManager xRateManager = null;
    private final io.horizontalsystems.core.BackgroundManager backgroundManager = null;
    private final io.horizontalsystems.core.ICurrencyManager currencyManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.entities.DataState<io.horizontalsystems.bankwallet.modules.market.metrics.MarketMetricsItem>> getMarketMetricsObservable() {
        return null;
    }
    
    @java.lang.Override()
    public void willEnterForeground() {
    }
    
    public final void refresh() {
    }
    
    private final void fetchMarketMetrics() {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public MarketMetricsService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager xRateManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.BackgroundManager backgroundManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ICurrencyManager currencyManager) {
        super();
    }
    
    public void willEnterForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public void didEnterBackground() {
    }
}