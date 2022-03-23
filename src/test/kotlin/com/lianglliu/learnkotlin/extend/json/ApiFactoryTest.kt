package com.lianglliu.learnkotlin.extend.json

import com.google.gson.Gson
import org.junit.jupiter.api.Test
import java.io.File

internal class ApiFactoryTest {
    @Test
    fun should_get_json_data() {
        val json = File(ClassLoader.getSystemResource("result_singer_field_loss.json").path).readText()
        val result: BaseResult<Singer> = ApiFactory.api.getSingerFromJson(json)
        println(result)
        val result1: Singer = Gson().fromJson(json)
        println(result1)
    }
}