package io.horizontalsystems.bankwallet.modules.addtoken;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0010\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u000e0\u000e0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenService;", "", "coinManager", "Lio/horizontalsystems/bankwallet/core/ICoinManager;", "blockchainService", "Lio/horizontalsystems/bankwallet/core/IAddTokenBlockchainService;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "(Lio/horizontalsystems/bankwallet/core/ICoinManager;Lio/horizontalsystems/bankwallet/core/IAddTokenBlockchainService;Lio/horizontalsystems/bankwallet/core/IWalletManager;Lio/horizontalsystems/bankwallet/core/IAccountManager;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "value", "Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State;", "state", "getState", "()Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State;", "setState", "(Lio/horizontalsystems/bankwallet/modules/addtoken/AddTokenModule$State;)V", "stateObservable", "Lio/reactivex/Observable;", "getStateObservable", "()Lio/reactivex/Observable;", "stateSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "onCleared", "", "save", "set", "reference", "", "app_debug"})
public final class AddTokenService {
    private final io.reactivex.subjects.PublishSubject<io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.State> stateSubject = null;
    private io.reactivex.disposables.Disposable disposable;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.State> stateObservable = null;
    @org.jetbrains.annotations.NotNull()
    private io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.State state;
    private final io.horizontalsystems.bankwallet.core.ICoinManager coinManager = null;
    private final io.horizontalsystems.bankwallet.core.IAddTokenBlockchainService blockchainService = null;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bankwallet.core.IAccountManager accountManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.State> getStateObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.State getState() {
        return null;
    }
    
    private final void setState(io.horizontalsystems.bankwallet.modules.addtoken.AddTokenModule.State value) {
    }
    
    public final void set(@org.jetbrains.annotations.Nullable()
    java.lang.String reference) {
    }
    
    public final void save() {
    }
    
    public final void onCleared() {
    }
    
    public AddTokenService(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ICoinManager coinManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAddTokenBlockchainService blockchainService, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager) {
        super();
    }
}