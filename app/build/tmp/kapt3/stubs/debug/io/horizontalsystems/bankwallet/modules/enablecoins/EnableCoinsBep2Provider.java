package io.horizontalsystems.bankwallet.modules.enablecoins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/enablecoins/EnableCoinsBep2Provider;", "", "appConfigProvider", "Lio/horizontalsystems/core/IBuildConfigProvider;", "(Lio/horizontalsystems/core/IBuildConfigProvider;)V", "binanceApi", "Lio/horizontalsystems/binancechainkit/core/api/BinanceChainApi;", "networkType", "Lio/horizontalsystems/binancechainkit/BinanceChainKit$NetworkType;", "getTokenSymbolsAsync", "Lio/reactivex/Single;", "", "", "words", "passphrase", "app_debug"})
public final class EnableCoinsBep2Provider {
    private final io.horizontalsystems.binancechainkit.BinanceChainKit.NetworkType networkType = null;
    private final io.horizontalsystems.binancechainkit.core.api.BinanceChainApi binanceApi = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.util.List<java.lang.String>> getTokenSymbolsAsync(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> words, @org.jetbrains.annotations.NotNull()
    java.lang.String passphrase) {
        return null;
    }
    
    public EnableCoinsBep2Provider(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.IBuildConfigProvider appConfigProvider) {
        super();
    }
}