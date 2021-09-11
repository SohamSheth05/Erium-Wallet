package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0004J\b\u0010\u0005\u001a\u00020\u0004H\u0004J\b\u0010\u0006\u001a\u00020\u0004H\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\tH\u0004J\b\u0010\n\u001a\u00020\tH\u0004J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0004J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/core/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "allowScreenshot", "", "disallowScreenshot", "hideKeyboard", "hideProgressBar", "navOptions", "Landroidx/navigation/NavOptions;", "navOptionsFromBottom", "setMenuItemEnabled", "menuItem", "Landroid/view/MenuItem;", "enabled", "", "showCustomKeyboardAlert", "showProgressBar", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    private java.util.HashMap _$_findViewCache;
    
    protected final void hideKeyboard() {
    }
    
    protected final void setMenuItemEnabled(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem, boolean enabled) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.navigation.NavOptions navOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.navigation.NavOptions navOptionsFromBottom() {
        return null;
    }
    
    protected final void allowScreenshot() {
    }
    
    protected final void disallowScreenshot() {
    }
    
    public final void showCustomKeyboardAlert() {
    }
    
    public final void showProgressBar() {
    }
    
    public final void hideProgressBar() {
    }
    
    public BaseFragment() {
        super();
    }
}