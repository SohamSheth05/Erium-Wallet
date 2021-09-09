package io.horizontalsystems.bankwallet.modules.send.bitcoin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0016J0\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001eH\u0016J8\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001eH\u0016J\u001e\u0010#\u001a\u0004\u0018\u00010\b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0016J\u0012\u0010$\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016JD\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170&2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001e2\u0006\u0010\'\u001a\u00020(H\u0016J&\u0010)\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/bitcoin/SendBitcoinInteractor;", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendBitcoinInteractor;", "adapter", "Lio/horizontalsystems/bankwallet/core/ISendBitcoinAdapter;", "storage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "(Lio/horizontalsystems/bankwallet/core/ISendBitcoinAdapter;Lio/horizontalsystems/bankwallet/core/ILocalStorage;)V", "balance", "Ljava/math/BigDecimal;", "getBalance", "()Ljava/math/BigDecimal;", "delegate", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendBitcoinInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendBitcoinInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendBitcoinInteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "isLockTimeEnabled", "", "()Z", "clear", "", "fetchAvailableBalance", "feeRate", "", "address", "", "pluginData", "", "", "Lio/horizontalsystems/bitcoincore/core/IPluginData;", "fetchFee", "amount", "fetchMaximumAmount", "fetchMinimumAmount", "send", "Lio/reactivex/Single;", "logger", "Lio/horizontalsystems/bankwallet/core/AppLogger;", "validate", "app_debug"})
public final class SendBitcoinInteractor implements io.horizontalsystems.bankwallet.modules.send.SendModule.ISendBitcoinInteractor {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.send.SendModule.ISendBitcoinInteractorDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal balance = null;
    private final io.horizontalsystems.bankwallet.core.ISendBitcoinAdapter adapter = null;
    private final io.horizontalsystems.bankwallet.core.ILocalStorage storage = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.send.SendModule.ISendBitcoinInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.SendModule.ISendBitcoinInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public boolean isLockTimeEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getBalance() {
        return null;
    }
    
    @java.lang.Override()
    public void fetchAvailableBalance(long feeRate, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal fetchMinimumAmount(@org.jetbrains.annotations.Nullable()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.math.BigDecimal fetchMaximumAmount(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData) {
        return null;
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData) {
    }
    
    @java.lang.Override()
    public void fetchFee(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, long feeRate, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String address, long feeRate, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.Byte, ? extends io.horizontalsystems.bitcoincore.core.IPluginData> pluginData, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.AppLogger logger) {
        return null;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public SendBitcoinInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ISendBitcoinAdapter adapter, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage storage) {
        super();
    }
}