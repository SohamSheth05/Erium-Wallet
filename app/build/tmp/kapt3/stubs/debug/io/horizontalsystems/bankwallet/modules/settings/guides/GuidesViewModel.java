package io.horizontalsystems.bankwallet.modules.settings.guides;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010#\u001a\u00020$2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002\u00a2\u0006\u0002\u0010%J\b\u0010&\u001a\u00020$H\u0014J\u000e\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020\u0010J\b\u0010)\u001a\u00020$H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006*"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/settings/guides/GuidesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lio/horizontalsystems/bankwallet/modules/settings/guides/GuidesRepository;", "(Lio/horizontalsystems/bankwallet/modules/settings/guides/GuidesRepository;)V", "currentCategoryIndex", "", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "error", "Landroidx/lifecycle/MutableLiveData;", "", "getError", "()Landroidx/lifecycle/MutableLiveData;", "filters", "", "", "getFilters", "guideCategories", "", "Lio/horizontalsystems/bankwallet/entities/GuideCategory;", "[Lio/horizontalsystems/bankwallet/entities/GuideCategory;", "guides", "Lio/horizontalsystems/bankwallet/entities/Guide;", "getGuides", "loading", "", "getLoading", "getRepository", "()Lio/horizontalsystems/bankwallet/modules/settings/guides/GuidesRepository;", "selectedFilter", "getSelectedFilter", "()Ljava/lang/String;", "setSelectedFilter", "(Ljava/lang/String;)V", "didFetchGuideCategories", "", "([Lio/horizontalsystems/bankwallet/entities/GuideCategory;)V", "onCleared", "onSelectFilter", "filterId", "syncViewItems", "app_debug"})
public final class GuidesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.entities.Guide>> guides = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> filters = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> error = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectedFilter;
    private io.horizontalsystems.bankwallet.entities.GuideCategory[] guideCategories = {};
    private int currentCategoryIndex = 0;
    private io.reactivex.disposables.CompositeDisposable disposables;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bankwallet.modules.settings.guides.GuidesRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.entities.Guide>> getGuides() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getFilters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Throwable> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelectedFilter() {
        return null;
    }
    
    public final void setSelectedFilter(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final void onSelectFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String filterId) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void didFetchGuideCategories(io.horizontalsystems.bankwallet.entities.GuideCategory[] guideCategories) {
    }
    
    private final void syncViewItems() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bankwallet.modules.settings.guides.GuidesRepository getRepository() {
        return null;
    }
    
    public GuidesViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.settings.guides.GuidesRepository repository) {
        super();
    }
}