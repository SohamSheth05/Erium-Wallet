package io.horizontalsystems.bankwallet.modules.walletconnect.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/request/WalletConnectSendEthereumTransactionRequestViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/walletconnect/request/WalletConnectSendEthereumTransactionRequestService;", "(Lio/horizontalsystems/bankwallet/modules/walletconnect/request/WalletConnectSendEthereumTransactionRequestService;)V", "approve", "", "transactionHash", "", "reject", "app_debug"})
public final class WalletConnectSendEthereumTransactionRequestViewModel extends androidx.lifecycle.ViewModel {
    private final io.horizontalsystems.bankwallet.modules.walletconnect.request.WalletConnectSendEthereumTransactionRequestService service = null;
    
    public final void approve(@org.jetbrains.annotations.NotNull()
    byte[] transactionHash) {
    }
    
    public final void reject() {
    }
    
    public WalletConnectSendEthereumTransactionRequestViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.walletconnect.request.WalletConnectSendEthereumTransactionRequestService service) {
        super();
    }
}