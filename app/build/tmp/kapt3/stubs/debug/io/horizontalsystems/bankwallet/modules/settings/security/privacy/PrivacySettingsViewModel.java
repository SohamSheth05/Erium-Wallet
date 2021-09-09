package io.horizontalsystems.bankwallet.modules.settings.security.privacy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u00106\u001a\u00020\u0012J\b\u00107\u001a\u00020\u0012H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u00108\u001a\u00020\u00122\f\u00109\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0016\u0010:\u001a\u00020\u00122\f\u00109\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u0017H\u0016J\u0010\u0010<\u001a\u00020\u00122\u0006\u0010=\u001a\u00020.H\u0016J\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\u001fH\u0016J&\u0010!\u001a\u00020\u00122\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\u0006\u0010A\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u0012H\u0016J\b\u0010&\u001a\u00020\u0012H\u0016J\u0010\u0010B\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u001aH\u0016J&\u0010(\u001a\u00020\u00122\f\u0010D\u001a\b\u0012\u0004\u0012\u00020)0\u00072\u0006\u0010A\u001a\u00020)2\u0006\u0010>\u001a\u00020\u001eH\u0016J\b\u0010+\u001a\u00020\u0012H\u0016J\u001e\u0010E\u001a\u00020\u00122\f\u00109\u001a\b\u0012\u0004\u0012\u00020.0\u00072\u0006\u0010F\u001a\u00020.H\u0016J\u0010\u0010G\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u001aH\u0016R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\nR#\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\nR/\u0010!\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0007\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001e0\"0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\nR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\nR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\nR/\u0010(\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u0007\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001e0\"0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\nR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\nR)\u0010-\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u0007\u0012\u0004\u0012\u00020.0\u001d0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\nR\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u001a01\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020.01\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00103\u00a8\u0006I"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsModule$IPrivacySettingsView;", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsModule$IPrivacySettingsRouter;", "()V", "communicationSettingsViewItems", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsViewItem;", "getCommunicationSettingsViewItems", "()Lio/horizontalsystems/core/SingleLiveEvent;", "delegate", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsModule$IPrivacySettingsViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsModule$IPrivacySettingsViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsModule$IPrivacySettingsViewDelegate;)V", "restartApp", "", "getRestartApp", "restoreWalletSettingsViewItems", "getRestoreWalletSettingsViewItems", "setTorConnectionStatus", "Lio/horizontalsystems/bankwallet/core/managers/TorStatus;", "getSetTorConnectionStatus", "showAppRestartAlertForTor", "", "getShowAppRestartAlertForTor", "showCommunicationModeChangeAlert", "Lkotlin/Pair;", "Lio/horizontalsystems/coinkit2/models/Coin;", "Lio/horizontalsystems/bankwallet/entities/CommunicationMode;", "getShowCommunicationModeChangeAlert", "showCommunicationSelectorDialog", "Lkotlin/Triple;", "getShowCommunicationSelectorDialog", "showNotificationsNotEnabledAlert", "getShowNotificationsNotEnabledAlert", "showPrivacySettingsInfo", "getShowPrivacySettingsInfo", "showSyncModeSelectorDialog", "Lio/horizontalsystems/bankwallet/entities/SyncMode;", "getShowSyncModeSelectorDialog", "showTorPrerequisitesAlert", "getShowTorPrerequisitesAlert", "showTransactionsSortingSelectorDialog", "Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;", "getShowTransactionsSortingSelectorDialog", "torEnabledLiveData", "Landroidx/lifecycle/MutableLiveData;", "getTorEnabledLiveData", "()Landroidx/lifecycle/MutableLiveData;", "transactionOrderingLiveData", "getTransactionOrderingLiveData", "init", "onCleared", "setCommunicationSettingsViewItems", "items", "setRestoreWalletSettingsViewItems", "connectionStatus", "setTransactionsOrdering", "transactionsOrdering", "coin", "selectedCommunication", "communicationModeOptions", "selected", "showRestartAlert", "checked", "syncModeOptions", "showTransactionsSortingOptions", "selectedItem", "toggleTorEnabled", "torEnabled", "app_debug"})
public final class PrivacySettingsViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsModule.IPrivacySettingsView, io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsModule.IPrivacySettingsRouter {
    public io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsModule.IPrivacySettingsViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> showPrivacySettingsInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> torEnabledLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.entities.TransactionDataSortingType> transactionOrderingLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.Boolean> showAppRestartAlertForTor = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> showNotificationsNotEnabledAlert = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> showTorPrerequisitesAlert = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.util.List<io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsViewItem>> communicationSettingsViewItems = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.util.List<io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsViewItem>> restoreWalletSettingsViewItems = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Triple<java.util.List<io.horizontalsystems.bankwallet.entities.SyncMode>, io.horizontalsystems.bankwallet.entities.SyncMode, io.horizontalsystems.coinkit2.models.Coin>> showSyncModeSelectorDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Pair<java.util.List<io.horizontalsystems.bankwallet.entities.TransactionDataSortingType>, io.horizontalsystems.bankwallet.entities.TransactionDataSortingType>> showTransactionsSortingSelectorDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Triple<java.util.List<io.horizontalsystems.bankwallet.entities.CommunicationMode>, io.horizontalsystems.bankwallet.entities.CommunicationMode, io.horizontalsystems.coinkit2.models.Coin>> showCommunicationSelectorDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Pair<io.horizontalsystems.coinkit2.models.Coin, io.horizontalsystems.bankwallet.entities.CommunicationMode>> showCommunicationModeChangeAlert = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.core.managers.TorStatus> setTorConnectionStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> restartApp = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsModule.IPrivacySettingsViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsModule.IPrivacySettingsViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getShowPrivacySettingsInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getTorEnabledLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.entities.TransactionDataSortingType> getTransactionOrderingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.Boolean> getShowAppRestartAlertForTor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getShowNotificationsNotEnabledAlert() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getShowTorPrerequisitesAlert() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.util.List<io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsViewItem>> getCommunicationSettingsViewItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.util.List<io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsViewItem>> getRestoreWalletSettingsViewItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Triple<java.util.List<io.horizontalsystems.bankwallet.entities.SyncMode>, io.horizontalsystems.bankwallet.entities.SyncMode, io.horizontalsystems.coinkit2.models.Coin>> getShowSyncModeSelectorDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Pair<java.util.List<io.horizontalsystems.bankwallet.entities.TransactionDataSortingType>, io.horizontalsystems.bankwallet.entities.TransactionDataSortingType>> getShowTransactionsSortingSelectorDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Triple<java.util.List<io.horizontalsystems.bankwallet.entities.CommunicationMode>, io.horizontalsystems.bankwallet.entities.CommunicationMode, io.horizontalsystems.coinkit2.models.Coin>> getShowCommunicationSelectorDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Pair<io.horizontalsystems.coinkit2.models.Coin, io.horizontalsystems.bankwallet.entities.CommunicationMode>> getShowCommunicationModeChangeAlert() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.core.managers.TorStatus> getSetTorConnectionStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getRestartApp() {
        return null;
    }
    
