package com.lianglliu.learnkotlin.extend.kapt.module

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class GsonModule {

    @Singleton @Provides fun gson(): Gson = Gson()
}