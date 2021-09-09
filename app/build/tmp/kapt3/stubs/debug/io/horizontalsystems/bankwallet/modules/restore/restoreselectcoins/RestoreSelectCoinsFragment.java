package io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\u0016\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u001a\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsFragment;", "Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinListBaseFragment;", "()V", "coinSettingsViewModel", "Lio/horizontalsystems/bankwallet/modules/blockchainsettings/CoinSettingsViewModel;", "doneMenuButton", "Landroid/view/MenuItem;", "restoreSettingsViewModel", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsViewModel;", "title", "", "getTitle", "()Ljava/lang/String;", "viewModel", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsViewModel;", "disable", "", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "edit", "enable", "observe", "onCancelSelection", "onSelect", "indexes", "", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "updateFilter", "query", "Companion", "app_debug"})
public final class RestoreSelectCoinsFragment extends io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinListBaseFragment {
    private io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsViewModel viewModel;
    private io.horizontalsystems.bankwallet.modules.blockchainsettings.CoinSettingsViewModel coinSettingsViewModel;
    private io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsViewModel restoreSettingsViewModel;
    private android.view.MenuItem doneMenuButton;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCOUNT_TYPE_KEY = "account_type_key";
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSelectCoinsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void enable(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    @java.lang.Override()
    public void disable(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    @java.lang.Override()
    public void edit(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    @java.lang.Override()
    public void updateFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @java.lang.Override()
    public void onCancelSelection() {
    }
    
    @java.lang.Override()
    public void onSelect(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> indexes) {
    }
    
    private final void observe() {
    }
    
    public RestoreSelectCoinsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSelectCoinsFragment$Companion;", "", "()V", "ACCOUNT_TYPE_KEY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}