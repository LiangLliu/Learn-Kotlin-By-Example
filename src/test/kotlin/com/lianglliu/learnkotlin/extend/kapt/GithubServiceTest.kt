package com.lianglliu.learnkotlin.extend.kapt

import org.junit.jupiter.api.Test

internal class GithubServiceTest {

    @Test
    fun should_get_stargazers() {
        Api.githubService.getStargazers()
            .execute()
            .body()
            ?.map(::println)
    }

}