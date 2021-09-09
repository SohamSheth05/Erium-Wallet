package io.horizontalsystems.bankwallet.entities.response


import com.google.gson.annotations.SerializedName

data class UserData(
    @SerializedName("token")
    val token: String,
    @SerializedName("user")
    val user: User
)