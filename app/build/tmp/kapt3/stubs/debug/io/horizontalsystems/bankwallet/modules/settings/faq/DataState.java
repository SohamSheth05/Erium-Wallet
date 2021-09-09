package io.horizontalsystems.bankwallet.modules.settings.faq;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/faq/DataState;", "T", "", "()V", "Error", "Loading", "Success", "Lio/horizontalsystems/bankwallet/modules/settings/faq/DataState$Loading;", "Lio/horizontalsystems/bankwallet/modules/settings/faq/DataState$Success;", "Lio/horizontalsystems/bankwallet/modules/settings/faq/DataState$Error;", "app_debug"})
public abstract class DataState<T extends java.lang.Object> {
    
    private DataState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/faq/DataState$Loading;", "T", "Lio/horizontalsystems/bankwallet/modules/settings/faq/DataState;", "()V", "app_debug"})
    public static final class Loading<T extends java.lang.Object> extends io.horizontalsystems.bankwallet.modules.settings.faq.DataState<T> {
        
        public Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/faq/DataState$Success;", "T", "Lio/horizontalsystems/bankwallet/modules/settings/faq/DataState;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends io.horizontalsystems.bankwallet.modules.settings.faq.DataState<T> {
        private final T data = null;
        
        public final T getData() {
            return null;
        }
        
        public Success(T data) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/faq/DataState$Error;", "T", "Lio/horizontalsystems/bankwallet/modules/settings/faq/DataState;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "app_debug"})
    public static final class Error<T extends java.lang.Object> extends io.horizontalsystems.bankwallet.modules.settings.faq.DataState<T> {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable throwable = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable getThrowable() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable throwable) {
            super();
        }
    }
}