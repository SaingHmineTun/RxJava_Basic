package it.saimao.rxjava_basic

import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.core.SingleObserver
import io.reactivex.rxjava3.disposables.Disposable

/**
 * Single is used when the observable has to emit only one value
 * like a response from a network call
 */
fun main() {
    createSingleObservable().subscribe(singleObserver())
}

const val INTEGER = 19

fun createSingleObservable(): Single<Int> {
    return Single.create { emitter ->
        try {
            if (INTEGER > 18) emitter.onSuccess(INTEGER)
            else emitter.onError(IllegalArgumentException("Integer must be over 18"))
        } catch (e: Exception) {
            emitter.onError(e)
        }

    }
}

fun singleObserver(): SingleObserver<Int> {
    return object : SingleObserver<Int> {
        override fun onSubscribe(d: Disposable) {
            println("On Subscribe")
        }

        override fun onError(e: Throwable) {
            println("On Error - ${e.message}")
        }

        override fun onSuccess(t: Int) {
            println("On Success - $t")
        }

    }
}