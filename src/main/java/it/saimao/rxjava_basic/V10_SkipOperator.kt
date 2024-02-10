package it.saimao.rxjava_basic

import io.reactivex.rxjava3.core.Observable

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    Observable.fromIterable(list).skipLast(2).subscribe { print("$it ") }.dispose()
    println()
    Observable.fromIterable(list).skip(2).subscribe { print("$it ") }.dispose()
}