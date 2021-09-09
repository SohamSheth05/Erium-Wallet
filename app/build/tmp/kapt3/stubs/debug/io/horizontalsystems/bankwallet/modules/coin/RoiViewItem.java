package io.horizontalsystems.bankwallet.modules.coin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/RoiViewItem;", "", "()V", "HeaderRowViewItem", "RowViewItem", "Lio/horizontalsystems/bankwallet/modules/coin/RoiViewItem$HeaderRowViewItem;", "Lio/horizontalsystems/bankwallet/modules/coin/RoiViewItem$RowViewItem;", "app_debug"})
public abstract class RoiViewItem {
    
    private RoiViewItem() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/RoiViewItem$HeaderRowViewItem;", "Lio/horizontalsystems/bankwallet/modules/coin/RoiViewItem;", "title", "", "periods", "", "Lio/horizontalsystems/xrateskit2/entities/TimePeriod;", "(Ljava/lang/String;Ljava/util/List;)V", "getPeriods", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "app_debug"})
    public static final class HeaderRowViewItem extends io.horizontalsystems.bankwallet.modules.coin.RoiViewItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<io.horizontalsystems.xrateskit2.entities.TimePeriod> periods = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.xrateskit2.entities.TimePeriod> getPeriods() {
            return null;
        }
        
        public HeaderRowViewItem(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends io.horizontalsystems.xrateskit2.entities.TimePeriod> periods) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/coin/RoiViewItem$RowViewItem;", "Lio/horizontalsystems/bankwallet/modules/coin/RoiViewItem;", "title", "", "values", "", "Ljava/math/BigDecimal;", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "app_debug"})
    public static final class RowViewItem extends io.horizontalsystems.bankwallet.modules.coin.RoiViewItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.math.BigDecimal> values = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.math.BigDecimal> getValues() {
            return null;
        }
        
        public RowViewItem(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.math.BigDecimal> values) {
            super();
        }
    }
}