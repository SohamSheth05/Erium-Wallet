package io.horizontalsystems.bankwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\b\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\nJ\u0006\u0010\u000b\u001a\u00020\tJ\"\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\nJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/TransactionItemDataSource;", "", "()V", "items", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lio/horizontalsystems/bankwallet/modules/transactions/TransactionViewItem;", "getItems", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "add", "", "", "clear", "handleModifiedItems", "updatedItems", "insertedItems", "shouldInsertRecord", "", "record", "Lio/horizontalsystems/bankwallet/entities/TransactionRecord;", "app_debug"})
public final class TransactionItemDataSource {
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.CopyOnWriteArrayList<io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem> items = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CopyOnWriteArrayList<io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem> getItems() {
        return null;
    }
    
    public final void clear() {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem> items) {
    }
    
    public final void handleModifiedItems(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem> updatedItems, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.transactions.TransactionViewItem> insertedItems) {
    }
    
    public final boolean shouldInsertRecord(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.TransactionRecord record) {
        return false;
    }
    
    public TransactionItemDataSource() {
        super();
    }
}