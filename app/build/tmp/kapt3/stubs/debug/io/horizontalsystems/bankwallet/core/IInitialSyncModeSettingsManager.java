package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u0003H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H&J\u001e\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IInitialSyncModeSettingsManager;", "", "allSettings", "", "Lkotlin/Triple;", "Lio/horizontalsystems/bankwallet/entities/InitialSyncSetting;", "Lio/horizontalsystems/coinkit2/models/Coin;", "", "save", "", "setting", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "origin", "Lio/horizontalsystems/bankwallet/entities/AccountOrigin;", "app_debug"})
public abstract interface IInitialSyncModeSettingsManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<kotlin.Triple<io.horizontalsystems.bankwallet.entities.InitialSyncSetting, io.horizontalsystems.coinkit2.models.Coin, java.lang.Boolean>> allSettings();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.entities.InitialSyncSetting setting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.AccountOrigin origin);
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.InitialSyncSetting setting);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}