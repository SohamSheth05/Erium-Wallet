package io.horizontalsystems.bankwallet.modules.send.submodules.address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressFragment;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/SendSubmoduleFragment;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "addressModuleDelegate", "Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;", "sendHandler", "Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;", "(Lio/horizontalsystems/coinkit2/models/Coin;Lio/horizontalsystems/bankwallet/modules/send/submodules/address/SendAddressModule$IAddressModuleDelegate;Lio/horizontalsystems/bankwallet/modules/send/SendModule$ISendHandler;)V", "addressInputView", "Lio/horizontalsystems/bankwallet/ui/extensions/AddressInputView;", "getAddressInputView", "()Lio/horizontalsystems/bankwallet/ui/extensions/AddressInputView;", "addressInputView$delegate", "Lkotlin/Lazy;", "presenter", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/RecipientAddressViewModel;", "getPresenter", "()Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/RecipientAddressViewModel;", "presenter$delegate", "qrScannerResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "init", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_debug"})
public final class SendAddressFragment extends io.horizontalsystems.bankwallet.modules.send.submodules.SendSubmoduleFragment {
    private final kotlin.Lazy addressInputView$delegate = null;
    private final kotlin.Lazy presenter$delegate = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> qrScannerResultLauncher = null;
    private final io.horizontalsystems.coinkit2.models.Coin coin = null;
    private final io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate addressModuleDelegate = null;
    private final io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler sendHandler = null;
    private java.util.HashMap _$_findViewCache;
    
    private final io.horizontalsystems.bankwallet.ui.extensions.AddressInputView getAddressInputView() {
        return null;
    }
    
    private final io.horizontalsystems.bankwallet.modules.swap.tradeoptions.RecipientAddressViewModel getPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void init() {
    }
    
    public SendAddressFragment(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.submodules.address.SendAddressModule.IAddressModuleDelegate addressModuleDelegate, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.send.SendModule.ISendHandler sendHandler) {
        super();
    }
}