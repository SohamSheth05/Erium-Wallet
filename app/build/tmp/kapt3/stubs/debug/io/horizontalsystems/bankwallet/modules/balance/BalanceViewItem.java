package io.horizontalsystems.bankwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00af\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u001dJ\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\nH\u00c6\u0003J\t\u0010=\u001a\u00020\u0012H\u00c6\u0003J\t\u0010>\u001a\u00020\u0012H\u00c6\u0003J\t\u0010?\u001a\u00020\u0012H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\t\u0010A\u001a\u00020\u0012H\u00c6\u0003J\t\u0010B\u001a\u00020\u0012H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010D\u001a\u00020\u0012H\u00c6\u0003J\t\u0010E\u001a\u00020\u0012H\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\t\u0010G\u001a\u00020\u0012H\u00c6\u0003J\t\u0010H\u001a\u00020\u0005H\u00c6\u0003J\t\u0010I\u001a\u00020\bH\u00c6\u0003J\t\u0010J\u001a\u00020\nH\u00c6\u0003J\t\u0010K\u001a\u00020\nH\u00c6\u0003J\t\u0010L\u001a\u00020\rH\u00c6\u0003J\t\u0010M\u001a\u00020\nH\u00c6\u0003J\t\u0010N\u001a\u00020\nH\u00c6\u0003J\u00d5\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u0012H\u00c6\u0001J\u0013\u0010P\u001a\u00020\u00122\b\u0010Q\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010R\u001a\u00020SH\u00d6\u0001J\t\u0010T\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0018\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\'R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\'R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0011\u0010\u0017\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0011\u0010\u000e\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\'R\u0011\u0010\u0010\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\'R\u001a\u0010\u001a\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010!\"\u0004\b1\u00102R\u0011\u0010\u0014\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0011\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0011\u0010\u001c\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0011\u0010\u001b\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:\u00a8\u0006U"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceViewItem;", "", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "coinCode", "", "coinTitle", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "coinValue", "Lio/horizontalsystems/bankwallet/modules/balance/DeemedValue;", "exchangeValue", "diff", "Lio/horizontalsystems/bankwallet/modules/balance/RateDiff;", "fiatValue", "coinValueLocked", "fiatValueLocked", "expanded", "", "sendEnabled", "receiveEnabled", "syncingData", "Lio/horizontalsystems/bankwallet/modules/balance/SyncingData;", "failedIconVisible", "coinIconVisible", "coinTypeLabel", "hideBalance", "swapVisible", "swapEnabled", "(Lio/horizontalsystems/bankwallet/entities/Wallet;Ljava/lang/String;Ljava/lang/String;Lio/horizontalsystems/coinkit2/models/CoinType;Lio/horizontalsystems/bankwallet/modules/balance/DeemedValue;Lio/horizontalsystems/bankwallet/modules/balance/DeemedValue;Lio/horizontalsystems/bankwallet/modules/balance/RateDiff;Lio/horizontalsystems/bankwallet/modules/balance/DeemedValue;Lio/horizontalsystems/bankwallet/modules/balance/DeemedValue;Lio/horizontalsystems/bankwallet/modules/balance/DeemedValue;ZZZLio/horizontalsystems/bankwallet/modules/balance/SyncingData;ZZLjava/lang/String;ZZZ)V", "getCoinCode", "()Ljava/lang/String;", "getCoinIconVisible", "()Z", "getCoinTitle", "getCoinType", "()Lio/horizontalsystems/coinkit2/models/CoinType;", "getCoinTypeLabel", "getCoinValue", "()Lio/horizontalsystems/bankwallet/modules/balance/DeemedValue;", "getCoinValueLocked", "getDiff", "()Lio/horizontalsystems/bankwallet/modules/balance/RateDiff;", "getExchangeValue", "getExpanded", "getFailedIconVisible", "getFiatValue", "getFiatValueLocked", "getHideBalance", "setHideBalance", "(Z)V", "getReceiveEnabled", "getSendEnabled", "getSwapEnabled", "getSwapVisible", "getSyncingData", "()Lio/horizontalsystems/bankwallet/modules/balance/SyncingData;", "getWallet", "()Lio/horizontalsystems/bankwallet/entities/Wallet;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class BalanceViewItem {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.entities.Wallet wallet = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coinCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coinTitle = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.coinkit2.models.CoinType coinType = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.balance.DeemedValue coinValue = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.balance.DeemedValue exchangeValue = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.balance.RateDiff diff = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.balance.DeemedValue fiatValue = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.balance.DeemedValue coinValueLocked = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.balance.DeemedValue fiatValueLocked = null;
    private final boolean expanded = false;
    private final boolean sendEnabled = false;
    private final boolean receiveEnabled = false;
    @org.jetbrains.annotations.Nullable()
    private final io.horizontalsystems.bankwallet.modules.balance.SyncingData syncingData = null;
    private final boolean failedIconVisible = false;
    private final boolean coinIconVisible = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String coinTypeLabel = null;
    private boolean hideBalance;
    private final boolean swapVisible = false;
    private final boolean swapEnabled = false;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.Wallet getWallet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoinCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoinTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.coinkit2.models.CoinType getCoinType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.balance.DeemedValue getCoinValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.balance.DeemedValue getExchangeValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.balance.RateDiff getDiff() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.balance.DeemedValue getFiatValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.balance.DeemedValue getCoinValueLocked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.balance.DeemedValue getFiatValueLocked() {
        return null;
    }
    
    public final boolean getExpanded() {
        return false;
    }
    
    public final boolean getSendEnabled() {
        return false;
    }
    
    public final boolean getReceiveEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.balance.SyncingData getSyncingData() {
        return null;
    }
    
    public final boolean getFailedIconVisible() {
        return false;
    }
    
    public final boolean getCoinIconVisible() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCoinTypeLabel() {
        return null;
    }
    
    public final boolean getHideBalance() {
        return false;
    }
    
    public final void setHideBalance(boolean p0) {
    }
    
    public final boolean getSwapVisible() {
        return false;
    }
    
    public final boolean getSwapEnabled() {
        return false;
    }
    
    public BalanceViewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String coinTitle, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.DeemedValue coinValue, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.DeemedValue exchangeValue, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.RateDiff diff, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.DeemedValue fiatValue, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.DeemedValue coinValueLocked, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.DeemedValue fiatValueLocked, boolean expanded, boolean sendEnabled, boolean receiveEnabled, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.balance.SyncingData syncingData, boolean failedIconVisible, boolean coinIconVisible, @org.jetbrains.annotations.Nullable()
    java.lang.String coinTypeLabel, boolean hideBalance, boolean swapVisible, boolean swapEnabled) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.Wallet component1() {
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
    public final io.horizontalsystems.coinkit2.models.CoinType component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.balance.DeemedValue component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.balance.DeemedValue component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.balance.RateDiff component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.balance.DeemedValue component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.balance.DeemedValue component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.balance.DeemedValue component10() {
        return null;
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean component13() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.balance.SyncingData component14() {
        return null;
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean component16() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    public final boolean component18() {
        return false;
    }
    
    public final boolean component19() {
        return false;
    }
    
    public final boolean component20() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem copy(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
    java.lang.String coinTitle, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.DeemedValue coinValue, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.DeemedValue exchangeValue, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.RateDiff diff, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.DeemedValue fiatValue, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.DeemedValue coinValueLocked, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.DeemedValue fiatValueLocked, boolean expanded, boolean sendEnabled, boolean receiveEnabled, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.balance.SyncingData syncingData, boolean failedIconVisible, boolean coinIconVisible, @org.jetbrains.annotations.Nullable()
    java.lang.String coinTypeLabel, boolean hideBalance, boolean swapVisible, boolean swapEnabled) {
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