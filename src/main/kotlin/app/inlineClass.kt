package app

import data_class.Token

fun main() {
    val token = Token("ini token")
    println(token.value)
    token.toUpperCase()
}