package io.horizontalsystems.bankwallet.core.ethereum;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ethereum/ISendFeeViewModel;", "", "estimatedFeeLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getEstimatedFeeLiveData", "()Landroidx/lifecycle/MutableLiveData;", "feeLiveData", "Landroidx/lifecycle/LiveData;", "getFeeLiveData", "()Landroidx/lifecycle/LiveData;", "hasEstimatedFee", "", "getHasEstimatedFee", "()Z", "warningOfStuckLiveData", "getWarningOfStuckLiveData", "app_debug"})
public abstract interface ISendFeeViewModel {
    
    public abstract boolean getHasEstimatedFee();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.MutableLiveData<java.lang.String> getEstimatedFeeLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.String> getFeeLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> getWarningOfStuckLiveData();
}