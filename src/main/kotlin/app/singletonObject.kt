package app

import data_class.Application
import data_class.Utilities

fun main() {
    println(Utilities.name)
    println(Utilities.toUpper("luthfi"))

    Application.Utilities.hello("Alex")
}