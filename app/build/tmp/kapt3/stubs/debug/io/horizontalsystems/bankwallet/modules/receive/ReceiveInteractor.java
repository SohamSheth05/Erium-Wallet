package io.horizontalsystems.bankwallet.modules.receive;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/receive/ReceiveInteractor;", "Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IInteractor;", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "adapterManager", "Lio/horizontalsystems/bankwallet/core/IAdapterManager;", "clipboardManager", "Lio/horizontalsystems/bankwallet/core/IClipboardManager;", "(Lio/horizontalsystems/bankwallet/entities/Wallet;Lio/horizontalsystems/bankwallet/core/IAdapterManager;Lio/horizontalsystems/bankwallet/core/IClipboardManager;)V", "delegate", "Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IInteractorDelegate;)V", "copyToClipboard", "", "coinAddress", "", "getReceiveAddress", "app_debug"})
public final class ReceiveInteractor implements io.horizontalsystems.bankwallet.modules.receive.ReceiveModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.receive.ReceiveModule.IInteractorDelegate delegate;
    private io.horizontalsystems.bankwallet.entities.Wallet wallet;
    private io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager;
    private io.horizontalsystems.bankwallet.core.IClipboardManager clipboardManager;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.receive.ReceiveModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.receive.ReceiveModule.IInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void getReceiveAddress() {
    }
    
    @java.lang.Override()
    public void copyToClipboard(@org.jetbrains.annotations.NotNull()
    java.lang.String coinAddress) {
    }
    
    public ReceiveInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAdapterManager adapterManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IClipboardManager clipboardManager) {
        super();
    }
}