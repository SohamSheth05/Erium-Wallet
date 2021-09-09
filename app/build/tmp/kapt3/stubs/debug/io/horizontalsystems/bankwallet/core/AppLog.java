package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fJ\u001e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0015R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/core/AppLog;", "", "()V", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "logsDao", "Lio/horizontalsystems/bankwallet/core/storage/LogsDao;", "getLogsDao", "()Lio/horizontalsystems/bankwallet/core/storage/LogsDao;", "setLogsDao", "(Lio/horizontalsystems/bankwallet/core/storage/LogsDao;)V", "sdf", "Ljava/text/SimpleDateFormat;", "generateId", "", "prefix", "getLog", "", "getStackTraceString", "error", "", "info", "", "actionId", "message", "warning", "e", "app_debug"})
public final class AppLog {
    public static io.horizontalsystems.bankwallet.core.storage.LogsDao logsDao;
    private static final java.util.concurrent.ExecutorService executor = null;
    private static final java.text.SimpleDateFormat sdf = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.AppLog INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.core.storage.LogsDao getLogsDao() {
        return null;
    }
    
    public final void setLogsDao(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.storage.LogsDao p0) {
    }
    
    public final void info(@org.jetbrains.annotations.NotNull()
    java.lang.String actionId, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void warning(@org.jetbrains.annotations.NotNull()
    java.lang.String actionId, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String generateId(@org.jetbrains.annotations.NotNull()
    java.lang.String prefix) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> getLog() {
        return null;
    }
    
    private final java.lang.String getStackTraceString(java.lang.Throwable error) {
        return null;
    }
    
    private AppLog() {
        super();
    }
}