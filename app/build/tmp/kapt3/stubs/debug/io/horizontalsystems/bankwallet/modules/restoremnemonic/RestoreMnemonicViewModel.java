package io.horizontalsystems.bankwallet.modules.restoremnemonic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u000289B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\'\u001a\u00020\nH\u0002J\b\u0010(\u001a\u00020\nH\u0002J\u000e\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020\nH\u0014J\u0006\u0010-\u001a\u00020\nJ\u0016\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020+2\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\u0016J\u0010\u00104\u001a\u00020\n2\u0006\u0010/\u001a\u00020+H\u0002J\u0010\u00105\u001a\u00020\u00162\b\u0010/\u001a\u0004\u0018\u00010+J\u0016\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00052\u0006\u0010/\u001a\u00020+H\u0002R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0019\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\fR\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restoremnemonic/RestoreMnemonicViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/restoremnemonic/RestoreMnemonicService;", "clearables", "", "Lio/horizontalsystems/bankwallet/core/Clearable;", "(Lio/horizontalsystems/bankwallet/modules/restoremnemonic/RestoreMnemonicService;Ljava/util/List;)V", "clearInputsLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getClearInputsLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "inputsVisibleLiveData", "Landroidx/lifecycle/LiveData;", "", "kotlin.jvm.PlatformType", "getInputsVisibleLiveData", "()Landroidx/lifecycle/LiveData;", "invalidRangesLiveData", "Lkotlin/ranges/IntRange;", "getInvalidRangesLiveData", "passphraseCautionLiveData", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/Caution;", "getPassphraseCautionLiveData", "proceedLiveEvent", "Lio/horizontalsystems/bankwallet/entities/AccountType;", "getProceedLiveEvent", "regex", "Lkotlin/text/Regex;", "state", "Lio/horizontalsystems/bankwallet/modules/restoremnemonic/RestoreMnemonicViewModel$State;", "clearCautions", "clearInputs", "onChangePassphrase", "v", "", "onCleared", "onProceed", "onTextChange", "text", "cursorPosition", "", "onTogglePassphrase", "enabled", "syncState", "validatePassphrase", "wordItems", "Lio/horizontalsystems/bankwallet/modules/restoremnemonic/RestoreMnemonicViewModel$WordItem;", "State", "WordItem", "app_debug"})
public final class RestoreMnemonicViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> inputsVisibleLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> passphraseCautionLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> clearInputsLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<kotlin.ranges.IntRange>> invalidRangesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.entities.AccountType> proceedLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> errorLiveData = null;
    private final kotlin.text.Regex regex = null;
    private io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicViewModel.State state;
    private final io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicService service = null;
    private final java.util.List<io.horizontalsystems.bankwallet.core.Clearable> clearables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getInputsVisibleLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> getPassphraseCautionLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getClearInputsLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<kotlin.ranges.IntRange>> getInvalidRangesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<io.horizontalsystems.bankwallet.entities.AccountType> getProceedLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Throwable> getErrorLiveData() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final java.util.List<io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicViewModel.WordItem> wordItems(java.lang.String text) {
        return null;
    }
    
    private final void syncState(java.lang.String text) {
    }
    
    private final void clearInputs() {
    }
    
    private final void clearCautions() {
    }
    
    public final void onTextChange(@org.jetbrains.annotations.NotNull()
    java.lang.String text, int cursorPosition) {
    }
    
    public final void onTogglePassphrase(boolean enabled) {
    }
    
    public final void onChangePassphrase(@org.jetbrains.annotations.NotNull()
    java.lang.String v) {
    }
    
    public final boolean validatePassphrase(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return false;
    }
    
    public final void onProceed() {
    }
    
    public RestoreMnemonicViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicService service, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.core.Clearable> clearables) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restoremnemonic/RestoreMnemonicViewModel$WordItem;", "", "word", "", "range", "Lkotlin/ranges/IntRange;", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "getRange", "()Lkotlin/ranges/IntRange;", "getWord", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class WordItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String word = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.ranges.IntRange range = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getWord() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.ranges.IntRange getRange() {
            return null;
        }
        
        public WordItem(@org.jetbrains.annotations.NotNull()
        java.lang.String word, @org.jetbrains.annotations.NotNull()
        kotlin.ranges.IntRange range) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.ranges.IntRange component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicViewModel.WordItem copy(@org.jetbrains.annotations.NotNull()
        java.lang.String word, @org.jetbrains.annotations.NotNull()
        kotlin.ranges.IntRange range) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/restoremnemonic/RestoreMnemonicViewModel$State;", "", "allItems", "", "Lio/horizontalsystems/bankwallet/modules/restoremnemonic/RestoreMnemonicViewModel$WordItem;", "invalidItems", "(Ljava/util/List;Ljava/util/List;)V", "getAllItems", "()Ljava/util/List;", "getInvalidItems", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class State {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicViewModel.WordItem> allItems = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicViewModel.WordItem> invalidItems = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicViewModel.WordItem> getAllItems() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicViewModel.WordItem> getInvalidItems() {
            return null;
        }
        
        public State(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicViewModel.WordItem> allItems, @org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicViewModel.WordItem> invalidItems) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicViewModel.WordItem> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicViewModel.WordItem> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicViewModel.State copy(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicViewModel.WordItem> allItems, @org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bankwallet.modules.restoremnemonic.RestoreMnemonicViewModel.WordItem> invalidItems) {
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
}