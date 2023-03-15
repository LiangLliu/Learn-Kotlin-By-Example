package com.lianglliu.learnkotlin.extend.kapt.module

import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module(includes = [CacheModule::class])
class OkHttpClientModule {
    @Singleton
    @Provides
    fun okHttpClient(cache: Cache): OkHttpClient = OkHttpClient.Builder().cache(cache).build()
}