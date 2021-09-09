package io.horizontalsystems.bankwallet.core.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001(B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fB\u001f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0016\u0010 \u001a\u00020\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016J$\u0010$\u001a\u00020\u00172\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\"2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020&0\"H\u0016R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006)"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/LitecoinAdapter;", "Lio/horizontalsystems/bankwallet/core/adapters/BitcoinBaseAdapter;", "Lio/horizontalsystems/litecoinkit/LitecoinKit$Listener;", "Lio/horizontalsystems/bankwallet/core/ISendBitcoinAdapter;", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "syncMode", "Lio/horizontalsystems/bankwallet/entities/SyncMode;", "testMode", "", "backgroundManager", "Lio/horizontalsystems/core/BackgroundManager;", "(Lio/horizontalsystems/bankwallet/entities/Wallet;Lio/horizontalsystems/bankwallet/entities/SyncMode;ZLio/horizontalsystems/core/BackgroundManager;)V", "kit", "Lio/horizontalsystems/litecoinkit/LitecoinKit;", "(Lio/horizontalsystems/litecoinkit/LitecoinKit;Lio/horizontalsystems/bankwallet/entities/SyncMode;Lio/horizontalsystems/core/BackgroundManager;)V", "getKit", "()Lio/horizontalsystems/litecoinkit/LitecoinKit;", "satoshisInBitcoin", "Ljava/math/BigDecimal;", "getSatoshisInBitcoin", "()Ljava/math/BigDecimal;", "onBalanceUpdate", "", "balance", "Lio/horizontalsystems/bitcoincore/models/BalanceInfo;", "onKitStateUpdate", "state", "Lio/horizontalsystems/bitcoincore/BitcoinCore$KitState;", "onLastBlockInfoUpdate", "blockInfo", "Lio/horizontalsystems/bitcoincore/models/BlockInfo;", "onTransactionsDelete", "hashes", "", "", "onTransactionsUpdate", "inserted", "Lio/horizontalsystems/bitcoincore/models/TransactionInfo;", "updated", "Companion", "app_debug"})
public final class LitecoinAdapter extends io.horizontalsystems.bankwallet.core.adapters.BitcoinBaseAdapter implements io.horizontalsystems.litecoinkit.LitecoinKit.Listener, io.horizontalsystems.bankwallet.core.ISendBitcoinAdapter {
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal satoshisInBitcoin = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.litecoinkit.LitecoinKit kit = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.adapters.LitecoinAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getSatoshisInBitcoin() {
        return null;
    }
    
    @java.lang.Override()
    public void onBalanceUpdate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitcoincore.models.BalanceInfo balance) {
    }
    
    @java.lang.Override()
    public void onLastBlockInfoUpdate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitcoincore.models.BlockInfo blockInfo) {
    }
    
    @java.lang.Override()
    public void onKitStateUpdate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitcoincore.BitcoinCore.KitState state) {
    }
    
    @java.lang.Override()
    public void onTransactionsUpdate(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bitcoincore.models.TransactionInfo> inserted, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bitcoincore.models.TransactionInfo> updated) {
    }
    
    @java.lang.Override()
    public void onTransactionsDelete(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> hashes) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.litecoinkit.LitecoinKit getKit() {
        return null;
    }
    
    public LitecoinAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.litecoinkit.LitecoinKit kit, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.SyncMode syncMode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.BackgroundManager backgroundManager) {
        super(null, null, null);
    }
    
    public LitecoinAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.SyncMode syncMode, boolean testMode, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.BackgroundManager backgroundManager) {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0002\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/core/adapters/LitecoinAdapter$Companion;", "", "()V", "clear", "", "walletId", "", "testMode", "", "createKit", "Lio/horizontalsystems/litecoinkit/LitecoinKit;", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "syncMode", "Lio/horizontalsystems/bankwallet/entities/SyncMode;", "getNetworkType", "Lio/horizontalsystems/litecoinkit/LitecoinKit$NetworkType;", "app_debug"})
    public static final class Companion {
        
        private final io.horizontalsystems.litecoinkit.LitecoinKit.NetworkType getNetworkType(boolean testMode) {
            return null;
        }
        
        private final io.horizontalsystems.litecoinkit.LitecoinKit createKit(io.horizontalsystems.bankwallet.entities.Wallet wallet, io.horizontalsystems.bankwallet.entities.SyncMode syncMode, boolean testMode) {
            return null;
        }
        
        public final void clear(@org.jetbrains.annotations.NotNull()
        java.lang.String walletId, boolean testMode) {
        }
        
        private Companion() {
            super();
        }
    }
}