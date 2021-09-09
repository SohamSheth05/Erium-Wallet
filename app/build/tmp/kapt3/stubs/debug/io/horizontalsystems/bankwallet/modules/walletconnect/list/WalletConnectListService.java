package io.horizontalsystems.bankwallet.modules.walletconnect.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListService;", "", "sessionManager", "Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSessionManager;", "(Lio/horizontalsystems/bankwallet/modules/walletconnect/WalletConnectSessionManager;)V", "items", "", "Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListService$Item;", "getItems", "()Ljava/util/List;", "itemsObservable", "Lio/reactivex/Flowable;", "getItemsObservable", "()Lio/reactivex/Flowable;", "sessions", "Lio/horizontalsystems/bankwallet/entities/WalletConnectSession;", "Chain", "Item", "app_debug"})
public final class WalletConnectListService {
    private final io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectSessionManager sessionManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.walletconnect.list.WalletConnectListService.Item> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<io.horizontalsystems.bankwallet.modules.walletconnect.list.WalletConnectListService.Item>> getItemsObservable() {
        return null;
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.walletconnect.list.WalletConnectListService.Item> getItems(java.util.List<io.horizontalsystems.bankwallet.entities.WalletConnectSession> sessions) {
        return null;
    }
    
    public WalletConnectListService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.walletconnect.WalletConnectSessionManager sessionManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListService$Chain;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Ethereum", "BinanceSmartChain", "app_debug"})
    public static enum Chain {
        /*public static final*/ Ethereum /* = new Ethereum(0) */,
        /*public static final*/ BinanceSmartChain /* = new BinanceSmartChain(0) */;
        private final int value = 0;
        
        public final int getValue() {
            return 0;
        }
        
        Chain(int value) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListService$Item;", "", "chain", "Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListService$Chain;", "sessions", "", "Lio/horizontalsystems/bankwallet/entities/WalletConnectSession;", "(Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListService$Chain;Ljava/util/List;)V", "getChain", "()Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListService$Chain;", "getSessions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Item {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.modules.walletconnect.list.WalletConnectListService.Chain chain = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<io.horizontalsystems.bankwallet.entities.WalletConnectSession> sessions = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.walletconnect.list.WalletConnectListService.Chain getChain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.entities.WalletConnectSession> getSessions() {
            return null;
        }
        
        public Item(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.walletconnect.list.WalletConnectListService.Chain chain, @org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.entities.WalletConnectSession> sessions) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.walletconnect.list.WalletConnectListService.Chain component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.entities.WalletConnectSession> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.walletconnect.list.WalletConnectListService.Item copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.walletconnect.list.WalletConnectListService.Chain chain, @org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.entities.WalletConnectSession> sessions) {
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