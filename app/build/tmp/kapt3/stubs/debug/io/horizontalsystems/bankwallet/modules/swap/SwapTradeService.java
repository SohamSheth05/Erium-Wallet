package io.horizontalsystems.bankwallet.modules.swap;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 _2\u00020\u0001:\u0004_`abB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010\n2\b\u0010N\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010\nJ\u0010\u0010R\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010\nJ\u0010\u0010S\u001a\u00020P2\b\u0010T\u001a\u0004\u0018\u00010\u0007J\u0010\u0010U\u001a\u00020P2\b\u0010T\u001a\u0004\u0018\u00010\u0007J\u0010\u0010V\u001a\u00020P2\u0006\u0010W\u001a\u00020XH\u0002J\u0006\u0010Y\u001a\u00020PJ\u0006\u0010Z\u001a\u00020PJ\b\u0010[\u001a\u00020PH\u0002J\b\u0010\\\u001a\u00020PH\u0002J\u000e\u0010]\u001a\u00020^2\u0006\u0010W\u001a\u00020XR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u0017*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00120\u00120\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0018\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R(\u0010\u001d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u0017*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00120\u00120\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014R(\u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0017*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00120\u00120\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010%\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b\'\u0010!R\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0014R(\u0010*\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0017*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00120\u00120\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010.\u001a\u00020-2\u0006\u0010\t\u001a\u00020-@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020-0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0014R\u001c\u00105\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010-0-0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010:\u001a\u0002092\u0006\u0010\t\u001a\u000209@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u0002090\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0014R\u001c\u0010A\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u000109090\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010C\u001a\u00020B2\u0006\u0010\t\u001a\u00020B@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020B0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0014R\u001c\u0010J\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010B0B0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006c"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService;", "", "evmKit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "uniswapProvider", "Lio/horizontalsystems/bankwallet/modules/swap/providers/UniswapProvider;", "coinFrom", "Lio/horizontalsystems/coinkit2/models/Coin;", "(Lio/horizontalsystems/ethereumkit/core/EthereumKit;Lio/horizontalsystems/bankwallet/modules/swap/providers/UniswapProvider;Lio/horizontalsystems/coinkit2/models/Coin;)V", "value", "Ljava/math/BigDecimal;", "amountFrom", "getAmountFrom", "()Ljava/math/BigDecimal;", "setAmountFrom", "(Ljava/math/BigDecimal;)V", "amountFromObservable", "Lio/reactivex/Observable;", "Ljava/util/Optional;", "getAmountFromObservable", "()Lio/reactivex/Observable;", "amountFromSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "amountTo", "getAmountTo", "setAmountTo", "amountToObservable", "getAmountToObservable", "amountToSubject", "getCoinFrom", "()Lio/horizontalsystems/coinkit2/models/Coin;", "setCoinFrom", "(Lio/horizontalsystems/coinkit2/models/Coin;)V", "coinFromObservable", "getCoinFromObservable", "coinFromSubject", "coinTo", "getCoinTo", "setCoinTo", "coinToObservable", "getCoinToObservable", "coinToSubject", "lastBlockDisposable", "Lio/reactivex/disposables/Disposable;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$State;", "state", "getState", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$State;", "setState", "(Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$State;)V", "stateObservable", "getStateObservable", "stateSubject", "swapData", "Lio/horizontalsystems/uniswapkit/models/SwapData;", "swapDataDisposable", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptions;", "tradeOptions", "getTradeOptions", "()Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptions;", "setTradeOptions", "(Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/SwapTradeOptions;)V", "tradeOptionsObservable", "getTradeOptionsObservable", "tradeOptionsSubject", "Lio/horizontalsystems/uniswapkit/models/TradeType;", "tradeType", "getTradeType", "()Lio/horizontalsystems/uniswapkit/models/TradeType;", "setTradeType", "(Lio/horizontalsystems/uniswapkit/models/TradeType;)V", "tradeTypeObservable", "getTradeTypeObservable", "tradeTypeSubject", "amountsEqual", "", "amount1", "amount2", "enterAmountFrom", "", "amount", "enterAmountTo", "enterCoinFrom", "coin", "enterCoinTo", "handle", "tradeData", "Lio/horizontalsystems/uniswapkit/models/TradeData;", "onCleared", "switchCoins", "syncSwapData", "syncTradeData", "transactionData", "Lio/horizontalsystems/ethereumkit/models/TransactionData;", "Companion", "PriceImpactLevel", "State", "Trade", "app_debug"})
public final class SwapTradeService {
    private io.reactivex.disposables.Disposable swapDataDisposable;
    private io.reactivex.disposables.Disposable lastBlockDisposable;
    private io.horizontalsystems.uniswapkit.models.SwapData swapData;
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.uniswapkit.models.TradeType> tradeTypeSubject = null;
    private final io.reactivex.subjects.PublishSubject<java.util.Optional<io.horizontalsystems.coinkit2.models.Coin>> coinFromSubject = null;
    private final io.reactivex.subjects.PublishSubject<java.util.Optional<io.horizontalsystems.coinkit2.models.Coin>> coinToSubject = null;
    private final io.reactivex.subjects.PublishSubject<java.util.Optional<java.math.BigDecimal>> amountFromSubject = null;
    private final io.reactivex.subjects.PublishSubject<java.util.Optional<java.math.BigDecimal>> amountToSubject = null;
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.State> stateSubject = null;
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptions> tradeOptionsSubject = null;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.coinkit2.models.Coin coinFrom;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.util.Optional<io.horizontalsystems.coinkit2.models.Coin>> coinFromObservable = null;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.coinkit2.models.Coin coinTo;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.util.Optional<io.horizontalsystems.coinkit2.models.Coin>> coinToObservable = null;
    @org.jetbrains.annotations.Nullable()
    private java.math.BigDecimal amountFrom;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.util.Optional<java.math.BigDecimal>> amountFromObservable = null;
    @org.jetbrains.annotations.Nullable()
    private java.math.BigDecimal amountTo;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<java.util.Optional<java.math.BigDecimal>> amountToObservable = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.uniswapkit.models.TradeType tradeType = io.horizontalsystems.uniswapkit.models.TradeType.ExactIn;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<io.horizontalsystems.uniswapkit.models.TradeType> tradeTypeObservable = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.State state;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.State> stateObservable = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptions tradeOptions;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptions> tradeOptionsObservable = null;
    private final io.horizontalsystems.bankwallet.modules.swap.providers.UniswapProvider uniswapProvider = null;
    private static final java.math.BigDecimal warningPriceImpact = null;
    private static final java.math.BigDecimal forbiddenPriceImpact = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.coinkit2.models.Coin getCoinFrom() {
        return null;
    }
    
    private final void setCoinFrom(io.horizontalsystems.coinkit2.models.Coin value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.Optional<io.horizontalsystems.coinkit2.models.Coin>> getCoinFromObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.coinkit2.models.Coin getCoinTo() {
        return null;
    }
    
    private final void setCoinTo(io.horizontalsystems.coinkit2.models.Coin value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.Optional<io.horizontalsystems.coinkit2.models.Coin>> getCoinToObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal getAmountFrom() {
        return null;
    }
    
    private final void setAmountFrom(java.math.BigDecimal value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.Optional<java.math.BigDecimal>> getAmountFromObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal getAmountTo() {
        return null;
    }
    
    private final void setAmountTo(java.math.BigDecimal value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.Optional<java.math.BigDecimal>> getAmountToObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.uniswapkit.models.TradeType getTradeType() {
        return null;
    }
    
    private final void setTradeType(io.horizontalsystems.uniswapkit.models.TradeType value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<io.horizontalsystems.uniswapkit.models.TradeType> getTradeTypeObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.State getState() {
        return null;
    }
    
    private final void setState(io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.State value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.State> getStateObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptions getTradeOptions() {
        return null;
    }
    
    public final void setTradeOptions(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptions value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.SwapTradeOptions> getTradeOptionsObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.ethereumkit.models.TransactionData transactionData(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.uniswapkit.models.TradeData tradeData) {
        return null;
    }
    
    public final void enterCoinFrom(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public final void enterCoinTo(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public final void enterAmountFrom(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal amount) {
    }
    
    public final void enterAmountTo(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal amount) {
    }
    
    public final void switchCoins() {
    }
    
    public final void onCleared() {
    }
    
    private final void syncSwapData() {
    }
    
    private final void syncTradeData() {
    }
    
    private final void handle(io.horizontalsystems.uniswapkit.models.TradeData tradeData) {
    }
    
    private final boolean amountsEqual(java.math.BigDecimal amount1, java.math.BigDecimal amount2) {
        return false;
    }
    
    public SwapTradeService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.core.EthereumKit evmKit, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.swap.providers.UniswapProvider uniswapProvider, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.coinkit2.models.Coin coinFrom) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$State;", "", "()V", "Loading", "NotReady", "Ready", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$State$Loading;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$State$Ready;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$State$NotReady;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$State$Loading;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$State;", "()V", "app_debug"})
        public static final class Loading extends io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.State.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$State$Ready;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$State;", "trade", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$Trade;", "(Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$Trade;)V", "getTrade", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$Trade;", "app_debug"})
        public static final class Ready extends io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.State {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.Trade trade = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.Trade getTrade() {
                return null;
            }
            
            public Ready(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.Trade trade) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$State$NotReady;", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$State;", "errors", "", "", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "app_debug"})
        public static final class NotReady extends io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.State {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$PriceImpactLevel;", "", "(Ljava/lang/String;I)V", "Normal", "Warning", "Forbidden", "app_debug"})
    public static enum PriceImpactLevel {
        /*public static final*/ Normal /* = new Normal() */,
        /*public static final*/ Warning /* = new Warning() */,
        /*public static final*/ Forbidden /* = new Forbidden() */;
        
        PriceImpactLevel() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$Trade;", "", "tradeData", "Lio/horizontalsystems/uniswapkit/models/TradeData;", "(Lio/horizontalsystems/uniswapkit/models/TradeData;)V", "priceImpactLevel", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$PriceImpactLevel;", "getPriceImpactLevel", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$PriceImpactLevel;", "getTradeData", "()Lio/horizontalsystems/uniswapkit/models/TradeData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Trade {
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.PriceImpactLevel priceImpactLevel = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.uniswapkit.models.TradeData tradeData = null;
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.PriceImpactLevel getPriceImpactLevel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.uniswapkit.models.TradeData getTradeData() {
            return null;
        }
        
        public Trade(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.uniswapkit.models.TradeData tradeData) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.uniswapkit.models.TradeData component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.Trade copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.uniswapkit.models.TradeData tradeData) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$Companion;", "", "()V", "forbiddenPriceImpact", "Ljava/math/BigDecimal;", "warningPriceImpact", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}