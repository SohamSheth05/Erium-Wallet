package io.horizontalsystems.bankwallet.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/ApiError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "ApiLimitExceeded", "ContractNotFound", "InvalidResponse", "TokenNotFound", "Lio/horizontalsystems/bankwallet/entities/ApiError$ApiLimitExceeded;", "Lio/horizontalsystems/bankwallet/entities/ApiError$ContractNotFound;", "Lio/horizontalsystems/bankwallet/entities/ApiError$TokenNotFound;", "Lio/horizontalsystems/bankwallet/entities/ApiError$InvalidResponse;", "app_debug"})
public abstract class ApiError extends java.lang.Exception {
    
    private ApiError() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/ApiError$ApiLimitExceeded;", "Lio/horizontalsystems/bankwallet/entities/ApiError;", "()V", "app_debug"})
    public static final class ApiLimitExceeded extends io.horizontalsystems.bankwallet.entities.ApiError {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.entities.ApiError.ApiLimitExceeded INSTANCE = null;
        
        private ApiLimitExceeded() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/ApiError$ContractNotFound;", "Lio/horizontalsystems/bankwallet/entities/ApiError;", "()V", "app_debug"})
    public static final class ContractNotFound extends io.horizontalsystems.bankwallet.entities.ApiError {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.entities.ApiError.ContractNotFound INSTANCE = null;
        
        private ContractNotFound() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/ApiError$TokenNotFound;", "Lio/horizontalsystems/bankwallet/entities/ApiError;", "()V", "app_debug"})
    public static final class TokenNotFound extends io.horizontalsystems.bankwallet.entities.ApiError {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.entities.ApiError.TokenNotFound INSTANCE = null;
        
        private TokenNotFound() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/entities/ApiError$InvalidResponse;", "Lio/horizontalsystems/bankwallet/entities/ApiError;", "()V", "app_debug"})
    public static final class InvalidResponse extends io.horizontalsystems.bankwallet.entities.ApiError {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.entities.ApiError.InvalidResponse INSTANCE = null;
        
        private InvalidResponse() {
            super();
        }
    }
}