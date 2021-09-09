package io.horizontalsystems.bankwallet.modules.markdown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0014R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownViewModel;", "Landroidx/lifecycle/ViewModel;", "connectivityManager", "Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager;", "contentProvider", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownModule$IMarkdownContentProvider;", "(Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager;Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownModule$IMarkdownContentProvider;)V", "blocks", "Landroidx/lifecycle/MutableLiveData;", "", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock;", "getBlocks", "()Landroidx/lifecycle/MutableLiveData;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "value", "Lio/horizontalsystems/bankwallet/modules/markdown/LoadStatus;", "status", "setStatus", "(Lio/horizontalsystems/bankwallet/modules/markdown/LoadStatus;)V", "statusLiveData", "getStatusLiveData", "didFetchContent", "", "content", "", "loadContent", "onCleared", "app_debug"})
public final class MarkdownViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.markdown.LoadStatus> statusLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock>> blocks = null;
    private io.reactivex.disposables.CompositeDisposable disposables;
    private io.horizontalsystems.bankwallet.modules.markdown.LoadStatus status;
    private final io.horizontalsystems.bankwallet.core.managers.ConnectivityManager connectivityManager = null;
    private final io.horizontalsystems.bankwallet.modules.markdown.MarkdownModule.IMarkdownContentProvider contentProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.markdown.LoadStatus> getStatusLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock>> getBlocks() {
        return null;
    }
    
    private final void setStatus(io.horizontalsystems.bankwallet.modules.markdown.LoadStatus value) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void didFetchContent(java.lang.String content) {
    }
    
    private final void loadContent() {
    }
    
    public MarkdownViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.ConnectivityManager connectivityManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.markdown.MarkdownModule.IMarkdownContentProvider contentProvider) {
        super();
    }
}