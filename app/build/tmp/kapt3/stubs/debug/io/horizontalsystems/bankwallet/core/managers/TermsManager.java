package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000b0\u000b0\u000fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/TermsManager;", "Lio/horizontalsystems/bankwallet/core/ITermsManager;", "localStorage", "Lio/horizontalsystems/bankwallet/core/ILocalStorage;", "(Lio/horizontalsystems/bankwallet/core/ILocalStorage;)V", "terms", "", "Lio/horizontalsystems/bankwallet/core/managers/Term;", "getTerms", "()Ljava/util/List;", "termsAccepted", "", "getTermsAccepted", "()Z", "termsAcceptedSignal", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "getTermsAcceptedSignal", "()Lio/reactivex/subjects/PublishSubject;", "term", "id", "", "update", "", "Companion", "app_debug"})
public final class TermsManager implements io.horizontalsystems.bankwallet.core.ITermsManager {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<java.lang.Boolean> termsAcceptedSignal = null;
    private final io.horizontalsystems.bankwallet.core.ILocalStorage localStorage = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> termIds = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.managers.TermsManager.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.subjects.PublishSubject<java.lang.Boolean> getTermsAcceptedSignal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bankwallet.core.managers.Term> getTerms() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getTermsAccepted() {
        return false;
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.Term term) {
    }
    
    private final io.horizontalsystems.bankwallet.core.managers.Term term(java.lang.String id) {
        return null;
    }
    
    public TermsManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ILocalStorage localStorage) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/TermsManager$Companion;", "", "()V", "termIds", "", "", "getTermIds", "()Ljava/util/List;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getTermIds() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}