package io.horizontalsystems.bankwallet.modules.settings.guides;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fH\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/guides/GuidesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lio/horizontalsystems/bankwallet/modules/settings/guides/ViewHolderGuide;", "Lio/horizontalsystems/bankwallet/modules/settings/guides/ViewHolderGuide$ClickListener;", "listener", "Lio/horizontalsystems/bankwallet/modules/settings/guides/GuidesAdapter$Listener;", "(Lio/horizontalsystems/bankwallet/modules/settings/guides/GuidesAdapter$Listener;)V", "items", "", "Lio/horizontalsystems/bankwallet/entities/Guide;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onClick", "guide", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Listener", "app_debug"})
public final class GuidesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<io.horizontalsystems.bankwallet.modules.settings.guides.ViewHolderGuide> implements io.horizontalsystems.bankwallet.modules.settings.guides.ViewHolderGuide.ClickListener {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<io.horizontalsystems.bankwallet.entities.Guide> items;
    private io.horizontalsystems.bankwallet.modules.settings.guides.GuidesAdapter.Listener listener;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.entities.Guide> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.entities.Guide> p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bankwallet.modules.settings.guides.ViewHolderGuide onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.guides.ViewHolderGuide holder, int position) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.Guide guide) {
    }
    
    public GuidesAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.guides.GuidesAdapter.Listener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/guides/GuidesAdapter$Listener;", "", "onItemClick", "", "guide", "Lio/horizontalsystems/bankwallet/entities/Guide;", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.entities.Guide guide);
    }
}