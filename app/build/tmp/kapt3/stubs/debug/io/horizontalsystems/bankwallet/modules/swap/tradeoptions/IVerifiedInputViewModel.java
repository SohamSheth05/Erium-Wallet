package io.horizontalsystems.bankwallet.modules.swap.tradeoptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u001f\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0016R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u001a\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006\u00a8\u0006!"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/IVerifiedInputViewModel;", "", "cautionLiveData", "Landroidx/lifecycle/LiveData;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/Caution;", "getCautionLiveData", "()Landroidx/lifecycle/LiveData;", "initialValue", "", "getInitialValue", "()Ljava/lang/String;", "inputFieldButtonItems", "", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/InputFieldButtonItem;", "getInputFieldButtonItems", "()Ljava/util/List;", "inputFieldCanEdit", "", "getInputFieldCanEdit", "()Z", "inputFieldMaximumNumberOfLines", "", "getInputFieldMaximumNumberOfLines", "()I", "inputFieldPlaceholder", "getInputFieldPlaceholder", "isLoadingLiveData", "setTextLiveData", "getSetTextLiveData", "isValid", "text", "onChangeText", "", "app_debug"})
public abstract interface IVerifiedInputViewModel {
    
    public abstract int getInputFieldMaximumNumberOfLines();
    
    public abstract boolean getInputFieldCanEdit();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.InputFieldButtonItem> getInputFieldButtonItems();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getInitialValue();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getInputFieldPlaceholder();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.String> getSetTextLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> getCautionLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> isLoadingLiveData();
    
    public abstract void onChangeText(@org.jetbrains.annotations.Nullable()
    java.lang.String text);
    
    public abstract boolean isValid(@org.jetbrains.annotations.Nullable()
    java.lang.String text);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        public static int getInputFieldMaximumNumberOfLines(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.swap.tradeoptions.IVerifiedInputViewModel $this) {
            return 0;
        }
        
        public static boolean getInputFieldCanEdit(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.swap.tradeoptions.IVerifiedInputViewModel $this) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.InputFieldButtonItem> getInputFieldButtonItems(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.swap.tradeoptions.IVerifiedInputViewModel $this) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public static java.lang.String getInitialValue(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.swap.tradeoptions.IVerifiedInputViewModel $this) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public static java.lang.String getInputFieldPlaceholder(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.swap.tradeoptions.IVerifiedInputViewModel $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static androidx.lifecycle.LiveData<java.lang.Boolean> isLoadingLiveData(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.swap.tradeoptions.IVerifiedInputViewModel $this) {
            return null;
        }
        
        public static void onChangeText(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.swap.tradeoptions.IVerifiedInputViewModel $this, @org.jetbrains.annotations.Nullable()
        java.lang.String text) {
        }
        
        public static boolean isValid(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bankwallet.modules.swap.tradeoptions.IVerifiedInputViewModel $this, @org.jetbrains.annotations.Nullable()
        java.lang.String text) {
            return false;
        }
    }
}