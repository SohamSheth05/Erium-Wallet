package io.horizontalsystems.bankwallet.modules.markdown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u001e\u001f !\"#B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b\u0082\u0001\u0006$%&\'()\u00a8\u0006*"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock;", "", "()V", "listItem", "", "getListItem", "()Z", "setListItem", "(Z)V", "listItemMarker", "", "getListItemMarker", "()Ljava/lang/String;", "setListItemMarker", "(Ljava/lang/String;)V", "listTightBottom", "getListTightBottom", "setListTightBottom", "listTightTop", "getListTightTop", "setListTightTop", "quoted", "getQuoted", "setQuoted", "quotedFirst", "getQuotedFirst", "setQuotedFirst", "quotedLast", "getQuotedLast", "setQuotedLast", "Footer", "Heading1", "Heading2", "Heading3", "Image", "Paragraph", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock$Heading1;", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock$Heading2;", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock$Heading3;", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock$Paragraph;", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock$Image;", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock$Footer;", "app_debug"})
public abstract class MarkdownBlock {
    private boolean quoted = false;
    private boolean quotedFirst = false;
    private boolean quotedLast = false;
    private boolean listItem = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String listItemMarker;
    private boolean listTightTop = false;
    private boolean listTightBottom = false;
    
    public final boolean getQuoted() {
        return false;
    }
    
    public final void setQuoted(boolean p0) {
    }
    
    public final boolean getQuotedFirst() {
        return false;
    }
    
    public final void setQuotedFirst(boolean p0) {
    }
    
    public final boolean getQuotedLast() {
        return false;
    }
    
    public final void setQuotedLast(boolean p0) {
    }
    
    public final boolean getListItem() {
        return false;
    }
    
    public final void setListItem(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getListItemMarker() {
        return null;
    }
    
    public final void setListItemMarker(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getListTightTop() {
        return false;
    }
    
    public final void setListTightTop(boolean p0) {
    }
    
    public final boolean getListTightBottom() {
        return false;
    }
    
    public final void setListTightBottom(boolean p0) {
    }
    
    private MarkdownBlock() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock$Heading1;", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock;", "text", "Landroid/text/SpannableStringBuilder;", "(Landroid/text/SpannableStringBuilder;)V", "getText", "()Landroid/text/SpannableStringBuilder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Heading1 extends io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock {
        @org.jetbrains.annotations.NotNull()
        private final android.text.SpannableStringBuilder text = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.text.SpannableStringBuilder getText() {
            return null;
        }
        
        public Heading1(@org.jetbrains.annotations.NotNull()
        android.text.SpannableStringBuilder text) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.text.SpannableStringBuilder component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock.Heading1 copy(@org.jetbrains.annotations.NotNull()
        android.text.SpannableStringBuilder text) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock$Heading2;", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock;", "text", "Landroid/text/SpannableStringBuilder;", "(Landroid/text/SpannableStringBuilder;)V", "getText", "()Landroid/text/SpannableStringBuilder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Heading2 extends io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock {
        @org.jetbrains.annotations.NotNull()
        private final android.text.SpannableStringBuilder text = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.text.SpannableStringBuilder getText() {
            return null;
        }
        
        public Heading2(@org.jetbrains.annotations.NotNull()
        android.text.SpannableStringBuilder text) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.text.SpannableStringBuilder component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock.Heading2 copy(@org.jetbrains.annotations.NotNull()
        android.text.SpannableStringBuilder text) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock$Heading3;", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock;", "text", "Landroid/text/SpannableStringBuilder;", "(Landroid/text/SpannableStringBuilder;)V", "getText", "()Landroid/text/SpannableStringBuilder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Heading3 extends io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock {
        @org.jetbrains.annotations.NotNull()
        private final android.text.SpannableStringBuilder text = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.text.SpannableStringBuilder getText() {
            return null;
        }
        
        public Heading3(@org.jetbrains.annotations.NotNull()
        android.text.SpannableStringBuilder text) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.text.SpannableStringBuilder component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock.Heading3 copy(@org.jetbrains.annotations.NotNull()
        android.text.SpannableStringBuilder text) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock$Paragraph;", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock;", "text", "Landroid/text/SpannableStringBuilder;", "quoted", "", "(Landroid/text/SpannableStringBuilder;Z)V", "(Landroid/text/SpannableStringBuilder;)V", "getText", "()Landroid/text/SpannableStringBuilder;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Paragraph extends io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock {
        @org.jetbrains.annotations.NotNull()
        private final android.text.SpannableStringBuilder text = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.text.SpannableStringBuilder getText() {
            return null;
        }
        
        public Paragraph(@org.jetbrains.annotations.NotNull()
        android.text.SpannableStringBuilder text) {
            super();
        }
        
        public Paragraph(@org.jetbrains.annotations.NotNull()
        android.text.SpannableStringBuilder text, boolean quoted) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.text.SpannableStringBuilder component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock.Paragraph copy(@org.jetbrains.annotations.NotNull()
        android.text.SpannableStringBuilder text) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock$Image;", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock;", "destination", "", "title", "mainImage", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getDestination", "()Ljava/lang/String;", "getMainImage", "()Z", "getTitle", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Image extends io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String destination = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String title = null;
        private final boolean mainImage = false;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDestination() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final boolean getMainImage() {
            return false;
        }
        
        public Image(@org.jetbrains.annotations.NotNull()
        java.lang.String destination, @org.jetbrains.annotations.Nullable()
        java.lang.String title, boolean mainImage) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock.Image copy(@org.jetbrains.annotations.NotNull()
        java.lang.String destination, @org.jetbrains.annotations.Nullable()
        java.lang.String title, boolean mainImage) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock$Footer;", "Lio/horizontalsystems/bankwallet/modules/markdown/MarkdownBlock;", "()V", "app_debug"})
    public static final class Footer extends io.horizontalsystems.bankwallet.modules.markdown.MarkdownBlock {
        
        public Footer() {
            super();
        }
    }
}