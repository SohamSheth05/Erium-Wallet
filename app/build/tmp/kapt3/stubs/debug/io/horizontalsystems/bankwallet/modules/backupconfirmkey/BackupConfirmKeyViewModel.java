package io.horizontalsystems.bankwallet.modules.backupconfirmkey;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001/B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010 \u001a\u00020\tH\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u000e\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\"J\u000e\u0010\'\u001a\u00020\t2\u0006\u0010&\u001a\u00020\"J\u000e\u0010(\u001a\u00020\t2\u0006\u0010&\u001a\u00020\"J\b\u0010)\u001a\u00020\tH\u0014J\u0006\u0010*\u001a\u00020\tJ\u0006\u0010+\u001a\u00020\tJ\u0010\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020.H\u0002R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0018\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService;", "translator", "Lio/horizontalsystems/bankwallet/core/providers/Translator;", "(Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService;Lio/horizontalsystems/bankwallet/core/providers/Translator;)V", "clearInputsLiveEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getClearInputsLiveEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "firstWordCautionLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/bankwallet/modules/swap/tradeoptions/Caution;", "getFirstWordCautionLiveData", "()Landroidx/lifecycle/MutableLiveData;", "indexViewItemLiveData", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyViewModel$IndexViewItem;", "getIndexViewItemLiveData", "passphraseCautionLiveData", "getPassphraseCautionLiveData", "passpraseVisible", "", "getPasspraseVisible", "()Z", "secondWordCautionLiveData", "getSecondWordCautionLiveData", "successLiveEvent", "getSuccessLiveEvent", "clearInputs", "getErrorText", "", "error", "", "onChangeFirstWord", "v", "onChangePassphrase", "onChangeSecondWord", "onCleared", "onClickDone", "onViewCreated", "sync", "indexItem", "Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyService$IndexItem;", "IndexViewItem", "app_debug"})
public final class BackupConfirmKeyViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyViewModel.IndexViewItem> indexViewItemLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> successLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> firstWordCautionLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> secondWordCautionLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> passphraseCautionLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> clearInputsLiveEvent = null;
    private final io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService service = null;
    private final io.horizontalsystems.bankwallet.core.providers.Translator translator = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyViewModel.IndexViewItem> getIndexViewItemLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getSuccessLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> getFirstWordCautionLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution> getSecondWordCautionLiveData() {
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
    
    public final boolean getPasspraseVisible() {
        return false;
    }
    
    private final void sync(io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService.IndexItem indexItem) {
    }
    
    private final void clearInputs() {
    }
    
    private final java.lang.String getErrorText(java.lang.Throwable error) {
        return null;
    }
    
    public final void onViewCreated() {
    }
    
    public final void onChangeFirstWord(@org.jetbrains.annotations.NotNull()
    java.lang.String v) {
    }
    
    public final void onChangeSecondWord(@org.jetbrains.annotations.NotNull()
    java.lang.String v) {
    }
    
    public final void onChangePassphrase(@org.jetbrains.annotations.NotNull()
    java.lang.String v) {
    }
    
    public final void onClickDone() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BackupConfirmKeyViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyService service, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.providers.Translator translator) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/backupconfirmkey/BackupConfirmKeyViewModel$IndexViewItem;", "", "first", "", "second", "(Ljava/lang/String;Ljava/lang/String;)V", "getFirst", "()Ljava/lang/String;", "getSecond", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class IndexViewItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String first = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String second = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFirst() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSecond() {
            return null;
        }
        
        public IndexViewItem(@org.jetbrains.annotations.NotNull()
        java.lang.String first, @org.jetbrains.annotations.NotNull()
        java.lang.String second) {
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
        public final io.horizontalsystems.bankwallet.modules.backupconfirmkey.BackupConfirmKeyViewModel.IndexViewItem copy(@org.jetbrains.annotations.NotNull()
        java.lang.String first, @org.jetbrains.annotations.NotNull()
        java.lang.String second) {
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