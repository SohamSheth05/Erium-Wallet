package io.horizontalsystems.bankwallet.modules.authentication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import io.horizontalsystems.bankwallet.R
import io.horizontalsystems.bankwallet.core.App
import io.horizontalsystems.bankwallet.core.BaseFragment
import io.horizontalsystems.bankwallet.modules.settings.theme.ThemeType
import kotlinx.android.synthetic.main.fragment_auth_viewpager_layout.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe

/**
 * A simple [Fragment] subclass.
 * Use the [AuthViewPagerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AuthViewPagerFragment : BaseFragment() {

    companion object {
        var registrationFragment: AuthViewPagerFragment? = null

        @JvmStatic
        fun newInstance(): AuthViewPagerFragment {
            if (registrationFragment == null)
                registrationFragment = AuthViewPagerFragment()
            return registrationFragment as AuthViewPagerFragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private val authenticationViewModel
            by lazy { ViewModelProvider(this).get(AuthenticationViewModel::class.java) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_auth_viewpager_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (App.localStorage.currentTheme == ThemeType.Dark) {
            tabs.tabTextColors = resources.getColorStateList(R.color.white)
            tabs.setSelectedTabIndicatorColor(resources.getColor(R.color.white))
        }
        tabs.setupWithViewPager(viewPager)
        setupViewPager(viewPager)

        viewPager.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                /*if (position == 1) {
                    authenticationViewModel.registerObserver.observe(viewLifecycleOwner, {
                        if (it.success == 200) {
                            viewPager.currentItem = 0
                        }
                        Log.e("MEHUL-------------------------","-------------------------")
                    })
                }*/
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })
    }

 /*   override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
    }

    override fun onStop() {
        super.onStop()
        EventBus.getDefault().unregister(this)
    }

    //The Method which will call every time when data sync to server
    @Subscribe
    fun onEvent(syncStatusMessage: Int) {
        //you can do whatever you want releted with UI
        if (syncStatusMessage == 200) {
            viewPager.currentItem = 0
        }
    }*/

    private val loginFragment = LoginFragment()
    private val registrationFragment = RegistrationFragment()

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(childFragmentManager)
        adapter.addFragment(loginFragment, "Login")
        adapter.addFragment(registrationFragment, "Signup")
        viewPager.adapter = adapter
        viewPager.offscreenPageLimit = 3
        viewPager.currentItem = 0

    }
}