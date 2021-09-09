package io.horizontalsystems.bankwallet.modules.swap.tradeoptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/AddressResolutionProvider;", "", "()V", "resolution", "Lcom/unstoppabledomains/resolution/Resolution;", "isValid", "", "domain", "", "resolveAsync", "Lio/reactivex/Single;", "ticker", "app_debug"})
public final class AddressResolutionProvider {
    private com.unstoppabledomains.resolution.Resolution resolution;
    
    public final boolean isValid(@org.jetbrains.annotations.NotNull()
    java.lang.String domain) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.lang.String> resolveAsync(@org.jetbrains.annotations.NotNull()
    java.lang.String domain, @org.jetbrains.annotations.NotNull()
    java.lang.String ticker) {
        return null;
    }
    
    public AddressResolutionProvider() {
        super();
    }
}