package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J&\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t0\b2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\nJ\u0016\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014J\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/RestoreSettingsManager;", "", "storage", "Lio/horizontalsystems/bankwallet/core/IRestoreSettingsStorage;", "zcashBirthdayProvider", "Lio/horizontalsystems/bankwallet/core/managers/ZcashBirthdayProvider;", "(Lio/horizontalsystems/bankwallet/core/IRestoreSettingsStorage;Lio/horizontalsystems/bankwallet/core/managers/ZcashBirthdayProvider;)V", "accountSettingsInfo", "", "Lkotlin/Triple;", "Lio/horizontalsystems/coinkit2/models/CoinType;", "Lio/horizontalsystems/bankwallet/core/managers/RestoreSettingType;", "", "account", "Lio/horizontalsystems/bankwallet/entities/Account;", "getSettingValueForCreatedAccount", "settingType", "coinType", "getSettingsTitle", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "save", "", "settings", "Lio/horizontalsystems/bankwallet/core/managers/RestoreSettings;", "app_debug"})
public final class RestoreSettingsManager {
    private final io.horizontalsystems.bankwallet.core.IRestoreSettingsStorage storage = null;
    private final io.horizontalsystems.bankwallet.core.managers.ZcashBirthdayProvider zcashBirthdayProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.core.managers.RestoreSettings settings(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Triple<io.horizontalsystems.coinkit2.models.CoinType, io.horizontalsystems.bankwallet.core.managers.RestoreSettingType, java.lang.String>> accountSettingsInfo(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account) {
        return null;
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.RestoreSettings settings, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Account account, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSettingValueForCreatedAccount(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.RestoreSettingType settingType, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSettingsTitle(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.RestoreSettingType settingType, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
        return null;
    }
    
    public RestoreSettingsManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRestoreSettingsStorage storage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.ZcashBirthdayProvider zcashBirthdayProvider) {
        super();
    }
}