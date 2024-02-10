package it.saimao.rxjava_basic

import io.reactivex.rxjava3.core.Observable

/**
 * Range from 5, 6, ..., 24 (5 to 24 = 20)
 */
fun main() {
    Observable.range(5, 20).subscribe({ println("On Next -  $it") }, { print(it.message) })
}