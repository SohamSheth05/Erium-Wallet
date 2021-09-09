package io.horizontalsystems.bankwallet.modules.balanceonboarding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balanceonboarding/BalanceOnboardingViewModel;", "Landroidx/lifecycle/ViewModel;", "accountManager", "Lio/horizontalsystems/bankwallet/core/IAccountManager;", "walletManager", "Lio/horizontalsystems/bankwallet/core/IWalletManager;", "(Lio/horizontalsystems/bankwallet/core/IAccountManager;Lio/horizontalsystems/bankwallet/core/IWalletManager;)V", "balanceViewTypeLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lio/horizontalsystems/bankwallet/modules/balanceonboarding/BalanceOnboardingViewModel$BalanceViewType;", "getBalanceViewTypeLiveData", "()Landroidx/lifecycle/MutableLiveData;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "onCleared", "", "syncBalanceViewType", "BalanceViewType", "app_debug"})
public final class BalanceOnboardingViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.balanceonboarding.BalanceOnboardingViewModel.BalanceViewType> balanceViewTypeLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final io.horizontalsystems.bankwallet.core.IAccountManager accountManager = null;
    private final io.horizontalsystems.bankwallet.core.IWalletManager walletManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<io.horizontalsystems.bankwallet.modules.balanceonboarding.BalanceOnboardingViewModel.BalanceViewType> getBalanceViewTypeLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    private final void syncBalanceViewType() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BalanceOnboardingViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.IWalletManager walletManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balanceonboarding/BalanceOnboardingViewModel$BalanceViewType;", "", "()V", "Balance", "NoAccounts", "NoCoins", "Lio/horizontalsystems/bankwallet/modules/balanceonboarding/BalanceOnboardingViewModel$BalanceViewType$NoAccounts;", "Lio/horizontalsystems/bankwallet/modules/balanceonboarding/BalanceOnboardingViewModel$BalanceViewType$NoCoins;", "Lio/horizontalsystems/bankwallet/modules/balanceonboarding/BalanceOnboardingViewModel$BalanceViewType$Balance;", "app_debug"})
    public static abstract class BalanceViewType {
        
        private BalanceViewType() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balanceonboarding/BalanceOnboardingViewModel$BalanceViewType$NoAccounts;", "Lio/horizontalsystems/bankwallet/modules/balanceonboarding/BalanceOnboardingViewModel$BalanceViewType;", "()V", "app_debug"})
        public static final class NoAccounts extends io.horizontalsystems.bankwallet.modules.balanceonboarding.BalanceOnboardingViewModel.BalanceViewType {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.balanceonboarding.BalanceOnboardingViewModel.BalanceViewType.NoAccounts INSTANCE = null;
            
            private NoAccounts() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balanceonboarding/BalanceOnboardingViewModel$BalanceViewType$NoCoins;", "Lio/horizontalsystems/bankwallet/modules/balanceonboarding/BalanceOnboardingViewModel$BalanceViewType;", "accountName", "", "(Ljava/lang/String;)V", "getAccountName", "()Ljava/lang/String;", "app_debug"})
        public static final class NoCoins extends io.horizontalsystems.bankwallet.modules.balanceonboarding.BalanceOnboardingViewModel.BalanceViewType {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String accountName = null;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getAccountName() {
                return null;
            }
            
            public NoCoins(@org.jetbrains.annotations.Nullable()
            java.lang.String accountName) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/balanceonboarding/BalanceOnboardingViewModel$BalanceViewType$Balance;", "Lio/horizontalsystems/bankwallet/modules/balanceonboarding/BalanceOnboardingViewModel$BalanceViewType;", "()V", "app_debug"})
        public static final class Balance extends io.horizontalsystems.bankwallet.modules.balanceonboarding.BalanceOnboardingViewModel.BalanceViewType {
            @org.jetbrains.annotations.NotNull()
            public static final io.horizontalsystems.bankwallet.modules.balanceonboarding.BalanceOnboardingViewModel.BalanceViewType.Balance INSTANCE = null;
            
            private Balance() {
                super();
            }
        }
    }
}