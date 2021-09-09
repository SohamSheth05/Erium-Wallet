package io.horizontalsystems.bankwallet.modules.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import io.horizontalsystems.bankwallet.R
import io.horizontalsystems.bankwallet.core.App
import io.horizontalsystems.bankwallet.core.BaseFragment
import io.horizontalsystems.bankwallet.modules.settings.theme.ThemeType
import io.horizontalsystems.core.findNavController
import kotlinx.android.synthetic.main.fragment_no_wallet.*

class OnboardingFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_no_wallet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (App.localStorage.currentTheme == ThemeType.Dark) {
            walletIcon.setColorFilter(
                ContextCompat.getColor(requireContext(), R.color.white),
                android.graphics.PorterDuff.Mode.MULTIPLY
            )
            introLayout.setBackgroundColor(resources.getColor(R.color.dark))
            btnCreate.background =
                resources.getDrawable(R.drawable.selected_dark_round_corner_button)
            btnRestore.background = resources.getDrawable(R.drawable.white_round_corner_button)
        }

        btnCreate.setOnClickListener {
            findNavController().navigate(R.id.createAccountFragment, null, navOptions())
        }
        btnRestore.setOnClickListener {
            findNavController().navigate(R.id.restoreMnemonicFragment, null, navOptions())
        }
    }
}
