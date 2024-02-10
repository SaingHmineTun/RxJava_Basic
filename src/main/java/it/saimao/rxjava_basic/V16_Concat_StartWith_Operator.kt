package it.saimao.rxjava_basic

import io.reactivex.rxjava3.core.Observable

fun main() {

    val ob1 = Observable.range(1, 50)
    val ob2 = Observable.range(51, 50)
//    val obConcat = Observable.concat(ob1, ob2).subscribe { println(it) }.dispose()
    val obStartWith = ob1.startWith(ob2).subscribe { println(it) }.dispose()

}