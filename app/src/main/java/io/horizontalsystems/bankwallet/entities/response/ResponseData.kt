package io.horizontalsystems.bankwallet.entities.response

import com.google.gson.annotations.SerializedName

data class ResponseData<out T>(

    @field:SerializedName("success")
    var status: Int? = null,
    @field:SerializedName("data")
    val data: T? = null,
    @field:SerializedName("message")
    val message: String? = null,
    val throwable: Throwable?

)