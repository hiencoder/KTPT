package com.mrphonglinh.example.loigiaihaykt.network

import com.mrphonglinh.example.loigiaihaykt.utils.AppConstants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ApiClient {
    companion object {

        fun create(): ApiService {
            val retrofit = Retrofit.Builder()
                .baseUrl(AppConstants.BASE_URL)
                .addCallAdapterFactory(
                    RxJava2CallAdapterFactory.create()
                )
                .addConverterFactory(GsonConverterFactory.create())
                .client(initOkHttpClient())
                .build()
            return retrofit.create(ApiService::class.java)
        }

        private fun initOkHttpClient(): OkHttpClient {
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            val okHttpClient = OkHttpClient.Builder()
                .connectTimeout(AppConstants.REQUEST_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(AppConstants.REQUEST_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(AppConstants.REQUEST_TIMEOUT, TimeUnit.SECONDS)
                .addInterceptor { chain ->
                    val original = chain.request()
                    val builder = original.newBuilder()
                        .addHeader("Accept", "application/json")
                        .addHeader("Request-Type", "Android")
                        .addHeader("Content-Type", "application/json")
                    val request = builder.build()
                    chain.proceed(request)
                }
                .build()
            return okHttpClient
        }
    }

}