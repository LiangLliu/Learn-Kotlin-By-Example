package com.lianglliu.learnkotlin.extend.kapt

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubService {

    @GET("/repos/LiangLliu/CountdownTimer/stargazers")
    fun getStargazers(@Query("page") page: Int = 1, @Query("per_page") pageSize: Int = 20): Call<List<User>>
}

object Api {
    val githubService: GithubService by lazy {
        DaggerRESTFulComponent
            .builder()
            .build()
            .retrofit()
            .create(GithubService::class.java)
    }
}