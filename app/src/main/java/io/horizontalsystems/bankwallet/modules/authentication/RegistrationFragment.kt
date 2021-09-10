package io.horizontalsystems.bankwallet.modules.authentication

import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import io.horizontalsystems.bankwallet.R
import io.horizontalsystems.bankwallet.core.App
import io.horizontalsystems.bankwallet.core.BaseFragment
import io.horizontalsystems.bankwallet.entities.request.RegisterRequest
import io.horizontalsystems.bankwallet.modules.settings.theme.ThemeType
import io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution
import io.horizontalsystems.core.helpers.HudHelper
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_registration.*
import kotlinx.android.synthetic.main.fragment_registration.email
import kotlinx.android.synthetic.main.fragment_registration.ivIcon
import kotlinx.android.synthetic.main.fragment_registration.password
import kotlinx.android.synthetic.main.view_input.view.*
import org.greenrobot.eventbus.EventBus

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
            by lazy { ViewModelProvider(this).get(AuthenticationViewModel::class.java) }

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
            ivIcon.setBackgroundResource(R.drawable.dark_logo)
        }else{
            ivIcon.setBackgroundResource(R.drawable.white_logo)
        }

        email.input.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_email, 0, 0, 0)
        password.input.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_password, 0, 0, 0)
        confirmPassword.input.setCompoundDrawablesWithIntrinsicBounds(
            R.drawable.ic_password,
            0,
            0,
            0
        )
        firstName.input.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_user_name, 0, 0, 0)
        lastName.input.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_user_name, 0, 0, 0)
        phone.input.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_phone, 0, 0, 0)

        btnCreate.setOnClickListener {
            //   startActivity(Intent(requireContext(), LauncherActivity::class.java))
            validateData()
        }

        registerViewModel.apiErrorMessage.observe(viewLifecycleOwner, {
            it?.getContentIfNotHandled()?.let {
                HudHelper.showErrorMessage(this.requireView(), it)
            }
        })

        registerViewModel.successStringMessage.observe(viewLifecycleOwner, {
            it?.getContentIfNotHandled()?.let {
                email.input.text.clear()
                password.input.text.clear()
                confirmPassword.input.text.clear()
                firstName.input.text.clear()
                lastName.input.text.clear()
                phone.input.text.clear()
                HudHelper.showSuccessMessage(this.requireView(), it)
            }
        })

    }

    private fun validateData() {
        when {
            firstName.input.text.toString() == "" -> {
                firstName.setError(Caution("Please enter first name", Caution.Type.Error))
            }
            lastName.input.text.toString() == "" -> {
                lastName.setError(Caution("Please enter last name", Caution.Type.Error))
            }
            phone.input.text.toString() == "" -> {
                phone.setError(Caution("Please enter phone", Caution.Type.Error))
            }
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
            confirmPassword.input.text.toString() == "" -> {
                confirmPassword.setError(
                    Caution(
                        "Please enter confirm password",
                        Caution.Type.Error
                    )
                )
            }
            confirmPassword.input.text.toString() != password.input.text.toString() -> {
                confirmPassword.setError(Caution("Password mismatch", Caution.Type.Error))
            }
            else -> {

                registerViewModel.callRegisterAPI(getParam())
            }
        }
    }

    private fun getParam(): RegisterRequest {
        val param = RegisterRequest(
            email.input.text.toString(),
            firstName.input.text.toString(),
            lastName.input.text.toString(),
            phone.input.text.toString(),
            password.input.text.toString()
        )
        return param
    }
}