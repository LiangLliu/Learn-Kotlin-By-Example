package com.lianglliu.learnkotlin.extend.kapt.module

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import retrofit2.Converter
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(includes = [GsonModule::class])
class GsonConverterModule {
    @Singleton
    @Provides
    fun converter(gson: Gson): Converter.Factory = GsonConverterFactory.create(gson)
}