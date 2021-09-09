package io.horizontalsystems.bankwallet.modules.swap;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapModule;", "", "()V", "CoinBalanceItem", "Dex", "Factory", "GuaranteedAmountViewItem", "PriceImpactViewItem", "app_debug"})
public final class SwapModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.swap.SwapModule INSTANCE = null;
    
    private SwapModule() {
        super();
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006!"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$CoinBalanceItem;", "Landroid/os/Parcelable;", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "balance", "Ljava/math/BigDecimal;", "fiatBalanceValue", "Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "(Lio/horizontalsystems/coinkit2/models/Coin;Ljava/math/BigDecimal;Lio/horizontalsystems/bankwallet/entities/CurrencyValue;)V", "getBalance", "()Ljava/math/BigDecimal;", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "getFiatBalanceValue", "()Lio/horizontalsystems/bankwallet/entities/CurrencyValue;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class CoinBalanceItem implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.coinkit2.models.Coin coin = null;
        @org.jetbrains.annotations.Nullable()
        private final java.math.BigDecimal balance = null;
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.bankwallet.entities.CurrencyValue fiatBalanceValue = null;
        public static final android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin getCoin() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.math.BigDecimal getBalance() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.entities.CurrencyValue getFiatBalanceValue() {
            return null;
        }
        
        public CoinBalanceItem(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.Nullable()
        java.math.BigDecimal balance, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.entities.CurrencyValue fiatBalanceValue) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.math.BigDecimal component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bankwallet.entities.CurrencyValue component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin coin, @org.jetbrains.annotations.Nullable()
        java.math.BigDecimal balance, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bankwallet.entities.CurrencyValue fiatBalanceValue) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.horizontalsystems.bankwallet.modules.swap.SwapModule.CoinBalanceItem createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$GuaranteedAmountViewItem;", "", "title", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class GuaranteedAmountViewItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        public GuaranteedAmountViewItem(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.swap.SwapModule.GuaranteedAmountViewItem copy(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$PriceImpactViewItem;", "", "level", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$PriceImpactLevel;", "value", "", "(Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$PriceImpactLevel;Ljava/lang/String;)V", "getLevel", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService$PriceImpactLevel;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class PriceImpactViewItem {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.PriceImpactLevel level = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.PriceImpactLevel getLevel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        public PriceImpactViewItem(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.PriceImpactLevel level, @org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.PriceImpactLevel component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.swap.SwapModule.PriceImpactViewItem copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.swap.SwapTradeService.PriceImpactLevel level, @org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0013j\u0002\b\u0014\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Dex;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "coin", "Lio/horizontalsystems/coinkit2/models/Coin;", "getCoin", "()Lio/horizontalsystems/coinkit2/models/Coin;", "evmKit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "getEvmKit", "()Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Uniswap", "PancakeSwap", "app_debug"})
    public static enum Dex implements android.os.Parcelable {
        /*public static final*/ Uniswap /* = new Uniswap() */,
        /*public static final*/ PancakeSwap /* = new PancakeSwap() */;
        public static final android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex> CREATOR = null;
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.ethereumkit.core.EthereumKit getEvmKit() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.coinkit2.models.Coin getCoin() {
            return null;
        }
        
        Dex() {
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 S2\u00020\u0001:\u0001SB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J5\u0010I\u001a\u0002HJ\"\b\b\u0000\u0010J*\u00020K2\u0006\u0010L\u001a\u00020M2\f\u0010N\u001a\b\u0012\u0004\u0012\u0002HJ0O2\u0006\u0010P\u001a\u00020QH\u0014\u00a2\u0006\u0002\u0010RR\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\f\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u0010\f\u001a\u0004\b-\u0010.R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b2\u00103R\u001b\u00105\u001a\u0002068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b9\u0010\f\u001a\u0004\b7\u00108R\u001b\u0010:\u001a\u00020;8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b>\u0010\f\u001a\u0004\b<\u0010=R\u001b\u0010?\u001a\u00020@8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bC\u0010\f\u001a\u0004\bA\u0010BR\u001b\u0010D\u001a\u00020E8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bH\u0010\f\u001a\u0004\bF\u0010G\u00a8\u0006T"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Factory;", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "fromCoin", "Lio/horizontalsystems/coinkit2/models/Coin;", "(Landroidx/savedstate/SavedStateRegistryOwner;Lio/horizontalsystems/coinkit2/models/Coin;)V", "allowanceService", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService;", "getAllowanceService", "()Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapAllowanceService;", "allowanceService$delegate", "Lkotlin/Lazy;", "coinProvider", "Lio/horizontalsystems/bankwallet/modules/swap/coincard/SwapCoinProvider;", "getCoinProvider", "()Lio/horizontalsystems/bankwallet/modules/swap/coincard/SwapCoinProvider;", "coinProvider$delegate", "dex", "Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Dex;", "getDex", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Dex;", "dex$delegate", "evmKit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "getEvmKit", "()Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "evmKit$delegate", "formatter", "Lio/horizontalsystems/bankwallet/modules/swap/SwapViewItemHelper;", "getFormatter", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapViewItemHelper;", "formatter$delegate", "fromCoinCardService", "Lio/horizontalsystems/bankwallet/modules/swap/coincard/SwapFromCoinCardService;", "getFromCoinCardService", "()Lio/horizontalsystems/bankwallet/modules/swap/coincard/SwapFromCoinCardService;", "fromCoinCardService$delegate", "pendingAllowanceService", "Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapPendingAllowanceService;", "getPendingAllowanceService", "()Lio/horizontalsystems/bankwallet/modules/swap/allowance/SwapPendingAllowanceService;", "pendingAllowanceService$delegate", "service", "Lio/horizontalsystems/bankwallet/modules/swap/SwapService;", "getService", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapService;", "service$delegate", "switchService", "Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService;", "getSwitchService", "()Lio/horizontalsystems/bankwallet/core/fiat/AmountTypeSwitchService;", "switchService$delegate", "toCoinCardService", "Lio/horizontalsystems/bankwallet/modules/swap/coincard/SwapToCoinCardService;", "getToCoinCardService", "()Lio/horizontalsystems/bankwallet/modules/swap/coincard/SwapToCoinCardService;", "toCoinCardService$delegate", "tradeService", "Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService;", "getTradeService", "()Lio/horizontalsystems/bankwallet/modules/swap/SwapTradeService;", "tradeService$delegate", "uniswapKit", "Lio/horizontalsystems/uniswapkit/UniswapKit;", "getUniswapKit", "()Lio/horizontalsystems/uniswapkit/UniswapKit;", "uniswapKit$delegate", "uniswapProvider", "Lio/horizontalsystems/bankwallet/modules/swap/providers/UniswapProvider;", "getUniswapProvider", "()Lio/horizontalsystems/bankwallet/modules/swap/providers/UniswapProvider;", "uniswapProvider$delegate", "create", "T", "Landroidx/lifecycle/ViewModel;", "key", "", "modelClass", "Ljava/lang/Class;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "Companion", "app_debug"})
    public static final class Factory extends androidx.lifecycle.AbstractSavedStateViewModelFactory {
        private final kotlin.Lazy dex$delegate = null;
        private final kotlin.Lazy evmKit$delegate = null;
        private final kotlin.Lazy uniswapKit$delegate = null;
        private final kotlin.Lazy uniswapProvider$delegate = null;
        private final kotlin.Lazy allowanceService$delegate = null;
        private final kotlin.Lazy pendingAllowanceService$delegate = null;
        private final kotlin.Lazy service$delegate = null;
        private final kotlin.Lazy tradeService$delegate = null;
        private final kotlin.Lazy formatter$delegate = null;
        private final kotlin.Lazy coinProvider$delegate = null;
        private final kotlin.Lazy fromCoinCardService$delegate = null;
        private final kotlin.Lazy toCoinCardService$delegate = null;
        private final kotlin.Lazy switchService$delegate = null;
        private final io.horizontalsystems.coinkit2.models.Coin fromCoin = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String coinCardTypeFrom = "coinCardTypeFrom";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String coinCardTypeTo = "coinCardTypeTo";
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.swap.SwapModule.Factory.Companion Companion = null;
        
        private final io.horizontalsystems.bankwallet.modules.swap.SwapModule.Dex getDex() {
            return null;
        }
        
        private final io.horizontalsystems.ethereumkit.core.EthereumKit getEvmKit() {
            return null;
        }
        
        private final io.horizontalsystems.uniswapkit.UniswapKit getUniswapKit() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.modules.swap.providers.UniswapProvider getUniswapProvider() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.modules.swap.allowance.SwapAllowanceService getAllowanceService() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.modules.swap.allowance.SwapPendingAllowanceService getPendingAllowanceService() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.modules.swap.SwapService getService() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.modules.swap.SwapTradeService getTradeService() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.modules.swap.SwapViewItemHelper getFormatter() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.modules.swap.coincard.SwapCoinProvider getCoinProvider() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.modules.swap.coincard.SwapFromCoinCardService getFromCoinCardService() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.modules.swap.coincard.SwapToCoinCardService getToCoinCardService() {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.core.fiat.AmountTypeSwitchService getSwitchService() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        protected <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.String key, @org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.SavedStateHandle handle) {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        androidx.savedstate.SavedStateRegistryOwner owner, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.coinkit2.models.Coin fromCoin) {
            super(null, null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/SwapModule$Factory$Companion;", "", "()V", "coinCardTypeFrom", "", "coinCardTypeTo", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
}