package app

import data_class.Game
import data_class.Login
import data_class.Minmax
import javax.security.auth.callback.Callback

fun minmax(value1: Int, value2: Int) : Minmax{
    return when {
        value1 > value2 -> Minmax(value2, value2)
        else -> Minmax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {
    val game = Game("FIFA", 2000000)

    val (name, price) = game
    println(name)
    println(price)

    val (min, max) = minmax(10, 100)
    println(min)
    println(max)

    val login = Login("Luthfi", "123")
    login(login){ (username, password) -> username == "Luthfi" && password == "123" }
}