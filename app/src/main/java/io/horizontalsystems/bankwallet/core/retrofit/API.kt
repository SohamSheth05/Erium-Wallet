package io.horizontalsystems.bankwallet.core.retrofit

class API {
    companion object {
        const val BASE_URL = "http://erium.eminentinfosystem.com/public/api/"
        const val REGISTER = "register"
        const val LOGIN = "login"
        const val GET_PROFILE = "profile"
        const val UPDATE_PROFILE = "profile/3"
        const val ADD_WALLET_ADDRESS = "wallet/2"
        const val CHANGE_PASSWORD = "change-password"
        const val FORGOT_PASSWORD = "forgot-password"
        const val ADD_MPIN = "mpin"
        const val CHANGE_MPIN = "change-mpin"
        const val FORGOT_MPIN = "forgot-mpin"
    }
}