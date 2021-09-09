package io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\b\u0010\u0016\u001a\u00020\u0010H\u0016J\u001c\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00132\u0006\u0010\u0011\u001a\u00020\nJ\u001c\u0010\u001a\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\u0006\u0010\u0011\u001a\u00020\nR\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b\u00a8\u0006 "}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "()V", "approveSettingsObservable", "Lio/reactivex/subjects/PublishSubject;", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService$CoinWithSettings;", "kotlin.jvm.PlatformType", "getApproveSettingsObservable", "()Lio/reactivex/subjects/PublishSubject;", "rejectApproveSettingsObservable", "Lio/horizontalsystems/coinkit2/models/Coin;", "getRejectApproveSettingsObservable", "requestObservable", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService$Request;", "getRequestObservable", "approveSettings", "", "coin", "settings", "", "Lio/horizontalsystems/bankwallet/entities/CoinSettings;", "cancel", "clear", "selectBchCoinTypes", "bchCoinTypes", "Lio/horizontalsystems/bankwallet/entities/BitcoinCashCoinType;", "selectDerivations", "derivations", "Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;", "CoinWithSettings", "Request", "RequestType", "app_debug"})
public final class CoinSettingsService implements io.horizontalsystems.bankwallet.core.Clearable {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService.CoinWithSettings> approveSettingsObservable = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.coinkit2.models.Coin> rejectApproveSettingsObservable = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService.Request> requestObservable = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService.CoinWithSettings> getApproveSettingsObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<io.horizontalsystems.coinkit2.models.Coin> getRejectApproveSettingsObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService.Request> getRequestObservable() {
        return null;
    }
    
    public final void approveSettings(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.CoinSettings> settings) {
    }
    
    public final void selectDerivations(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.entities.AccountType.Derivation> derivations, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public final void selectBchCoinTypes(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType> bchCoinTypes, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public final void cancel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public CoinSettingsService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService$CoinWithSettings;", "", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "settingsList", "", "Lio/horizontalsystems/bankwallet/entities/CoinSettings;", "(Lio/horizontalsystems/coinkit2/models/Coin;Ljava/util/List;)V", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "getSettingsList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class CoinWithSettings {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.coinkit2.models.Coin coin = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<io.horizontalsystems.bankwallet.entities.CoinSettings> settingsList = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin getCoin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.entities.CoinSettings> getSettingsList() {
            return null;
        }
        
        public CoinWithSettings(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.entities.CoinSettings> settingsList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.entities.CoinSettings> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService.CoinWithSettings copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.entities.CoinSettings> settingsList) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService$Request;", "", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "type", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService$RequestType;", "(Lio/horizontalsystems/coinkit2/models/Coin;Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService$RequestType;)V", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "getType", "()Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService$RequestType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Request {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.coinkit2.models.Coin coin = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService.RequestType type = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin getCoin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService.RequestType getType() {
            return null;
        }
        
        public Request(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService.RequestType type) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService.RequestType component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService.Request copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService.RequestType type) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService$RequestType;", "", "()V", "BCHCoinType", "Derivation", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService$RequestType$Derivation;", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService$RequestType$BCHCoinType;", "app_debug"})
    public static abstract class RequestType {
        
        private RequestType() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService$RequestType$Derivation;", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService$RequestType;", "allDerivations", "", "Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;", "current", "(Ljava/util/List;Ljava/util/List;)V", "getAllDerivations", "()Ljava/util/List;", "getCurrent", "app_debug"})
        public static final class Derivation extends io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService.RequestType {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<io.horizontalsystems.bankwallet.entities.AccountType.Derivation> allDerivations = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<io.horizontalsystems.bankwallet.entities.AccountType.Derivation> current = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<io.horizontalsystems.bankwallet.entities.AccountType.Derivation> getAllDerivations() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<io.horizontalsystems.bankwallet.entities.AccountType.Derivation> getCurrent() {
                return null;
            }
            
            public Derivation(@org.jetbrains.annotations.NotNull()
            java.util.List<? extends io.horizontalsystems.bankwallet.entities.AccountType.Derivation> allDerivations, @org.jetbrains.annotations.NotNull()
            java.util.List<? extends io.horizontalsystems.bankwallet.entities.AccountType.Derivation> current) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService$RequestType$BCHCoinType;", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/CoinSettingsService$RequestType;", "allTypes", "", "Lio/horizontalsystems/bankwallet/entities/BitcoinCashCoinType;", "current", "(Ljava/util/List;Ljava/util/List;)V", "getAllTypes", "()Ljava/util/List;", "getCurrent", "app_debug"})
        public static final class BCHCoinType extends io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.CoinSettingsService.RequestType {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType> allTypes = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType> current = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType> getAllTypes() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType> getCurrent() {
                return null;
            }
            
            public BCHCoinType(@org.jetbrains.annotations.NotNull()
            java.util.List<? extends io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType> allTypes, @org.jetbrains.annotations.NotNull()
            java.util.List<? extends io.horizontalsystems.bankwallet.entities.BitcoinCashCoinType> current) {
                super();
            }
        }
    }
}