    public final void init() {
    }
    
    @java.lang.Override()
    public void showPrivacySettingsInfo() {
    }
    
    @java.lang.Override()
    public void showNotificationsNotEnabledAlert() {
    }
    
    @java.lang.Override()
    public void showTorPrerequisitesAlert() {
    }
    
    @java.lang.Override()
    public void toggleTorEnabled(boolean torEnabled) {
    }
    
    @java.lang.Override()
    public void showTransactionsSortingOptions(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.entities.TransactionDataSortingType> items, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionDataSortingType selectedItem) {
    }
    
    @java.lang.Override()
    public void setTransactionsOrdering(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionDataSortingType transactionsOrdering) {
    }
    
    @java.lang.Override()
    public void setTorConnectionStatus(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.TorStatus connectionStatus) {
    }
    
    @java.lang.Override()
    public void showRestartAlert(boolean checked) {
    }
    
    @java.lang.Override()
    public void setCommunicationSettingsViewItems(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsViewItem> items) {
    }
    
    @java.lang.Override()
    public void setRestoreWalletSettingsViewItems(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsViewItem> items) {
    }
    
    @java.lang.Override()
    public void showCommunicationSelectorDialog(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.entities.CommunicationMode> communicationModeOptions, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CommunicationMode selected, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    @java.lang.Override()
    public void showSyncModeSelectorDialog(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.entities.SyncMode> syncModeOptions, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.SyncMode selected, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
    }
    
    @java.lang.Override()
    public void showCommunicationModeChangeAlert(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.CommunicationMode selectedCommunication) {
    }
    
    @java.lang.Override()
    public void restartApp() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public PrivacySettingsViewModel() {
        super();
    }
}