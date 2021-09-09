package io.horizontalsystems.bankwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\b\u001a*\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f`\r0\n0\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/FaqManager;", "", "()V", "faqListUrl", "", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "getFaqList", "Lio/reactivex/Single;", "", "Ljava/util/HashMap;", "Lio/horizontalsystems/bankwallet/entities/Faq;", "Lkotlin/collections/HashMap;", "FaqDeserializer", "app_debug"})
public final class FaqManager {
    private static final java.lang.String faqListUrl = null;
    private static final com.google.gson.Gson gson = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.horizontalsystems.bankwallet.core.managers.FaqManager INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.util.List<java.util.HashMap<java.lang.String, io.horizontalsystems.bankwallet.entities.Faq>>> getFaqList() {
        return null;
    }
    
    private FaqManager() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bankwallet/core/managers/FaqManager$FaqDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lio/horizontalsystems/bankwallet/entities/Faq;", "faqUrl", "", "(Ljava/lang/String;)V", "faqUrlObj", "Ljava/net/URL;", "absolutify", "relativeUrl", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "app_debug"})
    public static final class FaqDeserializer implements com.google.gson.JsonDeserializer<io.horizontalsystems.bankwallet.entities.Faq> {
        private final java.net.URL faqUrlObj = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public io.horizontalsystems.bankwallet.entities.Faq deserialize(@org.jetbrains.annotations.NotNull()
        com.google.gson.JsonElement json, @org.jetbrains.annotations.NotNull()
        java.lang.reflect.Type typeOfT, @org.jetbrains.annotations.NotNull()
        com.google.gson.JsonDeserializationContext context) {
            return null;
        }
        
        private final java.lang.String absolutify(java.lang.String relativeUrl) {
            return null;
        }
        
        public FaqDeserializer(@org.jetbrains.annotations.NotNull()
        java.lang.String faqUrl) {
            super();
        }
    }
}