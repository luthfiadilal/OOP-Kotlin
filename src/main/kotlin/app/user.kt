package app

import data_class.User

fun main() {
    val user = User("Luthfi", 22)
    println(user.toString())

    val user2 = User("Adilal", 21)
    val user3 = User("Luthfi", 22)

    println(user.hashCode())
    println(user2.hashCode())
    println(user3.hashCode())

    println(user.hashCode() == user2.hashCode())
    println(user.hashCode() == user3.hashCode())

}