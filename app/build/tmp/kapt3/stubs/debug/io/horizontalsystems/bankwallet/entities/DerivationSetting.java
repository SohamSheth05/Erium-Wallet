package io.horizontalsystems.bankwallet.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/DerivationSetting;", "", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "derivation", "Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;", "(Lio/horizontalsystems/coinkit2/models/CoinType;Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;)V", "getCoinType", "()Lio/horizontalsystems/coinkit2/models/CoinType;", "getDerivation", "()Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;", "setDerivation", "(Lio/horizontalsystems/bankwallet/entities/AccountType$Derivation;)V", "app_debug"})
public final class DerivationSetting {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.coinkit2.models.CoinType coinType = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.entities.AccountType.Derivation derivation;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.coinkit2.models.CoinType getCoinType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.entities.AccountType.Derivation getDerivation() {
        return null;
    }
    
    public final void setDerivation(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.AccountType.Derivation p0) {
    }
    
    public DerivationSetting(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.AccountType.Derivation derivation) {
        super();
    }
}