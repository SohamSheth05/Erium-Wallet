package io.horizontalsystems.bankwallet.modules.authentication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import io.horizontalsystems.bankwallet.R
import io.horizontalsystems.bankwallet.core.App
import io.horizontalsystems.bankwallet.core.BaseFragment
import io.horizontalsystems.bankwallet.core.providers.Translator
import io.horizontalsystems.bankwallet.modules.settings.theme.ThemeType
import io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution
import io.horizontalsystems.core.helpers.HudHelper
import kotlinx.android.synthetic.main.fragment_registration.*

/**
 * A simple [Fragment] subclass.
 * Use the [RegistrationFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegistrationFragment : BaseFragment() {

    companion object {
        var registrationFragment: RegistrationFragment? = null

        @JvmStatic
        fun newInstance(): RegistrationFragment {
            if (registrationFragment == null)
                registrationFragment = RegistrationFragment()
            return registrationFragment as RegistrationFragment
        }
    }

    private val registerViewModel
            by lazy { ViewModelProvider(requireActivity()).get(AuthenticationViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registration, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (App.localStorage.currentTheme == ThemeType.Dark) {
            registrationIcon.setBackgroundResource(R.drawable.dark_logo)
        }

        btnCreate.setOnClickListener {
            //   startActivity(Intent(requireContext(), LauncherActivity::class.java))
            phone.setError(
                Caution(
                    Translator.getString(R.string.BackupConfirmKey_Error_EmptyWord),
                    Caution.Type.Error
                )
            )
            HudHelper.showErrorMessage(this.requireView(), getString(R.string.default_error_msg))
        }

        registerViewModel.callRegisterAPI()
    }
}