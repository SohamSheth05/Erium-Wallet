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
import io.horizontalsystems.bankwallet.core.utils.PreferenceHelper
import io.horizontalsystems.bankwallet.modules.settings.theme.ThemeType
import io.horizontalsystems.core.helpers.HudHelper
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_registration.registrationIcon

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

        btnLogin.setOnClickListener {
            when {
                email.text.toString() == "" -> {
                    HudHelper.showErrorMessage(this.requireView(), "Please enter email")
                }
                password.text.toString() == "" -> {
                    HudHelper.showErrorMessage(this.requireView(), "Please enter password")
                }
                else -> {
                    authenticationViewModel.callLoginApi(getParam())
                }
            }

        }

        authenticationViewModel.loginObserver.observe(viewLifecycleOwner, {
            it?.let { it1 -> PreferenceHelper.setUserDetails(it1) }
        })
    }

    private fun getParam(): HashMap<String, String> {
        val hashMap = hashMapOf<String, String>()
        hashMap["email"] = email.text.toString()
        hashMap["password"] = password.text.toString()
        return hashMap
    }
}