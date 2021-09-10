package io.horizontalsystems.bankwallet.modules.authentication

import android.app.Application
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import io.horizontalsystems.bankwallet.core.retrofit.APITask
import io.horizontalsystems.bankwallet.core.retrofit.OnResponseListener
import io.horizontalsystems.bankwallet.core.utils.Event
import io.horizontalsystems.bankwallet.entities.request.RegisterRequest
import io.horizontalsystems.bankwallet.entities.response.RegisterResponse
import io.horizontalsystems.bankwallet.entities.response.ResponseData
import io.horizontalsystems.bankwallet.entities.response.UserData
import io.horizontalsystems.bankwallet.modules.base.BaseViewModel
import org.greenrobot.eventbus.EventBus

class AuthenticationViewModel(val context: Application) : BaseViewModel(context) {
    val loginObserver = MutableLiveData<UserData?>()
    val registerObserver = MutableLiveData<RegisterResponse>()
    val forgotPasswordObserver = MutableLiveData<Int>()
    val changePasswordObserver = MutableLiveData<Int>()
    fun callRegisterAPI(param: RegisterRequest) {
        showProgress.value = Event(true)
        //  val param = getLoginRequest()


        APITask.getInstance().register(object : OnResponseListener {
            override fun <T> onResponseReceived(response: T, requestCode: Int) {
                showProgress.value = Event(false)

                val registerResponse = response as RegisterResponse
                if (registerResponse.success == 100) {
                    apiErrorMessage.postValue(Event(registerResponse.message))
                } else {
                    successStringMessage.postValue(Event("Verification email sent."))
                }
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

    fun callLoginApi(param: HashMap<String, String>) {
        showProgress.postValue(Event(true))
        APITask.getInstance().login(object : OnResponseListener {
            override fun <T> onResponseReceived(response: T, requestCode: Int) {
                showProgress.value = Event(false)
                val userData = response as ResponseData<*>
                if (userData.status == 100) {
                    apiErrorMessage.postValue(Event(userData.message!!))
                } else {
                    loginObserver.postValue(userData.data as UserData?)
                }

            }

            override fun onResponseError(message: String, requestCode: Int, responseCode: Int) {
                showProgress.value = Event(false)
                apiErrorMessage.value = Event(message)
            }

        }, param)?.let { mDisposable?.add(it) }
    }

    fun callForgotPassword(param: HashMap<String, String>) {
        APITask.getInstance().forgotPassword(object : OnResponseListener {
            override fun <T> onResponseReceived(response: T, requestCode: Int) {
                showProgress.value = Event(false)
                val userData = response as ResponseData<*>
                if (userData.status == 100) {
                    apiErrorMessage.postValue(Event(userData.message!!))
                } else {
                    forgotPasswordObserver.postValue(userData.status!!)
                }

            }

            override fun onResponseError(message: String, requestCode: Int, responseCode: Int) {
                showProgress.value = Event(false)
                apiErrorMessage.value = Event(message)
            }

        }, param)?.let { mDisposable?.add(it) }
    }

    fun callChangePassword(param: HashMap<String, String>) {
        APITask.getInstance().resetPassword(object : OnResponseListener {
            override fun <T> onResponseReceived(response: T, requestCode: Int) {
                showProgress.value = Event(false)
                val userData = response as ResponseData<*>
                if (userData.status == 100) {
                    apiErrorMessage.postValue(Event(userData.message!!))
                } else {
                    changePasswordObserver.postValue(userData.status!!)
                }

            }

            override fun onResponseError(message: String, requestCode: Int, responseCode: Int) {
                showProgress.value = Event(false)
                apiErrorMessage.value = Event(message)
            }

        }, param)?.let { mDisposable?.add(it) }
    }
}