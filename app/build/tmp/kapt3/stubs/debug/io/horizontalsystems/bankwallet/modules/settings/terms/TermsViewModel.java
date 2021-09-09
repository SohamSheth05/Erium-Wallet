package io.horizontalsystems.bankwallet.modules.settings.terms;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/terms/TermsViewModel;", "Landroidx/lifecycle/ViewModel;", "termsManager", "Lio/horizontalsystems/bankwallet/core/ITermsManager;", "(Lio/horizontalsystems/bankwallet/core/ITermsManager;)V", "terms", "", "Lio/horizontalsystems/bankwallet/core/managers/Term;", "termsLiveData", "Landroidx/lifecycle/MutableLiveData;", "getTermsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "onTapTerm", "", "index", "", "app_debug"})
public final class TermsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.core.managers.Term>> termsLiveData = null;
    private java.util.List<io.horizontalsystems.bankwallet.core.managers.Term> terms;
    private final io.horizontalsystems.bankwallet.core.ITermsManager termsManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.core.managers.Term>> getTermsLiveData() {
        return null;
    }
    
    public final void onTapTerm(int index) {
    }
    
    public TermsViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.ITermsManager termsManager) {
        super();
    }
}