package io.horizontalsystems.bankwallet.modules.settings.experimental.bitcoinhodling;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/experimental/bitcoinhodling/BitcoinHodlingInteractor;", "Lio/horizontalsystems/bankwallet/modules/settings/experimental/bitcoinhodling/BitcoinHodlingModule$IInteractor;", "storage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "(Lio/horizontalsystems/bankwallet/core/ILocalStorage;)V", "enabled", "", "isLockTimeEnabled", "()Z", "setLockTimeEnabled", "(Z)V", "app_debug"})
public final class BitcoinHodlingInteractor implements io.horizontalsystems.bankwallet.modules.settings.experimental.bitcoinhodling.BitcoinHodlingModule.IInteractor {
    private final io.horizontalsystems.bankwallet.core.ILocalStorage storage = null;
    
    @java.lang.Override()
    public boolean isLockTimeEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public void setLockTimeEnabled(boolean enabled) {
    }
    
    public BitcoinHodlingInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage storage) {
        super();
    }
}