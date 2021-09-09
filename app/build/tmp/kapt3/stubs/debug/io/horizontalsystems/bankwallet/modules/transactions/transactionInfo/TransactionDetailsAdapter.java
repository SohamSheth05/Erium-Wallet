package io.horizontalsystems.bankwallet.modules.transactions.transactionInfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailsAdapter$DetailViewHolder;", "viewModel", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoViewModel;", "(Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoViewModel;)V", "items", "", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "DetailViewHolder", "app_debug"})
public final class TransactionDetailsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailsAdapter.DetailViewHolder> {
    private java.util.List<? extends io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem> items;
    private final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoViewModel viewModel = null;
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem> items) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailsAdapter.DetailViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailsAdapter.DetailViewHolder holder, int position) {
    }
    
    public TransactionDetailsAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoViewModel viewModel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J;\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00100\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J$\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00142\b\b\u0003\u0010%\u001a\u00020&2\b\b\u0003\u0010\'\u001a\u00020&H\u0002J\u0010\u0010(\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020/H\u0002J\b\u00100\u001a\u00020\u0010H\u0002J\u0010\u00101\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u000204H\u0002J\u0010\u00105\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u000206H\u0002J\u001c\u00107\u001a\u0004\u0018\u00010\u00142\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailsAdapter$DetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "viewModel", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoViewModel;", "(Landroid/view/View;Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionInfoViewModel;)V", "getContainerView", "()Landroid/view/View;", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getContext", "()Landroid/content/Context;", "bind", "", "detail", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem;", "title", "", "value", "bindAddress", "address", "l", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "v", "bindDoubleSpend", "bindFee", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Fee;", "bindFrom", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$From;", "bindHashId", "bindHint", "hintText", "iconStart", "", "iconEnd", "bindId", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Id;", "bindLockInfo", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$LockInfo;", "bindMemo", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Memo;", "bindRate", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Rate;", "bindRaw", "bindRecipient", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Recipient;", "bindStatus", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$Status;", "bindTo", "Lio/horizontalsystems/bankwallet/modules/transactions/transactionInfo/TransactionDetailViewItem$To;", "getFeeText", "coinValue", "Lio/horizontalsystems/bankwallet/entities/CoinValue;", "currencyValue", "Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "app_debug"})
    public static final class DetailViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View containerView = null;
        private final io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoViewModel viewModel = null;
        private java.util.HashMap _$_findViewCache;
        
        private final android.content.Context getContext() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem detail) {
        }
        
        private final void bindRecipient(io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem.Recipient detail) {
        }
        
        private final void bindLockInfo(io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem.LockInfo detail) {
        }
        
        private final void bindDoubleSpend() {
        }
        
        private final void bindId(io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem.Id detail) {
        }
        
        private final void bindRaw() {
        }
        
        private final void bindTo(io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem.To detail) {
        }
        
        private final void bindFrom(io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem.From detail) {
        }
        
        private final void bindMemo(io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem.Memo detail) {
        }
        
        private final void bindFee(io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem.Fee detail) {
        }
        
        private final void bindRate(io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem.Rate detail) {
        }
        
        private final void bindStatus(io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionDetailViewItem.Status detail) {
        }
        
        private final java.lang.String getFeeText(io.horizontalsystems.bankwallet.entities.CoinValue coinValue, io.horizontalsystems.bankwallet.entities.CurrencyValue currencyValue) {
            return null;
        }
        
        private final void bind(java.lang.String title, java.lang.String value) {
        }
        
        private final void bindAddress(java.lang.String title, java.lang.String address, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> l) {
        }
        
        private final void bindHashId(java.lang.String title, java.lang.String address) {
        }
        
        private final void bindHint(java.lang.String hintText, @androidx.annotation.DrawableRes()
        int iconStart, @androidx.annotation.DrawableRes()
        int iconEnd) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getContainerView() {
            return null;
        }
        
        public DetailViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View containerView, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.transactions.transactionInfo.TransactionInfoViewModel viewModel) {
            super(null);
        }
    }
}