package io.horizontalsystems.bankwallet.modules.settings.faq;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0014H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/faq/FaqViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lio/horizontalsystems/bankwallet/modules/settings/faq/FaqRepository;", "(Lio/horizontalsystems/bankwallet/modules/settings/faq/FaqRepository;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "error", "Landroidx/lifecycle/MutableLiveData;", "", "getError", "()Landroidx/lifecycle/MutableLiveData;", "faqItemList", "", "Lio/horizontalsystems/bankwallet/modules/settings/faq/FaqItem;", "getFaqItemList", "loading", "", "getLoading", "didFetchFaqList", "", "faqArray", "", "Lio/horizontalsystems/bankwallet/entities/Faq;", "([Lio/horizontalsystems/bankwallet/entities/Faq;)V", "onCleared", "app_debug"})
public final class FaqViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.settings.faq.FaqItem>> faqItemList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> error = null;
    private io.reactivex.disposables.CompositeDisposable disposables;
    private final io.horizontalsystems.bankwallet.modules.settings.faq.FaqRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.settings.faq.FaqItem>> getFaqItemList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Throwable> getError() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void didFetchFaqList(io.horizontalsystems.bankwallet.entities.Faq[] faqArray) {
    }
    
    public FaqViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.faq.FaqRepository repository) {
        super();
    }
}