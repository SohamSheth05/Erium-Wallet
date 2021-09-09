package io.horizontalsystems.bankwallet.modules.showkey.tabs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/showkey/tabs/ShowKeyTabsAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "showKeyTabs", "", "Lio/horizontalsystems/bankwallet/modules/showkey/ShowKeyModule$ShowKeyTab;", "words", "", "passphrase", "privateKeys", "Lio/horizontalsystems/bankwallet/modules/showkey/ShowKeyModule$PrivateKey;", "fm", "Landroidx/fragment/app/FragmentManager;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "app_debug"})
public final class ShowKeyTabsAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private final java.util.List<io.horizontalsystems.bankwallet.modules.showkey.ShowKeyModule.ShowKeyTab> showKeyTabs = null;
    private final java.util.List<java.lang.String> words = null;
    private final java.lang.String passphrase = null;
    private final java.util.List<io.horizontalsystems.bankwallet.modules.showkey.ShowKeyModule.PrivateKey> privateKeys = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
    
    public ShowKeyTabsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bankwallet.modules.showkey.ShowKeyModule.ShowKeyTab> showKeyTabs, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> words, @org.jetbrains.annotations.NotNull()
    java.lang.String passphrase, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bankwallet.modules.showkey.ShowKeyModule.PrivateKey> privateKeys, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fm, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle lifecycle) {
        super(null);
    }
}