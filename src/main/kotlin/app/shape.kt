package app

import data_class.Rectangle
import data_class.Shape

fun main() {
    val shape = Shape()
    println(shape.corner)
    shape.printName(2)

    val shape2 = Rectangle()
    println(shape2.corner)


    val rectangle = Rectangle()
    println(rectangle.parentCorner)
    rectangle.printName(2)
}