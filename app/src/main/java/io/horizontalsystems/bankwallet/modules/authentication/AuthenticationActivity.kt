package io.horizontalsystems.bankwallet.modules.authentication

import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.fragment.NavHostFragment
import io.horizontalsystems.bankwallet.R
import io.horizontalsystems.bankwallet.core.App
import io.horizontalsystems.bankwallet.core.BaseActivity
import io.horizontalsystems.bankwallet.core.utils.PreferenceHelper
import io.horizontalsystems.bankwallet.modules.settings.theme.ThemeType

class AuthenticationActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val nightMode = when (App.localStorage.currentTheme) {
            ThemeType.Light -> AppCompatDelegate.MODE_NIGHT_NO
            ThemeType.Dark -> AppCompatDelegate.MODE_NIGHT_YES
            ThemeType.System -> AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
        }
        AppCompatDelegate.setDefaultNightMode(nightMode)

        setContentView(R.layout.activity_authentication)


        val navHost =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment

        navHost.navController.setGraph(R.navigation.authentication_graph, intent.extras)
        navHost.navController.addOnDestinationChangedListener(this)
    }
}