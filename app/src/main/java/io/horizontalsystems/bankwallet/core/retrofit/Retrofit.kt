package io.horizontalsystems.bankwallet.core.retrofit

import android.util.Log
import com.google.gson.GsonBuilder
import io.horizontalsystems.bankwallet.BuildConfig
import io.horizontalsystems.bankwallet.core.utils.PreferenceHelper
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class Retrofit {

    companion object Singleton {
        private lateinit var mRetrofit: Retrofit

        fun init() {
            val httpClient = OkHttpClient.Builder()

            httpClient.readTimeout(10, TimeUnit.MINUTES)
            httpClient.connectTimeout(1, TimeUnit.MINUTES)
            httpClient.writeTimeout(10, TimeUnit.MINUTES)

            httpClient.addInterceptor { chain ->
                val original = chain.request()
                val builder = original.newBuilder()
                PreferenceHelper.getUserDetails()?.token?.let {
                    Log.d("TOKEN", PreferenceHelper.getUserDetails()?.token ?: "null")
                    builder.header("Authorization", "Bearer $it")
                }
                builder.method(original.method, original.body)
                chain.proceed(builder.build())
            }

            val interceptor = HttpLoggingInterceptor()
            if (BuildConfig.DEBUG)
                interceptor.level = HttpLoggingInterceptor.Level.BODY
            else
                interceptor.level = HttpLoggingInterceptor.Level.NONE
            httpClient.addInterceptor(interceptor)

            val client = httpClient.build()
            client.dispatcher.maxRequests = Integer.MAX_VALUE
            val gson = GsonBuilder()
                .setLenient()
                .create()

            mRetrofit = Retrofit.Builder()
                .baseUrl(API.BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

        }


        fun getRetrofit(): Retrofit {
            return mRetrofit
        }
    }
}