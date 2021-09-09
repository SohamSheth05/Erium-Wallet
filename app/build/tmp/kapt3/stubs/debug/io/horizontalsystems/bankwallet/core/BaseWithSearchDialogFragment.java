package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0004J\b\u0010\f\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H&R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bankwallet/core/BaseWithSearchDialogFragment;", "Lio/horizontalsystems/bankwallet/core/BaseDialogFragment;", "Lio/horizontalsystems/bankwallet/core/SearchViewHelper$Listener;", "()V", "searchView", "Landroidx/appcompat/widget/SearchView;", "configureSearchMenu", "", "menu", "Landroid/view/Menu;", "hint", "", "hideKeyboard", "onDetach", "searchCollapsed", "searchExpanded", "updateFilter", "query", "", "app_debug"})
public abstract class BaseWithSearchDialogFragment extends io.horizontalsystems.bankwallet.core.BaseDialogFragment implements io.horizontalsystems.bankwallet.core.SearchViewHelper.Listener {
    private androidx.appcompat.widget.SearchView searchView;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public abstract void updateFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @java.lang.Override()
    public void searchExpanded(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void searchCollapsed(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    protected final void configureSearchMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, int hint) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    private final void hideKeyboard() {
    }
    
    public BaseWithSearchDialogFragment() {
        super();
    }
}