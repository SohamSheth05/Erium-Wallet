package io.horizontalsystems.bankwallet.modules.markdown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/ViewHolderParagraph;", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlockViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "listener", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownContentAdapter$Listener;", "handleRelativeUrl", "", "(Landroid/view/View;Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownContentAdapter$Listener;Z)V", "blockQuoteVerticalPadding", "", "getContainerView", "()Landroid/view/View;", "listItemIndent", "bind", "", "item", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock;", "blockquote", "handleLinkToGuideInApp", "strBuilder", "Landroid/text/SpannableStringBuilder;", "span", "Landroid/text/style/URLSpan;", "listItem", "app_debug"})
public final class ViewHolderParagraph extends io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlockViewHolder implements kotlinx.android.extensions.LayoutContainer {
    private final int blockQuoteVerticalPadding = 0;
    private final int listItemIndent = 0;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View containerView = null;
    private final io.horizontalsystems.bankwallet.modules.markdown.MarkdownContentAdapter.Listener listener = null;
    private final boolean handleRelativeUrl = false;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock item) {
    }
    
    private final void handleLinkToGuideInApp(android.text.SpannableStringBuilder strBuilder, android.text.style.URLSpan span) {
    }
    
    private final void listItem(io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock item) {
    }
    
    private final void blockquote(io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getContainerView() {
        return null;
    }
    
    public ViewHolderParagraph(@org.jetbrains.annotations.NotNull()
    android.view.View containerView, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.markdown.MarkdownContentAdapter.Listener listener, boolean handleRelativeUrl) {
        super(null);
    }
}