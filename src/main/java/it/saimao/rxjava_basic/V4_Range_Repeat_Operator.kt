package it.saimao.rxjava_basic

import io.reactivex.rxjava3.core.Observable

/**
 * Range from 5, 6, ..., 24 (5 to 24 = 20)
 */
fun main() {
    Observable.range(5, 20).repeat(2).subscribe(
        { println("On Next -  $it") },
        { print("") },
        { println("On Complete") }
    )
}