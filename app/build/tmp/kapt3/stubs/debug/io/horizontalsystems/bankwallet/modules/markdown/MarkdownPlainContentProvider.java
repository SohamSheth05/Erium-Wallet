package io.horizontalsystems.bankwallet.modules.markdown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownPlainContentProvider;", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownModule$IMarkdownContentProvider;", "networkManager", "Lio/horizontalsystems/bankwallet/core/INetworkManager;", "contentUrl", "", "(Lio/horizontalsystems/bankwallet/core/INetworkManager;Ljava/lang/String;)V", "markdownUrl", "getMarkdownUrl", "()Ljava/lang/String;", "setMarkdownUrl", "(Ljava/lang/String;)V", "getContent", "Lio/reactivex/Single;", "app_debug"})
public final class MarkdownPlainContentProvider implements io.horizontalsystems.bankwallet.modules.markdown.MarkdownModule.IMarkdownContentProvider {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String markdownUrl;
    private final io.horizontalsystems.bankwallet.core.INetworkManager networkManager = null;
    private final java.lang.String contentUrl = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getMarkdownUrl() {
        return null;
    }
    
    @java.lang.Override()
    public void setMarkdownUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.lang.String> getContent() {
        return null;
    }
    
    public MarkdownPlainContentProvider(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.INetworkManager networkManager, @org.jetbrains.annotations.NotNull()
    java.lang.String contentUrl) {
        super();
    }
}