package io.horizontalsystems.bankwallet.core.ethereum;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0011H&J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H&R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ethereum/ISendFeePriorityViewModel;", "", "feeSliderLiveData", "Landroidx/lifecycle/LiveData;", "Lio/horizontalsystems/bankwallet/core/ethereum/SendFeeSliderViewItem;", "getFeeSliderLiveData", "()Landroidx/lifecycle/LiveData;", "openSelectPriorityLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "Lio/horizontalsystems/bankwallet/core/ethereum/SendPriorityViewItem;", "getOpenSelectPriorityLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "priorityLiveData", "", "getPriorityLiveData", "changeCustomPriority", "", "value", "", "openSelectPriority", "selectPriority", "index", "", "app_debug"})
public abstract interface ISendFeePriorityViewModel {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.String> getPriorityLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.core.SingleLiveEvent<java.util.List<io.horizontalsystems.bankwallet.core.ethereum.SendPriorityViewItem>> getOpenSelectPriorityLiveEvent();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<io.horizontalsystems.bankwallet.core.ethereum.SendFeeSliderViewItem> getFeeSliderLiveData();
    
    public abstract void openSelectPriority();
    
    public abstract void selectPriority(int index);
    
    public abstract void changeCustomPriority(long value);
}