package com.lianglliu.learnkotlin.extend.rxjava

import io.reactivex.rxjava3.core.Observable
import java.io.File

class RxjavaDemo {

    private val text = File(ClassLoader.getSystemResource("input.txt").path).readText()

    fun groupByAndSorted() {

        Observable.fromIterable(text.toCharArray().asIterable())
            .filter { !it.isWhitespace() }
            .map { it.uppercase() }
            .groupBy { it }
            .flatMapSingle { it ->
                it.count().map { number ->
                    Pair(it.key, number)
                }
            }
            .sorted { a, b -> b.second.compareTo(a.second) }
            .map {
                println("${it.first} -> ${it.second}")
            }
            .subscribe()
    }
}
