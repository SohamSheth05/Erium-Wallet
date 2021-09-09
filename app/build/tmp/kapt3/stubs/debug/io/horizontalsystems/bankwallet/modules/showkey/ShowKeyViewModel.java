package io.horizontalsystems.bankwallet.modules.showkey;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0007J\u0006\u0010\u0018\u001a\u00020\u0007R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/showkey/ShowKeyViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/showkey/ShowKeyService;", "(Lio/horizontalsystems/bankwallet/modules/showkey/ShowKeyService;)V", "openUnlockLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getOpenUnlockLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "passphrase", "", "getPassphrase", "()Ljava/lang/String;", "privateKeys", "", "Lio/horizontalsystems/bankwallet/modules/showkey/ShowKeyModule$PrivateKey;", "getPrivateKeys", "()Ljava/util/List;", "showKeyLiveEvent", "getShowKeyLiveEvent", "words", "getWords", "onClickShow", "onUnlock", "app_debug"})
public final class ShowKeyViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> openUnlockLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> showKeyLiveEvent = null;
    private final io.horizontalsystems.bankwallet.modules.showkey.ShowKeyService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getOpenUnlockLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getShowKeyLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getWords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassphrase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.showkey.ShowKeyModule.PrivateKey> getPrivateKeys() {
        return null;
    }
    
    public final void onClickShow() {
    }
    
    public final void onUnlock() {
    }
    
    public ShowKeyViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.showkey.ShowKeyService service) {
        super();
    }
}