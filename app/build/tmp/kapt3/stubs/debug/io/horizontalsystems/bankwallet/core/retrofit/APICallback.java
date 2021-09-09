package io.horizontalsystems.bankwallet.core.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bankwallet/core/retrofit/APICallback;", "T", "Lio/reactivex/observers/DisposableObserver;", "Lretrofit2/Response;", "mListener", "Lcom/app/fitquid/retrofit/OnResponseListener;", "requestCode", "", "request", "Lio/reactivex/Observable;", "(Lcom/app/fitquid/retrofit/OnResponseListener;ILio/reactivex/Observable;)V", "Message", "", "getMessage", "()Ljava/lang/String;", "getRequest", "()Lio/reactivex/Observable;", "onComplete", "", "onError", "e", "", "onNext", "response", "app_debug"})
public final class APICallback<T extends java.lang.Object> extends io.reactivex.observers.DisposableObserver<retrofit2.Response<T>> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Message = "error";
    private final com.app.fitquid.retrofit.OnResponseListener mListener = null;
    private final int requestCode = 0;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<retrofit2.Response<T>> request = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @java.lang.Override()
    public void onComplete() {
    }
    
    @java.lang.Override()
    public void onNext(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> response) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<retrofit2.Response<T>> getRequest() {
        return null;
    }
    
    public APICallback(@org.jetbrains.annotations.NotNull()
    com.app.fitquid.retrofit.OnResponseListener mListener, int requestCode, @org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<retrofit2.Response<T>> request) {
        super();
    }
}