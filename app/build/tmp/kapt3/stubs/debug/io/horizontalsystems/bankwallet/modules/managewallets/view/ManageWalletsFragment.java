package io.horizontalsystems.bankwallet.modules.managewallets.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0016J\u0016\u0010$\u001a\u00020\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&H\u0016J\u001a\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020\u001d2\u0006\u00101\u001a\u000202H\u0016J\b\u00104\u001a\u00020\u001dH\u0002J\u0010\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u000fH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u0019\u0010\u001a\u00a8\u00067"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/managewallets/view/ManageWalletsFragment;", "Lio/horizontalsystems/bankwallet/ui/extensions/coinlist/CoinListBaseFragment;", "()V", "coinSettingsViewModel", "Lio/horizontalsystems/bankwallet/modules/blockchainsettings/CoinSettingsViewModel;", "getCoinSettingsViewModel", "()Lio/horizontalsystems/bankwallet/modules/blockchainsettings/CoinSettingsViewModel;", "coinSettingsViewModel$delegate", "Lkotlin/Lazy;", "restoreSettingsViewModel", "Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsViewModel;", "getRestoreSettingsViewModel", "()Lio/horizontalsystems/bankwallet/modules/restore/restoreselectcoins/RestoreSettingsViewModel;", "restoreSettingsViewModel$delegate", "title", "", "getTitle", "()Ljava/lang/String;", "viewModel", "Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsViewModel;", "getViewModel", "()Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsViewModel;", "viewModel$delegate", "vmFactory", "Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsModule$Factory;", "getVmFactory", "()Lio/horizontalsystems/bankwallet/modules/managewallets/ManageWalletsModule$Factory;", "vmFactory$delegate", "disable", "", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "edit", "enable", "observe", "onCancelSelection", "onSelect", "indexes", "", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "openAddToken", "tokenType", "Lio/horizontalsystems/bankwallet/modules/addtoken/TokenType;", "searchCollapsed", "menu", "Landroid/view/Menu;", "searchExpanded", "showAddTokenDialog", "updateFilter", "query", "app_debug"})
public final class ManageWalletsFragment extends io.horizontalsystems.bankwallet.ui.extensions.coinlist.CoinListBaseFragment {
    private final kotlin.Lazy vmFactory$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy coinSettingsViewModel$delegate = null;
    private final kotlin.Lazy restoreSettingsViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsModule.Factory getVmFactory() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.managewallets.ManageWalletsViewModel getViewModel() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.blockchainsettings.CoinSettingsViewModel getCoinSettingsViewModel() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.restore.restoreselectcoins.RestoreSettingsViewModel getRestoreSettingsViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void searchExpanded(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void searchCollapsed(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
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
    
    private final void showAddTokenDialog() {
    }
    
    private final void openAddToken(io.horizontalsystems.bankwallet.modules.addtoken.TokenType tokenType) {
    }
    
    public ManageWalletsFragment() {
        super();
    }
}