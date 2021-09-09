package io.horizontalsystems.bankwallet.modules.blockchainsettings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/blockchainsettings/BlockchainSettingsModule;", "", "()V", "Config", "Request", "RequestType", "app_debug"})
public final class BlockchainSettingsModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.blockchainsettings.BlockchainSettingsModule INSTANCE = null;
    
    private BlockchainSettingsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/blockchainsettings/BlockchainSettingsModule$Request;", "", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "type", "Lio/horizontalsystems/bankwallet/modules/blockchainsettings/BlockchainSettingsModule$RequestType;", "(Lio/horizontalsystems/coinkit2/models/Coin;Lio/horizontalsystems/bankwallet/modules/blockchainsettings/BlockchainSettingsModule$RequestType;)V", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "getType", "()Lio/horizontalsystems/bankwallet/modules/blockchainsettings/BlockchainSettingsModule$RequestType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Request {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.coinkit2.models.Coin coin = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.modules.blockchainsettings.BlockchainSettingsModule.RequestType type = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin getCoin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.blockchainsettings.BlockchainSettingsModule.RequestType getType() {
            return null;
        }
        
        public Request(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.blockchainsettings.BlockchainSettingsModule.RequestType type) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.blockchainsettings.BlockchainSettingsModule.RequestType component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.blockchainsettings.BlockchainSettingsModule.Request copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.blockchainsettings.BlockchainSettingsModule.RequestType type) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/blockchainsettings/BlockchainSettingsModule$RequestType;", "", "()V", "BitcoinCashType", "DerivationType", "Lio/horizontalsystems/bankwallet/modules/blockchainsettings/BlockchainSettingsModule$RequestType$DerivationType;", "Lio/horizontalsystems/bankwallet/modules/blockchainsettings/BlockchainSettingsModule$RequestType$BitcoinCashType;", "app_debug"})
    public static abstract class RequestType {
        
        private RequestType() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/blockchainsettings/BlockchainSettingsModule$RequestType$DerivationType;", "Lio/horizontalsystems/bankwallet/modules/blockchainsettings/BlockchainSettingsModule$RequestType;", "derivations", "", "Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;", "current", "(Ljava/util/List;Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;)V", "getCurrent", "()Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;", "getDerivations", "()Ljava/util/List;", "app_debug"})
        public static final class DerivationType extends io.horizontalsystems.bankwallet.modules.blockchainsettings.BlockchainSettingsModule.RequestType {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<io.horizontalsystems.bankwallet.entities.AccountType.Derivation> derivations = null;
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.bankwallet.entities.AccountType.Derivation current = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<io.horizontalsystems.bankwallet.entities.AccountType.Derivation> getDerivations() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.entities.AccountType.Derivation getCurrent() {
                return null;
            }
            
            public DerivationType(@org.jetbrains.annotations.NotNull()
            java.util.List<? extends io.horizontalsystems.bankwallet.entities.AccountType.Derivation> derivations, @org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.entities.AccountType.Derivation current) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/blockchainsettings/BlockchainSettingsModule$RequestType$BitcoinCashType;", "Lio/horizontalsystems/bankwallet/modules/blockchainsettings/BlockchainSettingsModule$RequestType;", "types", "", "Lio/horizontalsystems/bankwallet/entities/BitcoinCashCoinType;", "current", "(Ljava/util/List;Lio/horizontalsystems/bankwallet/entities/BitcoinCashCoinType;)V", "getCurrent", "()Lio/horizontalsystems/bankwallet/entities/BitcoinCashCoinType;", "getTypes", "()Ljava/util/List;", "app_debug"})
        public static final class BitcoinCashType extends io.horizontalsystems.bankwallet.modules.blockchainsettings.BlockchainSettingsModule.RequestType {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType> types = null;
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType current = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType> getTypes() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType getCurrent() {
                return null;
            }
            
            public BitcoinCashType(@org.jetbrains.annotations.NotNull()
            java.util.List<? extends io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType> types, @org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType current) {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\b\b\u0002\u0010\f\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\tH\u00d6\u0001J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013\u00a8\u0006#"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/blockchainsettings/BlockchainSettingsModule$Config;", "", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "title", "", "subtitle", "selectedIndexes", "", "", "viewItems", "Lio/horizontalsystems/bankwallet/ui/extensions/BottomSheetSelectorViewItem;", "description", "(Lio/horizontalsystems/coinkit2/models/Coin;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "getDescription", "()Ljava/lang/String;", "getSelectedIndexes", "()Ljava/util/List;", "getSubtitle", "getTitle", "getViewItems", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class Config {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.coinkit2.models.Coin coin = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String subtitle = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Integer> selectedIndexes = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<io.horizontalsystems.bankwallet.ui.extensions.BottomSheetSelectorViewItem> viewItems = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String description = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin getCoin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSubtitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Integer> getSelectedIndexes() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.ui.extensions.BottomSheetSelectorViewItem> getViewItems() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescription() {
            return null;
        }
        
        public Config(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String subtitle, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Integer> selectedIndexes, @org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.ui.extensions.BottomSheetSelectorViewItem> viewItems, @org.jetbrains.annotations.NotNull()
        java.lang.String description) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin component1() {
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
        public final java.util.List<java.lang.Integer> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.ui.extensions.BottomSheetSelectorViewItem> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.blockchainsettings.BlockchainSettingsModule.Config copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String subtitle, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Integer> selectedIndexes, @org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.ui.extensions.BottomSheetSelectorViewItem> viewItems, @org.jetbrains.annotations.NotNull()
        java.lang.String description) {
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