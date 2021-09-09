package io.horizontalsystems.bankwallet.modules.enablecoins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00029:B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.H\u0002J\u0016\u0010/\u001a\u00020%2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203J\u0016\u00104\u001a\u00020%2\f\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0010H\u0002J\u001a\u00107\u001a\u0004\u0018\u0001082\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u000e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 \u0012*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001f\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00160\u00160\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#\u00a8\u0006;"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService;", "", "appConfigProvider", "Lio/horizontalsystems/core/IBuildConfigProvider;", "coinManager", "Lio/horizontalsystems/bankwallet/core/ICoinManager;", "bep2Provider", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsBep2Provider;", "erc20Provider", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsEip20Provider;", "bep20Provider", "(Lio/horizontalsystems/core/IBuildConfigProvider;Lio/horizontalsystems/bankwallet/core/ICoinManager;Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsBep2Provider;Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsEip20Provider;Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsEip20Provider;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "enableCoinsAsync", "Lio/reactivex/subjects/PublishSubject;", "", "Lio/horizontalsystems/coinkit2/models/Coin;", "kotlin.jvm.PlatformType", "getEnableCoinsAsync", "()Lio/reactivex/subjects/PublishSubject;", "value", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State;", "state", "getState", "()Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State;", "setState", "(Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State;)V", "stateAsync", "Lio/reactivex/subjects/BehaviorSubject;", "getStateAsync", "()Lio/reactivex/subjects/BehaviorSubject;", "testMode", "", "getTestMode", "()Z", "approveEnable", "", "fetchBep20Tokens", "bep20", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$TokenType$Bep20;", "fetchBep2Tokens", "bep2", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$TokenType$Bep2;", "fetchErc20Tokens", "erc20", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$TokenType$Erc20;", "handle", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "accountType", "Lio/horizontalsystems/bankwallet/entities/AccountType;", "handleFetchBep2", "tokenSymbols", "", "resolveTokenType", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$TokenType;", "State", "TokenType", "app_debug"})
public final class EnableCoinsService {
    private final boolean testMode = false;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<java.util.List<io.horizontalsystems.coinkit2.models.Coin>> enableCoinsAsync = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.State> stateAsync = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.State state;
    private io.reactivex.disposables.CompositeDisposable disposables;
    private final io.horizontalsystems.bankwallet.core.ICoinManager coinManager = null;
    private final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsBep2Provider bep2Provider = null;
    private final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsEip20Provider erc20Provider = null;
    private final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsEip20Provider bep20Provider = null;
    
    public final boolean getTestMode() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<java.util.List<io.horizontalsystems.coinkit2.models.Coin>> getEnableCoinsAsync() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.State> getStateAsync() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.State getState() {
        return null;
    }
    
    private final void setState(io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.State value) {
    }
    
    public final void handle(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.AccountType accountType) {
    }
    
    public final void approveEnable() {
    }
    
    private final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.TokenType resolveTokenType(io.horizontalsystems.coinkit2.models.CoinType coinType, io.horizontalsystems.bankwallet.entities.AccountType accountType) {
        return null;
    }
    
    private final void fetchBep20Tokens(io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.TokenType.Bep20 bep20) {
    }
    
    private final void fetchErc20Tokens(io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.TokenType.Erc20 erc20) {
    }
    
    private final void fetchBep2Tokens(io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.TokenType.Bep2 bep2) {
    }
    
    private final void handleFetchBep2(java.util.List<java.lang.String> tokenSymbols) {
    }
    
    public EnableCoinsService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.IBuildConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ICoinManager coinManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsBep2Provider bep2Provider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsEip20Provider erc20Provider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsEip20Provider bep20Provider) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State;", "", "()V", "Failure", "Idle", "Loading", "Success", "WaitingForApprove", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State$Idle;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State$WaitingForApprove;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State$Loading;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State$Success;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State$Failure;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State$Idle;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State;", "()V", "app_debug"})
        public static final class Idle extends io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.State.Idle INSTANCE = null;
            
            private Idle() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State$WaitingForApprove;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State;", "tokenType", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$TokenType;", "(Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$TokenType;)V", "getTokenType", "()Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$TokenType;", "app_debug"})
        public static final class WaitingForApprove extends io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.State {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.TokenType tokenType = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.TokenType getTokenType() {
                return null;
            }
            
            public WaitingForApprove(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.TokenType tokenType) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State$Loading;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State;", "()V", "app_debug"})
        public static final class Loading extends io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.State.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State$Success;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State;", "coins", "", "Lio/horizontalsystems/coinkit2/models/Coin;", "(Ljava/util/List;)V", "getCoins", "()Ljava/util/List;", "app_debug"})
        public static final class Success extends io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.State {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<io.horizontalsystems.coinkit2.models.Coin> coins = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<io.horizontalsystems.coinkit2.models.Coin> getCoins() {
                return null;
            }
            
            public Success(@org.jetbrains.annotations.NotNull()
            java.util.List<io.horizontalsystems.coinkit2.models.Coin> coins) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State$Failure;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$State;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "app_debug"})
        public static final class Failure extends io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.State {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable error = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getError() {
                return null;
            }
            
            public Failure(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error) {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$TokenType;", "", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "Bep2", "Bep20", "Erc20", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$TokenType$Erc20;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$TokenType$Bep2;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$TokenType$Bep20;", "app_debug"})
    public static abstract class TokenType {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        private TokenType() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$TokenType$Erc20;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$TokenType;", "words", "", "", "passphrase", "(Ljava/util/List;Ljava/lang/String;)V", "getPassphrase", "()Ljava/lang/String;", "getWords", "()Ljava/util/List;", "app_debug"})
        public static final class Erc20 extends io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.TokenType {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<java.lang.String> words = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String passphrase = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<java.lang.String> getWords() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getPassphrase() {
                return null;
            }
            
            public Erc20(@org.jetbrains.annotations.NotNull()
            java.util.List<java.lang.String> words, @org.jetbrains.annotations.NotNull()
            java.lang.String passphrase) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$TokenType$Bep2;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$TokenType;", "words", "", "", "passphrase", "(Ljava/util/List;Ljava/lang/String;)V", "getPassphrase", "()Ljava/lang/String;", "getWords", "()Ljava/util/List;", "app_debug"})
        public static final class Bep2 extends io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.TokenType {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<java.lang.String> words = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String passphrase = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<java.lang.String> getWords() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getPassphrase() {
                return null;
            }
            
            public Bep2(@org.jetbrains.annotations.NotNull()
            java.util.List<java.lang.String> words, @org.jetbrains.annotations.NotNull()
            java.lang.String passphrase) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$TokenType$Bep20;", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsService$TokenType;", "words", "", "", "passphrase", "(Ljava/util/List;Ljava/lang/String;)V", "getPassphrase", "()Ljava/lang/String;", "getWords", "()Ljava/util/List;", "app_debug"})
        public static final class Bep20 extends io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsService.TokenType {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<java.lang.String> words = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String passphrase = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<java.lang.String> getWords() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getPassphrase() {
                return null;
            }
            
            public Bep20(@org.jetbrains.annotations.NotNull()
            java.util.List<java.lang.String> words, @org.jetbrains.annotations.NotNull()
            java.lang.String passphrase) {
                super();
            }
        }
    }
}