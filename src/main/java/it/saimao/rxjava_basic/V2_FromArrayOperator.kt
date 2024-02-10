package it.saimao.rxjava_basic

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable

fun main() {
    val list = arrayOf(1, 2, 3, 4, 5)
    val list2 = arrayOf(10, 20, 30, 40, 50) + list
    val observable = Observable.fromArray(list, list2)
    val observer = object : Observer<Array<Int>> {
        override fun onSubscribe(d: Disposable) {
            println("On Subscribe")
        }

        override fun onError(e: Throwable) {
            println("On Error")
        }

        override fun onComplete() {
            println("On Complete")
        }

        override fun onNext(t: Array<Int>) {
            println("On Next - ${t.joinToString(" ")}")
        }

    }
    observable.subscribe(observer)
}

