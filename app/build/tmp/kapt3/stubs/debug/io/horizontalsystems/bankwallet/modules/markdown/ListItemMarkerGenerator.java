package io.horizontalsystems.bankwallet.modules.markdown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/ListItemMarkerGenerator;", "", "()V", "getNext", "", "Ordered", "Unordered", "app_debug"})
public abstract class ListItemMarkerGenerator {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getNext();
    
    public ListItemMarkerGenerator() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/ListItemMarkerGenerator$Unordered;", "Lio/horizontalsystems/bankwallet/modules/markdown/ListItemMarkerGenerator;", "()V", "getNext", "", "app_debug"})
    public static final class Unordered extends io.horizontalsystems.bankwallet.modules.markdown.ListItemMarkerGenerator {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.markdown.ListItemMarkerGenerator.Unordered INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getNext() {
            return null;
        }
        
        private Unordered() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/markdown/ListItemMarkerGenerator$Ordered;", "Lio/horizontalsystems/bankwallet/modules/markdown/ListItemMarkerGenerator;", "startNumber", "", "delimiter", "", "(IC)V", "getNext", "", "app_debug"})
    public static final class Ordered extends io.horizontalsystems.bankwallet.modules.markdown.ListItemMarkerGenerator {
        private int startNumber;
        private final char delimiter = '\u0000';
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getNext() {
            return null;
        }
        
        public Ordered(int startNumber, char delimiter) {
            super();
        }
    }
}