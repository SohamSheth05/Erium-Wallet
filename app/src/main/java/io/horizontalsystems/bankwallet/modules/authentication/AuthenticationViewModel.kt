package io.horizontalsystems.bankwallet.modules.authentication

import android.app.Application
import com.app.fitquid.retrofit.OnResponseListener
import io.horizontalsystems.bankwallet.core.retrofit.APITask
import io.horizontalsystems.bankwallet.core.utils.Event
import io.horizontalsystems.bankwallet.entities.request.RegisterRequest
import io.horizontalsystems.bankwallet.entities.response.RegisterResponse
import io.horizontalsystems.bankwallet.modules.base.BaseViewModel

class AuthenticationViewModel(val context: Application) : BaseViewModel(context) {

    fun callRegisterAPI() {
        showProgress.value = Event(true)
        //  val param = getLoginRequest()

        val param = RegisterRequest("mehul@gmail.com", "Mehul", "Gajjar", "7575878798", "12345678")

        APITask.getInstance().register(object : OnResponseListener {
            override fun <T> onResponseReceived(response: T, requestCode: Int) {
                showProgress.value = Event(false)
                response as RegisterResponse
            }

            override fun onResponseError(
                message: String,
                requestCode: Int,
                responseCode: Int,
            ) {
                showProgress.value = Event(false)
                apiErrorMessage.value = Event(message)
            }
        }, param)?.let { mDisposable?.add(it) }
    }

}