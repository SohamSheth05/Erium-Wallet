package io.horizontalsystems.bankwallet.modules.send.submodules.address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0006\u0010\u0014\u001a\u00020\bH\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressInteractor;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IInteractor;", "textHelper", "Lio/horizontalsystems/bankwallet/core/IClipboardManager;", "addressParser", "Lio/horizontalsystems/bankwallet/core/IAddressParser;", "(Lio/horizontalsystems/bankwallet/core/IClipboardManager;Lio/horizontalsystems/bankwallet/core/IAddressParser;)V", "addressFromClipboard", "", "getAddressFromClipboard", "()Ljava/lang/String;", "delegate", "Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IInteractorDelegate;)V", "parseAddress", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "address", "app_debug"})
public final class SendAddressInteractor implements io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IInteractorDelegate delegate;
    private final io.horizontalsystems.bankwallet.core.IClipboardManager textHelper = null;
    private final io.horizontalsystems.bankwallet.core.IAddressParser addressParser = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IInteractorDelegate p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getAddressFromClipboard() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.math.BigDecimal> parseAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    public SendAddressInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IClipboardManager textHelper, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAddressParser addressParser) {
        super();
    }
}