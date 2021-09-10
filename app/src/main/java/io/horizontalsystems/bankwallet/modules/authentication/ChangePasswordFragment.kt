package io.horizontalsystems.bankwallet.modules.authentication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import io.horizontalsystems.bankwallet.R
import io.horizontalsystems.bankwallet.core.App
import io.horizontalsystems.bankwallet.core.BaseFragment
import io.horizontalsystems.bankwallet.modules.launcher.LauncherActivity
import io.horizontalsystems.bankwallet.modules.settings.theme.ThemeType
import io.horizontalsystems.bankwallet.modules.swap.tradeoptions.Caution
import io.horizontalsystems.core.helpers.HudHelper
import kotlinx.android.synthetic.main.fragment_create_new_password.*
import kotlinx.android.synthetic.main.fragment_create_new_password.registrationIcon
import kotlinx.android.synthetic.main.fragment_forgot_password.*
import kotlinx.android.synthetic.main.view_input.view.*
import java.util.*

/**
 * A simple [Fragment] subclass.
 * Use the [ChangePasswordFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChangePasswordFragment : BaseFragment() {

    companion object {
        var registrationFragment: ChangePasswordFragment? = null

        @JvmStatic
        fun newInstance(): ChangePasswordFragment {
            if (registrationFragment == null)
                registrationFragment = ChangePasswordFragment()
            return registrationFragment as ChangePasswordFragment
        }
    }

    private val authenticationViewModel
            by lazy { ViewModelProvider(this).get(AuthenticationViewModel::class.java) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_new_password, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (App.localStorage.currentTheme == ThemeType.Dark) {
            registrationIcon.setBackgroundResource(R.drawable.dark_logo)
        }
        confirmPassword.input.setCompoundDrawablesWithIntrinsicBounds(
            R.drawable.ic_password,
            0,
            0,
            0
        )
        password.input.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_password, 0, 0, 0)
        oldPassword.input.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_password, 0, 0, 0)
        btnSetPassword.setOnClickListener {
            when {
                oldPassword.input.text.toString() == "" -> {
                    oldPassword.setError(Caution("Please enter old password", Caution.Type.Error))
                }
                password.input.text.toString() == "" -> {
                    password.setError(Caution("Please enter new password", Caution.Type.Error))
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
                    authenticationViewModel.callChangePassword(getParam())
                }
            }
        }
        authenticationViewModel.changePasswordObserver.observe(viewLifecycleOwner, {
            if (it == 200) {
                startActivity(Intent(requireContext(), LauncherActivity::class.java))
            }
        })

        authenticationViewModel.apiErrorMessage.observe(viewLifecycleOwner, {
            password.input.text.clear()
            oldPassword.input.text.clear()
            it?.getContentIfNotHandled()?.let {
                HudHelper.showErrorMessage(this.requireView(), it)
            }
        })
    }

    private fun getParam(): HashMap<String, String> {
        val hashMap = hashMapOf<String, String>()
        hashMap["old_password"] = oldPassword.input.text.toString()
        hashMap["new_password"] = password.input.text.toString()
        return hashMap
    }
}