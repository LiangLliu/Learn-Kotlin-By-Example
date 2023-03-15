package com.lianglliu.learnkotlin.extend.kapt.module

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.CallAdapter
import retrofit2.Converter
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(
    includes = [
        GsonConverterModule::class,
        OkHttpClientModule::class,
        RxAdapterModule::class,
        BaseUrlModule::class
    ]
)
class RetrofitModule {
    @Singleton
    @Provides
    fun retrofit(
        baseUrl: String,
        okHttpClient: OkHttpClient,
        adapterFactory: CallAdapter.Factory,
        converterFactory: Converter.Factory
    ): Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addCallAdapterFactory(adapterFactory)
        .addConverterFactory(converterFactory)
        .client(okHttpClient).build()
}