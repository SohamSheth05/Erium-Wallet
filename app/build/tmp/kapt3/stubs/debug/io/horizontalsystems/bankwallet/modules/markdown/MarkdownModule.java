package io.horizontalsystems.bankwallet.modules.markdown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownModule;", "", "()V", "Factory", "IMarkdownContentProvider", "app_debug"})
public final class MarkdownModule {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.markdown.MarkdownModule INSTANCE = null;
    
    private MarkdownModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J%\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0016\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "markdownUrl", "", "gitReleaseUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "getContentProvider", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownModule$IMarkdownContentProvider;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final java.lang.String markdownUrl = null;
        private final java.lang.String gitReleaseUrl = null;
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        private final io.horizontalsystems.bankwallet.modules.markdown.MarkdownModule.IMarkdownContentProvider getContentProvider() {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.Nullable()
        java.lang.String markdownUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String gitReleaseUrl) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownModule$IMarkdownContentProvider;", "", "markdownUrl", "", "getMarkdownUrl", "()Ljava/lang/String;", "setMarkdownUrl", "(Ljava/lang/String;)V", "getContent", "Lio/reactivex/Single;", "app_debug"})
    public static abstract interface IMarkdownContentProvider {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Single<java.lang.String> getContent();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getMarkdownUrl();
        
        public abstract void setMarkdownUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String p0);
    }
}