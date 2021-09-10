package io.horizontalsystems.bankwallet.modules.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import io.horizontalsystems.bankwallet.core.utils.Event
import io.reactivex.disposables.CompositeDisposable

/**
 * Here we have Use Event class for emitting value only for once.
 * once the value is emitted it will not Emit again.
 *
 * set Message Method is used for communicate with View Class.
 *
 * observedChanges() method used for observing changes in messageString
 *
 * */

open class BaseViewModel(application: Application) : AndroidViewModel(application) {

    protected var mDisposable: CompositeDisposable? = null
    var validationErrorMessage = MutableLiveData<Event<Int>>()
    var apiErrorMessage = MutableLiveData<Event<String>>()
    var successMessage = MutableLiveData<Event<Int>>()
    var successStringMessage = MutableLiveData<Event<String>>()
    var showProgress = MutableLiveData<Event<Boolean>>()

    val premiumErrorType = MutableLiveData<Event<String>>()

    override fun onCleared() {
        super.onCleared()
        mDisposable?.dispose()
    }

    private fun setMessage(msg: String) {
        messageString.value = msg
    }

    private var messageString = MutableLiveData<String>()

    open fun observedChanges() = messageString
}