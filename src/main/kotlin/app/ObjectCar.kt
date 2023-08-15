package app

import data_class.Car

fun main() {
    val honda = Car("Honda", "Civic")
    val toyota = Car("Toyota", "Corolla", 2022)
    println(toyota.brand)
    println(toyota.model)
    println(toyota.year)

    println(honda.brand)
    println(honda.model)
    println(honda.year)

}