package com.app.fitquid.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J#\u0010\t\u001a\u00020\u0003\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u0002H\n2\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/app/fitquid/retrofit/OnResponseListener;", "", "onResponseError", "", "message", "", "requestCode", "", "responseCode", "onResponseReceived", "T", "response", "(Ljava/lang/Object;I)V", "app_debug"})
public abstract interface OnResponseListener {
    
    public abstract <T extends java.lang.Object>void onResponseReceived(T response, int requestCode);
    
    public abstract void onResponseError(@org.jetbrains.annotations.NotNull()
    java.lang.String message, int requestCode, int responseCode);
}