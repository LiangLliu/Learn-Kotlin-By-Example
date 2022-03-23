package com.lianglliu.learnkotlin.extend.json

import com.google.gson.Gson

inline fun <reified T : Any> Gson.fromJson(json: String): T {
    return fromJson(json, T::class.java)
}