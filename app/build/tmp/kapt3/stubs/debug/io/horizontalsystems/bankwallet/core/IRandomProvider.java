package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/core/IRandomProvider;", "", "getRandomIndexes", "", "", "count", "maxIndex", "app_debug"})
public abstract interface IRandomProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.Integer> getRandomIndexes(int count, int maxIndex);
}