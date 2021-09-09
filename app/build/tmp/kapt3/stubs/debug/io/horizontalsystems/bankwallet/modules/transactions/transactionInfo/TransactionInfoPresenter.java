package io.horizontalsystems.bankwallet.modules.transactions.transactionInfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ \u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020\u001eH\u0016J\b\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016J\u0012\u0010%\u001a\u00020\u001e2\b\u0010&\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\'\u001a\u00020\u001eH\u0016J\b\u0010(\u001a\u00020\u001eH\u0016J\b\u0010)\u001a\u00020\u001eH\u0016J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010+\u001a\u00020\u001eH\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoPresenter;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$ViewDelegate;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$InteractorDelegate;", "interactor", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$Interactor;", "router", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$Router;", "transaction", "Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "transactionInfoAddressMapper", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoAddressMapper;", "(Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$Interactor;Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$Router;Lio/horizontalsystems/bankwallet/entities/TransactionRecord;Lio/horizontalsystems/bankwallet/entities/Wallet;Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoAddressMapper;)V", "explorerData", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$ExplorerData;", "view", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$View;", "getView", "()Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$View;", "setView", "(Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$View;)V", "getExplorerData", "hash", "", "testMode", "", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "onClickDoubleSpendInfo", "", "onClickFrom", "onClickLockInfo", "onClickRecipientHash", "onClickStatusInfo", "onClickTo", "onClickTransactionId", "onCopy", "value", "onRawTransaction", "onShare", "openExplorer", "showFromAddress", "viewDidLoad", "app_debug"})
public final class TransactionInfoPresenter implements io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.ViewDelegate, io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.InteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.View view;
    private io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.ExplorerData explorerData;
    private final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.Interactor interactor = null;
    private final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.Router router = null;
    private final io.horizontalsystems.bankwallet.entities.TransactionRecord transaction = null;
    private final io.horizontalsystems.bankwallet.entities.Wallet wallet = null;
    private final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoAddressMapper transactionInfoAddressMapper = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.View getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.View p0) {
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    private final boolean showFromAddress(io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return false;
    }
    
    @java.lang.Override()
    public void onShare() {
    }
    
    @java.lang.Override()
    public void openExplorer() {
    }
    
    @java.lang.Override()
    public void onClickLockInfo() {
    }
    
    @java.lang.Override()
    public void onClickDoubleSpendInfo() {
    }
    
    @java.lang.Override()
    public void onClickRecipientHash() {
    }
    
    @java.lang.Override()
    public void onClickTo() {
    }
    
    @java.lang.Override()
    public void onClickFrom() {
    }
    
    @java.lang.Override()
    public void onClickTransactionId() {
    }
    
    @java.lang.Override()
    public void onRawTransaction() {
    }
    
    @java.lang.Override()
    public void onClickStatusInfo() {
    }
    
    private final void onCopy(java.lang.String value) {
    }
    
    private final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.ExplorerData getExplorerData(java.lang.String hash, boolean testMode, io.horizontalsystems.coinkit2.models.CoinType coinType) {
        return null;
    }
    
    public TransactionInfoPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.Interactor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.Router router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionRecord transaction, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoAddressMapper transactionInfoAddressMapper) {
        super();
    }
}