package it.saimao.rxjava_basic

import io.reactivex.rxjava3.core.Observable

data class User(val id: Int, val name: String)

val userList = listOf(User(4, "Sai"), User(2, "Mao"), User(6, "Meng"))
fun main() {
    val list = listOf(2, 4, 6)
    Observable.fromIterable(list)
        .map { getUserById(it) }
        .subscribe {
            // Using map -> Got Observable here
            println(it)
        }
    Observable.fromIterable(list)
        .flatMap { getUserById(it) }
        .subscribe {
            // Using flatMap -> Got User here
            println(it)
        }
}

fun getUserById(id: Int): Observable<User> = Observable.fromIterable(userList).filter { it.id == id }

