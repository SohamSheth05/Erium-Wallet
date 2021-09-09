package io.horizontalsystems.bankwallet.modules.markdown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\n\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownVisitorBlock;", "Lorg/commonmark/node/AbstractVisitor;", "markdownUrl", "", "level", "", "listItemMarkerGenerator", "Lio/horizontalsystems/bankwallet/modules/markdown/ListItemMarkerGenerator;", "(Ljava/lang/String;ILio/horizontalsystems/bankwallet/modules/markdown/ListItemMarkerGenerator;)V", "blocks", "", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock;", "getBlocks", "()Ljava/util/List;", "getLevel", "()I", "quoted", "", "getNextListItemMarker", "visit", "", "blockQuote", "Lorg/commonmark/node/BlockQuote;", "bulletList", "Lorg/commonmark/node/BulletList;", "heading", "Lorg/commonmark/node/Heading;", "image", "Lorg/commonmark/node/Image;", "listItem", "Lorg/commonmark/node/ListItem;", "orderedList", "Lorg/commonmark/node/OrderedList;", "paragraph", "Lorg/commonmark/node/Paragraph;", "visitListBlock", "listBlock", "Lorg/commonmark/node/ListBlock;", "app_debug"})
public final class MarkdownVisitorBlock extends org.commonmark.node.AbstractVisitor {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock> blocks = null;
    private boolean quoted = false;
    private java.lang.String markdownUrl;
    private final int level = 0;
    private final io.horizontalsystems.bankwallet.modules.markdown.ListItemMarkerGenerator listItemMarkerGenerator = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock> getBlocks() {
        return null;
    }
    
    @java.lang.Override()
    public void visit(@org.jetbrains.annotations.NotNull()
    org.commonmark.node.Heading heading) {
    }
    
    @java.lang.Override()
    public void visit(@org.jetbrains.annotations.NotNull()
    org.commonmark.node.Paragraph paragraph) {
    }
    
    @java.lang.Override()
    public void visit(@org.jetbrains.annotations.NotNull()
    org.commonmark.node.Image image) {
    }
    
    @java.lang.Override()
    public void visit(@org.jetbrains.annotations.NotNull()
    org.commonmark.node.BlockQuote blockQuote) {
    }
    
    @java.lang.Override()
    public void visit(@org.jetbrains.annotations.NotNull()
    org.commonmark.node.BulletList bulletList) {
    }
    
    @java.lang.Override()
    public void visit(@org.jetbrains.annotations.NotNull()
    org.commonmark.node.OrderedList orderedList) {
    }
    
    @java.lang.Override()
    public void visit(@org.jetbrains.annotations.NotNull()
    org.commonmark.node.ListItem listItem) {
    }
    
    private final void visitListBlock(org.commonmark.node.ListBlock listBlock, io.horizontalsystems.bankwallet.modules.markdown.ListItemMarkerGenerator listItemMarkerGenerator) {
    }
    
    private final java.lang.String getNextListItemMarker() {
        return null;
    }
    
    public final int getLevel() {
        return 0;
    }
    
    public MarkdownVisitorBlock(@org.jetbrains.annotations.NotNull()
    java.lang.String markdownUrl, int level, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bankwallet.modules.markdown.ListItemMarkerGenerator listItemMarkerGenerator) {
        super();
    }
}