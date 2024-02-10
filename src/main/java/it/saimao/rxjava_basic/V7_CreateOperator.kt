package it.saimao.rxjava_basic

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableOnSubscribe

fun main() {

    val mListNum = intArrayOf(1, 2, 3, 4, 5)

    val observable = Observable.create(ObservableOnSubscribe<Int> {
        try {
            for (i in mListNum) {
                it.onNext(i * 5)
            }
            it.onComplete()
        } catch (e: Exception) {
            it.onError(e)
        }
    })

    observable.subscribe {
        println(it)
    }

}