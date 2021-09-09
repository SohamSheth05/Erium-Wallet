package io.horizontalsystems.bankwallet.ui.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/extensions/SelectorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lio/horizontalsystems/bankwallet/ui/extensions/SelectorOptionViewHolder;", "list", "", "Lio/horizontalsystems/bankwallet/ui/extensions/SelectorItem;", "listener", "Lio/horizontalsystems/bankwallet/ui/extensions/SelectorAdapter$Listener;", "hasTitle", "", "(Ljava/util/List;Lio/horizontalsystems/bankwallet/ui/extensions/SelectorAdapter$Listener;Z)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Listener", "app_debug"})
public final class SelectorAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<io.horizontalsystems.bankwallet.ui.extensions.SelectorOptionViewHolder> {
    private final java.util.List<io.horizontalsystems.bankwallet.ui.extensions.SelectorItem> list = null;
    private final io.horizontalsystems.bankwallet.ui.extensions.SelectorAdapter.Listener listener = null;
    private final boolean hasTitle = false;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.ui.extensions.SelectorOptionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.extensions.SelectorOptionViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public SelectorAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.ui.extensions.SelectorItem> list, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.ui.extensions.SelectorAdapter.Listener listener, boolean hasTitle) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/extensions/SelectorAdapter$Listener;", "", "onClick", "", "position", "", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onClick(int position);
    }
}