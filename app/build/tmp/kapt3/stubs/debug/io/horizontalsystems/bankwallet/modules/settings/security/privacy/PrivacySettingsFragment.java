package io.horizontalsystems.bankwallet.modules.settings.security.privacy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\'\u001a\u00020\u0019H\u0002J\b\u0010(\u001a\u00020\u0019H\u0002J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010*\u001a\u00020\u0019H\u0002J\b\u0010+\u001a\u00020\u0019H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsFragment;", "Lio/horizontalsystems/bankwallet/core/BaseFragment;", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsTorAdapter$Listener;", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsTransactionsStructureAdapter$Listener;", "()V", "communicationSettingsAdapter", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsAdapter;", "torControlAdapter", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsTorAdapter;", "viewModel", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsViewModel;", "walletRestoreSettingsAdapter", "getCommunicationModeInfo", "Lio/horizontalsystems/bankwallet/ui/extensions/BottomSheetSelectorViewItem;", "communicationMode", "Lio/horizontalsystems/bankwallet/entities/CommunicationMode;", "getSortingInfo", "sortingType", "Lio/horizontalsystems/bankwallet/entities/TransactionDataSortingType;", "getSortingLocalized", "", "getSyncModeInfo", "syncMode", "Lio/horizontalsystems/bankwallet/entities/SyncMode;", "onClick", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onTorSwitchChecked", "checked", "", "onViewCreated", "view", "openAppNotificationSettings", "restartApp", "showAppRestartAlert", "showNotificationsNotEnabledAlert", "showTorPrerequisitesAlert", "app_debug"})
public final class PrivacySettingsFragment extends io.horizontalsystems.bankwallet.core.BaseFragment implements io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsTorAdapter.Listener, io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsTransactionsStructureAdapter.Listener {
    private io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsViewModel viewModel;
    private io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsTorAdapter torControlAdapter;
    private io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsAdapter communicationSettingsAdapter;
    private io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsAdapter walletRestoreSettingsAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
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
    public void onTorSwitchChecked(boolean checked) {
    }
    
    @java.lang.Override()
    public void onClick() {
    }
    
    private final java.lang.String getSortingLocalized(io.horizontalsystems.bankwallet.entities.TransactionDataSortingType sortingType) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.ui.extensions.BottomSheetSelectorViewItem getSortingInfo(io.horizontalsystems.bankwallet.entities.TransactionDataSortingType sortingType) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.ui.extensions.BottomSheetSelectorViewItem getSyncModeInfo(io.horizontalsystems.bankwallet.entities.SyncMode syncMode) {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.ui.extensions.BottomSheetSelectorViewItem getCommunicationModeInfo(io.horizontalsystems.bankwallet.entities.CommunicationMode communicationMode) {
        return null;
    }
    
    private final void showAppRestartAlert(boolean checked) {
    }
    
    private final void showNotificationsNotEnabledAlert() {
    }
    
    private final void showTorPrerequisitesAlert() {
    }
    
    private final void openAppNotificationSettings() {
    }
    
    private final void restartApp() {
    }
    
    public PrivacySettingsFragment() {
        super();
    }
}