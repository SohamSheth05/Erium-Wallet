package io.horizontalsystems.bankwallet.modules.market;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0002R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketLoadingAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lio/horizontalsystems/bankwallet/modules/market/MarketLoadingState;", "Lio/horizontalsystems/bankwallet/modules/market/ViewHolderMarketLoading;", "loadingLiveData", "Landroidx/lifecycle/LiveData;", "", "errorLiveData", "", "onErrorClick", "Lkotlin/Function0;", "", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/LifecycleOwner;)V", "error", "loading", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "syncState", "Companion", "app_debug"})
public final class MarketLoadingAdapter extends androidx.recyclerview.widget.ListAdapter<io.horizontalsystems.bankwallet.modules.market.MarketLoadingState, io.horizontalsystems.bankwallet.modules.market.ViewHolderMarketLoading> {
    private boolean loading = false;
    private java.lang.String error;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onErrorClick = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<io.horizontalsystems.bankwallet.modules.market.MarketLoadingState> marketStateDiff = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.market.MarketLoadingAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.market.ViewHolderMarketLoading onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.ViewHolderMarketLoading holder, int position) {
    }
    
    private final synchronized void syncState() {
    }
    
    public MarketLoadingAdapter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.Boolean> loadingLiveData, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.String> errorLiveData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onErrorClick, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner viewLifecycleOwner) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/market/MarketLoadingAdapter$Companion;", "", "()V", "marketStateDiff", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lio/horizontalsystems/bankwallet/modules/market/MarketLoadingState;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}