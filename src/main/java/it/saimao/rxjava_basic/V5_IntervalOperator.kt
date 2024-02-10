package it.saimao.rxjava_basic

import io.reactivex.rxjava3.core.Observable
import java.lang.Throwable
import java.util.concurrent.TimeUnit


/**
 * Initial Delay - To wait before emitting the first value
 * Cannot work unless test in JavaFX or Android Application
 */
fun main() {

    val interval = Observable.interval(1, TimeUnit.SECONDS)
        .takeWhile {
            it < 10
        }

    interval.subscribe(
        { timestamp: Long? -> println("On Next - $timestamp") },
        { error ->
            println("On Error - ${error.message}")
        },
        {
            println("On Complete")
        },
    )


// Remember to dispose!
//    disposable.dispose()
}