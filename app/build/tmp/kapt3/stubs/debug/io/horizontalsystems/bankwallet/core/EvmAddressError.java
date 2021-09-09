package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/core/EvmAddressError;", "", "()V", "InvalidAddress", "Lio/horizontalsystems/bankwallet/core/EvmAddressError$InvalidAddress;", "app_debug"})
public abstract class EvmAddressError extends java.lang.Throwable {
    
    private EvmAddressError() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/core/EvmAddressError$InvalidAddress;", "Lio/horizontalsystems/bankwallet/core/EvmAddressError;", "()V", "getLocalizedMessage", "", "app_debug"})
    public static final class InvalidAddress extends io.horizontalsystems.bankwallet.core.EvmAddressError {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.core.EvmAddressError.InvalidAddress INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getLocalizedMessage() {
            return null;
        }
        
        private InvalidAddress() {
            super();
        }
    }
}