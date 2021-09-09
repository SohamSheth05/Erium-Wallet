package io.horizontalsystems.bankwallet.modules.market;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketModule;", "", "()V", "Factory", "ListType", "Tab", "app_debug"})
public final class MarketModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.market.MarketModule INSTANCE = null;
    
    private MarketModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u0003\u001a\u0002H\u0004\"\n\b\u0000\u0010\u0004*\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketModule$Tab;", "", "titleResId", "", "(Ljava/lang/String;II)V", "getTitleResId", "()I", "Overview", "Discovery", "Watchlist", "Companion", "app_debug"})
    public static enum Tab {
        /*public static final*/ Overview /* = new Overview(0) */,
        /*public static final*/ Discovery /* = new Discovery(0) */,
        /*public static final*/ Watchlist /* = new Watchlist(0) */;
        private final int titleResId = 0;
        private static final java.util.Map<java.lang.String, io.horizontalsystems.bankwallet.modules.market.MarketModule.Tab> map = null;
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.market.MarketModule.Tab.Companion Companion = null;
        
        public final int getTitleResId() {
            return 0;
        }
        
        Tab(@androidx.annotation.StringRes()
        int titleResId) {
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketModule$Tab$Companion;", "", "()V", "map", "", "", "Lio/horizontalsystems/bankwallet/modules/market/MarketModule$Tab;", "fromString", "type", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.Nullable()
            public final io.horizontalsystems.bankwallet.modules.market.MarketModule.Tab fromString(@org.jetbrains.annotations.Nullable()
            java.lang.String type) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketModule$ListType;", "", "sortingField", "Lio/horizontalsystems/bankwallet/modules/market/SortingField;", "marketField", "Lio/horizontalsystems/bankwallet/modules/market/MarketField;", "(Ljava/lang/String;ILio/horizontalsystems/bankwallet/modules/market/SortingField;Lio/horizontalsystems/bankwallet/modules/market/MarketField;)V", "getMarketField", "()Lio/horizontalsystems/bankwallet/modules/market/MarketField;", "getSortingField", "()Lio/horizontalsystems/bankwallet/modules/market/SortingField;", "TopGainers", "TopLosers", "app_debug"})
    public static enum ListType {
        /*public static final*/ TopGainers /* = new TopGainers(null, null) */,
        /*public static final*/ TopLosers /* = new TopLosers(null, null) */;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.modules.market.SortingField sortingField = null;
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.modules.market.MarketField marketField = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.market.SortingField getSortingField() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.market.MarketField getMarketField() {
            return null;
        }
        
        ListType(io.horizontalsystems.bankwallet.modules.market.SortingField sortingField, io.horizontalsystems.bankwallet.modules.market.MarketField marketField) {
        }
    }
}