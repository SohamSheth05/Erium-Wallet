package io.horizontalsystems.bankwallet.modules.send.submodules.address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0016J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\nH\u0002J\u0012\u0010%\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010&\u001a\u00020\u0019H\u0016J\u0012\u0010\'\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\nH\u0016J\b\u0010+\u001a\u00020\u0019H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011@RX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 \u001f*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001e0\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u0004\u0018\u00010\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressPresenter;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/IRecipientAddressService;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModule;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IInteractorDelegate;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IViewDelegate;", "moduleDelegate", "Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;", "(Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;)V", "currentAddress", "Lio/horizontalsystems/bankwallet/entities/Address;", "getCurrentAddress", "()Lio/horizontalsystems/bankwallet/entities/Address;", "setCurrentAddress", "(Lio/horizontalsystems/bankwallet/entities/Address;)V", "enteredAddress", "value", "", "error", "getError", "()Ljava/lang/Throwable;", "setError", "(Ljava/lang/Throwable;)V", "errorObservable", "Lio/reactivex/Observable;", "", "getErrorObservable", "()Lio/reactivex/Observable;", "errorsObservable", "Lio/reactivex/subjects/BehaviorSubject;", "Ljava/util/Optional;", "kotlin.jvm.PlatformType", "initialAddress", "getInitialAddress", "onAddressDeleteClicked", "onAddressEnter", "address", "onSetAddress", "onViewDidLoad", "set", "amount", "Ljava/math/BigDecimal;", "validAddress", "validateAddress", "app_debug"})
public final class SendAddressPresenter extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bankwallet.modules.swap.tradeoptions.IRecipientAddressService, io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IAddressModule, io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IInteractorDelegate, io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IViewDelegate {
    private final io.reactivex.subjects.BehaviorSubject<java.util.Optional<java.lang.Throwable>> errorsObservable = null;
    @org.jetbrains.annotations.Nullable()
    private final io.horizontalsystems.bankwallet.entities.Address initialAddress = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Throwable error;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<kotlin.Unit> errorObservable = null;
    private io.horizontalsystems.bankwallet.entities.Address enteredAddress;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.entities.Address currentAddress;
    private final io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate moduleDelegate = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.Address getInitialAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Throwable getError() {
        return null;
    }
    
    private void setError(java.lang.Throwable value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<kotlin.Unit> getErrorObservable() {
        return null;
    }
    
    @java.lang.Override()
    public void set(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.Address address) {
    }
    
    @java.lang.Override()
    public void set(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount) {
    }
    
    private final void onSetAddress(io.horizontalsystems.bankwallet.entities.Address address) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.Address getCurrentAddress() {
        return null;
    }
    
    @java.lang.Override()
    public void setCurrentAddress(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.entities.Address p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.Address validAddress() {
        return null;
    }
    
    @java.lang.Override()
    public void validateAddress() {
    }
    
    private final java.lang.Throwable getError(java.lang.Throwable error) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewDidLoad() {
    }
    
    @java.lang.Override()
    public void onAddressDeleteClicked() {
    }
    
    private final void onAddressEnter(io.horizontalsystems.bankwallet.entities.Address address) {
    }
    
    public SendAddressPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate moduleDelegate) {
        super();
    }
}