package io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u001e\u001f B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fJ\b\u0010\u0017\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0013\u001a\u00020\fJ\u001e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\fR\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\f0\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001f\u0010\u000e\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u000f0\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n\u00a8\u0006!"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "manager", "Lio/horizontalsystems/bankwallet/core/managers/RestoreSettingsManager;", "(Lio/horizontalsystems/bankwallet/core/managers/RestoreSettingsManager;)V", "approveSettingsObservable", "Lio/reactivex/subjects/PublishSubject;", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsService$CoinWithSettings;", "kotlin.jvm.PlatformType", "getApproveSettingsObservable", "()Lio/reactivex/subjects/PublishSubject;", "rejectApproveSettingsObservable", "Lio/horizontalsystems/coinkit2/models/Coin;", "getRejectApproveSettingsObservable", "requestObservable", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsService$Request;", "getRequestObservable", "approveSettings", "", "coin", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "cancel", "clear", "enter", "birthdayHeight", "", "save", "settings", "Lio/horizontalsystems/bankwallet/core/managers/RestoreSettings;", "CoinWithSettings", "Request", "RequestType", "app_debug"})
public final class RestoreSettingsService implements io.horizontalsystems.bankwallet.core.Clearable {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsService.CoinWithSettings> approveSettingsObservable = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.coinkit2.models.Coin> rejectApproveSettingsObservable = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsService.Request> requestObservable = null;
    private final io.horizontalsystems.bankwallet.core.managers.RestoreSettingsManager manager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsService.CoinWithSettings> getApproveSettingsObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<io.horizontalsystems.coinkit2.models.Coin> getRejectApproveSettingsObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsService.Request> getRequestObservable() {
        return null;
    }
    
    public final void approveSettings(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.Account account) {
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.RestoreSettings settings, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public final void enter(@org.jetbrains.annotations.Nullable()
    java.lang.String birthdayHeight, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    public final void cancel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public RestoreSettingsService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.RestoreSettingsManager manager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsService$CoinWithSettings;", "", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "settings", "Lio/horizontalsystems/bankwallet/core/managers/RestoreSettings;", "(Lio/horizontalsystems/coinkit2/models/Coin;Lio/horizontalsystems/bankwallet/core/managers/RestoreSettings;)V", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "getSettings", "()Lio/horizontalsystems/bankwallet/core/managers/RestoreSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class CoinWithSettings {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.coinkit2.models.Coin coin = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.core.managers.RestoreSettings settings = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin getCoin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.managers.RestoreSettings getSettings() {
            return null;
        }
        
        public CoinWithSettings(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.managers.RestoreSettings settings) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.core.managers.RestoreSettings component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsService.CoinWithSettings copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.core.managers.RestoreSettings settings) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsService$Request;", "", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "requestType", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsService$RequestType;", "(Lio/horizontalsystems/coinkit2/models/Coin;Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsService$RequestType;)V", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "getRequestType", "()Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsService$RequestType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Request {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.coinkit2.models.Coin coin = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsService.RequestType requestType = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin getCoin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsService.RequestType getRequestType() {
            return null;
        }
        
        public Request(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsService.RequestType requestType) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsService.RequestType component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsService.Request copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsService.RequestType requestType) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsService$RequestType;", "", "(Ljava/lang/String;I)V", "birthdayHeight", "app_debug"})
    public static enum RequestType {
        /*public static final*/ birthdayHeight /* = new birthdayHeight() */;
        
        RequestType() {
        }
    }
}