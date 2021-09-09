package io.horizontalsystems.bankwallet.modules.markdown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/LoadStatus;", "", "()V", "Failed", "Initial", "Loaded", "Loading", "Lio/horizontalsystems/bankwallet/modules/markdown/LoadStatus$Initial;", "Lio/horizontalsystems/bankwallet/modules/markdown/LoadStatus$Loading;", "Lio/horizontalsystems/bankwallet/modules/markdown/LoadStatus$Loaded;", "Lio/horizontalsystems/bankwallet/modules/markdown/LoadStatus$Failed;", "app_debug"})
public abstract class LoadStatus {
    
    private LoadStatus() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/LoadStatus$Initial;", "Lio/horizontalsystems/bankwallet/modules/markdown/LoadStatus;", "()V", "app_debug"})
    public static final class Initial extends io.horizontalsystems.bankwallet.modules.markdown.LoadStatus {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.markdown.LoadStatus.Initial INSTANCE = null;
        
        private Initial() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/LoadStatus$Loading;", "Lio/horizontalsystems/bankwallet/modules/markdown/LoadStatus;", "()V", "app_debug"})
    public static final class Loading extends io.horizontalsystems.bankwallet.modules.markdown.LoadStatus {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.markdown.LoadStatus.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/LoadStatus$Loaded;", "Lio/horizontalsystems/bankwallet/modules/markdown/LoadStatus;", "()V", "app_debug"})
    public static final class Loaded extends io.horizontalsystems.bankwallet.modules.markdown.LoadStatus {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.markdown.LoadStatus.Loaded INSTANCE = null;
        
        private Loaded() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/LoadStatus$Failed;", "Lio/horizontalsystems/bankwallet/modules/markdown/LoadStatus;", "e", "", "(Ljava/lang/Throwable;)V", "getE", "()Ljava/lang/Throwable;", "app_debug"})
    public static final class Failed extends io.horizontalsystems.bankwallet.modules.markdown.LoadStatus {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable e = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable getE() {
            return null;
        }
        
        public Failed(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            super();
        }
    }
}