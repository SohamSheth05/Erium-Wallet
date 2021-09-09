package io.horizontalsystems.bankwallet.modules.settings.faq;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0018H\u0002JM\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2(\u0010\u001b\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f0\u001dj\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f`\u001f0\u001c2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0002\u00a2\u0006\u0002\u0010\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R4\u0010\u0012\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e \u0014*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\r0\r0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/faq/FaqRepository;", "", "faqManager", "Lio/horizontalsystems/bankwallet/core/managers/FaqManager;", "connectivityManager", "Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager;", "languageManager", "Lio/horizontalsystems/core/ILanguageManager;", "(Lio/horizontalsystems/bankwallet/core/managers/FaqManager;Lio/horizontalsystems/bankwallet/core/managers/ConnectivityManager;Lio/horizontalsystems/core/ILanguageManager;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "faqList", "Lio/reactivex/Observable;", "Lio/horizontalsystems/bankwallet/modules/settings/faq/DataState;", "", "Lio/horizontalsystems/bankwallet/entities/Faq;", "getFaqList", "()Lio/reactivex/Observable;", "faqListSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "retryLimit", "", "clear", "", "fetch", "getFaqListByLocalLanguage", "faqListMultiLanguage", "", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "language", "fallbackLanguage", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)[Lio/horizontalsystems/bankwallet/entities/Faq;", "app_debug"})
public final class FaqRepository {
    private final io.reactivex.subjects.BehaviorSubject<io.horizontalsystems.bankwallet.modules.settings.faq.DataState<io.horizontalsystems.bankwallet.entities.Faq[]>> faqListSubject = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final int retryLimit = 3;
    private final io.horizontalsystems.bankwallet.core.managers.FaqManager faqManager = null;
    private final io.horizontalsystems.bankwallet.core.managers.ConnectivityManager connectivityManager = null;
    private final io.horizontalsystems.core.ILanguageManager languageManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<io.horizontalsystems.bankwallet.modules.settings.faq.DataState<io.horizontalsystems.bankwallet.entities.Faq[]>> getFaqList() {
        return null;
    }
    
    public final void clear() {
    }
    
    private final void fetch() {
    }
    
    private final io.horizontalsystems.bankwallet.entities.Faq[] getFaqListByLocalLanguage(java.util.List<? extends java.util.HashMap<java.lang.String, io.horizontalsystems.bankwallet.entities.Faq>> faqListMultiLanguage, java.lang.String language, java.lang.String fallbackLanguage) {
        return null;
    }
    
    public FaqRepository(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.FaqManager faqManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.ConnectivityManager connectivityManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.core.ILanguageManager languageManager) {
        super();
    }
}