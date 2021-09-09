package io.horizontalsystems.bankwallet.modules.tor;

import java.lang.System;

@android.annotation.SuppressLint(value = {"SetTextI18n"})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/tor/TorConnectionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "presenter", "Lio/horizontalsystems/bankwallet/modules/tor/TorStatusPresenter;", "observeRouter", "", "router", "Lio/horizontalsystems/bankwallet/modules/tor/TorStatusRouter;", "observeView", "torStatusView", "Lio/horizontalsystems/bankwallet/modules/tor/TorStatusView;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setStatus", "isError", "", "statusText", "", "app_debug"})
public final class TorConnectionActivity extends androidx.appcompat.app.AppCompatActivity {
    private io.horizontalsystems.bankwallet.modules.tor.TorStatusPresenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void observeRouter(io.horizontalsystems.bankwallet.modules.tor.TorStatusRouter router) {
    }
    
    private final void observeView(io.horizontalsystems.bankwallet.modules.tor.TorStatusView torStatusView) {
    }
    
    private final void setStatus(boolean isError, java.lang.String statusText) {
    }
    
    public TorConnectionActivity() {
        super();
    }
}