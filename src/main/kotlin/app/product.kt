package app

import data_class.Product

fun main() {
    val product = Product("Minuman", 10000, "Kopi")
    println(product)

    val product2 = product.copy(type = "Jus")
    println(product2)
}