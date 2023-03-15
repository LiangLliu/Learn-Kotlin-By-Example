package com.lianglliu.learnkotlin.extend.kapt

import com.lianglliu.learnkotlin.extend.kapt.module.RetrofitModule
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(modules = [RetrofitModule::class])
interface RESTFulComponent {
    fun retrofit(): Retrofit
}