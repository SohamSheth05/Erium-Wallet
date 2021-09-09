package io.horizontalsystems.bankwallet.modules.authentication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.horizontalsystems.bankwallet.R
import io.horizontalsystems.bankwallet.core.App
import io.horizontalsystems.bankwallet.core.BaseFragment
import io.horizontalsystems.bankwallet.modules.launcher.LauncherActivity
import io.horizontalsystems.bankwallet.modules.settings.theme.ThemeType
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_registration.*
import kotlinx.android.synthetic.main.fragment_registration.registrationIcon

/**
 * A simple [Fragment] subclass.
 * Use the [CreatePasswordFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CreatePasswordFragment : BaseFragment() {

    companion object {
        var registrationFragment: CreatePasswordFragment? = null

        @JvmStatic
        fun newInstance(): CreatePasswordFragment {
            if (registrationFragment == null)
                registrationFragment = CreatePasswordFragment()
            return registrationFragment as CreatePasswordFragment
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
        return inflater.inflate(R.layout.fragment_create_new_password, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(App.localStorage.currentTheme == ThemeType.Dark){
            registrationIcon.setBackgroundResource(R.drawable.dark_logo)
        }

        btnLogin.setOnClickListener {
            startActivity(Intent(requireContext(), LauncherActivity::class.java))
        }
    }
}