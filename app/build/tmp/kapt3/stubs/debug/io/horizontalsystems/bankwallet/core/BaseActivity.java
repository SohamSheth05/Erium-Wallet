package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0004J\"\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/core/BaseActivity;", "Lio/horizontalsystems/core/CoreActivity;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "()V", "dialog", "Landroid/app/Dialog;", "hideProgressBar", "", "hideSoftKeyboard", "onDestinationChanged", "controller", "Landroidx/navigation/NavController;", "destination", "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;", "showProgressBar", "app_debug"})
public abstract class BaseActivity extends io.horizontalsystems.core.CoreActivity implements androidx.navigation.NavController.OnDestinationChangedListener {
    private android.app.Dialog dialog;
    private java.util.HashMap _$_findViewCache;
    
    protected final void hideSoftKeyboard() {
    }
    
    @java.lang.Override()
    public void onDestinationChanged(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController controller, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavDestination destination, @org.jetbrains.annotations.Nullable()
    android.os.Bundle arguments) {
    }
    
    public final void showProgressBar() {
    }
    
    public final void hideProgressBar() {
    }
    
    public BaseActivity() {
        super();
    }
}