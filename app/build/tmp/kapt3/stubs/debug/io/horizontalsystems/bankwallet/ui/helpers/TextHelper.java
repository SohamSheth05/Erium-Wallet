package io.horizontalsystems.bankwallet.ui.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eJ\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001cR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bankwallet/ui/helpers/TextHelper;", "Lio/horizontalsystems/bankwallet/core/IClipboardManager;", "()V", "clipboard", "Landroid/content/ClipboardManager;", "getClipboard", "()Landroid/content/ClipboardManager;", "hasPrimaryClip", "", "getHasPrimaryClip", "()Z", "copyText", "", "text", "", "copyTextToClipboard", "context", "Landroid/content/Context;", "getCleanedUrl", "link", "getCopiedText", "getFeeRatePriorityString", "priority", "Lio/horizontalsystems/bankwallet/core/FeeRatePriority;", "getQrCodeBitmap", "Landroid/graphics/Bitmap;", "address", "size", "", "app_debug"})
public final class TextHelper implements io.horizontalsystems.bankwallet.core.IClipboardManager {
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.ui.helpers.TextHelper INSTANCE = null;
    
    @java.lang.Override()
    public boolean getHasPrimaryClip() {
        return false;
    }
    
    @java.lang.Override()
    public void copyText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCopiedText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getQrCodeBitmap(@org.jetbrains.annotations.NotNull()
    java.lang.String address, float size) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFeeRatePriorityString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.FeeRatePriority priority) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCleanedUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String link) {
        return null;
    }
    
    private final android.content.ClipboardManager getClipboard() {
        return null;
    }
    
    private final void copyTextToClipboard(android.content.Context context, java.lang.String text) {
    }
    
    private TextHelper() {
        super();
    }
}