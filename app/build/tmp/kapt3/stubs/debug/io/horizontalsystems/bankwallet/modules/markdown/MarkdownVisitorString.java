package io.horizontalsystems.bankwallet.modules.markdown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownVisitorString;", "Lorg/commonmark/node/AbstractVisitor;", "markdownUrl", "", "(Ljava/lang/String;)V", "spannableStringBuilder", "Landroid/text/SpannableStringBuilder;", "getSpannableStringBuilder", "()Landroid/text/SpannableStringBuilder;", "getWrappedContent", "node", "Lorg/commonmark/node/Node;", "span", "", "visit", "", "emphasis", "Lorg/commonmark/node/Emphasis;", "link", "Lorg/commonmark/node/Link;", "strongEmphasis", "Lorg/commonmark/node/StrongEmphasis;", "text", "Lorg/commonmark/node/Text;", "Companion", "app_debug"})
public final class MarkdownVisitorString extends org.commonmark.node.AbstractVisitor {
    @org.jetbrains.annotations.NotNull()
    private final android.text.SpannableStringBuilder spannableStringBuilder = null;
    private final java.lang.String markdownUrl = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.modules.markdown.MarkdownVisitorString.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.SpannableStringBuilder getSpannableStringBuilder() {
        return null;
    }
    
    @java.lang.Override()
    public void visit(@org.jetbrains.annotations.NotNull()
    org.commonmark.node.Text text) {
    }
    
    @java.lang.Override()
    public void visit(@org.jetbrains.annotations.NotNull()
    org.commonmark.node.StrongEmphasis strongEmphasis) {
    }
    
    @java.lang.Override()
    public void visit(@org.jetbrains.annotations.NotNull()
    org.commonmark.node.Link link) {
    }
    
    @java.lang.Override()
    public void visit(@org.jetbrains.annotations.NotNull()
    org.commonmark.node.Emphasis emphasis) {
    }
    
    private final android.text.SpannableStringBuilder getWrappedContent(org.commonmark.node.Node node, java.lang.Object span) {
        return null;
    }
    
    public MarkdownVisitorString(@org.jetbrains.annotations.NotNull()
    java.lang.String markdownUrl) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownVisitorString$Companion;", "", "()V", "getNodeContent", "Landroid/text/SpannableStringBuilder;", "node", "Lorg/commonmark/node/Node;", "markdownUrl", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.text.SpannableStringBuilder getNodeContent(@org.jetbrains.annotations.NotNull()
        org.commonmark.node.Node node, @org.jetbrains.annotations.NotNull()
        java.lang.String markdownUrl) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}