package io.horizontalsystems.bankwallet.modules.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/main/MainService;", "", "rootUtil", "Lio/horizontalsystems/bankwallet/core/utils/RootUtil;", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "(Lio/horizontalsystems/bankwallet/core/utils/RootUtil;Lio/horizontalsystems/bankwallet/core/ILocalStorage;)V", "ignoreRootCheck", "", "getIgnoreRootCheck", "()Z", "isDeviceRooted", "app_debug"})
public final class MainService {
    private final io.horizontalsystems.bankwallet.core.utils.RootUtil rootUtil = null;
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorage = null;
    
    public final boolean isDeviceRooted() {
        return false;
    }
    
    public final boolean getIgnoreRootCheck() {
        return false;
    }
    
    public MainService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.utils.RootUtil rootUtil, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorage) {
        super();
    }
}