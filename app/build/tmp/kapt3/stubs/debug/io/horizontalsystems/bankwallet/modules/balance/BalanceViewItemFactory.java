package io.horizontalsystems.bankwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J,\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J6\u0010\u0013\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001c\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001f2\u0006\u0010\u0014\u001a\u00020\u0015J\u001a\u0010 \u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u001c\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010#\u001a\u00020\u0012H\u0002J&\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balance/BalanceViewItemFactory;", "", "()V", "diffScale", "", "coinTypeLabel", "", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "coinValue", "Lio/horizontalsystems/bankwallet/modules/balance/DeemedValue;", "state", "Lio/horizontalsystems/bankwallet/core/AdapterState;", "balance", "Ljava/math/BigDecimal;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "visible", "", "currencyValue", "currency", "Lio/horizontalsystems/core/entities/Currency;", "latestRate", "Lio/horizontalsystems/xrateskit2/entities/LatestRate;", "getRateDiff", "Lio/horizontalsystems/bankwallet/modules/balance/RateDiff;", "item", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceModule$BalanceItem;", "headerViewItem", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceHeaderViewItem;", "items", "", "rateValue", "syncingData", "Lio/horizontalsystems/bankwallet/modules/balance/SyncingData;", "expanded", "viewItem", "Lio/horizontalsystems/bankwallet/modules/balance/BalanceViewItem;", "hideBalance", "app_debug"})
public final class BalanceViewItemFactory {
    private final int diffScale = 2;
    
    private final io.horizontalsystems.bankwallet.modules.balance.DeemedValue coinValue(io.horizontalsystems.bankwallet.core.AdapterState state, java.math.BigDecimal balance, io.horizontalsystems.coinkit2.models.Coin coin, boolean visible) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.balance.DeemedValue currencyValue(io.horizontalsystems.bankwallet.core.AdapterState state, java.math.BigDecimal balance, io.horizontalsystems.core.entities.Currency currency, io.horizontalsystems.xrateskit2.entities.LatestRate latestRate, boolean visible) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.balance.DeemedValue rateValue(io.horizontalsystems.core.entities.Currency currency, io.horizontalsystems.xrateskit2.entities.LatestRate latestRate) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.balance.SyncingData syncingData(io.horizontalsystems.bankwallet.core.AdapterState state, boolean expanded) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.balance.BalanceViewItem viewItem(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.balance.BalanceModule.BalanceItem item, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency, boolean expanded, boolean hideBalance) {
        return null;
    }
    
    private final java.lang.String coinTypeLabel(io.horizontalsystems.bankwallet.entities.Wallet wallet) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.balance.RateDiff getRateDiff(io.horizontalsystems.bankwallet.modules.balance.BalanceModule.BalanceItem item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.balance.BalanceHeaderViewItem headerViewItem(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.balance.BalanceModule.BalanceItem> items, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency currency) {
        return null;
    }
    
    public BalanceViewItemFactory() {
        super();
    }
}