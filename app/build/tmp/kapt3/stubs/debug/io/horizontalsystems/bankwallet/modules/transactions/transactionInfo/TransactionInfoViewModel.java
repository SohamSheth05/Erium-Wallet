package io.horizontalsystems.bankwallet.modules.transactions.transactionInfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u0018\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u0014H\u0016J\u0010\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u001eH\u0016J\b\u00103\u001a\u00020\u0019H\u0016J\u0010\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u0014H\u0016J\u0018\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u0015H\u0016J\u0010\u00109\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u0014H\u0016J\b\u0010;\u001a\u00020\u0019H\u0016J\u0016\u0010<\u001a\u00020\u00192\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0010\u0010>\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\'H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R#\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00130\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0010R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0010R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\f\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0010R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017\u00a8\u0006@"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$View;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$Router;", "()V", "delegate", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$ViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$ViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$ViewDelegate;)V", "detailsLiveData", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem;", "getDetailsLiveData", "()Lio/horizontalsystems/core/SingleLiveEvent;", "explorerButton", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "", "getExplorerButton", "()Landroidx/lifecycle/MutableLiveData;", "showCopiedLiveEvent", "", "getShowCopiedLiveEvent", "showDoubleSpendInfo", "getShowDoubleSpendInfo", "showLockInfo", "Ljava/util/Date;", "getShowLockInfo", "showShareLiveEvent", "getShowShareLiveEvent", "showStatusInfoLiveEvent", "getShowStatusInfoLiveEvent", "showTransactionLiveEvent", "getShowTransactionLiveEvent", "titleLiveData", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$TitleViewItem;", "getTitleLiveData", "init", "transactionRecord", "Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "wallet", "Lio/horizontalsystems/bankwallet/entities/Wallet;", "openDoubleSpendInfo", "transactionHash", "conflictingTxHash", "openLockInfo", "lockDate", "openStatusInfo", "openUrl", "url", "setExplorerButton", "explorerName", "enabled", "share", "value", "showCopied", "showDetails", "items", "showTitle", "titleViewItem", "app_debug"})
public final class TransactionInfoViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.View, io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.Router {
    public io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.ViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.TitleViewItem> titleLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.util.List<io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem>> detailsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> showCopiedLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.util.Date> showLockInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Pair<java.lang.String, java.lang.String>> showDoubleSpendInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> showShareLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> showStatusInfoLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> showTransactionLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.String, java.lang.Boolean>> explorerButton = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.ViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.ViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.TitleViewItem> getTitleLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.util.List<io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem>> getDetailsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getShowCopiedLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.util.Date> getShowLockInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Pair<java.lang.String, java.lang.String>> getShowDoubleSpendInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> getShowShareLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getShowStatusInfoLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<java.lang.String> getShowTransactionLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.String, java.lang.Boolean>> getExplorerButton() {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionRecord transactionRecord, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Wallet wallet) {
    }
    
    @java.lang.Override()
    public void showCopied() {
    }
    
    @java.lang.Override()
    public void share(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public void showTitle(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.TitleViewItem titleViewItem) {
    }
    
    @java.lang.Override()
    public void showDetails(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem> items) {
    }
    
    @java.lang.Override()
    public void setExplorerButton(@org.jetbrains.annotations.NotNull()
    java.lang.String explorerName, boolean enabled) {
    }
    
    @java.lang.Override()
    public void openLockInfo(@org.jetbrains.annotations.NotNull()
    java.util.Date lockDate) {
    }
    
    @java.lang.Override()
    public void openDoubleSpendInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash, @org.jetbrains.annotations.NotNull()
    java.lang.String conflictingTxHash) {
    }
    
    @java.lang.Override()
    public void openStatusInfo() {
    }
    
    @java.lang.Override()
    public void openUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public TransactionInfoViewModel() {
        super();
    }
}