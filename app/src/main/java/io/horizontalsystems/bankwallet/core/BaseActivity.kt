package io.horizontalsystems.bankwallet.core

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import io.horizontalsystems.bankwallet.R
import io.horizontalsystems.core.CoreActivity
import io.horizontalsystems.core.hideKeyboard

abstract class BaseActivity : CoreActivity(), NavController.OnDestinationChangedListener {

    protected fun hideSoftKeyboard() {
        getSystemService(InputMethodManager::class.java)?.hideSoftInputFromWindow(
            currentFocus?.windowToken,
            0
        )
    }

    // NavController Listener

    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {
        currentFocus?.hideKeyboard(this)
    }

    private var dialog: Dialog? = null

    fun showProgressBar() {
        if (dialog?.isShowing == true) {
            return
        }
        dialog = Dialog(this)
        val inflate = LayoutInflater.from(this).inflate(R.layout.progress_dialog, null)
        dialog?.setContentView(inflate)
        dialog?.setCancelable(false)
        dialog?.window!!.setBackgroundDrawable(
            ColorDrawable(Color.TRANSPARENT)
        )
        dialog?.window!!.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
        dialog?.show()
    }

    fun hideProgressBar() {
        dialog?.dismiss()
        dialog = null
    }

}
