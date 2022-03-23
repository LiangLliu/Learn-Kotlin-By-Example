package com.lianglliu.learnkotlin.extend.kapt.module

import com.lianglliu.learnkotlin.extend.kapt.config.Settings
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class BaseUrlModule {
    companion object {
        //测试环境
        const val DEBUG_URL = "https://api.github.com"

        //线上环境
        const val RELEASE_URL = "https://api.github.com"
    }

    @Singleton
    @Provides
    fun baseUrl(): String = if (Settings.DEBUG) DEBUG_URL else RELEASE_URL
}