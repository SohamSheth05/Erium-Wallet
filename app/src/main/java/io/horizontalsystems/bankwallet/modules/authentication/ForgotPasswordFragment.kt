package io.horizontalsystems.bankwallet.modules.authentication

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
import io.horizontalsystems.bankwallet.modules.settings.theme.ThemeType
import io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution
import io.horizontalsystems.core.findNavController
import io.horizontalsystems.core.helpers.HudHelper
import kotlinx.android.synthetic.main.fragment_forgot_password.*
import kotlinx.android.synthetic.main.fragment_forgot_password.email
import kotlinx.android.synthetic.main.fragment_forgot_password.registrationIcon
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.raw_toolbar_with_back_arrow_and_text.*
import kotlinx.android.synthetic.main.view_input.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [ForgotPasswordFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ForgotPasswordFragment : BaseFragment() {

    companion object {
        var registrationFragment: ForgotPasswordFragment? = null

        @JvmStatic
        fun newInstance(): ForgotPasswordFragment {
            if (registrationFragment == null)
                registrationFragment = ForgotPasswordFragment()
            return registrationFragment as ForgotPasswordFragment
        }
    }

    private val authenticationViewModel
            by lazy { ViewModelProvider(this).get(AuthenticationViewModel::class.java) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forgot_password, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txtScreenName.text = "Forgot password"
        ivBackArrow.setOnClickListener {
            findNavController().popBackStack()
        }

        if (App.localStorage.currentTheme == ThemeType.Dark) {
            registrationIcon.setBackgroundResource(R.drawable.dark_logo)
        }else{
            registrationIcon.setBackgroundResource(R.drawable.white_logo)
        }

        if (App.localStorage.currentTheme == ThemeType.Dark) {
            registrationIcon.setBackgroundResource(R.drawable.dark_logo)
        }else{
            registrationIcon.setBackgroundResource(R.drawable.white_logo)
        }

        email.input.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_email, 0, 0, 0)
        btnSendLink.setOnClickListener {
            if (email.input.text.toString().isEmpty()) {
                email.setError(Caution("Please enter email", Caution.Type.Error))
            } else if (!email.input.text.toString()
                    .matches(Patterns.EMAIL_ADDRESS.pattern().toRegex())
            ) {
                email.setError(Caution("Please enter valid email", Caution.Type.Error))
            } else {
                authenticationViewModel.callForgotPassword(getParam())
            }
        }
        authenticationViewModel.forgotPasswordObserver.observe(viewLifecycleOwner, {
            if (it == 200) {
                //activity?.onBackPressed()
                HudHelper.showErrorMessage(this.requireView(), "Password reset link sent.")
            }
        })
        authenticationViewModel.apiErrorMessage.observe(viewLifecycleOwner, {
            email.input.text.clear()
            it?.getContentIfNotHandled()?.let {
                HudHelper.showErrorMessage(this.requireView(), it)
            }
        })
    }

    private fun getParam(): HashMap<String, String> {
        val hashMap = hashMapOf<String, String>()
        hashMap["email"] = email.input.text.toString()
        return hashMap
    }
}