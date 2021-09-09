package io.horizontalsystems.bankwallet.modules.send.submodules.address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule;", "", "()V", "Factory", "IAddressModule", "IAddressModuleDelegate", "IInteractor", "IInteractorDelegate", "IView", "IViewDelegate", "ValidationError", "app_debug"})
public final class SendAddressModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule INSTANCE = null;
    
    private SendAddressModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IView;", "", "setAddress", "", "address", "", "setAddressError", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "setAddressInputAsEditable", "editable", "", "app_debug"})
    public static abstract interface IView {
        
        public abstract void setAddress(@org.jetbrains.annotations.Nullable()
        java.lang.String address);
        
        public abstract void setAddressError(@org.jetbrains.annotations.Nullable()
        java.lang.Exception error);
        
        public abstract void setAddressInputAsEditable(boolean editable);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IViewDelegate;", "", "onAddressDeleteClicked", "", "onViewDidLoad", "app_debug"})
    public static abstract interface IViewDelegate {
        
        public abstract void onViewDidLoad();
        
        public abstract void onAddressDeleteClicked();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\u0003H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IInteractor;", "", "addressFromClipboard", "", "getAddressFromClipboard", "()Ljava/lang/String;", "parseAddress", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "address", "app_debug"})
    public static abstract interface IInteractor {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.String getAddressFromClipboard();
        
        @org.jetbrains.annotations.NotNull()
        public abstract kotlin.Pair<java.lang.String, java.math.BigDecimal> parseAddress(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IInteractorDelegate;", "", "app_debug"})
    public static abstract interface IInteractorDelegate {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\nH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModule;", "", "currentAddress", "Lio/horizontalsystems/bankwallet/entities/Address;", "getCurrentAddress", "()Lio/horizontalsystems/bankwallet/entities/Address;", "setCurrentAddress", "(Lio/horizontalsystems/bankwallet/entities/Address;)V", "validAddress", "validateAddress", "", "app_debug"})
    public static abstract interface IAddressModule {
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.horizontalsystems.bankwallet.entities.Address getCurrentAddress();
        
        public abstract void setCurrentAddress(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.entities.Address p0);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bankwallet.entities.Address validAddress();
        
        public abstract void validateAddress();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;", "", "onUpdateAddress", "", "onUpdateAmount", "amount", "Ljava/math/BigDecimal;", "validate", "address", "", "app_debug"})
    public static abstract interface IAddressModuleDelegate {
        
        public abstract void validate(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
        
        public abstract void onUpdateAddress();
        
        public abstract void onUpdateAmount(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$ValidationError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "EmptyValue", "InvalidAddress", "app_debug"})
    public static class ValidationError extends java.lang.Exception {
        
        public ValidationError() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$ValidationError$InvalidAddress;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$ValidationError;", "()V", "app_debug"})
        public static final class InvalidAddress extends io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.ValidationError {
            
            public InvalidAddress() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$ValidationError$EmptyValue;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$ValidationError;", "()V", "app_debug"})
        public static final class EmptyValue extends io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.ValidationError {
            
            public EmptyValue() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ%\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0016\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "sendHandler", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;", "addressModuleDelete", "Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;", "isResolutionEnabled", "", "placeholder", "", "(Lio/horizontalsystems/coinkit2/models/Coin;Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;ZLjava/lang/String;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final io.horizontalsystems.coinkit2.models.Coin coin = null;
        private final io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler sendHandler = null;
        private final io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate addressModuleDelete = null;
        private final boolean isResolutionEnabled = false;
        private final java.lang.String placeholder = null;
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler sendHandler, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate addressModuleDelete, boolean isResolutionEnabled, @org.jetbrains.annotations.NotNull()
        java.lang.String placeholder) {
            super();
        }
    }
}