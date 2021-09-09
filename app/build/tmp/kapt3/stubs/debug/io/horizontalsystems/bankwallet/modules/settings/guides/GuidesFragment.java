package io.horizontalsystems.bankwallet.modules.settings.guides;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\"\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\'"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/guides/GuidesFragment;", "Lio/horizontalsystems/bankwallet/core/BaseFragment;", "Lio/horizontalsystems/bankwallet/modules/settings/guides/GuidesAdapter$Listener;", "Lio/horizontalsystems/bankwallet/modules/transactions/FilterAdapter$Listener;", "()V", "errorAdapter", "Lio/horizontalsystems/bankwallet/modules/settings/guides/ErrorAdapter;", "filterAdapter", "Lio/horizontalsystems/bankwallet/modules/transactions/FilterAdapter;", "guidesAdapter", "Lio/horizontalsystems/bankwallet/modules/settings/guides/GuidesAdapter;", "viewModel", "Lio/horizontalsystems/bankwallet/modules/settings/guides/GuidesViewModel;", "getViewModel", "()Lio/horizontalsystems/bankwallet/modules/settings/guides/GuidesViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "observeLiveData", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onFilterItemClick", "item", "Lio/horizontalsystems/bankwallet/modules/transactions/FilterAdapter$FilterItem;", "itemPosition", "", "itemWidth", "onItemClick", "guide", "Lio/horizontalsystems/bankwallet/entities/Guide;", "onViewCreated", "view", "app_debug"})
public final class GuidesFragment extends io.horizontalsystems.bankwallet.core.BaseFragment implements io.horizontalsystems.bankwallet.modules.settings.guides.GuidesAdapter.Listener, io.horizontalsystems.bankwallet.modules.transactions.FilterAdapter.Listener {
    private final kotlin.Lazy viewModel$delegate = null;
    private final io.horizontalsystems.bankwallet.modules.settings.guides.ErrorAdapter errorAdapter = null;
    private final io.horizontalsystems.bankwallet.modules.settings.guides.GuidesAdapter guidesAdapter = null;
    private final io.horizontalsystems.bankwallet.modules.transactions.FilterAdapter filterAdapter = null;
    private java.util.HashMap _$_findViewCache;
    
    private final io.horizontalsystems.bankwallet.modules.settings.guides.GuidesViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Guide guide) {
    }
    
    private final void observeLiveData() {
    }
    
    @java.lang.Override()
    public void onFilterItemClick(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.transactions.FilterAdapter.FilterItem item, int itemPosition, int itemWidth) {
    }
    
    public GuidesFragment() {
        super();
    }
}