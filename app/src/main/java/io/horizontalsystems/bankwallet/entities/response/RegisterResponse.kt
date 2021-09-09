package io.horizontalsystems.bankwallet.entities.response


import com.google.gson.annotations.SerializedName

data class RegisterResponse(
    @SerializedName("data")
    var data: Data,
    @SerializedName("message")
    var message: String,
    @SerializedName("success")
    var success: Int
)

data class Data(
    @SerializedName("created_at")
    var createdAt: String,
    @SerializedName("email")
    var email: String,
    @SerializedName("first_name")
    var firstName: String,
    @SerializedName("id")
    var id: Int,
    @SerializedName("last_name")
    var lastName: String,
    @SerializedName("mobile")
    var mobile: String,
    @SerializedName("role_id")
    var roleId: String,
    @SerializedName("updated_at")
    var updatedAt: String
)