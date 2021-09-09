package io.horizontalsystems.bankwallet.modules.swap.tradeoptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR$\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00050\u00050\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0018 \u0012*\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00170\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/AddressResolutionService;", "Lio/horizontalsystems/bankwallet/core/Clearable;", "coinCode", "", "isResolutionEnabled", "", "(Ljava/lang/String;Z)V", "getCoinCode", "()Ljava/lang/String;", "disposable", "Lio/reactivex/disposables/Disposable;", "()Z", "value", "isResolving", "setResolving", "(Z)V", "isResolvingAsync", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "()Lio/reactivex/subjects/BehaviorSubject;", "provider", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/AddressResolutionProvider;", "resolveFinishedAsync", "Ljava/util/Optional;", "Lio/horizontalsystems/bankwallet/entities/Address;", "getResolveFinishedAsync", "clear", "", "setText", "text", "app_debug"})
public final class AddressResolutionService implements io.horizontalsystems.bankwallet.core.Clearable {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> isResolvingAsync = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<java.util.Optional<io.horizontalsystems.bankwallet.entities.Address>> resolveFinishedAsync = null;
    private final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.AddressResolutionProvider provider = null;
    private io.reactivex.disposables.Disposable disposable;
    private boolean isResolving = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coinCode = null;
    private final boolean isResolutionEnabled = false;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> isResolvingAsync() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<java.util.Optional<io.horizontalsystems.bankwallet.entities.Address>> getResolveFinishedAsync() {
        return null;
    }
    
    public final boolean isResolving() {
        return false;
    }
    
    private final void setResolving(boolean value) {
    }
    
    public final void setText(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoinCode() {
        return null;
    }
    
    public final boolean isResolutionEnabled() {
        return false;
    }
    
    public AddressResolutionService(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode, boolean isResolutionEnabled) {
        super();
    }
}