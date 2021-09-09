package io.horizontalsystems.bankwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bankwallet/core/ITermsManager;", "", "terms", "", "Lio/horizontalsystems/bankwallet/core/managers/Term;", "getTerms", "()Ljava/util/List;", "termsAccepted", "", "getTermsAccepted", "()Z", "termsAcceptedSignal", "Lio/reactivex/subjects/Subject;", "getTermsAcceptedSignal", "()Lio/reactivex/subjects/Subject;", "update", "", "term", "app_debug"})
public abstract interface ITermsManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.subjects.Subject<java.lang.Boolean> getTermsAcceptedSignal();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bankwallet.core.managers.Term> getTerms();
    
    public abstract boolean getTermsAccepted();
    
    public abstract void update(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.managers.Term term);
}