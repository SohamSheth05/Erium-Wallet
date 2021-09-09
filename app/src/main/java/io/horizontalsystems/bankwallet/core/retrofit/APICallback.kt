package io.horizontalsystems.bankwallet.core.retrofit

import com.app.fitquid.retrofit.OnResponseListener
import io.reactivex.Observable
import io.reactivex.observers.DisposableObserver
import org.json.JSONObject
import retrofit2.Response

class APICallback<T>(
    private val mListener: OnResponseListener,
    private val requestCode: Int,
    val request: Observable<Response<T>>,
) :
    DisposableObserver<Response<T>>() {
    val Message = "error"
    override fun onComplete() {

    }

    override fun onNext(response: Response<T>) {
        /*- OK(200, "OK"),
        - NON_AUTHORITATIVE_INFORMATION(203, "Non-Authoritative Information")
        - NO_CONTENT(204, "No Content")
        - ALREADY_REPORTED(208, "Already Reported")
        - BAD_REQUEST(400, "Bad Request")
        - UNAUTHORIZED(401, "Unauthorized")
        - NOT_FOUNToast.makeText(getContext(), e.getMessage(), Toast.LENGTH_LONG).show();D(404, "Not Found")
        - INTERNAL_SERVER_ERROR(500, "Internal Server Error")*/

        val jobj: JSONObject? = try {
            JSONObject(response.errorBody()?.string() ?: "{}")
        } catch (e: Exception) {
            JSONObject("{}")
        }

        when (response.code()) {
            200 -> mListener.onResponseReceived(response.body(), requestCode)
            203 -> mListener.onResponseError(
                jobj?.getString(Message) ?: "Non-Authoritative Information",
                requestCode,
                response.code()
            )
            204 -> mListener.onResponseError(
                "No data available!",
                requestCode,
                response.code()
            )
            208 -> mListener.onResponseError(
                "You have used this address in your product. You can't delete this address",
                requestCode,
                response.code()
            )
            302 -> mListener.onResponseError(
                jobj?.getString(Message) ?: "Check input",
                requestCode,
                response.code()
            )
            400 -> mListener.onResponseError(
                jobj?.getString(Message) ?: "Bad Request",
                requestCode,
                response.code()
            )
            404 -> {
                try {
                    mListener.onResponseError(
                        jobj?.getString(Message) ?: "Page not found",
                        requestCode,
                        response.code()
                    )
                } catch (e: java.lang.Exception) {
                    mListener.onResponseError(
                        "Internal Server error",
                        requestCode,
                        response.code()
                    )
                }
            }
            500 ->
                try {
                    mListener.onResponseError(
                        jobj?.getString(Message) ?: "Internal Server error",
                        requestCode,
                        response.code()
                    )
                } catch (e: java.lang.Exception) {
                    mListener.onResponseError(
                        "Internal Server error",
                        requestCode,
                        response.code()
                    )
                }
            401 -> {
                mListener.onResponseError(
                    jobj?.getString(Message) ?: "User not authorized",
                    requestCode,
                    response.code()
                )
            }

            403 -> mListener.onResponseError(
                jobj?.getString(Message) ?: "User not authorized",
                requestCode,
                response.code()
            )
            504 -> {
                mListener.onResponseError(
                    "Something went wrong, Please try later",
                    requestCode,
                    0
                )
            }
            else -> {
                mListener.onResponseError(
                    "Something went wrong, Please try later",
                    requestCode,
                    0
                )
            }
        }
    }

    override fun onError(e: Throwable) {
        mListener.onResponseError(e.localizedMessage ?: "Unknown error", requestCode, 0)
    }
}
