package io.horizontalsystems.bankwallet.modules.market.discovery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u001d\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'()*+B/\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u0082\u0001\u001d,-./0123456789:;<=>?@ABCDEFGH\u00a8\u0006I"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "", "id", "", "titleResId", "", "iconResId", "descriptionResId", "(Ljava/lang/String;III)V", "getDescriptionResId", "()I", "getIconResId", "getId", "()Ljava/lang/String;", "getTitleResId", "AlgoStablecoins", "B2B", "Blockchains", "Computing", "CrossChain", "Dexes", "ExchangeTokens", "FanTokens", "FiatStablecoins", "FundRaising", "Gaming", "IndexFunds", "Infrastructure", "InvestmentTools", "Lending", "NFT", "Oracles", "Prediction", "Privacy", "Rated", "RebaseTokens", "RiskManagement", "Scaling", "StablecoinIssuers", "Staking", "Synthetics", "TokenizedBitcoin", "Wallets", "YieldAggregators", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Rated;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Blockchains;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Dexes;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Lending;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Privacy;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Scaling;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Oracles;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Prediction;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$YieldAggregators;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$FiatStablecoins;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$AlgoStablecoins;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$TokenizedBitcoin;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$StablecoinIssuers;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$ExchangeTokens;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$RiskManagement;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Wallets;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Synthetics;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$IndexFunds;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$NFT;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$FundRaising;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Gaming;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$B2B;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Infrastructure;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Staking;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$CrossChain;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Computing;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$RebaseTokens;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$FanTokens;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$InvestmentTools;", "app_debug"})
public abstract class MarketCategory {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    private final int titleResId = 0;
    private final int iconResId = 0;
    private final int descriptionResId = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final int getTitleResId() {
        return 0;
    }
    
    public final int getIconResId() {
        return 0;
    }
    
    public final int getDescriptionResId() {
        return 0;
    }
    
    private MarketCategory(java.lang.String id, @androidx.annotation.StringRes()
    int titleResId, @androidx.annotation.DrawableRes()
    int iconResId, @androidx.annotation.StringRes()
    int descriptionResId) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Rated;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class Rated extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.Rated INSTANCE = null;
        
        private Rated() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Blockchains;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class Blockchains extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.Blockchains INSTANCE = null;
        
        private Blockchains() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Dexes;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class Dexes extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.Dexes INSTANCE = null;
        
        private Dexes() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Lending;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class Lending extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.Lending INSTANCE = null;
        
        private Lending() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Privacy;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class Privacy extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.Privacy INSTANCE = null;
        
        private Privacy() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Scaling;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class Scaling extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.Scaling INSTANCE = null;
        
        private Scaling() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Oracles;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class Oracles extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.Oracles INSTANCE = null;
        
        private Oracles() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Prediction;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class Prediction extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.Prediction INSTANCE = null;
        
        private Prediction() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$YieldAggregators;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class YieldAggregators extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.YieldAggregators INSTANCE = null;
        
        private YieldAggregators() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$FiatStablecoins;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class FiatStablecoins extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.FiatStablecoins INSTANCE = null;
        
        private FiatStablecoins() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$AlgoStablecoins;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class AlgoStablecoins extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.AlgoStablecoins INSTANCE = null;
        
        private AlgoStablecoins() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$TokenizedBitcoin;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class TokenizedBitcoin extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.TokenizedBitcoin INSTANCE = null;
        
        private TokenizedBitcoin() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$StablecoinIssuers;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class StablecoinIssuers extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.StablecoinIssuers INSTANCE = null;
        
        private StablecoinIssuers() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$ExchangeTokens;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class ExchangeTokens extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.ExchangeTokens INSTANCE = null;
        
        private ExchangeTokens() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$RiskManagement;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class RiskManagement extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.RiskManagement INSTANCE = null;
        
        private RiskManagement() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Wallets;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class Wallets extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.Wallets INSTANCE = null;
        
        private Wallets() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Synthetics;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class Synthetics extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.Synthetics INSTANCE = null;
        
        private Synthetics() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$IndexFunds;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class IndexFunds extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.IndexFunds INSTANCE = null;
        
        private IndexFunds() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$NFT;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class NFT extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.NFT INSTANCE = null;
        
        private NFT() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$FundRaising;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class FundRaising extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.FundRaising INSTANCE = null;
        
        private FundRaising() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Gaming;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class Gaming extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.Gaming INSTANCE = null;
        
        private Gaming() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$B2B;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class B2B extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.B2B INSTANCE = null;
        
        private B2B() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Infrastructure;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class Infrastructure extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.Infrastructure INSTANCE = null;
        
        private Infrastructure() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Staking;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class Staking extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.Staking INSTANCE = null;
        
        private Staking() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$CrossChain;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class CrossChain extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.CrossChain INSTANCE = null;
        
        private CrossChain() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$Computing;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class Computing extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.Computing INSTANCE = null;
        
        private Computing() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$RebaseTokens;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class RebaseTokens extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.RebaseTokens INSTANCE = null;
        
        private RebaseTokens() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$FanTokens;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class FanTokens extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.FanTokens INSTANCE = null;
        
        private FanTokens() {
            super(null, 0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory$InvestmentTools;", "Lio/horizontalsystems/bankwallet/modules/market/discovery/MarketCategory;", "()V", "app_debug"})
    public static final class InvestmentTools extends io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.discovery.MarketCategory.InvestmentTools INSTANCE = null;
        
        private InvestmentTools() {
            super(null, 0, 0, 0);
        }
    }
}