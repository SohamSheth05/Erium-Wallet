package io.horizontalsystems.bankwallet.modules.transactions.transactionInfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u001a\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\u0012\u0010*\u001a\u0004\u0018\u00010 2\u0006\u0010+\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoInteractor;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$Interactor;", "clipboardManager", "Lio/horizontalsystems/bankwallet/core/IClipboardManager;", "adapter", "Lio/horizontalsystems/bankwallet/core/ITransactionsAdapter;", "xRateManager", "Lio/horizontalsystems/bankwallet/core/IRateManager;", "currencyManager", "Lio/horizontalsystems/core/ICurrencyManager;", "feeCoinProvider", "Lio/horizontalsystems/bankwallet/core/providers/FeeCoinProvider;", "buildConfigProvider", "Lio/horizontalsystems/core/IBuildConfigProvider;", "(Lio/horizontalsystems/bankwallet/core/IClipboardManager;Lio/horizontalsystems/bankwallet/core/ITransactionsAdapter;Lio/horizontalsystems/bankwallet/core/IRateManager;Lio/horizontalsystems/core/ICurrencyManager;Lio/horizontalsystems/bankwallet/core/providers/FeeCoinProvider;Lio/horizontalsystems/core/IBuildConfigProvider;)V", "delegate", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$InteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$InteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoModule$InteractorDelegate;)V", "lastBlockInfo", "Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "getLastBlockInfo", "()Lio/horizontalsystems/bankwallet/entities/LastBlockInfo;", "testMode", "", "getTestMode", "()Z", "copyToClipboard", "", "value", "", "feeCoin", "Lio/horizontalsystems/coinkit2/models/Coin;", "coin", "getRate", "Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "timestamp", "", "getRaw", "transactionHash", "app_debug"})
public final class TransactionInfoInteractor implements io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.Interactor {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.InteractorDelegate delegate;
    private final boolean testMode = false;
    private io.horizontalsystems.bankwallet.core.IClipboardManager clipboardManager;
    private final io.horizontalsystems.bankwallet.core.ITransactionsAdapter adapter = null;
    private final io.horizontalsystems.bankwallet.core.IRateManager xRateManager = null;
    private final io.horizontalsystems.core.ICurrencyManager currencyManager = null;
    private final io.horizontalsystems.bankwallet.core.providers.FeeCoinProvider feeCoinProvider = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.InteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoModule.InteractorDelegate p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.LastBlockInfo getLastBlockInfo() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getTestMode() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.entities.CurrencyValue getRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType, long timestamp) {
        return null;
    }
    
    @java.lang.Override()
    public void copyToClipboard(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.coinkit2.models.Coin feeCoin(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.Coin coin) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getRaw(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash) {
        return null;
    }
    
    public TransactionInfoInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IClipboardManager clipboardManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ITransactionsAdapter adapter, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IRateManager xRateManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ICurrencyManager currencyManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.providers.FeeCoinProvider feeCoinProvider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.IBuildConfigProvider buildConfigProvider) {
        super();
    }
}