package io.horizontalsystems.bankwallet.modules.addtoken;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/addtoken/IAddEvmTokenResolver;", "", "apiUrl", "", "getApiUrl", "()Ljava/lang/String;", "explorerKey", "getExplorerKey", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "address", "app_debug"})
public abstract interface IAddEvmTokenResolver {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getApiUrl();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getExplorerKey();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.coinkit2.models.CoinType coinType(@org.jetbrains.annotations.NotNull()
    java.lang.String address);
}