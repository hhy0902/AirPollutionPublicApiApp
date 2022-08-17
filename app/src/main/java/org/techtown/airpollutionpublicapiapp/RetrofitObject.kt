package org.techtown.airpollutionpublicapiapp

import androidx.viewbinding.BuildConfig
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitObject {

    val apiService : RetrofitService by lazy {
        getRetrofit().create(RetrofitService::class.java)
    }

    val apiServiceKakao : RetrofitService by lazy {
        getRetrofitKakao().create(RetrofitService::class.java)
    }

    private fun getRetrofit() : Retrofit {

        return Retrofit.Builder()
            .baseUrl("http://apis.data.go.kr/")
            .client(buildOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun getRetrofitKakao() : Retrofit {

        return Retrofit.Builder()
            .baseUrl("https://dapi.kakao.com/")
            .client(buildOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun buildOkHttpClient(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        if (BuildConfig.DEBUG) {
            interceptor.level = HttpLoggingInterceptor.Level.BODY
        } else {
            interceptor.level = HttpLoggingInterceptor.Level.NONE
        }
        return OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .addInterceptor(interceptor)
            .build()
    }
}













































