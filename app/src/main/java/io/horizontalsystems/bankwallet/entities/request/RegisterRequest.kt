package io.horizontalsystems.bankwallet.entities.request


import com.google.gson.annotations.SerializedName

data class RegisterRequest(
    @SerializedName("email")
    var email: String? = null,
    @SerializedName("first_name")
    var firstName: String? = null,
    @SerializedName("last_name")
    var lastName: String? = null,
    @SerializedName("mobile")
    var mobile: String? = null,
    @SerializedName("password")
    var password: String? = null
)