package io.horizontalsystems.bankwallet.modules.addtoken;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule;", "", "()V", "Factory", "State", "ViewItem", "app_debug"})
public final class AddTokenModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule INSTANCE = null;
    
    private AddTokenModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "tokenType", "Lio/horizontalsystems/bankwallet/modules/addtoken/TokenType;", "(Lio/horizontalsystems/bankwallet/modules/addtoken/TokenType;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final io.horizontalsystems.bankwallet.modules.addtoken.TokenType tokenType = null;
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.addtoken.TokenType tokenType) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$ViewItem;", "", "coinName", "", "symbol", "decimal", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getCoinName", "()Ljava/lang/String;", "getDecimal", "()I", "getSymbol", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class ViewItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String coinName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String symbol = null;
        private final int decimal = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCoinName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSymbol() {
            return null;
        }
        
        public final int getDecimal() {
            return 0;
        }
        
        public ViewItem(@org.jetbrains.annotations.NotNull()
        java.lang.String coinName, @org.jetbrains.annotations.NotNull()
        java.lang.String symbol, int decimal) {
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
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.ViewItem copy(@org.jetbrains.annotations.NotNull()
        java.lang.String coinName, @org.jetbrains.annotations.NotNull()
        java.lang.String symbol, int decimal) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State;", "", "()V", "AlreadyExists", "Failed", "Fetched", "Idle", "Loading", "Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State$Idle;", "Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State$Loading;", "Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State$AlreadyExists;", "Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State$Fetched;", "Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State$Failed;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State$Idle;", "Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State;", "()V", "app_debug"})
        public static final class Idle extends io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.State.Idle INSTANCE = null;
            
            private Idle() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State$Loading;", "Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State;", "()V", "app_debug"})
        public static final class Loading extends io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.State {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.State.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State$AlreadyExists;", "Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "(Lio/horizontalsystems/coinkit2/models/Coin;)V", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "app_debug"})
        public static final class AlreadyExists extends io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.State {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.coinkit2.models.Coin coin = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.coinkit2.models.Coin getCoin() {
                return null;
            }
            
            public AlreadyExists(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.coinkit2.models.Coin coin) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State$Fetched;", "Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "(Lio/horizontalsystems/coinkit2/models/Coin;)V", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "app_debug"})
        public static final class Fetched extends io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.State {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.coinkit2.models.Coin coin = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.coinkit2.models.Coin getCoin() {
                return null;
            }
            
            public Fetched(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.coinkit2.models.Coin coin) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State$Failed;", "Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "app_debug"})
        public static final class Failed extends io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.State {
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