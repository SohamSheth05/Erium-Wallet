package io.horizontalsystems.bankwallet.modules.receive;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule;", "", "()V", "Factory", "IInteractor", "IInteractorDelegate", "IRouter", "IView", "IViewDelegate", "app_debug"})
public final class ReceiveModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.receive.ReceiveModule INSTANCE = null;
    
    private ReceiveModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IView;", "", "setHint", "", "hint", "", "hintDetails", "", "showAddress", "address", "Lio/horizontalsystems/bankwallet/modules/receive/viewitems/AddressItem;", "showCopied", "showError", "error", "app_debug"})
    public static abstract interface IView {
        
        public abstract void showAddress(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.receive.viewitems.AddressItem address);
        
        public abstract void showError(int error);
        
        public abstract void showCopied();
        
        public abstract void setHint(int hint, @org.jetbrains.annotations.Nullable()
        java.lang.String hintDetails);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IViewDelegate;", "", "onAddressClick", "", "onShareClick", "viewDidLoad", "app_debug"})
    public static abstract interface IViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void onShareClick();
        
        public abstract void onAddressClick();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IInteractor;", "", "copyToClipboard", "", "coinAddress", "", "getReceiveAddress", "app_debug"})
    public static abstract interface IInteractor {
        
        public abstract void getReceiveAddress();
        
        public abstract void copyToClipboard(@org.jetbrains.annotations.NotNull()
        java.lang.String coinAddress);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u00020\u00032\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IInteractorDelegate;", "", "didCopyToClipboard", "", "didFailToReceiveAddress", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "didReceiveAddress", "address", "Lio/horizontalsystems/bankwallet/modules/receive/viewitems/AddressItem;", "app_debug"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void didReceiveAddress(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.receive.viewitems.AddressItem address);
        
        public abstract void didFailToReceiveAddress(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception);
        
        public abstract void didCopyToClipboard();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$IRouter;", "", "shareAddress", "", "address", "", "app_debug"})
    public static abstract interface IRouter {
        
        public abstract void shareAddress(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/receive/ReceiveModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "(Lio/horizontalsystems/bankwallet/entities/Wallet;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final io.horizontalsystems.bankwallet.entities.Wallet wallet = null;
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Wallet wallet) {
            super();
        }
    }
}