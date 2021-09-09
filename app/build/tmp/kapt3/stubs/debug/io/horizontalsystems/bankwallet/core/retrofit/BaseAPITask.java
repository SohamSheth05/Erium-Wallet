package io.horizontalsystems.bankwallet.core.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J8\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b\"\u0004\b\u0000\u0010\t2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bankwallet/core/retrofit/BaseAPITask;", "", "()V", "NO_INTERNET", "", "getNO_INTERNET", "()I", "getRequest", "Lio/reactivex/observers/DisposableObserver;", "T", "request", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "mListener", "Lcom/app/fitquid/retrofit/OnResponseListener;", "requestCode", "app_debug"})
public class BaseAPITask {
    private final int NO_INTERNET = 210;
    
    public final int getNO_INTERNET() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final <T extends java.lang.Object>io.reactivex.observers.DisposableObserver<?> getRequest(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<retrofit2.Response<T>> request, @org.jetbrains.annotations.NotNull()
    com.app.fitquid.retrofit.OnResponseListener mListener, int requestCode) {
        return null;
    }
    
    public BaseAPITask() {
        super();
    }
}