package io.horizontalsystems.bankwallet.modules.enablecoins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0002J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017H\u0002J\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00170\u001a2\u0006\u0010\u0015\u001a\u00020\nR\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsEip20Provider;", "", "networkManager", "Lio/horizontalsystems/bankwallet/core/INetworkManager;", "appConfigProvider", "Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;", "mode", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsEip20Provider$EnableCoinMode;", "(Lio/horizontalsystems/bankwallet/core/INetworkManager;Lio/horizontalsystems/bankwallet/core/IAppConfigProvider;Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsEip20Provider$EnableCoinMode;)V", "apiKey", "", "getApiKey", "()Ljava/lang/String;", "url", "getUrl", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "transaction", "Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsEip20Provider$Transaction;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "address", "coins", "", "transactions", "getCoinsAsync", "Lio/reactivex/Single;", "EnableCoinMode", "Transaction", "app_debug"})
public final class EnableCoinsEip20Provider {
    private final io.horizontalsystems.bankwallet.core.INetworkManager networkManager = null;
    private final io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider = null;
    private final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsEip20Provider.EnableCoinMode mode = null;
    
    private final java.lang.String getUrl() {
        return null;
    }
    
    private final java.lang.String getApiKey() {
        return null;
    }
    
    private final io.horizontalsystems.coinkit2.models.CoinType coinType(java.lang.String address) {
        return null;
    }
    
    private final io.horizontalsystems.coinkit2.models.Coin coin(io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsEip20Provider.Transaction transaction) {
        return null;
    }
    
    private final java.util.List<io.horizontalsystems.coinkit2.models.Coin> coins(java.util.List<io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsEip20Provider.Transaction> transactions) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.util.List<io.horizontalsystems.coinkit2.models.Coin>> getCoinsAsync(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    public EnableCoinsEip20Provider(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.INetworkManager networkManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsEip20Provider.EnableCoinMode mode) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsEip20Provider$EnableCoinMode;", "", "(Ljava/lang/String;I)V", "Erc20", "Bep20", "app_debug"})
    public static enum EnableCoinMode {
        /*public static final*/ Erc20 /* = new Erc20() */,
        /*public static final*/ Bep20 /* = new Bep20() */;
        
        EnableCoinMode() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsEip20Provider$Transaction;", "", "contractAddress", "", "tokenName", "tokenSymbol", "tokenDecimal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContractAddress", "()Ljava/lang/String;", "getTokenDecimal", "getTokenName", "getTokenSymbol", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Transaction {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String contractAddress = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String tokenName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String tokenSymbol = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String tokenDecimal = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getContractAddress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTokenName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTokenSymbol() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTokenDecimal() {
            return null;
        }
        
        public Transaction(@org.jetbrains.annotations.NotNull()
        java.lang.String contractAddress, @org.jetbrains.annotations.NotNull()
        java.lang.String tokenName, @org.jetbrains.annotations.NotNull()
        java.lang.String tokenSymbol, @org.jetbrains.annotations.NotNull()
        java.lang.String tokenDecimal) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.enablecoins.EnableCoinsEip20Provider.Transaction copy(@org.jetbrains.annotations.NotNull()
        java.lang.String contractAddress, @org.jetbrains.annotations.NotNull()
        java.lang.String tokenName, @org.jetbrains.annotations.NotNull()
        java.lang.String tokenSymbol, @org.jetbrains.annotations.NotNull()
        java.lang.String tokenDecimal) {
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