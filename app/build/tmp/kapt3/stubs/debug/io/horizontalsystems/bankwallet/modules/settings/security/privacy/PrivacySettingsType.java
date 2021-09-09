package io.horizontalsystems.bankwallet.modules.settings.security.privacy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsType;", "", "()V", "selectedTitle", "", "getSelectedTitle", "()Ljava/lang/String;", "CommunicationModeSettingType", "RestoreModeSettingType", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsType$CommunicationModeSettingType;", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsType$RestoreModeSettingType;", "app_debug"})
public abstract class PrivacySettingsType {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String selectedTitle = "";
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getSelectedTitle() {
        return null;
    }
    
    private PrivacySettingsType() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsType$CommunicationModeSettingType;", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsType;", "selected", "Lio/horizontalsystems/bankwallet/entities/CommunicationMode;", "(Lio/horizontalsystems/bankwallet/entities/CommunicationMode;)V", "getSelected", "()Lio/horizontalsystems/bankwallet/entities/CommunicationMode;", "setSelected", "selectedTitle", "", "getSelectedTitle", "()Ljava/lang/String;", "app_debug"})
    public static final class CommunicationModeSettingType extends io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsType {
        @org.jetbrains.annotations.NotNull()
        private io.horizontalsystems.bankwallet.entities.CommunicationMode selected;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getSelectedTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.CommunicationMode getSelected() {
            return null;
        }
        
        public final void setSelected(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.CommunicationMode p0) {
        }
        
        public CommunicationModeSettingType(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.CommunicationMode selected) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsType$RestoreModeSettingType;", "Lio/horizontalsystems/bankwallet/modules/settings/security/privacy/PrivacySettingsType;", "selected", "Lio/horizontalsystems/bankwallet/entities/SyncMode;", "(Lio/horizontalsystems/bankwallet/entities/SyncMode;)V", "getSelected", "()Lio/horizontalsystems/bankwallet/entities/SyncMode;", "setSelected", "selectedTitle", "", "getSelectedTitle", "()Ljava/lang/String;", "app_debug"})
    public static final class RestoreModeSettingType extends io.horizontalsystems.bankwallet.modules.settings.security.privacy.PrivacySettingsType {
        @org.jetbrains.annotations.NotNull()
        private io.horizontalsystems.bankwallet.entities.SyncMode selected;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getSelectedTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.entities.SyncMode getSelected() {
            return null;
        }
        
        public final void setSelected(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.SyncMode p0) {
        }
        
        public RestoreModeSettingType(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.SyncMode selected) {
            super();
        }
    }
}