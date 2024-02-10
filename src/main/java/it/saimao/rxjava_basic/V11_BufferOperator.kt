package it.saimao.rxjava_basic

import io.reactivex.rxjava3.core.Observable

/**
 * Convert a single list into multiple lists depending on buffer size
 * [1, 2, 3, 4, 5] -> size(2) = [1, 2], [3, 4], [5]
 */
fun main() {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(4, 5, 6)
    val list3 = listOf(7, 8, 9)
    val list4 = list1 + list2 + list3
    println("The entire list - $list4")
    Observable.fromIterable(list4).buffer(2).subscribe { println(it) }
}