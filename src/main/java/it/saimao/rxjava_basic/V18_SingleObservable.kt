package it.saimao.rxjava_basic

import io.reactivex.rxjava3.core.Single

fun main() {
    val num = 100
    Single.create { emitter ->
        try {

            if (num > 100) emitter.onSuccess("YES")
            else emitter.onSuccess("NO")
        } catch (e: Exception) {

            emitter.onError(e)
        }
    }.subscribe({
        println(it)
    }, {
        println(it.message)
    })
}