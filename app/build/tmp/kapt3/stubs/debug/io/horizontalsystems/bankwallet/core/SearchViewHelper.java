package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/core/SearchViewHelper;", "", "()V", "configureSearchMenu", "Landroidx/appcompat/widget/SearchView;", "context", "Landroid/content/Context;", "menu", "Landroid/view/Menu;", "hint", "", "listener", "Lio/horizontalsystems/bankwallet/core/SearchViewHelper$Listener;", "Listener", "app_debug"})
public final class SearchViewHelper {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.SearchViewHelper INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.widget.SearchView configureSearchMenu(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    java.lang.String hint, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.SearchViewHelper.Listener listener) {
        return null;
    }
    
    private SearchViewHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/core/SearchViewHelper$Listener;", "", "searchCollapsed", "", "menu", "Landroid/view/Menu;", "searchExpanded", "updateFilter", "query", "", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void updateFilter(@org.jetbrains.annotations.NotNull()
        java.lang.String query);
        
        public abstract void searchExpanded(@org.jetbrains.annotations.NotNull()
        android.view.Menu menu);
        
        public abstract void searchCollapsed(@org.jetbrains.annotations.NotNull()
        android.view.Menu menu);
    }
}