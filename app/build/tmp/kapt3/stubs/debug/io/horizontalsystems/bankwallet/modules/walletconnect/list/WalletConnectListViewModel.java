package io.horizontalsystems.bankwallet.modules.walletconnect.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\tH\u0014J\u0016\u0010\u001b\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001f"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListService;", "(Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListService;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "startNewConnectionEvent", "Lio/horizontalsystems/core/SingleLiveEvent;", "", "getStartNewConnectionEvent", "()Lio/horizontalsystems/core/SingleLiveEvent;", "viewItemsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListViewModel$WalletConnectViewItem;", "getViewItemsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getSessionsCount", "", "getSuitableIcon", "", "imageUrls", "getTitle", "chain", "Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListService$Chain;", "onCleared", "sync", "items", "Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListService$Item;", "WalletConnectViewItem", "app_debug"})
public final class WalletConnectListViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.walletconnect.list.WalletConnectListViewModel.WalletConnectViewItem>> viewItemsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> startNewConnectionEvent = null;
    private final io.horizontalsystems.bankwallet.modules.walletconnect.list.WalletConnectListService service = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bankwallet.modules.walletconnect.list.WalletConnectListViewModel.WalletConnectViewItem>> getViewItemsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.core.SingleLiveEvent<kotlin.Unit> getStartNewConnectionEvent() {
        return null;
    }
    
    public final int getSessionsCount() {
        return 0;
    }
    
    private final void sync(java.util.List<io.horizontalsystems.bankwallet.modules.walletconnect.list.WalletConnectListService.Item> items) {
    }
    
    private final java.lang.String getTitle(io.horizontalsystems.bankwallet.modules.walletconnect.list.WalletConnectListService.Chain chain) {
        return null;
    }
    
    private final java.lang.String getSuitableIcon(java.util.List<java.lang.String> imageUrls) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public WalletConnectListViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.modules.walletconnect.list.WalletConnectListService service) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListViewModel$WalletConnectViewItem;", "", "()V", "Account", "Session", "Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListViewModel$WalletConnectViewItem$Account;", "Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListViewModel$WalletConnectViewItem$Session;", "app_debug"})
    public static abstract class WalletConnectViewItem {
        
        private WalletConnectViewItem() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListViewModel$WalletConnectViewItem$Account;", "Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListViewModel$WalletConnectViewItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "app_debug"})
        public static final class Account extends io.horizontalsystems.bankwallet.modules.walletconnect.list.WalletConnectListViewModel.WalletConnectViewItem {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String title = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTitle() {
                return null;
            }
            
            public Account(@org.jetbrains.annotations.NotNull()
            java.lang.String title) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListViewModel$WalletConnectViewItem$Session;", "Lio/horizontalsystems/bankwallet/modules/walletconnect/list/WalletConnectListViewModel$WalletConnectViewItem;", "session", "Lio/horizontalsystems/bankwallet/entities/WalletConnectSession;", "title", "", "url", "imageUrl", "position", "Lio/horizontalsystems/views/ListPosition;", "(Lio/horizontalsystems/bankwallet/entities/WalletConnectSession;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/horizontalsystems/views/ListPosition;)V", "getImageUrl", "()Ljava/lang/String;", "getPosition", "()Lio/horizontalsystems/views/ListPosition;", "getSession", "()Lio/horizontalsystems/bankwallet/entities/WalletConnectSession;", "getTitle", "getUrl", "app_debug"})
        public static final class Session extends io.horizontalsystems.bankwallet.modules.walletconnect.list.WalletConnectListViewModel.WalletConnectViewItem {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.bankwallet.entities.WalletConnectSession session = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String title = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String url = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String imageUrl = null;
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.views.ListPosition position = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bankwallet.entities.WalletConnectSession getSession() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTitle() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getUrl() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getImageUrl() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.views.ListPosition getPosition() {
                return null;
            }
            
            public Session(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bankwallet.entities.WalletConnectSession session, @org.jetbrains.annotations.NotNull()
            java.lang.String title, @org.jetbrains.annotations.NotNull()
            java.lang.String url, @org.jetbrains.annotations.Nullable()
            java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
            io.horizontalsystems.views.ListPosition position) {
                super();
            }
        }
    }
}