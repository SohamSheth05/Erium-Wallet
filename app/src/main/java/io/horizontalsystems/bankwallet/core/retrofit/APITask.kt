package io.horizontalsystems.bankwallet.core.retrofit

import com.app.fitquid.retrofit.OnResponseListener
import io.horizontalsystems.bankwallet.entities.request.RegisterRequest
import io.reactivex.disposables.Disposable

class APITask : BaseAPITask() {

    private val apiCall: APICall = Retrofit.getRetrofit().create(APICall::class.java)

    companion object Singleton {
        fun getInstance(): APITask {
            return APITask()
        }
    }

    fun register(listener: OnResponseListener, params: RegisterRequest): Disposable? {
        return getRequest(apiCall.register(params), listener, 1)
    }

    /* fun forgotPassword(listener: OnResponseListener, params: LoginModel): Disposable? {
         return getRequest(apiCall.forgotPassword(params), listener, 1)
     }


     fun resetPassword(listener: OnResponseListener, newPass: String): Disposable? {
         val paramMap = HashMap<String, Any>()
         paramMap["new_password"] = newPass
         return getRequest(apiCall.resetPassword(paramMap), listener, 1)
     }

     fun checkUserExists(listener: OnResponseListener, email: String): Disposable? {
         val paramMap = HashMap<String, String>()
         paramMap["email"] = email
         return getRequest(apiCall.checkUserExists(paramMap), listener, 1)
     }

     fun register(listener: OnResponseListener, params: RegisterNormalRequest): Disposable? {
         params.user?.loginType = LoginType.EMAIL.apiVal
         params.user?.loginPlatform = Constants.PLATFORM
         params.user?.deviceToken = PreferenceHelper.getDeviceToken()
         return getRequest(apiCall.register(params), listener, 1)
     }*/
}