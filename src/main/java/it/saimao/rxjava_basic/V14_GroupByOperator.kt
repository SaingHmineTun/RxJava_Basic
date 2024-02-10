package it.saimao.rxjava_basic

import io.reactivex.rxjava3.core.Observable

fun main() {
    val list = listOf(2, 2, 4, 5, 5, 7, 7, 7)
    Observable.fromIterable(list).groupBy { it > 5 }
        .subscribe { group ->
            group.subscribe {
                print("${group.key} $it\n")
            }
        }
}