package io.horizontalsystems.bankwallet.modules.authentication

import java.util.*

internal class ViewPagerAdapter(manager: androidx.fragment.app.FragmentManager) :
    androidx.fragment.app.FragmentPagerAdapter(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    private val mFragmentList = ArrayList<androidx.fragment.app.Fragment>()
    private val mFragmentTitleList = ArrayList<String>()

    override fun getItem(position: Int): androidx.fragment.app.Fragment {
        return mFragmentList[position]
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    fun addFragment(fragment: androidx.fragment.app.Fragment, title: String) {
        mFragmentList.add(fragment)
        mFragmentTitleList.add(title)

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitleList[position]
    }


}