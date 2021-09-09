package io.horizontalsystems.bankwallet.ui.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/extensions/MarketListHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "listener", "Lio/horizontalsystems/bankwallet/ui/extensions/MarketListHeaderView$Listener;", "getListener", "()Lio/horizontalsystems/bankwallet/ui/extensions/MarketListHeaderView$Listener;", "setListener", "(Lio/horizontalsystems/bankwallet/ui/extensions/MarketListHeaderView$Listener;)V", "triggerMarketFieldChangeListener", "", "setMarketField", "", "marketField", "Lio/horizontalsystems/bankwallet/modules/market/MarketField;", "setSortingField", "fieldToSort", "Lio/horizontalsystems/bankwallet/modules/market/SortingField;", "Listener", "app_debug"})
public final class MarketListHeaderView extends androidx.constraintlayout.widget.ConstraintLayout {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bankwallet.ui.extensions.MarketListHeaderView.Listener listener;
    private boolean triggerMarketFieldChangeListener = true;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bankwallet.ui.extensions.MarketListHeaderView.Listener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.ui.extensions.MarketListHeaderView.Listener p0) {
    }
    
    public final void setSortingField(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.SortingField fieldToSort) {
    }
    
    public final void setMarketField(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.market.MarketField marketField) {
    }
    
    public MarketListHeaderView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public MarketListHeaderView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public MarketListHeaderView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/extensions/MarketListHeaderView$Listener;", "", "onClickSortingField", "", "onSelectMarketField", "marketField", "Lio/horizontalsystems/bankwallet/modules/market/MarketField;", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onClickSortingField();
        
        public abstract void onSelectMarketField(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.market.MarketField marketField);
    }
}