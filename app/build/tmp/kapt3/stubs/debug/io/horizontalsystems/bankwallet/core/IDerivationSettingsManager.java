package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0006H&\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IDerivationSettingsManager;", "", "allActiveSettings", "", "Lkotlin/Pair;", "Lio/horizontalsystems/bankwallet/entities/DerivationSetting;", "Lio/horizontalsystems/coinkit2/models/CoinType;", "defaultSetting", "coinType", "resetStandardSettings", "", "save", "setting", "app_debug"})
public abstract interface IDerivationSettingsManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<kotlin.Pair<io.horizontalsystems.bankwallet.entities.DerivationSetting, io.horizontalsystems.coinkit2.models.CoinType>> allActiveSettings();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.entities.DerivationSetting defaultSetting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bankwallet.entities.DerivationSetting setting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType);
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.DerivationSetting setting);
    
    public abstract void resetStandardSettings();
}