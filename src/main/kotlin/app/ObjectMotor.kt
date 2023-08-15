package app

import data_class.Motor

fun main() {
    val supra = Motor("Honda", "Supra", 2011)
    println(supra.brand)
    println(supra.model)
    println(supra.year)
    println(supra.buy("Supra geter"))
}