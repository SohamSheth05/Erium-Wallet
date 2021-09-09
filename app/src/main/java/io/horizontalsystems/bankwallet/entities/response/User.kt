package io.horizontalsystems.bankwallet.entities.response


import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("created_by")
    val createdBy: Any,
    @SerializedName("email")
    val email: String,
    @SerializedName("email_verified_at")
    val emailVerifiedAt: String,
    @SerializedName("first_name")
    val firstName: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("last_name")
    val lastName: String,
    @SerializedName("mobile")
    val mobile: String,
    @SerializedName("mpin")
    val mpin: Any,
    @SerializedName("role_id")
    val roleId: Int,
    @SerializedName("status")
    val status: Int,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("updated_by")
    val updatedBy: Any
) {
    override fun toString(): String {
        return "User(createdAt='$createdAt', createdBy=$createdBy, email='$email', emailVerifiedAt='$emailVerifiedAt', firstName='$firstName', id=$id, lastName='$lastName', mobile='$mobile', mpin=$mpin, roleId=$roleId, status=$status, updatedAt='$updatedAt', updatedBy=$updatedBy)"
    }
}