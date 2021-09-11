package io.horizontalsystems.bankwallet.modules.authentication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import io.horizontalsystems.bankwallet.R
import io.horizontalsystems.bankwallet.core.App
import io.horizontalsystems.bankwallet.core.BaseFragment
import io.horizontalsystems.bankwallet.core.utils.PreferenceHelper
import io.horizontalsystems.bankwallet.modules.launcher.LauncherActivity
import io.horizontalsystems.bankwallet.modules.settings.theme.ThemeType
import kotlinx.android.synthetic.main.fragment_setup_security.*
import kotlinx.android.synthetic.main.fragment_setup_security.introLayout

/**
 * A simple [Fragment] subclass.
 * Use the [SetupSecurityFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SetupSecurityFragment : BaseFragment() {

    companion object {
        var setupSecurityFragment: SetupSecurityFragment? = null

        @JvmStatic
        fun newInstance(): SetupSecurityFragment {
            if (setupSecurityFragment == null)
                setupSecurityFragment = SetupSecurityFragment()
            return setupSecurityFragment as SetupSecurityFragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setup_security, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (App.localStorage.currentTheme == ThemeType.Dark) {
            /* walletIcon.setColorFilter(
                 ContextCompat.getColor(requireContext(), R.color.white),
                 android.graphics.PorterDuff.Mode.MULTIPLY
             )*/
            introLayout.setBackgroundColor(resources.getColor(R.color.dark))
            btnSetup.background =
                resources.getDrawable(R.drawable.selected_dark_round_corner_button)
            btnNotNow.background = resources.getDrawable(R.drawable.white_round_corner_button)
        }

        btnSetup.setOnClickListener {

        }

        btnNotNow.setOnClickListener {
            //val counter = PreferenceHelper.getSetupSecurityCounter() + 1
            //PreferenceHelper.setSetupSecurityCounter(counter)
            startActivity(Intent(requireActivity(), LauncherActivity::class.java))
            requireActivity().finish()
        }
    }
}