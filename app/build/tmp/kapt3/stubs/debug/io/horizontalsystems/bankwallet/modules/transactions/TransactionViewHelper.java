package io.horizontalsystems.bankwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0015\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionViewHelper;", "", "()V", "getAmountColor", "", "type", "Lio/horizontalsystems/bankwallet/entities/TransactionType;", "context", "Landroid/content/Context;", "getBottomIconImage", "status", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionStatus;", "(Lio/horizontalsystems/bankwallet/modules/transactions/TransactionStatus;)Ljava/lang/Integer;", "getLockIcon", "lockState", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionLockState;", "getTransactionTypeIcon", "app_debug"})
public final class TransactionViewHelper {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.transactions.TransactionViewHelper INSTANCE = null;
    
    public final int getLockIcon(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionLockState lockState) {
        return 0;
    }
    
    public final int getAmountColor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionType type, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    public final int getTransactionTypeIcon(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionType type) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBottomIconImage(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.TransactionStatus status) {
        return null;
    }
    
    private TransactionViewHelper() {
        super();
    }
}