package io.horizontalsystems.bankwallet.modules.send.submodules.confirmation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\tH\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007\u00a8\u0006\u001a"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/SendConfirmationView;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/SendConfirmationModule$IView;", "()V", "addPrimaryDataViewItem", "Lio/horizontalsystems/core/SingleLiveEvent;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/SendConfirmationModule$PrimaryItemData;", "getAddPrimaryDataViewItem", "()Lio/horizontalsystems/core/SingleLiveEvent;", "addSecondaryDataViewItem", "Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/SendConfirmationModule$SecondaryItemData;", "getAddSecondaryDataViewItem", "addSendButton", "", "getAddSendButton", "sendButtonState", "Lio/horizontalsystems/bankwallet/modules/send/submodules/confirmation/SendConfirmationModule$SendButtonState;", "getSendButtonState", "showCopied", "getShowCopied", "loadPrimaryItems", "primaryItemData", "loadSecondaryItems", "secondaryItemData", "loadSendButton", "setSendButtonState", "state", "app_debug"})
public final class SendConfirmationView implements io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationModule.IView {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationModule.PrimaryItemData> addPrimaryDataViewItem = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationModule.SecondaryItemData> addSecondaryDataViewItem = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> showCopied = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> addSendButton = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationModule.SendButtonState> sendButtonState = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationModule.PrimaryItemData> getAddPrimaryDataViewItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationModule.SecondaryItemData> getAddSecondaryDataViewItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getShowCopied() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getAddSendButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationModule.SendButtonState> getSendButtonState() {
        return null;
    }
    
    @java.lang.Override()
    public void loadPrimaryItems(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationModule.PrimaryItemData primaryItemData) {
    }
    
    @java.lang.Override()
    public void showCopied() {
    }
    
    @java.lang.Override()
    public void loadSecondaryItems(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationModule.SecondaryItemData secondaryItemData) {
    }
    
    @java.lang.Override()
    public void loadSendButton() {
    }
    
    @java.lang.Override()
    public void setSendButtonState(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.confirmation.SendConfirmationModule.SendButtonState state) {
    }
    
    public SendConfirmationView() {
        super();
    }
}