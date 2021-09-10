package io.horizontalsystems.bankwallet.modules.authentication

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import io.horizontalsystems.bankwallet.R
import io.horizontalsystems.bankwallet.core.App
import io.horizontalsystems.bankwallet.core.BaseFragment
import io.horizontalsystems.bankwallet.core.utils.PreferenceHelper
import io.horizontalsystems.bankwallet.modules.launcher.LauncherActivity
import io.horizontalsystems.bankwallet.modules.settings.theme.ThemeType
import io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution
import io.horizontalsystems.core.findNavController
import io.horizontalsystems.core.helpers.HudHelper
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_registration.registrationIcon
import kotlinx.android.synthetic.main.view_input.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : BaseFragment() {

    companion object {
        var registrationFragment: LoginFragment? = null

        @JvmStatic
        fun newInstance(): LoginFragment {
            if (registrationFragment == null)
                registrationFragment = LoginFragment()
            return registrationFragment as LoginFragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private val authenticationViewModel
            by lazy { ViewModelProvider(requireActivity()).get(AuthenticationViewModel::class.java) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (App.localStorage.currentTheme == ThemeType.Dark) {
            registrationIcon.setBackgroundResource(R.drawable.dark_logo)
        }
        email.input.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_email, 0, 0, 0)
        password.input.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_password, 0, 0, 0)

        btnLogin.setOnClickListener {
            when {
                email.input.text.toString() == "" -> {
                    email.setError(Caution("Please enter email", Caution.Type.Error))
                }
                !email.input.text.toString()
                    .matches(Patterns.EMAIL_ADDRESS.pattern().toRegex()) -> {
                    email.setError(Caution("Please enter valid email", Caution.Type.Error))
                }
                password.input.text.toString() == "" -> {
                    password.setError(Caution("Please enter password", Caution.Type.Error))
                }
                else -> {
                    email.setError(null)
                    password.setError(null)
                    authenticationViewModel.callLoginApi(getParam())
                }
            }

        }
        tvForgotPassword.setOnClickListener {
            findNavController().navigate(AuthViewPagerFragmentDirections.actionAuthViewPagerFragmentToForgotPasswordFragment())
        }

        authenticationViewModel.loginObserver.observe(viewLifecycleOwner, {
            it?.let { it1 -> PreferenceHelper.setUserDetails(it1) }
            startActivity(Intent(requireContext(), LauncherActivity::class.java))
        })
        authenticationViewModel.apiErrorMessage.observe(viewLifecycleOwner, {
            HudHelper.showErrorMessage(this.requireView(), it.peekContent().toString())
        })
    }

    private fun getParam(): HashMap<String, String> {
        val hashMap = hashMapOf<String, String>()
        hashMap["email"] = email.input.text.toString()
        hashMap["password"] = password.input.text.toString()
        return hashMap
    }
}