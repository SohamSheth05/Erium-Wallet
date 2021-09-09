package io.horizontalsystems.bankwallet.modules.send.submodules.amount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInteractor;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IInteractor;", "Lio/horizontalsystems/core/BackgroundManager$Listener;", "baseCurrency", "Lio/horizontalsystems/core/entities/Currency;", "rateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "backgroundManager", "Lio/horizontalsystems/core/BackgroundManager;", "(Lio/horizontalsystems/core/entities/Currency;Lio/horizontalsystems/bankwallet/core/IRateManager;Lio/horizontalsystems/bankwallet/core/ILocalStorage;Lio/horizontalsystems/coinkit2/models/Coin;Lio/horizontalsystems/core/BackgroundManager;)V", "value", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;", "defaultInputType", "getDefaultInputType", "()Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;", "setDefaultInputType", "(Lio/horizontalsystems/bankwallet/modules/send/SendModule$InputType;)V", "delegate", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountModule$IInteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getRate", "Ljava/math/BigDecimal;", "onCleared", "", "willEnterForeground", "app_debug"})
public final class SendAmountInteractor implements io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IInteractor, io.horizontalsystems.core.BackgroundManager.Listener {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IInteractorDelegate delegate;
    private final io.horizontalsystems.core.entities.Currency baseCurrency = null;
    private final io.horizontalsystems.bankwallet.core.IRateManager rateManager = null;
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorage = null;
    private final io.horizontalsystems.coinkit2.models.Coin coin = null;
    private final io.horizontalsystems.core.BackgroundManager backgroundManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountModule.IInteractorDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.send.SendModule.InputType getDefaultInputType() {
        return null;
    }
    
    @java.lang.Override()
    public void setDefaultInputType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.SendModule.InputType value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.math.BigDecimal getRate() {
        return null;
    }
    
    @java.lang.Override()
    public void willEnterForeground() {
    }
    
    @java.lang.Override()
    public void onCleared() {
    }
    
    public SendAmountInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.entities.Currency baseCurrency, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager rateManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.BackgroundManager backgroundManager) {
        super();
    }
    
    public void willEnterForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public void didEnterBackground() {
    }
}